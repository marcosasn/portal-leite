import models.*;
import models.dao.GenericDAO;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import play.db.jpa.JPA;
import play.db.jpa.JPAPlugin;
import play.mvc.Result;
import play.test.FakeApplication;
import play.test.Helpers;
import scala.Option;

import javax.persistence.EntityManager;

import static org.fest.assertions.Assertions.assertThat;

public class VotoTeste {
    public final GenericDAO dao = new GenericDAO();
    private Result result;
    public EntityManager em;

    private Usuario usuario1;
    private Usuario usuario2;
    private Usuario usuario3;
    private Usuario usuario4;
    private Usuario usuario5;
    private Usuario usuario6;
    private Usuario usuario7;
    private DicaComoNaoTerDificuldade dica1;
    private DicaComoNaoTerDificuldade dica2;
    private DicaComoNaoTerDificuldade dica3;
    private DicaConselho dica4;
    private DicaConselho dica5;
    private MetaDica dica6;
    private MetaDica dica7;

    @Before
    public void criaUsuarios() {
        // Cria alguns usuários para serem utilizados nos testes
        usuario1 = new Usuario("Adolfo", "adolfo06", "123");
        usuario2 = new Usuario("Marcos", "marcosasn", "123");
        usuario3 = new Usuario("José", "jose123", "123");
        usuario4 = new Usuario("Maria", "mariazinha", "123");
        usuario5 = new Usuario("Mina", "mina1", "123");
        usuario6 = new Usuario("Fuji", "fuji", "123");
        usuario7 = new Usuario("Juniel", "juniel2", "123");
    }

    @Before
    public void criaDicas() {
        // Cria algumas dicas a serem inseridas no banco de dados
        dica1 = new DicaComoNaoTerDificuldade("Java", usuario1, "Saber Java é essencial.");
        dica2 = new DicaComoNaoTerDificuldade("Programação", usuario2, "Programar é necessário.");
        dica3 = new DicaComoNaoTerDificuldade("Eclipse", usuario3, "Conheça uma ferramenta de trabalho.");
        dica4 = new DicaConselho("Procure os monitores.", usuario4, "Monitores ajudam bastante.");
        dica5 = new DicaConselho("Estude com frequência.", usuario1, "Tem que estudar sempre.");
        dica6 = new MetaDica("Meta-Dica 1", usuario6, "Olhem estas dicas");
        dica7 = new MetaDica("Meta-Dica 2", usuario7, "Olhem estas dicas interessantes");
    }

    @Test
    public void deveAdicionarConcordanciaDicaSimples() throws Exception {
        dao.persist(dica1);
        dao.persist(dica2);

        Concordancia conc1 = new Concordancia(usuario1);
        Concordancia conc2 = new Concordancia(usuario2);
        dao.persist(conc1);
        dao.persist(conc2);

        // Verifica que o número de concordâncias da dica1 no banco de dados é 0
        DicaSimples dica1bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Java").get(0);
        assertThat(dica1bd.getNumeroConcordancias()).isEqualTo(0);
        assertThat(dica1bd.getNumeroVotos()).isEqualTo(0);

        // Vai ser possível adicionar, já que o usuario1 ainda não votou na dica1
        dica1.adicionaConcordancia(conc1);
        dao.merge(dica1);

        // Verifica que o número de concordâncias da dica1 foi alterado
        dica1bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Java").get(0);
        assertThat(dica1bd.getNumeroConcordancias()).isEqualTo(1);
        assertThat(dica1bd.getNumeroVotos()).isEqualTo(1);

        // Se o usuario1 tentar votar novamente na dica1, será lançado uma exceção
        try {
            dica1.adicionaConcordancia(conc1);
            Assert.fail("Deveria lançar exceção");
        } catch (Exception e) {
            Assert.assertEquals("Usuário já votou", e.getMessage());
        }

        // Porém, se o usuario2 tentar votar na dica1, será possível, já que ele não havia votado anteriormente
        dica1.adicionaConcordancia(conc2);
        dao.merge(dica1);

        // Verifica que o número de concordâncias da dica1 foi alterado
        dica1bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Java").get(0);
        assertThat(dica1bd.getNumeroConcordancias()).isEqualTo(2);
        assertThat(dica1bd.getNumeroVotos()).isEqualTo(2);

        // Mas se ele tentar votar novamente, será lançado uma exceção
        try {
            dica1.adicionaConcordancia(conc2);
            Assert.fail("Deveria lançar exceção");
        } catch (Exception e) {
            Assert.assertEquals("Usuário já votou", e.getMessage());
        }

        // Verifica que a dica2 ainda não tem votos
        DicaSimples dica2bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Programação").get(0);
        assertThat(dica2bd.getNumeroConcordancias()).isEqualTo(0);
        assertThat(dica2bd.getNumeroVotos()).isEqualTo(0);

        // O usuario1, apesar de não poder votar mais na dica1, ele pode votar em outras dicas, como na dica2
        dica2.adicionaConcordancia(conc1);
        dao.merge(dica2);

        // Verifica que o número de concordâncias da dica2 foi alterado
        dica2bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Programação").get(0);
        assertThat(dica2bd.getNumeroConcordancias()).isEqualTo(1);
        assertThat(dica2bd.getNumeroVotos()).isEqualTo(1);

    }

    @Test
    public void deveAdicionarConcordanciaMetaDica() throws Exception {
        dao.persist(dica6);
        dao.persist(dica7);

        Concordancia conc1 = new Concordancia(usuario1);
        Concordancia conc2 = new Concordancia(usuario2);
        dao.persist(conc1);
        dao.persist(conc2);

        // Verifica que o número de concordâncias da dica6 no banco de dados é 0
        MetaDica dica6bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 1").get(0);
        assertThat(dica6bd.getNumeroConcordancias()).isEqualTo(0);
        assertThat(dica6bd.getNumeroVotos()).isEqualTo(0);

        // Vai ser possível adicionar, já que o usuario1 ainda não votou na dica6
        dica6.adicionaConcordancia(conc1);
        dao.merge(dica6);

        // Verifica que o número de concordâncias da dica6 foi alterado
        dica6bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 1").get(0);
        assertThat(dica6bd.getNumeroConcordancias()).isEqualTo(1);
        assertThat(dica6bd.getNumeroVotos()).isEqualTo(1);

        // Se o usuario1 tentar votar novamente na dica6, será lançado uma exceção
        try {
            dica6.adicionaConcordancia(conc1);
            Assert.fail("Deveria lançar exceção");
        } catch (Exception e) {
            Assert.assertEquals("Usuário já votou", e.getMessage());
        }

        // Porém, se o usuario2 tentar votar na dica6, será possível, já que ele não havia votado anteriormente
        dica6.adicionaConcordancia(conc2);
        dao.merge(dica6);

        // Verifica que o número de concordâncias da dica6 foi alterado
        dica6bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 1").get(0);
        assertThat(dica6bd.getNumeroConcordancias()).isEqualTo(2);
        assertThat(dica6bd.getNumeroVotos()).isEqualTo(2);

        // Mas se ele tentar votar novamente, será lançado uma exceção
        try {
            dica6.adicionaConcordancia(conc2);
            Assert.fail("Deveria lançar exceção");
        } catch (Exception e) {
            Assert.assertEquals("Usuário já votou", e.getMessage());
        }

        // Verifica que a dica7 ainda não tem votos
        MetaDica dica7bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 2").get(0);
        assertThat(dica7bd.getNumeroConcordancias()).isEqualTo(0);
        assertThat(dica7bd.getNumeroVotos()).isEqualTo(0);

        // O usuario1, apesar de não poder votar mais na dica6, ele pode votar em outras dicas, como na dica7
        dica7.adicionaConcordancia(conc1);
        dao.merge(dica7);

        // Verifica que o número de concordâncias da dica7 foi alterado
        dica7bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 2").get(0);
        assertThat(dica7bd.getNumeroConcordancias()).isEqualTo(1);
        assertThat(dica7bd.getNumeroVotos()).isEqualTo(1);

    }

    @Test
    public void deveAdicionarDiscordanciaDicaSimples() throws Exception {
        dao.persist(dica1);
        dao.persist(dica2);

        Discordancia disc1 = new Discordancia(usuario1, "Não gostei da dica.");
        Discordancia disc2 = new Discordancia(usuario2, "Não gostei da dica mesmo.");
        dao.persist(disc1);
        dao.persist(disc2);

        // Verifica que o número de discordancias da dica1 no banco de dados é 0
        DicaSimples dica1bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Java").get(0);
        assertThat(dica1bd.getNumeroDiscordancia()).isEqualTo(0);
        assertThat(dica1bd.getNumeroVotos()).isEqualTo(0);

        // Vai ser possível adicionar, já que o usuario1 ainda não votou na dica1
        dica1.adicionaDiscordancia(disc1);
        dao.merge(dica1);

        // Verifica que o número de discordancias da dica1 foi alterado
        dica1bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Java").get(0);
        assertThat(dica1bd.getNumeroDiscordancia()).isEqualTo(1);
        assertThat(dica1bd.getNumeroVotos()).isEqualTo(1);

        // Se o usuario1 tentar votar novamente na dica1, será lançado uma exceção
        try {
            dica1.adicionaDiscordancia(disc1);
            Assert.fail("Deveria lançar exceção");
        } catch (Exception e) {
            Assert.assertEquals("Usuário já votou", e.getMessage());
        }

        // Porém, se o usuario2 tentar votar na dica1, será possível, já que ele não havia votado anteriormente
        dica1.adicionaDiscordancia(disc2);
        dao.merge(dica1);

        // Verifica que o número de discordâncias da dica1 foi alterado
        dica1bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Java").get(0);
        assertThat(dica1bd.getNumeroDiscordancia()).isEqualTo(2);
        assertThat(dica1bd.getNumeroVotos()).isEqualTo(2);

        // Mas se ele tentar votar novamente, será lançado uma exceção
        try {
            dica1.adicionaDiscordancia(disc2);
            Assert.fail("Deveria lançar exceção");
        } catch (Exception e) {
            Assert.assertEquals("Usuário já votou", e.getMessage());
        }

        // Verifica que a dica2 ainda não tem votos
        DicaSimples dica2bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Programação").get(0);
        assertThat(dica2bd.getNumeroDiscordancia()).isEqualTo(0);
        assertThat(dica2bd.getNumeroVotos()).isEqualTo(0);

        // O usuario1, apesar de não poder votar mais na dica1, ele pode votar em outras dicas, como na dica2
        dica2.adicionaDiscordancia(disc1);
        dao.merge(dica2);

        // Verifica que o número de discordâncias da dica2 foi alterado
        dica2bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Programação").get(0);
        assertThat(dica2bd.getNumeroDiscordancia()).isEqualTo(1);
        assertThat(dica2bd.getNumeroVotos()).isEqualTo(1);

    }

    @Test
    public void deveAdicionarDiscordanciaMetaDica() throws Exception {
        dao.persist(dica6);
        dao.persist(dica7);

        Discordancia disc1 = new Discordancia(usuario1, "Não gostei da dica.");
        Discordancia disc2 = new Discordancia(usuario2, "Não gostei da dica mesmo.");
        dao.persist(disc1);
        dao.persist(disc2);

        // Verifica que o número de discordancias da dica6 no banco de dados é 0
        MetaDica dica6bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 1").get(0);
        assertThat(dica6bd.getNumeroDiscordancia()).isEqualTo(0);
        assertThat(dica6bd.getNumeroVotos()).isEqualTo(0);

        // Vai ser possível adicionar, já que o usuario1 ainda não votou na dica6
        dica6.adicionaDiscordancia(disc1);
        dao.merge(dica6);

        // Verifica que o número de discordancias da dica6 foi alterado
        dica6bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 1").get(0);
        assertThat(dica6bd.getNumeroDiscordancia()).isEqualTo(1);
        assertThat(dica6bd.getNumeroVotos()).isEqualTo(1);

        // Se o usuario1 tentar votar novamente na dica6, será lançado uma exceção
        try {
            dica6.adicionaDiscordancia(disc1);
            Assert.fail("Deveria lançar exceção");
        } catch (Exception e) {
            Assert.assertEquals("Usuário já votou", e.getMessage());
        }

        // Porém, se o usuario2 tentar votar na dica6, será possível, já que ele não havia votado anteriormente
        dica6.adicionaDiscordancia(disc2);
        dao.merge(dica6);

        // Verifica que o número de discordâncias da dica6 foi alterado
        dica6bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 1").get(0);
        assertThat(dica6bd.getNumeroDiscordancia()).isEqualTo(2);
        assertThat(dica6bd.getNumeroVotos()).isEqualTo(2);

        // Mas se ele tentar votar novamente, será lançado uma exceção
        try {
            dica6.adicionaDiscordancia(disc2);
            Assert.fail("Deveria lançar exceção");
        } catch (Exception e) {
            Assert.assertEquals("Usuário já votou", e.getMessage());
        }

        // Verifica que a dica7 ainda não tem votos
        MetaDica dica7bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 2").get(0);
        assertThat(dica7bd.getNumeroDiscordancia()).isEqualTo(0);
        assertThat(dica7bd.getNumeroVotos()).isEqualTo(0);

        // O usuario1, apesar de não poder votar mais na dica6, ele pode votar em outras dicas, como na dica7
        dica7.adicionaDiscordancia(disc1);
        dao.merge(dica7);

        // Verifica que o número de discordâncias da dica7 foi alterado
        dica7bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 2").get(0);
        assertThat(dica7bd.getNumeroDiscordancia()).isEqualTo(1);
        assertThat(dica7bd.getNumeroVotos()).isEqualTo(1);

    }

    @Test
    public void deveCalcularIndiceConcordanciaDicaSimples() throws Exception {
        dao.persist(dica1);
        dao.persist(dica2);
        dao.persist(dica3);
        dao.persist(dica4);
        dao.persist(dica5);

        Concordancia conc1 = new Concordancia(usuario1);
        dao.persist(conc1);
        Concordancia conc2 = new Concordancia(usuario2);
        dao.persist(conc2);
        Concordancia conc3 = new Concordancia(usuario3);
        dao.persist(conc3);
        Concordancia conc4 = new Concordancia(usuario4);
        dao.persist(conc4);
        Concordancia conc5 = new Concordancia(usuario5);
        dao.persist(conc5);
        Concordancia conc6 = new Concordancia(usuario6);
        dao.persist(conc6);
        Concordancia conc7 = new Concordancia(usuario7);
        dao.persist(conc7);
        Discordancia disc1 = new Discordancia(usuario1, "Não gostei da dica.");
        dao.persist(disc1);
        Discordancia disc2 = new Discordancia(usuario2, "Não gostei da dica mesmo.");
        dao.persist(disc2);
        Discordancia disc3 = new Discordancia(usuario3, "Não gostei da dica 2.");
        dao.persist(disc3);
        Discordancia disc4 = new Discordancia(usuario4, "Não gostei da dica mesmo 2.");
        dao.persist(disc4);
        Discordancia disc5 = new Discordancia(usuario5, "Não concordo com esta dica.");
        dao.persist(disc5);
        Discordancia disc6 = new Discordancia(usuario6, "Não concordo de jeito nenhum");
        dao.persist(disc6);
        Discordancia disc7 = new Discordancia(usuario7, "Não gostei disso.");
        dao.persist(disc7);

        // Verifica que o número de concordâncias e discordâncias da dica1 no banco de dados é 0
        DicaSimples dica1bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Java").get(0);
        assertThat(dica1bd.getNumeroConcordancias()).isEqualTo(0);
        assertThat(dica1bd.getNumeroVotos()).isEqualTo(0);
        assertThat(dica1bd.getNumeroDiscordancia()).isEqualTo(0);
        assertThat(dica1bd.getNumeroVotos()).isEqualTo(0);

        // Serão adicionadas 2 concordâncias à dica1 e será verificado que o índice de concordância é igual a 1
        dica1.adicionaConcordancia(conc1);
        dica1.adicionaConcordancia(conc2);
        dao.merge(dica1);
        dica1bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Java").get(0);
        assertThat(dica1bd.getNumeroConcordancias()).isEqualTo(2);
        assertThat(dica1bd.getNumeroDiscordancia()).isEqualTo(0);
        assertThat(dica1bd.getNumeroVotos()).isEqualTo(2);
        assertThat(dica1bd.calculaIndiceConcordancia()).isEqualTo("1");

        // Verifica que o número de concordâncias e discordâncias da dica2 no banco de dados é 0
        DicaSimples dica2bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Programação").get(0);
        assertThat(dica2bd.getNumeroConcordancias()).isEqualTo(0);
        assertThat(dica2bd.getNumeroVotos()).isEqualTo(0);
        assertThat(dica2bd.getNumeroDiscordancia()).isEqualTo(0);
        assertThat(dica2bd.getNumeroVotos()).isEqualTo(0);

        // Serão adicionadas 2 concordâncias e 2 discordâncias à dica2 e será verificado que o índice de concordância é igual a 0,5
        dica2.adicionaConcordancia(conc1);
        dica2.adicionaConcordancia(conc2);
        dica2.adicionaDiscordancia(disc3);
        dica2.adicionaDiscordancia(disc4);
        dao.merge(dica2);
        dica2bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Programação").get(0);
        assertThat(dica2bd.getNumeroConcordancias()).isEqualTo(2);
        assertThat(dica2bd.getNumeroDiscordancia()).isEqualTo(2);
        assertThat(dica2bd.getNumeroVotos()).isEqualTo(4);
        assertThat(dica2bd.calculaIndiceConcordancia()).isEqualTo("0,5");

        // Verifica que o número de concordâncias e discordâncias da dica3 no banco de dados é 0
        DicaSimples dica3bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Eclipse").get(0);
        assertThat(dica3bd.getNumeroConcordancias()).isEqualTo(0);
        assertThat(dica3bd.getNumeroVotos()).isEqualTo(0);
        assertThat(dica3bd.getNumeroDiscordancia()).isEqualTo(0);
        assertThat(dica3bd.getNumeroVotos()).isEqualTo(0);

        // Serão adicionadas 3 concordâncias e 4 discordâncias à dica3 e será verificado que o índice de concordância é igual a 0,429
        dica3.adicionaConcordancia(conc1);
        dica3.adicionaConcordancia(conc2);
        dica3.adicionaConcordancia(conc3);
        dica3.adicionaDiscordancia(disc4);
        dica3.adicionaDiscordancia(disc5);
        dica3.adicionaDiscordancia(disc6);
        dica3.adicionaDiscordancia(disc7);
        dao.merge(dica3);
        dica3bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Eclipse").get(0);
        assertThat(dica3bd.getNumeroConcordancias()).isEqualTo(3);
        assertThat(dica3bd.getNumeroDiscordancia()).isEqualTo(4);
        assertThat(dica3bd.getNumeroVotos()).isEqualTo(7);
        assertThat(dica3bd.calculaIndiceConcordancia()).isEqualTo("0,429");

        // Verifica que o número de concordâncias e discordâncias da dica4 no banco de dados é 0
        DicaSimples dica4bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Procure os monitores.").get(0);
        assertThat(dica4bd.getNumeroConcordancias()).isEqualTo(0);
        assertThat(dica4bd.getNumeroVotos()).isEqualTo(0);
        assertThat(dica4bd.getNumeroDiscordancia()).isEqualTo(0);
        assertThat(dica4bd.getNumeroVotos()).isEqualTo(0);

        // Serão adicionadas 1 concordância e 3 discordâncias à dica4 e será verificado que o índice de concordância é igual a 0,25
        dica4.adicionaConcordancia(conc1);
        dica4.adicionaDiscordancia(disc2);
        dica4.adicionaDiscordancia(disc3);
        dica4.adicionaDiscordancia(disc4);
        dao.merge(dica4);
        dica4bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Procure os monitores.").get(0);
        assertThat(dica4bd.getNumeroConcordancias()).isEqualTo(1);
        assertThat(dica4bd.getNumeroDiscordancia()).isEqualTo(3);
        assertThat(dica4bd.getNumeroVotos()).isEqualTo(4);
        assertThat(dica4bd.calculaIndiceConcordancia()).isEqualTo("0,25");

        // Verifica que o número de concordâncias e discordâncias da dica5 no banco de dados é 0
        DicaSimples dica5bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Estude com frequência.").get(0);
        assertThat(dica5bd.getNumeroConcordancias()).isEqualTo(0);
        assertThat(dica5bd.getNumeroVotos()).isEqualTo(0);
        assertThat(dica5bd.getNumeroDiscordancia()).isEqualTo(0);
        assertThat(dica5bd.getNumeroVotos()).isEqualTo(0);

        // Serão adicionadas 1 concordância e 2 discordâncias à dica5 e será verificado que o índice de concordância é igual a 0,334
        dica5.adicionaConcordancia(conc1);
        dica5.adicionaDiscordancia(disc2);
        dica5.adicionaDiscordancia(disc3);
        dao.merge(dica5);
        dica5bd = (DicaSimples) dao.findByAttributeName("DicaSimples", "titulo", "Estude com frequência.").get(0);
        assertThat(dica5bd.getNumeroConcordancias()).isEqualTo(1);
        assertThat(dica5bd.getNumeroDiscordancia()).isEqualTo(2);
        assertThat(dica5bd.getNumeroVotos()).isEqualTo(3);
        assertThat(dica5bd.calculaIndiceConcordancia()).isEqualTo("0,334");
    }

    @Test
    public void deveCalcularIndiceConcordanciaMetaDica() throws Exception {
        dao.persist(dica6);
        dao.persist(dica7);

        Concordancia conc1 = new Concordancia(usuario1);
        dao.persist(conc1);
        Concordancia conc2 = new Concordancia(usuario2);
        dao.persist(conc2);
        Discordancia disc1 = new Discordancia(usuario1, "Não gostei da dica.");
        dao.persist(disc1);
        Discordancia disc2 = new Discordancia(usuario2, "Não gostei da dica mesmo.");
        dao.persist(disc2);
        Discordancia disc3 = new Discordancia(usuario3, "Não gostei da dica 2.");
        dao.persist(disc3);
        Discordancia disc4 = new Discordancia(usuario4, "Não gostei da dica mesmo 2.");
        dao.persist(disc4);
        Discordancia disc5 = new Discordancia(usuario5, "Não concordo com esta dica.");
        dao.persist(disc5);
        Discordancia disc6 = new Discordancia(usuario6, "Não concordo de jeito nenhum");
        dao.persist(disc6);

        // Verifica que o número de concordâncias e discordâncias da dica6 no banco de dados é 0
        MetaDica dica6bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 1").get(0);
        assertThat(dica6bd.getNumeroConcordancias()).isEqualTo(0);
        assertThat(dica6bd.getNumeroVotos()).isEqualTo(0);
        assertThat(dica6bd.getNumeroDiscordancia()).isEqualTo(0);
        assertThat(dica6bd.getNumeroVotos()).isEqualTo(0);

        // Serão adicionadas 2 concordâncias e 1 discordância à dica6 e será verificado que o índice de concordância é igual a 0,667
        dica6.adicionaConcordancia(conc1);
        dica6.adicionaConcordancia(conc2);
        dica6.adicionaDiscordancia(disc3);
        dao.merge(dica6);
        dica6bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 1").get(0);
        assertThat(dica6bd.getNumeroConcordancias()).isEqualTo(2);
        assertThat(dica6bd.getNumeroDiscordancia()).isEqualTo(1);
        assertThat(dica6bd.getNumeroVotos()).isEqualTo(3);
        assertThat(dica6bd.calculaIndiceConcordancia()).isEqualTo("0,667");

        // Verifica que o número de concordâncias e discordâncias da dica7 no banco de dados é 0
        MetaDica dica7bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 2").get(0);
        assertThat(dica7bd.getNumeroConcordancias()).isEqualTo(0);
        assertThat(dica7bd.getNumeroVotos()).isEqualTo(0);
        assertThat(dica7bd.getNumeroDiscordancia()).isEqualTo(0);
        assertThat(dica7bd.getNumeroVotos()).isEqualTo(0);

        // Serão adicionadas 1 concordâncias e 5 discordâncias à dica7 e será verificado que o índice de concordância é igual a 0,167
        dica7.adicionaConcordancia(conc1);
        dica7.adicionaDiscordancia(disc2);
        dica7.adicionaDiscordancia(disc3);
        dica7.adicionaDiscordancia(disc4);
        dica7.adicionaDiscordancia(disc5);
        dica7.adicionaDiscordancia(disc6);
        dao.merge(dica7);
        dica7bd = (MetaDica) dao.findByAttributeName("MetaDica", "titulo", "Meta-Dica 2").get(0);
        assertThat(dica7bd.getNumeroConcordancias()).isEqualTo(1);
        assertThat(dica7bd.getNumeroDiscordancia()).isEqualTo(5);
        assertThat(dica7bd.getNumeroVotos()).isEqualTo(6);
        assertThat(dica7bd.calculaIndiceConcordancia()).isEqualTo("0,167");
    }

    @Before
    public void setUp() {
        //Using Global.java to the tests
        FakeApplication app = Helpers.fakeApplication();
        Helpers.start(app);
        Option<JPAPlugin> jpaPlugin = app.getWrappedApplication().plugin(JPAPlugin.class);
        em = jpaPlugin.get().em("default");
        JPA.bindForCurrentThread(em);
        em.getTransaction().begin();
    }

    @After
    public void tearDown() {
        em.getTransaction().commit();
        JPA.bindForCurrentThread(null);
        em.close();
    }
}
