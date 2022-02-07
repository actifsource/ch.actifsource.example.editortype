package ch.actifsource.example.editortype.aspect;

import ch.actifsource.core.Statement;
import ch.actifsource.core.job.ReadJobNonNull;
import ch.actifsource.ui.builder.IRootBuilder;
import ch.actifsource.ui.builder.aspect.AbstractDynamicControlBuilderAspect;
import ch.actifsource.ui.builder.aspect.CustomTextContentAssistFactory;
import ch.actifsource.ui.builder.dynamical.EditorModelBuilder;
import ch.actifsource.ui.builder.dynamical.IDynamicRootBuilder;
import ch.actifsource.ui.builder.dynamical.editor.jobs.EditorSelectorUtil;
import ch.actifsource.ui.builder.statical.DummyEditorModel;
import ch.actifsource.ui.component.child.IChild;
import ch.actifsource.ui.component.impl.CustomText;
import ch.actifsource.ui.component.impl.IDynamicStatementElementTextContainer;
import ch.actifsource.ui.component.impl.IStatementElementTextContainer;
import ch.actifsource.ui.widget.text.contentassist.IContentAssistFactory;
import ch.actifsource.util.character.HashCodeUtil;

/**
 * Define the border builder aspect.
 * @author ruti
 *
 */
public class OwnPasswordHashBuilderAspect extends AbstractDynamicControlBuilderAspect {
  
  @Override
  protected IChild internalBuildDynamicChildForLine(IDynamicRootBuilder builder, IDynamicStatementElementTextContainer line, Statement statement) {
    IContentAssistFactory<String> factory = new CustomTextContentAssistFactory(builder);
    DummyEditorModel editorModel = new DummyEditorModel(builder.getContext(), statement);
    CustomText customText = new CustomText(builder.getContext(), line, editorModel, EditorSelectorUtil.createDefaultTextStyleInitialConfig(builder), factory) {
      
      @Override
      protected String converToModel(String str) {
        return HashCodeUtil.hashCode_SHA1(str, null);
      }
      
    };
    
    new EditorModelBuilder(builder, customText, statement);
    return customText;
  }
  
  @Override
  protected IChild internalBuildStaticChildForLine(IRootBuilder builder, IStatementElementTextContainer line, Statement statement) {
    return super.internalBuildStaticDefaultChildForLine(builder, line, statement);
  }
  
  @Override
  protected ReadJobNonNull<Boolean> createDynamicChildValidationJob(Statement statement) {
    return new AlwaysValidJob();
  }

}
