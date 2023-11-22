package ch.actifsource.example.editortype.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class SubSubElement extends DynamicResource implements ISubSubElement {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISubSubElement> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ISubSubElement>() {
    
    @Override
    public ISubSubElement create() {
      return new SubSubElement();
    }
    
    @Override
    public ISubSubElement create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new SubSubElement(resourceRepository, resource);
    }
  
  };

  public SubSubElement() {
    super(ISubSubElement.TYPE_ID);
  }
  
  public SubSubElement(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ISubSubElement.TYPE_ID);
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
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public SubSubElement setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,3cfdfd5b-8919-11ee-8c45-e1520b23bcaf,Uvy/VWuJRhc42BasOMXBoD/MEfM=] */
