package com.zhawoilah.wgxt.ui.screens;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.TagKt;
import androidx.compose.material3.AssistChipDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.zhawoilah.wgxt.R;
import com.zhawoilah.wgxt.data.GxtParser;
import com.zhawoilah.wgxt.data.GxtToken;
import com.zhawoilah.wgxt.data.GxtTokens;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: EditorSheet.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001am\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"EditorSheet", "", "keyName", "", "hash", "", "isHashOnly", "", "initialText", "originalText", "sheetState", "Landroidx/compose/material3/SheetState;", "onDismiss", "Lkotlin/Function0;", "onSave", "Lkotlin/Function1;", "onReset", "(Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Landroidx/compose/material3/SheetState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release", "field", "Landroidx/compose/ui/text/input/TextFieldValue;"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class EditorSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditorSheet$lambda$4(String str, long j, boolean z, String str2, String str3, SheetState sheetState, Function0 function0, Function1 function1, Function0 function2, int i, Composer composer, int i2) {
        EditorSheet(str, j, z, str2, str3, sheetState, function0, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EditorSheet(final String keyName, final long j, final boolean z, final String initialText, final String originalText, final SheetState sheetState, final Function0<Unit> onDismiss, final Function1<? super String, Unit> onSave, final Function0<Unit> onReset, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(initialText, "initialText");
        Intrinsics.checkNotNullParameter(originalText, "originalText");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSave, "onSave");
        Intrinsics.checkNotNullParameter(onReset, "onReset");
        Composer composerStartRestartGroup = composer.startRestartGroup(1967627792);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(EditorSheet)N(keyName,hash,isHashOnly,initialText,originalText,sheetState,onDismiss,onSave,onReset)63@2556L121,70@2778L5727,67@2683L5822:EditorSheet.kt#8qvhv2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(keyName) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(initialText) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(originalText) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(sheetState) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDismiss) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSave) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onReset) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (!composerStartRestartGroup.shouldExecute((38347795 & i2) != 38347794, i2 & 1)) {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1967627792, i2, -1, "com.zhawoilah.wgxt.ui.screens.EditorSheet (EditorSheet.kt:62)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1104706345, "CC(remember):EditorSheet.kt#9igjgp");
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue(initialText, TextRangeKt.TextRange(initialText.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composer2 = composerStartRestartGroup;
            ModalBottomSheetKt.m2660ModalBottomSheetYbuCTN8(onDismiss, null, sheetState, 0.0f, false, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1309822478, true, new Function3() { // from class: com.zhawoilah.wgxt.ui.screens.EditorSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return EditorSheetKt.EditorSheet$lambda$3(mutableState, j, keyName, originalText, onReset, onSave, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, ((i2 >> 18) & 14) | ((i2 >> 9) & 896), 3072, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.EditorSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EditorSheetKt.EditorSheet$lambda$4(keyName, j, z, initialText, originalText, sheetState, onDismiss, onSave, onReset, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final TextFieldValue EditorSheet$lambda$1(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditorSheet$lambda$3(final MutableState mutableState, long j, final String str, final String str2, final Function0 function0, final Function1 function1, ColumnScope ModalBottomSheet, Composer composer, int i) {
        String str3;
        String str4;
        int i2;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation(composer, "C71@2788L5711:EditorSheet.kt#8qvhv2");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1309822478, i, -1, "com.zhawoilah.wgxt.ui.screens.EditorSheet.<anonymous> (EditorSheet.kt:71)");
            }
            float f = 20;
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.imePadding(PaddingKt.m928paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8224constructorimpl(f), 0.0f, 2, null)));
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierNavigationBarsPadding);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM4640constructorimpl = Updater.m4640constructorimpl(composer);
            Updater.m4648setimpl(composerM4640constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4648setimpl(composerM4640constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4644initimpl(composerM4640constructorimpl, Integer.valueOf(iHashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4646reconcileimpl(composerM4640constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4648setimpl(composerM4640constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1273663765, "C79@3023L37,80@3100L10,78@3001L138,82@3152L30,88@3350L6,89@3411L11,85@3233L1981,128@5228L30,130@5293L37,131@5370L10,132@5432L11,129@5271L204,134@5488L29,142@5862L6,137@5612L14,135@5530L360,145@5904L30,147@5969L38,148@6047L10,149@6109L11,146@5947L205,151@6165L29,155@6322L21,152@6207L1128,175@7349L30,176@7392L1054,201@8459L30:EditorSheet.kt#8qvhv2");
            TextKt.m3256TextNvy7gAk(StringResources_androidKt.stringResource(R.string.editor_title, composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getHeadlineSmall(), composer, 0, 0, 131070);
            float f2 = 12;
            SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(f2)), composer, 6);
            float f3 = 14;
            Modifier modifierM926padding3ABfNKs = PaddingKt.m926padding3ABfNKs(BackgroundKt.m297backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getShapes(composer, MaterialTheme.$stable).getMedium()), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceContainerHigh(), null, 2, null), Dp.m8224constructorimpl(f3));
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM926padding3ABfNKs);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM4640constructorimpl2 = Updater.m4640constructorimpl(composer);
            Updater.m4648setimpl(composerM4640constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4648setimpl(composerM4640constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4644initimpl(composerM4640constructorimpl2, Integer.valueOf(iHashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4646reconcileimpl(composerM4640constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4648setimpl(composerM4640constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 14943935, "C92@3514L1686:EditorSheet.kt#8qvhv2");
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM4640constructorimpl3 = Updater.m4640constructorimpl(composer);
            Updater.m4648setimpl(composerM4640constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4648setimpl(composerM4640constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4644initimpl(composerM4640constructorimpl3, Integer.valueOf(iHashCode3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4646reconcileimpl(composerM4640constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4648setimpl(composerM4640constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1908384424, "C94@3573L35,95@3656L10,96@3726L11,93@3543L234,98@3798L29,99@3867L324,99@3848L343:EditorSheet.kt#8qvhv2");
            TextKt.m3256TextNvy7gAk(StringResources_androidKt.stringResource(R.string.editor_key, composer, 0), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 0, 0, 131066);
            Composer composer2 = composer;
            SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(2)), composer2, 6);
            SelectionContainerKt.SelectionContainer(null, ComposableLambdaKt.rememberComposableLambda(1038677895, true, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.EditorSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EditorSheetKt.EditorSheet$lambda$3$0$0$0$0(str, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer2, 54), composer2, 48, 1);
            if (j == 0) {
                str3 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
                str4 = "C101@5233L9:Row.kt#2w3rfo";
                i2 = 16;
                composer2.startReplaceGroup(-1911950882);
            } else {
                composer2.startReplaceGroup(-1907726140);
                ComposerKt.sourceInformation(composer2, "108@4254L29,109@4308L852");
                SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(8)), composer2, 6);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, companion2);
                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor4);
                } else {
                    composer2.useNode();
                }
                Composer composerM4640constructorimpl4 = Updater.m4640constructorimpl(composer2);
                Updater.m4648setimpl(composerM4640constructorimpl4, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4648setimpl(composerM4640constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m4644initimpl(composerM4640constructorimpl4, Integer.valueOf(iHashCode4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m4646reconcileimpl(composerM4640constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m4648setimpl(composerM4640constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, -1480308776, "C113@4558L11,110@4390L293,116@4712L28,118@4810L36,119@4932L10,121@5075L11,117@4769L365:EditorSheet.kt#8qvhv2");
                str3 = "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo";
                IconKt.m2550Iconww6aTOc(TagKt.getTag(Icons.Filled.INSTANCE), (String) null, SizeKt.m979width3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), composer, 432, 0);
                SpacerKt.Spacer(SizeKt.m979width3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(4)), composer, 6);
                str4 = "C101@5233L9:Row.kt#2w3rfo";
                i2 = 16;
                TextKt.m3256TextNvy7gAk(StringResources_androidKt.stringResource(R.string.editor_hash, composer, 0) + ": " + GxtParser.INSTANCE.hashHex(j), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, FontFamily.INSTANCE.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 130938);
                composer2 = composer;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(i2)), composer2, 6);
            TextKt.m3256TextNvy7gAk(StringResources_androidKt.stringResource(R.string.editor_value, composer2, 0), null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelMedium(), composer, 0, 0, 131066);
            SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(6)), composer, 6);
            TextFieldValue textFieldValueEditorSheet$lambda$1 = EditorSheet$lambda$1(mutableState);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            CornerBasedShape medium = MaterialTheme.INSTANCE.getShapes(composer, MaterialTheme.$stable).getMedium();
            ComposerKt.sourceInformationMarkerStart(composer, -41007850, "CC(remember):EditorSheet.kt#9igjgp");
            boolean zChanged = composer.changed(mutableState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.zhawoilah.wgxt.ui.screens.EditorSheetKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EditorSheetKt.EditorSheet$lambda$3$0$1$0(mutableState, (TextFieldValue) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            String str5 = "CC(remember):EditorSheet.kt#9igjgp";
            OutlinedTextFieldKt.OutlinedTextField(textFieldValueEditorSheet$lambda$1, (Function1<? super TextFieldValue, Unit>) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EditorSheetKt.INSTANCE.getLambda$1983092705$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 8, 3, (MutableInteractionSource) null, (Shape) medium, (TextFieldColors) null, composer, 12583296, 905969664, 0, 5504888);
            SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(f3)), composer, 6);
            TextKt.m3256TextNvy7gAk(StringResources_androidKt.stringResource(R.string.editor_tokens, composer, 0), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 0, 0, 131066);
            Composer composer3 = composer;
            float f4 = 8;
            SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(f4)), composer3, 6);
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM781spacedBy0680j_4 = Arrangement.INSTANCE.m781spacedBy0680j_4(Dp.m8224constructorimpl(f4));
            String str6 = str3;
            char c = 42059;
            ComposerKt.sourceInformationMarkerStart(composer3, 844473419, str6);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalOrVerticalM781spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer3, 6);
            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer3, modifierHorizontalScroll$default);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor5);
            } else {
                composer3.useNode();
            }
            Composer composerM4640constructorimpl5 = Updater.m4640constructorimpl(composer3);
            Updater.m4648setimpl(composerM4640constructorimpl5, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4648setimpl(composerM4640constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4644initimpl(composerM4640constructorimpl5, Integer.valueOf(iHashCode5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4646reconcileimpl(composerM4640constructorimpl5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4648setimpl(composerM4640constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            String str7 = str4;
            char c2 = 55029;
            ComposerKt.sourceInformationMarkerStart(composer3, 1456264949, str7);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer3, 1213979116, "C:EditorSheet.kt#8qvhv2");
            composer3.startReplaceGroup(-1623406842);
            ComposerKt.sourceInformation(composer3, "*160@6548L469,167@7051L56,169@7234L11,168@7161L119,159@6502L801");
            for (final GxtToken gxtToken : GxtTokens.INSTANCE.getCommon()) {
                String str8 = str5;
                ComposerKt.sourceInformationMarkerStart(composer3, -1651854634, str8);
                boolean zChanged2 = composer3.changed(mutableState) | composer3.changed(gxtToken);
                Object objRememberedValue2 = composer3.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.zhawoilah.wgxt.ui.screens.EditorSheetKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EditorSheetKt.EditorSheet$lambda$3$0$2$0$0$0(gxtToken, mutableState);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ChipKt.AssistChip((Function0<Unit>) objRememberedValue2, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1173876702, true, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.EditorSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EditorSheetKt.EditorSheet$lambda$3$0$2$0$1(gxtToken, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer3, 54), (Modifier) null, false, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Shape) null, AssistChipDefaults.INSTANCE.m2028assistChipColorsoq7We08(0L, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getPrimary(), 0L, 0L, 0L, 0L, 0L, 0L, composer, AssistChipDefaults.$stable << 24, 253), (ChipElevation) null, (BorderStroke) null, (MutableInteractionSource) null, composer, 48, 0, 1916);
                str6 = str6;
                composer3 = composer;
                str7 = str7;
                str5 = str8;
                c2 = 55029;
                c = 42059;
            }
            String str9 = str7;
            String str10 = str5;
            composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(f)), composer3, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM781spacedBy0680j_5 = Arrangement.INSTANCE.m781spacedBy0680j_4(Dp.m8224constructorimpl(f2));
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer3, 844473419, str6);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(horizontalOrVerticalM781spacedBy0680j_5, centerVertically2, composer3, 54);
            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int iHashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap6 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer3, modifierFillMaxWidth$default2);
            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor6);
            } else {
                composer3.useNode();
            }
            Composer composerM4640constructorimpl6 = Updater.m4640constructorimpl(composer3);
            Updater.m4648setimpl(composerM4640constructorimpl6, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4648setimpl(composerM4640constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4644initimpl(composerM4640constructorimpl6, Integer.valueOf(iHashCode6), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4646reconcileimpl(composerM4640constructorimpl6, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4648setimpl(composerM4640constructorimpl6, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer3, 1456264949, str9);
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer3, 1800001710, "C182@7656L150,181@7614L421,191@8052L28,193@8135L22,192@8097L335:EditorSheet.kt#8qvhv2");
            ComposerKt.sourceInformationMarkerStart(composer3, 1997727897, str10);
            boolean zChanged3 = composer3.changed(mutableState) | composer3.changed(str2) | composer3.changed(function0);
            Object objRememberedValue3 = composer3.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.zhawoilah.wgxt.ui.screens.EditorSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditorSheetKt.EditorSheet$lambda$3$0$3$0$0(str2, function0, mutableState);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ButtonKt.TextButton((Function0) objRememberedValue3, null, false, null, null, null, null, null, null, ComposableSingletons$EditorSheetKt.INSTANCE.getLambda$380809664$app_release(), composer, 805306368, 510);
            SpacerKt.Spacer(SizeKt.m979width3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(0)), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, 1997743097, str10);
            boolean zChanged4 = composer.changed(function1) | composer.changed(mutableState);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.zhawoilah.wgxt.ui.screens.EditorSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditorSheetKt.EditorSheet$lambda$3$0$3$1$0(function1, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.Button((Function0) objRememberedValue4, RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null), false, null, null, null, null, null, null, ComposableSingletons$EditorSheetKt.INSTANCE.getLambda$887234867$app_release(), composer, 805306368, 508);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(f)), composer, 6);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditorSheet$lambda$3$0$0$0$0(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C102@3986L10,104@4123L11,100@3893L276:EditorSheet.kt#8qvhv2");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1038677895, i, -1, "com.zhawoilah.wgxt.ui.screens.EditorSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditorSheet.kt:100)");
            }
            TextKt.m3256TextNvy7gAk(str, null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), null, 0L, null, null, FontFamily.INSTANCE.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 0, 0, 130938);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditorSheet$lambda$3$0$1$0(MutableState mutableState, TextFieldValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditorSheet$lambda$3$0$2$0$0$0(GxtToken gxtToken, MutableState mutableState) {
        int iCoerceIn = RangesKt.coerceIn(TextRange.m7667getStartimpl(EditorSheet$lambda$1(mutableState).getSelection()), 0, EditorSheet$lambda$1(mutableState).getText().length());
        int iCoerceIn2 = RangesKt.coerceIn(TextRange.m7662getEndimpl(EditorSheet$lambda$1(mutableState).getSelection()), 0, EditorSheet$lambda$1(mutableState).getText().length());
        String strSubstring = EditorSheet$lambda$1(mutableState).getText().substring(0, iCoerceIn);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String token = gxtToken.getToken();
        String strSubstring2 = EditorSheet$lambda$1(mutableState).getText().substring(iCoerceIn2);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        mutableState.setValue(new TextFieldValue(strSubstring + token + strSubstring2, TextRangeKt.TextRange(iCoerceIn + gxtToken.getToken().length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditorSheet$lambda$3$0$2$0$1(GxtToken gxtToken, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C167@7053L52:EditorSheet.kt#8qvhv2");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1173876702, i, -1, "com.zhawoilah.wgxt.ui.screens.EditorSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditorSheet.kt:167)");
            }
            TextKt.m3256TextNvy7gAk(gxtToken.getToken(), null, 0L, null, 0L, null, null, FontFamily.INSTANCE.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262014);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditorSheet$lambda$3$0$3$0$0(String str, Function0 function0, MutableState mutableState) {
        mutableState.setValue(new TextFieldValue(str, TextRangeKt.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditorSheet$lambda$3$0$3$1$0(Function1 function1, MutableState mutableState) {
        function1.invoke(EditorSheet$lambda$1(mutableState).getText());
        return Unit.INSTANCE;
    }
}
