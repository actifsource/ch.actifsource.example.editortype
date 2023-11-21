package ch.actifsource.example.editortype.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Deprecated__F_ extends DynamicResource implements IDeprecated__F_ {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeprecated__F_> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDeprecated__F_>() {
    
    @Override
    public IDeprecated__F_ create() {
      return new Deprecated__F_();
    }
    
    @Override
    public IDeprecated__F_ create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Deprecated__F_(resourceRepository, resource);
    }
  
  };

  public Deprecated__F_() {
    super(IDeprecated__F_.TYPE_ID);
  }
  
  public Deprecated__F_(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDeprecated__F_.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.Boolean> selectBooleanCheckBox() {
    return _getListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_booleanCheckBox);
  }
    
  public void setBooleanCheckBox(java.util.List<java.lang.Boolean> booleanCheckBox) {
     _setListAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_booleanCheckBox, booleanCheckBox);
  }

  @Override
  public java.util.List<java.lang.Boolean> selectBooleanRadioButton() {
    return _getListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_booleanRadioButton);
  }
    
  public void setBooleanRadioButton(java.util.List<java.lang.Boolean> booleanRadioButton) {
     _setListAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_booleanRadioButton, booleanRadioButton);
  }

  @Override
  public java.util.List<java.lang.Boolean> selectBooleanSwitch1() {
    return _getListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_booleanSwitch1);
  }
    
  public void setBooleanSwitch1(java.util.List<java.lang.Boolean> booleanSwitch1) {
     _setListAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_booleanSwitch1, booleanSwitch1);
  }

  @Override
  public java.util.List<java.lang.Boolean> selectBooleanSwitch2() {
    return _getListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_booleanSwitch2);
  }
    
  public void setBooleanSwitch2(java.util.List<java.lang.Boolean> booleanSwitch2) {
     _setListAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_booleanSwitch2, booleanSwitch2);
  }

  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.Date selectDateTime() {
    return _getSingleAttribute(java.util.Date.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_dateTime);
  }
    
  public void setDateTime(java.util.Date dateTime) {
     _setSingleAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_dateTime, dateTime);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectOwnPassword() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_ownPassword);
  }
    
  public void setOwnPassword(java.lang.String ownPassword) {
     _setSingleAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_ownPassword, ownPassword);
  }

  @Override
  public java.lang.String selectPassword() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_password);
  }
    
  public void setPassword(java.lang.String password) {
     _setSingleAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_password, password);
  }

  @Override
  public java.lang.String selectScopeFileSelector() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_scopeFileSelector);
  }
    
  public void setScopeFileSelector(java.lang.String scopeFileSelector) {
     _setSingleAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_scopeFileSelector, scopeFileSelector);
  }

  @Override
  public java.lang.String selectTestCsvParser() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_testCsvParser);
  }
    
  public void setTestCsvParser(java.lang.String testCsvParser) {
     _setSingleAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_testCsvParser, testCsvParser);
  }

  @Override
  public java.lang.String selectTestDefaultParser() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_testDefaultParser);
  }
    
  public void setTestDefaultParser(java.lang.String testDefaultParser) {
     _setSingleAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_testDefaultParser, testDefaultParser);
  }

  @Override
  public java.lang.String selectTestMarkdownParser() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_testMarkdownParser);
  }
    
  public void setTestMarkdownParser(java.lang.String testMarkdownParser) {
     _setSingleAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_testMarkdownParser, testMarkdownParser);
  }

  @Override
  public java.lang.String selectTestSyntaxHighlightingParser() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_testSyntaxHighlightingParser);
  }
    
  public void setTestSyntaxHighlightingParser(java.lang.String testSyntaxHighlightingParser) {
     _setSingleAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_testSyntaxHighlightingParser, testSyntaxHighlightingParser);
  }

  @Override
  public java.lang.String selectTextCodesnippetFontBorder() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_textCodesnippetFontBorder);
  }
    
  public void setTextCodesnippetFontBorder(java.lang.String textCodesnippetFontBorder) {
     _setSingleAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_textCodesnippetFontBorder, textCodesnippetFontBorder);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> selectAssociationComboBox() {
    return _getList(ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_associationComboBox);
  }

  public Deprecated__F_ setAssociationComboBox(java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> associationComboBox) {
    _setList(ch.actifsource.example.editortype.generic.GenericPackage.Composition_associationComboBox, associationComboBox);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> selectAssociationRadioButton() {
    return _getList(ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_associationRadioButton);
  }

  public Deprecated__F_ setAssociationRadioButton(java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> associationRadioButton) {
    _setList(ch.actifsource.example.editortype.generic.GenericPackage.Composition_associationRadioButton, associationRadioButton);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.ITestEnum> selectEnumComboBox() {
    return _getList(ch.actifsource.example.editortype.generic.javamodel.ITestEnum.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_enumComboBox);
  }

  public Deprecated__F_ setEnumComboBox(java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.ITestEnum> enumComboBox) {
    _setList(ch.actifsource.example.editortype.generic.GenericPackage.Composition_enumComboBox, enumComboBox);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Deprecated__F_ setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_booleanCheckBox, visitor);
    _acceptListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_booleanRadioButton, visitor);
    _acceptListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_booleanSwitch1, visitor);
    _acceptListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_booleanSwitch2, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.util.Date.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_dateTime, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_ownPassword, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_password, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_scopeFileSelector, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_testCsvParser, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_testDefaultParser, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_testMarkdownParser, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_testSyntaxHighlightingParser, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_textCodesnippetFontBorder, visitor);
    // relations
    _acceptList(ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_associationComboBox, visitor);
    _acceptList(ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_associationRadioButton, visitor);
    _acceptList(ch.actifsource.example.editortype.generic.javamodel.ITestEnum.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_enumComboBox, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,4f49f4fb-43e2-11ed-bc1e-a3a444c7b7ac,CTXmaPQMOY6G+Ae3DtyoyaXjHQ4=] */
