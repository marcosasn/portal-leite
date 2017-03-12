package models;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia1 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    models.DicaMaterialUtil dicaMaterialUtil2 = new models.DicaMaterialUtil();
    boolean b3 = dicaMaterialUtil2.isVotavel();
    boolean b4 = dicaMaterialUtil2.isVotavel();
    dicaMaterialUtil2.setNomeURL("hi!");
    dicaMaterialUtil2.setDominioURL("models.DicaComoNaoTerDificuldade");
    int i9 = dicaDisciplinasAnteriores0.compareTo((models.IDica)dicaMaterialUtil2);
    dicaMaterialUtil2.setTitulo("models.DicaDisciplinasAnteriores");
    dicaMaterialUtil2.setDominioURL("models.DicaDisciplinasAnteriores");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("Meta Dica");
    java.lang.String str4 = dicaComoNaoTerDificuldade0.getCategoria();
    models.Usuario usuario9 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia11 = new models.Discordancia(usuario9, "");
    usuario9.setNome("Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores16 = new models.DicaDisciplinasAnteriores("", usuario9, "0,0", "hi!");
    boolean b17 = dicaComoNaoTerDificuldade0.usuarioAtualVotouNestaDica(usuario9);
    dicaComoNaoTerDificuldade0.setNomeAssunto("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

    models.MetaDica metaDica1 = new models.MetaDica();
    models.Discordancia discordancia2 = new models.Discordancia();
    metaDica1.adicionaDiscordancia(discordancia2);
    models.Usuario usuario7 = new models.Usuario("", "hi!", "models.DicaConselho");
    boolean b9 = usuario7.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    discordancia2.setAutor(usuario7);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores13 = new models.DicaDisciplinasAnteriores("models.DicaDisciplinasAnteriores", usuario7, "hi!", "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    usuario5.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho11 = new models.DicaConselho("", usuario5, "models.DicaConselho");
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil("Meta Dica", usuario5, "models.DicaDisciplinasAnteriores", "hi!");

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

    models.Usuario usuario5 = new models.Usuario("models.DicaMaterialUtil", "models.DicaDisciplinasAnteriores", "Meta Dica");
    models.DicaConselho dicaConselho7 = new models.DicaConselho("Meta Dica", usuario5, "models.DicaConselho");
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("Meta Dica", usuario5, "hi!", "0,0");

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

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
    java.lang.String str12 = dicaComoNaoTerDificuldade3.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str6.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str12.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    java.lang.String str9 = dicaDisciplinasAnteriores8.getCategoria();
    java.lang.String str10 = dicaDisciplinasAnteriores8.getRazoesDisciplinas();
    java.lang.String str11 = dicaDisciplinasAnteriores8.calculaIndiceConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str9.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0,0"+ "'", str11.equals("0,0"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i4 = tema1.getAvaliacoes();
    java.util.List<models.IDica> list_iDica5 = tema1.getDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica5);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    models.Usuario usuario14 = metaDica12.getAutor();
    java.lang.String str15 = metaDica12.getTipo();
    java.lang.String str16 = metaDica12.getCategoria();
    long long17 = metaDica12.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "models.MetaDica"+ "'", str15.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Meta Dica"+ "'", str16.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("0,0", usuario2, "models.DicaMaterialUtil", "Meta Dica");
    dicaDisciplinasAnteriores8.setId((long)'a');
    int i11 = dicaDisciplinasAnteriores8.getNumeroDenuncias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

    models.Tema tema1 = new models.Tema("models.MetaDica");
    int i2 = tema1.getNumeroDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    int i7 = usuario4.getId();
    usuario4.setSenha("models.DicaConselho");
    int i10 = usuario4.getId();
    models.DicaConselho dicaConselho12 = new models.DicaConselho("", usuario4, "models.DicaComoNaoTerDificuldade");
    int i13 = usuario4.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    models.Usuario usuario4 = new models.Usuario("models.MetaDica", "Conselho", "0,0");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade6 = new models.DicaComoNaoTerDificuldade("models.DicaConselho", usuario4, "Meta Dica");

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str4 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    models.Concordancia concordancia5 = new models.Concordancia();
    dicaComoNaoTerDificuldade0.adicionaConcordancia(concordancia5);
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaDisciplinasAnteriores");
    boolean b9 = dicaComoNaoTerDificuldade0.isVotavel();
    boolean b11 = dicaComoNaoTerDificuldade0.recebeuDenunciaDe("models.DicaComoNaoTerDificuldade");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    models.DicaMaterialUtil dicaMaterialUtil4 = new models.DicaMaterialUtil();
    boolean b5 = dicaMaterialUtil4.isVotavel();
    boolean b6 = dicaMaterialUtil4.isVotavel();
    java.lang.String str7 = dicaMaterialUtil4.getNomeURL();
    int i8 = dicaComoNaoTerDificuldade0.compareTo((models.IDica)dicaMaterialUtil4);
    java.lang.String str9 = dicaMaterialUtil4.calculaIndiceConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0,0"+ "'", str9.equals("0,0"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    java.lang.String str3 = dicaMaterialUtil0.getNomeURL();
    java.lang.String str4 = dicaMaterialUtil0.calculaIndiceConcordancia();
    dicaMaterialUtil0.setNomeURL("models.DicaMaterialUtil");
    dicaMaterialUtil0.setNomeURL("Disciplinas anteriores que te ajudar\u00E3o aqui");
    dicaMaterialUtil0.setDominioURL("models.DicaConselho");
    dicaMaterialUtil0.setDominioURL("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0,0"+ "'", str4.equals("0,0"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    double d3 = tema1.getMediana();
    int i4 = tema1.getNumeroDicasVisiveis();
    java.util.List<models.IDica> list_iDica5 = tema1.getDicas();
    tema1.addAvaliacao("models.DicaMaterialUtil", (java.lang.Integer)(-1));
    models.Disciplina disciplina10 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica11 = disciplina10.getMetadicas();
    disciplina10.setId((java.lang.Long)1L);
    models.Tema tema15 = new models.Tema("");
    double d16 = tema15.getMedia();
    int i17 = tema15.getNumeroDicas();
    models.Tema tema18 = disciplina10.addTema(tema15);
    boolean b19 = tema1.equals((java.lang.Object)disciplina10);
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i20 = tema1.getAvaliacoes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i20);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

    models.Tema tema1 = new models.Tema("");
    int i2 = tema1.getNumeroDicas();
    int i3 = tema1.getNumeroDicasVisiveis();
    models.DicaConselho dicaConselho4 = new models.DicaConselho();
    java.lang.String str5 = dicaConselho4.getCategoria();
    boolean b6 = dicaConselho4.isVotavel();
    java.lang.String str7 = dicaConselho4.getTipo();
    int i8 = dicaConselho4.getNumeroDiscordancia();
    dicaConselho4.setTitulo("Disciplinas anteriores que te ajudar\u00E3o aqui");
    tema1.addDica((models.IDica)dicaConselho4);
    dicaConselho4.setConselho("models.DicaMaterialUtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Conselho"+ "'", str5.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaConselho"+ "'", str7.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    java.lang.String str15 = metaDica12.getTitulo();
    java.lang.String str16 = metaDica12.getCategoria();
    java.util.Set<models.Usuario> set_usuario17 = metaDica12.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Meta Dica"+ "'", str16.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario17);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    int i2 = dicaConselho0.getNumeroDiscordancia();
    java.lang.String str3 = dicaConselho0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getCategoria();
    java.lang.String str15 = metaDica12.getComentario();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Meta Dica"+ "'", str14.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str15.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

    models.Usuario usuario0 = null;
    models.Discordancia discordancia2 = new models.Discordancia(usuario0, "");
    models.Usuario usuario3 = null;
    discordancia2.setAutor(usuario3);
    models.Usuario usuario8 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia10 = new models.Discordancia(usuario8, "");
    int i11 = usuario8.getId();
    models.Concordancia concordancia12 = new models.Concordancia(usuario8);
    discordancia2.setAutor(usuario8);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade14 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str15 = dicaComoNaoTerDificuldade14.getNomeAssunto();
    int i16 = dicaComoNaoTerDificuldade14.getNumeroDenuncias();
    java.lang.String str17 = dicaComoNaoTerDificuldade14.getCategoria();
    boolean b18 = usuario8.equals((java.lang.Object)dicaComoNaoTerDificuldade14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str17.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

    models.Usuario usuario2 = new models.Usuario();
    usuario2.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia5 = new models.Concordancia(usuario2);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("", usuario2, "Meta Dica", "0,0");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores11 = new models.DicaDisciplinasAnteriores("models.DicaMaterialUtil", usuario2, "models.DicaComoNaoTerDificuldade", "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    boolean b12 = dicaDisciplinasAnteriores11.isVisivel();
    java.lang.String str13 = dicaDisciplinasAnteriores11.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str13.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    dicaMaterialUtil0.setId((long)(short)100);
    models.Usuario usuario3 = new models.Usuario();
    dicaMaterialUtil0.setAutor(usuario3);
    java.lang.String str5 = dicaMaterialUtil0.getNomeURL();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores6 = new models.DicaDisciplinasAnteriores();
    java.lang.String str7 = dicaDisciplinasAnteriores6.getRazoesDisciplinas();
    java.lang.String str8 = dicaDisciplinasAnteriores6.getRazoesDisciplinas();
    models.Concordancia concordancia9 = new models.Concordancia();
    dicaDisciplinasAnteriores6.adicionaConcordancia(concordancia9);
    dicaMaterialUtil0.adicionaConcordancia(concordancia9);
    dicaMaterialUtil0.setDominioURL("models.DicaDisciplinasAnteriores");
    dicaMaterialUtil0.setId((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("models.MetaDica", usuario5, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    usuario5.setLogin("");
    models.Concordancia concordancia13 = new models.Concordancia(usuario5);
    models.Usuario usuario14 = concordancia13.getAutor();
    models.DicaMaterialUtil dicaMaterialUtil17 = new models.DicaMaterialUtil("", usuario14, "Conselho", "");
    boolean b18 = dicaMaterialUtil17.isVotavel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    usuario4.setNome("Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores11 = new models.DicaDisciplinasAnteriores("", usuario4, "0,0", "hi!");
    models.Usuario usuario16 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia18 = new models.Discordancia(usuario16, "");
    models.DicaMaterialUtil dicaMaterialUtil21 = new models.DicaMaterialUtil("models.MetaDica", usuario16, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    boolean b22 = dicaDisciplinasAnteriores11.usuarioAtualVotouNestaDica(usuario16);
    dicaDisciplinasAnteriores11.setTitulo("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    models.Usuario usuario4 = dicaComoNaoTerDificuldade0.getAutor();
    int i5 = dicaComoNaoTerDificuldade0.getNumeroVotos();
    java.lang.String str6 = dicaComoNaoTerDificuldade0.getTipo();
    java.lang.String str7 = dicaComoNaoTerDificuldade0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str2.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str6.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str7.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getCategoria();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str7 = usuario6.getLogin();
    dicaConselho0.setAutor(usuario6);
    java.lang.String str9 = dicaConselho0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaConselho"+ "'", str7.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaConselho"+ "'", str9.equals("models.DicaConselho"));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    dicaMaterialUtil0.setId((long)(short)100);
    models.Usuario usuario3 = new models.Usuario();
    dicaMaterialUtil0.setAutor(usuario3);
    java.lang.String str5 = dicaMaterialUtil0.getNomeURL();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores6 = new models.DicaDisciplinasAnteriores();
    java.lang.String str7 = dicaDisciplinasAnteriores6.getRazoesDisciplinas();
    java.lang.String str8 = dicaDisciplinasAnteriores6.getRazoesDisciplinas();
    models.Concordancia concordancia9 = new models.Concordancia();
    dicaDisciplinasAnteriores6.adicionaConcordancia(concordancia9);
    dicaMaterialUtil0.adicionaConcordancia(concordancia9);
    dicaMaterialUtil0.setTitulo("models.DicaMaterialUtil");
    java.lang.String str14 = dicaMaterialUtil0.getDominioURL();
    java.lang.String str15 = dicaMaterialUtil0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Material \u00FAtil"+ "'", str15.equals("Material \u00FAtil"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    boolean b4 = disciplina1.equals((java.lang.Object)10.0f);
    disciplina1.setId((java.lang.Long)100L);
    int i7 = disciplina1.getNumeroMetaDicasVisiveis();
    int i8 = disciplina1.getNumeroMetaDicas();
    disciplina1.setNome("models.DicaDisciplinasAnteriores");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

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
    usuario8.setNome("hi!");
    models.Discordancia discordancia17 = new models.Discordancia(usuario8, "models.DicaDisciplinasAnteriores");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores20 = new models.DicaDisciplinasAnteriores("Conselho", usuario8, "0", "Material \u00FAtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.DicaConselho"+ "'", str4.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    models.Usuario usuario3 = new models.Usuario("models.MetaDica", "Conselho", "0,0");
    models.Concordancia concordancia4 = new models.Concordancia(usuario3);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores1 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario2 = dicaDisciplinasAnteriores1.getListaUsuariosQueVotaram();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores1.setAutor(usuario6);
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("hi!", usuario6, "Conselho", "Conselho");
    int i11 = dicaMaterialUtil10.getNumeroConcordancias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    boolean b4 = disciplina1.equals((java.lang.Object)10.0f);
    int i5 = disciplina1.getNumeroMetaDicasVisiveis();
    java.util.List<models.MetaDica> list_metaDica6 = disciplina1.getMetadicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica6);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setNomeURL("Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i5 = dicaMaterialUtil0.getNumeroVotos();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    java.lang.String str6 = dicaComoNaoTerDificuldade3.getCategoria();
    dicaComoNaoTerDificuldade3.setNomeAssunto("Meta Dica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str6.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    models.Concordancia concordancia7 = new models.Concordancia(usuario4);
    models.Usuario usuario8 = concordancia7.getAutor();
    java.lang.String str9 = usuario8.getLogin();
    usuario8.setNome("");
    usuario8.setNome("Meta Dica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

    models.Disciplina disciplina1 = new models.Disciplina("Meta Dica");
    disciplina1.setId((java.lang.Long)100L);
    models.Tema tema5 = new models.Tema("");
    java.util.List<models.IDica> list_iDica6 = tema5.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i7 = tema5.getAvaliacoes();
    int i8 = tema5.getNumeroDicas();
    tema5.ordenarTopConcordancias();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia11 = dicaMaterialUtil10.getListaDiscordancia();
    boolean b12 = tema5.equals((java.lang.Object)list_discordancia11);
    models.Disciplina disciplina14 = new models.Disciplina("models.MetaDica");
    java.lang.String str15 = disciplina14.getNome();
    boolean b16 = tema5.equals((java.lang.Object)disciplina14);
    boolean b17 = disciplina1.equals((java.lang.Object)tema5);
    models.Disciplina disciplina19 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica20 = disciplina19.getMetadicas();
    disciplina19.setId((java.lang.Long)1L);
    models.Tema tema24 = new models.Tema("");
    double d25 = tema24.getMedia();
    int i26 = tema24.getNumeroDicas();
    models.Tema tema27 = disciplina19.addTema(tema24);
    boolean b29 = tema24.isAvaliado("");
    tema24.ordenarTopConcordancias();
    int i31 = tema24.getNumeroAvaliacoes();
    models.Tema tema32 = disciplina1.addTema(tema24);
    int i33 = disciplina1.getNumeroMetaDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "models.MetaDica"+ "'", str15.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    java.lang.String str4 = disciplina1.getNome();
    java.lang.String str5 = disciplina1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    usuario4.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho10 = new models.DicaConselho("", usuario4, "models.DicaConselho");
    models.Discordancia discordancia12 = new models.Discordancia(usuario4, "models.DicaDisciplinasAnteriores");

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    java.lang.String str6 = dicaComoNaoTerDificuldade3.getTipo();
    dicaComoNaoTerDificuldade3.setNomeAssunto("hi!");
    dicaComoNaoTerDificuldade3.setNomeAssunto("0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str6.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores3 = new models.DicaDisciplinasAnteriores();
    java.lang.String str4 = dicaDisciplinasAnteriores3.getRazoesDisciplinas();
    java.lang.String str5 = dicaDisciplinasAnteriores3.getRazoesDisciplinas();
    models.Concordancia concordancia6 = new models.Concordancia();
    dicaDisciplinasAnteriores3.adicionaConcordancia(concordancia6);
    dicaDisciplinasAnteriores0.adicionaConcordancia(concordancia6);
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("0");
    java.lang.String str11 = dicaDisciplinasAnteriores0.getTipo();
    java.lang.String str12 = dicaDisciplinasAnteriores0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str11.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str12.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    java.lang.String str1 = metaDica0.calculaIndiceConcordancia();
    int i2 = metaDica0.getNumeroDicasNaMetaDica();
    java.lang.String str3 = metaDica0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0,0"+ "'", str1.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Meta Dica"+ "'", str3.equals("Meta Dica"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

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
    java.lang.String str18 = dicaMaterialUtil15.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    models.Tema tema0 = new models.Tema();
    boolean b2 = tema0.isAvaliado("");
    tema0.addAvaliacao("0", (java.lang.Integer)1);
    boolean b7 = tema0.isAvaliado("models.DicaComoNaoTerDificuldade");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario4.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("0,0", usuario4, "hi!", "models.DicaDisciplinasAnteriores");
    dicaMaterialUtil9.setNomeURL("models.DicaDisciplinasAnteriores");
    models.Usuario usuario15 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Concordancia concordancia16 = new models.Concordancia(usuario15);
    dicaMaterialUtil9.adicionaConcordancia(concordancia16);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade7 = new models.DicaComoNaoTerDificuldade("", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    java.lang.String str8 = dicaComoNaoTerDificuldade7.calculaIndiceConcordancia();
    boolean b9 = dicaComoNaoTerDificuldade7.isVisivel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0,0"+ "'", str8.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario4.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("0,0", usuario4, "hi!", "models.DicaDisciplinasAnteriores");
    dicaMaterialUtil9.setNomeURL("models.DicaDisciplinasAnteriores");
    dicaMaterialUtil9.setDominioURL("Conselho");

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    dicaMaterialUtil0.setId((long)(short)100);
    dicaMaterialUtil0.setNomeURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str5 = dicaMaterialUtil0.getTitulo();
    java.lang.String str6 = dicaMaterialUtil0.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str6.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getCategoria();
    models.Usuario usuario7 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    usuario7.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho13 = new models.DicaConselho("", usuario7, "models.DicaConselho");
    int i14 = dicaComoNaoTerDificuldade0.compareTo((models.IDica)dicaConselho13);
    java.lang.String str15 = dicaComoNaoTerDificuldade0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str2.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str15.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.MetaDica metaDica8 = new models.MetaDica("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario5, "models.DicaMaterialUtil");
    java.lang.String str9 = metaDica8.getComentario();
    java.lang.String str10 = metaDica8.getTipo();
    metaDica8.addDenuncia("Conselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaMaterialUtil"+ "'", str9.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "models.MetaDica"+ "'", str10.equals("models.MetaDica"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

    models.Disciplina disciplina1 = new models.Disciplina("Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i2 = disciplina1.getNumeroMetaDicasVisiveis();
    java.lang.Long long3 = disciplina1.getId();
    int i4 = disciplina1.getNumeroMetaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    disciplina1.setNome("");
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil();
    boolean b6 = dicaMaterialUtil5.isVotavel();
    dicaMaterialUtil5.setTitulo("models.DicaMaterialUtil");
    int i9 = dicaMaterialUtil5.getNumeroDiscordancia();
    models.Usuario usuario10 = dicaMaterialUtil5.getAutor();
    boolean b11 = disciplina1.equals((java.lang.Object)usuario10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getCategoria();
    int i3 = dicaConselho0.getNumeroConcordancias();
    java.lang.String str4 = dicaConselho0.getTipo();
    models.Usuario usuario6 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("", usuario6, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia10 = new models.Concordancia(usuario6);
    models.Usuario usuario11 = concordancia10.getAutor();
    dicaConselho0.adicionaConcordancia(concordancia10);
    java.lang.String str13 = dicaConselho0.getConselho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.DicaConselho"+ "'", str4.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    disciplina1.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.util.List<models.Tema> list_tema6 = disciplina1.getTemas();
    int i7 = disciplina1.getNumeroMetaDicasVisiveis();
    java.lang.String str8 = disciplina1.getNome();
    models.Tema tema9 = new models.Tema();
    boolean b11 = tema9.isAvaliado("");
    tema9.addAvaliacao("0", (java.lang.Integer)1);
    tema9.ordenarTopConcordancias();
    boolean b16 = disciplina1.equals((java.lang.Object)tema9);
    tema9.setId((java.lang.Long)100L);
    int i19 = tema9.getNumeroDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str8.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    java.util.List<models.IDica> list_iDica3 = tema1.getDicas();
    models.Usuario usuario8 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia10 = new models.Discordancia(usuario8, "");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade12 = new models.DicaComoNaoTerDificuldade("models.DicaDisciplinasAnteriores", usuario8, "hi!");
    java.lang.String str13 = dicaComoNaoTerDificuldade12.getNomeAssunto();
    boolean b14 = tema1.equals((java.lang.Object)str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Usuario usuario2 = null;
    models.Discordancia discordancia4 = new models.Discordancia(usuario2, "");
    models.Usuario usuario5 = null;
    discordancia4.setAutor(usuario5);
    int i7 = discordancia4.getId();
    dicaDisciplinasAnteriores0.adicionaDiscordancia(discordancia4);
    java.lang.String str9 = dicaDisciplinasAnteriores0.getTipo();
    dicaDisciplinasAnteriores0.setNomesDisciplinas("Meta Dica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str9.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    boolean b4 = disciplina1.equals((java.lang.Object)10.0f);
    int i5 = disciplina1.getNumeroMetaDicasVisiveis();
    java.lang.String str6 = disciplina1.getNome();
    java.lang.Long long7 = disciplina1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long7);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    java.lang.String str6 = dicaComoNaoTerDificuldade0.getTitulo();
    dicaComoNaoTerDificuldade0.setNomeAssunto("0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setNomeURL("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Usuario usuario9 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario9.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil("0,0", usuario9, "hi!", "models.DicaDisciplinasAnteriores");
    dicaMaterialUtil0.setAutor(usuario9);
    boolean b16 = dicaMaterialUtil0.isVisivel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getCategoria();
    metaDica12.setId((long)(byte)1);
    java.lang.String str17 = metaDica12.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Meta Dica"+ "'", str14.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "models.MetaDica"+ "'", str17.equals("models.MetaDica"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    int i3 = tema1.getNumeroDicas();
    int i4 = tema1.getNumeroDicas();
    int i5 = tema1.getNumeroDicas();
    java.lang.Long long6 = tema1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    models.Usuario usuario1 = dicaConselho0.getAutor();
    boolean b2 = dicaConselho0.isVotavel();
    dicaConselho0.addDenuncia("Meta Dica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    dicaMaterialUtil0.setId((long)(short)100);
    models.Usuario usuario3 = new models.Usuario();
    dicaMaterialUtil0.setAutor(usuario3);
    java.lang.String str5 = dicaMaterialUtil0.getNomeURL();
    dicaMaterialUtil0.setDominioURL("0");
    java.lang.String str8 = dicaMaterialUtil0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Material \u00FAtil"+ "'", str8.equals("Material \u00FAtil"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

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
    java.lang.String str12 = dicaComoNaoTerDificuldade7.getCategoria();
    java.lang.String str13 = dicaComoNaoTerDificuldade7.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str8.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str12.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str13.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

    models.Disciplina disciplina1 = new models.Disciplina("models.MetaDica");
    java.lang.Long long2 = disciplina1.getId();
    int i3 = disciplina1.getNumeroMetaDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Usuario usuario2 = null;
    models.Discordancia discordancia4 = new models.Discordancia(usuario2, "");
    models.Usuario usuario5 = null;
    discordancia4.setAutor(usuario5);
    int i7 = discordancia4.getId();
    dicaDisciplinasAnteriores0.adicionaDiscordancia(discordancia4);
    java.lang.String str9 = dicaDisciplinasAnteriores0.getTipo();
    java.lang.String str10 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    java.lang.String str11 = dicaDisciplinasAnteriores0.getTipo();
    dicaDisciplinasAnteriores0.addDenuncia("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str14 = dicaDisciplinasAnteriores0.calculaIndiceConcordancia();
    dicaDisciplinasAnteriores0.setNomesDisciplinas("Disciplinas anteriores que te ajudar\u00E3o aqui");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str9.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str11.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "0"+ "'", str14.equals("0"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

    models.Usuario usuario0 = null;
    models.Discordancia discordancia2 = new models.Discordancia(usuario0, "hi!");
    discordancia2.setRazaoDiscordancia("");
    int i5 = discordancia2.getId();
    discordancia2.setRazaoDiscordancia("");
    int i8 = discordancia2.getId();
    java.lang.String str9 = discordancia2.getRazaoDiscordancia();
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade10 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario14 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade10.setAutor(usuario14);
    usuario14.setNome("models.DicaMaterialUtil");
    discordancia2.setAutor(usuario14);
    usuario14.setNome("models.DicaComoNaoTerDificuldade");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

    models.Usuario usuario0 = new models.Usuario();
    usuario0.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Discordancia discordancia4 = new models.Discordancia(usuario0, "hi!");
    java.lang.String str5 = usuario0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    models.Disciplina disciplina7 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica8 = disciplina7.getMetadicas();
    disciplina7.setId((java.lang.Long)1L);
    models.Tema tema12 = new models.Tema("");
    double d13 = tema12.getMedia();
    int i14 = tema12.getNumeroDicas();
    models.Tema tema15 = disciplina7.addTema(tema12);
    boolean b17 = tema12.isAvaliado("");
    models.Tema tema18 = disciplina1.addTema(tema12);
    java.lang.String str19 = disciplina1.getNome();
    models.Tema tema21 = new models.Tema("");
    int i22 = tema21.getNumeroDicas();
    models.Tema tema23 = disciplina1.addTema(tema21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(tema23);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    models.Disciplina disciplina1 = new models.Disciplina("Meta Dica");
    disciplina1.setId((java.lang.Long)100L);
    models.Tema tema5 = new models.Tema("");
    java.util.List<models.IDica> list_iDica6 = tema5.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i7 = tema5.getAvaliacoes();
    int i8 = tema5.getNumeroDicas();
    tema5.ordenarTopConcordancias();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia11 = dicaMaterialUtil10.getListaDiscordancia();
    boolean b12 = tema5.equals((java.lang.Object)list_discordancia11);
    models.Disciplina disciplina14 = new models.Disciplina("models.MetaDica");
    java.lang.String str15 = disciplina14.getNome();
    boolean b16 = tema5.equals((java.lang.Object)disciplina14);
    boolean b17 = disciplina1.equals((java.lang.Object)tema5);
    java.lang.Long long18 = tema5.getId();
    int i19 = tema5.getNumeroAvaliacoes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "models.MetaDica"+ "'", str15.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

    models.Usuario usuario1 = new models.Usuario();
    usuario1.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Discordancia discordancia5 = new models.Discordancia(usuario1, "hi!");
    models.MetaDica metaDica7 = new models.MetaDica("models.DicaComoNaoTerDificuldade", usuario1, "models.DicaDisciplinasAnteriores");
    int i8 = metaDica7.getNumeroDicasNaMetaDica();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    java.util.Set<models.Usuario> set_usuario7 = metaDica6.getListaUsuariosQueVotaram();
    java.util.List<models.IDica> list_iDica8 = metaDica6.getListaDicas();
    int i9 = metaDica6.getNumeroDicasNaMetaDica();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    models.MetaDica metaDica3 = new models.MetaDica();
    java.lang.String str4 = metaDica3.calculaIndiceConcordancia();
    metaDica3.addDenuncia("Meta Dica");
    models.Usuario usuario7 = null;
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    int i10 = discordancia9.getId();
    metaDica3.adicionaDiscordancia(discordancia9);
    int i12 = metaDica3.getNumeroVotos();
    int i13 = dicaComoNaoTerDificuldade0.compareTo((models.IDica)metaDica3);
    java.util.Set<models.Usuario> set_usuario14 = metaDica3.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0,0"+ "'", str4.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario14);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getTipo();
    int i4 = dicaConselho0.getNumeroDiscordancia();
    dicaConselho0.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str7 = dicaConselho0.getTipo();
    java.lang.String str8 = dicaConselho0.getTipo();
    int i9 = dicaConselho0.getNumeroVotos();
    java.util.List<models.Concordancia> list_concordancia10 = dicaConselho0.getListaConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaConselho"+ "'", str7.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia10);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getTipo();
    int i4 = dicaConselho0.getNumeroDiscordancia();
    dicaConselho0.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    models.Usuario usuario7 = new models.Usuario();
    usuario7.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia10 = new models.Concordancia(usuario7);
    java.lang.String str11 = usuario7.getLogin();
    dicaConselho0.setAutor(usuario7);
    usuario7.setSenha("models.DicaMaterialUtil");
    usuario7.setNome("models.DicaDisciplinasAnteriores");
    usuario7.setSenha("Conselho");
    int i19 = usuario7.getId();
    int i20 = usuario7.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

    models.Usuario usuario3 = new models.Usuario("models.DicaConselho", "", "Disciplinas anteriores que te ajudar\u00E3o aqui");

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getTipo();
    int i4 = dicaConselho0.getNumeroDiscordancia();
    dicaConselho0.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    models.Usuario usuario7 = new models.Usuario();
    usuario7.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia10 = new models.Concordancia(usuario7);
    java.lang.String str11 = usuario7.getLogin();
    dicaConselho0.setAutor(usuario7);
    usuario7.setSenha("models.DicaMaterialUtil");
    java.lang.String str15 = usuario7.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica7 = new models.MetaDica("models.MetaDica", usuario5, "models.DicaConselho");
    models.Concordancia concordancia8 = new models.Concordancia(usuario5);
    models.DicaConselho dicaConselho10 = new models.DicaConselho("models.DicaDisciplinasAnteriores", usuario5, "hi!");
    java.lang.String str11 = dicaConselho10.getCategoria();
    java.lang.String str12 = dicaConselho10.getConselho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Conselho"+ "'", str11.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

    models.Disciplina disciplina1 = new models.Disciplina("");
    models.Disciplina disciplina3 = new models.Disciplina("models.DicaMaterialUtil");
    models.Disciplina disciplina5 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica6 = disciplina5.getMetadicas();
    disciplina5.setId((java.lang.Long)10L);
    models.Usuario usuario11 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil("", usuario11, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica16 = new models.MetaDica("hi!", usuario11, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina5.addMetaDica(metaDica16);
    java.lang.String str18 = metaDica16.getTipo();
    int i19 = metaDica16.getNumeroDicasNaMetaDica();
    models.Usuario usuario20 = metaDica16.getAutor();
    disciplina3.addMetaDica(metaDica16);
    int i22 = metaDica16.getNumeroDenuncias();
    disciplina1.addMetaDica(metaDica16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "models.MetaDica"+ "'", str18.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

    models.Usuario usuario1 = null;
    models.MetaDica metaDica3 = new models.MetaDica("0,0", usuario1, "Conselho");

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

    models.Usuario usuario0 = new models.Usuario();
    java.lang.String str1 = usuario0.getNome();
    usuario0.setSenha("models.MetaDica");
    models.Concordancia concordancia4 = new models.Concordancia(usuario0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    dicaConselho0.setConselho("models.MetaDica");
    dicaConselho0.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    dicaConselho0.addDenuncia("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    int i3 = tema1.getNumeroDicas();
    tema1.addAvaliacao("", (java.lang.Integer)(-1));
    java.lang.String str7 = tema1.getNome();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i8 = tema1.getAvaliacoes();
    tema1.setId((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i8);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    long long6 = dicaComoNaoTerDificuldade0.getId();
    models.Usuario usuario11 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia13 = new models.Discordancia(usuario11, "");
    models.DicaMaterialUtil dicaMaterialUtil16 = new models.DicaMaterialUtil("models.MetaDica", usuario11, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    usuario11.setLogin("");
    models.Concordancia concordancia19 = new models.Concordancia(usuario11);
    models.Usuario usuario20 = concordancia19.getAutor();
    dicaComoNaoTerDificuldade0.adicionaConcordancia(concordancia19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str2.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario20);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }

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
    boolean b21 = metaDica12.isVotavel();
    java.lang.String str22 = metaDica12.getCategoria();
    java.lang.String str23 = metaDica12.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "models.MetaDica"+ "'", str19.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Meta Dica"+ "'", str20.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Meta Dica"+ "'", str22.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Meta Dica"+ "'", str23.equals("Meta Dica"));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade0.setAutor(usuario4);
    java.lang.String str6 = usuario4.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

    models.Discordancia discordancia0 = new models.Discordancia();
    discordancia0.setRazaoDiscordancia("models.MetaDica");
    java.lang.String str3 = discordancia0.getRazaoDiscordancia();
    models.Usuario usuario4 = discordancia0.getAutor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.MetaDica"+ "'", str3.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario4);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

    models.Usuario usuario0 = null;
    models.Discordancia discordancia2 = new models.Discordancia(usuario0, "");
    models.Usuario usuario3 = null;
    discordancia2.setAutor(usuario3);
    models.Usuario usuario5 = discordancia2.getAutor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario5);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroVotos();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getTipo();
    int i4 = dicaComoNaoTerDificuldade0.getNumeroConcordancias();
    java.lang.String str5 = dicaComoNaoTerDificuldade0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str3.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str5.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

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
    metaDica22.setTitulo("models.DicaConselho");
    boolean b30 = metaDica22.recebeuDenunciaDe("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "models.MetaDica"+ "'", str24.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getCategoria();
    models.Usuario usuario7 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    usuario7.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho13 = new models.DicaConselho("", usuario7, "models.DicaConselho");
    int i14 = dicaComoNaoTerDificuldade0.compareTo((models.IDica)dicaConselho13);
    dicaConselho13.setConselho("0");
    java.lang.String str17 = dicaConselho13.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str2.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "models.DicaConselho"+ "'", str17.equals("models.DicaConselho"));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    disciplina1.setNome("models.DicaConselho");
    java.util.List<models.Tema> list_tema8 = disciplina1.getTemas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema8);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    dicaMaterialUtil0.setId((long)(short)100);
    models.Usuario usuario3 = new models.Usuario();
    dicaMaterialUtil0.setAutor(usuario3);
    int i5 = usuario3.getId();
    usuario3.setLogin("models.DicaDisciplinasAnteriores");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

    models.Disciplina disciplina1 = new models.Disciplina("models.MetaDica");
    java.lang.Long long2 = disciplina1.getId();
    java.util.List<models.MetaDica> list_metaDica3 = disciplina1.getMetadicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica3);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia6 = new models.Concordancia(usuario2);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores9 = new models.DicaDisciplinasAnteriores("models.DicaDisciplinasAnteriores", usuario2, "", "models.DicaDisciplinasAnteriores");
    dicaDisciplinasAnteriores9.setRazoesDisciplinas("Material \u00FAtil");
    models.Usuario usuario15 = new models.Usuario("", "hi!", "models.DicaConselho");
    boolean b17 = usuario15.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    boolean b18 = dicaDisciplinasAnteriores9.usuarioAtualVotouNestaDica(usuario15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

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
    java.lang.String str12 = dicaComoNaoTerDificuldade7.getTipo();
    java.lang.String str13 = dicaComoNaoTerDificuldade7.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str8.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str12.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str13.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

    models.Disciplina disciplina1 = new models.Disciplina("Meta Dica");
    disciplina1.setId((java.lang.Long)100L);
    models.Tema tema5 = new models.Tema("");
    java.util.List<models.IDica> list_iDica6 = tema5.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i7 = tema5.getAvaliacoes();
    int i8 = tema5.getNumeroDicas();
    tema5.ordenarTopConcordancias();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia11 = dicaMaterialUtil10.getListaDiscordancia();
    boolean b12 = tema5.equals((java.lang.Object)list_discordancia11);
    models.Disciplina disciplina14 = new models.Disciplina("models.MetaDica");
    java.lang.String str15 = disciplina14.getNome();
    boolean b16 = tema5.equals((java.lang.Object)disciplina14);
    boolean b17 = disciplina1.equals((java.lang.Object)tema5);
    java.util.List<models.Tema> list_tema18 = disciplina1.getTemas();
    int i19 = disciplina1.getNumeroMetaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "models.MetaDica"+ "'", str15.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    java.util.List<models.IDica> list_iDica3 = tema1.getDicas();
    tema1.ordenarTopConcordancias();
    models.Disciplina disciplina6 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica7 = disciplina6.getMetadicas();
    disciplina6.setId((java.lang.Long)10L);
    models.Usuario usuario12 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil15 = new models.DicaMaterialUtil("", usuario12, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica17 = new models.MetaDica("hi!", usuario12, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina6.addMetaDica(metaDica17);
    java.lang.String str19 = metaDica17.getTipo();
    metaDica17.addDenuncia("hi!");
    metaDica17.setComentario("models.MetaDica");
    long long24 = metaDica17.getId();
    models.Usuario usuario25 = metaDica17.getAutor();
    java.util.List<models.IDica> list_iDica26 = metaDica17.getListaDicas();
    boolean b27 = tema1.equals((java.lang.Object)metaDica17);
    java.lang.String str28 = metaDica17.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "models.MetaDica"+ "'", str19.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long24 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Meta Dica"+ "'", str28.equals("Meta Dica"));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

    models.Disciplina disciplina1 = new models.Disciplina("");
    int i2 = disciplina1.getNumeroMetaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    java.lang.String str6 = dicaComoNaoTerDificuldade0.getTipo();
    models.Usuario usuario10 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str11 = usuario10.getLogin();
    dicaComoNaoTerDificuldade0.setAutor(usuario10);
    dicaComoNaoTerDificuldade0.addDenuncia("");
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaConselho");
    java.lang.String str17 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("Disciplinas anteriores que te ajudar\u00E3o aqui");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str6.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaConselho"+ "'", str11.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str17.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

    models.Usuario usuario0 = null;
    models.Discordancia discordancia2 = new models.Discordancia(usuario0, "hi!");
    discordancia2.setRazaoDiscordancia("");
    int i5 = discordancia2.getId();
    discordancia2.setRazaoDiscordancia("");
    int i8 = discordancia2.getId();
    java.lang.String str9 = discordancia2.getRazaoDiscordancia();
    java.lang.String str10 = discordancia2.getRazaoDiscordancia();
    java.lang.String str11 = discordancia2.getRazaoDiscordancia();
    int i12 = discordancia2.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    usuario4.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho10 = new models.DicaConselho("", usuario4, "models.DicaConselho");
    java.lang.String str11 = dicaConselho10.getConselho();
    int i12 = dicaConselho10.getNumeroDenuncias();
    java.lang.String str13 = dicaConselho10.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaConselho"+ "'", str11.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "models.DicaConselho"+ "'", str13.equals("models.DicaConselho"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario5.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("0,0", usuario5, "hi!", "models.DicaDisciplinasAnteriores");
    usuario5.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    usuario5.setSenha("models.DicaConselho");
    models.DicaMaterialUtil dicaMaterialUtil17 = new models.DicaMaterialUtil("Conselho", usuario5, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", "models.DicaComoNaoTerDificuldade");
    dicaMaterialUtil17.setDominioURL("Material \u00FAtil");

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getTipo();
    long long3 = dicaConselho0.getId();
    models.DicaMaterialUtil dicaMaterialUtil4 = new models.DicaMaterialUtil();
    boolean b5 = dicaMaterialUtil4.isVotavel();
    boolean b6 = dicaMaterialUtil4.isVotavel();
    java.lang.String str7 = dicaMaterialUtil4.getNomeURL();
    models.Usuario usuario12 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica14 = new models.MetaDica("models.MetaDica", usuario12, "models.DicaConselho");
    models.Concordancia concordancia15 = new models.Concordancia(usuario12);
    models.Usuario usuario16 = concordancia15.getAutor();
    dicaMaterialUtil4.adicionaConcordancia(concordancia15);
    dicaConselho0.adicionaConcordancia(concordancia15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "models.DicaConselho"+ "'", str2.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long3 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario16);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    boolean b4 = disciplina1.equals((java.lang.Object)10.0f);
    disciplina1.setId((java.lang.Long)100L);
    int i7 = disciplina1.getNumeroMetaDicasVisiveis();
    int i8 = disciplina1.getNumeroMetaDicasVisiveis();
    int i9 = disciplina1.getNumeroMetaDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    java.util.List<models.IDica> list_iDica6 = metaDica0.getListaDicas();
    java.lang.String str7 = metaDica0.getComentario();
    java.util.List<models.IDica> list_iDica8 = metaDica0.getListaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica8);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    long long6 = metaDica0.getId();
    int i7 = metaDica0.getNumeroVotos();
    java.util.List<models.IDica> list_iDica8 = metaDica0.getListaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica8);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    models.MetaDica metaDica1 = new models.MetaDica();
    models.Discordancia discordancia2 = new models.Discordancia();
    metaDica1.adicionaDiscordancia(discordancia2);
    dicaMaterialUtil0.adicionaDiscordancia(discordancia2);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    int i3 = tema1.getNumeroDicas();
    java.util.List<models.IDica> list_iDica4 = tema1.getDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica4);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

    models.Usuario usuario3 = new models.Usuario("models.DicaConselho", "", "models.DicaDisciplinasAnteriores");
    usuario3.setLogin("models.DicaMaterialUtil");

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Usuario usuario2 = null;
    models.Discordancia discordancia4 = new models.Discordancia(usuario2, "");
    models.Usuario usuario5 = null;
    discordancia4.setAutor(usuario5);
    int i7 = discordancia4.getId();
    dicaDisciplinasAnteriores0.adicionaDiscordancia(discordancia4);
    dicaDisciplinasAnteriores0.setNomesDisciplinas("");
    int i11 = dicaDisciplinasAnteriores0.getNumeroDiscordancia();
    dicaDisciplinasAnteriores0.setId((long)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia5 = new models.Discordancia(usuario3, "");
    int i6 = usuario3.getId();
    java.lang.String str7 = usuario3.getLogin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaConselho"+ "'", str7.equals("models.DicaConselho"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    int i5 = disciplina1.getNumeroMetaDicas();
    models.Usuario usuario7 = new models.Usuario();
    usuario7.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia10 = new models.Concordancia(usuario7);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores13 = new models.DicaDisciplinasAnteriores("", usuario7, "Meta Dica", "0,0");
    boolean b15 = dicaDisciplinasAnteriores13.recebeuDenunciaDe("models.DicaDisciplinasAnteriores");
    boolean b16 = disciplina1.equals((java.lang.Object)dicaDisciplinasAnteriores13);
    java.lang.String str17 = dicaDisciplinasAnteriores13.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str17.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica7 = new models.MetaDica("models.MetaDica", usuario5, "models.DicaConselho");
    models.Concordancia concordancia8 = new models.Concordancia(usuario5);
    models.MetaDica metaDica10 = new models.MetaDica("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario5, "hi!");

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    int i3 = tema1.getNumeroDicas();
    tema1.addAvaliacao("", (java.lang.Integer)(-1));
    java.lang.String str7 = tema1.getNome();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i8 = tema1.getAvaliacoes();
    java.util.List<models.IDica> list_iDica9 = tema1.getDicas();
    int i10 = tema1.getNumeroAvaliacoes();
    double d11 = tema1.getMedia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-1.0d));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Concordancia concordancia3 = new models.Concordancia();
    dicaDisciplinasAnteriores0.adicionaConcordancia(concordancia3);
    int i5 = dicaDisciplinasAnteriores0.getNumeroDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

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
    java.lang.String str21 = metaDica12.getTipo();
    java.util.List<models.Concordancia> list_concordancia22 = metaDica12.getListaConcordancia();
    int i23 = metaDica12.getNumeroDicasNaMetaDica();
    metaDica12.setComentario("models.DicaComoNaoTerDificuldade");
    java.util.Set<models.Usuario> set_usuario26 = metaDica12.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "models.MetaDica"+ "'", str19.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "models.MetaDica"+ "'", str21.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario26);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getCategoria();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str7 = usuario6.getLogin();
    dicaConselho0.setAutor(usuario6);
    java.util.List<models.Discordancia> list_discordancia9 = dicaConselho0.getListaDiscordancia();
    java.util.Set<models.Usuario> set_usuario10 = dicaConselho0.getListaUsuariosQueVotaram();
    dicaConselho0.setTitulo("models.DicaDisciplinasAnteriores");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaConselho"+ "'", str7.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario10);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    java.lang.String str4 = disciplina1.getNome();
    disciplina1.setId((java.lang.Long)(-1L));
    java.util.List<models.MetaDica> list_metaDica7 = disciplina1.getMetadicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica7);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    usuario5.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho11 = new models.DicaConselho("", usuario5, "models.DicaConselho");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade13 = new models.DicaComoNaoTerDificuldade("Meta Dica", usuario5, "models.DicaComoNaoTerDificuldade");
    models.Usuario usuario14 = dicaComoNaoTerDificuldade13.getAutor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario14);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    dicaConselho0.setConselho("models.DicaConselho");
    java.lang.String str4 = dicaConselho0.getConselho();
    int i5 = dicaConselho0.getNumeroConcordancias();
    models.DicaMaterialUtil dicaMaterialUtil6 = new models.DicaMaterialUtil();
    boolean b7 = dicaMaterialUtil6.isVotavel();
    boolean b8 = dicaMaterialUtil6.isVotavel();
    dicaMaterialUtil6.setNomeURL("hi!");
    dicaMaterialUtil6.setDominioURL("models.DicaComoNaoTerDificuldade");
    models.Usuario usuario13 = null;
    models.Discordancia discordancia15 = new models.Discordancia(usuario13, "");
    models.Usuario usuario16 = null;
    discordancia15.setAutor(usuario16);
    int i18 = discordancia15.getId();
    java.lang.String str19 = discordancia15.getRazaoDiscordancia();
    dicaMaterialUtil6.adicionaDiscordancia(discordancia15);
    discordancia15.setRazaoDiscordancia("models.MetaDica");
    dicaConselho0.adicionaDiscordancia(discordancia15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.DicaConselho"+ "'", str4.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

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
    dicaMaterialUtil0.setDominioURL("models.DicaMaterialUtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str12.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Material \u00FAtil"+ "'", str15.equals("Material \u00FAtil"));

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    models.Disciplina disciplina1 = new models.Disciplina("models.MetaDica");
    disciplina1.setNome("Meta Dica");
    java.util.List<models.Tema> list_tema4 = disciplina1.getTemas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema4);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    boolean b6 = metaDica0.isVisivel();
    java.util.List<models.IDica> list_iDica7 = metaDica0.getListaDicas();
    int i8 = metaDica0.getNumeroDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    usuario3.setLogin("models.DicaMaterialUtil");

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Usuario usuario2 = null;
    models.Discordancia discordancia4 = new models.Discordancia(usuario2, "");
    models.Usuario usuario5 = null;
    discordancia4.setAutor(usuario5);
    int i7 = discordancia4.getId();
    dicaDisciplinasAnteriores0.adicionaDiscordancia(discordancia4);
    discordancia4.setRazaoDiscordancia("Conselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setNomeURL("hi!");
    dicaMaterialUtil0.setDominioURL("models.DicaComoNaoTerDificuldade");
    java.lang.String str7 = dicaMaterialUtil0.getDominioURL();
    int i8 = dicaMaterialUtil0.getNumeroDiscordancia();
    java.lang.String str9 = dicaMaterialUtil0.getDominioURL();
    java.util.List<models.Concordancia> list_concordancia10 = dicaMaterialUtil0.getListaConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str7.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str9.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia10);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    int i3 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    tema1.addAvaliacao("hi!", (java.lang.Integer)0);
    tema1.addAvaliacao("models.DicaDisciplinasAnteriores", (java.lang.Integer)10);
    java.lang.Long long11 = tema1.getId();
    tema1.addAvaliacao("Material \u00FAtil", (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long11);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    dicaConselho0.addDenuncia("models.MetaDica");
    java.util.List<models.Discordancia> list_discordancia3 = dicaConselho0.getListaDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia3);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

    models.Discordancia discordancia0 = new models.Discordancia();
    discordancia0.setRazaoDiscordancia("models.MetaDica");
    java.lang.String str3 = discordancia0.getRazaoDiscordancia();
    discordancia0.setRazaoDiscordancia("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.MetaDica"+ "'", str3.equals("models.MetaDica"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str2.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    dicaMaterialUtil0.setId((long)(short)100);
    models.Usuario usuario3 = new models.Usuario();
    dicaMaterialUtil0.setAutor(usuario3);
    java.lang.String str5 = dicaMaterialUtil0.getNomeURL();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores6 = new models.DicaDisciplinasAnteriores();
    java.lang.String str7 = dicaDisciplinasAnteriores6.getRazoesDisciplinas();
    java.lang.String str8 = dicaDisciplinasAnteriores6.getRazoesDisciplinas();
    models.Concordancia concordancia9 = new models.Concordancia();
    dicaDisciplinasAnteriores6.adicionaConcordancia(concordancia9);
    dicaMaterialUtil0.adicionaConcordancia(concordancia9);
    java.lang.String str12 = dicaMaterialUtil0.getCategoria();
    dicaMaterialUtil0.setId((long)(byte)1);
    int i15 = dicaMaterialUtil0.getNumeroDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Material \u00FAtil"+ "'", str12.equals("Material \u00FAtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.MetaDica> list_metaDica5 = disciplina1.getMetadicas();
    models.Disciplina disciplina7 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica8 = disciplina7.getMetadicas();
    disciplina7.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema11 = disciplina7.getTemas();
    disciplina7.setNome("models.DicaConselho");
    java.lang.String str14 = disciplina7.getNome();
    models.Disciplina disciplina16 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica17 = disciplina16.getMetadicas();
    disciplina16.setId((java.lang.Long)10L);
    models.Usuario usuario22 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil25 = new models.DicaMaterialUtil("", usuario22, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica27 = new models.MetaDica("hi!", usuario22, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina16.addMetaDica(metaDica27);
    java.lang.String str29 = metaDica27.getTipo();
    int i30 = metaDica27.getNumeroDicasNaMetaDica();
    disciplina7.addMetaDica(metaDica27);
    models.Usuario usuario32 = metaDica27.getAutor();
    java.lang.String str33 = metaDica27.getTipo();
    disciplina1.addMetaDica(metaDica27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.DicaConselho"+ "'", str14.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "models.MetaDica"+ "'", str29.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "models.MetaDica"+ "'", str33.equals("models.MetaDica"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

    models.Disciplina disciplina1 = new models.Disciplina("0,0");
    models.Usuario usuario3 = new models.Usuario();
    usuario3.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia6 = new models.Concordancia(usuario3);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores9 = new models.DicaDisciplinasAnteriores("", usuario3, "Meta Dica", "0,0");
    boolean b11 = dicaDisciplinasAnteriores9.recebeuDenunciaDe("models.DicaDisciplinasAnteriores");
    boolean b12 = disciplina1.equals((java.lang.Object)"models.DicaDisciplinasAnteriores");
    disciplina1.setNome("models.MetaDica");
    java.lang.String str15 = disciplina1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "models.MetaDica"+ "'", str15.equals("models.MetaDica"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

    models.Usuario usuario0 = new models.Usuario();
    usuario0.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Discordancia discordancia4 = new models.Discordancia(usuario0, "hi!");
    models.Concordancia concordancia5 = new models.Concordancia(usuario0);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Concordancia concordancia4 = new models.Concordancia(usuario3);
    models.Disciplina disciplina6 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica7 = disciplina6.getMetadicas();
    disciplina6.setId((java.lang.Long)1L);
    models.Tema tema11 = new models.Tema("");
    double d12 = tema11.getMedia();
    int i13 = tema11.getNumeroDicas();
    models.Tema tema14 = disciplina6.addTema(tema11);
    boolean b16 = tema11.isAvaliado("");
    int i17 = tema11.getNumeroDicasVisiveis();
    boolean b18 = usuario3.equals((java.lang.Object)tema11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

    models.Tema tema1 = new models.Tema("models.MetaDica");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    tema1.setId((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

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
    metaDica12.setComentario("models.DicaDisciplinasAnteriores");
    metaDica12.setTitulo("0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario20);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("");
    int i4 = dicaDisciplinasAnteriores0.getNumeroDiscordancia();
    dicaDisciplinasAnteriores0.setNomesDisciplinas("0,0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    disciplina1.setId((java.lang.Long)1L);
    disciplina1.setId((java.lang.Long)1L);
    disciplina1.setNome("Conselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema5);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    disciplina1.setNome("models.DicaConselho");
    models.Usuario usuario10 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil13 = new models.DicaMaterialUtil("", usuario10, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica15 = new models.MetaDica("hi!", usuario10, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i16 = metaDica15.getNumeroDenuncias();
    java.lang.String str17 = metaDica15.getComentario();
    boolean b18 = metaDica15.isVotavel();
    disciplina1.addMetaDica(metaDica15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str17.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.DicaDisciplinasAnteriores", usuario5, "Meta Dica", "models.MetaDica");
    int i10 = dicaMaterialUtil9.getNumeroDenuncias();
    java.lang.String str11 = dicaMaterialUtil9.getTipo();
    models.Usuario usuario12 = dicaMaterialUtil9.getAutor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaMaterialUtil"+ "'", str11.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario12);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    int i3 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil();
    boolean b6 = dicaMaterialUtil5.isVotavel();
    dicaMaterialUtil5.setTitulo("models.DicaMaterialUtil");
    int i9 = dicaMaterialUtil5.getNumeroDiscordancia();
    java.lang.String str10 = dicaMaterialUtil5.getNomeURL();
    boolean b11 = tema1.equals((java.lang.Object)dicaMaterialUtil5);
    boolean b13 = tema1.isAvaliado("Material \u00FAtil");
    boolean b15 = tema1.isAvaliado("models.MetaDica");
    int i16 = tema1.getNumeroAvaliacoes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setNomeURL("hi!");
    dicaMaterialUtil0.setDominioURL("models.DicaComoNaoTerDificuldade");
    models.Usuario usuario7 = null;
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    models.Usuario usuario10 = null;
    discordancia9.setAutor(usuario10);
    int i12 = discordancia9.getId();
    java.lang.String str13 = discordancia9.getRazaoDiscordancia();
    dicaMaterialUtil0.adicionaDiscordancia(discordancia9);
    discordancia9.setRazaoDiscordancia("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }

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
    boolean b26 = metaDica21.isVotavel();
    java.lang.String str27 = metaDica21.getComentario();
    java.lang.String str28 = metaDica21.getCategoria();
    int i29 = metaDica21.getNumeroConcordancias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "models.MetaDica"+ "'", str23.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str27.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Meta Dica"+ "'", str28.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    dicaMaterialUtil0.setId((long)(short)100);
    java.lang.String str3 = dicaMaterialUtil0.getTipo();
    dicaMaterialUtil0.setNomeURL("models.DicaComoNaoTerDificuldade");
    java.util.List<models.Discordancia> list_discordancia6 = dicaMaterialUtil0.getListaDiscordancia();
    boolean b7 = dicaMaterialUtil0.isVisivel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaMaterialUtil"+ "'", str3.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia6 = new models.Concordancia(usuario2);
    models.DicaConselho dicaConselho8 = new models.DicaConselho("models.MetaDica", usuario2, "hi!");
    java.lang.String str9 = dicaConselho8.getTipo();
    java.lang.String str10 = dicaConselho8.getConselho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaConselho"+ "'", str9.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }

    models.Usuario usuario3 = new models.Usuario("Disciplinas anteriores que te ajudar\u00E3o aqui", "models.DicaDisciplinasAnteriores", "Conselho");

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.lang.String str3 = tema1.getNome();
    boolean b5 = tema1.isAvaliado("models.DicaComoNaoTerDificuldade");
    tema1.addAvaliacao("models.MetaDica", (java.lang.Integer)1);
    java.util.List<models.IDica> list_iDica9 = tema1.getDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica9);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    java.lang.String str3 = dicaMaterialUtil0.getNomeURL();
    models.Usuario usuario8 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica10 = new models.MetaDica("models.MetaDica", usuario8, "models.DicaConselho");
    models.Concordancia concordancia11 = new models.Concordancia(usuario8);
    models.Usuario usuario12 = concordancia11.getAutor();
    dicaMaterialUtil0.adicionaConcordancia(concordancia11);
    int i14 = concordancia11.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    java.lang.String str3 = dicaDisciplinasAnteriores0.getTipo();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores4 = new models.DicaDisciplinasAnteriores();
    java.lang.String str5 = dicaDisciplinasAnteriores4.getRazoesDisciplinas();
    models.Usuario usuario6 = null;
    models.Discordancia discordancia8 = new models.Discordancia(usuario6, "");
    models.Usuario usuario9 = null;
    discordancia8.setAutor(usuario9);
    int i11 = discordancia8.getId();
    dicaDisciplinasAnteriores4.adicionaDiscordancia(discordancia8);
    dicaDisciplinasAnteriores4.setNomesDisciplinas("");
    int i15 = dicaDisciplinasAnteriores0.compareTo((models.IDica)dicaDisciplinasAnteriores4);
    java.lang.String str16 = dicaDisciplinasAnteriores4.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str3.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str16.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    boolean b6 = usuario4.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia7 = new models.Concordancia(usuario4);
    models.MetaDica metaDica9 = new models.MetaDica("models.DicaMaterialUtil", usuario4, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    usuario4.setNome("Meta Dica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }

    models.Disciplina disciplina1 = new models.Disciplina("0");
    disciplina1.setId((java.lang.Long)(-1L));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.calculaIndiceConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0,0"+ "'", str3.equals("0,0"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    double d7 = tema6.getMedia();
    int i8 = tema6.getNumeroDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    boolean b11 = tema6.isAvaliado("");
    java.lang.Long long12 = tema6.getId();
    java.lang.Long long13 = tema6.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long13);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    dicaDisciplinasAnteriores0.setId((long)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    models.Disciplina disciplina7 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica8 = disciplina7.getMetadicas();
    disciplina7.setId((java.lang.Long)1L);
    models.Tema tema12 = new models.Tema("");
    double d13 = tema12.getMedia();
    int i14 = tema12.getNumeroDicas();
    models.Tema tema15 = disciplina7.addTema(tema12);
    boolean b17 = tema12.isAvaliado("");
    java.lang.Long long18 = tema12.getId();
    tema12.addAvaliacao("models.DicaConselho", (java.lang.Integer)100);
    int i22 = tema12.getNumeroAvaliacoes();
    int i23 = tema12.getNumeroDicasVisiveis();
    models.Tema tema24 = disciplina1.addTema(tema12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema24);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i4 = tema1.getAvaliacoes();
    int i5 = tema1.getNumeroAvaliacoes();
    double d6 = tema1.getMediana();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    java.lang.String str15 = metaDica12.getTitulo();
    java.lang.String str16 = metaDica12.getComentario();
    boolean b18 = metaDica12.recebeuDenunciaDe("models.DicaComoNaoTerDificuldade");
    java.util.List<models.Discordancia> list_discordancia19 = metaDica12.getListaDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str16.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia19);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    java.lang.String str2 = dicaMaterialUtil0.getNomeURL();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia8 = new models.Discordancia(usuario6, "");
    usuario6.setNome("models.DicaMaterialUtil");
    java.lang.String str11 = usuario6.getLogin();
    java.lang.String str12 = usuario6.getLogin();
    dicaMaterialUtil0.setAutor(usuario6);
    java.lang.String str14 = usuario6.getLogin();
    models.Discordancia discordancia16 = new models.Discordancia(usuario6, "models.DicaDisciplinasAnteriores");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaConselho"+ "'", str11.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaConselho"+ "'", str12.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.DicaConselho"+ "'", str14.equals("models.DicaConselho"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    int i4 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    models.DicaMaterialUtil dicaMaterialUtil6 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia7 = dicaMaterialUtil6.getListaDiscordancia();
    boolean b8 = tema1.equals((java.lang.Object)list_discordancia7);
    models.Disciplina disciplina10 = new models.Disciplina("models.MetaDica");
    java.lang.String str11 = disciplina10.getNome();
    boolean b12 = tema1.equals((java.lang.Object)disciplina10);
    java.util.List<models.Tema> list_tema13 = disciplina10.getTemas();
    java.util.List<models.Tema> list_tema14 = disciplina10.getTemas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.MetaDica"+ "'", str11.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema14);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia1 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    dicaDisciplinasAnteriores0.setNomesDisciplinas("Conselho");
    java.lang.String str4 = dicaDisciplinasAnteriores0.getCategoria();
    java.lang.String str5 = dicaDisciplinasAnteriores0.getTitulo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str4.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }

    models.Tema tema1 = new models.Tema("Disciplinas anteriores que te ajudar\u00E3o aqui");

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }

    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica7 = new models.MetaDica("models.MetaDica", usuario5, "models.DicaConselho");
    models.Concordancia concordancia8 = new models.Concordancia(usuario5);
    boolean b10 = usuario5.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil13 = new models.DicaMaterialUtil("models.DicaDisciplinasAnteriores", usuario5, "", "Conselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    int i7 = metaDica6.getNumeroDenuncias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade0.setAutor(usuario4);
    java.util.Set<models.Usuario> set_usuario6 = dicaComoNaoTerDificuldade0.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario6);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getTipo();
    int i4 = dicaConselho0.getNumeroDiscordancia();
    dicaConselho0.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str7 = dicaConselho0.getTipo();
    java.lang.String str8 = dicaConselho0.getTipo();
    java.lang.String str9 = dicaConselho0.getCategoria();
    dicaConselho0.setConselho("models.DicaDisciplinasAnteriores");
    java.lang.String str12 = dicaConselho0.getTipo();
    java.lang.String str13 = dicaConselho0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaConselho"+ "'", str7.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Conselho"+ "'", str9.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaConselho"+ "'", str12.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "models.DicaConselho"+ "'", str13.equals("models.DicaConselho"));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getCategoria();
    models.Usuario usuario7 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    usuario7.setNome("Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores14 = new models.DicaDisciplinasAnteriores("", usuario7, "0,0", "hi!");
    dicaComoNaoTerDificuldade0.setAutor(usuario7);
    java.lang.String str16 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    java.lang.String str17 = dicaComoNaoTerDificuldade0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str2.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str17.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }

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
    usuario8.setSenha("models.DicaMaterialUtil");
    usuario8.setNome("models.DicaDisciplinasAnteriores");
    models.DicaConselho dicaConselho19 = new models.DicaConselho("0,0", usuario8, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.DicaConselho"+ "'", str4.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }

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
    dicaMaterialUtil0.setDominioURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str18 = dicaMaterialUtil0.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str12.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Material \u00FAtil"+ "'", str15.equals("Material \u00FAtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }

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
    double d15 = tema6.getMediana();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores16 = new models.DicaDisciplinasAnteriores();
    java.lang.String str17 = dicaDisciplinasAnteriores16.getRazoesDisciplinas();
    tema6.addDica((models.IDica)dicaDisciplinasAnteriores16);
    java.lang.String str19 = dicaDisciplinasAnteriores16.getRazoesDisciplinas();
    boolean b20 = dicaDisciplinasAnteriores16.isVisivel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    java.util.List<models.IDica> list_iDica7 = tema6.getDicas();
    java.util.List<models.IDica> list_iDica8 = tema6.getDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    boolean b11 = tema9.isAvaliado("models.MetaDica");
    java.util.List<models.IDica> list_iDica12 = tema9.getDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica12);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    double d3 = tema1.getMediana();
    int i4 = tema1.getNumeroDicasVisiveis();
    java.util.List<models.IDica> list_iDica5 = tema1.getDicas();
    boolean b7 = tema1.isAvaliado("Conselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    int i9 = dicaDisciplinasAnteriores8.getNumeroConcordancias();
    java.lang.String str10 = dicaDisciplinasAnteriores8.getTitulo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str10.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str4 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    models.Concordancia concordancia5 = new models.Concordancia();
    dicaComoNaoTerDificuldade0.adicionaConcordancia(concordancia5);
    java.util.Set<models.Usuario> set_usuario7 = dicaComoNaoTerDificuldade0.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario7);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    int i6 = dicaComoNaoTerDificuldade3.getNumeroConcordancias();
    java.lang.String str7 = dicaComoNaoTerDificuldade3.getTitulo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }

    models.DicaMaterialUtil dicaMaterialUtil1 = new models.DicaMaterialUtil();
    boolean b2 = dicaMaterialUtil1.isVotavel();
    java.lang.String str3 = dicaMaterialUtil1.getNomeURL();
    models.Usuario usuario7 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    usuario7.setNome("models.DicaMaterialUtil");
    java.lang.String str12 = usuario7.getLogin();
    java.lang.String str13 = usuario7.getLogin();
    dicaMaterialUtil1.setAutor(usuario7);
    models.Discordancia discordancia16 = new models.Discordancia(usuario7, "models.DicaComoNaoTerDificuldade");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade18 = new models.DicaComoNaoTerDificuldade("0", usuario7, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaConselho"+ "'", str12.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "models.DicaConselho"+ "'", str13.equals("models.DicaConselho"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }

    models.Usuario usuario4 = new models.Usuario("Conselho", "models.DicaComoNaoTerDificuldade", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica6 = new models.MetaDica("Material \u00FAtil", usuario4, "hi!");

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    disciplina1.setNome("");
    disciplina1.setId((java.lang.Long)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.lang.Long long2 = disciplina1.getId();
    java.lang.String str3 = disciplina1.getNome();
    disciplina1.setId((java.lang.Long)0L);
    java.lang.String str6 = disciplina1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }

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
    double d15 = tema6.getMediana();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores16 = new models.DicaDisciplinasAnteriores();
    java.lang.String str17 = dicaDisciplinasAnteriores16.getRazoesDisciplinas();
    tema6.addDica((models.IDica)dicaDisciplinasAnteriores16);
    models.Usuario usuario22 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    boolean b24 = usuario22.equals((java.lang.Object)'4');
    dicaDisciplinasAnteriores16.setAutor(usuario22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    int i3 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    models.DicaConselho dicaConselho5 = new models.DicaConselho();
    java.lang.String str6 = dicaConselho5.getCategoria();
    boolean b7 = dicaConselho5.isVotavel();
    java.lang.String str8 = dicaConselho5.getTipo();
    int i9 = dicaConselho5.getNumeroDiscordancia();
    dicaConselho5.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    models.Usuario usuario12 = new models.Usuario();
    usuario12.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia15 = new models.Concordancia(usuario12);
    java.lang.String str16 = usuario12.getLogin();
    dicaConselho5.setAutor(usuario12);
    usuario12.setSenha("models.DicaMaterialUtil");
    boolean b20 = tema1.equals((java.lang.Object)"models.DicaMaterialUtil");
    java.lang.String str21 = tema1.getNome();
    int i22 = tema1.getNumeroDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Conselho"+ "'", str6.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores0.setAutor(usuario5);
    dicaDisciplinasAnteriores0.setId(0L);
    java.lang.String str9 = dicaDisciplinasAnteriores0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str9.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    disciplina1.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    int i6 = disciplina1.getNumeroMetaDicasVisiveis();
    java.util.List<models.MetaDica> list_metaDica7 = disciplina1.getMetadicas();
    models.Tema tema9 = new models.Tema("");
    int i10 = tema9.getNumeroDicas();
    tema9.addAvaliacao("0,0", (java.lang.Integer)(-1));
    models.Tema tema14 = disciplina1.addTema(tema9);
    int i15 = tema14.getNumeroDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    java.lang.String str9 = dicaDisciplinasAnteriores8.getCategoria();
    dicaDisciplinasAnteriores8.setRazoesDisciplinas("");
    java.lang.String str12 = dicaDisciplinasAnteriores8.getRazoesDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str9.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    dicaMaterialUtil0.setId((long)(short)100);
    dicaMaterialUtil0.setNomeURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    dicaMaterialUtil0.setId((long)0);
    java.lang.String str7 = dicaMaterialUtil0.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str7.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.MetaDica> list_metaDica5 = disciplina1.getMetadicas();
    java.util.List<models.Tema> list_tema6 = disciplina1.getTemas();
    models.Tema tema8 = new models.Tema("");
    double d9 = tema8.getMedia();
    java.util.List<models.IDica> list_iDica10 = tema8.getDicas();
    int i11 = tema8.getNumeroDicasVisiveis();
    int i12 = tema8.getNumeroAvaliacoes();
    int i13 = tema8.getNumeroAvaliacoes();
    models.Tema tema14 = disciplina1.addTema(tema8);
    double d15 = tema14.getMedia();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i16 = tema14.getAvaliacoes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i16);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    dicaMaterialUtil0.setId((long)(short)100);
    java.lang.String str3 = dicaMaterialUtil0.getTipo();
    models.DicaMaterialUtil dicaMaterialUtil4 = new models.DicaMaterialUtil();
    boolean b5 = dicaMaterialUtil4.isVotavel();
    boolean b6 = dicaMaterialUtil4.isVotavel();
    java.lang.String str7 = dicaMaterialUtil4.getNomeURL();
    models.Usuario usuario12 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica14 = new models.MetaDica("models.MetaDica", usuario12, "models.DicaConselho");
    models.Concordancia concordancia15 = new models.Concordancia(usuario12);
    models.Usuario usuario16 = concordancia15.getAutor();
    dicaMaterialUtil4.adicionaConcordancia(concordancia15);
    models.Usuario usuario18 = concordancia15.getAutor();
    dicaMaterialUtil0.adicionaConcordancia(concordancia15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaMaterialUtil"+ "'", str3.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario18);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }

    models.Usuario usuario1 = new models.Usuario();
    java.lang.String str2 = usuario1.getNome();
    models.DicaConselho dicaConselho4 = new models.DicaConselho("models.DicaConselho", usuario1, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    usuario1.setSenha("models.DicaMaterialUtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario4.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("0,0", usuario4, "hi!", "models.DicaDisciplinasAnteriores");
    models.Discordancia discordancia11 = new models.Discordancia(usuario4, "models.DicaComoNaoTerDificuldade");
    int i12 = discordancia11.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }

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
    usuario18.setSenha("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str11.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str14.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "models.DicaConselho"+ "'", str19.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    models.Concordancia concordancia7 = new models.Concordancia(usuario4);
    models.Tema tema9 = new models.Tema("");
    java.util.List<models.IDica> list_iDica10 = tema9.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i11 = tema9.getAvaliacoes();
    int i12 = tema9.getNumeroDicas();
    tema9.ordenarTopConcordancias();
    double d14 = tema9.getMediana();
    java.lang.Long long15 = tema9.getId();
    java.lang.Long long16 = tema9.getId();
    boolean b17 = usuario4.equals((java.lang.Object)tema9);
    usuario4.setLogin("Conselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade7 = new models.DicaComoNaoTerDificuldade("", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    java.util.List<models.Concordancia> list_concordancia8 = dicaComoNaoTerDificuldade7.getListaConcordancia();
    models.Usuario usuario9 = null;
    dicaComoNaoTerDificuldade7.setAutor(usuario9);
    java.util.Set<models.Usuario> set_usuario11 = dicaComoNaoTerDificuldade7.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario11);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.List<models.IDica> list_iDica3 = tema1.getDicas();
    double d4 = tema1.getMediana();
    java.lang.String str5 = tema1.getNome();
    tema1.setId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia1 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    dicaDisciplinasAnteriores0.setNomesDisciplinas("Conselho");
    java.lang.String str4 = dicaDisciplinasAnteriores0.getCategoria();
    dicaDisciplinasAnteriores0.setTitulo("");
    java.lang.String str7 = dicaDisciplinasAnteriores0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str4.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str7.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    java.lang.String str3 = dicaMaterialUtil0.getNomeURL();
    models.Usuario usuario8 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica10 = new models.MetaDica("models.MetaDica", usuario8, "models.DicaConselho");
    models.Concordancia concordancia11 = new models.Concordancia(usuario8);
    models.Usuario usuario12 = concordancia11.getAutor();
    dicaMaterialUtil0.adicionaConcordancia(concordancia11);
    models.Usuario usuario14 = concordancia11.getAutor();
    int i15 = concordancia11.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }

    models.Tema tema0 = new models.Tema();
    tema0.ordenarTopConcordancias();
    tema0.addAvaliacao("", (java.lang.Integer)10);
    tema0.setId((java.lang.Long)10L);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }

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
    disciplina1.setId((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema17);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }

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
    java.lang.String str21 = metaDica12.calculaIndiceConcordancia();
    int i22 = metaDica12.getNumeroConcordancias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "models.MetaDica"+ "'", str19.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Meta Dica"+ "'", str20.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "0,0"+ "'", str21.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.MetaDica> list_metaDica5 = disciplina1.getMetadicas();
    java.util.List<models.Tema> list_tema6 = disciplina1.getTemas();
    models.Tema tema8 = new models.Tema("");
    double d9 = tema8.getMedia();
    java.util.List<models.IDica> list_iDica10 = tema8.getDicas();
    int i11 = tema8.getNumeroDicasVisiveis();
    int i12 = tema8.getNumeroAvaliacoes();
    int i13 = tema8.getNumeroAvaliacoes();
    models.Tema tema14 = disciplina1.addTema(tema8);
    java.util.List<models.MetaDica> list_metaDica15 = disciplina1.getMetadicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica15);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    int i4 = tema1.getNumeroDicas();
    boolean b6 = tema1.isAvaliado("0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }

    models.DicaConselho dicaConselho1 = new models.DicaConselho();
    java.lang.String str2 = dicaConselho1.getCategoria();
    dicaConselho1.setConselho("models.MetaDica");
    dicaConselho1.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str7 = dicaConselho1.getTipo();
    models.Usuario usuario8 = new models.Usuario();
    usuario8.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    java.lang.String str11 = usuario8.getLogin();
    dicaConselho1.setAutor(usuario8);
    usuario8.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade16 = new models.DicaComoNaoTerDificuldade("Material \u00FAtil", usuario8, "Material \u00FAtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaConselho"+ "'", str7.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }

    models.Usuario usuario2 = new models.Usuario();
    java.lang.String str3 = usuario2.getNome();
    models.DicaMaterialUtil dicaMaterialUtil6 = new models.DicaMaterialUtil("", usuario2, "Conselho", "models.DicaComoNaoTerDificuldade");
    usuario2.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaConselho dicaConselho10 = new models.DicaConselho("Conselho", usuario2, "models.DicaComoNaoTerDificuldade");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getTipo();
    int i4 = dicaConselho0.getNumeroDiscordancia();
    dicaConselho0.setTitulo("Disciplinas anteriores que te ajudar\u00E3o aqui");
    java.lang.String str7 = dicaConselho0.getTitulo();
    dicaConselho0.setId(100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str7.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.lang.String str3 = tema1.getNome();
    boolean b5 = tema1.isAvaliado("models.DicaComoNaoTerDificuldade");
    tema1.setId((java.lang.Long)0L);
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i8 = tema1.getAvaliacoes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i8);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getCategoria();
    models.Usuario usuario6 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.Concordancia concordancia7 = new models.Concordancia(usuario6);
    dicaConselho0.adicionaConcordancia(concordancia7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    usuario4.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho10 = new models.DicaConselho("", usuario4, "models.DicaConselho");
    java.lang.String str11 = usuario4.getLogin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaConselho"+ "'", str11.equals("models.DicaConselho"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    models.Concordancia concordancia7 = new models.Concordancia(usuario4);
    models.Tema tema9 = new models.Tema("");
    java.util.List<models.IDica> list_iDica10 = tema9.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i11 = tema9.getAvaliacoes();
    int i12 = tema9.getNumeroDicas();
    tema9.ordenarTopConcordancias();
    double d14 = tema9.getMediana();
    java.lang.Long long15 = tema9.getId();
    java.lang.Long long16 = tema9.getId();
    boolean b17 = usuario4.equals((java.lang.Object)tema9);
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i18 = tema9.getAvaliacoes();
    boolean b20 = tema9.isAvaliado("models.DicaComoNaoTerDificuldade");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    java.lang.String str6 = dicaComoNaoTerDificuldade0.getTipo();
    models.Usuario usuario7 = null;
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    discordancia9.setRazaoDiscordancia("hi!");
    dicaComoNaoTerDificuldade0.adicionaDiscordancia(discordancia9);
    int i13 = dicaComoNaoTerDificuldade0.getNumeroConcordancias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str6.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    int i15 = metaDica12.getNumeroDicasNaMetaDica();
    long long16 = metaDica12.getId();
    metaDica12.setComentario("");
    java.lang.String str19 = metaDica12.getTipo();
    java.lang.String str20 = metaDica12.getCategoria();
    int i21 = metaDica12.getNumeroDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "models.MetaDica"+ "'", str19.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Meta Dica"+ "'", str20.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setNomeURL("hi!");
    dicaMaterialUtil0.setDominioURL("models.DicaComoNaoTerDificuldade");
    models.Usuario usuario7 = new models.Usuario();
    usuario7.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia10 = new models.Concordancia(usuario7);
    models.Usuario usuario15 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia17 = new models.Discordancia(usuario15, "");
    int i18 = usuario15.getId();
    models.DicaMaterialUtil dicaMaterialUtil21 = new models.DicaMaterialUtil("", usuario15, "0,0", "");
    concordancia10.setAutor(usuario15);
    models.Usuario usuario23 = concordancia10.getAutor();
    dicaMaterialUtil0.adicionaConcordancia(concordancia10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario23);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    int i7 = usuario4.getId();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario4, "0,0", "");
    models.Usuario usuario11 = null;
    models.Discordancia discordancia13 = new models.Discordancia(usuario11, "hi!");
    discordancia13.setRazaoDiscordancia("");
    java.lang.String str16 = discordancia13.getRazaoDiscordancia();
    java.lang.String str17 = discordancia13.getRazaoDiscordancia();
    discordancia13.setRazaoDiscordancia("models.MetaDica");
    dicaMaterialUtil10.adicionaDiscordancia(discordancia13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getTipo();
    int i4 = dicaConselho0.getNumeroDiscordancia();
    dicaConselho0.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str7 = dicaConselho0.getTipo();
    java.lang.String str8 = dicaConselho0.getTipo();
    java.lang.String str9 = dicaConselho0.getCategoria();
    dicaConselho0.setConselho("models.DicaDisciplinasAnteriores");
    java.lang.String str12 = dicaConselho0.getTipo();
    java.lang.String str13 = dicaConselho0.getConselho();
    java.lang.String str14 = dicaConselho0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaConselho"+ "'", str7.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Conselho"+ "'", str9.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaConselho"+ "'", str12.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str13.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Conselho"+ "'", str14.equals("Conselho"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores1 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario2 = dicaDisciplinasAnteriores1.getListaUsuariosQueVotaram();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores1.setAutor(usuario6);
    java.lang.String str8 = usuario6.getLogin();
    usuario6.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    models.DicaConselho dicaConselho12 = new models.DicaConselho("Material \u00FAtil", usuario6, "");
    java.lang.String str13 = dicaConselho12.getConselho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    int i6 = dicaComoNaoTerDificuldade3.getNumeroConcordancias();
    dicaComoNaoTerDificuldade3.setNomeAssunto("hi!");
    int i9 = dicaComoNaoTerDificuldade3.getNumeroVotos();
    java.lang.String str10 = dicaComoNaoTerDificuldade3.getTipo();
    java.lang.String str11 = dicaComoNaoTerDificuldade3.getNomeAssunto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str10.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }

    models.Tema tema1 = new models.Tema("Material \u00FAtil");
    tema1.addAvaliacao("models.DicaConselho", (java.lang.Integer)100);
    tema1.addAvaliacao("Disciplinas anteriores que te ajudar\u00E3o aqui", (java.lang.Integer)(-1));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }

    models.Usuario usuario1 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil4 = new models.DicaMaterialUtil("", usuario1, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    dicaMaterialUtil4.setId(100L);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }

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
    java.lang.String str21 = metaDica12.getTipo();
    java.util.List<models.Concordancia> list_concordancia22 = metaDica12.getListaConcordancia();
    int i23 = metaDica12.getNumeroDicasNaMetaDica();
    java.lang.String str24 = metaDica12.getComentario();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "models.MetaDica"+ "'", str19.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "models.MetaDica"+ "'", str21.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "models.MetaDica"+ "'", str24.equals("models.MetaDica"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getTipo();
    int i4 = dicaConselho0.getNumeroDiscordancia();
    dicaConselho0.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str7 = dicaConselho0.getTipo();
    java.lang.String str8 = dicaConselho0.getTipo();
    java.lang.String str9 = dicaConselho0.getCategoria();
    dicaConselho0.setConselho("models.DicaDisciplinasAnteriores");
    java.lang.String str12 = dicaConselho0.getTipo();
    java.lang.String str13 = dicaConselho0.getCategoria();
    java.lang.String str14 = dicaConselho0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaConselho"+ "'", str7.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Conselho"+ "'", str9.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaConselho"+ "'", str12.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Conselho"+ "'", str13.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Conselho"+ "'", str14.equals("Conselho"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.MetaDica metaDica8 = new models.MetaDica("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario5, "models.DicaMaterialUtil");
    java.lang.String str9 = metaDica8.getComentario();
    java.lang.String str10 = metaDica8.getTipo();
    metaDica8.setComentario("models.DicaConselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaMaterialUtil"+ "'", str9.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "models.MetaDica"+ "'", str10.equals("models.MetaDica"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    double d3 = tema1.getMediana();
    int i4 = tema1.getNumeroDicasVisiveis();
    java.util.List<models.IDica> list_iDica5 = tema1.getDicas();
    int i6 = tema1.getNumeroDicas();
    java.lang.String str7 = tema1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    int i4 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    boolean b7 = tema1.equals((java.lang.Object)"Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i8 = tema1.getNumeroDicas();
    tema1.setId((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    boolean b6 = usuario4.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia7 = new models.Concordancia(usuario4);
    models.MetaDica metaDica9 = new models.MetaDica("models.DicaMaterialUtil", usuario4, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.util.List<models.IDica> list_iDica10 = metaDica9.getListaDicas();
    int i11 = metaDica9.getNumeroDicasNaMetaDica();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    int i6 = dicaComoNaoTerDificuldade0.getNumeroDiscordancia();
    models.Usuario usuario7 = new models.Usuario();
    java.lang.String str8 = usuario7.getNome();
    usuario7.setSenha("models.MetaDica");
    dicaComoNaoTerDificuldade0.setAutor(usuario7);
    boolean b12 = dicaComoNaoTerDificuldade0.isVisivel();
    java.util.List<models.Concordancia> list_concordancia13 = dicaComoNaoTerDificuldade0.getListaConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia13);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    java.lang.String str6 = dicaComoNaoTerDificuldade0.getTipo();
    models.Usuario usuario10 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str11 = usuario10.getLogin();
    dicaComoNaoTerDificuldade0.setAutor(usuario10);
    java.util.List<models.Discordancia> list_discordancia13 = dicaComoNaoTerDificuldade0.getListaDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str6.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaConselho"+ "'", str11.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia13);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia1 = dicaMaterialUtil0.getListaDiscordancia();
    java.lang.String str2 = dicaMaterialUtil0.getNomeURL();
    dicaMaterialUtil0.setTitulo("Meta Dica");
    dicaMaterialUtil0.setDominioURL("models.MetaDica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores3 = new models.DicaDisciplinasAnteriores();
    java.lang.String str4 = dicaDisciplinasAnteriores3.getRazoesDisciplinas();
    java.lang.String str5 = dicaDisciplinasAnteriores3.getRazoesDisciplinas();
    models.Concordancia concordancia6 = new models.Concordancia();
    dicaDisciplinasAnteriores3.adicionaConcordancia(concordancia6);
    dicaDisciplinasAnteriores0.adicionaConcordancia(concordancia6);
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("0");
    java.lang.String str11 = dicaDisciplinasAnteriores0.getTipo();
    long long12 = dicaDisciplinasAnteriores0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str11.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str4 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.DicaDisciplinasAnteriores", usuario5, "Meta Dica", "models.MetaDica");
    int i10 = dicaMaterialUtil9.getNumeroDenuncias();
    long long11 = dicaMaterialUtil9.getId();
    dicaMaterialUtil9.setId((long)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    dicaMaterialUtil0.setId((long)(short)100);
    java.lang.String str3 = dicaMaterialUtil0.getTipo();
    dicaMaterialUtil0.setNomeURL("models.DicaComoNaoTerDificuldade");
    java.util.List<models.Discordancia> list_discordancia6 = dicaMaterialUtil0.getListaDiscordancia();
    models.Usuario usuario7 = dicaMaterialUtil0.getAutor();
    dicaMaterialUtil0.setDominioURL("models.DicaDisciplinasAnteriores");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaMaterialUtil"+ "'", str3.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario7);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }

    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("models.MetaDica", usuario5, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    usuario5.setLogin("");
    models.Concordancia concordancia13 = new models.Concordancia(usuario5);
    models.Usuario usuario14 = concordancia13.getAutor();
    models.DicaMaterialUtil dicaMaterialUtil17 = new models.DicaMaterialUtil("", usuario14, "Conselho", "");
    models.Usuario usuario18 = dicaMaterialUtil17.getAutor();
    boolean b20 = dicaMaterialUtil17.recebeuDenunciaDe("");
    java.lang.String str21 = dicaMaterialUtil17.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Conselho"+ "'", str21.equals("Conselho"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }

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
    boolean b21 = metaDica12.isVisivel();
    metaDica12.setComentario("Meta Dica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "models.MetaDica"+ "'", str19.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }

    models.Tema tema1 = new models.Tema("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str2 = tema1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str2.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }

    models.Usuario usuario0 = new models.Usuario();
    usuario0.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Discordancia discordancia4 = new models.Discordancia(usuario0, "hi!");
    java.lang.String str5 = usuario0.getLogin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }

    models.Disciplina disciplina1 = new models.Disciplina("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.Long long2 = disciplina1.getId();
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade4 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario8 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade4.setAutor(usuario8);
    models.MetaDica metaDica11 = new models.MetaDica("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario8, "models.DicaMaterialUtil");
    java.lang.String str12 = metaDica11.getComentario();
    java.lang.String str13 = metaDica11.getTipo();
    int i14 = metaDica11.getNumeroConcordancias();
    java.util.List<models.IDica> list_iDica15 = metaDica11.getListaDicas();
    disciplina1.addMetaDica(metaDica11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaMaterialUtil"+ "'", str12.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "models.MetaDica"+ "'", str13.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica15);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }

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
    java.util.List<models.Tema> list_tema18 = disciplina1.getTemas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema18);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }

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
    dicaMaterialUtil0.setDominioURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    dicaMaterialUtil0.setDominioURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    dicaMaterialUtil0.setDominioURL("models.MetaDica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str12.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Material \u00FAtil"+ "'", str15.equals("Material \u00FAtil"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    dicaConselho0.setConselho("models.MetaDica");
    dicaConselho0.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str6 = dicaConselho0.getTipo();
    models.Usuario usuario7 = new models.Usuario();
    usuario7.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    java.lang.String str10 = usuario7.getLogin();
    dicaConselho0.setAutor(usuario7);
    models.Concordancia concordancia12 = new models.Concordancia(usuario7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaConselho"+ "'", str6.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    int i4 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    boolean b7 = tema1.equals((java.lang.Object)"Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i8 = tema1.getNumeroDicas();
    tema1.setId((java.lang.Long)0L);
    int i11 = tema1.getNumeroDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }

    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica7 = new models.MetaDica("models.MetaDica", usuario5, "models.DicaConselho");
    usuario5.setNome("models.DicaMaterialUtil");
    usuario5.setLogin("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    models.MetaDica metaDica13 = new models.MetaDica("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario5, "");

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getTipo();
    int i4 = dicaConselho0.getNumeroDiscordancia();
    dicaConselho0.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str7 = dicaConselho0.getCategoria();
    long long8 = dicaConselho0.getId();
    java.util.Set<models.Usuario> set_usuario9 = dicaConselho0.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Conselho"+ "'", str7.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario9);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }

    models.Disciplina disciplina1 = new models.Disciplina("Meta Dica");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    int i3 = disciplina1.getNumeroMetaDicasVisiveis();
    models.Tema tema5 = new models.Tema("");
    java.util.List<models.IDica> list_iDica6 = tema5.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i7 = tema5.getAvaliacoes();
    int i8 = tema5.getNumeroDicas();
    tema5.ordenarTopConcordancias();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia11 = dicaMaterialUtil10.getListaDiscordancia();
    boolean b12 = tema5.equals((java.lang.Object)list_discordancia11);
    models.Disciplina disciplina14 = new models.Disciplina("models.MetaDica");
    java.lang.String str15 = disciplina14.getNome();
    boolean b16 = tema5.equals((java.lang.Object)disciplina14);
    models.Tema tema18 = new models.Tema("");
    java.util.List<models.IDica> list_iDica19 = tema18.getDicas();
    java.lang.String str20 = tema18.getNome();
    boolean b21 = tema5.equals((java.lang.Object)str20);
    models.Tema tema22 = disciplina1.addTema(tema5);
    java.lang.String str23 = disciplina1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "models.MetaDica"+ "'", str15.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Meta Dica"+ "'", str23.equals("Meta Dica"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores0.setAutor(usuario5);
    java.util.Set<models.Usuario> set_usuario7 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("0,0");
    dicaDisciplinasAnteriores0.setNomesDisciplinas("Meta Dica");
    java.lang.String str12 = dicaDisciplinasAnteriores0.getTipo();
    java.lang.String str13 = dicaDisciplinasAnteriores0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str12.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str13.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    disciplina1.setNome("models.DicaConselho");
    models.Usuario usuario12 = new models.Usuario("models.DicaMaterialUtil", "models.DicaDisciplinasAnteriores", "Meta Dica");
    models.DicaConselho dicaConselho14 = new models.DicaConselho("Meta Dica", usuario12, "models.DicaConselho");
    boolean b15 = disciplina1.equals((java.lang.Object)dicaConselho14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    metaDica12.addDenuncia("hi!");
    java.lang.String str17 = metaDica12.getTipo();
    int i18 = metaDica12.getNumeroDicasNaMetaDica();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "models.MetaDica"+ "'", str17.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getTitulo();
    java.lang.String str3 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    int i4 = dicaDisciplinasAnteriores0.getNumeroConcordancias();
    java.lang.String str5 = dicaDisciplinasAnteriores0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str5.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    dicaMaterialUtil0.setId((long)(short)100);
    int i3 = dicaMaterialUtil0.getNumeroDiscordancia();
    java.lang.String str4 = dicaMaterialUtil0.getDominioURL();
    java.lang.String str5 = dicaMaterialUtil0.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    boolean b9 = dicaDisciplinasAnteriores8.isVotavel();
    dicaDisciplinasAnteriores8.setRazoesDisciplinas("Meta Dica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }

    models.DicaConselho dicaConselho1 = new models.DicaConselho();
    java.lang.String str2 = dicaConselho1.getCategoria();
    java.lang.String str3 = dicaConselho1.getCategoria();
    models.Usuario usuario7 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str8 = usuario7.getLogin();
    dicaConselho1.setAutor(usuario7);
    java.util.List<models.Discordancia> list_discordancia10 = dicaConselho1.getListaDiscordancia();
    int i11 = dicaConselho1.getNumeroConcordancias();
    java.util.List<models.Concordancia> list_concordancia12 = dicaConselho1.getListaConcordancia();
    dicaConselho1.setConselho("models.DicaDisciplinasAnteriores");
    models.Usuario usuario18 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia20 = new models.Discordancia(usuario18, "");
    int i21 = usuario18.getId();
    usuario18.setSenha("models.DicaConselho");
    java.lang.String str24 = usuario18.getNome();
    boolean b25 = dicaConselho1.usuarioAtualVotouNestaDica(usuario18);
    java.lang.String str26 = usuario18.getLogin();
    models.MetaDica metaDica28 = new models.MetaDica("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario18, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Conselho"+ "'", str3.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "models.DicaConselho"+ "'", str26.equals("models.DicaConselho"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("Meta Dica");
    java.lang.String str4 = dicaComoNaoTerDificuldade0.getCategoria();
    models.Usuario usuario9 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia11 = new models.Discordancia(usuario9, "");
    usuario9.setNome("Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores16 = new models.DicaDisciplinasAnteriores("", usuario9, "0,0", "hi!");
    boolean b17 = dicaComoNaoTerDificuldade0.usuarioAtualVotouNestaDica(usuario9);
    java.lang.String str18 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Meta Dica"+ "'", str18.equals("Meta Dica"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }

    models.DicaMaterialUtil dicaMaterialUtil1 = new models.DicaMaterialUtil();
    boolean b2 = dicaMaterialUtil1.isVotavel();
    java.lang.String str3 = dicaMaterialUtil1.getNomeURL();
    models.Usuario usuario7 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    usuario7.setNome("models.DicaMaterialUtil");
    java.lang.String str12 = usuario7.getLogin();
    java.lang.String str13 = usuario7.getLogin();
    dicaMaterialUtil1.setAutor(usuario7);
    java.lang.String str15 = usuario7.getLogin();
    models.DicaConselho dicaConselho17 = new models.DicaConselho("", usuario7, "0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaConselho"+ "'", str12.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "models.DicaConselho"+ "'", str13.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "models.DicaConselho"+ "'", str15.equals("models.DicaConselho"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    double d7 = tema6.getMedia();
    int i8 = tema6.getNumeroDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    tema6.setId((java.lang.Long)0L);
    double d12 = tema6.getMedia();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i13 = tema6.getAvaliacoes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i13);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getCategoria();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str7 = usuario6.getLogin();
    dicaConselho0.setAutor(usuario6);
    java.util.List<models.Discordancia> list_discordancia9 = dicaConselho0.getListaDiscordancia();
    int i10 = dicaConselho0.getNumeroConcordancias();
    java.util.List<models.Concordancia> list_concordancia11 = dicaConselho0.getListaConcordancia();
    dicaConselho0.setConselho("models.DicaDisciplinasAnteriores");
    models.Usuario usuario17 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia19 = new models.Discordancia(usuario17, "");
    int i20 = usuario17.getId();
    usuario17.setSenha("models.DicaConselho");
    java.lang.String str23 = usuario17.getNome();
    boolean b24 = dicaConselho0.usuarioAtualVotouNestaDica(usuario17);
    int i25 = usuario17.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaConselho"+ "'", str7.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getCategoria();
    int i3 = dicaConselho0.getNumeroConcordancias();
    java.lang.String str4 = dicaConselho0.getCategoria();
    java.lang.String str5 = dicaConselho0.getTipo();
    java.lang.String str6 = dicaConselho0.getConselho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Conselho"+ "'", str4.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "models.DicaConselho"+ "'", str5.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    java.util.List<models.IDica> list_iDica3 = tema1.getDicas();
    int i4 = tema1.getNumeroDicasVisiveis();
    int i5 = tema1.getNumeroAvaliacoes();
    int i6 = tema1.getNumeroAvaliacoes();
    int i7 = tema1.getNumeroDicasVisiveis();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i8 = tema1.getAvaliacoes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i8);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade7 = new models.DicaComoNaoTerDificuldade("", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    java.util.List<models.Concordancia> list_concordancia8 = dicaComoNaoTerDificuldade7.getListaConcordancia();
    java.lang.String str9 = dicaComoNaoTerDificuldade7.getNomeAssunto();
    java.lang.String str10 = dicaComoNaoTerDificuldade7.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str9.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str10.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getTipo();
    int i4 = dicaConselho0.getNumeroDiscordancia();
    dicaConselho0.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str7 = dicaConselho0.getCategoria();
    long long8 = dicaConselho0.getId();
    models.Usuario usuario9 = new models.Usuario();
    boolean b10 = dicaConselho0.usuarioAtualVotouNestaDica(usuario9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Conselho"+ "'", str7.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getTipo();
    dicaConselho0.setId((long)10);
    java.lang.String str5 = dicaConselho0.getTipo();
    int i6 = dicaConselho0.getNumeroConcordancias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "models.DicaConselho"+ "'", str2.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "models.DicaConselho"+ "'", str5.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    int i3 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    java.util.List<models.IDica> list_iDica5 = tema1.getDicas();
    java.util.List<models.IDica> list_iDica6 = tema1.getDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica6);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia5 = new models.Discordancia(usuario3, "");
    int i6 = usuario3.getId();
    usuario3.setSenha("models.DicaConselho");
    int i9 = usuario3.getId();
    java.lang.String str10 = usuario3.getNome();
    java.lang.String str11 = usuario3.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.lang.String str3 = tema1.getNome();
    boolean b5 = tema1.isAvaliado("models.DicaComoNaoTerDificuldade");
    tema1.addAvaliacao("models.MetaDica", (java.lang.Integer)1);
    int i9 = tema1.getNumeroDicasVisiveis();
    boolean b11 = tema1.isAvaliado("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }

    models.Usuario usuario3 = new models.Usuario("", "hi!", "models.DicaConselho");
    boolean b5 = usuario3.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia6 = new models.Concordancia(usuario3);
    usuario3.setNome("");
    java.lang.String str9 = usuario3.getNome();
    models.Discordancia discordancia11 = new models.Discordancia(usuario3, "models.DicaDisciplinasAnteriores");
    models.Usuario usuario12 = discordancia11.getAutor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario12);

  }

}
