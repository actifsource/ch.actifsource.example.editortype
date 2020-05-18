package ch.actifsource.example.editortype.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IComposition extends ch.actifsource.core.javamodel.INamedResource, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("53103312-9908-11ea-8568-8df113ebd62f");
  
  // attributes
  
  public java.util.List<java.lang.Boolean> selectBoolean_1();
  
  public java.util.List<java.lang.Boolean> selectBoolean_2();
  
  public java.util.List<java.lang.Boolean> selectBoolean_3();
  
  public java.util.List<java.lang.Boolean> selectBoolean_4();
  
  public java.util.Date selectDateLiteral_1();
  
  public java.lang.String selectCodeStyle();
  
  public java.lang.String selectBorderStyle();
  
  public java.lang.String selectScopeFile();
  
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.ITestEnum> selectEnum_1();
  
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> selectAssociation_1();
  
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> selectTestAssociation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,53103312-9908-11ea-8568-8df113ebd62f,yk/Dy1ZU766hn2qZFs5PLmdZNzw=] */
