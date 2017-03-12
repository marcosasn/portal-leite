package models;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    models.Discordancia discordancia1 = null;
    // The following exception was thrown during execution in test generation
    try {
    dicaDisciplinasAnteriores0.adicionaDiscordancia(discordancia1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    models.IDica.StatusVisualizacao statusVisualizacao0 = models.IDica.StatusVisualizacao.FECHADO;
    org.junit.Assert.assertTrue("'" + statusVisualizacao0 + "' != '" + models.IDica.StatusVisualizacao.FECHADO + "'", statusVisualizacao0.equals(models.IDica.StatusVisualizacao.FECHADO));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("");
    models.Concordancia concordancia4 = null;
    // The following exception was thrown during execution in test generation
    try {
    dicaDisciplinasAnteriores0.adicionaConcordancia(concordancia4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    models.IDica.StatusAberturaParaVotos statusAberturaParaVotos0 = models.IDica.StatusAberturaParaVotos.ABERTO;
    org.junit.Assert.assertTrue("'" + statusAberturaParaVotos0 + "' != '" + models.IDica.StatusAberturaParaVotos.ABERTO + "'", statusAberturaParaVotos0.equals(models.IDica.StatusAberturaParaVotos.ABERTO));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getCategoria();
    boolean b3 = dicaDisciplinasAnteriores0.recebeuDenunciaDe("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str1.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.lang.String str1 = dicaMaterialUtil0.getNomeURL();
    java.util.List<models.Concordancia> list_concordancia2 = dicaMaterialUtil0.getListaConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia2);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    models.IDica.StatusVisualizacao statusVisualizacao0 = models.IDica.StatusVisualizacao.ABERTO;
    org.junit.Assert.assertTrue("'" + statusVisualizacao0 + "' != '" + models.IDica.StatusVisualizacao.ABERTO + "'", statusVisualizacao0.equals(models.IDica.StatusVisualizacao.ABERTO));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    models.Usuario usuario0 = null;
    models.Discordancia discordancia2 = new models.Discordancia(usuario0, "hi!");
    discordancia2.setRazaoDiscordancia("Disciplinas anteriores que te ajudar\u00E3o aqui");

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    boolean b2 = dicaDisciplinasAnteriores0.isVisivel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    discordancia1.setRazaoDiscordancia("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i3);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Usuario usuario2 = null;
    models.Discordancia discordancia4 = new models.Discordancia(usuario2, "");
    models.Usuario usuario5 = null;
    discordancia4.setAutor(usuario5);
    int i7 = discordancia4.getId();
    dicaDisciplinasAnteriores0.adicionaDiscordancia(discordancia4);
    models.Usuario usuario9 = discordancia4.getAutor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario9);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    models.Usuario usuario0 = null;
    models.Discordancia discordancia2 = new models.Discordancia(usuario0, "");
    int i3 = discordancia2.getId();
    java.lang.String str4 = discordancia2.getRazaoDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getTipo();
    java.lang.String str4 = dicaConselho0.getConselho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    models.Tema tema1 = new models.Tema("");
    tema1.setId((java.lang.Long)10L);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    java.lang.String str3 = discordancia1.getRazaoDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    models.Usuario usuario1 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil4 = new models.DicaMaterialUtil("", usuario1, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    boolean b6 = dicaMaterialUtil4.recebeuDenunciaDe("models.DicaDisciplinasAnteriores");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    double d7 = tema6.getMedia();
    int i8 = tema6.getNumeroDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    boolean b11 = tema6.isAvaliado("");
    java.lang.Long long12 = tema6.getId();
    tema6.setId((java.lang.Long)(-1L));
    
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

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia1 = dicaMaterialUtil0.getListaDiscordancia();
    java.lang.String str2 = dicaMaterialUtil0.getDominioURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    int i3 = tema1.getNumeroDicas();
    double d4 = tema1.getMediana();
    tema1.ordenarTopConcordancias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    models.Usuario usuario3 = new models.Usuario("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", "models.DicaDisciplinasAnteriores", "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    models.DicaMaterialUtil dicaMaterialUtil4 = new models.DicaMaterialUtil();
    boolean b5 = dicaMaterialUtil4.isVotavel();
    boolean b6 = dicaMaterialUtil4.isVotavel();
    java.lang.String str7 = dicaMaterialUtil4.getNomeURL();
    int i8 = dicaComoNaoTerDificuldade0.compareTo((models.IDica)dicaMaterialUtil4);
    java.lang.String str9 = dicaComoNaoTerDificuldade0.getTipo();
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str9.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getTipo();
    dicaComoNaoTerDificuldade0.setNomeAssunto("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str3.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    boolean b4 = disciplina1.equals((java.lang.Object)10.0f);
    disciplina1.setId((java.lang.Long)100L);
    java.util.List<models.Tema> list_tema7 = disciplina1.getTemas();
    int i8 = disciplina1.getNumeroMetaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    int i3 = tema1.getNumeroDicas();
    java.lang.Long long4 = tema1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long4);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getCategoria();
    int i3 = dicaConselho0.getNumeroConcordancias();
    models.Usuario usuario4 = dicaConselho0.getAutor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario4);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    disciplina1.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str6 = disciplina1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str6.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    double d7 = tema6.getMedia();
    int i8 = tema6.getNumeroDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    double d10 = tema6.getMediana();
    double d11 = tema6.getMedia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    java.util.List<models.Concordancia> list_concordancia2 = dicaDisciplinasAnteriores0.getListaConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia2);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    int i7 = metaDica6.getNumeroDicasNaMetaDica();
    java.lang.String str8 = metaDica6.getComentario();
    java.lang.String str9 = metaDica6.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Meta Dica"+ "'", str9.equals("Meta Dica"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    models.Tema tema0 = new models.Tema();
    boolean b2 = tema0.isAvaliado("");
    models.DicaMaterialUtil dicaMaterialUtil3 = new models.DicaMaterialUtil();
    boolean b4 = dicaMaterialUtil3.isVotavel();
    boolean b5 = dicaMaterialUtil3.isVotavel();
    dicaMaterialUtil3.setDominioURL("hi!");
    boolean b8 = tema0.equals((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    disciplina1.setId((java.lang.Long)1L);
    java.util.List<models.Tema> list_tema8 = disciplina1.getTemas();
    java.lang.Long long9 = disciplina1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L+ "'", long9.equals(1L));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Concordancia concordancia3 = new models.Concordancia();
    dicaDisciplinasAnteriores0.adicionaConcordancia(concordancia3);
    java.lang.String str5 = dicaDisciplinasAnteriores0.getTipo();
    java.lang.String str6 = dicaDisciplinasAnteriores0.getTipo();
    boolean b7 = dicaDisciplinasAnteriores0.isVisivel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str5.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str6.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    discordancia1.setRazaoDiscordancia("");

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.lang.String str3 = tema1.getNome();
    double d4 = tema1.getMediana();
    java.lang.String str5 = tema1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    boolean b2 = dicaDisciplinasAnteriores0.isVotavel();
    java.lang.String str3 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    boolean b5 = dicaDisciplinasAnteriores0.recebeuDenunciaDe("models.DicaMaterialUtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica7 = new models.MetaDica("hi!", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    java.lang.String str8 = metaDica7.getCategoria();
    java.util.List<models.IDica> list_iDica9 = metaDica7.getListaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Meta Dica"+ "'", str8.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica9);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.Tema> list_tema2 = disciplina1.getTemas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema2);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    models.IDica.StatusAberturaParaVotos statusAberturaParaVotos0 = models.IDica.StatusAberturaParaVotos.FECHADO;
    org.junit.Assert.assertTrue("'" + statusAberturaParaVotos0 + "' != '" + models.IDica.StatusAberturaParaVotos.FECHADO + "'", statusAberturaParaVotos0.equals(models.IDica.StatusAberturaParaVotos.FECHADO));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    models.Disciplina disciplina0 = new models.Disciplina();
    java.lang.String str1 = disciplina0.getNome();
    java.lang.Long long2 = disciplina0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    double d3 = tema1.getMediana();
    int i4 = tema1.getNumeroDicasVisiveis();
    tema1.ordenarTopConcordancias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str4 = usuario3.getLogin();
    models.Concordancia concordancia5 = new models.Concordancia(usuario3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.DicaConselho"+ "'", str4.equals("models.DicaConselho"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str1.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    int i3 = tema1.getNumeroDicas();
    int i4 = tema1.getNumeroDicas();
    int i5 = tema1.getNumeroDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia1 = dicaMaterialUtil0.getListaDiscordancia();
    boolean b2 = dicaMaterialUtil0.isVisivel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    java.lang.String str6 = dicaComoNaoTerDificuldade3.getCategoria();
    java.lang.String str7 = dicaComoNaoTerDificuldade3.getNomeAssunto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str6.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    java.util.List<models.Tema> list_tema6 = disciplina1.getTemas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema6);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    models.Disciplina disciplina1 = new models.Disciplina("models.MetaDica");
    java.lang.String str2 = disciplina1.getNome();
    disciplina1.setId((java.lang.Long)100L);
    java.lang.String str5 = disciplina1.getNome();
    java.util.List<models.MetaDica> list_metaDica6 = disciplina1.getMetadicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "models.MetaDica"+ "'", str2.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "models.MetaDica"+ "'", str5.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica6);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    java.util.List<models.IDica> list_iDica3 = tema1.getDicas();
    int i4 = tema1.getNumeroDicasVisiveis();
    double d5 = tema1.getMedia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    java.util.List<models.IDica> list_iDica3 = tema1.getDicas();
    int i4 = tema1.getNumeroDicasVisiveis();
    java.lang.String str5 = tema1.getNome();
    java.util.List<models.IDica> list_iDica6 = tema1.getDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica6);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.MetaDica", usuario4, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    java.lang.String str10 = dicaMaterialUtil9.getDominioURL();
    java.lang.String str11 = dicaMaterialUtil9.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str10.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaConselho"+ "'", str11.equals("models.DicaConselho"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores1 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario2 = dicaDisciplinasAnteriores1.getListaUsuariosQueVotaram();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores1.setAutor(usuario6);
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("hi!", usuario6, "Conselho", "Conselho");
    boolean b11 = dicaMaterialUtil10.isVisivel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

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
    java.lang.String str17 = metaDica12.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Meta Dica"+ "'", str17.equals("Meta Dica"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    models.Disciplina disciplina1 = new models.Disciplina("Meta Dica");
    disciplina1.setId((java.lang.Long)100L);
    java.lang.Object obj4 = null;
    boolean b5 = disciplina1.equals(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.MetaDica metaDica8 = new models.MetaDica("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario5, "models.DicaMaterialUtil");
    long long9 = metaDica8.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long9 == 0L);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    models.Discordancia discordancia0 = new models.Discordancia();
    discordancia0.setRazaoDiscordancia("models.MetaDica");
    int i3 = discordancia0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getCategoria();
    models.Usuario usuario7 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    usuario7.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho13 = new models.DicaConselho("", usuario7, "models.DicaConselho");
    int i14 = dicaComoNaoTerDificuldade0.compareTo((models.IDica)dicaConselho13);
    models.DicaConselho dicaConselho15 = new models.DicaConselho();
    java.lang.String str16 = dicaConselho15.getCategoria();
    java.lang.String str17 = dicaConselho15.getCategoria();
    models.Usuario usuario21 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str22 = usuario21.getLogin();
    dicaConselho15.setAutor(usuario21);
    java.util.List<models.Discordancia> list_discordancia24 = dicaConselho15.getListaDiscordancia();
    int i25 = dicaConselho13.compareTo((models.IDica)dicaConselho15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str2.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Conselho"+ "'", str16.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Conselho"+ "'", str17.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "models.DicaConselho"+ "'", str22.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    int i3 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    tema1.addAvaliacao("hi!", (java.lang.Integer)0);
    double d8 = tema1.getMediana();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia1 = dicaMaterialUtil0.getListaDiscordancia();
    java.lang.String str2 = dicaMaterialUtil0.getNomeURL();
    java.lang.String str3 = dicaMaterialUtil0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaMaterialUtil"+ "'", str3.equals("models.DicaMaterialUtil"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    models.Disciplina disciplina1 = new models.Disciplina("Meta Dica");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    int i3 = disciplina1.getNumeroMetaDicasVisiveis();
    java.util.List<models.MetaDica> list_metaDica4 = disciplina1.getMetadicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica4);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores0.setAutor(usuario5);
    java.lang.String str7 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    java.lang.String str3 = metaDica0.getTipo();
    long long4 = metaDica0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.MetaDica"+ "'", str3.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    models.Disciplina disciplina1 = new models.Disciplina("models.DicaMaterialUtil");
    disciplina1.setId((java.lang.Long)10L);
    int i4 = disciplina1.getNumeroMetaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setTitulo("models.DicaDisciplinasAnteriores");
    models.Usuario usuario4 = dicaMaterialUtil0.getAutor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario4);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    models.MetaDica metaDica1 = new models.MetaDica();
    models.Discordancia discordancia2 = new models.Discordancia();
    metaDica1.adicionaDiscordancia(discordancia2);
    models.Usuario usuario7 = new models.Usuario("", "hi!", "models.DicaConselho");
    boolean b9 = usuario7.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    discordancia2.setAutor(usuario7);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores13 = new models.DicaDisciplinasAnteriores("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario7, "models.DicaDisciplinasAnteriores", "models.DicaMaterialUtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    double d7 = tema6.getMedia();
    int i8 = tema6.getNumeroDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    boolean b11 = tema6.isAvaliado("");
    models.MetaDica metaDica12 = new models.MetaDica();
    models.Discordancia discordancia13 = new models.Discordancia();
    metaDica12.adicionaDiscordancia(discordancia13);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade15 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str16 = dicaComoNaoTerDificuldade15.getCategoria();
    metaDica12.adicionaDica((models.IDica)dicaComoNaoTerDificuldade15);
    java.lang.String str18 = dicaComoNaoTerDificuldade15.getCategoria();
    tema6.addDica((models.IDica)dicaComoNaoTerDificuldade15);
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str16.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str18.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    java.lang.String str6 = dicaComoNaoTerDificuldade3.getTipo();
    java.lang.String str7 = dicaComoNaoTerDificuldade3.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str6.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str7.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    usuario4.setNome("models.DicaMaterialUtil");
    models.Concordancia concordancia9 = new models.Concordancia(usuario4);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    int i4 = tema1.getNumeroDicas();
    double d5 = tema1.getMedia();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i6 = tema1.getAvaliacoes();
    int i7 = tema1.getNumeroAvaliacoes();
    int i8 = tema1.getNumeroDicasVisiveis();
    tema1.addAvaliacao("models.DicaDisciplinasAnteriores", (java.lang.Integer)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.lang.String str1 = dicaMaterialUtil0.getNomeURL();
    dicaMaterialUtil0.setTitulo("");
    int i4 = dicaMaterialUtil0.getNumeroVotos();
    java.lang.String str5 = dicaMaterialUtil0.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    double d7 = tema6.getMedia();
    int i8 = tema6.getNumeroDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    boolean b11 = tema6.isAvaliado("");
    tema6.setId((java.lang.Long)0L);
    
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

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setDominioURL("hi!");
    dicaMaterialUtil0.setNomeURL("models.DicaDisciplinasAnteriores");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    java.lang.String str3 = dicaMaterialUtil0.getNomeURL();
    dicaMaterialUtil0.setNomeURL("");
    models.Usuario usuario6 = dicaMaterialUtil0.getAutor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario6);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    models.Disciplina disciplina1 = new models.Disciplina("Meta Dica");
    disciplina1.setId((java.lang.Long)100L);
    int i4 = disciplina1.getNumeroMetaDicasVisiveis();
    models.DicaConselho dicaConselho5 = new models.DicaConselho();
    java.lang.String str6 = dicaConselho5.getCategoria();
    boolean b7 = dicaConselho5.isVotavel();
    java.lang.String str8 = dicaConselho5.getTipo();
    int i9 = dicaConselho5.getNumeroDiscordancia();
    dicaConselho5.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str12 = dicaConselho5.getTipo();
    java.lang.String str13 = dicaConselho5.getTipo();
    java.lang.String str14 = dicaConselho5.getCategoria();
    dicaConselho5.setConselho("models.DicaDisciplinasAnteriores");
    boolean b17 = disciplina1.equals((java.lang.Object)"models.DicaDisciplinasAnteriores");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Conselho"+ "'", str6.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaConselho"+ "'", str12.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "models.DicaConselho"+ "'", str13.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Conselho"+ "'", str14.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setNomeURL("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Usuario usuario9 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario9.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil("0,0", usuario9, "hi!", "models.DicaDisciplinasAnteriores");
    dicaMaterialUtil0.setAutor(usuario9);
    java.lang.String str16 = dicaMaterialUtil0.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str16.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

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
    dicaMaterialUtil15.setId((long)' ');
    
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

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    int i4 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    boolean b7 = tema1.equals((java.lang.Object)"Disciplinas anteriores que te ajudar\u00E3o aqui");
    boolean b9 = tema1.isAvaliado("Material \u00FAtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    models.Usuario usuario0 = new models.Usuario();
    usuario0.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia3 = new models.Concordancia(usuario0);
    usuario0.setSenha("Conselho");

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia1 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    dicaDisciplinasAnteriores0.setNomesDisciplinas("Conselho");
    java.lang.String str4 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    models.Usuario usuario0 = new models.Usuario();
    java.lang.String str1 = usuario0.getNome();
    usuario0.setSenha("models.MetaDica");
    usuario0.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    usuario0.setLogin("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    double d3 = tema1.getMediana();
    int i4 = tema1.getNumeroDicasVisiveis();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i5 = tema1.getAvaliacoes();
    tema1.ordenarTopConcordancias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i5);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

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
    java.lang.Long long19 = disciplina1.getId();
    
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
    org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L+ "'", long19.equals(10L));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    models.Tema tema1 = new models.Tema("");
    int i2 = tema1.getNumeroDicas();
    java.lang.String str3 = tema1.getNome();
    int i4 = tema1.getNumeroDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

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
    java.lang.String str24 = dicaDisciplinasAnteriores19.getRazoesDisciplinas();
    
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
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str20.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

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
    java.util.List<models.IDica> list_iDica19 = metaDica12.getListaDicas();
    java.util.Set<models.Usuario> set_usuario20 = metaDica12.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario20);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia1 = dicaMaterialUtil0.getListaDiscordancia();
    int i2 = dicaMaterialUtil0.getNumeroVotos();
    java.util.Set<models.Usuario> set_usuario3 = dicaMaterialUtil0.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario3);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    java.util.List<models.IDica> list_iDica3 = metaDica0.getListaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica3);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getCategoria();
    java.lang.String str3 = dicaConselho0.getTipo();
    dicaConselho0.setConselho("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia1 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    java.lang.String str3 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    dicaDisciplinasAnteriores8.setNomesDisciplinas("models.MetaDica");

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    models.Tema tema0 = new models.Tema();
    java.util.List<models.IDica> list_iDica1 = tema0.getDicas();
    int i2 = tema0.getNumeroDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    double d7 = tema6.getMedia();
    int i8 = tema6.getNumeroDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    boolean b11 = tema6.isAvaliado("");
    tema6.ordenarTopConcordancias();
    double d13 = tema6.getMedia();
    
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
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    boolean b2 = dicaDisciplinasAnteriores0.isVotavel();
    int i3 = dicaDisciplinasAnteriores0.getNumeroConcordancias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b3 = dicaMaterialUtil0.recebeuDenunciaDe("Meta Dica");
    java.lang.String str4 = dicaMaterialUtil0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.DicaMaterialUtil"+ "'", str4.equals("models.DicaMaterialUtil"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    disciplina1.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("");
    int i4 = dicaDisciplinasAnteriores0.getNumeroDiscordancia();
    java.lang.String str5 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    int i4 = tema1.getNumeroDicas();
    double d5 = tema1.getMedia();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i6 = tema1.getAvaliacoes();
    int i7 = tema1.getNumeroAvaliacoes();
    int i8 = tema1.getNumeroDicasVisiveis();
    java.lang.Object obj9 = null;
    boolean b10 = tema1.equals(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    usuario4.setNome("Meta Dica");
    int i9 = usuario4.getId();
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade11 = new models.DicaComoNaoTerDificuldade("models.DicaDisciplinasAnteriores", usuario4, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    java.lang.String str2 = dicaMaterialUtil0.getNomeURL();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia8 = new models.Discordancia(usuario6, "");
    usuario6.setNome("models.DicaMaterialUtil");
    java.lang.String str11 = usuario6.getLogin();
    java.lang.String str12 = usuario6.getLogin();
    dicaMaterialUtil0.setAutor(usuario6);
    models.IDica iDica14 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i15 = dicaMaterialUtil0.compareTo(iDica14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaConselho"+ "'", str11.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaConselho"+ "'", str12.equals("models.DicaConselho"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    models.Tema tema0 = new models.Tema();
    boolean b2 = tema0.isAvaliado("");
    tema0.addAvaliacao("0", (java.lang.Integer)1);
    int i6 = tema0.getNumeroAvaliacoes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    dicaMaterialUtil0.setId((long)(short)100);
    models.Usuario usuario3 = new models.Usuario();
    dicaMaterialUtil0.setAutor(usuario3);
    long long5 = dicaMaterialUtil0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == 100L);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    int i3 = tema1.getNumeroDicas();
    int i4 = tema1.getNumeroDicas();
    java.lang.Long long5 = tema1.getId();
    tema1.setId((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long5);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    int i4 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    double d6 = tema1.getMediana();
    java.lang.Long long7 = tema1.getId();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i8 = tema1.getAvaliacoes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i8);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Concordancia concordancia3 = new models.Concordancia();
    dicaDisciplinasAnteriores0.adicionaConcordancia(concordancia3);
    models.Usuario usuario5 = concordancia3.getAutor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario5);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    models.Tema tema0 = new models.Tema();
    tema0.ordenarTopConcordancias();
    java.util.List<models.IDica> list_iDica2 = tema0.getDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    models.Disciplina disciplina0 = new models.Disciplina();
    int i1 = disciplina0.getNumeroMetaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

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
    java.lang.String str18 = metaDica12.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "models.MetaDica"+ "'", str17.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Meta Dica"+ "'", str18.equals("Meta Dica"));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    java.lang.String str1 = metaDica0.calculaIndiceConcordancia();
    metaDica0.addDenuncia("Meta Dica");
    models.Usuario usuario4 = null;
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    int i7 = discordancia6.getId();
    metaDica0.adicionaDiscordancia(discordancia6);
    java.lang.String str9 = discordancia6.getRazaoDiscordancia();
    java.lang.String str10 = discordancia6.getRazaoDiscordancia();
    java.lang.String str11 = discordancia6.getRazaoDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0,0"+ "'", str1.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    models.Usuario usuario0 = null;
    models.Discordancia discordancia2 = new models.Discordancia(usuario0, "");
    models.Usuario usuario3 = null;
    discordancia2.setAutor(usuario3);
    java.lang.String str5 = discordancia2.getRazaoDiscordancia();
    discordancia2.setRazaoDiscordancia("Material \u00FAtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.MetaDica", usuario4, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    java.lang.String str10 = dicaMaterialUtil9.getDominioURL();
    java.lang.String str11 = dicaMaterialUtil9.getDominioURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str10.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str11.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    models.Disciplina disciplina1 = new models.Disciplina("0,0");
    java.lang.String str2 = disciplina1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0,0"+ "'", str2.equals("0,0"));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia1 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    java.lang.String str3 = dicaDisciplinasAnteriores0.getTipo();
    int i4 = dicaDisciplinasAnteriores0.getNumeroVotos();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str3.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    disciplina1.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.util.List<models.Tema> list_tema6 = disciplina1.getTemas();
    models.Disciplina disciplina8 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica9 = disciplina8.getMetadicas();
    disciplina8.setId((java.lang.Long)10L);
    models.Usuario usuario14 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil17 = new models.DicaMaterialUtil("", usuario14, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica19 = new models.MetaDica("hi!", usuario14, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina8.addMetaDica(metaDica19);
    java.lang.String str21 = metaDica19.getTipo();
    metaDica19.addDenuncia("hi!");
    metaDica19.setComentario("models.MetaDica");
    long long26 = metaDica19.getId();
    models.Usuario usuario27 = metaDica19.getAutor();
    long long28 = metaDica19.getId();
    java.lang.String str29 = metaDica19.getComentario();
    disciplina1.addMetaDica(metaDica19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "models.MetaDica"+ "'", str21.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long28 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "models.MetaDica"+ "'", str29.equals("models.MetaDica"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    java.lang.String str6 = dicaComoNaoTerDificuldade3.getTipo();
    dicaComoNaoTerDificuldade3.setNomeAssunto("hi!");
    dicaComoNaoTerDificuldade3.setNomeAssunto("Material \u00FAtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str6.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    dicaConselho0.setConselho("models.MetaDica");
    java.lang.String str4 = dicaConselho0.getConselho();
    java.lang.String str5 = dicaConselho0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.MetaDica"+ "'", str4.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "models.DicaConselho"+ "'", str5.equals("models.DicaConselho"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    usuario5.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho11 = new models.DicaConselho("", usuario5, "models.DicaConselho");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade13 = new models.DicaComoNaoTerDificuldade("Meta Dica", usuario5, "models.DicaComoNaoTerDificuldade");
    boolean b15 = dicaComoNaoTerDificuldade13.recebeuDenunciaDe("models.DicaComoNaoTerDificuldade");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    models.Usuario usuario3 = new models.Usuario("models.MetaDica", "models.DicaMaterialUtil", "models.DicaMaterialUtil");

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

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
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("");
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.util.List<models.Concordancia> list_concordancia16 = dicaDisciplinasAnteriores0.getListaConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia16);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    int i7 = metaDica6.getNumeroDicasNaMetaDica();
    java.util.List<models.Discordancia> list_discordancia8 = metaDica6.getListaDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia8);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    int i7 = usuario4.getId();
    models.DicaConselho dicaConselho9 = new models.DicaConselho("hi!", usuario4, "0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getTipo();
    int i4 = dicaConselho0.getNumeroDiscordancia();
    dicaConselho0.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str7 = dicaConselho0.getTipo();
    java.lang.String str8 = dicaConselho0.getTipo();
    boolean b9 = dicaConselho0.isVisivel();
    
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
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    java.lang.String str6 = dicaComoNaoTerDificuldade0.getTitulo();
    java.lang.String str7 = dicaComoNaoTerDificuldade0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str7.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getCategoria();
    java.lang.String str3 = dicaConselho0.getTipo();
    long long4 = dicaConselho0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long4 == 0L);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    java.lang.String str6 = dicaComoNaoTerDificuldade0.getTipo();
    models.Usuario usuario10 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str11 = usuario10.getLogin();
    dicaComoNaoTerDificuldade0.setAutor(usuario10);
    dicaComoNaoTerDificuldade0.setNomeAssunto("");
    
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

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    models.Usuario usuario1 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil4 = new models.DicaMaterialUtil("", usuario1, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i5 = dicaMaterialUtil4.getNumeroDiscordancia();
    boolean b7 = dicaMaterialUtil4.recebeuDenunciaDe("models.DicaConselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    double d3 = tema1.getMediana();
    int i4 = tema1.getNumeroDicasVisiveis();
    java.lang.String str5 = tema1.getNome();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i6 = tema1.getAvaliacoes();
    java.util.List<models.IDica> list_iDica7 = tema1.getDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica7);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    models.Tema tema1 = new models.Tema("");
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i2 = tema1.getAvaliacoes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i2);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    models.Discordancia discordancia0 = new models.Discordancia();
    discordancia0.setRazaoDiscordancia("0,0");
    discordancia0.setRazaoDiscordancia("0,0");
    discordancia0.setRazaoDiscordancia("hi!");

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    int i14 = metaDica12.getNumeroConcordancias();
    metaDica12.setId((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    usuario5.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho11 = new models.DicaConselho("", usuario5, "models.DicaConselho");
    models.DicaConselho dicaConselho13 = new models.DicaConselho("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario5, "Meta Dica");

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

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
    java.lang.String str18 = dicaMaterialUtil15.getTipo();
    boolean b19 = dicaMaterialUtil15.isVotavel();
    int i20 = dicaMaterialUtil15.getNumeroConcordancias();
    java.lang.String str21 = dicaMaterialUtil15.getDominioURL();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "models.DicaMaterialUtil"+ "'", str18.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str21);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

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
    java.lang.String str22 = dicaConselho10.getConselho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaConselho"+ "'", str11.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0,0"+ "'", str13.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "models.DicaConselho"+ "'", str22.equals("models.DicaConselho"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.lang.String str1 = dicaMaterialUtil0.getNomeURL();
    java.lang.String str2 = dicaMaterialUtil0.getDominioURL();
    dicaMaterialUtil0.addDenuncia("models.DicaConselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    java.lang.String str6 = dicaComoNaoTerDificuldade3.getTipo();
    dicaComoNaoTerDificuldade3.setNomeAssunto("hi!");
    dicaComoNaoTerDificuldade3.setNomeAssunto("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str6.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getCategoria();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getCategoria();
    boolean b4 = dicaDisciplinasAnteriores0.recebeuDenunciaDe("0,0");
    models.Usuario usuario8 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia10 = new models.Discordancia(usuario8, "");
    usuario8.setNome("models.DicaMaterialUtil");
    dicaDisciplinasAnteriores0.setAutor(usuario8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str1.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str2.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

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
    java.lang.String str13 = dicaMaterialUtil0.getDominioURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Material \u00FAtil"+ "'", str12.equals("Material \u00FAtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    models.Usuario usuario2 = new models.Usuario();
    usuario2.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia5 = new models.Concordancia(usuario2);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("", usuario2, "Meta Dica", "0,0");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores11 = new models.DicaDisciplinasAnteriores("models.DicaMaterialUtil", usuario2, "models.DicaComoNaoTerDificuldade", "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str12 = dicaDisciplinasAnteriores11.getTitulo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaMaterialUtil"+ "'", str12.equals("models.DicaMaterialUtil"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getCategoria();
    java.lang.String str3 = dicaConselho0.getTipo();
    models.Usuario usuario7 = new models.Usuario("", "hi!", "models.DicaConselho");
    boolean b9 = usuario7.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia10 = new models.Concordancia(usuario7);
    dicaConselho0.setAutor(usuario7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

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
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("");
    models.Usuario usuario14 = dicaDisciplinasAnteriores0.getAutor();
    int i15 = dicaDisciplinasAnteriores0.getNumeroVotos();
    java.lang.String str16 = dicaDisciplinasAnteriores0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str16.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    int i3 = tema1.getNumeroDicas();
    int i4 = tema1.getNumeroAvaliacoes();
    java.util.List<models.IDica> list_iDica5 = tema1.getDicas();
    tema1.setId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica5);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    int i7 = usuario5.getId();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("0", usuario5, "models.DicaDisciplinasAnteriores", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.lang.String str1 = dicaMaterialUtil0.getNomeURL();
    long long2 = dicaMaterialUtil0.getId();
    dicaMaterialUtil0.setNomeURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str5 = dicaMaterialUtil0.getTitulo();
    java.lang.String str6 = dicaMaterialUtil0.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str6.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    disciplina1.setNome("models.DicaConselho");
    java.lang.String str8 = disciplina1.getNome();
    int i9 = disciplina1.getNumeroMetaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    boolean b2 = dicaDisciplinasAnteriores0.isVotavel();
    java.lang.String str3 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("models.DicaConselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    java.lang.String str9 = dicaDisciplinasAnteriores8.getCategoria();
    int i10 = dicaDisciplinasAnteriores8.getNumeroDiscordancia();
    java.lang.String str11 = dicaDisciplinasAnteriores8.getNomesDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str9.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str11.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    disciplina1.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    int i6 = disciplina1.getNumeroMetaDicasVisiveis();
    java.util.List<models.MetaDica> list_metaDica7 = disciplina1.getMetadicas();
    java.util.List<models.Tema> list_tema8 = disciplina1.getTemas();
    disciplina1.setId((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema8);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    disciplina1.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.util.List<models.Tema> list_tema6 = disciplina1.getTemas();
    int i7 = disciplina1.getNumeroMetaDicasVisiveis();
    int i8 = disciplina1.getNumeroMetaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.lang.String str1 = dicaMaterialUtil0.getNomeURL();
    long long2 = dicaMaterialUtil0.getId();
    boolean b3 = dicaMaterialUtil0.isVotavel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    double d3 = tema1.getMediana();
    int i4 = tema1.getNumeroDicas();
    int i5 = tema1.getNumeroDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

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
    java.util.List<models.IDica> list_iDica20 = metaDica12.getListaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica20);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    java.lang.String str6 = dicaComoNaoTerDificuldade3.getTipo();
    dicaComoNaoTerDificuldade3.setNomeAssunto("hi!");
    dicaComoNaoTerDificuldade3.setNomeAssunto("hi!");
    java.util.List<models.Discordancia> list_discordancia11 = dicaComoNaoTerDificuldade3.getListaDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str6.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia11);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    models.Disciplina disciplina1 = new models.Disciplina("0,0");
    models.Usuario usuario3 = new models.Usuario();
    usuario3.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia6 = new models.Concordancia(usuario3);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores9 = new models.DicaDisciplinasAnteriores("", usuario3, "Meta Dica", "0,0");
    boolean b11 = dicaDisciplinasAnteriores9.recebeuDenunciaDe("models.DicaDisciplinasAnteriores");
    boolean b12 = disciplina1.equals((java.lang.Object)"models.DicaDisciplinasAnteriores");
    java.util.List<models.Tema> list_tema13 = disciplina1.getTemas();
    java.lang.String str14 = disciplina1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "0,0"+ "'", str14.equals("0,0"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    double d7 = tema6.getMedia();
    int i8 = tema6.getNumeroDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    boolean b11 = tema6.isAvaliado("");
    int i12 = tema6.getNumeroDicasVisiveis();
    double d13 = tema6.getMedia();
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade8 = new models.DicaComoNaoTerDificuldade("models.DicaDisciplinasAnteriores", usuario4, "hi!");
    usuario4.setNome("models.DicaDisciplinasAnteriores");

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.lang.Long long2 = disciplina1.getId();
    disciplina1.setId((java.lang.Long)100L);
    java.util.List<models.MetaDica> list_metaDica5 = disciplina1.getMetadicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica5);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores1 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario2 = dicaDisciplinasAnteriores1.getListaUsuariosQueVotaram();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores1.setAutor(usuario6);
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("hi!", usuario6, "Conselho", "Conselho");
    boolean b11 = dicaMaterialUtil10.isVotavel();
    java.lang.String str12 = dicaMaterialUtil10.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Material \u00FAtil"+ "'", str12.equals("Material \u00FAtil"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    models.Tema tema1 = new models.Tema("models.DicaComoNaoTerDificuldade");

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.lang.String str1 = dicaMaterialUtil0.getNomeURL();
    dicaMaterialUtil0.setTitulo("");
    int i4 = dicaMaterialUtil0.getNumeroVotos();
    java.util.Set<models.Usuario> set_usuario5 = dicaMaterialUtil0.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario5);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

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
    java.lang.String str20 = metaDica12.calculaIndiceConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long19 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "0,0"+ "'", str20.equals("0,0"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia1 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    java.lang.String str3 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    dicaDisciplinasAnteriores0.setNomesDisciplinas("models.MetaDica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

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
    boolean b31 = metaDica20.recebeuDenunciaDe("0,0");
    java.util.List<models.IDica> list_iDica32 = metaDica20.getListaDicas();
    java.util.List<models.IDica> list_iDica33 = metaDica20.getListaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "models.MetaDica"+ "'", str22.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "models.MetaDica"+ "'", str27.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica33);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("0,0", usuario2, "models.DicaMaterialUtil", "Meta Dica");
    dicaDisciplinasAnteriores8.setId((long)'a');
    java.lang.String str11 = dicaDisciplinasAnteriores8.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str11.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.lang.String str3 = tema1.getNome();
    int i4 = tema1.getNumeroAvaliacoes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    boolean b4 = disciplina1.equals((java.lang.Object)10.0f);
    int i5 = disciplina1.getNumeroMetaDicasVisiveis();
    disciplina1.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    java.lang.Long long8 = disciplina1.getId();
    java.lang.Long long9 = disciplina1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long9);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    models.Tema tema1 = new models.Tema("models.DicaDisciplinasAnteriores");

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

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
    java.lang.String str27 = metaDica21.getCategoria();
    boolean b28 = metaDica21.isVisivel();
    
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
    org.junit.Assert.assertNotNull(usuario26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Meta Dica"+ "'", str27.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

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
    int i21 = tema1.getNumeroAvaliacoes();
    java.lang.Long long22 = tema1.getId();
    
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
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long22);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getTitulo();
    dicaDisciplinasAnteriores0.setNomesDisciplinas("models.DicaComoNaoTerDificuldade");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    models.Disciplina disciplina5 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica6 = disciplina5.getMetadicas();
    disciplina5.setId((java.lang.Long)10L);
    int i9 = disciplina5.getNumeroMetaDicas();
    disciplina5.setNome("models.DicaMaterialUtil");
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
    disciplina5.addMetaDica(metaDica24);
    boolean b35 = metaDica24.recebeuDenunciaDe("0,0");
    boolean b36 = metaDica24.isVisivel();
    disciplina1.addMetaDica(metaDica24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "models.MetaDica"+ "'", str26.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "models.MetaDica"+ "'", str31.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setTitulo("models.DicaMaterialUtil");
    int i4 = dicaMaterialUtil0.getNumeroDiscordancia();
    java.lang.String str5 = dicaMaterialUtil0.getNomeURL();
    java.lang.String str6 = dicaMaterialUtil0.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    dicaComoNaoTerDificuldade0.addDenuncia("models.DicaComoNaoTerDificuldade");
    java.lang.String str5 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str6 = dicaComoNaoTerDificuldade0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str5.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str6.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.MetaDica> list_metaDica5 = disciplina1.getMetadicas();
    java.util.List<models.Tema> list_tema6 = disciplina1.getTemas();
    models.Disciplina disciplina8 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica9 = disciplina8.getMetadicas();
    disciplina8.setId((java.lang.Long)10L);
    models.Usuario usuario14 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil17 = new models.DicaMaterialUtil("", usuario14, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica19 = new models.MetaDica("hi!", usuario14, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina8.addMetaDica(metaDica19);
    java.lang.String str21 = metaDica19.getTipo();
    metaDica19.addDenuncia("hi!");
    metaDica19.setComentario("models.MetaDica");
    java.lang.String str26 = metaDica19.getComentario();
    disciplina1.addMetaDica(metaDica19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "models.MetaDica"+ "'", str21.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "models.MetaDica"+ "'", str26.equals("models.MetaDica"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    dicaConselho0.setConselho("models.DicaConselho");
    dicaConselho0.setConselho("models.DicaMaterialUtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

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
    long long20 = metaDica12.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long20 == (-1L));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica7 = new models.MetaDica("hi!", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i8 = metaDica7.getNumeroDenuncias();
    models.Usuario usuario9 = null;
    metaDica7.setAutor(usuario9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getCategoria();
    metaDica12.setId((long)(byte)1);
    int i17 = metaDica12.getNumeroDenuncias();
    boolean b18 = metaDica12.isVotavel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Meta Dica"+ "'", str14.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

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
    metaDica12.setTitulo("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "models.MetaDica"+ "'", str19.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "models.MetaDica"+ "'", str20.equals("models.MetaDica"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    models.Tema tema0 = new models.Tema();
    boolean b2 = tema0.isAvaliado("");
    tema0.addAvaliacao("0", (java.lang.Integer)1);
    java.lang.Long long6 = tema0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    models.DicaMaterialUtil dicaMaterialUtil4 = new models.DicaMaterialUtil();
    boolean b5 = dicaMaterialUtil4.isVotavel();
    boolean b6 = dicaMaterialUtil4.isVotavel();
    java.lang.String str7 = dicaMaterialUtil4.getNomeURL();
    int i8 = dicaComoNaoTerDificuldade0.compareTo((models.IDica)dicaMaterialUtil4);
    java.lang.String str9 = dicaMaterialUtil4.getDominioURL();
    
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
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    dicaComoNaoTerDificuldade0.setId((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

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
    java.lang.String str30 = metaDica21.getCategoria();
    
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
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Meta Dica"+ "'", str30.equals("Meta Dica"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setTitulo("models.DicaMaterialUtil");
    int i4 = dicaMaterialUtil0.getNumeroDiscordancia();
    dicaMaterialUtil0.setNomeURL("Conselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    java.lang.String str9 = dicaDisciplinasAnteriores8.getCategoria();
    int i10 = dicaDisciplinasAnteriores8.getNumeroDiscordancia();
    java.lang.String str11 = dicaDisciplinasAnteriores8.getCategoria();
    dicaDisciplinasAnteriores8.setNomesDisciplinas("Meta Dica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str9.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str11.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    models.Usuario usuario3 = new models.Usuario("", "models.MetaDica", "Meta Dica");

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str4 = usuario3.getLogin();
    java.lang.String str5 = usuario3.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.DicaConselho"+ "'", str4.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.lang.String str1 = dicaMaterialUtil0.getNomeURL();
    long long2 = dicaMaterialUtil0.getId();
    dicaMaterialUtil0.setNomeURL("models.DicaMaterialUtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Concordancia concordancia4 = new models.Concordancia(usuario3);
    usuario3.setLogin("0");

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    java.util.List<models.IDica> list_iDica3 = tema1.getDicas();
    int i4 = tema1.getNumeroDicasVisiveis();
    int i5 = tema1.getNumeroAvaliacoes();
    double d6 = tema1.getMediana();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getCategoria();
    models.Usuario usuario7 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    usuario7.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho13 = new models.DicaConselho("", usuario7, "models.DicaConselho");
    int i14 = dicaComoNaoTerDificuldade0.compareTo((models.IDica)dicaConselho13);
    java.lang.String str15 = dicaComoNaoTerDificuldade0.calculaIndiceConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str2.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "0,0"+ "'", str15.equals("0,0"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

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
    java.lang.String str18 = dicaMaterialUtil15.getTipo();
    boolean b19 = dicaMaterialUtil15.isVotavel();
    java.util.List<models.Discordancia> list_discordancia20 = dicaMaterialUtil15.getListaDiscordancia();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "models.DicaMaterialUtil"+ "'", str18.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia20);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

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
    java.lang.String str18 = dicaMaterialUtil15.getTipo();
    java.lang.String str19 = dicaMaterialUtil15.calculaIndiceConcordancia();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "models.DicaMaterialUtil"+ "'", str18.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "0,0"+ "'", str19.equals("0,0"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    java.util.List<models.IDica> list_iDica3 = tema1.getDicas();
    int i4 = tema1.getNumeroDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    java.lang.String str1 = metaDica0.calculaIndiceConcordancia();
    metaDica0.addDenuncia("Meta Dica");
    models.Usuario usuario4 = null;
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    int i7 = discordancia6.getId();
    metaDica0.adicionaDiscordancia(discordancia6);
    java.lang.String str9 = discordancia6.getRazaoDiscordancia();
    discordancia6.setRazaoDiscordancia("Disciplinas anteriores que te ajudar\u00E3o aqui");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0,0"+ "'", str1.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    models.Usuario usuario2 = null;
    models.Discordancia discordancia4 = new models.Discordancia(usuario2, "hi!");
    discordancia4.setRazaoDiscordancia("");
    int i7 = discordancia4.getId();
    dicaMaterialUtil0.adicionaDiscordancia(discordancia4);
    java.lang.String str9 = dicaMaterialUtil0.getDominioURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    disciplina1.setNome("models.DicaConselho");
    java.lang.String str8 = disciplina1.getNome();
    int i9 = disciplina1.getNumeroMetaDicasVisiveis();
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade10 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str11 = dicaComoNaoTerDificuldade10.getNomeAssunto();
    int i12 = dicaComoNaoTerDificuldade10.getNumeroDenuncias();
    java.lang.String str13 = dicaComoNaoTerDificuldade10.getCategoria();
    dicaComoNaoTerDificuldade10.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    java.lang.String str16 = dicaComoNaoTerDificuldade10.getTipo();
    models.Usuario usuario20 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str21 = usuario20.getLogin();
    dicaComoNaoTerDificuldade10.setAutor(usuario20);
    dicaComoNaoTerDificuldade10.addDenuncia("");
    dicaComoNaoTerDificuldade10.setNomeAssunto("models.DicaConselho");
    boolean b27 = disciplina1.equals((java.lang.Object)dicaComoNaoTerDificuldade10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str13.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str16.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "models.DicaConselho"+ "'", str21.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

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
    models.DicaMaterialUtil dicaMaterialUtil13 = new models.DicaMaterialUtil();
    dicaMaterialUtil13.setId((long)(short)100);
    dicaMaterialUtil13.setNomeURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str18 = dicaMaterialUtil13.getTitulo();
    int i19 = dicaMaterialUtil0.compareTo((models.IDica)dicaMaterialUtil13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Material \u00FAtil"+ "'", str12.equals("Material \u00FAtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getCategoria();
    metaDica12.setId((long)(byte)1);
    int i17 = metaDica12.getNumeroDenuncias();
    java.lang.String str18 = metaDica12.getTipo();
    java.lang.String str19 = metaDica12.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Meta Dica"+ "'", str14.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "models.MetaDica"+ "'", str18.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Meta Dica"+ "'", str19.equals("Meta Dica"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    models.Concordancia concordancia7 = new models.Concordancia(usuario4);
    models.Usuario usuario8 = concordancia7.getAutor();
    java.lang.String str9 = usuario8.getLogin();
    usuario8.setNome("");
    usuario8.setSenha("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

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
    dicaConselho0.setId((long)(byte)10);
    
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

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.DicaConselho dicaConselho8 = new models.DicaConselho("models.MetaDica", usuario5, "0");

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    java.lang.String str2 = dicaMaterialUtil0.getNomeURL();
    java.lang.String str3 = dicaMaterialUtil0.getDominioURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

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
    java.lang.String str18 = dicaMaterialUtil15.getTipo();
    boolean b19 = dicaMaterialUtil15.isVotavel();
    int i20 = dicaMaterialUtil15.getNumeroConcordancias();
    dicaMaterialUtil15.setNomeURL("Meta Dica");
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "models.DicaMaterialUtil"+ "'", str18.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    models.Usuario usuario1 = new models.Usuario();
    java.lang.String str2 = usuario1.getNome();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario1, "Conselho", "models.DicaComoNaoTerDificuldade");
    java.lang.String str6 = usuario1.getLogin();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores1 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario2 = dicaDisciplinasAnteriores1.getListaUsuariosQueVotaram();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores1.setAutor(usuario6);
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("hi!", usuario6, "Conselho", "Conselho");
    boolean b11 = dicaMaterialUtil10.isVotavel();
    java.lang.String str12 = dicaMaterialUtil10.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaMaterialUtil"+ "'", str12.equals("models.DicaMaterialUtil"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    int i7 = usuario4.getId();
    usuario4.setSenha("models.DicaConselho");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores12 = new models.DicaDisciplinasAnteriores("0,0", usuario4, "models.MetaDica", "Material \u00FAtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    java.util.Set<models.Usuario> set_usuario9 = dicaDisciplinasAnteriores8.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario9);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

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
    int i12 = dicaMaterialUtil0.getNumeroConcordancias();
    dicaMaterialUtil0.setId((-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getCategoria();
    dicaConselho0.setId((long)'#');
    java.util.Set<models.Usuario> set_usuario6 = dicaConselho0.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Conselho"+ "'", str3.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario6);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    tema1.addAvaliacao("Material \u00FAtil", (java.lang.Integer)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

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
    boolean b19 = tema9.isAvaliado("models.DicaComoNaoTerDificuldade");
    
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
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

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
    java.util.List<models.Discordancia> list_discordancia15 = dicaMaterialUtil0.getListaDiscordancia();
    java.lang.String str16 = dicaMaterialUtil0.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

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
    java.lang.String str14 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str3.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    int i4 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    models.DicaMaterialUtil dicaMaterialUtil6 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia7 = dicaMaterialUtil6.getListaDiscordancia();
    boolean b8 = tema1.equals((java.lang.Object)list_discordancia7);
    boolean b10 = tema1.isAvaliado("models.DicaComoNaoTerDificuldade");
    
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
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    models.Usuario usuario1 = new models.Usuario();
    usuario1.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia4 = new models.Concordancia(usuario1);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores7 = new models.DicaDisciplinasAnteriores("", usuario1, "Meta Dica", "0,0");
    dicaDisciplinasAnteriores7.setRazoesDisciplinas("models.DicaComoNaoTerDificuldade");
    java.util.Set<models.Usuario> set_usuario10 = dicaDisciplinasAnteriores7.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario10);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getCategoria();
    models.Usuario usuario7 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    usuario7.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho13 = new models.DicaConselho("", usuario7, "models.DicaConselho");
    int i14 = dicaComoNaoTerDificuldade0.compareTo((models.IDica)dicaConselho13);
    dicaConselho13.setConselho("0");
    java.lang.String str17 = dicaConselho13.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str2.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Conselho"+ "'", str17.equals("Conselho"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade6 = new models.DicaComoNaoTerDificuldade("models.DicaComoNaoTerDificuldade", usuario4, "models.DicaConselho");
    java.lang.String str7 = dicaComoNaoTerDificuldade6.getNomeAssunto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaConselho"+ "'", str7.equals("models.DicaConselho"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setTitulo("models.DicaDisciplinasAnteriores");
    dicaMaterialUtil0.setNomeURL("Conselho");
    java.lang.String str6 = dicaMaterialUtil0.getDominioURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getTipo();
    java.util.Set<models.Usuario> set_usuario2 = dicaConselho0.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "models.DicaConselho"+ "'", str1.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario2);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    java.lang.String str6 = dicaComoNaoTerDificuldade3.getTipo();
    java.lang.String str7 = dicaComoNaoTerDificuldade3.getTitulo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str6.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.DicaDisciplinasAnteriores", usuario5, "Meta Dica", "models.MetaDica");
    int i10 = dicaMaterialUtil9.getNumeroDenuncias();
    java.lang.String str11 = dicaMaterialUtil9.getTipo();
    dicaMaterialUtil9.setNomeURL("");
    dicaMaterialUtil9.setNomeURL("Meta Dica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaMaterialUtil"+ "'", str11.equals("models.DicaMaterialUtil"));

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    models.Disciplina disciplina1 = new models.Disciplina("models.MetaDica");
    java.lang.String str2 = disciplina1.getNome();
    disciplina1.setId((java.lang.Long)100L);
    java.lang.String str5 = disciplina1.getNome();
    java.lang.Long long6 = disciplina1.getId();
    java.lang.String str7 = disciplina1.getNome();
    models.Disciplina disciplina9 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica10 = disciplina9.getMetadicas();
    disciplina9.setId((java.lang.Long)1L);
    models.Tema tema14 = new models.Tema("");
    double d15 = tema14.getMedia();
    int i16 = tema14.getNumeroDicas();
    models.Tema tema17 = disciplina9.addTema(tema14);
    tema14.setId((java.lang.Long)0L);
    models.Tema tema20 = disciplina1.addTema(tema14);
    double d21 = tema20.getMedia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "models.MetaDica"+ "'", str2.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "models.MetaDica"+ "'", str5.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L+ "'", long6.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.MetaDica"+ "'", str7.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    models.Usuario usuario0 = null;
    models.Discordancia discordancia2 = new models.Discordancia(usuario0, "hi!");
    discordancia2.setRazaoDiscordancia("");
    int i5 = discordancia2.getId();
    discordancia2.setRazaoDiscordancia("");
    int i8 = discordancia2.getId();
    java.lang.String str9 = discordancia2.getRazaoDiscordancia();
    models.Usuario usuario11 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil("", usuario11, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    discordancia2.setAutor(usuario11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores0.setAutor(usuario5);
    java.util.Set<models.Usuario> set_usuario7 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("0,0");
    dicaDisciplinasAnteriores0.addDenuncia("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario7);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getCategoria();
    models.Usuario usuario3 = dicaConselho0.getAutor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario3);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.DicaDisciplinasAnteriores", usuario5, "Meta Dica", "models.MetaDica");
    int i10 = dicaMaterialUtil9.getNumeroDenuncias();
    dicaMaterialUtil9.setNomeURL("0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

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
    java.util.List<models.Discordancia> list_discordancia11 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str9.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia11);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

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
    java.lang.String str15 = dicaMaterialUtil0.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    models.Disciplina disciplina1 = new models.Disciplina("models.MetaDica");
    models.Disciplina disciplina3 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica4 = disciplina3.getMetadicas();
    disciplina3.setId((java.lang.Long)1L);
    models.Tema tema8 = new models.Tema("");
    double d9 = tema8.getMedia();
    int i10 = tema8.getNumeroDicas();
    models.Tema tema11 = disciplina3.addTema(tema8);
    models.Disciplina disciplina13 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica14 = disciplina13.getMetadicas();
    disciplina13.setId((java.lang.Long)10L);
    models.Usuario usuario19 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil22 = new models.DicaMaterialUtil("", usuario19, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica24 = new models.MetaDica("hi!", usuario19, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina13.addMetaDica(metaDica24);
    java.lang.String str26 = metaDica24.getTipo();
    java.lang.String str27 = metaDica24.getTitulo();
    disciplina3.addMetaDica(metaDica24);
    metaDica24.setId((long)1);
    disciplina1.addMetaDica(metaDica24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "models.MetaDica"+ "'", str26.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores0.setAutor(usuario5);
    java.util.List<models.Discordancia> list_discordancia7 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia7);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

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
    java.lang.String str18 = dicaMaterialUtil15.getTipo();
    boolean b19 = dicaMaterialUtil15.isVotavel();
    int i20 = dicaMaterialUtil15.getNumeroConcordancias();
    dicaMaterialUtil15.setNomeURL("hi!");
    java.lang.String str23 = dicaMaterialUtil15.getNomeURL();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "models.DicaMaterialUtil"+ "'", str18.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    models.Disciplina disciplina1 = new models.Disciplina("Meta Dica");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Meta Dica"+ "'", str3.equals("Meta Dica"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getCategoria();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str7 = usuario6.getLogin();
    dicaConselho0.setAutor(usuario6);
    java.lang.String str9 = dicaConselho0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaConselho"+ "'", str7.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Conselho"+ "'", str9.equals("Conselho"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

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
    java.lang.String str26 = dicaDisciplinasAnteriores0.calculaIndiceConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str12.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "0"+ "'", str26.equals("0"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia5 = new models.Discordancia(usuario3, "");
    usuario3.setNome("models.DicaMaterialUtil");
    java.lang.String str8 = usuario3.getLogin();
    usuario3.setNome("models.DicaConselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVisivel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("models.MetaDica", usuario5, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    usuario5.setLogin("");
    models.Concordancia concordancia13 = new models.Concordancia(usuario5);
    models.Usuario usuario14 = concordancia13.getAutor();
    models.DicaMaterialUtil dicaMaterialUtil17 = new models.DicaMaterialUtil("", usuario14, "Conselho", "");
    java.lang.String str18 = dicaMaterialUtil17.getDominioURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    models.Usuario usuario1 = new models.Usuario();
    usuario1.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia4 = new models.Concordancia(usuario1);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores7 = new models.DicaDisciplinasAnteriores("", usuario1, "Meta Dica", "0,0");
    boolean b9 = dicaDisciplinasAnteriores7.recebeuDenunciaDe("Material \u00FAtil");
    dicaDisciplinasAnteriores7.setNomesDisciplinas("models.DicaConselho");
    java.lang.String str12 = dicaDisciplinasAnteriores7.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str12.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    double d7 = tema6.getMedia();
    int i8 = tema6.getNumeroDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    boolean b11 = tema6.isAvaliado("");
    int i12 = tema6.getNumeroDicasVisiveis();
    int i13 = tema6.getNumeroDicas();
    java.lang.String str14 = tema6.getNome();
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    java.lang.Object obj3 = null;
    boolean b4 = tema1.equals(obj3);
    tema1.setId((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    disciplina1.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    int i6 = disciplina1.getNumeroMetaDicasVisiveis();
    java.util.List<models.MetaDica> list_metaDica7 = disciplina1.getMetadicas();
    int i8 = disciplina1.getNumeroMetaDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    java.lang.String str1 = metaDica0.calculaIndiceConcordancia();
    java.lang.String str2 = metaDica0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0,0"+ "'", str1.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Meta Dica"+ "'", str2.equals("Meta Dica"));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

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
    java.util.Set<models.Usuario> set_usuario19 = metaDica12.getListaUsuariosQueVotaram();
    int i20 = metaDica12.getNumeroDicasNaMetaDica();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    models.Usuario usuario1 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil4 = new models.DicaMaterialUtil("", usuario1, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia5 = new models.Concordancia(usuario1);
    int i6 = concordancia5.getId();
    int i7 = concordancia5.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

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
    java.lang.Long long14 = tema1.getId();
    int i15 = tema1.getNumeroAvaliacoes();
    
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
    org.junit.Assert.assertNull(long14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.lang.String str1 = dicaMaterialUtil0.calculaIndiceConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0,0"+ "'", str1.equals("0,0"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    java.lang.String str3 = dicaMaterialUtil0.getNomeURL();
    models.Usuario usuario8 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica10 = new models.MetaDica("models.MetaDica", usuario8, "models.DicaConselho");
    models.Concordancia concordancia11 = new models.Concordancia(usuario8);
    models.Usuario usuario12 = concordancia11.getAutor();
    dicaMaterialUtil0.adicionaConcordancia(concordancia11);
    java.lang.String str14 = dicaMaterialUtil0.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

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
    metaDica12.setComentario("Material \u00FAtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "models.MetaDica"+ "'", str19.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Meta Dica"+ "'", str20.equals("Meta Dica"));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.lang.Long long2 = disciplina1.getId();
    java.lang.String str3 = disciplina1.getNome();
    disciplina1.setId((java.lang.Long)0L);
    java.util.List<models.Tema> list_tema6 = disciplina1.getTemas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema6);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia1 = dicaMaterialUtil0.getListaDiscordancia();
    java.lang.String str2 = dicaMaterialUtil0.getTitulo();
    dicaMaterialUtil0.setNomeURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    models.Disciplina disciplina1 = new models.Disciplina("Meta Dica");
    java.lang.Long long2 = disciplina1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    models.Usuario usuario1 = new models.Usuario();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores4 = new models.DicaDisciplinasAnteriores("models.MetaDica", usuario1, "Meta Dica", "Meta Dica");
    usuario1.setNome("0,0");

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    models.Tema tema1 = new models.Tema("Conselho");

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    models.Usuario usuario0 = null;
    models.Discordancia discordancia2 = new models.Discordancia(usuario0, "hi!");
    discordancia2.setRazaoDiscordancia("");
    java.lang.String str5 = discordancia2.getRazaoDiscordancia();
    int i6 = discordancia2.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia1 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    dicaDisciplinasAnteriores0.setNomesDisciplinas("Conselho");
    java.lang.String str4 = dicaDisciplinasAnteriores0.getCategoria();
    java.lang.String str5 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str4.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Conselho"+ "'", str5.equals("Conselho"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores0.setAutor(usuario5);
    java.util.Set<models.Usuario> set_usuario7 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("0,0");
    java.util.List<models.Discordancia> list_discordancia10 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia10);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia5 = new models.Discordancia(usuario3, "");
    int i6 = usuario3.getId();
    usuario3.setSenha("models.DicaConselho");
    usuario3.setSenha("models.DicaConselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    models.Usuario usuario0 = new models.Usuario();
    usuario0.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    boolean b4 = usuario0.checaSenha("Meta Dica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    java.lang.String str3 = metaDica0.getTitulo();
    int i4 = metaDica0.getNumeroVotos();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.lang.String str3 = tema1.getNome();
    double d4 = tema1.getMediana();
    int i5 = tema1.getNumeroDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

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
    metaDica12.setComentario("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 0L);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario4.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores9 = new models.DicaDisciplinasAnteriores("0,0", usuario4, "", "models.DicaComoNaoTerDificuldade");
    java.util.List<models.Discordancia> list_discordancia10 = dicaDisciplinasAnteriores9.getListaDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia10);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

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
    java.lang.String str13 = dicaConselho0.getTipo();
    java.lang.String str14 = dicaConselho0.getTipo();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "models.DicaConselho"+ "'", str13.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.DicaConselho"+ "'", str14.equals("models.DicaConselho"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.List<models.IDica> list_iDica3 = tema1.getDicas();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores4 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia5 = dicaDisciplinasAnteriores4.getListaDiscordancia();
    java.lang.String str6 = dicaDisciplinasAnteriores4.getNomesDisciplinas();
    java.lang.String str7 = dicaDisciplinasAnteriores4.getRazoesDisciplinas();
    tema1.addDica((models.IDica)dicaDisciplinasAnteriores4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.lang.Long long2 = disciplina1.getId();
    disciplina1.setId((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

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
    int i12 = dicaDisciplinasAnteriores0.getNumeroVotos();
    
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
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getTipo();
    int i4 = dicaConselho0.getNumeroDiscordancia();
    dicaConselho0.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str7 = dicaConselho0.getTipo();
    java.lang.String str8 = dicaConselho0.getTipo();
    int i9 = dicaConselho0.getNumeroVotos();
    java.lang.String str10 = dicaConselho0.getTipo();
    
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
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "models.DicaConselho"+ "'", str10.equals("models.DicaConselho"));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    models.Disciplina disciplina1 = new models.Disciplina("0,0");
    models.Usuario usuario3 = new models.Usuario();
    usuario3.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia6 = new models.Concordancia(usuario3);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores9 = new models.DicaDisciplinasAnteriores("", usuario3, "Meta Dica", "0,0");
    boolean b11 = dicaDisciplinasAnteriores9.recebeuDenunciaDe("models.DicaDisciplinasAnteriores");
    boolean b12 = disciplina1.equals((java.lang.Object)"models.DicaDisciplinasAnteriores");
    disciplina1.setNome("models.MetaDica");
    int i15 = disciplina1.getNumeroMetaDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

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
    boolean b14 = dicaMaterialUtil0.isVotavel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getCategoria();
    models.Usuario usuario7 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    usuario7.setNome("Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores14 = new models.DicaDisciplinasAnteriores("", usuario7, "0,0", "hi!");
    dicaComoNaoTerDificuldade0.setAutor(usuario7);
    int i16 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str2.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    java.util.List<models.MetaDica> list_metaDica6 = disciplina1.getMetadicas();
    int i7 = disciplina1.getNumeroMetaDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    java.lang.String str6 = dicaComoNaoTerDificuldade3.getTipo();
    dicaComoNaoTerDificuldade3.setNomeAssunto("hi!");
    java.lang.String str9 = dicaComoNaoTerDificuldade3.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str6.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str9.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    java.util.List<models.IDica> list_iDica7 = tema6.getDicas();
    java.util.List<models.IDica> list_iDica8 = tema6.getDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    tema6.ordenarTopConcordancias();
    int i11 = tema6.getNumeroDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

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
    double d12 = tema1.getMedia();
    tema1.ordenarTopConcordancias();
    
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
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

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
    int i12 = dicaMaterialUtil0.getNumeroConcordancias();
    long long13 = dicaMaterialUtil0.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 100L);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Usuario usuario2 = null;
    models.Discordancia discordancia4 = new models.Discordancia(usuario2, "");
    models.Usuario usuario5 = null;
    discordancia4.setAutor(usuario5);
    int i7 = discordancia4.getId();
    dicaDisciplinasAnteriores0.adicionaDiscordancia(discordancia4);
    java.lang.String str9 = dicaDisciplinasAnteriores0.getTipo();
    java.lang.String str10 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str9.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    int i3 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    java.lang.Long long5 = tema1.getId();
    tema1.ordenarTopConcordancias();
    int i7 = tema1.getNumeroDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    java.util.List<models.MetaDica> list_metaDica5 = disciplina1.getMetadicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica5);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getCategoria();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str7 = usuario6.getLogin();
    dicaConselho0.setAutor(usuario6);
    java.util.List<models.Discordancia> list_discordancia9 = dicaConselho0.getListaDiscordancia();
    int i10 = dicaConselho0.getNumeroConcordancias();
    java.util.List<models.Concordancia> list_concordancia11 = dicaConselho0.getListaConcordancia();
    dicaConselho0.setConselho("models.DicaMaterialUtil");
    
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

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

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
    java.lang.String str18 = dicaMaterialUtil15.getTipo();
    boolean b19 = dicaMaterialUtil15.isVotavel();
    int i20 = dicaMaterialUtil15.getNumeroConcordancias();
    dicaMaterialUtil15.setNomeURL("hi!");
    java.lang.String str23 = dicaMaterialUtil15.getCategoria();
    java.lang.String str24 = dicaMaterialUtil15.getNomeURL();
    models.Usuario usuario25 = dicaMaterialUtil15.getAutor();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "models.DicaMaterialUtil"+ "'", str18.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Material \u00FAtil"+ "'", str23.equals("Material \u00FAtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario25);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    boolean b4 = disciplina1.equals((java.lang.Object)10.0f);
    disciplina1.setId((java.lang.Long)100L);
    models.MetaDica metaDica7 = null;
    disciplina1.addMetaDica(metaDica7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.lang.Long long2 = disciplina1.getId();
    java.util.List<models.MetaDica> list_metaDica3 = disciplina1.getMetadicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica3);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    double d3 = tema1.getMediana();
    int i4 = tema1.getNumeroDicasVisiveis();
    java.util.List<models.IDica> list_iDica5 = tema1.getDicas();
    tema1.addAvaliacao("models.DicaMaterialUtil", (java.lang.Integer)(-1));
    java.lang.String str9 = tema1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    int i5 = disciplina1.getNumeroMetaDicas();
    disciplina1.setNome("models.DicaMaterialUtil");
    java.lang.String str8 = disciplina1.getNome();
    int i9 = disciplina1.getNumeroMetaDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaMaterialUtil"+ "'", str8.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

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
    models.Usuario usuario11 = dicaDisciplinasAnteriores0.getAutor();
    java.lang.String str12 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    dicaDisciplinasAnteriores0.setNomesDisciplinas("models.DicaConselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str9.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    usuario4.setNome("Meta Dica");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores11 = new models.DicaDisciplinasAnteriores("", usuario4, "0,0", "hi!");
    models.Usuario usuario16 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia18 = new models.Discordancia(usuario16, "");
    models.DicaMaterialUtil dicaMaterialUtil21 = new models.DicaMaterialUtil("models.MetaDica", usuario16, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    boolean b22 = dicaDisciplinasAnteriores11.usuarioAtualVotouNestaDica(usuario16);
    boolean b23 = dicaDisciplinasAnteriores11.isVotavel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia1 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    dicaDisciplinasAnteriores0.setId((long)'#');
    java.lang.String str5 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    models.Usuario usuario0 = new models.Usuario();
    java.lang.String str1 = usuario0.getNome();
    usuario0.setSenha("models.MetaDica");
    usuario0.setNome("models.DicaComoNaoTerDificuldade");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.lang.String str1 = dicaMaterialUtil0.getNomeURL();
    java.lang.String str2 = dicaMaterialUtil0.getDominioURL();
    dicaMaterialUtil0.setNomeURL("models.MetaDica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    java.lang.String str3 = dicaMaterialUtil0.getNomeURL();
    java.lang.String str4 = dicaMaterialUtil0.calculaIndiceConcordancia();
    dicaMaterialUtil0.setNomeURL("models.DicaMaterialUtil");
    dicaMaterialUtil0.setNomeURL("Disciplinas anteriores que te ajudar\u00E3o aqui");
    dicaMaterialUtil0.setNomeURL("Disciplinas anteriores que te ajudar\u00E3o aqui");
    java.lang.String str11 = dicaMaterialUtil0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0,0"+ "'", str4.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Material \u00FAtil"+ "'", str11.equals("Material \u00FAtil"));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setTitulo("models.DicaDisciplinasAnteriores");
    dicaMaterialUtil0.setNomeURL("Conselho");
    java.lang.String str6 = dicaMaterialUtil0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Material \u00FAtil"+ "'", str6.equals("Material \u00FAtil"));

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    models.Usuario usuario2 = new models.Usuario();
    usuario2.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia5 = new models.Concordancia(usuario2);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("", usuario2, "Meta Dica", "0,0");
    models.DicaMaterialUtil dicaMaterialUtil11 = new models.DicaMaterialUtil("", usuario2, "models.DicaMaterialUtil", "models.DicaMaterialUtil");
    dicaMaterialUtil11.setDominioURL("Material \u00FAtil");

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.DicaDisciplinasAnteriores", usuario5, "Meta Dica", "models.MetaDica");
    java.lang.String str10 = dicaMaterialUtil9.getTipo();
    java.lang.String str11 = dicaMaterialUtil9.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "models.DicaMaterialUtil"+ "'", str10.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaMaterialUtil"+ "'", str11.equals("models.DicaMaterialUtil"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("");
    int i4 = dicaDisciplinasAnteriores0.getNumeroDiscordancia();
    java.lang.String str5 = dicaDisciplinasAnteriores0.calculaIndiceConcordancia();
    java.lang.String str6 = dicaDisciplinasAnteriores0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0,0"+ "'", str5.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str6.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    models.Tema tema0 = new models.Tema();
    tema0.ordenarTopConcordancias();
    tema0.addAvaliacao("", (java.lang.Integer)10);
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i5 = tema0.getAvaliacoes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i5);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    java.lang.String str3 = tema1.getNome();
    double d4 = tema1.getMedia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

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
    int i21 = metaDica12.getNumeroDicasNaMetaDica();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "models.MetaDica"+ "'", str19.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Meta Dica"+ "'", str20.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    models.Disciplina disciplina1 = new models.Disciplina("models.MetaDica");
    java.lang.String str2 = disciplina1.getNome();
    java.util.List<models.Tema> list_tema3 = disciplina1.getTemas();
    models.Disciplina disciplina5 = new models.Disciplina("models.MetaDica");
    java.lang.Long long6 = disciplina5.getId();
    boolean b7 = disciplina1.equals((java.lang.Object)long6);
    java.lang.Long long8 = disciplina1.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "models.MetaDica"+ "'", str2.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long8);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    java.util.List<models.IDica> list_iDica7 = tema6.getDicas();
    java.util.List<models.IDica> list_iDica8 = tema6.getDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    tema9.addAvaliacao("Meta Dica", (java.lang.Integer)(-1));
    double d13 = tema9.getMediana();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-1.0d));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    int i6 = dicaComoNaoTerDificuldade0.getNumeroDiscordancia();
    java.lang.String str7 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    boolean b9 = dicaComoNaoTerDificuldade0.recebeuDenunciaDe("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str7.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    models.Usuario usuario1 = dicaConselho0.getAutor();
    java.util.List<models.Discordancia> list_discordancia2 = dicaConselho0.getListaDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia2);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    java.lang.String str2 = dicaMaterialUtil0.getNomeURL();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia8 = new models.Discordancia(usuario6, "");
    usuario6.setNome("models.DicaMaterialUtil");
    java.lang.String str11 = usuario6.getLogin();
    java.lang.String str12 = usuario6.getLogin();
    dicaMaterialUtil0.setAutor(usuario6);
    models.Disciplina disciplina15 = new models.Disciplina("Meta Dica");
    disciplina15.setId((java.lang.Long)100L);
    java.util.List<models.Tema> list_tema18 = disciplina15.getTemas();
    boolean b19 = usuario6.equals((java.lang.Object)disciplina15);
    disciplina15.setId((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaConselho"+ "'", str11.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaConselho"+ "'", str12.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

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
    java.util.List<models.IDica> list_iDica19 = metaDica12.getListaDicas();
    int i20 = metaDica12.getNumeroConcordancias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

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
    java.util.List<models.Concordancia> list_concordancia11 = dicaDisciplinasAnteriores0.getListaConcordancia();
    java.lang.String str12 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    java.util.Set<models.Usuario> set_usuario13 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str9.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario13);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.MetaDica", usuario4, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    java.lang.String str10 = dicaMaterialUtil9.getCategoria();
    java.lang.String str11 = dicaMaterialUtil9.getCategoria();
    java.lang.String str12 = dicaMaterialUtil9.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Material \u00FAtil"+ "'", str10.equals("Material \u00FAtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Material \u00FAtil"+ "'", str11.equals("Material \u00FAtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Material \u00FAtil"+ "'", str12.equals("Material \u00FAtil"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia7 = new models.Discordancia(usuario5, "");
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("models.MetaDica", usuario5, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    usuario5.setLogin("");
    models.Concordancia concordancia13 = new models.Concordancia(usuario5);
    models.Usuario usuario14 = concordancia13.getAutor();
    models.DicaMaterialUtil dicaMaterialUtil17 = new models.DicaMaterialUtil("", usuario14, "Conselho", "");
    models.Usuario usuario18 = dicaMaterialUtil17.getAutor();
    java.lang.String str19 = dicaMaterialUtil17.getNomeURL();
    java.lang.String str20 = dicaMaterialUtil17.getDominioURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Conselho"+ "'", str19.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    java.lang.String str1 = metaDica0.calculaIndiceConcordancia();
    metaDica0.addDenuncia("Meta Dica");
    models.Usuario usuario4 = null;
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    int i7 = discordancia6.getId();
    metaDica0.adicionaDiscordancia(discordancia6);
    metaDica0.setId((long)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0,0"+ "'", str1.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

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
    java.lang.String str20 = metaDica12.getComentario();
    java.util.Set<models.Usuario> set_usuario21 = metaDica12.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "models.MetaDica"+ "'", str19.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "models.MetaDica"+ "'", str20.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario21);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    double d3 = tema1.getMediana();
    int i4 = tema1.getNumeroDicasVisiveis();
    java.util.List<models.IDica> list_iDica5 = tema1.getDicas();
    tema1.addAvaliacao("models.DicaMaterialUtil", (java.lang.Integer)(-1));
    tema1.setId((java.lang.Long)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica5);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

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
    int i15 = tema6.getNumeroAvaliacoes();
    
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
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

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
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("");
    models.Usuario usuario14 = dicaDisciplinasAnteriores0.getAutor();
    int i15 = dicaDisciplinasAnteriores0.getNumeroVotos();
    dicaDisciplinasAnteriores0.addDenuncia("Meta Dica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str4 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    models.Concordancia concordancia5 = new models.Concordancia();
    dicaComoNaoTerDificuldade0.adicionaConcordancia(concordancia5);
    boolean b8 = dicaComoNaoTerDificuldade0.recebeuDenunciaDe("0,0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

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
    boolean b31 = metaDica20.recebeuDenunciaDe("0,0");
    java.util.List<models.IDica> list_iDica32 = metaDica20.getListaDicas();
    int i33 = metaDica20.getNumeroDicasNaMetaDica();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "models.MetaDica"+ "'", str22.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "models.MetaDica"+ "'", str27.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia1 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    models.DicaMaterialUtil dicaMaterialUtil2 = new models.DicaMaterialUtil();
    boolean b3 = dicaMaterialUtil2.isVotavel();
    boolean b4 = dicaMaterialUtil2.isVotavel();
    dicaMaterialUtil2.setNomeURL("hi!");
    dicaMaterialUtil2.setDominioURL("models.DicaComoNaoTerDificuldade");
    int i9 = dicaDisciplinasAnteriores0.compareTo((models.IDica)dicaMaterialUtil2);
    dicaMaterialUtil2.setNomeURL("hi!");
    
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
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

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
    dicaDisciplinasAnteriores16.setRazoesDisciplinas("0,0");
    
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

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

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
    int i12 = dicaMaterialUtil0.getNumeroConcordancias();
    java.lang.String str13 = dicaMaterialUtil0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "models.DicaMaterialUtil"+ "'", str13.equals("models.DicaMaterialUtil"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroVotos();
    dicaComoNaoTerDificuldade0.setNomeAssunto("0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i4 = tema1.getAvaliacoes();
    models.IDica iDica5 = null;
    tema1.addDica(iDica5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i4);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    models.Usuario usuario4 = new models.Usuario("models.MetaDica", "Conselho", "0,0");
    models.MetaDica metaDica6 = new models.MetaDica("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario4, "Meta Dica");

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    models.Usuario usuario0 = new models.Usuario();
    usuario0.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Discordancia discordancia4 = new models.Discordancia(usuario0, "hi!");
    int i5 = discordancia4.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia1 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    models.DicaMaterialUtil dicaMaterialUtil2 = new models.DicaMaterialUtil();
    boolean b3 = dicaMaterialUtil2.isVotavel();
    boolean b4 = dicaMaterialUtil2.isVotavel();
    dicaMaterialUtil2.setNomeURL("hi!");
    dicaMaterialUtil2.setDominioURL("models.DicaComoNaoTerDificuldade");
    int i9 = dicaDisciplinasAnteriores0.compareTo((models.IDica)dicaMaterialUtil2);
    java.lang.String str10 = dicaDisciplinasAnteriores0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str10.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Concordancia concordancia4 = new models.Concordancia(usuario3);
    models.DicaConselho dicaConselho5 = new models.DicaConselho();
    java.lang.String str6 = dicaConselho5.getCategoria();
    dicaConselho5.setConselho("models.MetaDica");
    dicaConselho5.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str11 = dicaConselho5.getTipo();
    models.Usuario usuario12 = new models.Usuario();
    usuario12.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    java.lang.String str15 = usuario12.getLogin();
    dicaConselho5.setAutor(usuario12);
    concordancia4.setAutor(usuario12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Conselho"+ "'", str6.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaConselho"+ "'", str11.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia1 = dicaMaterialUtil0.getListaDiscordancia();
    java.lang.String str2 = dicaMaterialUtil0.getTitulo();
    dicaMaterialUtil0.setNomeURL("models.DicaMaterialUtil");
    java.lang.String str5 = dicaMaterialUtil0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Material \u00FAtil"+ "'", str5.equals("Material \u00FAtil"));

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    int i6 = dicaComoNaoTerDificuldade0.getNumeroDiscordancia();
    models.Usuario usuario7 = dicaComoNaoTerDificuldade0.getAutor();
    java.lang.String str8 = dicaComoNaoTerDificuldade0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str8.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    models.Usuario usuario1 = dicaConselho0.getAutor();
    java.lang.String str2 = dicaConselho0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    dicaConselho0.setConselho("models.MetaDica");
    java.util.List<models.Discordancia> list_discordancia4 = dicaConselho0.getListaDiscordancia();
    boolean b5 = dicaConselho0.isVisivel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    disciplina1.setNome("models.DicaConselho");
    java.lang.String str8 = disciplina1.getNome();
    int i9 = disciplina1.getNumeroMetaDicasVisiveis();
    disciplina1.setId((java.lang.Long)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    java.lang.String str9 = dicaDisciplinasAnteriores8.getCategoria();
    int i10 = dicaDisciplinasAnteriores8.getNumeroDiscordancia();
    java.lang.String str11 = dicaDisciplinasAnteriores8.getCategoria();
    dicaDisciplinasAnteriores8.setNomesDisciplinas("0,0");
    int i14 = dicaDisciplinasAnteriores8.getNumeroConcordancias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str9.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str11.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    models.Disciplina disciplina1 = new models.Disciplina("Meta Dica");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setNome("models.DicaMaterialUtil");
    java.lang.String str5 = disciplina1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "models.DicaMaterialUtil"+ "'", str5.equals("models.DicaMaterialUtil"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

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
    models.Usuario usuario24 = new models.Usuario("", "hi!", "models.DicaConselho");
    boolean b26 = usuario24.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia27 = new models.Concordancia(usuario24);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade28 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str29 = dicaComoNaoTerDificuldade28.getNomeAssunto();
    int i30 = dicaComoNaoTerDificuldade28.getNumeroDenuncias();
    java.lang.String str31 = dicaComoNaoTerDificuldade28.getCategoria();
    java.lang.String str32 = dicaComoNaoTerDificuldade28.getNomeAssunto();
    models.Concordancia concordancia33 = new models.Concordancia();
    dicaComoNaoTerDificuldade28.adicionaConcordancia(concordancia33);
    dicaComoNaoTerDificuldade28.setNomeAssunto("models.DicaDisciplinasAnteriores");
    java.lang.String str37 = dicaComoNaoTerDificuldade28.getCategoria();
    boolean b38 = usuario24.equals((java.lang.Object)dicaComoNaoTerDificuldade28);
    metaDica16.adicionaDica((models.IDica)dicaComoNaoTerDificuldade28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "models.MetaDica"+ "'", str18.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str31.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str37.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    models.DicaMaterialUtil dicaMaterialUtil4 = new models.DicaMaterialUtil();
    boolean b5 = dicaMaterialUtil4.isVotavel();
    boolean b6 = dicaMaterialUtil4.isVotavel();
    java.lang.String str7 = dicaMaterialUtil4.getNomeURL();
    int i8 = dicaComoNaoTerDificuldade0.compareTo((models.IDica)dicaMaterialUtil4);
    java.lang.String str9 = dicaMaterialUtil4.getTipo();
    
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
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaMaterialUtil"+ "'", str9.equals("models.DicaMaterialUtil"));

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    java.lang.String str4 = dicaComoNaoTerDificuldade0.calculaIndiceConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0,0"+ "'", str4.equals("0,0"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    models.Tema tema0 = new models.Tema();
    boolean b2 = tema0.isAvaliado("");
    tema0.addAvaliacao("0", (java.lang.Integer)1);
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i6 = tema0.getAvaliacoes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i6);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Usuario usuario2 = null;
    models.Discordancia discordancia4 = new models.Discordancia(usuario2, "");
    models.Usuario usuario5 = null;
    discordancia4.setAutor(usuario5);
    int i7 = discordancia4.getId();
    dicaDisciplinasAnteriores0.adicionaDiscordancia(discordancia4);
    dicaDisciplinasAnteriores0.setNomesDisciplinas("");
    java.lang.String str11 = dicaDisciplinasAnteriores0.getTipo();
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("0,0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str11.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade3 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str4 = dicaComoNaoTerDificuldade3.getCategoria();
    metaDica0.adicionaDica((models.IDica)dicaComoNaoTerDificuldade3);
    int i6 = dicaComoNaoTerDificuldade3.getNumeroConcordancias();
    int i7 = dicaComoNaoTerDificuldade3.getNumeroDenuncias();
    dicaComoNaoTerDificuldade3.setNomeAssunto("0,0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    int i6 = dicaComoNaoTerDificuldade0.getNumeroDiscordancia();
    models.Usuario usuario7 = dicaComoNaoTerDificuldade0.getAutor();
    models.Usuario usuario9 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil12 = new models.DicaMaterialUtil("", usuario9, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia13 = new models.Concordancia(usuario9);
    models.Usuario usuario14 = concordancia13.getAutor();
    dicaComoNaoTerDificuldade0.setAutor(usuario14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario14);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    models.Disciplina disciplina1 = new models.Disciplina("models.MetaDica");
    int i2 = disciplina1.getNumeroMetaDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    models.Usuario usuario0 = new models.Usuario();
    models.Concordancia concordancia1 = new models.Concordancia(usuario0);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

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
    models.Usuario usuario15 = new models.Usuario();
    usuario15.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia18 = new models.Concordancia(usuario15);
    models.Usuario usuario23 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia25 = new models.Discordancia(usuario23, "");
    int i26 = usuario23.getId();
    models.DicaMaterialUtil dicaMaterialUtil29 = new models.DicaMaterialUtil("", usuario23, "0,0", "");
    concordancia18.setAutor(usuario23);
    dicaMaterialUtil0.adicionaConcordancia(concordancia18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getTipo();
    dicaConselho0.setId((long)10);
    java.lang.String str5 = dicaConselho0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "models.DicaConselho"+ "'", str2.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Conselho"+ "'", str5.equals("Conselho"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

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
    java.util.List<models.IDica> list_iDica17 = metaDica9.getListaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str13.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica17);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

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
    double d16 = tema14.getMedia();
    
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
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    int i7 = usuario4.getId();
    usuario4.setSenha("models.DicaConselho");
    int i10 = usuario4.getId();
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade12 = new models.DicaComoNaoTerDificuldade("models.DicaConselho", usuario4, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.MetaDica", usuario4, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    models.Concordancia concordancia10 = new models.Concordancia(usuario4);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.lang.String str1 = dicaMaterialUtil0.getNomeURL();
    long long2 = dicaMaterialUtil0.getId();
    dicaMaterialUtil0.setNomeURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str5 = dicaMaterialUtil0.getTitulo();
    dicaMaterialUtil0.setNomeURL("models.DicaConselho");
    java.lang.String str8 = dicaMaterialUtil0.getDominioURL();
    dicaMaterialUtil0.setTitulo("models.DicaComoNaoTerDificuldade");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    java.lang.String str1 = metaDica0.calculaIndiceConcordancia();
    int i2 = metaDica0.getNumeroConcordancias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0,0"+ "'", str1.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    models.Tema tema1 = new models.Tema("");
    int i2 = tema1.getNumeroDicas();
    tema1.addAvaliacao("0,0", (java.lang.Integer)(-1));
    tema1.setId((java.lang.Long)1L);
    boolean b9 = tema1.isAvaliado("models.DicaDisciplinasAnteriores");
    boolean b11 = tema1.isAvaliado("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

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
    java.util.List<models.IDica> list_iDica19 = metaDica12.getListaDicas();
    int i20 = metaDica12.getNumeroVotos();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    models.Disciplina disciplina1 = new models.Disciplina("0");
    int i2 = disciplina1.getNumeroMetaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    int i3 = tema1.getNumeroDicas();
    int i4 = tema1.getNumeroAvaliacoes();
    tema1.addAvaliacao("models.DicaComoNaoTerDificuldade", (java.lang.Integer)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    disciplina1.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.util.List<models.Tema> list_tema6 = disciplina1.getTemas();
    java.util.List<models.Tema> list_tema7 = disciplina1.getTemas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema7);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia5 = new models.Discordancia(usuario3, "");
    int i6 = usuario3.getId();
    models.Concordancia concordancia7 = new models.Concordancia(usuario3);
    models.Usuario usuario9 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil12 = new models.DicaMaterialUtil("", usuario9, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia13 = new models.Concordancia(usuario9);
    usuario9.setSenha("0,0");
    concordancia7.setAutor(usuario9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

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
    java.lang.String str15 = dicaMaterialUtil0.getTipo();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "models.DicaMaterialUtil"+ "'", str15.equals("models.DicaMaterialUtil"));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    models.Disciplina disciplina1 = new models.Disciplina("models.MetaDica");
    java.lang.String str2 = disciplina1.getNome();
    disciplina1.setId((java.lang.Long)100L);
    java.lang.String str5 = disciplina1.getNome();
    java.lang.Long long6 = disciplina1.getId();
    int i7 = disciplina1.getNumeroMetaDicasVisiveis();
    models.MetaDica metaDica8 = null;
    disciplina1.addMetaDica(metaDica8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "models.MetaDica"+ "'", str2.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "models.MetaDica"+ "'", str5.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L+ "'", long6.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    models.Tema tema0 = new models.Tema();
    boolean b2 = tema0.isAvaliado("");
    boolean b4 = tema0.isAvaliado("models.MetaDica");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade5 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str6 = dicaComoNaoTerDificuldade5.getNomeAssunto();
    java.lang.String str7 = dicaComoNaoTerDificuldade5.getNomeAssunto();
    java.lang.String str8 = dicaComoNaoTerDificuldade5.getCategoria();
    boolean b9 = tema0.equals((java.lang.Object)dicaComoNaoTerDificuldade5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str8.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    models.Disciplina disciplina1 = new models.Disciplina("0,0");
    models.Usuario usuario3 = new models.Usuario();
    usuario3.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia6 = new models.Concordancia(usuario3);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores9 = new models.DicaDisciplinasAnteriores("", usuario3, "Meta Dica", "0,0");
    boolean b11 = dicaDisciplinasAnteriores9.recebeuDenunciaDe("models.DicaDisciplinasAnteriores");
    boolean b12 = disciplina1.equals((java.lang.Object)"models.DicaDisciplinasAnteriores");
    disciplina1.setNome("models.MetaDica");
    models.Tema tema16 = new models.Tema("");
    java.util.List<models.IDica> list_iDica17 = tema16.getDicas();
    java.util.List<models.IDica> list_iDica18 = tema16.getDicas();
    tema16.setId((java.lang.Long)0L);
    boolean b21 = disciplina1.equals((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    int i7 = usuario4.getId();
    usuario4.setSenha("models.DicaConselho");
    java.lang.String str10 = usuario4.getNome();
    models.DicaConselho dicaConselho12 = new models.DicaConselho("", usuario4, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    java.util.List<models.IDica> list_iDica3 = tema1.getDicas();
    int i4 = tema1.getNumeroDicasVisiveis();
    tema1.ordenarTopConcordancias();
    java.lang.String str6 = tema1.getNome();
    int i7 = tema1.getNumeroDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

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
    java.lang.String str16 = dicaMaterialUtil0.calculaIndiceConcordancia();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "0,0"+ "'", str16.equals("0,0"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    models.Disciplina disciplina1 = new models.Disciplina("Meta Dica");
    models.Tema tema2 = null;
    models.Tema tema3 = disciplina1.addTema(tema2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(tema3);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    models.Usuario usuario1 = new models.Usuario();
    java.lang.String str2 = usuario1.getNome();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario1, "Conselho", "models.DicaComoNaoTerDificuldade");
    java.lang.String str6 = dicaMaterialUtil5.getTipo();
    models.Usuario usuario11 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica13 = new models.MetaDica("models.MetaDica", usuario11, "models.DicaConselho");
    models.Concordancia concordancia14 = new models.Concordancia(usuario11);
    dicaMaterialUtil5.adicionaConcordancia(concordancia14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "models.DicaMaterialUtil"+ "'", str6.equals("models.DicaMaterialUtil"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    models.Disciplina disciplina1 = new models.Disciplina("models.DicaMaterialUtil");
    models.Disciplina disciplina3 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica4 = disciplina3.getMetadicas();
    disciplina3.setId((java.lang.Long)10L);
    models.Usuario usuario9 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil12 = new models.DicaMaterialUtil("", usuario9, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica14 = new models.MetaDica("hi!", usuario9, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina3.addMetaDica(metaDica14);
    java.lang.String str16 = metaDica14.getTipo();
    int i17 = metaDica14.getNumeroDicasNaMetaDica();
    models.Usuario usuario18 = metaDica14.getAutor();
    disciplina1.addMetaDica(metaDica14);
    java.lang.String str20 = metaDica14.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "models.MetaDica"+ "'", str16.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "models.MetaDica"+ "'", str20.equals("models.MetaDica"));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia1 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    java.lang.String str3 = dicaDisciplinasAnteriores0.getTipo();
    java.lang.String str4 = dicaDisciplinasAnteriores0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str3.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str4.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    dicaMaterialUtil0.setId((long)(short)100);
    dicaMaterialUtil0.setNomeURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str5 = dicaMaterialUtil0.getTitulo();
    java.util.List<models.Discordancia> list_discordancia6 = dicaMaterialUtil0.getListaDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia6);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    java.lang.String str3 = dicaMaterialUtil0.getNomeURL();
    java.lang.String str4 = dicaMaterialUtil0.calculaIndiceConcordancia();
    dicaMaterialUtil0.setNomeURL("models.DicaMaterialUtil");
    dicaMaterialUtil0.setNomeURL("Disciplinas anteriores que te ajudar\u00E3o aqui");
    dicaMaterialUtil0.setDominioURL("models.DicaConselho");
    dicaMaterialUtil0.addDenuncia("models.DicaConselho");
    
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
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    models.Usuario usuario1 = new models.Usuario();
    usuario1.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia4 = new models.Concordancia(usuario1);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores7 = new models.DicaDisciplinasAnteriores("", usuario1, "Meta Dica", "0,0");
    boolean b9 = dicaDisciplinasAnteriores7.recebeuDenunciaDe("Material \u00FAtil");
    dicaDisciplinasAnteriores7.setNomesDisciplinas("models.DicaConselho");
    boolean b12 = dicaDisciplinasAnteriores7.isVisivel();
    dicaDisciplinasAnteriores7.setNomesDisciplinas("models.DicaDisciplinasAnteriores");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    models.Tema tema1 = new models.Tema("");
    int i2 = tema1.getNumeroDicas();
    tema1.addAvaliacao("0,0", (java.lang.Integer)(-1));
    double d6 = tema1.getMediana();
    models.IDica iDica7 = null;
    tema1.addDica(iDica7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-1.0d));

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    models.Usuario usuario3 = new models.Usuario("", "hi!", "models.DicaConselho");
    boolean b5 = usuario3.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia6 = new models.Concordancia(usuario3);
    usuario3.setNome("");
    java.lang.String str9 = usuario3.getNome();
    usuario3.setNome("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    models.Tema tema0 = new models.Tema();
    tema0.ordenarTopConcordancias();
    tema0.addAvaliacao("", (java.lang.Integer)10);
    java.lang.String str5 = tema0.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getTitulo();
    java.lang.String str3 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    java.lang.String str4 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia5 = new models.Discordancia(usuario3, "");
    int i6 = usuario3.getId();
    usuario3.setSenha("models.DicaConselho");
    java.lang.String str9 = usuario3.getNome();
    usuario3.setSenha("");
    usuario3.setLogin("0,0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores8 = new models.DicaDisciplinasAnteriores("Disciplinas anteriores que te ajudar\u00E3o aqui", usuario2, "Disciplinas anteriores que te ajudar\u00E3o aqui", "hi!");
    java.lang.String str9 = dicaDisciplinasAnteriores8.getCategoria();
    int i10 = dicaDisciplinasAnteriores8.getNumeroDiscordancia();
    java.util.List<models.Discordancia> list_discordancia11 = dicaDisciplinasAnteriores8.getListaDiscordancia();
    boolean b13 = dicaDisciplinasAnteriores8.recebeuDenunciaDe("0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str9.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil5 = new models.DicaMaterialUtil("", usuario2, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaConselho dicaConselho7 = new models.DicaConselho("models.DicaDisciplinasAnteriores", usuario2, "models.DicaConselho");
    dicaConselho7.setConselho("Disciplinas anteriores que te ajudar\u00E3o aqui");
    dicaConselho7.setConselho("Meta Dica");

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    models.Usuario usuario5 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores0.setAutor(usuario5);
    java.util.Set<models.Usuario> set_usuario7 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    java.util.Set<models.Usuario> set_usuario8 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    int i9 = dicaDisciplinasAnteriores0.getNumeroVotos();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

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
    java.util.List<models.Concordancia> list_concordancia11 = dicaDisciplinasAnteriores0.getListaConcordancia();
    java.lang.String str12 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str9.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

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
    java.lang.String str14 = dicaMaterialUtil0.getDominioURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str14.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    java.lang.String str3 = dicaMaterialUtil0.getNomeURL();
    java.lang.String str4 = dicaMaterialUtil0.calculaIndiceConcordancia();
    int i5 = dicaMaterialUtil0.getNumeroVotos();
    models.MetaDica metaDica6 = new models.MetaDica();
    java.lang.String str7 = metaDica6.calculaIndiceConcordancia();
    metaDica6.addDenuncia("Meta Dica");
    models.Usuario usuario10 = null;
    models.Discordancia discordancia12 = new models.Discordancia(usuario10, "");
    int i13 = discordancia12.getId();
    metaDica6.adicionaDiscordancia(discordancia12);
    java.lang.String str15 = discordancia12.getRazaoDiscordancia();
    dicaMaterialUtil0.adicionaDiscordancia(discordancia12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0,0"+ "'", str4.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0,0"+ "'", str7.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    models.Disciplina disciplina1 = new models.Disciplina("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    disciplina1.setId((java.lang.Long)1L);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

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
    long long17 = metaDica12.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Meta Dica"+ "'", str16.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long17 == 0L);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

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
    java.lang.String str20 = metaDica12.getComentario();
    int i21 = metaDica12.getNumeroDicasNaMetaDica();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "models.MetaDica"+ "'", str20.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

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
    int i21 = tema1.getNumeroDicas();
    
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
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    boolean b6 = usuario4.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia7 = new models.Concordancia(usuario4);
    models.Usuario usuario8 = concordancia7.getAutor();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores11 = new models.DicaDisciplinasAnteriores("0,0", usuario8, "", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario8);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.util.List<models.Tema> list_tema5 = disciplina1.getTemas();
    int i6 = disciplina1.getNumeroMetaDicasVisiveis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia1 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("0,0");
    java.util.Set<models.Usuario> set_usuario4 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario4);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

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
    int i14 = dicaDisciplinasAnteriores0.getNumeroConcordancias();
    dicaDisciplinasAnteriores0.setId((long)(byte)1);
    
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
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

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
    usuario7.setNome("hi!");
    models.Discordancia discordancia16 = new models.Discordancia(usuario7, "models.DicaDisciplinasAnteriores");
    boolean b18 = usuario7.checaSenha("0,0");
    
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
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

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
    int i18 = tema6.getNumeroDicasVisiveis();
    java.lang.Long long19 = tema6.getId();
    
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
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long19);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

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
    int i20 = metaDica12.getNumeroConcordancias();
    java.lang.String str21 = metaDica12.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Meta Dica"+ "'", str21.equals("Meta Dica"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade8 = new models.DicaComoNaoTerDificuldade("models.DicaDisciplinasAnteriores", usuario4, "hi!");
    java.lang.String str9 = dicaComoNaoTerDificuldade8.getCategoria();
    int i10 = dicaComoNaoTerDificuldade8.getNumeroConcordancias();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str9.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia5 = new models.Discordancia(usuario3, "");
    usuario3.setNome("models.DicaMaterialUtil");
    java.lang.String str8 = usuario3.getLogin();
    java.lang.String str9 = usuario3.getLogin();
    models.Concordancia concordancia10 = new models.Concordancia(usuario3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "models.DicaConselho"+ "'", str9.equals("models.DicaConselho"));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

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
    java.lang.String str19 = tema18.getNome();
    java.lang.String str20 = tema18.getNome();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    models.Disciplina disciplina1 = new models.Disciplina("Material \u00FAtil");

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setNomeURL("hi!");
    java.util.List<models.Concordancia> list_concordancia5 = dicaMaterialUtil0.getListaConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia5);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.addDenuncia("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.util.List<models.Concordancia> list_concordancia4 = dicaComoNaoTerDificuldade0.getListaConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia4);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

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
    int i12 = dicaMaterialUtil0.getNumeroConcordancias();
    dicaMaterialUtil0.setNomeURL("0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

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
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("");
    boolean b15 = dicaDisciplinasAnteriores0.recebeuDenunciaDe("models.MetaDica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.lang.String str3 = disciplina1.getNome();
    disciplina1.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.util.List<models.Tema> list_tema6 = disciplina1.getTemas();
    java.lang.String str7 = disciplina1.getNome();
    disciplina1.setId((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str7.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

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
    metaDica12.setComentario("");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores22 = new models.DicaDisciplinasAnteriores();
    java.lang.String str23 = dicaDisciplinasAnteriores22.getRazoesDisciplinas();
    java.lang.String str24 = dicaDisciplinasAnteriores22.getRazoesDisciplinas();
    models.Concordancia concordancia25 = new models.Concordancia();
    dicaDisciplinasAnteriores22.adicionaConcordancia(concordancia25);
    java.lang.String str27 = dicaDisciplinasAnteriores22.getTipo();
    java.lang.String str28 = dicaDisciplinasAnteriores22.getTipo();
    java.lang.String str29 = dicaDisciplinasAnteriores22.getCategoria();
    metaDica12.adicionaDica((models.IDica)dicaDisciplinasAnteriores22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "models.MetaDica"+ "'", str19.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str27.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str28.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str29.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getTipo();
    int i4 = dicaConselho0.getNumeroDiscordancia();
    java.lang.String str5 = dicaConselho0.getConselho();
    java.lang.String str6 = dicaConselho0.getTitulo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    double d3 = tema1.getMediana();
    int i4 = tema1.getNumeroDicasVisiveis();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i5 = tema1.getAvaliacoes();
    java.lang.String str6 = tema1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(map_str_i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.DicaDisciplinasAnteriores", usuario5, "Meta Dica", "models.MetaDica");
    int i10 = dicaMaterialUtil9.getNumeroDenuncias();
    java.lang.String str11 = dicaMaterialUtil9.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Meta Dica"+ "'", str11.equals("Meta Dica"));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

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
    int i13 = dicaConselho0.getNumeroConcordancias();
    
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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    java.lang.Object obj3 = null;
    boolean b4 = tema1.equals(obj3);
    double d5 = tema1.getMediana();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    java.lang.String str3 = dicaMaterialUtil0.getNomeURL();
    dicaMaterialUtil0.setNomeURL("");
    java.lang.String str6 = dicaMaterialUtil0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Material \u00FAtil"+ "'", str6.equals("Material \u00FAtil"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    double d7 = tema6.getMedia();
    int i8 = tema6.getNumeroDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    double d10 = tema6.getMediana();
    tema6.setId((java.lang.Long)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

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
    int i28 = metaDica21.getNumeroDicasNaMetaDica();
    
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
    org.junit.Assert.assertTrue(i28 == 0);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setDominioURL("hi!");
    java.lang.String str5 = dicaMaterialUtil0.getTitulo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    dicaComoNaoTerDificuldade0.addDenuncia("models.DicaComoNaoTerDificuldade");
    java.lang.String str5 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str6 = dicaComoNaoTerDificuldade0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str5.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str6.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

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
    java.util.List<models.Discordancia> list_discordancia18 = dicaMaterialUtil0.getListaDiscordancia();
    
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
    org.junit.Assert.assertNotNull(list_discordancia18);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    java.lang.String str3 = dicaMaterialUtil0.getNomeURL();
    java.lang.String str4 = dicaMaterialUtil0.getDominioURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

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
    java.lang.String str12 = dicaComoNaoTerDificuldade7.getNomeAssunto();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str8.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

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
    java.lang.String str20 = dicaDisciplinasAnteriores16.getNomesDisciplinas();
    dicaDisciplinasAnteriores16.setRazoesDisciplinas("Meta Dica");
    
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
    org.junit.Assert.assertNull(str20);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    java.lang.String str3 = dicaMaterialUtil0.getNomeURL();
    models.Usuario usuario8 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica10 = new models.MetaDica("models.MetaDica", usuario8, "models.DicaConselho");
    models.Concordancia concordancia11 = new models.Concordancia(usuario8);
    models.Usuario usuario12 = concordancia11.getAutor();
    dicaMaterialUtil0.adicionaConcordancia(concordancia11);
    java.lang.String str14 = dicaMaterialUtil0.getDominioURL();
    dicaMaterialUtil0.setId((long)100);
    dicaMaterialUtil0.setDominioURL("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str14);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    boolean b2 = dicaDisciplinasAnteriores0.isVotavel();
    java.lang.String str3 = dicaDisciplinasAnteriores0.getCategoria();
    java.lang.String str4 = dicaDisciplinasAnteriores0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str3.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str4.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setNomeURL("hi!");
    dicaMaterialUtil0.setDominioURL("models.DicaComoNaoTerDificuldade");
    java.lang.String str7 = dicaMaterialUtil0.getDominioURL();
    models.Discordancia discordancia8 = new models.Discordancia();
    discordancia8.setRazaoDiscordancia("models.MetaDica");
    java.lang.String str11 = discordancia8.getRazaoDiscordancia();
    dicaMaterialUtil0.adicionaDiscordancia(discordancia8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str7.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.MetaDica"+ "'", str11.equals("models.MetaDica"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getCategoria();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getCategoria();
    boolean b4 = dicaDisciplinasAnteriores0.recebeuDenunciaDe("0,0");
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("Disciplinas anteriores que te ajudar\u00E3o aqui");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str1.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str2.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

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
    dicaDisciplinasAnteriores0.setTitulo("0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str3.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "Meta Dica");
    models.Concordancia concordancia4 = new models.Concordancia(usuario3);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    int i4 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    boolean b7 = tema1.equals((java.lang.Object)"Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i8 = tema1.getNumeroDicas();
    int i9 = tema1.getNumeroDicas();
    java.lang.String str10 = tema1.getNome();
    boolean b12 = tema1.isAvaliado("hi!");
    java.util.List<models.IDica> list_iDica13 = tema1.getDicas();
    int i14 = tema1.getNumeroDicasVisiveis();
    
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
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

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
    java.lang.String str21 = metaDica16.getComentario();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "models.MetaDica"+ "'", str18.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str21.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

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
    java.lang.String str24 = dicaDisciplinasAnteriores19.getTipo();
    
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
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str20.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str24.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.addDenuncia("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    int i4 = dicaComoNaoTerDificuldade0.getNumeroVotos();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getCategoria();
    boolean b4 = dicaComoNaoTerDificuldade0.recebeuDenunciaDe("hi!");
    dicaComoNaoTerDificuldade0.addDenuncia("hi!");
    java.lang.String str7 = dicaComoNaoTerDificuldade0.getCategoria();
    java.util.List<models.Concordancia> list_concordancia8 = dicaComoNaoTerDificuldade0.getListaConcordancia();
    dicaComoNaoTerDificuldade0.setNomeAssunto("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str2.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str7.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_concordancia8);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

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
    java.lang.String str18 = dicaMaterialUtil15.getTipo();
    boolean b19 = dicaMaterialUtil15.isVotavel();
    int i20 = dicaMaterialUtil15.getNumeroConcordancias();
    dicaMaterialUtil15.setNomeURL("hi!");
    java.lang.String str23 = dicaMaterialUtil15.getCategoria();
    models.Usuario usuario24 = null;
    boolean b25 = dicaMaterialUtil15.usuarioAtualVotouNestaDica(usuario24);
    long long26 = dicaMaterialUtil15.getId();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "models.DicaMaterialUtil"+ "'", str18.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Material \u00FAtil"+ "'", str23.equals("Material \u00FAtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == 0L);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

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
    java.lang.String str22 = metaDica12.getComentario();
    
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
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "models.MetaDica"+ "'", str22.equals("models.MetaDica"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores1 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario2 = dicaDisciplinasAnteriores1.getListaUsuariosQueVotaram();
    models.Usuario usuario6 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    dicaDisciplinasAnteriores1.setAutor(usuario6);
    java.lang.String str8 = usuario6.getLogin();
    usuario6.setNome("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    models.DicaConselho dicaConselho12 = new models.DicaConselho("0", usuario6, "Meta Dica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "models.DicaConselho"+ "'", str8.equals("models.DicaConselho"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.DicaDisciplinasAnteriores", usuario5, "Meta Dica", "models.MetaDica");
    java.lang.String str10 = dicaMaterialUtil9.getTipo();
    java.lang.String str11 = dicaMaterialUtil9.getCategoria();
    java.lang.String str12 = dicaMaterialUtil9.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "models.DicaMaterialUtil"+ "'", str10.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Material \u00FAtil"+ "'", str11.equals("Material \u00FAtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Material \u00FAtil"+ "'", str12.equals("Material \u00FAtil"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    java.lang.String str2 = dicaConselho0.getCategoria();
    java.lang.String str3 = dicaConselho0.getTipo();
    dicaConselho0.setConselho("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Conselho"+ "'", str2.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    models.Usuario usuario7 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("", usuario7, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica12 = new models.MetaDica("hi!", usuario7, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina1.addMetaDica(metaDica12);
    java.lang.String str14 = metaDica12.getTipo();
    java.util.Set<models.Usuario> set_usuario15 = metaDica12.getListaUsuariosQueVotaram();
    models.Usuario usuario16 = metaDica12.getAutor();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario16);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    models.Disciplina disciplina1 = new models.Disciplina("models.DicaComoNaoTerDificuldade");

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario5.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("0,0", usuario5, "hi!", "models.DicaDisciplinasAnteriores");
    models.Discordancia discordancia12 = new models.Discordancia(usuario5, "models.DicaComoNaoTerDificuldade");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade14 = new models.DicaComoNaoTerDificuldade("Conselho", usuario5, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str15 = dicaComoNaoTerDificuldade14.getTipo();
    java.lang.String str16 = dicaComoNaoTerDificuldade14.getTitulo();
    int i17 = dicaComoNaoTerDificuldade14.getNumeroDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str15.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Conselho"+ "'", str16.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.Set<models.Usuario> set_usuario1 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("");
    int i4 = dicaDisciplinasAnteriores0.getNumeroDiscordancia();
    java.lang.String str5 = dicaDisciplinasAnteriores0.calculaIndiceConcordancia();
    java.util.Set<models.Usuario> set_usuario6 = dicaDisciplinasAnteriores0.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0,0"+ "'", str5.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario6);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

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
    models.DicaMaterialUtil dicaMaterialUtil18 = new models.DicaMaterialUtil("Meta Dica", usuario8, "models.DicaDisciplinasAnteriores", "Material \u00FAtil");
    
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
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    models.Usuario usuario4 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.MetaDica", usuario4, "models.DicaConselho", "models.DicaDisciplinasAnteriores");
    java.lang.String str10 = dicaMaterialUtil9.getDominioURL();
    java.lang.String str11 = dicaMaterialUtil9.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str10.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Material \u00FAtil"+ "'", str11.equals("Material \u00FAtil"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario4.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("0,0", usuario4, "hi!", "models.DicaDisciplinasAnteriores");
    java.lang.String str10 = dicaMaterialUtil9.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Material \u00FAtil"+ "'", str10.equals("Material \u00FAtil"));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

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
    java.lang.String str19 = metaDica12.getCategoria();
    java.lang.String str20 = metaDica12.getComentario();
    
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
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Meta Dica"+ "'", str19.equals("Meta Dica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str20.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

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
    double d19 = tema18.getMedia();
    
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
    org.junit.Assert.assertTrue(d19 == 0.0d);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia5 = new models.Discordancia(usuario3, "");
    models.Concordancia concordancia6 = new models.Concordancia(usuario3);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.MetaDica metaDica8 = new models.MetaDica("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", usuario5, "models.DicaMaterialUtil");
    int i9 = metaDica8.getNumeroDicasNaMetaDica();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

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
    tema12.ordenarTopConcordancias();
    java.lang.String str20 = tema12.getNome();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    dicaMaterialUtil0.setTitulo("models.DicaMaterialUtil");
    int i4 = dicaMaterialUtil0.getNumeroDiscordancia();
    models.Usuario usuario5 = dicaMaterialUtil0.getAutor();
    java.lang.String str6 = dicaMaterialUtil0.getNomeURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getCategoria();
    models.Usuario usuario7 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    usuario7.setNome("models.DicaMaterialUtil");
    models.DicaConselho dicaConselho13 = new models.DicaConselho("", usuario7, "models.DicaConselho");
    int i14 = dicaComoNaoTerDificuldade0.compareTo((models.IDica)dicaConselho13);
    dicaConselho13.setConselho("0");
    java.lang.String str17 = dicaConselho13.calculaIndiceConcordancia();
    dicaConselho13.addDenuncia("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str2.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0,0"+ "'", str17.equals("0,0"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade1 = new models.DicaComoNaoTerDificuldade();
    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    dicaComoNaoTerDificuldade1.setAutor(usuario5);
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil("models.DicaDisciplinasAnteriores", usuario5, "Meta Dica", "models.MetaDica");
    int i10 = dicaMaterialUtil9.getNumeroDenuncias();
    java.lang.String str11 = dicaMaterialUtil9.getTipo();
    models.Usuario usuario15 = new models.Usuario("", "hi!", "models.DicaConselho");
    boolean b17 = usuario15.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia18 = new models.Concordancia(usuario15);
    dicaMaterialUtil9.setAutor(usuario15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaMaterialUtil"+ "'", str11.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    models.Concordancia concordancia7 = new models.Concordancia(usuario4);
    usuario4.setLogin("models.DicaComoNaoTerDificuldade");
    usuario4.setLogin("");

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.lang.String str1 = dicaMaterialUtil0.getNomeURL();
    long long2 = dicaMaterialUtil0.getId();
    dicaMaterialUtil0.setNomeURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    dicaMaterialUtil0.setNomeURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str7 = dicaMaterialUtil0.getDominioURL();
    boolean b8 = dicaMaterialUtil0.isVotavel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

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
    java.lang.String str21 = dicaMaterialUtil17.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Conselho"+ "'", str19.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "models.DicaMaterialUtil"+ "'", str21.equals("models.DicaMaterialUtil"));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

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
    models.MetaDica metaDica19 = new models.MetaDica();
    models.Discordancia discordancia20 = new models.Discordancia();
    metaDica19.adicionaDiscordancia(discordancia20);
    metaDica12.adicionaDica((models.IDica)metaDica19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    models.Tema tema1 = new models.Tema("models.DicaMaterialUtil");

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.util.List<models.Discordancia> list_discordancia1 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getTipo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str2.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getCategoria();
    java.lang.String str2 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("models.MetaDica");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str1.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

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
    java.lang.String str28 = metaDica17.getComentario();
    int i29 = metaDica17.getNumeroVotos();
    
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
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "models.MetaDica"+ "'", str28.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

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
    models.DicaMaterialUtil dicaMaterialUtil28 = new models.DicaMaterialUtil("models.MetaDica", usuario18, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades", "models.MetaDica");
    
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

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

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
    java.lang.String str12 = dicaDisciplinasAnteriores0.getTipo();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str12.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)1L);
    models.Tema tema6 = new models.Tema("");
    java.util.List<models.IDica> list_iDica7 = tema6.getDicas();
    java.util.List<models.IDica> list_iDica8 = tema6.getDicas();
    models.Tema tema9 = disciplina1.addTema(tema6);
    tema6.ordenarTopConcordancias();
    boolean b12 = tema6.isAvaliado("Material \u00FAtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(tema9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    int i4 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    boolean b7 = tema1.equals((java.lang.Object)"Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i8 = tema1.getNumeroDicas();
    int i9 = tema1.getNumeroDicas();
    java.lang.String str10 = tema1.getNome();
    boolean b12 = tema1.isAvaliado("hi!");
    java.util.List<models.IDica> list_iDica13 = tema1.getDicas();
    java.lang.Long long14 = tema1.getId();
    
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
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long14);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica7 = new models.MetaDica("models.MetaDica", usuario5, "models.DicaConselho");
    models.Concordancia concordancia8 = new models.Concordancia(usuario5);
    models.DicaConselho dicaConselho10 = new models.DicaConselho("models.DicaDisciplinasAnteriores", usuario5, "hi!");
    dicaConselho10.setConselho("");
    java.util.List<models.Discordancia> list_discordancia13 = dicaConselho10.getListaDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia13);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    models.Usuario usuario5 = new models.Usuario("", "hi!", "models.DicaConselho");
    usuario5.setNome("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.DicaMaterialUtil dicaMaterialUtil10 = new models.DicaMaterialUtil("0,0", usuario5, "hi!", "models.DicaDisciplinasAnteriores");
    models.Discordancia discordancia12 = new models.Discordancia(usuario5, "models.DicaComoNaoTerDificuldade");
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade14 = new models.DicaComoNaoTerDificuldade("Conselho", usuario5, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    boolean b15 = dicaComoNaoTerDificuldade14.isVotavel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getCategoria();
    java.lang.String str4 = dicaConselho0.getCategoria();
    java.util.List<models.Discordancia> list_discordancia5 = dicaConselho0.getListaDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Conselho"+ "'", str3.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Conselho"+ "'", str4.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia5);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    models.Tema tema1 = new models.Tema("");
    double d2 = tema1.getMedia();
    int i3 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    java.lang.Long long5 = tema1.getId();
    tema1.ordenarTopConcordancias();
    java.util.List<models.IDica> list_iDica7 = tema1.getDicas();
    java.lang.Long long8 = tema1.getId();
    models.DicaMaterialUtil dicaMaterialUtil9 = new models.DicaMaterialUtil();
    java.lang.String str10 = dicaMaterialUtil9.getNomeURL();
    long long11 = dicaMaterialUtil9.getId();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores12 = new models.DicaDisciplinasAnteriores();
    java.lang.String str13 = dicaDisciplinasAnteriores12.getRazoesDisciplinas();
    models.Usuario usuario14 = null;
    models.Discordancia discordancia16 = new models.Discordancia(usuario14, "");
    models.Usuario usuario17 = null;
    discordancia16.setAutor(usuario17);
    int i19 = discordancia16.getId();
    dicaDisciplinasAnteriores12.adicionaDiscordancia(discordancia16);
    java.lang.String str21 = dicaDisciplinasAnteriores12.getTipo();
    java.lang.String str22 = dicaDisciplinasAnteriores12.getNomesDisciplinas();
    int i23 = dicaMaterialUtil9.compareTo((models.IDica)dicaDisciplinasAnteriores12);
    java.lang.String str24 = dicaMaterialUtil9.getCategoria();
    dicaMaterialUtil9.setDominioURL("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    tema1.addDica((models.IDica)dicaMaterialUtil9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(long8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str21.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Material \u00FAtil"+ "'", str24.equals("Material \u00FAtil"));

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

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
    models.Usuario usuario15 = new models.Usuario("", "hi!", "models.DicaConselho");
    boolean b17 = usuario15.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia18 = new models.Concordancia(usuario15);
    usuario15.setNome("");
    java.lang.String str21 = usuario15.getNome();
    dicaDisciplinasAnteriores0.setAutor(usuario15);
    java.lang.String str23 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    disciplina1.setId((java.lang.Long)10L);
    java.lang.String str5 = disciplina1.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    java.lang.String str6 = dicaComoNaoTerDificuldade0.getTipo();
    models.Usuario usuario10 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str11 = usuario10.getLogin();
    dicaComoNaoTerDificuldade0.setAutor(usuario10);
    java.lang.String str13 = dicaComoNaoTerDificuldade0.getCategoria();
    java.util.Set<models.Usuario> set_usuario14 = dicaComoNaoTerDificuldade0.getListaUsuariosQueVotaram();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str13.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario14);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    models.Usuario usuario2 = new models.Usuario();
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores5 = new models.DicaDisciplinasAnteriores("models.MetaDica", usuario2, "Meta Dica", "Meta Dica");
    models.MetaDica metaDica7 = new models.MetaDica("hi!", usuario2, "");
    java.lang.String str8 = metaDica7.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Meta Dica"+ "'", str8.equals("Meta Dica"));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    models.Tema tema1 = new models.Tema("models.DicaConselho");

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    models.Usuario usuario1 = new models.Usuario();
    java.lang.String str2 = usuario1.getNome();
    models.DicaConselho dicaConselho4 = new models.DicaConselho("models.DicaConselho", usuario1, "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    dicaConselho4.setConselho("Disciplinas anteriores que te ajudar\u00E3o aqui");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    models.Disciplina disciplina1 = new models.Disciplina("models.DicaMaterialUtil");
    models.Disciplina disciplina3 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica4 = disciplina3.getMetadicas();
    disciplina3.setId((java.lang.Long)10L);
    models.Usuario usuario9 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil12 = new models.DicaMaterialUtil("", usuario9, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica14 = new models.MetaDica("hi!", usuario9, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina3.addMetaDica(metaDica14);
    java.lang.String str16 = metaDica14.getTipo();
    int i17 = metaDica14.getNumeroDicasNaMetaDica();
    models.Usuario usuario18 = metaDica14.getAutor();
    disciplina1.addMetaDica(metaDica14);
    metaDica14.setComentario("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades");
    java.lang.String str22 = metaDica14.calculaIndiceConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "models.MetaDica"+ "'", str16.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(usuario18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "0,0"+ "'", str22.equals("0,0"));

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    int i6 = dicaComoNaoTerDificuldade0.getNumeroDiscordancia();
    java.lang.String str7 = dicaComoNaoTerDificuldade0.getTipo();
    int i8 = dicaComoNaoTerDificuldade0.getNumeroVotos();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str7.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    boolean b4 = disciplina1.equals((java.lang.Object)10.0f);
    disciplina1.setId((java.lang.Long)100L);
    int i7 = disciplina1.getNumeroMetaDicas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    models.Usuario usuario3 = new models.Usuario("models.DicaMaterialUtil", "models.DicaMaterialUtil", "hi!");

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

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
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i14 = tema1.getAvaliacoes();
    int i15 = tema1.getNumeroAvaliacoes();
    
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
    org.junit.Assert.assertNotNull(map_str_i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

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
    long long15 = dicaDisciplinasAnteriores3.getId();
    java.lang.String str16 = dicaDisciplinasAnteriores3.getTipo();
    
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
    org.junit.Assert.assertTrue(long15 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str16.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

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
    java.util.Set<models.Usuario> set_usuario31 = metaDica12.getListaUsuariosQueVotaram();
    java.lang.String str32 = metaDica12.getComentario();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "models.MetaDica"+ "'", str14.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + ""+ "'", str29.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "models.MetaDica"+ "'", str32.equals("models.MetaDica"));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    java.lang.String str3 = dicaConselho0.getTipo();
    int i4 = dicaConselho0.getNumeroDiscordancia();
    dicaConselho0.setTitulo("Disciplinas anteriores que te ajudar\u00E3o aqui");
    int i7 = dicaConselho0.getNumeroVotos();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaConselho"+ "'", str3.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    models.Disciplina disciplina1 = new models.Disciplina("Meta Dica");
    java.util.List<models.MetaDica> list_metaDica2 = disciplina1.getMetadicas();
    java.util.List<models.Tema> list_tema3 = disciplina1.getTemas();
    models.Disciplina disciplina5 = new models.Disciplina("hi!");
    java.util.List<models.MetaDica> list_metaDica6 = disciplina5.getMetadicas();
    disciplina5.setId((java.lang.Long)10L);
    models.Usuario usuario11 = new models.Usuario();
    models.DicaMaterialUtil dicaMaterialUtil14 = new models.DicaMaterialUtil("", usuario11, "", "Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.MetaDica metaDica16 = new models.MetaDica("hi!", usuario11, "Disciplinas anteriores que te ajudar\u00E3o aqui");
    disciplina5.addMetaDica(metaDica16);
    java.lang.String str18 = metaDica16.getTipo();
    metaDica16.addDenuncia("hi!");
    metaDica16.setComentario("models.MetaDica");
    java.lang.String str23 = metaDica16.getComentario();
    metaDica16.setComentario("");
    disciplina1.addMetaDica(metaDica16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_tema3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_metaDica6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "models.MetaDica"+ "'", str18.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "models.MetaDica"+ "'", str23.equals("models.MetaDica"));

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    boolean b1 = dicaMaterialUtil0.isVotavel();
    boolean b2 = dicaMaterialUtil0.isVotavel();
    java.lang.String str3 = dicaMaterialUtil0.getNomeURL();
    dicaMaterialUtil0.setNomeURL("models.DicaConselho");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str2 = dicaComoNaoTerDificuldade0.getCategoria();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    models.Usuario usuario4 = null;
    models.Discordancia discordancia6 = new models.Discordancia(usuario4, "");
    models.Usuario usuario7 = null;
    discordancia6.setAutor(usuario7);
    int i9 = discordancia6.getId();
    models.Usuario usuario10 = discordancia6.getAutor();
    dicaComoNaoTerDificuldade0.adicionaDiscordancia(discordancia6);
    discordancia6.setRazaoDiscordancia("Meta Dica");
    int i14 = discordancia6.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str2.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    models.MetaDica metaDica6 = new models.MetaDica("models.MetaDica", usuario4, "models.DicaConselho");
    int i7 = metaDica6.getNumeroDicasNaMetaDica();
    java.lang.String str8 = metaDica6.calculaIndiceConcordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0,0"+ "'", str8.equals("0,0"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    models.Usuario usuario0 = new models.Usuario();
    usuario0.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Discordancia discordancia4 = new models.Discordancia(usuario0, "hi!");
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores5 = new models.DicaDisciplinasAnteriores();
    java.lang.String str6 = dicaDisciplinasAnteriores5.getRazoesDisciplinas();
    models.Usuario usuario7 = null;
    models.Discordancia discordancia9 = new models.Discordancia(usuario7, "");
    models.Usuario usuario10 = null;
    discordancia9.setAutor(usuario10);
    int i12 = discordancia9.getId();
    dicaDisciplinasAnteriores5.adicionaDiscordancia(discordancia9);
    dicaDisciplinasAnteriores5.setNomesDisciplinas("");
    int i16 = dicaDisciplinasAnteriores5.getNumeroDiscordancia();
    models.Usuario usuario20 = new models.Usuario("", "hi!", "models.DicaConselho");
    boolean b22 = usuario20.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia23 = new models.Concordancia(usuario20);
    usuario20.setNome("");
    java.lang.String str26 = usuario20.getNome();
    dicaDisciplinasAnteriores5.setAutor(usuario20);
    discordancia4.setAutor(usuario20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    models.Usuario usuario0 = null;
    models.Discordancia discordancia2 = new models.Discordancia(usuario0, "hi!");
    discordancia2.setRazaoDiscordancia("");
    java.lang.String str5 = discordancia2.getRazaoDiscordancia();
    discordancia2.setRazaoDiscordancia("0");
    int i8 = discordancia2.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia1 = dicaMaterialUtil0.getListaDiscordancia();
    int i2 = dicaMaterialUtil0.getNumeroVotos();
    java.lang.String str3 = dicaMaterialUtil0.getDominioURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    models.Tema tema1 = new models.Tema("");
    int i2 = tema1.getNumeroDicas();
    tema1.addAvaliacao("0,0", (java.lang.Integer)(-1));
    tema1.addAvaliacao("Disciplinas anteriores que te ajudar\u00E3o aqui", (java.lang.Integer)0);
    tema1.setId((java.lang.Long)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    models.MetaDica metaDica0 = new models.MetaDica();
    models.Discordancia discordancia1 = new models.Discordancia();
    metaDica0.adicionaDiscordancia(discordancia1);
    java.lang.String str3 = metaDica0.getTipo();
    models.Usuario usuario5 = new models.Usuario();
    usuario5.setSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia8 = new models.Concordancia(usuario5);
    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores11 = new models.DicaDisciplinasAnteriores("", usuario5, "Meta Dica", "0,0");
    long long12 = dicaDisciplinasAnteriores11.getId();
    int i13 = metaDica0.compareTo((models.IDica)dicaDisciplinasAnteriores11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.MetaDica"+ "'", str3.equals("models.MetaDica"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

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
    int i13 = dicaDisciplinasAnteriores0.getNumeroVotos();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str12.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia5 = new models.Discordancia(usuario3, "");
    int i6 = usuario3.getId();
    int i7 = usuario3.getId();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

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
    java.lang.String str18 = dicaMaterialUtil15.getTipo();
    boolean b19 = dicaMaterialUtil15.isVotavel();
    java.lang.String str20 = dicaMaterialUtil15.calculaIndiceConcordancia();
    models.Usuario usuario24 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    models.Discordancia discordancia26 = new models.Discordancia(usuario24, "");
    int i27 = usuario24.getId();
    usuario24.setSenha("models.DicaConselho");
    int i30 = usuario24.getId();
    dicaMaterialUtil15.setAutor(usuario24);
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "models.DicaMaterialUtil"+ "'", str18.equals("models.DicaMaterialUtil"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "0,0"+ "'", str20.equals("0,0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    models.Usuario usuario3 = new models.Usuario("", "models.DicaConselho", "models.MetaDica");
    java.lang.String str4 = usuario3.getLogin();
    int i5 = usuario3.getId();
    java.lang.String str6 = usuario3.getNome();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "models.DicaConselho"+ "'", str4.equals("models.DicaConselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

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
    dicaDisciplinasAnteriores0.setRazoesDisciplinas("");
    models.Usuario usuario14 = dicaDisciplinasAnteriores0.getAutor();
    java.util.List<models.Discordancia> list_discordancia15 = dicaDisciplinasAnteriores0.getListaDiscordancia();
    java.lang.String str16 = dicaDisciplinasAnteriores0.getTipo();
    dicaDisciplinasAnteriores0.setTitulo("0,0");
    java.lang.String str19 = dicaDisciplinasAnteriores0.getNomesDisciplinas();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str16.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade2 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str3 = dicaComoNaoTerDificuldade2.getCategoria();
    java.lang.String str4 = dicaComoNaoTerDificuldade2.getCategoria();
    java.lang.String str5 = dicaComoNaoTerDificuldade2.getCategoria();
    models.Usuario usuario6 = null;
    models.Discordancia discordancia8 = new models.Discordancia(usuario6, "");
    models.Usuario usuario9 = null;
    discordancia8.setAutor(usuario9);
    int i11 = discordancia8.getId();
    models.Usuario usuario12 = discordancia8.getAutor();
    dicaComoNaoTerDificuldade2.adicionaDiscordancia(discordancia8);
    discordancia8.setRazaoDiscordancia("Meta Dica");
    dicaComoNaoTerDificuldade0.adicionaDiscordancia(discordancia8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str4.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str5.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(usuario12);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

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
    boolean b27 = metaDica21.isVisivel();
    
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
    org.junit.Assert.assertNotNull(usuario26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    models.Disciplina disciplina1 = new models.Disciplina("hi!");
    int i2 = disciplina1.getNumeroMetaDicas();
    boolean b4 = disciplina1.equals((java.lang.Object)10.0f);
    disciplina1.setId((java.lang.Long)100L);
    int i7 = disciplina1.getNumeroMetaDicasVisiveis();
    int i8 = disciplina1.getNumeroMetaDicas();
    models.MetaDica metaDica9 = new models.MetaDica();
    models.Discordancia discordancia10 = new models.Discordancia();
    metaDica9.adicionaDiscordancia(discordancia10);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade12 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str13 = dicaComoNaoTerDificuldade12.getCategoria();
    metaDica9.adicionaDica((models.IDica)dicaComoNaoTerDificuldade12);
    boolean b15 = metaDica9.isVisivel();
    java.util.List<models.IDica> list_iDica16 = metaDica9.getListaDicas();
    disciplina1.addMetaDica(metaDica9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str13.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_iDica16);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    models.DicaDisciplinasAnteriores dicaDisciplinasAnteriores0 = new models.DicaDisciplinasAnteriores();
    java.lang.String str1 = dicaDisciplinasAnteriores0.getRazoesDisciplinas();
    models.Usuario usuario2 = null;
    models.Discordancia discordancia4 = new models.Discordancia(usuario2, "");
    models.Usuario usuario5 = null;
    discordancia4.setAutor(usuario5);
    int i7 = discordancia4.getId();
    dicaDisciplinasAnteriores0.adicionaDiscordancia(discordancia4);
    dicaDisciplinasAnteriores0.setNomesDisciplinas("");
    java.lang.String str11 = dicaDisciplinasAnteriores0.getTipo();
    java.lang.String str12 = dicaDisciplinasAnteriores0.getCategoria();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str11.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Disciplinas anteriores que te ajudar\u00E3o aqui"+ "'", str12.equals("Disciplinas anteriores que te ajudar\u00E3o aqui"));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    models.DicaMaterialUtil dicaMaterialUtil0 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia1 = dicaMaterialUtil0.getListaDiscordancia();
    int i2 = dicaMaterialUtil0.getNumeroVotos();
    dicaMaterialUtil0.addDenuncia("Conselho");
    java.lang.String str5 = dicaMaterialUtil0.getDominioURL();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(list_discordancia1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    models.DicaConselho dicaConselho0 = new models.DicaConselho();
    java.lang.String str1 = dicaConselho0.getCategoria();
    boolean b2 = dicaConselho0.isVotavel();
    dicaConselho0.setConselho("Disciplinas anteriores que te ajudar\u00E3o aqui");
    dicaConselho0.setConselho("models.DicaMaterialUtil");
    java.util.Set<models.Usuario> set_usuario7 = dicaConselho0.getListaUsuariosQueVotaram();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Conselho"+ "'", str1.equals("Conselho"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_usuario7);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroDenuncias();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getCategoria();
    dicaComoNaoTerDificuldade0.setNomeAssunto("models.DicaComoNaoTerDificuldade");
    int i6 = dicaComoNaoTerDificuldade0.getNumeroDiscordancia();
    java.lang.String str7 = dicaComoNaoTerDificuldade0.getNomeAssunto();
    int i8 = dicaComoNaoTerDificuldade0.getNumeroDiscordancia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str3.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str7.equals("models.DicaComoNaoTerDificuldade"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    models.Tema tema1 = new models.Tema("");
    java.util.List<models.IDica> list_iDica2 = tema1.getDicas();
    java.util.Map<java.lang.String,java.lang.Integer> map_str_i3 = tema1.getAvaliacoes();
    int i4 = tema1.getNumeroDicas();
    tema1.ordenarTopConcordancias();
    models.DicaMaterialUtil dicaMaterialUtil6 = new models.DicaMaterialUtil();
    java.util.List<models.Discordancia> list_discordancia7 = dicaMaterialUtil6.getListaDiscordancia();
    boolean b8 = tema1.equals((java.lang.Object)list_discordancia7);
    int i9 = tema1.getNumeroAvaliacoes();
    tema1.setId((java.lang.Long)1L);
    
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
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    models.Usuario usuario4 = new models.Usuario("", "hi!", "models.DicaConselho");
    boolean b6 = usuario4.checaSenha("Disciplinas anteriores que te ajudar\u00E3o aqui");
    models.Concordancia concordancia7 = new models.Concordancia(usuario4);
    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade9 = new models.DicaComoNaoTerDificuldade("Material \u00FAtil", usuario4, "Meta Dica");
    boolean b10 = dicaComoNaoTerDificuldade9.isVotavel();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    models.DicaComoNaoTerDificuldade dicaComoNaoTerDificuldade0 = new models.DicaComoNaoTerDificuldade();
    java.lang.String str1 = dicaComoNaoTerDificuldade0.getCategoria();
    int i2 = dicaComoNaoTerDificuldade0.getNumeroVotos();
    java.lang.String str3 = dicaComoNaoTerDificuldade0.getTipo();
    dicaComoNaoTerDificuldade0.setNomeAssunto("Material \u00FAtil");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"+ "'", str1.equals("O que voc\u00EA precisa saber para n\u00E3o ter dificuldades"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "models.DicaComoNaoTerDificuldade"+ "'", str3.equals("models.DicaComoNaoTerDificuldade"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

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
    usuario7.setNome("hi!");
    models.Discordancia discordancia16 = new models.Discordancia(usuario7, "models.DicaDisciplinasAnteriores");
    java.lang.String str17 = discordancia16.getRazaoDiscordancia();
    java.lang.String str18 = discordancia16.getRazaoDiscordancia();
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str17.equals("models.DicaDisciplinasAnteriores"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "models.DicaDisciplinasAnteriores"+ "'", str18.equals("models.DicaDisciplinasAnteriores"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

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
    boolean b14 = dicaMaterialUtil0.isVisivel();
    dicaMaterialUtil0.setTitulo("0,0");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

}
