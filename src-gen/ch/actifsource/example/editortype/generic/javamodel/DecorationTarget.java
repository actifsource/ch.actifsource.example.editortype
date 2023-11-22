package ch.actifsource.example.editortype.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class DecorationTarget extends DynamicResource implements IDecorationTarget {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDecorationTarget> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IDecorationTarget>() {
    
    @Override
    public IDecorationTarget create() {
      return new DecorationTarget();
    }
    
    @Override
    public IDecorationTarget create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new DecorationTarget(resourceRepository, resource);
    }
  
  };

  public DecorationTarget() {
    super(IDecorationTarget.TYPE_ID);
  }
  
  public DecorationTarget(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IDecorationTarget.TYPE_ID);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IResource selectTarget() {
    return _getSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target);
  }

  public DecorationTarget setTarget(ch.actifsource.core.javamodel.IResource target) {
    _setSingle(ch.actifsource.core.CorePackage.Decorator_target, target);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public DecorationTarget setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IResource.class, ch.actifsource.core.CorePackage.Decorator_target, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,baf76421-8909-11ee-8c45-e1520b23bcaf,4KiDLQU/P84ELw1azf4x79EhIrU=] */
