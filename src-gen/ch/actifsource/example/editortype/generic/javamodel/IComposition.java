package ch.actifsource.example.editortype.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IComposition extends ch.actifsource.core.javamodel.INamedResource, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("53103312-9908-11ea-8568-8df113ebd62f");
  
  // attributes
  
  public java.util.List<java.lang.Boolean> selectBooleanCheckBox();
  
  public java.util.List<java.lang.Boolean> selectBooleanSwitch1();
  
  public java.util.List<java.lang.Boolean> selectBooleanSwitch2();
  
  public java.util.List<java.lang.Boolean> selectBooleanRadioButton();
  
  public java.util.Date selectDateTime();
  
  public java.lang.String selectTextCodesnippetFontBorder();
  
  public java.lang.String selectScopeFileSelector();
  
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.ITestEnum> selectEnumComboBox();
  
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> selectAssociationComboBox();
  
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> selectAssociationRadioButton();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,53103312-9908-11ea-8568-8df113ebd62f,PV2dQ3H5Ouj9YI/3xcnc/ZrtdJs=] */
