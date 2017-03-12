package models;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }

    models.Usuario usuario3 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil6 = new models.DicaMaterialUtil("", usuario3, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores9 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario3, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade11 = new models.DicaComoNaoTerDificuldade("hi!", usuario3, "hi!");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil6 and dicaDisciplinasAnteriores9
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil6 and dicaDisciplinasAnteriores9", (dicaMaterialUtil6.compareTo(dicaDisciplinasAnteriores9) == 0) == dicaMaterialUtil6.equals(dicaDisciplinasAnteriores9));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test002"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Usuario usuario4 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil7 = new models.DicaMaterialUtil("", usuario4, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica9 = new models.MetaDica("hi!", usuario4, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    dicaDisciplinasAnteriores0.setAutor(usuario4);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil7 and metaDica9
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil7 and metaDica9", (dicaMaterialUtil7.compareTo(metaDica9) == 0) == dicaMaterialUtil7.equals(metaDica9));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade7 = new models.DicaComoNaoTerDificuldade("", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    java.lang.String str8 = usuario2.getNome();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil5 and dicaComoNaoTerDificuldade7
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil5 and dicaComoNaoTerDificuldade7", (dicaMaterialUtil5.compareTo(dicaComoNaoTerDificuldade7) == 0) == dicaMaterialUtil5.equals(dicaComoNaoTerDificuldade7));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test004"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade7 = new models.DicaComoNaoTerDificuldade("", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    usuario2.setNome("");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil5 and dicaComoNaoTerDificuldade7
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil5 and dicaComoNaoTerDificuldade7", (dicaMaterialUtil5.compareTo(dicaComoNaoTerDificuldade7) == 0) == dicaMaterialUtil5.equals(dicaComoNaoTerDificuldade7));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test005"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Usuario usuario2 = null;
    models.Discordancia discordancia4 = new models.Discordancia(usuario2, "");
    models.Usuario usuario5 = null;
    discordancia4.setAutor(usuario5);
    int i7 = discordancia4.getId();
    dicaDisciplinasAnteriores0.adicionaDiscordancia(discordancia4);
    models.Usuario usuario10 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil13 = new models.DicaMaterialUtil("", usuario10, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    discordancia4.setAutor(usuario10);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores0 and dicaMaterialUtil13
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores0 and dicaMaterialUtil13", (dicaDisciplinasAnteriores0.compareTo(dicaMaterialUtil13) == 0) == dicaDisciplinasAnteriores0.equals(dicaMaterialUtil13));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test006"); }

    models.Usuario usuario3 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil6 = new models.DicaMaterialUtil("", usuario3, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores9 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario3, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade11 = new models.DicaComoNaoTerDificuldade("", usuario3, "hi!");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil6 and dicaDisciplinasAnteriores9
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil6 and dicaDisciplinasAnteriores9", (dicaMaterialUtil6.compareTo(dicaDisciplinasAnteriores9) == 0) == dicaMaterialUtil6.equals(dicaDisciplinasAnteriores9));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test007"); }

    models.Usuario usuario3 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil6 = new models.DicaMaterialUtil("", usuario3, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica8 = new models.MetaDica("hi!", usuario3, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica10 = new models.MetaDica("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario3, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil6 and metaDica8
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil6 and metaDica8", (dicaMaterialUtil6.compareTo(metaDica8) == 0) == dicaMaterialUtil6.equals(metaDica8));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test008"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade7 = new models.DicaComoNaoTerDificuldade("", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b9 = usuario2.checaSenha("Conselho");

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test009"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica7 = new models.MetaDica("hi!", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia8 = new models.Concordancia(usuario2);
    
    // Checks the contract:  compareTo-equals on metaDica7 and dicaMaterialUtil5
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica7 and dicaMaterialUtil5", (metaDica7.compareTo(dicaMaterialUtil5) == 0) == metaDica7.equals(dicaMaterialUtil5));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test010"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("0,0", usuario2, "models.DicaMaterialUtil", "Meta Dica");
    models.Discordancia discordancia10 = new models.Discordancia(usuario2, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores8 and dicaMaterialUtil5
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores8 and dicaMaterialUtil5", (dicaDisciplinasAnteriores8.compareTo(dicaMaterialUtil5) == 0) == dicaDisciplinasAnteriores8.equals(dicaMaterialUtil5));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test011"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil();
    java.lang.String str15 = dicaMaterialUtil14.getNomeURL();
    long long16 = dicaMaterialUtil14.getId();
    metaDica12.adicionaDica((models.IDica)dicaMaterialUtil14);
    int i18 = metaDica12.getNumeroVotos();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil14 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil14 and dicaMaterialUtil10", (dicaMaterialUtil14.compareTo(dicaMaterialUtil10) == 0) == dicaMaterialUtil14.equals(dicaMaterialUtil10));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test012"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    models.MetaDica metaDica14 = null;
    disciplina1.addMetaDica(metaDica14);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil10 and metaDica12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil10 and metaDica12", (dicaMaterialUtil10.compareTo(metaDica12) == 0) == dicaMaterialUtil10.equals(metaDica12));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test013"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.lang.String str1 = dicaMaterialUtil0.getNomeURL();
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario7 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade3.setAutor(usuario7);
    models.MetaDica metaDica10 = new models.MetaDica("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario7, "models.DicaMaterialUtil");
    boolean b11 = dicaMaterialUtil0.usuarioAtualVotouNestaDica(usuario7);
    
    // Checks the contract:  compareTo-equals on metaDica10 and dicaComoNaoTerDificuldade3
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica10 and dicaComoNaoTerDificuldade3", (metaDica10.compareTo(dicaComoNaoTerDificuldade3) == 0) == metaDica10.equals(dicaComoNaoTerDificuldade3));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test014"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    java.lang.String str9 = usuario2.getNome();
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores8 and dicaMaterialUtil5
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores8 and dicaMaterialUtil5", (dicaDisciplinasAnteriores8.compareTo(dicaMaterialUtil5) == 0) == dicaDisciplinasAnteriores8.equals(dicaMaterialUtil5));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test015"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade7 = new models.DicaComoNaoTerDificuldade("", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i8 = usuario2.getId();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil5 and dicaComoNaoTerDificuldade7
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil5 and dicaComoNaoTerDificuldade7", (dicaMaterialUtil5.compareTo(dicaComoNaoTerDificuldade7) == 0) == dicaMaterialUtil5.equals(dicaComoNaoTerDificuldade7));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test016"); }

    models.Usuario usuario1 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil4 = new models.DicaMaterialUtil("", usuario1, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade12 = new models.DicaComoNaoTerDificuldade("", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    boolean b13 = usuario1.equals((java.lang.Object)usuario7);
    
    // Checks the contract:  compareTo-equals on dicaComoNaoTerDificuldade12 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaComoNaoTerDificuldade12 and dicaMaterialUtil10", (dicaComoNaoTerDificuldade12.compareTo(dicaMaterialUtil10) == 0) == dicaComoNaoTerDificuldade12.equals(dicaMaterialUtil10));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test017"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaConselho dicaConselho7 = new models.DicaConselho("models.DicaDisciplinasAnteriores", usuario2, "models.DicaConselho");
    int i8 = usuario2.getId();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil5 and dicaConselho7
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil5 and dicaConselho7", (dicaMaterialUtil5.compareTo(dicaConselho7) == 0) == dicaMaterialUtil5.equals(dicaConselho7));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test018"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica7 = new models.MetaDica("hi!", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores();
    java.lang.String str9 = dicaDisciplinasAnteriores8.getCategoria();
    metaDica7.adicionaDica((models.IDica)dicaDisciplinasAnteriores8);
    dicaDisciplinasAnteriores8.setNomesDisciplinas("Disciplinas anteriores que te ajudar\u00E3o aqui");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil5 and metaDica7
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil5 and metaDica7", (dicaMaterialUtil5.compareTo(metaDica7) == 0) == dicaMaterialUtil5.equals(metaDica7));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test019"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    int i5 = disciplina1.getNumeroMetaDicas();
    disciplina1.setNome("models.DicaMaterialUtil");
    models.Disciplina disciplina9 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica10 = disciplina9.getMetadicas();
    disciplina9.setId((java.lang.Long)10L);
    models.Usuario usuario15 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil18 = new models.DicaMaterialUtil("", usuario15, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica20 = new models.MetaDica("hi!", usuario15, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina9.addMetaDica(metaDica20);
    java.lang.String str22 = metaDica20.getTipo();
    metaDica20.addDenuncia("hi!");
    metaDica20.setComentario("models.MetaDica");
    java.lang.String str27 = metaDica20.getComentario();
    boolean b28 = metaDica20.isVisivel();
    disciplina1.addMetaDica(metaDica20);
    models.Tema tema31 = new models.Tema("");
    java.util.List<models.IDica> list_iDica32 = tema31.getDicas();
    int i33 = tema31.getNumeroDicas();
    int i34 = tema31.getNumeroDicas();
    models.Tema tema35 = disciplina1.addTema(tema31);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil18 and metaDica20
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil18 and metaDica20", (dicaMaterialUtil18.compareTo(metaDica20) == 0) == dicaMaterialUtil18.equals(metaDica20));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test020"); }

    models.Disciplina disciplina2 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica3 = disciplina2.getMetadicas();
    disciplina2.setId((java.lang.Long)10L);
    models.Usuario usuario8 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil11 = new models.DicaMaterialUtil("", usuario8, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica13 = new models.MetaDica("hi!", usuario8, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina2.addMetaDica(metaDica13);
    java.lang.String str15 = metaDica13.getTipo();
    int i16 = metaDica13.getNumeroDicasNaMetaDica();
    models.Usuario usuario17 = metaDica13.getAutor();
    models.MetaDica metaDica19 = new models.MetaDica("", usuario17, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil11 and metaDica13
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil11 and metaDica13", (dicaMaterialUtil11.compareTo(metaDica13) == 0) == dicaMaterialUtil11.equals(metaDica13));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test021"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica7 = new models.MetaDica("hi!", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores();
    java.lang.String str9 = dicaDisciplinasAnteriores8.getCategoria();
    metaDica7.adicionaDica((models.IDica)dicaDisciplinasAnteriores8);
    boolean b11 = metaDica7.isVotavel();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil5 and dicaDisciplinasAnteriores8
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil5 and dicaDisciplinasAnteriores8", (dicaMaterialUtil5.compareTo(dicaDisciplinasAnteriores8) == 0) == dicaMaterialUtil5.equals(dicaDisciplinasAnteriores8));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test022"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil();
    java.lang.String str15 = dicaMaterialUtil14.getNomeURL();
    long long16 = dicaMaterialUtil14.getId();
    metaDica12.adicionaDica((models.IDica)dicaMaterialUtil14);
    int i18 = dicaMaterialUtil14.getNumeroDiscordancia();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil10 and metaDica12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil10 and metaDica12", (dicaMaterialUtil10.compareTo(metaDica12) == 0) == dicaMaterialUtil10.equals(metaDica12));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test023"); }

    models.Usuario usuario3 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil6 = new models.DicaMaterialUtil("", usuario3, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaConselho dicaConselho8 = new models.DicaConselho("models.DicaDisciplinasAnteriores", usuario3, "models.DicaConselho");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade10 = new models.DicaComoNaoTerDificuldade("models.DicaComoNaoTerDificuldade", usuario3, "Meta Dica");
    
    // Checks the contract:  compareTo-equals on dicaConselho8 and dicaMaterialUtil6
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaConselho8 and dicaMaterialUtil6", (dicaConselho8.compareTo(dicaMaterialUtil6) == 0) == dicaConselho8.equals(dicaMaterialUtil6));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test024"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil();
    java.lang.String str15 = dicaMaterialUtil14.getNomeURL();
    long long16 = dicaMaterialUtil14.getId();
    metaDica12.adicionaDica((models.IDica)dicaMaterialUtil14);
    java.util.List<models.Discordancia> list_discordancia18 = metaDica12.getListaDiscordancia();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil14 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil14 and dicaMaterialUtil10", (dicaMaterialUtil14.compareTo(dicaMaterialUtil10) == 0) == dicaMaterialUtil14.equals(dicaMaterialUtil10));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test025"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    int i5 = disciplina1.getNumeroMetaDicas();
    disciplina1.setNome("models.DicaMaterialUtil");
    models.Disciplina disciplina9 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica10 = disciplina9.getMetadicas();
    disciplina9.setId((java.lang.Long)10L);
    models.Usuario usuario15 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil18 = new models.DicaMaterialUtil("", usuario15, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica20 = new models.MetaDica("hi!", usuario15, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina9.addMetaDica(metaDica20);
    java.lang.String str22 = metaDica20.getTipo();
    metaDica20.addDenuncia("hi!");
    metaDica20.setComentario("models.MetaDica");
    java.lang.String str27 = metaDica20.getComentario();
    boolean b28 = metaDica20.isVisivel();
    disciplina1.addMetaDica(metaDica20);
    int i30 = disciplina1.getNumeroMetaDicasVisiveis();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil18 and metaDica20
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil18 and metaDica20", (dicaMaterialUtil18.compareTo(metaDica20) == 0) == dicaMaterialUtil18.equals(metaDica20));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test026"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaConselho dicaConselho7 = new models.DicaConselho("models.DicaDisciplinasAnteriores", usuario2, "models.DicaConselho");
    usuario2.setSenha("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Checks the contract:  compareTo-equals on dicaConselho7 and dicaMaterialUtil5
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaConselho7 and dicaMaterialUtil5", (dicaConselho7.compareTo(dicaMaterialUtil5) == 0) == dicaConselho7.equals(dicaMaterialUtil5));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test027"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    models.Usuario usuario9 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil12 = new models.DicaMaterialUtil("", usuario9, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade14 = new models.DicaComoNaoTerDificuldade("", usuario9, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    metaDica6.adicionaDica((models.IDica)dicaComoNaoTerDificuldade14);
    java.lang.String str16 = dicaComoNaoTerDificuldade14.getTipo();
    
    // Checks the contract:  compareTo-equals on metaDica6 and dicaMaterialUtil12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica6 and dicaMaterialUtil12", (metaDica6.compareTo(dicaMaterialUtil12) == 0) == metaDica6.equals(dicaMaterialUtil12));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test028"); }

    models.Usuario usuario3 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil6 = new models.DicaMaterialUtil("", usuario3, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores9 = new models.DicaDisciplinasAnteriores("0,0", usuario3, "models.DicaMaterialUtil", "Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores12 = new models.DicaDisciplinasAnteriores("models.DicaDisciplinasAnteriores", usuario3, "models.DicaComoNaoTerDificuldade", "Conselho");
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores9 and dicaMaterialUtil6
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores9 and dicaMaterialUtil6", (dicaDisciplinasAnteriores9.compareTo(dicaMaterialUtil6) == 0) == dicaDisciplinasAnteriores9.equals(dicaMaterialUtil6));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test029"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    java.lang.String str6 = dicaComoNaoTerDificuldade3.getCategoria();
    models.Usuario usuario9 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil12 = new models.DicaMaterialUtil("", usuario9, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores15 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario9, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    dicaComoNaoTerDificuldade3.setAutor(usuario9);
    
    // Checks the contract:  compareTo-equals on metaDica0 and dicaMaterialUtil12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica0 and dicaMaterialUtil12", (metaDica0.compareTo(dicaMaterialUtil12) == 0) == metaDica0.equals(dicaMaterialUtil12));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test030"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    disciplina1.setNome("models.DicaConselho");
    models.Disciplina disciplina9 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica10 = disciplina9.getMetadicas();
    disciplina9.setId((java.lang.Long)10L);
    models.Usuario usuario15 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil18 = new models.DicaMaterialUtil("", usuario15, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica20 = new models.MetaDica("hi!", usuario15, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina9.addMetaDica(metaDica20);
    java.lang.String str22 = metaDica20.getTipo();
    metaDica20.addDenuncia("hi!");
    metaDica20.setComentario("models.MetaDica");
    java.lang.String str27 = metaDica20.getComentario();
    boolean b28 = metaDica20.isVisivel();
    java.lang.String str29 = metaDica20.getTipo();
    boolean b30 = disciplina1.equals((java.lang.Object)str29);
    
    // Checks the contract:  compareTo-equals on metaDica20 and dicaMaterialUtil18
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica20 and dicaMaterialUtil18", (metaDica20.compareTo(dicaMaterialUtil18) == 0) == metaDica20.equals(dicaMaterialUtil18));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test031"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("0,0", usuario2, "models.DicaMaterialUtil", "Meta Dica");
    int i9 = usuario2.getId();
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores8 and dicaMaterialUtil5
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores8 and dicaMaterialUtil5", (dicaDisciplinasAnteriores8.compareTo(dicaMaterialUtil5) == 0) == dicaDisciplinasAnteriores8.equals(dicaMaterialUtil5));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test032"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    boolean b4 = disciplina1.equals((java.lang.Object)10.0f);
    models.Tema tema5 = new models.Tema();
    boolean b7 = tema5.isAvaliado("");
    models.Tema tema8 = disciplina1.addTema(tema5);
    tema5.addAvaliacao("models.MetaDica", (java.lang.Integer)0);
    
    // Checks the contract:  equals-hashcode on tema8 and tema5
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on tema8 and tema5", tema8.equals(tema5) ? tema8.hashCode() == tema5.hashCode() : true);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test033"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario4.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("0,0", usuario4, "hi!", "models.DicaDisciplinasAnteriores");
    models.Disciplina disciplina11 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica12 = disciplina11.getMetadicas();
    disciplina11.setId((java.lang.Long)10L);
    models.Usuario usuario17 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil20 = new models.DicaMaterialUtil("", usuario17, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica22 = new models.MetaDica("hi!", usuario17, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina11.addMetaDica(metaDica22);
    models.Usuario usuario24 = metaDica22.getAutor();
    boolean b25 = usuario4.equals((java.lang.Object)usuario24);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil9 and dicaMaterialUtil20
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil9 and dicaMaterialUtil20", (dicaMaterialUtil9.compareTo(dicaMaterialUtil20) == 0) == dicaMaterialUtil9.equals(dicaMaterialUtil20));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test034"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores1 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario2 = dicaDisciplinasAnteriores1.getListaUsuariosQueVotaram();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores1.setAutor(usuario6);
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("hi!", usuario6, "Conselho", "Conselho");
    models.Tema tema12 = new models.Tema("");
    double d13 = tema12.getMedia();
    double d14 = tema12.getMediana();
    int i15 = tema12.getNumeroDicasVisiveis();
    java.lang.String str16 = tema12.getNome();
    boolean b17 = usuario6.equals((java.lang.Object)str16);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores1 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores1 and dicaMaterialUtil10", (dicaDisciplinasAnteriores1.compareTo(dicaMaterialUtil10) == 0) == dicaDisciplinasAnteriores1.equals(dicaMaterialUtil10));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test035"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    boolean b6 = metaDica0.isVisivel();
    models.DicaMaterialUtil dicaMaterialUtil7 = new models.DicaMaterialUtil();
    dicaMaterialUtil7.setId((long)(short)100);
    int i10 = metaDica0.compareTo((models.IDica)dicaMaterialUtil7);
    java.lang.String str11 = metaDica0.getComentario();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil7 and dicaComoNaoTerDificuldade3
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil7 and dicaComoNaoTerDificuldade3", (dicaMaterialUtil7.compareTo(dicaComoNaoTerDificuldade3) == 0) == dicaMaterialUtil7.equals(dicaComoNaoTerDificuldade3));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test036"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = disciplina1.getNome();
    
    // Checks the contract:  compareTo-equals on metaDica12 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica12 and dicaMaterialUtil10", (metaDica12.compareTo(dicaMaterialUtil10) == 0) == metaDica12.equals(dicaMaterialUtil10));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test037"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    boolean b4 = disciplina1.equals((java.lang.Object)10.0f);
    models.Tema tema5 = new models.Tema();
    boolean b7 = tema5.isAvaliado("");
    models.Tema tema8 = disciplina1.addTema(tema5);
    java.lang.Long long9 = tema5.getId();
    
    // Checks the contract:  equals-hashcode on tema8 and tema8
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on tema8 and tema8", tema8.equals(tema8) ? tema8.hashCode() == tema8.hashCode() : true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test038"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    int i5 = disciplina1.getNumeroMetaDicas();
    disciplina1.setNome("models.DicaMaterialUtil");
    models.Disciplina disciplina9 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica10 = disciplina9.getMetadicas();
    disciplina9.setId((java.lang.Long)10L);
    models.Usuario usuario15 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil18 = new models.DicaMaterialUtil("", usuario15, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica20 = new models.MetaDica("hi!", usuario15, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina9.addMetaDica(metaDica20);
    java.lang.String str22 = metaDica20.getTipo();
    metaDica20.addDenuncia("hi!");
    metaDica20.setComentario("models.MetaDica");
    java.lang.String str27 = metaDica20.getComentario();
    boolean b28 = metaDica20.isVisivel();
    disciplina1.addMetaDica(metaDica20);
    int i30 = disciplina1.getNumeroMetaDicas();
    
    // Checks the contract:  compareTo-equals on metaDica20 and dicaMaterialUtil18
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica20 and dicaMaterialUtil18", (metaDica20.compareTo(dicaMaterialUtil18) == 0) == metaDica20.equals(dicaMaterialUtil18));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test039"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade8 = new models.DicaComoNaoTerDificuldade("models.DicaDisciplinasAnteriores", usuario4, "hi!");
    models.Usuario usuario11 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil("", usuario11, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores17 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario11, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    java.util.List<models.Discordancia> list_discordancia18 = dicaDisciplinasAnteriores17.getListaDiscordancia();
    boolean b19 = usuario4.equals((java.lang.Object)dicaDisciplinasAnteriores17);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil14 and dicaComoNaoTerDificuldade8
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil14 and dicaComoNaoTerDificuldade8", (dicaMaterialUtil14.compareTo(dicaComoNaoTerDificuldade8) == 0) == dicaMaterialUtil14.equals(dicaComoNaoTerDificuldade8));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test040"); }

    models.DicaConselho dicaConselho1 = new models.DicaConselho();
    java.lang.String str2 = dicaConselho1.getCategoria();
    boolean b3 = dicaConselho1.isVotavel();
    java.lang.String str4 = dicaConselho1.getTipo();
    int i5 = dicaConselho1.getNumeroDiscordancia();
    dicaConselho1.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    models.Usuario usuario8 = new models.Usuario();
    usuario8.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia11 = new models.Concordancia(usuario8);
    java.lang.String str12 = usuario8.getLogin();
    dicaConselho1.setAutor(usuario8);
    models.DicaConselho dicaConselho15 = new models.DicaConselho("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario8, "models.DicaComoNaoTerDificuldade");
    usuario8.setSenha("Meta Dica");
    
    // Checks the contract:  compareTo-equals on dicaConselho15 and dicaConselho1
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaConselho15 and dicaConselho1", (dicaConselho15.compareTo(dicaConselho1) == 0) == dicaConselho15.equals(dicaConselho1));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test041"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores1 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario2 = dicaDisciplinasAnteriores1.getListaUsuariosQueVotaram();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores1.setAutor(usuario6);
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("hi!", usuario6, "Conselho", "Conselho");
    int i11 = usuario6.getId();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil10 and dicaDisciplinasAnteriores1
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil10 and dicaDisciplinasAnteriores1", (dicaMaterialUtil10.compareTo(dicaDisciplinasAnteriores1) == 0) == dicaMaterialUtil10.equals(dicaDisciplinasAnteriores1));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test042"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.MetaDica", usuario4, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    usuario4.setLogin("");
    models.Concordancia concordancia12 = new models.Concordancia(usuario4);
    models.Usuario usuario13 = concordancia12.getAutor();
    models.Usuario usuario16 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil19 = new models.DicaMaterialUtil("", usuario16, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores22 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario16, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    concordancia12.setAutor(usuario16);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil19 and dicaDisciplinasAnteriores22
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil19 and dicaDisciplinasAnteriores22", (dicaMaterialUtil19.compareTo(dicaDisciplinasAnteriores22) == 0) == dicaMaterialUtil19.equals(dicaDisciplinasAnteriores22));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test043"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    disciplina1.setNome("models.DicaConselho");
    java.lang.String str8 = disciplina1.getNome();
    models.Disciplina disciplina10 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica11 = disciplina10.getMetadicas();
    disciplina10.setId((java.lang.Long)10L);
    models.Usuario usuario16 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil19 = new models.DicaMaterialUtil("", usuario16, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica21 = new models.MetaDica("hi!", usuario16, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina10.addMetaDica(metaDica21);
    java.lang.String str23 = metaDica21.getTipo();
    int i24 = metaDica21.getNumeroDicasNaMetaDica();
    disciplina1.addMetaDica(metaDica21);
    models.Usuario usuario26 = metaDica21.getAutor();
    usuario26.setNome("models.DicaComoNaoTerDificuldade");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil19 and metaDica21
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil19 and metaDica21", (dicaMaterialUtil19.compareTo(metaDica21) == 0) == dicaMaterialUtil19.equals(metaDica21));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test044"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    boolean b18 = metaDica12.recebeuDenunciaDe("Meta Dica");
    models.Usuario usuario23 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica25 = new models.MetaDica("models.MetaDica", usuario23, "models.DicaConselho");
    models.Concordancia concordancia26 = new models.Concordancia(usuario23);
    models.Usuario usuario27 = concordancia26.getAutor();
    java.lang.String str28 = usuario27.getLogin();
    boolean b29 = metaDica12.usuarioAtualVotouNestaDica(usuario27);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil10 and metaDica25
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil10 and metaDica25", (dicaMaterialUtil10.compareTo(metaDica25) == 0) == dicaMaterialUtil10.equals(metaDica25));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test045"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setNomeURL("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Usuario usuario9 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario9.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil("0,0", usuario9, "hi!", "models.DicaDisciplinasAnteriores");
    dicaMaterialUtil0.setAutor(usuario9);
    boolean b17 = usuario9.checaSenha("0,0");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil0 and dicaMaterialUtil14
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil0 and dicaMaterialUtil14", (dicaMaterialUtil0.compareTo(dicaMaterialUtil14) == 0) == dicaMaterialUtil0.equals(dicaMaterialUtil14));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test046"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    metaDica12.setComentario("models.MetaDica");
    int i19 = metaDica12.getNumeroDenuncias();
    models.Usuario usuario20 = null;
    models.Discordancia discordancia22 = new models.Discordancia(usuario20, "hi!");
    discordancia22.setRazaoDiscordancia("");
    int i25 = discordancia22.getId();
    discordancia22.setRazaoDiscordancia("");
    int i28 = discordancia22.getId();
    java.lang.String str29 = discordancia22.getRazaoDiscordancia();
    metaDica12.adicionaDiscordancia(discordancia22);
    java.lang.String str31 = discordancia22.getRazaoDiscordancia();
    
    // Checks the contract:  compareTo-equals on metaDica12 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica12 and dicaMaterialUtil10", (metaDica12.compareTo(dicaMaterialUtil10) == 0) == metaDica12.equals(dicaMaterialUtil10));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test047"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    int i9 = usuario2.getId();
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores8 and dicaMaterialUtil5
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores8 and dicaMaterialUtil5", (dicaDisciplinasAnteriores8.compareTo(dicaMaterialUtil5) == 0) == dicaDisciplinasAnteriores8.equals(dicaMaterialUtil5));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test048"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    metaDica12.setComentario("models.MetaDica");
    java.lang.String str19 = metaDica12.getComentario();
    java.lang.String str20 = metaDica12.getCategoria();
    models.Usuario usuario24 = new models.Usuario("", "models.DicaConselho", "Meta Dica");
    metaDica12.setAutor(usuario24);
    java.lang.String str26 = usuario24.getNome();
    
    // Checks the contract:  compareTo-equals on metaDica12 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica12 and dicaMaterialUtil10", (metaDica12.compareTo(dicaMaterialUtil10) == 0) == metaDica12.equals(dicaMaterialUtil10));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test049"); }

    models.DicaConselho dicaConselho1 = new models.DicaConselho();
    java.lang.String str2 = dicaConselho1.getCategoria();
    boolean b3 = dicaConselho1.isVotavel();
    java.lang.String str4 = dicaConselho1.getTipo();
    int i5 = dicaConselho1.getNumeroDiscordancia();
    dicaConselho1.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    models.Usuario usuario8 = new models.Usuario();
    usuario8.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia11 = new models.Concordancia(usuario8);
    java.lang.String str12 = usuario8.getLogin();
    dicaConselho1.setAutor(usuario8);
    models.DicaConselho dicaConselho15 = new models.DicaConselho("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario8, "models.DicaComoNaoTerDificuldade");
    boolean b17 = usuario8.checaSenha("models.DicaComoNaoTerDificuldade");
    
    // Checks the contract:  compareTo-equals on dicaConselho1 and dicaConselho15
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaConselho1 and dicaConselho15", (dicaConselho1.compareTo(dicaConselho15) == 0) == dicaConselho1.equals(dicaConselho15));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test050"); }

    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario5.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("0,0", usuario5, "hi!", "models.DicaDisciplinasAnteriores");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores13 = new models.DicaDisciplinasAnteriores("models.DicaConselho", usuario5, "hi!", "Meta Dica");
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil();
    java.lang.String str15 = dicaMaterialUtil14.getNomeURL();
    long long16 = dicaMaterialUtil14.getId();
    dicaMaterialUtil14.setNomeURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str19 = dicaMaterialUtil14.getTitulo();
    boolean b20 = usuario5.equals((java.lang.Object)str19);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores13 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores13 and dicaMaterialUtil10", (dicaDisciplinasAnteriores13.compareTo(dicaMaterialUtil10) == 0) == dicaDisciplinasAnteriores13.equals(dicaMaterialUtil10));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test051"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    metaDica12.setComentario("models.MetaDica");
    long long19 = metaDica12.getId();
    models.Usuario usuario20 = metaDica12.getAutor();
    usuario20.setLogin("Meta Dica");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil10 and metaDica12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil10 and metaDica12", (dicaMaterialUtil10.compareTo(metaDica12) == 0) == dicaMaterialUtil10.equals(metaDica12));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test052"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    metaDica12.setComentario("models.MetaDica");
    long long19 = metaDica12.getId();
    models.Usuario usuario20 = metaDica12.getAutor();
    models.Disciplina disciplina22 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica23 = disciplina22.getMetadicas();
    disciplina22.setId((java.lang.Long)10L);
    models.Usuario usuario28 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil31 = new models.DicaMaterialUtil("", usuario28, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica33 = new models.MetaDica("hi!", usuario28, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina22.addMetaDica(metaDica33);
    java.lang.String str35 = metaDica33.getTipo();
    metaDica33.addDenuncia("hi!");
    metaDica33.setComentario("models.MetaDica");
    java.lang.String str40 = metaDica33.getComentario();
    metaDica33.setComentario("");
    metaDica12.adicionaDica((models.IDica)metaDica33);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil31 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil31 and dicaMaterialUtil10", (dicaMaterialUtil31.compareTo(dicaMaterialUtil10) == 0) == dicaMaterialUtil31.equals(dicaMaterialUtil10));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test053"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.DicaDisciplinasAnteriores", usuario5, "Meta Dica", "models.MetaDica");
    java.lang.String str10 = usuario5.getLogin();
    
    // Checks the contract:  compareTo-equals on dicaComoNaoTerDificuldade1 and dicaMaterialUtil9
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaComoNaoTerDificuldade1 and dicaMaterialUtil9", (dicaComoNaoTerDificuldade1.compareTo(dicaMaterialUtil9) == 0) == dicaComoNaoTerDificuldade1.equals(dicaMaterialUtil9));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test054"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade0.setAutor(usuario4);
    models.DicaMaterialUtil dicaMaterialUtil6 = new models.DicaMaterialUtil();
    boolean b7 = dicaMaterialUtil6.isVotavel();
    boolean b8 = dicaMaterialUtil6.isVotavel();
    dicaMaterialUtil6.setNomeURL("hi!");
    dicaMaterialUtil6.setDominioURL("models.DicaComoNaoTerDificuldade");
    boolean b13 = usuario4.equals((java.lang.Object)"models.DicaComoNaoTerDificuldade");
    
    // Checks the contract:  compareTo-equals on dicaComoNaoTerDificuldade0 and dicaMaterialUtil6
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaComoNaoTerDificuldade0 and dicaMaterialUtil6", (dicaComoNaoTerDificuldade0.compareTo(dicaMaterialUtil6) == 0) == dicaComoNaoTerDificuldade0.equals(dicaMaterialUtil6));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test055"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    boolean b4 = disciplina1.equals((java.lang.Object)10.0f);
    models.Tema tema5 = new models.Tema();
    boolean b7 = tema5.isAvaliado("");
    models.Tema tema8 = disciplina1.addTema(tema5);
    tema8.setId((java.lang.Long)1L);
    
    // Checks the contract:  equals-hashcode on tema5 and tema8
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on tema5 and tema8", tema5.equals(tema8) ? tema5.hashCode() == tema8.hashCode() : true);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test056"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    models.Usuario usuario9 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil12 = new models.DicaMaterialUtil("", usuario9, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade14 = new models.DicaComoNaoTerDificuldade("", usuario9, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    metaDica6.adicionaDica((models.IDica)dicaComoNaoTerDificuldade14);
    java.lang.String str16 = metaDica6.calculaIndiceConcordancia();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil12 and dicaComoNaoTerDificuldade14
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil12 and dicaComoNaoTerDificuldade14", (dicaMaterialUtil12.compareTo(dicaComoNaoTerDificuldade14) == 0) == dicaMaterialUtil12.equals(dicaComoNaoTerDificuldade14));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test057"); }

    models.DicaConselho dicaConselho2 = new models.DicaConselho();
    java.lang.String str3 = dicaConselho2.getCategoria();
    boolean b4 = dicaConselho2.isVotavel();
    java.lang.String str5 = dicaConselho2.getTipo();
    int i6 = dicaConselho2.getNumeroDiscordancia();
    dicaConselho2.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    models.Usuario usuario9 = new models.Usuario();
    usuario9.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia12 = new models.Concordancia(usuario9);
    java.lang.String str13 = usuario9.getLogin();
    dicaConselho2.setAutor(usuario9);
    models.DicaConselho dicaConselho16 = new models.DicaConselho("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario9, "models.DicaComoNaoTerDificuldade");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores19 = new models.DicaDisciplinasAnteriores("models.MetaDica", usuario9, "models.DicaDisciplinasAnteriores", "");
    
    // Checks the contract:  compareTo-equals on dicaConselho16 and dicaConselho2
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaConselho16 and dicaConselho2", (dicaConselho16.compareTo(dicaConselho2) == 0) == dicaConselho16.equals(dicaConselho2));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test058"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica7 = new models.MetaDica("hi!", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores();
    java.lang.String str9 = dicaDisciplinasAnteriores8.getCategoria();
    metaDica7.adicionaDica((models.IDica)dicaDisciplinasAnteriores8);
    models.Usuario usuario12 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil15 = new models.DicaMaterialUtil("", usuario12, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    boolean b16 = metaDica7.usuarioAtualVotouNestaDica(usuario12);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores8 and dicaMaterialUtil5
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores8 and dicaMaterialUtil5", (dicaDisciplinasAnteriores8.compareTo(dicaMaterialUtil5) == 0) == dicaDisciplinasAnteriores8.equals(dicaMaterialUtil5));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test059"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.lang.String str1 = dicaMaterialUtil0.getNomeURL();
    long long2 = dicaMaterialUtil0.getId();
    dicaMaterialUtil0.setNomeURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str5 = dicaMaterialUtil0.getTitulo();
    models.Disciplina disciplina7 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica8 = disciplina7.getMetadicas();
    disciplina7.setId((java.lang.Long)10L);
    models.Usuario usuario13 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil16 = new models.DicaMaterialUtil("", usuario13, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica18 = new models.MetaDica("hi!", usuario13, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina7.addMetaDica(metaDica18);
    java.lang.String str20 = metaDica18.getTipo();
    metaDica18.addDenuncia("hi!");
    metaDica18.setComentario("models.MetaDica");
    java.lang.String str25 = metaDica18.getComentario();
    java.lang.String str26 = metaDica18.getCategoria();
    models.Usuario usuario30 = new models.Usuario("", "models.DicaConselho", "Meta Dica");
    metaDica18.setAutor(usuario30);
    dicaMaterialUtil0.setAutor(usuario30);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil16 and metaDica18
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil16 and metaDica18", (dicaMaterialUtil16.compareTo(metaDica18) == 0) == dicaMaterialUtil16.equals(metaDica18));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test060"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    models.Usuario usuario9 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil12 = new models.DicaMaterialUtil("", usuario9, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade14 = new models.DicaComoNaoTerDificuldade("", usuario9, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    metaDica6.adicionaDica((models.IDica)dicaComoNaoTerDificuldade14);
    int i16 = dicaComoNaoTerDificuldade14.getNumeroDenuncias();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil12 and metaDica6
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil12 and metaDica6", (dicaMaterialUtil12.compareTo(metaDica6) == 0) == dicaMaterialUtil12.equals(metaDica6));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test061"); }

    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia8 = new models.Discordancia(usuario6, "");
    models.DicaMaterialUtil dicaMaterialUtil11 = new models.DicaMaterialUtil("models.MetaDica", usuario6, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    usuario6.setLogin("");
    models.Concordancia concordancia14 = new models.Concordancia(usuario6);
    models.Usuario usuario15 = concordancia14.getAutor();
    models.DicaMaterialUtil dicaMaterialUtil18 = new models.DicaMaterialUtil("", usuario15, "Conselho", "");
    models.Usuario usuario19 = dicaMaterialUtil18.getAutor();
    models.MetaDica metaDica21 = new models.MetaDica("Material \u00FAtil", usuario19, "models.DicaConselho");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil18 and dicaMaterialUtil11
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil18 and dicaMaterialUtil11", (dicaMaterialUtil18.compareTo(dicaMaterialUtil11) == 0) == dicaMaterialUtil18.equals(dicaMaterialUtil11));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test062"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    metaDica12.setComentario("models.MetaDica");
    java.lang.String str19 = metaDica12.getComentario();
    boolean b20 = metaDica12.isVisivel();
    metaDica12.setTitulo("models.DicaMaterialUtil");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade23 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str24 = dicaComoNaoTerDificuldade23.getCategoria();
    java.lang.String str25 = dicaComoNaoTerDificuldade23.getCategoria();
    metaDica12.adicionaDica((models.IDica)dicaComoNaoTerDificuldade23);
    boolean b27 = dicaComoNaoTerDificuldade23.isVotavel();
    
    // Checks the contract:  compareTo-equals on metaDica12 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica12 and dicaMaterialUtil10", (metaDica12.compareTo(dicaMaterialUtil10) == 0) == metaDica12.equals(dicaMaterialUtil10));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test063"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    disciplina1.setNome("models.DicaConselho");
    java.lang.String str8 = disciplina1.getNome();
    models.Disciplina disciplina10 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica11 = disciplina10.getMetadicas();
    disciplina10.setId((java.lang.Long)10L);
    models.Usuario usuario16 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil19 = new models.DicaMaterialUtil("", usuario16, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica21 = new models.MetaDica("hi!", usuario16, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina10.addMetaDica(metaDica21);
    java.lang.String str23 = metaDica21.getTipo();
    int i24 = metaDica21.getNumeroDicasNaMetaDica();
    disciplina1.addMetaDica(metaDica21);
    models.DicaMaterialUtil dicaMaterialUtil26 = new models.DicaMaterialUtil();
    java.lang.String str27 = dicaMaterialUtil26.getNomeURL();
    long long28 = dicaMaterialUtil26.getId();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores29 = new models.DicaDisciplinasAnteriores();
    java.lang.String str30 = dicaDisciplinasAnteriores29.getRazoesDisciplinas();
    models.Usuario usuario31 = null;
    models.Discordancia discordancia33 = new models.Discordancia(usuario31, "");
    models.Usuario usuario34 = null;
    discordancia33.setAutor(usuario34);
    int i36 = discordancia33.getId();
    dicaDisciplinasAnteriores29.adicionaDiscordancia(discordancia33);
    java.lang.String str38 = dicaDisciplinasAnteriores29.getTipo();
    java.lang.String str39 = dicaDisciplinasAnteriores29.getNomesDisciplinas();
    int i40 = dicaMaterialUtil26.compareTo((models.IDica)dicaDisciplinasAnteriores29);
    boolean b41 = disciplina1.equals((java.lang.Object)i40);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores29 and dicaMaterialUtil19
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores29 and dicaMaterialUtil19", (dicaDisciplinasAnteriores29.compareTo(dicaMaterialUtil19) == 0) == dicaDisciplinasAnteriores29.equals(dicaMaterialUtil19));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test064"); }

    models.Disciplina disciplina2 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica3 = disciplina2.getMetadicas();
    disciplina2.setId((java.lang.Long)10L);
    models.Usuario usuario8 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil11 = new models.DicaMaterialUtil("", usuario8, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica13 = new models.MetaDica("hi!", usuario8, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina2.addMetaDica(metaDica13);
    java.lang.String str15 = metaDica13.getTipo();
    int i16 = metaDica13.getNumeroDicasNaMetaDica();
    models.Usuario usuario17 = metaDica13.getAutor();
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade19 = new models.DicaComoNaoTerDificuldade("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario17, "");
    
    // Checks the contract:  compareTo-equals on metaDica13 and dicaMaterialUtil11
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica13 and dicaMaterialUtil11", (metaDica13.compareTo(dicaMaterialUtil11) == 0) == metaDica13.equals(dicaMaterialUtil11));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test065"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    metaDica12.setComentario("models.MetaDica");
    long long19 = metaDica12.getId();
    models.MetaDica metaDica20 = new models.MetaDica();
    java.lang.String str21 = metaDica20.calculaIndiceConcordancia();
    metaDica20.addDenuncia("Meta Dica");
    models.Usuario usuario24 = null;
    models.Discordancia discordancia26 = new models.Discordancia(usuario24, "");
    int i27 = discordancia26.getId();
    metaDica20.adicionaDiscordancia(discordancia26);
    java.lang.String str29 = discordancia26.getRazaoDiscordancia();
    metaDica12.adicionaDiscordancia(discordancia26);
    
    // Checks the contract:  compareTo-equals on metaDica20 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica20 and dicaMaterialUtil10", (metaDica20.compareTo(dicaMaterialUtil10) == 0) == metaDica20.equals(dicaMaterialUtil10));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test066"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica7 = new models.MetaDica("hi!", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores();
    java.lang.String str9 = dicaDisciplinasAnteriores8.getCategoria();
    metaDica7.adicionaDica((models.IDica)dicaDisciplinasAnteriores8);
    int i11 = dicaDisciplinasAnteriores8.getNumeroDenuncias();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil5 and metaDica7
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil5 and metaDica7", (dicaMaterialUtil5.compareTo(metaDica7) == 0) == dicaMaterialUtil5.equals(metaDica7));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test067"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    models.Usuario usuario14 = metaDica12.getAutor();
    int i15 = usuario14.getId();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil10 and metaDica12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil10 and metaDica12", (dicaMaterialUtil10.compareTo(metaDica12) == 0) == dicaMaterialUtil10.equals(metaDica12));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test068"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    models.Tema tema8 = new models.Tema("");
    double d9 = tema8.getMedia();
    java.util.List<models.IDica> list_iDica10 = tema8.getDicas();
    tema8.ordenarTopConcordancias();
    models.Disciplina disciplina13 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica14 = disciplina13.getMetadicas();
    disciplina13.setId((java.lang.Long)10L);
    models.Usuario usuario19 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil22 = new models.DicaMaterialUtil("", usuario19, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica24 = new models.MetaDica("hi!", usuario19, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina13.addMetaDica(metaDica24);
    java.lang.String str26 = metaDica24.getTipo();
    metaDica24.addDenuncia("hi!");
    metaDica24.setComentario("models.MetaDica");
    long long31 = metaDica24.getId();
    models.Usuario usuario32 = metaDica24.getAutor();
    java.util.List<models.IDica> list_iDica33 = metaDica24.getListaDicas();
    boolean b34 = tema8.equals((java.lang.Object)metaDica24);
    metaDica6.adicionaDica((models.IDica)metaDica24);
    int i36 = metaDica24.getNumeroDenuncias();
    
    // Checks the contract:  compareTo-equals on metaDica6 and dicaMaterialUtil22
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica6 and dicaMaterialUtil22", (metaDica6.compareTo(dicaMaterialUtil22) == 0) == metaDica6.equals(dicaMaterialUtil22));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test069"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    int i5 = disciplina1.getNumeroMetaDicas();
    disciplina1.setNome("models.DicaMaterialUtil");
    java.lang.String str8 = disciplina1.getNome();
    models.MetaDica metaDica9 = new models.MetaDica();
    models.Discordancia discordancia10 = new models.Discordancia();
    metaDica9.adicionaDiscordancia(discordancia10);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade12 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str13 = dicaComoNaoTerDificuldade12.getCategoria();
    metaDica9.adicionaDica((models.IDica)dicaComoNaoTerDificuldade12);
    java.lang.String str15 = dicaComoNaoTerDificuldade12.getTipo();
    dicaComoNaoTerDificuldade12.setNomeAssunto("hi!");
    dicaComoNaoTerDificuldade12.setNomeAssunto("hi!");
    boolean b20 = disciplina1.equals((java.lang.Object)"hi!");
    
    // Checks the contract:  compareTo-equals on metaDica9 and dicaComoNaoTerDificuldade12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica9 and dicaComoNaoTerDificuldade12", (metaDica9.compareTo(dicaComoNaoTerDificuldade12) == 0) == metaDica9.equals(dicaComoNaoTerDificuldade12));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test070"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaConselho dicaConselho7 = new models.DicaConselho("models.DicaDisciplinasAnteriores", usuario2, "models.DicaConselho");
    usuario2.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil5 and dicaConselho7
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil5 and dicaConselho7", (dicaMaterialUtil5.compareTo(dicaConselho7) == 0) == dicaMaterialUtil5.equals(dicaConselho7));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test071"); }

    models.Disciplina disciplina2 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica3 = disciplina2.getMetadicas();
    disciplina2.setId((java.lang.Long)10L);
    models.Usuario usuario8 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil11 = new models.DicaMaterialUtil("", usuario8, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica13 = new models.MetaDica("hi!", usuario8, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina2.addMetaDica(metaDica13);
    models.Usuario usuario15 = metaDica13.getAutor();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores18 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario15, "0", "0");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil11 and metaDica13
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil11 and metaDica13", (dicaMaterialUtil11.compareTo(metaDica13) == 0) == dicaMaterialUtil11.equals(metaDica13));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test072"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    int i5 = disciplina1.getNumeroMetaDicas();
    java.util.List<models.Tema> list_tema6 = disciplina1.getTemas();
    models.Usuario usuario12 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia14 = new models.Discordancia(usuario12, "");
    models.DicaMaterialUtil dicaMaterialUtil17 = new models.DicaMaterialUtil("models.MetaDica", usuario12, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    usuario12.setLogin("");
    models.Concordancia concordancia20 = new models.Concordancia(usuario12);
    models.MetaDica metaDica22 = new models.MetaDica("models.DicaMaterialUtil", usuario12, "models.DicaMaterialUtil");
    boolean b23 = disciplina1.equals((java.lang.Object)"models.DicaMaterialUtil");
    
    // Checks the contract:  compareTo-equals on metaDica22 and dicaMaterialUtil17
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica22 and dicaMaterialUtil17", (metaDica22.compareTo(dicaMaterialUtil17) == 0) == metaDica22.equals(dicaMaterialUtil17));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test073"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    metaDica12.setComentario("models.MetaDica");
    long long19 = metaDica12.getId();
    models.Usuario usuario20 = metaDica12.getAutor();
    models.Disciplina disciplina21 = new models.Disciplina();
    int i22 = disciplina21.getNumeroMetaDicasVisiveis();
    boolean b23 = usuario20.equals((java.lang.Object)i22);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil10 and metaDica12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil10 and metaDica12", (dicaMaterialUtil10.compareTo(metaDica12) == 0) == dicaMaterialUtil10.equals(metaDica12));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test074"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario4.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("0,0", usuario4, "hi!", "models.DicaDisciplinasAnteriores");
    models.Discordancia discordancia11 = new models.Discordancia(usuario4, "models.DicaComoNaoTerDificuldade");
    models.Usuario usuario13 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil16 = new models.DicaMaterialUtil("", usuario13, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia17 = new models.Concordancia(usuario13);
    models.Usuario usuario18 = concordancia17.getAutor();
    discordancia11.setAutor(usuario18);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil9 and dicaMaterialUtil16
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil9 and dicaMaterialUtil16", (dicaMaterialUtil9.compareTo(dicaMaterialUtil16) == 0) == dicaMaterialUtil9.equals(dicaMaterialUtil16));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test075"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    double d7 = tema6.getMedia();
    int i8 = tema6.getNumeroDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    models.Disciplina disciplina11 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica12 = disciplina11.getMetadicas();
    disciplina11.setId((java.lang.Long)10L);
    models.Usuario usuario17 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil20 = new models.DicaMaterialUtil("", usuario17, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica22 = new models.MetaDica("hi!", usuario17, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina11.addMetaDica(metaDica22);
    java.lang.String str24 = metaDica22.getTipo();
    java.lang.String str25 = metaDica22.getTitulo();
    disciplina1.addMetaDica(metaDica22);
    models.Disciplina disciplina28 = new models.Disciplina("models.MetaDica");
    java.lang.String str29 = disciplina28.getNome();
    disciplina28.setId((java.lang.Long)100L);
    java.lang.String str32 = disciplina28.getNome();
    java.lang.Long long33 = disciplina28.getId();
    java.lang.String str34 = disciplina28.getNome();
    models.Disciplina disciplina36 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica37 = disciplina36.getMetadicas();
    disciplina36.setId((java.lang.Long)1L);
    models.Tema tema41 = new models.Tema("");
    double d42 = tema41.getMedia();
    int i43 = tema41.getNumeroDicas();
    models.Tema tema44 = disciplina36.addTema(tema41);
    tema41.setId((java.lang.Long)0L);
    models.Tema tema47 = disciplina28.addTema(tema41);
    models.Tema tema48 = disciplina1.addTema(tema47);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil20 and metaDica22
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil20 and metaDica22", (dicaMaterialUtil20.compareTo(metaDica22) == 0) == dicaMaterialUtil20.equals(metaDica22));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test076"); }

    models.Disciplina disciplina0 = new models.Disciplina();
    java.lang.String str1 = disciplina0.getNome();
    models.Disciplina disciplina3 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica4 = disciplina3.getMetadicas();
    disciplina3.setId((java.lang.Long)10L);
    int i7 = disciplina3.getNumeroMetaDicas();
    disciplina3.setNome("models.DicaMaterialUtil");
    models.Disciplina disciplina11 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica12 = disciplina11.getMetadicas();
    disciplina11.setId((java.lang.Long)10L);
    models.Usuario usuario17 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil20 = new models.DicaMaterialUtil("", usuario17, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica22 = new models.MetaDica("hi!", usuario17, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina11.addMetaDica(metaDica22);
    java.lang.String str24 = metaDica22.getTipo();
    metaDica22.addDenuncia("hi!");
    metaDica22.setComentario("models.MetaDica");
    java.lang.String str29 = metaDica22.getComentario();
    boolean b30 = metaDica22.isVisivel();
    disciplina3.addMetaDica(metaDica22);
    boolean b33 = metaDica22.recebeuDenunciaDe("0,0");
    disciplina0.addMetaDica(metaDica22);
    
    // This assertion (transitivity of equals) fails 
    org.junit.Assert.assertTrue("Contract failed: equals-transitive on disciplina0, disciplina11, and disciplina11.", !(disciplina0.equals(disciplina11) && disciplina11.equals(disciplina11)) || disciplina0.equals(disciplina11));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test077"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    boolean b2 = dicaDisciplinasAnteriores0.isVotavel();
    java.lang.String str3 = dicaDisciplinasAnteriores0.getCategoria();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores4 = new models.DicaDisciplinasAnteriores();
    java.lang.String str5 = dicaDisciplinasAnteriores4.getRazoesDisciplinas();
    models.Usuario usuario6 = null;
    models.Discordancia discordancia8 = new models.Discordancia(usuario6, "");
    models.Usuario usuario9 = null;
    discordancia8.setAutor(usuario9);
    int i11 = discordancia8.getId();
    dicaDisciplinasAnteriores4.adicionaDiscordancia(discordancia8);
    dicaDisciplinasAnteriores0.adicionaDiscordancia(discordancia8);
    models.Usuario usuario14 = discordancia8.getAutor();
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores0 and dicaDisciplinasAnteriores4
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores0 and dicaDisciplinasAnteriores4", (dicaDisciplinasAnteriores0.compareTo(dicaDisciplinasAnteriores4) == 0) == dicaDisciplinasAnteriores0.equals(dicaDisciplinasAnteriores4));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test078"); }

    models.Usuario usuario6 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario6.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil11 = new models.DicaMaterialUtil("0,0", usuario6, "hi!", "models.DicaDisciplinasAnteriores");
    models.Discordancia discordancia13 = new models.Discordancia(usuario6, "models.DicaComoNaoTerDificuldade");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade15 = new models.DicaComoNaoTerDificuldade("Conselho", usuario6, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    models.DicaMaterialUtil dicaMaterialUtil18 = new models.DicaMaterialUtil("0", usuario6, "Conselho", "models.DicaComoNaoTerDificuldade");
    
    // Checks the contract:  compareTo-equals on dicaComoNaoTerDificuldade15 and dicaMaterialUtil11
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaComoNaoTerDificuldade15 and dicaMaterialUtil11", (dicaComoNaoTerDificuldade15.compareTo(dicaMaterialUtil11) == 0) == dicaComoNaoTerDificuldade15.equals(dicaMaterialUtil11));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test079"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.MetaDica metaDica8 = new models.MetaDica("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario5, "models.DicaMaterialUtil");
    java.lang.String str9 = metaDica8.getComentario();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores10 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario11 = dicaDisciplinasAnteriores10.getListaUsuariosQueVotaram();
    java.lang.String str12 = dicaDisciplinasAnteriores10.getTitulo();
    dicaDisciplinasAnteriores10.setRazoesDisciplinas("models.DicaComoNaoTerDificuldade");
    metaDica8.adicionaDica((models.IDica)dicaDisciplinasAnteriores10);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores16 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario17 = dicaDisciplinasAnteriores16.getListaUsuariosQueVotaram();
    models.Usuario usuario21 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores16.setAutor(usuario21);
    java.util.Set<models.Usuario> set_usuario23 = dicaDisciplinasAnteriores16.getListaUsuariosQueVotaram();
    int i24 = dicaDisciplinasAnteriores10.compareTo((models.IDica)dicaDisciplinasAnteriores16);
    
    // Checks the contract:  compareTo-equals on dicaComoNaoTerDificuldade1 and metaDica8
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaComoNaoTerDificuldade1 and metaDica8", (dicaComoNaoTerDificuldade1.compareTo(metaDica8) == 0) == dicaComoNaoTerDificuldade1.equals(metaDica8));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test080"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    int i15 = metaDica12.getNumeroDicasNaMetaDica();
    models.IDica iDica16 = null;
    metaDica12.adicionaDica(iDica16);
    metaDica12.setId((long)(byte)-1);
    models.Disciplina disciplina21 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica22 = disciplina21.getMetadicas();
    disciplina21.setId((java.lang.Long)10L);
    models.Usuario usuario27 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil30 = new models.DicaMaterialUtil("", usuario27, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica32 = new models.MetaDica("hi!", usuario27, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina21.addMetaDica(metaDica32);
    models.Usuario usuario34 = metaDica32.getAutor();
    metaDica12.setAutor(usuario34);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil30 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil30 and dicaMaterialUtil10", (dicaMaterialUtil30.compareTo(dicaMaterialUtil10) == 0) == dicaMaterialUtil30.equals(dicaMaterialUtil10));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test081"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    boolean b4 = disciplina1.equals((java.lang.Object)10.0f);
    disciplina1.setId((java.lang.Long)100L);
    java.util.List<models.Tema> list_tema7 = disciplina1.getTemas();
    java.lang.String str8 = disciplina1.getNome();
    models.MetaDica metaDica9 = new models.MetaDica();
    models.Discordancia discordancia10 = new models.Discordancia();
    metaDica9.adicionaDiscordancia(discordancia10);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade12 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str13 = dicaComoNaoTerDificuldade12.getCategoria();
    metaDica9.adicionaDica((models.IDica)dicaComoNaoTerDificuldade12);
    boolean b15 = metaDica9.isVisivel();
    boolean b16 = disciplina1.equals((java.lang.Object)metaDica9);
    models.Usuario usuario19 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil22 = new models.DicaMaterialUtil("", usuario19, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica24 = new models.MetaDica("hi!", usuario19, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    metaDica9.adicionaDica((models.IDica)metaDica24);
    
    // Checks the contract:  compareTo-equals on dicaComoNaoTerDificuldade12 and dicaMaterialUtil22
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaComoNaoTerDificuldade12 and dicaMaterialUtil22", (dicaComoNaoTerDificuldade12.compareTo(dicaMaterialUtil22) == 0) == dicaComoNaoTerDificuldade12.equals(dicaMaterialUtil22));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test082"); }

    models.Usuario usuario1 = new models.Usuario();
    java.lang.String str2 = usuario1.getNome();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario1, "Conselho", "models.DicaComoNaoTerDificuldade");
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = usuario1.checaSenha("models.DicaComoNaoTerDificuldade");

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test083"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    dicaMaterialUtil0.setId((long)(short)100);
    models.Usuario usuario3 = new models.Usuario();
    dicaMaterialUtil0.setAutor(usuario3);
    int i5 = usuario3.getId();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b7 = usuario3.checaSenha("models.DicaDisciplinasAnteriores");

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test084"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    boolean b4 = disciplina1.equals((java.lang.Object)10.0f);
    models.Tema tema5 = new models.Tema();
    boolean b7 = tema5.isAvaliado("");
    models.Tema tema8 = disciplina1.addTema(tema5);
    java.lang.String str9 = tema8.getNome();
    
    // Checks the contract:  equals-hashcode on tema8 and tema8
    org.junit.Assert.assertTrue("Contract failed: equals-hashcode on tema8 and tema8", tema8.equals(tema8) ? tema8.hashCode() == tema8.hashCode() : true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test085"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    boolean b6 = metaDica0.isVisivel();
    models.DicaMaterialUtil dicaMaterialUtil7 = new models.DicaMaterialUtil();
    dicaMaterialUtil7.setId((long)(short)100);
    int i10 = metaDica0.compareTo((models.IDica)dicaMaterialUtil7);
    java.util.List<models.Concordancia> list_concordancia11 = dicaMaterialUtil7.getListaConcordancia();
    
    // Checks the contract:  compareTo-equals on metaDica0 and dicaComoNaoTerDificuldade3
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica0 and dicaComoNaoTerDificuldade3", (metaDica0.compareTo(dicaComoNaoTerDificuldade3) == 0) == metaDica0.equals(dicaComoNaoTerDificuldade3));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test086"); }

    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    usuario5.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho11 = new models.DicaConselho("", usuario5, "models.DicaConselho");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade13 = new models.DicaComoNaoTerDificuldade("Meta Dica", usuario5, "models.DicaComoNaoTerDificuldade");
    java.lang.String str14 = usuario5.getLogin();
    
    // Checks the contract:  compareTo-equals on dicaConselho11 and dicaComoNaoTerDificuldade13
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaConselho11 and dicaComoNaoTerDificuldade13", (dicaConselho11.compareTo(dicaComoNaoTerDificuldade13) == 0) == dicaConselho11.equals(dicaComoNaoTerDificuldade13));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test087"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    models.DicaMaterialUtil dicaMaterialUtil17 = new models.DicaMaterialUtil();
    boolean b18 = dicaMaterialUtil17.isVotavel();
    boolean b19 = dicaMaterialUtil17.isVotavel();
    dicaMaterialUtil17.setNomeURL("hi!");
    dicaMaterialUtil17.setDominioURL("models.DicaComoNaoTerDificuldade");
    models.Usuario usuario24 = null;
    models.Discordancia discordancia26 = new models.Discordancia(usuario24, "");
    models.Usuario usuario27 = null;
    discordancia26.setAutor(usuario27);
    int i29 = discordancia26.getId();
    java.lang.String str30 = discordancia26.getRazaoDiscordancia();
    dicaMaterialUtil17.adicionaDiscordancia(discordancia26);
    metaDica12.adicionaDiscordancia(discordancia26);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil17 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil17 and dicaMaterialUtil10", (dicaMaterialUtil17.compareTo(dicaMaterialUtil10) == 0) == dicaMaterialUtil17.equals(dicaMaterialUtil10));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test088"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    usuario4.setNome("models.DicaMaterialUtil");
    usuario4.setLogin("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    usuario4.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores13 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia14 = dicaDisciplinasAnteriores13.getListaDiscordancia();
    java.lang.String str15 = dicaDisciplinasAnteriores13.getNomesDisciplinas();
    dicaDisciplinasAnteriores13.setId((long)'#');
    boolean b18 = usuario4.equals((java.lang.Object)'#');
    
    // Checks the contract:  compareTo-equals on metaDica6 and dicaDisciplinasAnteriores13
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica6 and dicaDisciplinasAnteriores13", (metaDica6.compareTo(dicaDisciplinasAnteriores13) == 0) == metaDica6.equals(dicaDisciplinasAnteriores13));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test089"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    metaDica12.setComentario("models.MetaDica");
    java.lang.String str19 = metaDica12.getComentario();
    java.lang.String str20 = metaDica12.getCategoria();
    models.Usuario usuario24 = new models.Usuario("", "models.DicaConselho", "Meta Dica");
    metaDica12.setAutor(usuario24);
    usuario24.setNome("models.DicaConselho");
    
    // Checks the contract:  compareTo-equals on metaDica12 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica12 and dicaMaterialUtil10", (metaDica12.compareTo(dicaMaterialUtil10) == 0) == metaDica12.equals(dicaMaterialUtil10));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test090"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    metaDica12.setComentario("models.MetaDica");
    java.lang.String str19 = metaDica12.getComentario();
    models.Usuario usuario21 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil24 = new models.DicaMaterialUtil("", usuario21, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia25 = new models.Concordancia(usuario21);
    usuario21.setSenha("0,0");
    metaDica12.setAutor(usuario21);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil10 and dicaMaterialUtil24
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil10 and dicaMaterialUtil24", (dicaMaterialUtil10.compareTo(dicaMaterialUtil24) == 0) == dicaMaterialUtil10.equals(dicaMaterialUtil24));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test091"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    int i7 = metaDica6.getNumeroDicasNaMetaDica();
    java.lang.String str8 = metaDica6.getComentario();
    models.Usuario usuario13 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia15 = new models.Discordancia(usuario13, "");
    usuario13.setNome("Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores20 = new models.DicaDisciplinasAnteriores("", usuario13, "0,0", "hi!");
    usuario13.setLogin("");
    models.Concordancia concordancia23 = new models.Concordancia(usuario13);
    metaDica6.adicionaConcordancia(concordancia23);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade25 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario29 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade25.setAutor(usuario29);
    concordancia23.setAutor(usuario29);
    
    // Checks the contract:  compareTo-equals on dicaComoNaoTerDificuldade25 and dicaDisciplinasAnteriores20
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaComoNaoTerDificuldade25 and dicaDisciplinasAnteriores20", (dicaComoNaoTerDificuldade25.compareTo(dicaDisciplinasAnteriores20) == 0) == dicaComoNaoTerDificuldade25.equals(dicaDisciplinasAnteriores20));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test092"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i4 = tema1.getAvaliacoes();
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade6 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario10 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade6.setAutor(usuario10);
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil("models.DicaDisciplinasAnteriores", usuario10, "Meta Dica", "models.MetaDica");
    java.lang.String str15 = dicaMaterialUtil14.getTipo();
    boolean b16 = tema1.equals((java.lang.Object)str15);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil14 and dicaComoNaoTerDificuldade6
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil14 and dicaComoNaoTerDificuldade6", (dicaMaterialUtil14.compareTo(dicaComoNaoTerDificuldade6) == 0) == dicaMaterialUtil14.equals(dicaComoNaoTerDificuldade6));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test093"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    models.Usuario usuario14 = metaDica12.getAutor();
    java.lang.String str15 = usuario14.getLogin();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil10 and metaDica12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil10 and metaDica12", (dicaMaterialUtil10.compareTo(metaDica12) == 0) == dicaMaterialUtil10.equals(metaDica12));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test094"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    int i7 = metaDica6.getNumeroDicasNaMetaDica();
    java.lang.String str8 = metaDica6.getComentario();
    models.Usuario usuario13 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia15 = new models.Discordancia(usuario13, "");
    usuario13.setNome("Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores20 = new models.DicaDisciplinasAnteriores("", usuario13, "0,0", "hi!");
    usuario13.setLogin("");
    models.Concordancia concordancia23 = new models.Concordancia(usuario13);
    metaDica6.adicionaConcordancia(concordancia23);
    models.Disciplina disciplina26 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica27 = disciplina26.getMetadicas();
    disciplina26.setId((java.lang.Long)10L);
    models.Usuario usuario32 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil35 = new models.DicaMaterialUtil("", usuario32, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica37 = new models.MetaDica("hi!", usuario32, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina26.addMetaDica(metaDica37);
    java.lang.String str39 = metaDica37.getTipo();
    metaDica37.addDenuncia("hi!");
    metaDica37.setComentario("models.MetaDica");
    int i44 = metaDica37.getNumeroDenuncias();
    models.Usuario usuario45 = null;
    models.Discordancia discordancia47 = new models.Discordancia(usuario45, "hi!");
    discordancia47.setRazaoDiscordancia("");
    int i50 = discordancia47.getId();
    discordancia47.setRazaoDiscordancia("");
    int i53 = discordancia47.getId();
    java.lang.String str54 = discordancia47.getRazaoDiscordancia();
    metaDica37.adicionaDiscordancia(discordancia47);
    metaDica6.adicionaDiscordancia(discordancia47);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores20 and dicaMaterialUtil35
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores20 and dicaMaterialUtil35", (dicaDisciplinasAnteriores20.compareTo(dicaMaterialUtil35) == 0) == dicaDisciplinasAnteriores20.equals(dicaMaterialUtil35));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test095"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores1 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario2 = dicaDisciplinasAnteriores1.getListaUsuariosQueVotaram();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores1.setAutor(usuario6);
    java.lang.String str8 = usuario6.getLogin();
    usuario6.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    models.DicaConselho dicaConselho12 = new models.DicaConselho("Material \u00FAtil", usuario6, "");
    boolean b14 = usuario6.checaSenha("models.DicaComoNaoTerDificuldade");
    
    // Checks the contract:  compareTo-equals on dicaConselho12 and dicaDisciplinasAnteriores1
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaConselho12 and dicaDisciplinasAnteriores1", (dicaConselho12.compareTo(dicaDisciplinasAnteriores1) == 0) == dicaConselho12.equals(dicaDisciplinasAnteriores1));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test096"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores5 = new models.DicaDisciplinasAnteriores("models.MetaDica", usuario2, "Meta Dica", "Meta Dica");
    models.MetaDica metaDica7 = new models.MetaDica("hi!", usuario2, "");
    models.Disciplina disciplina9 = new models.Disciplina("hi!");
    int i10 = disciplina9.getNumeroMetaDicas();
    boolean b12 = disciplina9.equals((java.lang.Object)10.0f);
    disciplina9.setId((java.lang.Long)100L);
    java.util.List<models.Tema> list_tema15 = disciplina9.getTemas();
    java.lang.String str16 = disciplina9.getNome();
    models.MetaDica metaDica17 = new models.MetaDica();
    models.Discordancia discordancia18 = new models.Discordancia();
    metaDica17.adicionaDiscordancia(discordancia18);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade20 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str21 = dicaComoNaoTerDificuldade20.getCategoria();
    metaDica17.adicionaDica((models.IDica)dicaComoNaoTerDificuldade20);
    boolean b23 = metaDica17.isVisivel();
    boolean b24 = disciplina9.equals((java.lang.Object)metaDica17);
    metaDica7.adicionaDica((models.IDica)metaDica17);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores5 and dicaComoNaoTerDificuldade20
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores5 and dicaComoNaoTerDificuldade20", (dicaDisciplinasAnteriores5.compareTo(dicaComoNaoTerDificuldade20) == 0) == dicaDisciplinasAnteriores5.equals(dicaComoNaoTerDificuldade20));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test097"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    models.Usuario usuario9 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil12 = new models.DicaMaterialUtil("", usuario9, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade14 = new models.DicaComoNaoTerDificuldade("", usuario9, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    metaDica6.adicionaDica((models.IDica)dicaComoNaoTerDificuldade14);
    int i16 = metaDica6.getNumeroDicasNaMetaDica();
    
    // Checks the contract:  compareTo-equals on dicaComoNaoTerDificuldade14 and dicaMaterialUtil12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaComoNaoTerDificuldade14 and dicaMaterialUtil12", (dicaComoNaoTerDificuldade14.compareTo(dicaMaterialUtil12) == 0) == dicaComoNaoTerDificuldade14.equals(dicaMaterialUtil12));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test098"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    models.Tema tema8 = new models.Tema("");
    double d9 = tema8.getMedia();
    java.util.List<models.IDica> list_iDica10 = tema8.getDicas();
    tema8.ordenarTopConcordancias();
    models.Disciplina disciplina13 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica14 = disciplina13.getMetadicas();
    disciplina13.setId((java.lang.Long)10L);
    models.Usuario usuario19 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil22 = new models.DicaMaterialUtil("", usuario19, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica24 = new models.MetaDica("hi!", usuario19, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina13.addMetaDica(metaDica24);
    java.lang.String str26 = metaDica24.getTipo();
    metaDica24.addDenuncia("hi!");
    metaDica24.setComentario("models.MetaDica");
    long long31 = metaDica24.getId();
    models.Usuario usuario32 = metaDica24.getAutor();
    java.util.List<models.IDica> list_iDica33 = metaDica24.getListaDicas();
    boolean b34 = tema8.equals((java.lang.Object)metaDica24);
    metaDica6.adicionaDica((models.IDica)metaDica24);
    boolean b36 = metaDica6.isVotavel();
    
    // Checks the contract:  compareTo-equals on metaDica24 and dicaMaterialUtil22
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica24 and dicaMaterialUtil22", (metaDica24.compareTo(dicaMaterialUtil22) == 0) == metaDica24.equals(dicaMaterialUtil22));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test099"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica7 = new models.MetaDica("hi!", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores();
    java.lang.String str9 = dicaDisciplinasAnteriores8.getCategoria();
    metaDica7.adicionaDica((models.IDica)dicaDisciplinasAnteriores8);
    models.DicaMaterialUtil dicaMaterialUtil11 = new models.DicaMaterialUtil();
    dicaMaterialUtil11.setId((long)(short)100);
    dicaMaterialUtil11.setNomeURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str16 = dicaMaterialUtil11.getTitulo();
    metaDica7.adicionaDica((models.IDica)dicaMaterialUtil11);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores8 and dicaMaterialUtil5
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores8 and dicaMaterialUtil5", (dicaDisciplinasAnteriores8.compareTo(dicaMaterialUtil5) == 0) == dicaDisciplinasAnteriores8.equals(dicaMaterialUtil5));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test100"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    models.Usuario usuario9 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil12 = new models.DicaMaterialUtil("", usuario9, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade14 = new models.DicaComoNaoTerDificuldade("", usuario9, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    metaDica6.adicionaDica((models.IDica)dicaComoNaoTerDificuldade14);
    java.lang.String str16 = metaDica6.getComentario();
    
    // Checks the contract:  compareTo-equals on dicaComoNaoTerDificuldade14 and dicaMaterialUtil12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaComoNaoTerDificuldade14 and dicaMaterialUtil12", (dicaComoNaoTerDificuldade14.compareTo(dicaMaterialUtil12) == 0) == dicaComoNaoTerDificuldade14.equals(dicaMaterialUtil12));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test101"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    int i14 = disciplina1.getNumeroMetaDicasVisiveis();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil10 and metaDica12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil10 and metaDica12", (dicaMaterialUtil10.compareTo(metaDica12) == 0) == dicaMaterialUtil10.equals(metaDica12));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test102"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    usuario4.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho10 = new models.DicaConselho("", usuario4, "models.DicaConselho");
    java.lang.String str11 = dicaConselho10.getConselho();
    models.MetaDica metaDica12 = new models.MetaDica();
    java.lang.String str13 = metaDica12.calculaIndiceConcordancia();
    metaDica12.addDenuncia("Meta Dica");
    models.Usuario usuario16 = null;
    models.Discordancia discordancia18 = new models.Discordancia(usuario16, "");
    int i19 = discordancia18.getId();
    metaDica12.adicionaDiscordancia(discordancia18);
    dicaConselho10.adicionaDiscordancia(discordancia18);
    java.lang.String str22 = discordancia18.getRazaoDiscordancia();
    
    // Checks the contract:  compareTo-equals on metaDica12 and dicaConselho10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica12 and dicaConselho10", (metaDica12.compareTo(dicaConselho10) == 0) == metaDica12.equals(dicaConselho10));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test103"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Usuario usuario2 = null;
    models.Discordancia discordancia4 = new models.Discordancia(usuario2, "");
    models.Usuario usuario5 = null;
    discordancia4.setAutor(usuario5);
    int i7 = discordancia4.getId();
    dicaDisciplinasAnteriores0.adicionaDiscordancia(discordancia4);
    dicaDisciplinasAnteriores0.setNomesDisciplinas("");
    int i11 = dicaDisciplinasAnteriores0.getNumeroDenuncias();
    java.lang.String str12 = dicaDisciplinasAnteriores0.getTipo();
    models.Usuario usuario17 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario17.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil22 = new models.DicaMaterialUtil("0,0", usuario17, "hi!", "models.DicaDisciplinasAnteriores");
    usuario17.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    dicaDisciplinasAnteriores0.setAutor(usuario17);
    usuario17.setLogin("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil22 and dicaDisciplinasAnteriores0
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil22 and dicaDisciplinasAnteriores0", (dicaMaterialUtil22.compareTo(dicaDisciplinasAnteriores0) == 0) == dicaMaterialUtil22.equals(dicaDisciplinasAnteriores0));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test104"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    models.Concordancia concordancia9 = new models.Concordancia(usuario2);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores8 and dicaMaterialUtil5
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores8 and dicaMaterialUtil5", (dicaDisciplinasAnteriores8.compareTo(dicaMaterialUtil5) == 0) == dicaDisciplinasAnteriores8.equals(dicaMaterialUtil5));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test105"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.MetaDica metaDica8 = new models.MetaDica("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario5, "models.DicaMaterialUtil");
    usuario5.setLogin("Meta Dica");
    
    // Checks the contract:  compareTo-equals on dicaComoNaoTerDificuldade1 and metaDica8
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaComoNaoTerDificuldade1 and metaDica8", (dicaComoNaoTerDificuldade1.compareTo(metaDica8) == 0) == dicaComoNaoTerDificuldade1.equals(metaDica8));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test106"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    metaDica12.setComentario("models.MetaDica");
    java.lang.String str19 = metaDica12.getComentario();
    java.lang.String str20 = metaDica12.getTipo();
    models.DicaConselho dicaConselho21 = new models.DicaConselho();
    java.lang.String str22 = dicaConselho21.getCategoria();
    boolean b23 = dicaConselho21.isVotavel();
    dicaConselho21.setConselho("Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i26 = metaDica12.compareTo((models.IDica)dicaConselho21);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade27 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str28 = dicaComoNaoTerDificuldade27.getCategoria();
    java.lang.String str29 = dicaComoNaoTerDificuldade27.getCategoria();
    boolean b31 = dicaComoNaoTerDificuldade27.recebeuDenunciaDe("hi!");
    metaDica12.adicionaDica((models.IDica)dicaComoNaoTerDificuldade27);
    
    // Checks the contract:  compareTo-equals on dicaConselho21 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaConselho21 and dicaMaterialUtil10", (dicaConselho21.compareTo(dicaMaterialUtil10) == 0) == dicaConselho21.equals(dicaMaterialUtil10));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test107"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    models.MetaDica metaDica14 = new models.MetaDica();
    models.Discordancia discordancia15 = new models.Discordancia();
    metaDica14.adicionaDiscordancia(discordancia15);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade17 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str18 = dicaComoNaoTerDificuldade17.getCategoria();
    metaDica14.adicionaDica((models.IDica)dicaComoNaoTerDificuldade17);
    boolean b20 = metaDica14.isVisivel();
    java.lang.String str21 = metaDica14.getTipo();
    disciplina1.addMetaDica(metaDica14);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil10 and metaDica12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil10 and metaDica12", (dicaMaterialUtil10.compareTo(metaDica12) == 0) == dicaMaterialUtil10.equals(metaDica12));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test108"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    models.Disciplina disciplina5 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica6 = disciplina5.getMetadicas();
    disciplina5.setId((java.lang.Long)10L);
    models.Usuario usuario11 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil("", usuario11, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica16 = new models.MetaDica("hi!", usuario11, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina5.addMetaDica(metaDica16);
    java.lang.String str18 = metaDica16.getTipo();
    java.util.Set<models.Usuario> set_usuario19 = metaDica16.getListaUsuariosQueVotaram();
    disciplina1.addMetaDica(metaDica16);
    int i21 = disciplina1.getNumeroMetaDicasVisiveis();
    
    // Checks the contract:  compareTo-equals on metaDica16 and dicaMaterialUtil14
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica16 and dicaMaterialUtil14", (metaDica16.compareTo(dicaMaterialUtil14) == 0) == metaDica16.equals(dicaMaterialUtil14));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test109"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    usuario4.setNome("Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores11 = new models.DicaDisciplinasAnteriores("", usuario4, "0,0", "hi!");
    models.Usuario usuario16 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia18 = new models.Discordancia(usuario16, "");
    models.DicaMaterialUtil dicaMaterialUtil21 = new models.DicaMaterialUtil("models.MetaDica", usuario16, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    boolean b22 = dicaDisciplinasAnteriores11.usuarioAtualVotouNestaDica(usuario16);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores23 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia24 = dicaDisciplinasAnteriores23.getListaDiscordancia();
    java.lang.String str25 = dicaDisciplinasAnteriores23.getRazoesDisciplinas();
    boolean b26 = usuario16.equals((java.lang.Object)str25);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil21 and dicaDisciplinasAnteriores23
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil21 and dicaDisciplinasAnteriores23", (dicaMaterialUtil21.compareTo(dicaDisciplinasAnteriores23) == 0) == dicaMaterialUtil21.equals(dicaDisciplinasAnteriores23));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test110"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade7 = new models.DicaComoNaoTerDificuldade("", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    usuario2.setNome("models.DicaConselho");
    
    // Checks the contract:  compareTo-equals on dicaComoNaoTerDificuldade7 and dicaMaterialUtil5
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaComoNaoTerDificuldade7 and dicaMaterialUtil5", (dicaComoNaoTerDificuldade7.compareTo(dicaMaterialUtil5) == 0) == dicaComoNaoTerDificuldade7.equals(dicaMaterialUtil5));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test111"); }

    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    usuario5.setNome("Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores12 = new models.DicaDisciplinasAnteriores("", usuario5, "0,0", "hi!");
    models.MetaDica metaDica14 = new models.MetaDica("", usuario5, "0");
    models.Concordancia concordancia15 = new models.Concordancia(usuario5);
    
    // Checks the contract:  compareTo-equals on metaDica14 and dicaDisciplinasAnteriores12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica14 and dicaDisciplinasAnteriores12", (metaDica14.compareTo(dicaDisciplinasAnteriores12) == 0) == metaDica14.equals(dicaDisciplinasAnteriores12));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test112"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    java.lang.String str4 = disciplina1.getNome();
    java.util.List<models.MetaDica> list_metaDica5 = disciplina1.getMetadicas();
    models.Disciplina disciplina7 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica8 = disciplina7.getMetadicas();
    disciplina7.setId((java.lang.Long)10L);
    models.Usuario usuario13 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil16 = new models.DicaMaterialUtil("", usuario13, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica18 = new models.MetaDica("hi!", usuario13, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina7.addMetaDica(metaDica18);
    java.lang.String str20 = metaDica18.getTipo();
    metaDica18.addDenuncia("hi!");
    metaDica18.setComentario("models.MetaDica");
    java.lang.String str25 = metaDica18.getComentario();
    boolean b26 = metaDica18.isVisivel();
    metaDica18.setTitulo("models.DicaMaterialUtil");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade29 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str30 = dicaComoNaoTerDificuldade29.getCategoria();
    java.lang.String str31 = dicaComoNaoTerDificuldade29.getCategoria();
    metaDica18.adicionaDica((models.IDica)dicaComoNaoTerDificuldade29);
    disciplina1.addMetaDica(metaDica18);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil16 and dicaComoNaoTerDificuldade29
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil16 and dicaComoNaoTerDificuldade29", (dicaMaterialUtil16.compareTo(dicaComoNaoTerDificuldade29) == 0) == dicaMaterialUtil16.equals(dicaComoNaoTerDificuldade29));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test113"); }

    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia8 = new models.Discordancia(usuario6, "");
    models.DicaMaterialUtil dicaMaterialUtil11 = new models.DicaMaterialUtil("models.MetaDica", usuario6, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    usuario6.setLogin("");
    models.Concordancia concordancia14 = new models.Concordancia(usuario6);
    models.Usuario usuario15 = concordancia14.getAutor();
    models.DicaMaterialUtil dicaMaterialUtil18 = new models.DicaMaterialUtil("", usuario15, "Conselho", "");
    models.MetaDica metaDica20 = new models.MetaDica("Material \u00FAtil", usuario15, "Material \u00FAtil");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil18 and dicaMaterialUtil11
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil18 and dicaMaterialUtil11", (dicaMaterialUtil18.compareTo(dicaMaterialUtil11) == 0) == dicaMaterialUtil18.equals(dicaMaterialUtil11));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test114"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getCategoria();
    models.Usuario usuario7 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    usuario7.setNome("Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores14 = new models.DicaDisciplinasAnteriores("", usuario7, "0,0", "hi!");
    dicaComoNaoTerDificuldade0.setAutor(usuario7);
    java.lang.String str16 = usuario7.getNome();
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores14 and dicaComoNaoTerDificuldade0
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores14 and dicaComoNaoTerDificuldade0", (dicaDisciplinasAnteriores14.compareTo(dicaComoNaoTerDificuldade0) == 0) == dicaDisciplinasAnteriores14.equals(dicaComoNaoTerDificuldade0));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test115"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    models.Disciplina disciplina4 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica5 = disciplina4.getMetadicas();
    disciplina4.setId((java.lang.Long)1L);
    models.Tema tema9 = new models.Tema("");
    double d10 = tema9.getMedia();
    int i11 = tema9.getNumeroDicas();
    models.Tema tema12 = disciplina4.addTema(tema9);
    boolean b14 = tema9.isAvaliado("");
    java.lang.Long long15 = tema9.getId();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i16 = tema9.getAvaliacoes();
    models.Tema tema17 = disciplina1.addTema(tema9);
    int i18 = disciplina1.getNumeroMetaDicasVisiveis();
    models.Usuario usuario23 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica25 = new models.MetaDica("models.MetaDica", usuario23, "models.DicaConselho");
    models.Usuario usuario28 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil31 = new models.DicaMaterialUtil("", usuario28, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade33 = new models.DicaComoNaoTerDificuldade("", usuario28, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    metaDica25.adicionaDica((models.IDica)dicaComoNaoTerDificuldade33);
    disciplina1.addMetaDica(metaDica25);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil31 and dicaComoNaoTerDificuldade33
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil31 and dicaComoNaoTerDificuldade33", (dicaMaterialUtil31.compareTo(dicaComoNaoTerDificuldade33) == 0) == dicaMaterialUtil31.equals(dicaComoNaoTerDificuldade33));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test116"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia6 = new models.Concordancia(usuario2);
    models.DicaConselho dicaConselho8 = new models.DicaConselho("models.MetaDica", usuario2, "hi!");
    models.Usuario usuario10 = new models.Usuario();
    usuario10.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia13 = new models.Concordancia(usuario10);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores16 = new models.DicaDisciplinasAnteriores("", usuario10, "Meta Dica", "0,0");
    java.util.List<models.Concordancia> list_concordancia17 = dicaDisciplinasAnteriores16.getListaConcordancia();
    int i18 = dicaConselho8.compareTo((models.IDica)dicaDisciplinasAnteriores16);
    dicaConselho8.setConselho("Disciplinas anteriores que te ajudar\u00E3o aqui");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil5 and dicaDisciplinasAnteriores16
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil5 and dicaDisciplinasAnteriores16", (dicaMaterialUtil5.compareTo(dicaDisciplinasAnteriores16) == 0) == dicaMaterialUtil5.equals(dicaDisciplinasAnteriores16));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test117"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    models.Usuario usuario9 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil12 = new models.DicaMaterialUtil("", usuario9, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade14 = new models.DicaComoNaoTerDificuldade("", usuario9, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    metaDica6.adicionaDica((models.IDica)dicaComoNaoTerDificuldade14);
    models.Usuario usuario18 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil21 = new models.DicaMaterialUtil("", usuario18, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores24 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario18, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    java.util.List<models.Discordancia> list_discordancia25 = dicaDisciplinasAnteriores24.getListaDiscordancia();
    java.lang.String str26 = dicaDisciplinasAnteriores24.getNomesDisciplinas();
    metaDica6.adicionaDica((models.IDica)dicaDisciplinasAnteriores24);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil12 and dicaMaterialUtil21
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil12 and dicaMaterialUtil21", (dicaMaterialUtil12.compareTo(dicaMaterialUtil21) == 0) == dicaMaterialUtil12.equals(dicaMaterialUtil21));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test118"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaConselho dicaConselho7 = new models.DicaConselho("models.DicaDisciplinasAnteriores", usuario2, "models.DicaConselho");
    models.Discordancia discordancia9 = new models.Discordancia(usuario2, "models.DicaConselho");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil5 and dicaConselho7
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil5 and dicaConselho7", (dicaMaterialUtil5.compareTo(dicaConselho7) == 0) == dicaMaterialUtil5.equals(dicaConselho7));

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test119"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.MetaDica", usuario4, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    usuario4.setLogin("");
    models.Concordancia concordancia12 = new models.Concordancia(usuario4);
    models.Usuario usuario13 = concordancia12.getAutor();
    models.Disciplina disciplina15 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica16 = disciplina15.getMetadicas();
    disciplina15.setId((java.lang.Long)1L);
    models.Tema tema20 = new models.Tema("");
    double d21 = tema20.getMedia();
    int i22 = tema20.getNumeroDicas();
    models.Tema tema23 = disciplina15.addTema(tema20);
    boolean b25 = tema20.isAvaliado("");
    java.lang.Long long26 = tema20.getId();
    boolean b28 = tema20.equals((java.lang.Object)(short)10);
    models.DicaMaterialUtil dicaMaterialUtil29 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia30 = dicaMaterialUtil29.getListaDiscordancia();
    tema20.addDica((models.IDica)dicaMaterialUtil29);
    boolean b32 = usuario13.equals((java.lang.Object)tema20);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil9 and dicaMaterialUtil29
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil9 and dicaMaterialUtil29", (dicaMaterialUtil9.compareTo(dicaMaterialUtil29) == 0) == dicaMaterialUtil9.equals(dicaMaterialUtil29));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test120"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores1 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario2 = dicaDisciplinasAnteriores1.getListaUsuariosQueVotaram();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores1.setAutor(usuario6);
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("hi!", usuario6, "Conselho", "Conselho");
    models.Usuario usuario16 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia18 = new models.Discordancia(usuario16, "");
    usuario16.setNome("Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores23 = new models.DicaDisciplinasAnteriores("", usuario16, "0,0", "hi!");
    models.MetaDica metaDica25 = new models.MetaDica("", usuario16, "0");
    boolean b26 = dicaMaterialUtil10.usuarioAtualVotouNestaDica(usuario16);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores23 and metaDica25
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores23 and metaDica25", (dicaDisciplinasAnteriores23.compareTo(metaDica25) == 0) == dicaDisciplinasAnteriores23.equals(metaDica25));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test121"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    int i15 = metaDica12.getNumeroDicasNaMetaDica();
    models.Usuario usuario16 = metaDica12.getAutor();
    java.lang.String str17 = usuario16.getLogin();
    
    // Checks the contract:  compareTo-equals on metaDica12 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica12 and dicaMaterialUtil10", (metaDica12.compareTo(dicaMaterialUtil10) == 0) == metaDica12.equals(dicaMaterialUtil10));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test122"); }

    models.Usuario usuario0 = null;
    models.Concordancia concordancia1 = new models.Concordancia(usuario0);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade2 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str3 = dicaComoNaoTerDificuldade2.getCategoria();
    dicaComoNaoTerDificuldade2.setNomeAssunto("Meta Dica");
    java.lang.String str6 = dicaComoNaoTerDificuldade2.getCategoria();
    models.Usuario usuario11 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia13 = new models.Discordancia(usuario11, "");
    usuario11.setNome("Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores18 = new models.DicaDisciplinasAnteriores("", usuario11, "0,0", "hi!");
    boolean b19 = dicaComoNaoTerDificuldade2.usuarioAtualVotouNestaDica(usuario11);
    concordancia1.setAutor(usuario11);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores18 and dicaComoNaoTerDificuldade2
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores18 and dicaComoNaoTerDificuldade2", (dicaDisciplinasAnteriores18.compareTo(dicaComoNaoTerDificuldade2) == 0) == dicaDisciplinasAnteriores18.equals(dicaComoNaoTerDificuldade2));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test123"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Usuario usuario2 = null;
    models.Discordancia discordancia4 = new models.Discordancia(usuario2, "");
    models.Usuario usuario5 = null;
    discordancia4.setAutor(usuario5);
    int i7 = discordancia4.getId();
    dicaDisciplinasAnteriores0.adicionaDiscordancia(discordancia4);
    dicaDisciplinasAnteriores0.setNomesDisciplinas("");
    int i11 = dicaDisciplinasAnteriores0.getNumeroDenuncias();
    java.lang.String str12 = dicaDisciplinasAnteriores0.getTipo();
    models.Usuario usuario17 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario17.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil22 = new models.DicaMaterialUtil("0,0", usuario17, "hi!", "models.DicaDisciplinasAnteriores");
    usuario17.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    dicaDisciplinasAnteriores0.setAutor(usuario17);
    models.Usuario usuario28 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil31 = new models.DicaMaterialUtil("", usuario28, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores34 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario28, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    int i35 = dicaDisciplinasAnteriores0.compareTo((models.IDica)dicaDisciplinasAnteriores34);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil22 and dicaMaterialUtil31
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil22 and dicaMaterialUtil31", (dicaMaterialUtil22.compareTo(dicaMaterialUtil31) == 0) == dicaMaterialUtil22.equals(dicaMaterialUtil31));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test124"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.lang.String str3 = tema1.getNome();
    tema1.addAvaliacao("0", (java.lang.Integer)(-1));
    models.Usuario usuario9 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil12 = new models.DicaMaterialUtil("", usuario9, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores15 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario9, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    boolean b16 = tema1.equals((java.lang.Object)dicaDisciplinasAnteriores15);
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i17 = tema1.getAvaliacoes();
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores15 and dicaMaterialUtil12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores15 and dicaMaterialUtil12", (dicaDisciplinasAnteriores15.compareTo(dicaMaterialUtil12) == 0) == dicaDisciplinasAnteriores15.equals(dicaMaterialUtil12));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test125"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia6 = new models.Concordancia(usuario2);
    models.DicaConselho dicaConselho8 = new models.DicaConselho("models.MetaDica", usuario2, "hi!");
    java.lang.String str9 = usuario2.getNome();
    
    // Checks the contract:  compareTo-equals on dicaConselho8 and dicaMaterialUtil5
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaConselho8 and dicaMaterialUtil5", (dicaConselho8.compareTo(dicaMaterialUtil5) == 0) == dicaConselho8.equals(dicaMaterialUtil5));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test126"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    int i9 = dicaDisciplinasAnteriores8.getNumeroConcordancias();
    java.lang.String str10 = dicaDisciplinasAnteriores8.getTipo();
    models.Usuario usuario11 = null;
    models.Discordancia discordancia13 = new models.Discordancia(usuario11, "hi!");
    discordancia13.setRazaoDiscordancia("");
    int i16 = discordancia13.getId();
    discordancia13.setRazaoDiscordancia("");
    int i19 = discordancia13.getId();
    java.lang.String str20 = discordancia13.getRazaoDiscordancia();
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade21 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario25 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade21.setAutor(usuario25);
    usuario25.setNome("models.DicaMaterialUtil");
    discordancia13.setAutor(usuario25);
    dicaDisciplinasAnteriores8.setAutor(usuario25);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil5 and dicaComoNaoTerDificuldade21
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil5 and dicaComoNaoTerDificuldade21", (dicaMaterialUtil5.compareTo(dicaComoNaoTerDificuldade21) == 0) == dicaMaterialUtil5.equals(dicaComoNaoTerDificuldade21));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test127"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    models.Concordancia concordancia7 = new models.Concordancia(usuario4);
    boolean b9 = usuario4.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Usuario usuario12 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil15 = new models.DicaMaterialUtil("", usuario12, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica17 = new models.MetaDica("hi!", usuario12, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    boolean b18 = usuario4.equals((java.lang.Object)usuario12);
    
    // Checks the contract:  compareTo-equals on metaDica17 and metaDica6
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica17 and metaDica6", (metaDica17.compareTo(metaDica6) == 0) == metaDica17.equals(metaDica6));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test128"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    boolean b6 = metaDica0.isVisivel();
    models.DicaMaterialUtil dicaMaterialUtil7 = new models.DicaMaterialUtil();
    dicaMaterialUtil7.setId((long)(short)100);
    int i10 = metaDica0.compareTo((models.IDica)dicaMaterialUtil7);
    int i11 = metaDica0.getNumeroDicasNaMetaDica();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil7 and dicaComoNaoTerDificuldade3
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil7 and dicaComoNaoTerDificuldade3", (dicaMaterialUtil7.compareTo(dicaComoNaoTerDificuldade3) == 0) == dicaMaterialUtil7.equals(dicaComoNaoTerDificuldade3));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test129"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.lang.String str1 = dicaMaterialUtil0.getNomeURL();
    long long2 = dicaMaterialUtil0.getId();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores3 = new models.DicaDisciplinasAnteriores();
    java.lang.String str4 = dicaDisciplinasAnteriores3.getRazoesDisciplinas();
    models.Usuario usuario5 = null;
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    models.Usuario usuario8 = null;
    discordancia7.setAutor(usuario8);
    int i10 = discordancia7.getId();
    dicaDisciplinasAnteriores3.adicionaDiscordancia(discordancia7);
    java.lang.String str12 = dicaDisciplinasAnteriores3.getTipo();
    java.lang.String str13 = dicaDisciplinasAnteriores3.getNomesDisciplinas();
    int i14 = dicaMaterialUtil0.compareTo((models.IDica)dicaDisciplinasAnteriores3);
    java.lang.String str15 = dicaMaterialUtil0.getCategoria();
    dicaMaterialUtil0.setNomeURL("Material \u00FAtil");
    models.DicaMaterialUtil dicaMaterialUtil18 = new models.DicaMaterialUtil();
    boolean b19 = dicaMaterialUtil18.isVotavel();
    boolean b20 = dicaMaterialUtil18.isVotavel();
    dicaMaterialUtil18.setNomeURL("hi!");
    dicaMaterialUtil18.setDominioURL("models.DicaComoNaoTerDificuldade");
    models.Usuario usuario25 = null;
    models.Discordancia discordancia27 = new models.Discordancia(usuario25, "");
    models.Usuario usuario28 = null;
    discordancia27.setAutor(usuario28);
    int i30 = discordancia27.getId();
    java.lang.String str31 = discordancia27.getRazaoDiscordancia();
    dicaMaterialUtil18.adicionaDiscordancia(discordancia27);
    dicaMaterialUtil0.adicionaDiscordancia(discordancia27);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores3 and dicaMaterialUtil18
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores3 and dicaMaterialUtil18", (dicaDisciplinasAnteriores3.compareTo(dicaMaterialUtil18) == 0) == dicaDisciplinasAnteriores3.equals(dicaMaterialUtil18));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test130"); }

    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario5.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("0,0", usuario5, "hi!", "models.DicaDisciplinasAnteriores");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores13 = new models.DicaDisciplinasAnteriores("models.DicaConselho", usuario5, "hi!", "Meta Dica");
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil();
    java.lang.String str15 = dicaMaterialUtil14.getNomeURL();
    long long16 = dicaMaterialUtil14.getId();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores17 = new models.DicaDisciplinasAnteriores();
    java.lang.String str18 = dicaDisciplinasAnteriores17.getRazoesDisciplinas();
    models.Usuario usuario19 = null;
    models.Discordancia discordancia21 = new models.Discordancia(usuario19, "");
    models.Usuario usuario22 = null;
    discordancia21.setAutor(usuario22);
    int i24 = discordancia21.getId();
    dicaDisciplinasAnteriores17.adicionaDiscordancia(discordancia21);
    java.lang.String str26 = dicaDisciplinasAnteriores17.getTipo();
    java.lang.String str27 = dicaDisciplinasAnteriores17.getNomesDisciplinas();
    int i28 = dicaMaterialUtil14.compareTo((models.IDica)dicaDisciplinasAnteriores17);
    java.lang.String str29 = dicaMaterialUtil14.getCategoria();
    dicaMaterialUtil14.setNomeURL("Material \u00FAtil");
    boolean b32 = usuario5.equals((java.lang.Object)dicaMaterialUtil14);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores13 and dicaDisciplinasAnteriores17
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores13 and dicaDisciplinasAnteriores17", (dicaDisciplinasAnteriores13.compareTo(dicaDisciplinasAnteriores17) == 0) == dicaDisciplinasAnteriores13.equals(dicaDisciplinasAnteriores17));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test131"); }

    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("models.MetaDica", usuario5, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    usuario5.setLogin("");
    models.Concordancia concordancia13 = new models.Concordancia(usuario5);
    models.DicaConselho dicaConselho15 = new models.DicaConselho("", usuario5, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores16 = new models.DicaDisciplinasAnteriores();
    java.lang.String str17 = dicaDisciplinasAnteriores16.getRazoesDisciplinas();
    models.Usuario usuario18 = null;
    models.Discordancia discordancia20 = new models.Discordancia(usuario18, "");
    models.Usuario usuario21 = null;
    discordancia20.setAutor(usuario21);
    int i23 = discordancia20.getId();
    dicaDisciplinasAnteriores16.adicionaDiscordancia(discordancia20);
    java.lang.String str25 = dicaDisciplinasAnteriores16.getTipo();
    java.lang.String str26 = dicaDisciplinasAnteriores16.getNomesDisciplinas();
    java.lang.String str27 = dicaDisciplinasAnteriores16.getTipo();
    dicaDisciplinasAnteriores16.addDenuncia("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    int i30 = dicaDisciplinasAnteriores16.getNumeroConcordancias();
    models.Usuario usuario35 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia37 = new models.Discordancia(usuario35, "");
    models.DicaMaterialUtil dicaMaterialUtil40 = new models.DicaMaterialUtil("models.MetaDica", usuario35, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    usuario35.setLogin("");
    models.Concordancia concordancia43 = new models.Concordancia(usuario35);
    boolean b44 = dicaDisciplinasAnteriores16.usuarioAtualVotouNestaDica(usuario35);
    boolean b45 = usuario5.equals((java.lang.Object)b44);
    
    // Checks the contract:  compareTo-equals on dicaConselho15 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaConselho15 and dicaMaterialUtil10", (dicaConselho15.compareTo(dicaMaterialUtil10) == 0) == dicaConselho15.equals(dicaMaterialUtil10));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test132"); }

    models.Disciplina disciplina1 = new models.Disciplina("Meta Dica");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    int i3 = disciplina1.getNumeroMetaDicasVisiveis();
    disciplina1.setId((java.lang.Long)1L);
    disciplina1.setNome("models.DicaConselho");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade8 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str9 = dicaComoNaoTerDificuldade8.getNomeAssunto();
    int i10 = dicaComoNaoTerDificuldade8.getNumeroDenuncias();
    java.lang.String str11 = dicaComoNaoTerDificuldade8.getCategoria();
    dicaComoNaoTerDificuldade8.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    java.lang.String str14 = dicaComoNaoTerDificuldade8.getTipo();
    models.Usuario usuario18 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str19 = usuario18.getLogin();
    dicaComoNaoTerDificuldade8.setAutor(usuario18);
    usuario18.setSenha("models.DicaConselho");
    usuario18.setNome("0,0");
    boolean b25 = disciplina1.equals((java.lang.Object)usuario18);
    models.Disciplina disciplina27 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica28 = disciplina27.getMetadicas();
    disciplina27.setId((java.lang.Long)10L);
    models.Usuario usuario33 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil36 = new models.DicaMaterialUtil("", usuario33, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica38 = new models.MetaDica("hi!", usuario33, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina27.addMetaDica(metaDica38);
    java.lang.String str40 = metaDica38.getTipo();
    metaDica38.addDenuncia("hi!");
    metaDica38.setComentario("models.MetaDica");
    long long45 = metaDica38.getId();
    models.Usuario usuario46 = metaDica38.getAutor();
    metaDica38.setComentario("models.DicaDisciplinasAnteriores");
    boolean b49 = usuario18.equals((java.lang.Object)metaDica38);
    
    // Checks the contract:  compareTo-equals on dicaComoNaoTerDificuldade8 and dicaMaterialUtil36
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaComoNaoTerDificuldade8 and dicaMaterialUtil36", (dicaComoNaoTerDificuldade8.compareTo(dicaMaterialUtil36) == 0) == dicaComoNaoTerDificuldade8.equals(dicaMaterialUtil36));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test133"); }

    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia8 = new models.Discordancia(usuario6, "");
    models.DicaMaterialUtil dicaMaterialUtil11 = new models.DicaMaterialUtil("models.MetaDica", usuario6, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    usuario6.setLogin("");
    models.Concordancia concordancia14 = new models.Concordancia(usuario6);
    models.Usuario usuario15 = concordancia14.getAutor();
    models.DicaMaterialUtil dicaMaterialUtil18 = new models.DicaMaterialUtil("", usuario15, "Conselho", "");
    models.Usuario usuario19 = dicaMaterialUtil18.getAutor();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores22 = new models.DicaDisciplinasAnteriores("models.DicaComoNaoTerDificuldade", usuario19, "models.DicaDisciplinasAnteriores", "models.DicaComoNaoTerDificuldade");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil11 and dicaMaterialUtil18
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil11 and dicaMaterialUtil18", (dicaMaterialUtil11.compareTo(dicaMaterialUtil18) == 0) == dicaMaterialUtil11.equals(dicaMaterialUtil18));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test134"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaConselho dicaConselho7 = new models.DicaConselho("0", usuario2, "models.DicaComoNaoTerDificuldade");
    models.Concordancia concordancia8 = new models.Concordancia(usuario2);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil5 and dicaConselho7
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil5 and dicaConselho7", (dicaMaterialUtil5.compareTo(dicaConselho7) == 0) == dicaMaterialUtil5.equals(dicaConselho7));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test135"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    int i3 = tema1.getNumeroDicas();
    models.Tema tema5 = new models.Tema("");
    double d6 = tema5.getMedia();
    int i7 = tema5.getNumeroDicas();
    models.MetaDica metaDica8 = new models.MetaDica();
    models.Discordancia discordancia9 = new models.Discordancia();
    metaDica8.adicionaDiscordancia(discordancia9);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade11 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str12 = dicaComoNaoTerDificuldade11.getCategoria();
    metaDica8.adicionaDica((models.IDica)dicaComoNaoTerDificuldade11);
    int i14 = dicaComoNaoTerDificuldade11.getNumeroConcordancias();
    tema5.addDica((models.IDica)dicaComoNaoTerDificuldade11);
    java.lang.String str16 = dicaComoNaoTerDificuldade11.getTipo();
    tema1.addDica((models.IDica)dicaComoNaoTerDificuldade11);
    tema1.addAvaliacao("Material \u00FAtil", (java.lang.Integer)1);
    
    // Checks the contract:  compareTo-equals on metaDica8 and dicaComoNaoTerDificuldade11
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica8 and dicaComoNaoTerDificuldade11", (metaDica8.compareTo(dicaComoNaoTerDificuldade11) == 0) == metaDica8.equals(dicaComoNaoTerDificuldade11));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test136"); }

    models.Disciplina disciplina2 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica3 = disciplina2.getMetadicas();
    disciplina2.setId((java.lang.Long)10L);
    models.Usuario usuario8 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil11 = new models.DicaMaterialUtil("", usuario8, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica13 = new models.MetaDica("hi!", usuario8, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina2.addMetaDica(metaDica13);
    java.lang.String str15 = metaDica13.getTipo();
    metaDica13.addDenuncia("hi!");
    metaDica13.setComentario("models.MetaDica");
    java.lang.String str20 = metaDica13.getComentario();
    java.lang.String str21 = metaDica13.getCategoria();
    models.Usuario usuario25 = new models.Usuario("", "models.DicaConselho", "Meta Dica");
    metaDica13.setAutor(usuario25);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade28 = new models.DicaComoNaoTerDificuldade("Conselho", usuario25, "models.DicaComoNaoTerDificuldade");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil11 and metaDica13
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil11 and metaDica13", (dicaMaterialUtil11.compareTo(metaDica13) == 0) == dicaMaterialUtil11.equals(metaDica13));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test137"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    int i4 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    boolean b7 = tema1.equals((java.lang.Object)"Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i8 = tema1.getNumeroDicas();
    int i9 = tema1.getNumeroDicas();
    java.lang.String str10 = tema1.getNome();
    models.Usuario usuario13 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil16 = new models.DicaMaterialUtil("", usuario13, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores19 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario13, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    java.lang.String str20 = dicaDisciplinasAnteriores19.getCategoria();
    java.lang.String str21 = dicaDisciplinasAnteriores19.getRazoesDisciplinas();
    int i22 = dicaDisciplinasAnteriores19.getNumeroDiscordancia();
    tema1.addDica((models.IDica)dicaDisciplinasAnteriores19);
    boolean b25 = tema1.isAvaliado("Conselho");
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores19 and dicaMaterialUtil16
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores19 and dicaMaterialUtil16", (dicaDisciplinasAnteriores19.compareTo(dicaMaterialUtil16) == 0) == dicaDisciplinasAnteriores19.equals(dicaMaterialUtil16));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test138"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica7 = new models.MetaDica("hi!", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores();
    java.lang.String str9 = dicaDisciplinasAnteriores8.getCategoria();
    metaDica7.adicionaDica((models.IDica)dicaDisciplinasAnteriores8);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores12 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario13 = dicaDisciplinasAnteriores12.getListaUsuariosQueVotaram();
    models.Usuario usuario17 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores12.setAutor(usuario17);
    models.DicaMaterialUtil dicaMaterialUtil21 = new models.DicaMaterialUtil("hi!", usuario17, "Conselho", "Conselho");
    dicaMaterialUtil21.setDominioURL("hi!");
    int i24 = metaDica7.compareTo((models.IDica)dicaMaterialUtil21);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil5 and dicaDisciplinasAnteriores12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil5 and dicaDisciplinasAnteriores12", (dicaMaterialUtil5.compareTo(dicaDisciplinasAnteriores12) == 0) == dicaMaterialUtil5.equals(dicaDisciplinasAnteriores12));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test139"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia5 = new models.Discordancia(usuario3, "");
    int i6 = usuario3.getId();
    usuario3.setSenha("models.DicaConselho");
    java.lang.String str9 = usuario3.getNome();
    usuario3.setSenha("");
    models.Disciplina disciplina13 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica14 = disciplina13.getMetadicas();
    disciplina13.setId((java.lang.Long)10L);
    models.Usuario usuario19 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil22 = new models.DicaMaterialUtil("", usuario19, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica24 = new models.MetaDica("hi!", usuario19, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina13.addMetaDica(metaDica24);
    java.lang.String str26 = metaDica24.getTipo();
    metaDica24.addDenuncia("hi!");
    metaDica24.setComentario("models.MetaDica");
    java.lang.String str31 = metaDica24.getComentario();
    boolean b32 = metaDica24.isVisivel();
    metaDica24.setTitulo("models.DicaMaterialUtil");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade35 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str36 = dicaComoNaoTerDificuldade35.getCategoria();
    java.lang.String str37 = dicaComoNaoTerDificuldade35.getCategoria();
    metaDica24.adicionaDica((models.IDica)dicaComoNaoTerDificuldade35);
    boolean b39 = usuario3.equals((java.lang.Object)metaDica24);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil22 and dicaComoNaoTerDificuldade35
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil22 and dicaComoNaoTerDificuldade35", (dicaMaterialUtil22.compareTo(dicaComoNaoTerDificuldade35) == 0) == dicaMaterialUtil22.equals(dicaComoNaoTerDificuldade35));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test140"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    int i6 = dicaComoNaoTerDificuldade3.getNumeroConcordancias();
    models.DicaConselho dicaConselho8 = new models.DicaConselho();
    java.lang.String str9 = dicaConselho8.getCategoria();
    boolean b10 = dicaConselho8.isVotavel();
    java.lang.String str11 = dicaConselho8.getTipo();
    int i12 = dicaConselho8.getNumeroDiscordancia();
    dicaConselho8.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    models.Usuario usuario15 = new models.Usuario();
    usuario15.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia18 = new models.Concordancia(usuario15);
    java.lang.String str19 = usuario15.getLogin();
    dicaConselho8.setAutor(usuario15);
    models.MetaDica metaDica22 = new models.MetaDica("", usuario15, "models.DicaMaterialUtil");
    boolean b23 = dicaComoNaoTerDificuldade3.usuarioAtualVotouNestaDica(usuario15);
    
    // Checks the contract:  compareTo-equals on metaDica0 and dicaConselho8
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica0 and dicaConselho8", (metaDica0.compareTo(dicaConselho8) == 0) == metaDica0.equals(dicaConselho8));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test141"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    disciplina1.setNome("models.DicaConselho");
    java.lang.String str8 = disciplina1.getNome();
    models.Disciplina disciplina10 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica11 = disciplina10.getMetadicas();
    disciplina10.setId((java.lang.Long)10L);
    models.Usuario usuario16 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil19 = new models.DicaMaterialUtil("", usuario16, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica21 = new models.MetaDica("hi!", usuario16, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina10.addMetaDica(metaDica21);
    java.lang.String str23 = metaDica21.getTipo();
    int i24 = metaDica21.getNumeroDicasNaMetaDica();
    disciplina1.addMetaDica(metaDica21);
    models.Discordancia discordancia26 = new models.Discordancia();
    discordancia26.setRazaoDiscordancia("models.MetaDica");
    metaDica21.adicionaDiscordancia(discordancia26);
    int i30 = discordancia26.getId();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil19 and metaDica21
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil19 and metaDica21", (dicaMaterialUtil19.compareTo(metaDica21) == 0) == dicaMaterialUtil19.equals(metaDica21));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test142"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    models.Usuario usuario14 = metaDica12.getAutor();
    usuario14.setSenha("Conselho");
    
    // Checks the contract:  compareTo-equals on metaDica12 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica12 and dicaMaterialUtil10", (metaDica12.compareTo(dicaMaterialUtil10) == 0) == metaDica12.equals(dicaMaterialUtil10));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test143"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    java.util.Set<models.Usuario> set_usuario15 = metaDica12.getListaUsuariosQueVotaram();
    models.MetaDica metaDica16 = new models.MetaDica();
    models.Discordancia discordancia17 = new models.Discordancia();
    metaDica16.adicionaDiscordancia(discordancia17);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade19 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str20 = dicaComoNaoTerDificuldade19.getCategoria();
    metaDica16.adicionaDica((models.IDica)dicaComoNaoTerDificuldade19);
    boolean b22 = metaDica16.isVisivel();
    metaDica12.adicionaDica((models.IDica)metaDica16);
    
    // Checks the contract:  compareTo-equals on dicaComoNaoTerDificuldade19 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaComoNaoTerDificuldade19 and dicaMaterialUtil10", (dicaComoNaoTerDificuldade19.compareTo(dicaMaterialUtil10) == 0) == dicaComoNaoTerDificuldade19.equals(dicaMaterialUtil10));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test144"); }

    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    int i8 = usuario5.getId();
    models.DicaMaterialUtil dicaMaterialUtil11 = new models.DicaMaterialUtil("", usuario5, "0,0", "");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores14 = new models.DicaDisciplinasAnteriores("0", usuario5, "models.DicaMaterialUtil", "0,0");
    models.Disciplina disciplina16 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica17 = disciplina16.getMetadicas();
    disciplina16.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema20 = disciplina16.getTemas();
    disciplina16.setNome("models.DicaConselho");
    java.lang.String str23 = disciplina16.getNome();
    int i24 = disciplina16.getNumeroMetaDicasVisiveis();
    boolean b25 = usuario5.equals((java.lang.Object)i24);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores14 and dicaMaterialUtil11
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores14 and dicaMaterialUtil11", (dicaDisciplinasAnteriores14.compareTo(dicaMaterialUtil11) == 0) == dicaDisciplinasAnteriores14.equals(dicaMaterialUtil11));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test145"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    double d7 = tema6.getMedia();
    int i8 = tema6.getNumeroDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    boolean b11 = tema6.isAvaliado("");
    java.lang.Long long12 = tema6.getId();
    boolean b14 = tema6.equals((java.lang.Object)(short)10);
    models.DicaMaterialUtil dicaMaterialUtil15 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia16 = dicaMaterialUtil15.getListaDiscordancia();
    tema6.addDica((models.IDica)dicaMaterialUtil15);
    models.Disciplina disciplina19 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica20 = disciplina19.getMetadicas();
    disciplina19.setId((java.lang.Long)10L);
    models.Usuario usuario25 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil28 = new models.DicaMaterialUtil("", usuario25, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica30 = new models.MetaDica("hi!", usuario25, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina19.addMetaDica(metaDica30);
    java.lang.String str32 = metaDica30.getTipo();
    metaDica30.addDenuncia("hi!");
    metaDica30.setComentario("models.MetaDica");
    long long37 = metaDica30.getId();
    models.Usuario usuario38 = metaDica30.getAutor();
    boolean b39 = dicaMaterialUtil15.usuarioAtualVotouNestaDica(usuario38);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil28 and metaDica30
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil28 and metaDica30", (dicaMaterialUtil28.compareTo(metaDica30) == 0) == dicaMaterialUtil28.equals(metaDica30));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test146"); }

    models.Tema tema1 = new models.Tema("");
    int i2 = tema1.getNumeroDicas();
    tema1.addAvaliacao("0,0", (java.lang.Integer)(-1));
    models.IDica iDica6 = null;
    tema1.addDica(iDica6);
    models.Disciplina disciplina9 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica10 = disciplina9.getMetadicas();
    disciplina9.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema13 = disciplina9.getTemas();
    disciplina9.setNome("models.DicaConselho");
    java.lang.String str16 = disciplina9.getNome();
    models.Disciplina disciplina18 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica19 = disciplina18.getMetadicas();
    disciplina18.setId((java.lang.Long)10L);
    models.Usuario usuario24 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil27 = new models.DicaMaterialUtil("", usuario24, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica29 = new models.MetaDica("hi!", usuario24, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina18.addMetaDica(metaDica29);
    java.lang.String str31 = metaDica29.getTipo();
    int i32 = metaDica29.getNumeroDicasNaMetaDica();
    disciplina9.addMetaDica(metaDica29);
    tema1.addDica((models.IDica)metaDica29);
    models.Disciplina disciplina36 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica37 = disciplina36.getMetadicas();
    disciplina36.setId((java.lang.Long)1L);
    models.Tema tema41 = new models.Tema("");
    double d42 = tema41.getMedia();
    int i43 = tema41.getNumeroDicas();
    models.Tema tema44 = disciplina36.addTema(tema41);
    boolean b46 = tema41.isAvaliado("");
    java.lang.Long long47 = tema41.getId();
    boolean b49 = tema41.equals((java.lang.Object)(short)10);
    models.DicaMaterialUtil dicaMaterialUtil50 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia51 = dicaMaterialUtil50.getListaDiscordancia();
    tema41.addDica((models.IDica)dicaMaterialUtil50);
    tema1.addDica((models.IDica)dicaMaterialUtil50);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil27 and metaDica29
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil27 and metaDica29", (dicaMaterialUtil27.compareTo(metaDica29) == 0) == dicaMaterialUtil27.equals(metaDica29));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test147"); }

    models.Tema tema1 = new models.Tema("");
    int i2 = tema1.getNumeroDicas();
    tema1.addAvaliacao("0,0", (java.lang.Integer)(-1));
    models.IDica iDica6 = null;
    tema1.addDica(iDica6);
    models.Disciplina disciplina9 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica10 = disciplina9.getMetadicas();
    disciplina9.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema13 = disciplina9.getTemas();
    disciplina9.setNome("models.DicaConselho");
    java.lang.String str16 = disciplina9.getNome();
    models.Disciplina disciplina18 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica19 = disciplina18.getMetadicas();
    disciplina18.setId((java.lang.Long)10L);
    models.Usuario usuario24 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil27 = new models.DicaMaterialUtil("", usuario24, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica29 = new models.MetaDica("hi!", usuario24, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina18.addMetaDica(metaDica29);
    java.lang.String str31 = metaDica29.getTipo();
    int i32 = metaDica29.getNumeroDicasNaMetaDica();
    disciplina9.addMetaDica(metaDica29);
    tema1.addDica((models.IDica)metaDica29);
    double d35 = tema1.getMediana();
    
    // Checks the contract:  compareTo-equals on metaDica29 and dicaMaterialUtil27
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica29 and dicaMaterialUtil27", (metaDica29.compareTo(dicaMaterialUtil27) == 0) == metaDica29.equals(dicaMaterialUtil27));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test148"); }

    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("models.MetaDica", usuario5, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    usuario5.setLogin("");
    models.Concordancia concordancia13 = new models.Concordancia(usuario5);
    models.Usuario usuario14 = concordancia13.getAutor();
    models.DicaMaterialUtil dicaMaterialUtil17 = new models.DicaMaterialUtil("", usuario14, "Conselho", "");
    models.Usuario usuario18 = dicaMaterialUtil17.getAutor();
    java.lang.String str19 = dicaMaterialUtil17.getNomeURL();
    int i20 = dicaMaterialUtil17.getNumeroDenuncias();
    models.Usuario usuario23 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil26 = new models.DicaMaterialUtil("", usuario23, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia27 = new models.Concordancia(usuario23);
    models.DicaConselho dicaConselho29 = new models.DicaConselho("models.MetaDica", usuario23, "hi!");
    boolean b30 = dicaMaterialUtil17.usuarioAtualVotouNestaDica(usuario23);
    
    // Checks the contract:  compareTo-equals on dicaConselho29 and dicaMaterialUtil26
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaConselho29 and dicaMaterialUtil26", (dicaConselho29.compareTo(dicaMaterialUtil26) == 0) == dicaConselho29.equals(dicaMaterialUtil26));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test149"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Usuario usuario2 = null;
    models.Discordancia discordancia4 = new models.Discordancia(usuario2, "");
    models.Usuario usuario5 = null;
    discordancia4.setAutor(usuario5);
    int i7 = discordancia4.getId();
    dicaDisciplinasAnteriores0.adicionaDiscordancia(discordancia4);
    dicaDisciplinasAnteriores0.setNomesDisciplinas("");
    int i11 = dicaDisciplinasAnteriores0.getNumeroDenuncias();
    java.lang.String str12 = dicaDisciplinasAnteriores0.getTipo();
    models.Usuario usuario17 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario17.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil22 = new models.DicaMaterialUtil("0,0", usuario17, "hi!", "models.DicaDisciplinasAnteriores");
    usuario17.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    dicaDisciplinasAnteriores0.setAutor(usuario17);
    int i26 = usuario17.getId();
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores0 and dicaMaterialUtil22
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores0 and dicaMaterialUtil22", (dicaDisciplinasAnteriores0.compareTo(dicaMaterialUtil22) == 0) == dicaDisciplinasAnteriores0.equals(dicaMaterialUtil22));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test150"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    java.lang.String str6 = dicaComoNaoTerDificuldade3.getTipo();
    dicaComoNaoTerDificuldade3.setNomeAssunto("hi!");
    long long9 = dicaComoNaoTerDificuldade3.getId();
    models.Usuario usuario11 = new models.Usuario();
    java.lang.String str12 = usuario11.getNome();
    usuario11.setSenha("models.MetaDica");
    models.DicaConselho dicaConselho16 = new models.DicaConselho("Conselho", usuario11, "0,0");
    dicaComoNaoTerDificuldade3.setAutor(usuario11);
    
    // Checks the contract:  compareTo-equals on dicaConselho16 and metaDica0
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaConselho16 and metaDica0", (dicaConselho16.compareTo(metaDica0) == 0) == dicaConselho16.equals(metaDica0));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test151"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.lang.String str3 = tema1.getNome();
    tema1.addAvaliacao("0", (java.lang.Integer)(-1));
    models.Usuario usuario9 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil12 = new models.DicaMaterialUtil("", usuario9, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores15 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario9, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    boolean b16 = tema1.equals((java.lang.Object)dicaDisciplinasAnteriores15);
    models.Usuario usuario21 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia23 = new models.Discordancia(usuario21, "");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade25 = new models.DicaComoNaoTerDificuldade("models.DicaDisciplinasAnteriores", usuario21, "hi!");
    java.lang.String str26 = usuario21.getNome();
    dicaDisciplinasAnteriores15.setAutor(usuario21);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil12 and dicaComoNaoTerDificuldade25
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil12 and dicaComoNaoTerDificuldade25", (dicaMaterialUtil12.compareTo(dicaComoNaoTerDificuldade25) == 0) == dicaMaterialUtil12.equals(dicaComoNaoTerDificuldade25));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test152"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    java.lang.String str6 = dicaComoNaoTerDificuldade3.getTipo();
    dicaComoNaoTerDificuldade3.setNomeAssunto("hi!");
    long long9 = dicaComoNaoTerDificuldade3.getId();
    dicaComoNaoTerDificuldade3.setNomeAssunto("models.DicaDisciplinasAnteriores");
    models.Disciplina disciplina13 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica14 = disciplina13.getMetadicas();
    disciplina13.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema17 = disciplina13.getTemas();
    disciplina13.setNome("models.DicaConselho");
    java.lang.String str20 = disciplina13.getNome();
    models.Disciplina disciplina22 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica23 = disciplina22.getMetadicas();
    disciplina22.setId((java.lang.Long)10L);
    models.Usuario usuario28 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil31 = new models.DicaMaterialUtil("", usuario28, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica33 = new models.MetaDica("hi!", usuario28, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina22.addMetaDica(metaDica33);
    java.lang.String str35 = metaDica33.getTipo();
    int i36 = metaDica33.getNumeroDicasNaMetaDica();
    disciplina13.addMetaDica(metaDica33);
    models.Usuario usuario38 = metaDica33.getAutor();
    int i39 = dicaComoNaoTerDificuldade3.compareTo((models.IDica)metaDica33);
    
    // Checks the contract:  compareTo-equals on metaDica0 and dicaMaterialUtil31
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica0 and dicaMaterialUtil31", (metaDica0.compareTo(dicaMaterialUtil31) == 0) == metaDica0.equals(dicaMaterialUtil31));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test153"); }

    models.Disciplina disciplina1 = new models.Disciplina("Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i2 = disciplina1.getNumeroMetaDicasVisiveis();
    java.lang.String str3 = disciplina1.getNome();
    models.Usuario usuario8 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica10 = new models.MetaDica("models.MetaDica", usuario8, "models.DicaConselho");
    int i11 = metaDica10.getNumeroDicasNaMetaDica();
    java.lang.String str12 = metaDica10.getComentario();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores13 = new models.DicaDisciplinasAnteriores();
    java.lang.String str14 = dicaDisciplinasAnteriores13.getRazoesDisciplinas();
    java.lang.String str15 = dicaDisciplinasAnteriores13.getRazoesDisciplinas();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores16 = new models.DicaDisciplinasAnteriores();
    java.lang.String str17 = dicaDisciplinasAnteriores16.getRazoesDisciplinas();
    java.lang.String str18 = dicaDisciplinasAnteriores16.getRazoesDisciplinas();
    models.Concordancia concordancia19 = new models.Concordancia();
    dicaDisciplinasAnteriores16.adicionaConcordancia(concordancia19);
    dicaDisciplinasAnteriores13.adicionaConcordancia(concordancia19);
    dicaDisciplinasAnteriores13.setRazoesDisciplinas("0");
    java.lang.String str24 = dicaDisciplinasAnteriores13.getTipo();
    int i25 = metaDica10.compareTo((models.IDica)dicaDisciplinasAnteriores13);
    boolean b26 = disciplina1.equals((java.lang.Object)metaDica10);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores16 and dicaDisciplinasAnteriores13
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores16 and dicaDisciplinasAnteriores13", (dicaDisciplinasAnteriores16.compareTo(dicaDisciplinasAnteriores13) == 0) == dicaDisciplinasAnteriores16.equals(dicaDisciplinasAnteriores13));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test154"); }

    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    usuario5.setNome("Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores12 = new models.DicaDisciplinasAnteriores("", usuario5, "0,0", "hi!");
    models.MetaDica metaDica14 = new models.MetaDica("", usuario5, "0");
    usuario5.setSenha("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Checks the contract:  compareTo-equals on metaDica14 and dicaDisciplinasAnteriores12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica14 and dicaDisciplinasAnteriores12", (metaDica14.compareTo(dicaDisciplinasAnteriores12) == 0) == metaDica14.equals(dicaDisciplinasAnteriores12));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test155"); }

    models.Usuario usuario2 = new models.Usuario();
    usuario2.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia5 = new models.Concordancia(usuario2);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("", usuario2, "Meta Dica", "0,0");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores11 = new models.DicaDisciplinasAnteriores("models.DicaMaterialUtil", usuario2, "models.DicaComoNaoTerDificuldade", "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    usuario2.setLogin("models.DicaDisciplinasAnteriores");
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores8 and dicaDisciplinasAnteriores11
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores8 and dicaDisciplinasAnteriores11", (dicaDisciplinasAnteriores8.compareTo(dicaDisciplinasAnteriores11) == 0) == dicaDisciplinasAnteriores8.equals(dicaDisciplinasAnteriores11));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test156"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    int i4 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    boolean b7 = tema1.equals((java.lang.Object)"Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i8 = tema1.getNumeroDicas();
    int i9 = tema1.getNumeroDicas();
    java.lang.String str10 = tema1.getNome();
    models.Usuario usuario13 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil16 = new models.DicaMaterialUtil("", usuario13, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores19 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario13, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    java.lang.String str20 = dicaDisciplinasAnteriores19.getCategoria();
    java.lang.String str21 = dicaDisciplinasAnteriores19.getRazoesDisciplinas();
    int i22 = dicaDisciplinasAnteriores19.getNumeroDiscordancia();
    tema1.addDica((models.IDica)dicaDisciplinasAnteriores19);
    models.Usuario usuario24 = null;
    models.Discordancia discordancia26 = new models.Discordancia(usuario24, "hi!");
    discordancia26.setRazaoDiscordancia("");
    int i29 = discordancia26.getId();
    discordancia26.setRazaoDiscordancia("");
    int i32 = discordancia26.getId();
    java.lang.String str33 = discordancia26.getRazaoDiscordancia();
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade34 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario38 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade34.setAutor(usuario38);
    usuario38.setNome("models.DicaMaterialUtil");
    discordancia26.setAutor(usuario38);
    dicaDisciplinasAnteriores19.adicionaDiscordancia(discordancia26);
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil16 and dicaComoNaoTerDificuldade34
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil16 and dicaComoNaoTerDificuldade34", (dicaMaterialUtil16.compareTo(dicaComoNaoTerDificuldade34) == 0) == dicaMaterialUtil16.equals(dicaComoNaoTerDificuldade34));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test157"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaConselho dicaConselho7 = new models.DicaConselho("models.DicaDisciplinasAnteriores", usuario2, "models.DicaConselho");
    java.lang.String str8 = dicaConselho7.getTipo();
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil();
    boolean b10 = dicaMaterialUtil9.isVotavel();
    dicaMaterialUtil9.setTitulo("models.DicaMaterialUtil");
    int i13 = dicaMaterialUtil9.getNumeroDiscordancia();
    boolean b15 = dicaMaterialUtil9.recebeuDenunciaDe("Material \u00FAtil");
    int i16 = dicaConselho7.compareTo((models.IDica)dicaMaterialUtil9);
    java.lang.String str17 = dicaConselho7.getTipo();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil9 and dicaMaterialUtil5
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil9 and dicaMaterialUtil5", (dicaMaterialUtil9.compareTo(dicaMaterialUtil5) == 0) == dicaMaterialUtil9.equals(dicaMaterialUtil5));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test158"); }

    models.Usuario usuario3 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil6 = new models.DicaMaterialUtil("", usuario3, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica8 = new models.MetaDica("hi!", usuario3, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica10 = new models.MetaDica("models.MetaDica", usuario3, "models.DicaMaterialUtil");
    
    // Checks the contract:  compareTo-equals on metaDica8 and dicaMaterialUtil6
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica8 and dicaMaterialUtil6", (metaDica8.compareTo(dicaMaterialUtil6) == 0) == metaDica8.equals(dicaMaterialUtil6));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test159"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    metaDica12.setComentario("models.MetaDica");
    java.lang.String str19 = metaDica12.getComentario();
    java.lang.String str20 = metaDica12.getTipo();
    models.DicaConselho dicaConselho21 = new models.DicaConselho();
    java.lang.String str22 = dicaConselho21.getCategoria();
    boolean b23 = dicaConselho21.isVotavel();
    dicaConselho21.setConselho("Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i26 = metaDica12.compareTo((models.IDica)dicaConselho21);
    dicaConselho21.addDenuncia("Conselho");
    
    // Checks the contract:  compareTo-equals on metaDica12 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica12 and dicaMaterialUtil10", (metaDica12.compareTo(dicaMaterialUtil10) == 0) == metaDica12.equals(dicaMaterialUtil10));

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test160"); }

    models.Usuario usuario3 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil6 = new models.DicaMaterialUtil("", usuario3, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica8 = new models.MetaDica("hi!", usuario3, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade10 = new models.DicaComoNaoTerDificuldade("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario3, "hi!");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil6 and metaDica8
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil6 and metaDica8", (dicaMaterialUtil6.compareTo(metaDica8) == 0) == dicaMaterialUtil6.equals(metaDica8));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test161"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia1 = dicaMaterialUtil0.getListaDiscordancia();
    int i2 = dicaMaterialUtil0.getNumeroVotos();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores3 = new models.DicaDisciplinasAnteriores();
    java.lang.String str4 = dicaDisciplinasAnteriores3.getRazoesDisciplinas();
    java.lang.String str5 = dicaDisciplinasAnteriores3.getRazoesDisciplinas();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores6 = new models.DicaDisciplinasAnteriores();
    java.lang.String str7 = dicaDisciplinasAnteriores6.getRazoesDisciplinas();
    java.lang.String str8 = dicaDisciplinasAnteriores6.getRazoesDisciplinas();
    models.Concordancia concordancia9 = new models.Concordancia();
    dicaDisciplinasAnteriores6.adicionaConcordancia(concordancia9);
    dicaDisciplinasAnteriores3.adicionaConcordancia(concordancia9);
    dicaMaterialUtil0.adicionaConcordancia(concordancia9);
    
    // Checks the contract:  compareTo-equals on dicaDisciplinasAnteriores3 and dicaDisciplinasAnteriores6
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaDisciplinasAnteriores3 and dicaDisciplinasAnteriores6", (dicaDisciplinasAnteriores3.compareTo(dicaDisciplinasAnteriores6) == 0) == dicaDisciplinasAnteriores3.equals(dicaDisciplinasAnteriores6));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test162"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    int i3 = tema1.getNumeroDicas();
    models.MetaDica metaDica4 = new models.MetaDica();
    models.Discordancia discordancia5 = new models.Discordancia();
    metaDica4.adicionaDiscordancia(discordancia5);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade7 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str8 = dicaComoNaoTerDificuldade7.getCategoria();
    metaDica4.adicionaDica((models.IDica)dicaComoNaoTerDificuldade7);
    int i10 = dicaComoNaoTerDificuldade7.getNumeroConcordancias();
    tema1.addDica((models.IDica)dicaComoNaoTerDificuldade7);
    java.util.List<models.IDica> list_iDica12 = tema1.getDicas();
    
    // Checks the contract:  compareTo-equals on metaDica4 and dicaComoNaoTerDificuldade7
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica4 and dicaComoNaoTerDificuldade7", (metaDica4.compareTo(dicaComoNaoTerDificuldade7) == 0) == metaDica4.equals(dicaComoNaoTerDificuldade7));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test163"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil();
    java.lang.String str15 = dicaMaterialUtil14.getNomeURL();
    long long16 = dicaMaterialUtil14.getId();
    metaDica12.adicionaDica((models.IDica)dicaMaterialUtil14);
    dicaMaterialUtil14.addDenuncia("0,0");
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil10 and metaDica12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil10 and metaDica12", (dicaMaterialUtil10.compareTo(metaDica12) == 0) == dicaMaterialUtil10.equals(metaDica12));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test164"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    models.Disciplina disciplina5 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica6 = disciplina5.getMetadicas();
    disciplina5.setId((java.lang.Long)10L);
    models.Usuario usuario11 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil("", usuario11, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica16 = new models.MetaDica("hi!", usuario11, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina5.addMetaDica(metaDica16);
    java.lang.String str18 = metaDica16.getTipo();
    java.util.Set<models.Usuario> set_usuario19 = metaDica16.getListaUsuariosQueVotaram();
    disciplina1.addMetaDica(metaDica16);
    java.lang.Long long21 = disciplina1.getId();
    
    // Checks the contract:  compareTo-equals on dicaMaterialUtil14 and metaDica16
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaMaterialUtil14 and metaDica16", (dicaMaterialUtil14.compareTo(metaDica16) == 0) == dicaMaterialUtil14.equals(metaDica16));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test165"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    metaDica12.setComentario("models.MetaDica");
    java.lang.String str19 = metaDica12.getTitulo();
    metaDica12.setComentario("models.DicaComoNaoTerDificuldade");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores22 = new models.DicaDisciplinasAnteriores();
    java.lang.String str23 = dicaDisciplinasAnteriores22.getRazoesDisciplinas();
    models.Usuario usuario24 = null;
    models.Discordancia discordancia26 = new models.Discordancia(usuario24, "");
    models.Usuario usuario27 = null;
    discordancia26.setAutor(usuario27);
    int i29 = discordancia26.getId();
    dicaDisciplinasAnteriores22.adicionaDiscordancia(discordancia26);
    java.lang.String str31 = dicaDisciplinasAnteriores22.getTipo();
    java.lang.String str32 = dicaDisciplinasAnteriores22.getNomesDisciplinas();
    java.lang.String str33 = dicaDisciplinasAnteriores22.getTipo();
    dicaDisciplinasAnteriores22.addDenuncia("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str36 = dicaDisciplinasAnteriores22.calculaIndiceConcordancia();
    java.lang.String str37 = dicaDisciplinasAnteriores22.getTipo();
    metaDica12.adicionaDica((models.IDica)dicaDisciplinasAnteriores22);
    int i39 = dicaDisciplinasAnteriores22.getNumeroDenuncias();
    
    // Checks the contract:  compareTo-equals on metaDica12 and dicaMaterialUtil10
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on metaDica12 and dicaMaterialUtil10", (metaDica12.compareTo(dicaMaterialUtil10) == 0) == metaDica12.equals(dicaMaterialUtil10));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test166"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    metaDica12.setComentario("models.MetaDica");
    int i19 = metaDica12.getNumeroDenuncias();
    models.Usuario usuario20 = null;
    models.Discordancia discordancia22 = new models.Discordancia(usuario20, "hi!");
    discordancia22.setRazaoDiscordancia("");
    int i25 = discordancia22.getId();
    discordancia22.setRazaoDiscordancia("");
    int i28 = discordancia22.getId();
    java.lang.String str29 = discordancia22.getRazaoDiscordancia();
    metaDica12.adicionaDiscordancia(discordancia22);
    models.DicaConselho dicaConselho32 = new models.DicaConselho();
    java.lang.String str33 = dicaConselho32.getCategoria();
    java.lang.String str34 = dicaConselho32.getCategoria();
    models.Usuario usuario38 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str39 = usuario38.getLogin();
    dicaConselho32.setAutor(usuario38);
    java.util.List<models.Discordancia> list_discordancia41 = dicaConselho32.getListaDiscordancia();
    int i42 = dicaConselho32.getNumeroConcordancias();
    java.util.List<models.Concordancia> list_concordancia43 = dicaConselho32.getListaConcordancia();
    dicaConselho32.setConselho("models.DicaDisciplinasAnteriores");
    models.Usuario usuario49 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia51 = new models.Discordancia(usuario49, "");
    int i52 = usuario49.getId();
    usuario49.setSenha("models.DicaConselho");
    java.lang.String str55 = usuario49.getNome();
    boolean b56 = dicaConselho32.usuarioAtualVotouNestaDica(usuario49);
    java.lang.String str57 = usuario49.getLogin();
    models.MetaDica metaDica59 = new models.MetaDica("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario49, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    discordancia22.setAutor(usuario49);
    
    // Checks the contract:  compareTo-equals on dicaConselho32 and metaDica12
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dicaConselho32 and metaDica12", (dicaConselho32.compareTo(metaDica12) == 0) == dicaConselho32.equals(metaDica12));

  }

}
