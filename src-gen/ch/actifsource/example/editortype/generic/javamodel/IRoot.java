package ch.actifsource.example.editortype.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IRoot extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("5310332c-9908-11ea-8568-8df113ebd62f");
  
  // relations
  
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> selectTestComposition();
  
  public java.util.List<? extends ch.actifsource.example.editortype.generic.javamodel.IComposition> selectTestAggregation();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,5310332c-9908-11ea-8568-8df113ebd62f,FyuDejSu4s0MFCOr7xD2ToTR2ls=] */
