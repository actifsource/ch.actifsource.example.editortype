package ch.actifsource.example.editortype.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ITestEnum extends ch.actifsource.core.javamodel.IEnumValue, ch.actifsource.core.javamodel.ICommentable {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("53103338-9908-11ea-8568-8df113ebd62f");
  
  public static interface IValueVoidVisitor {
    
    public void visitEnum1();
    
    public void visitEnum2();
    
    public void visitEnum3();
    
  }
  
  public static interface IValueVisitor<R> {
    
    public R visitEnum1();
    
    public R visitEnum2();
    
    public R visitEnum3();
    
  }
  
  // accept visitors
  
  public <R> R accept(IValueVisitor<R> visitor);
  
  public void accept(IValueVoidVisitor visitor);
  
  // isValue-Methods
  
  public boolean isEnum1();
  
  public boolean isEnum2();
  
  public boolean isEnum3();
  
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,53103338-9908-11ea-8568-8df113ebd62f,eKcdKnqpFrzVelo4i8fABQVwiws=] */
