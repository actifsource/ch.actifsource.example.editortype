package ch.actifsource.example.editortype.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Root extends DynamicResource implements IRoot {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoot> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IRoot>() {
    
    @Override
    public IRoot create() {
      return new Root();
    }
    
    @Override
    public IRoot create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Root(resourceRepository, resource);
    }
  
  };

  public Root() {
    super(IRoot.TYPE_ID);
  }
  
  public Root(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IRoot.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.ISubElement> selectSubElement() {
    return _getList(ch.actifsource.example.editortype.generic.javamodel.ISubElement.class, ch.actifsource.example.editortype.generic.GenericPackage.Root_subElement);
  }

  public Root setSubElement(java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.ISubElement> subElement) {
    _setList(ch.actifsource.example.editortype.generic.GenericPackage.Root_subElement, subElement);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> selectTestAggregation() {
    return _getList(ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Root_testAggregation);
  }

  public Root setTestAggregation(java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> testAggregation) {
    _setList(ch.actifsource.example.editortype.generic.GenericPackage.Root_testAggregation, testAggregation);
    return this;
  }
    
  @Override
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> selectTestComposition() {
    return _getList(ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Root_testComposition);
  }

  public Root setTestComposition(java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> testComposition) {
    _setList(ch.actifsource.example.editortype.generic.GenericPackage.Root_testComposition, testComposition);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Root setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(ch.actifsource.example.editortype.generic.javamodel.ISubElement.class, ch.actifsource.example.editortype.generic.GenericPackage.Root_subElement, visitor);
    _acceptList(ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Root_testAggregation, visitor);
    _acceptList(ch.actifsource.example.editortype.generic.javamodel.IComposition.class, ch.actifsource.example.editortype.generic.GenericPackage.Root_testComposition, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.editortype.generic.javamodel.IRoot selectToMeTestComposition(ch.actifsource.example.editortype.generic.javamodel.IComposition object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.editortype.generic.javamodel.IRoot.class, ch.actifsource.example.editortype.generic.GenericPackage.Root_testComposition, object.getResource());
  }
  
  public static ch.actifsource.example.editortype.generic.javamodel.IRoot selectToMeTestAggregation(ch.actifsource.example.editortype.generic.javamodel.IComposition object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.editortype.generic.javamodel.IRoot.class, ch.actifsource.example.editortype.generic.GenericPackage.Root_testAggregation, object.getResource());
  }
  
  public static ch.actifsource.example.editortype.generic.javamodel.IRoot selectToMeSubElement(ch.actifsource.example.editortype.generic.javamodel.ISubElement object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.editortype.generic.javamodel.IRoot.class, ch.actifsource.example.editortype.generic.GenericPackage.Root_subElement, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,5310332c-9908-11ea-8568-8df113ebd62f,DgYw+rSpx+naZi1lS9nSEwKDlfY=] */
