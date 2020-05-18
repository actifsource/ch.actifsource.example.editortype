package ch.actifsource.example.editortype.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class TestEnum extends DynamicResource implements ITestEnum {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestEnum> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ITestEnum>() {
    
    @Override
    public ITestEnum create() {
      return new TestEnum();
    }
    
    @Override
    public ITestEnum create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new TestEnum(resourceRepository, resource);
    }
  
  };

  public TestEnum() {
    super(ITestEnum.TYPE_ID);
  }
  
  public TestEnum(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ITestEnum.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectComment() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment);
  }
    
  public void setComment(java.lang.String comment) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.Commentable_comment, comment);
  }

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

  public TestEnum setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.Commentable_comment, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // accept enum value visitors

  @Override
  public <R> R accept(IValueVisitor<R> visitor) {
    if (isEnum1()) return visitor.visitEnum1();
    if (isEnum2()) return visitor.visitEnum2();
    if (isEnum3()) return visitor.visitEnum3();
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  @Override
  public void accept(IValueVoidVisitor visitor) {
    if (isEnum1()) {
      visitor.visitEnum1();
      return;
    }
    if (isEnum2()) {
      visitor.visitEnum2();
      return;
    }
    if (isEnum3()) {
      visitor.visitEnum3();
      return;
    }
    throw new IllegalStateException("unknown enumvalue: " + fResource);
  }
  
  // isValue-Methods
    
  @Override
  public boolean isEnum1() {
    return getResource().equals(ch.actifsource.example.editortype.generic.GenericPackage.TestEnum_Enum1);
  }
  
  @Override
  public boolean isEnum2() {
    return getResource().equals(ch.actifsource.example.editortype.generic.GenericPackage.TestEnum_Enum2);
  }
  
  @Override
  public boolean isEnum3() {
    return getResource().equals(ch.actifsource.example.editortype.generic.GenericPackage.TestEnum_Enum3);
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,53103338-9908-11ea-8568-8df113ebd62f,0Knp7/27VbG53jMcRtHcbyk1dNM=] */
