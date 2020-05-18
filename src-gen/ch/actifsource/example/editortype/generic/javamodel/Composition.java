package ch.actifsource.example.editortype.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Composition extends DynamicResource implements IComposition {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComposition> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IComposition>() {
    
    @Override
    public IComposition create() {
      return new Composition();
    }
    
    @Override
    public IComposition create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Composition(resourceRepository, resource);
    }
  
  };

  public Composition() {
    super(IComposition.TYPE_ID);
  }
  
  public Composition(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IComposition.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.util.List<java.lang.Boolean> selectBoolean_1() {
    return _getListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_boolean_aE_1);
  }
    
  public void setBoolean_1(java.util.List<java.lang.Boolean> boolean_1) {
     _setListAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_boolean_aE_1, boolean_1);
  }

  @Override
  public java.util.List<java.lang.Boolean> selectBoolean_2() {
    return _getListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_boolean_aE_2);
  }
    
  public void setBoolean_2(java.util.List<java.lang.Boolean> boolean_2) {
     _setListAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_boolean_aE_2, boolean_2);
  }

  @Override
  public java.util.List<java.lang.Boolean> selectBoolean_3() {
    return _getListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_boolean_aE_3);
  }
    
  public void setBoolean_3(java.util.List<java.lang.Boolean> boolean_3) {
     _setListAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_boolean_aE_3, boolean_3);
  }

  @Override
  public java.util.List<java.lang.Boolean> selectBoolean_4() {
    return _getListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_boolean_aE_4);
  }
    
  public void setBoolean_4(java.util.List<java.lang.Boolean> boolean_4) {
     _setListAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_boolean_aE_4, boolean_4);
  }

  @Override
  public java.lang.String selectBorderStyle() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_borderStyle);
  }
    
  public void setBorderStyle(java.lang.String borderStyle) {
     _setSingleAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_borderStyle, borderStyle);
  }

  @Override
  public java.lang.String selectCodeStyle() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_codeStyle);
  }
    
  public void setCodeStyle(java.lang.String codeStyle) {
     _setSingleAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_codeStyle, codeStyle);
  }

  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

  @Override
  public java.util.Date selectDateLiteral_1() {
    return _getSingleAttribute(java.util.Date.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_dateLiteral_aE_1);
  }
    
  public void setDateLiteral_1(java.util.Date dateLiteral_1) {
     _setSingleAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_dateLiteral_aE_1, dateLiteral_1);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.String selectScopeFile() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_scopeFile);
  }
    
  public void setScopeFile(java.lang.String scopeFile) {
     _setSingleAttribute(ch.actifsource.example.editortype.generic.GenericPackage.Composition_scopeFile, scopeFile);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> selectAssociation_1() {
    return _getList(ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_association_aE_1);
  }

  public Composition setAssociation_1(java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> association_1) {
    _setList(ch.actifsource.example.editortype.generic.GenericPackage.Composition_association_aE_1, association_1);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.ITestEnum> selectEnum_1() {
    return _getList(ch.actifsource.example.editortype.generic.javamodel.ITestEnum.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_enum_aE_1);
  }

  public Composition setEnum_1(java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.ITestEnum> enum_1) {
    _setList(ch.actifsource.example.editortype.generic.GenericPackage.Composition_enum_aE_1, enum_1);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> selectTestAssociation() {
    return _getList(ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_testAssociation);
  }

  public Composition setTestAssociation(java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> testAssociation) {
    _setList(ch.actifsource.example.editortype.generic.GenericPackage.Composition_testAssociation, testAssociation);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Composition setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_boolean_aE_1, visitor);
    _acceptListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_boolean_aE_2, visitor);
    _acceptListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_boolean_aE_3, visitor);
    _acceptListAttribute(java.lang.Boolean.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_boolean_aE_4, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_borderStyle, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_codeStyle, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.util.Date.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_dateLiteral_aE_1, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_scopeFile, visitor);
    // relations
    _acceptList(ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_association_aE_1, visitor);
    _acceptList(ch.actifsource.example.editortype.generic.javamodel.ITestEnum.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_enum_aE_1, visitor);
    _acceptList(ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_testAssociation, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  public static java.util.List<ch.actifsource.example.editortype.generic.javamodel.IComposition> selectToMeEnum_1(ch.actifsource.example.editortype.generic.javamodel.ITestEnum object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_enum_aE_1, object.getResource());
  }
  
  public static java.util.List<ch.actifsource.example.editortype.generic.javamodel.IComposition> selectToMeAssociation_1(ch.actifsource.example.editortype.generic.javamodel.IComposition object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_association_aE_1, object.getResource());
  }
  
  public static java.util.List<ch.actifsource.example.editortype.generic.javamodel.IComposition> selectToMeTestAssociation(ch.actifsource.example.editortype.generic.javamodel.IComposition object) {
    return _getToMeList(object.getRepository(), ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Composition_testAssociation, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,53103312-9908-11ea-8568-8df113ebd62f,Rvuk8QvKCMPez1LpPcekJXBDTOk=] */
