package com.zhawoilah.wgxt.ui.screens;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CircleKt;
import androidx.compose.material.icons.filled.SearchOffKt;
import androidx.compose.material.icons.filled.TagKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
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
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import com.zhawoilah.wgxt.R;
import com.zhawoilah.wgxt.data.GxtEntry;
import com.zhawoilah.wgxt.data.GxtTable;
import com.zhawoilah.wgxt.ui.components.CommonKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: EntriesScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\r\u001a;\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0007X\u008a\u008e\u0002"}, d2 = {"EntriesScreen", "", "table", "Lcom/zhawoilah/wgxt/data/GxtTable;", "textFor", "Lkotlin/Function1;", "", "", "isEdited", "", "onBack", "Lkotlin/Function0;", "onOpenEntry", "(Lcom/zhawoilah/wgxt/data/GxtTable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "EntryCard", "keyName", "isHashOnly", "text", "edited", "onClick", "(Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_release", "query"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class EntriesScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EntriesScreen$lambda$7(GxtTable gxtTable, Function1 function1, Function1 function2, Function0 function0, Function1 function3, int i, Composer composer, int i2) {
        EntriesScreen(gxtTable, function1, function2, function0, function3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EntryCard$lambda$1(String str, boolean z, String str2, boolean z2, Function0 function0, int i, Composer composer, int i2) {
        EntryCard(str, z, str2, z2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x01dd  */
    public static final void EntriesScreen(final GxtTable table, final Function1<? super Integer, String> textFor, final Function1<? super Integer, Boolean> isEdited, final Function0<Unit> onBack, final Function1<? super Integer, Unit> onOpenEntry, Composer composer, final int i) {
        Composer composer2;
        MutableState mutableState;
        boolean z;
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(textFor, "textFor");
        Intrinsics.checkNotNullParameter(isEdited, "isEdited");
        Intrinsics.checkNotNullParameter(onBack, "onBack");
        Intrinsics.checkNotNullParameter(onOpenEntry, "onOpenEntry");
        Composer composerStartRestartGroup = composer.startRestartGroup(634305834);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(EntriesScreen)N(table,textFor,isEdited,onBack,onOpenEntry)65@2710L31,67@2761L82,70@2863L313,82@3209L791,101@4008L1927,81@3182L2753:EntriesScreen.kt#8qvhv2");
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? composerStartRestartGroup.changed(table) : composerStartRestartGroup.changedInstance(table) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(textFor) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(isEdited) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBack) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onOpenEntry) ? 16384 : 8192;
        }
        if (!composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(634305834, i2, -1, "com.zhawoilah.wgxt.ui.screens.EntriesScreen (EntriesScreen.kt:64)");
            }
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -317443799, "CC(remember):EntriesScreen.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -317442116, "CC(remember):EntriesScreen.kt#9igjgp");
            boolean z2 = (i2 & 14) == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changed(table));
            ArrayList arrayListRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || arrayListRememberedValue == Composer.INSTANCE.getEmpty()) {
                List<GxtEntry> entries = table.getEntries();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
                int i3 = 0;
                for (Object obj : entries) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList.add(new RowItem(i3, (GxtEntry) obj));
                    i3 = i4;
                }
                arrayListRememberedValue = arrayList;
                composerStartRestartGroup.updateRememberedValue(arrayListRememberedValue);
            }
            ArrayList arrayList2 = (List) arrayListRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            String strEntriesScreen$lambda$1 = EntriesScreen$lambda$1(mutableState2);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -317438621, "CC(remember):EntriesScreen.kt#9igjgp");
            boolean zChanged = composerStartRestartGroup.changed(strEntriesScreen$lambda$1) | composerStartRestartGroup.changed(arrayList2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                if (StringsKt.isBlank(EntriesScreen$lambda$1(mutableState2))) {
                    mutableState = mutableState2;
                } else {
                    String lowerCase = StringsKt.trim((CharSequence) EntriesScreen$lambda$1(mutableState2)).toString().toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj2 : arrayList2) {
                        RowItem rowItem = (RowItem) obj2;
                        String lowerCase2 = rowItem.getEntry().getKeyName().toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                        String str = lowerCase;
                        MutableState mutableState3 = mutableState2;
                        if (StringsKt.contains$default((CharSequence) lowerCase2, (CharSequence) str, false, 2, (Object) null)) {
                            z = true;
                        } else {
                            String lowerCase3 = rowItem.getEntry().getOriginal().toLowerCase(Locale.ROOT);
                            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                            if (StringsKt.contains$default((CharSequence) lowerCase3, (CharSequence) str, false, 2, (Object) null)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            arrayList3.add(obj2);
                        }
                        mutableState2 = mutableState3;
                    }
                    mutableState = mutableState2;
                    arrayList2 = arrayList3;
                }
                composerStartRestartGroup.updateRememberedValue(arrayList2);
                objRememberedValue2 = arrayList2;
            } else {
                mutableState = mutableState2;
            }
            final List list = (List) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final MutableState mutableState4 = mutableState;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m2873ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(2010938598, true, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return EntriesScreenKt.EntriesScreen$lambda$5(table, list, onBack, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1319623803, true, new Function3() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return EntriesScreenKt.EntriesScreen$lambda$6(list, mutableState4, textFor, isEdited, onOpenEntry, (PaddingValues) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return EntriesScreenKt.EntriesScreen$lambda$7(table, textFor, isEdited, onBack, onOpenEntry, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final String EntriesScreen$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EntriesScreen$lambda$5(final GxtTable gxtTable, final List list, final Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C84@3258L465,94@3758L217,83@3223L767:EntriesScreen.kt#8qvhv2");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2010938598, i, -1, "com.zhawoilah.wgxt.ui.screens.EntriesScreen.<anonymous> (EntriesScreen.kt:83)");
            }
            AppBarKt.m2018TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(444369578, true, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EntriesScreenKt.EntriesScreen$lambda$5$0(gxtTable, list, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-2092970580, true, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EntriesScreenKt.EntriesScreen$lambda$5$1(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), null, 0.0f, null, null, null, composer, 390, ProgressIndicatorKt.FirstLineTailDelay);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EntriesScreen$lambda$5$0(GxtTable gxtTable, List list, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C85@3280L425:EntriesScreen.kt#8qvhv2");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(444369578, i, -1, "com.zhawoilah.wgxt.ui.screens.EntriesScreen.<anonymous>.<anonymous> (EntriesScreen.kt:85)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            ComposerKt.sourceInformationMarkerStart(composer, 994639345, "C86@3313L51,88@3423L79,89@3554L10,90@3628L11,87@3389L294:EntriesScreen.kt#8qvhv2");
            TextKt.m3256TextNvy7gAk(gxtTable.getName(), null, 0L, null, 0L, null, null, FontFamily.INSTANCE.getMonospace(), 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262014);
            TextKt.m3256TextNvy7gAk(StringResources_androidKt.stringResource(R.string.entries_count_label, new Object[]{Integer.valueOf(list.size()), Integer.valueOf(gxtTable.getEntries().size())}, composer, 0), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 0, 0, 131066);
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
    public static final Unit EntriesScreen$lambda$5$1(Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C95@3780L177:EntriesScreen.kt#8qvhv2");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2092970580, i, -1, "com.zhawoilah.wgxt.ui.screens.EntriesScreen.<anonymous>.<anonymous> (EntriesScreen.kt:95)");
            }
            IconButtonKt.IconButton(function0, null, false, null, null, null, ComposableSingletons$EntriesScreenKt.INSTANCE.m8891getLambda$1706914998$app_release(), composer, 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EntriesScreen$lambda$6(final List list, final MutableState mutableState, final Function1 function1, final Function1 function2, final Function1 function3, PaddingValues padding, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(padding, "padding");
        ComposerKt.sourceInformation(composer, "CN(padding)102@4029L1900:EntriesScreen.kt#8qvhv2");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(padding) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1319623803, i2, -1, "com.zhawoilah.wgxt.ui.screens.EntriesScreen.<anonymous> (EntriesScreen.kt:102)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), padding);
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPadding);
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
            ComposerKt.sourceInformationMarkerStart(composer, 866553358, "C105@4173L14,112@4570L6,103@4091L506,116@4710L35,118@4803L1116,114@4610L1309:EntriesScreen.kt#8qvhv2");
            String strEntriesScreen$lambda$1 = EntriesScreen$lambda$1(mutableState);
            ComposerKt.sourceInformationMarkerStart(composer, -1080424513, "CC(remember):EntriesScreen.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EntriesScreenKt.EntriesScreen$lambda$6$0$0$0(mutableState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            OutlinedTextFieldKt.OutlinedTextField(strEntriesScreen$lambda$1, (Function1<? super String, Unit>) objRememberedValue, PaddingKt.m927paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8224constructorimpl(16), Dp.m8224constructorimpl(8)), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EntriesScreenKt.INSTANCE.m8890getLambda$1183285590$app_release(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$EntriesScreenKt.INSTANCE.getLambda$1238468169$app_release(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) MaterialTheme.INSTANCE.getShapes(composer, MaterialTheme.$stable).getLarge(), (TextFieldColors) null, composer, 113246640, 12582912, 0, 6159992);
            Boolean boolValueOf = Boolean.valueOf(list.isEmpty());
            ComposerKt.sourceInformationMarkerStart(composer, -1080407308, "CC(remember):EntriesScreen.kt#9igjgp");
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EntriesScreenKt.EntriesScreen$lambda$6$0$1$0((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) objRememberedValue2, null, "entriesContent", null, ComposableLambdaKt.rememberComposableLambda(-2105124684, true, new Function4() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return EntriesScreenKt.EntriesScreen$lambda$6$0$2(list, function1, function2, function3, (AnimatedContentScope) obj, ((Boolean) obj2).booleanValue(), (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composer, 54), composer, 1597824, 42);
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
    public static final Unit EntriesScreen$lambda$6$0$0$0(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform EntriesScreen$lambda$6$0$1$0(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EntriesScreen$lambda$6$0$2(final List list, final Function1 function1, final Function1 function2, final Function1 function3, AnimatedContentScope AnimatedContent, boolean z, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        ComposerKt.sourceInformation(composer, "CN(empty):EntriesScreen.kt#8qvhv2");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2105124684, i, -1, "com.zhawoilah.wgxt.ui.screens.EntriesScreen.<anonymous>.<anonymous>.<anonymous> (EntriesScreen.kt:119)");
        }
        if (z) {
            composer.startReplaceGroup(1343040937);
            ComposerKt.sourceInformation(composer, "122@4964L38,120@4863L221");
            CommonKt.MessageState(SearchOffKt.getSearchOff(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(R.string.entries_empty, composer, 0), null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 3072, 20);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1343322417);
            ComposerKt.sourceInformation(composer, "130@5361L526,126@5130L757");
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            PaddingValues paddingValuesM919PaddingValues0680j_4 = PaddingKt.m919PaddingValues0680j_4(Dp.m8224constructorimpl(16));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM781spacedBy0680j_4 = Arrangement.INSTANCE.m781spacedBy0680j_4(Dp.m8224constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart(composer, -95206526, "CC(remember):EntriesScreen.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(list) | composer.changed(function1) | composer.changed(function2) | composer.changed(function3);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EntriesScreenKt.EntriesScreen$lambda$6$0$2$0$0(list, function1, function2, function3, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, paddingValuesM919PaddingValues0680j_4, false, horizontalOrVerticalM781spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer, 24966, 490);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EntriesScreen$lambda$6$0$2$0$0(final List list, final Function1 function1, final Function1 function2, final Function1 function3, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function4 = new Function1() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EntriesScreenKt.EntriesScreen$lambda$6$0$2$0$0$0((RowItem) obj);
            }
        };
        final EntriesScreenKt$EntriesScreen$lambda$6$0$2$0$0$$inlined$items$default$1 entriesScreenKt$EntriesScreen$lambda$6$0$2$0$0$$inlined$items$default$1 = new Function1() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$EntriesScreen$lambda$6$0$2$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(RowItem rowItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((RowItem) obj);
            }
        };
        LazyColumn.items(list.size(), new Function1<Integer, Object>() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$EntriesScreen$lambda$6$0$2$0$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function4.invoke(list.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$EntriesScreen$lambda$6$0$2$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return entriesScreenKt$EntriesScreen$lambda$6$0$2$0$0$$inlined$items$default$1.invoke(list.get(i));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$EntriesScreen$lambda$6$0$2$0$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                ComposerKt.sourceInformation(composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final RowItem rowItem = (RowItem) list.get(i);
                composer.startReplaceGroup(1094668249);
                ComposerKt.sourceInformation(composer, "CN(row)*137@5777L31,132@5465L374:EntriesScreen.kt#8qvhv2");
                String keyName = rowItem.getEntry().getKeyName();
                boolean zIsHashOnly = rowItem.getEntry().isHashOnly();
                String str = (String) function1.invoke(Integer.valueOf(rowItem.getEntryIndex()));
                boolean zBooleanValue = ((Boolean) function2.invoke(Integer.valueOf(rowItem.getEntryIndex()))).booleanValue();
                ComposerKt.sourceInformationMarkerStart(composer, -934509805, "CC(remember):EntriesScreen.kt#9igjgp");
                boolean zChanged = composer.changed(function3) | composer.changed(rowItem);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function5 = function3;
                    objRememberedValue = (Function0) new Function0<Unit>() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$EntriesScreen$2$1$3$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function5.invoke(Integer.valueOf(rowItem.getEntryIndex()));
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                EntriesScreenKt.EntryCard(keyName, zIsHashOnly, str, zBooleanValue, (Function0) objRememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object EntriesScreen$lambda$6$0$2$0$0$0(RowItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getEntryIndex());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EntryCard(final String str, final boolean z, final String str2, final boolean z2, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Function0<Unit> function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(1034959126);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(EntryCard)N(keyName,isHashOnly,text,edited,onClick)159@6231L1950,155@6092L2089:EntriesScreen.kt#8qvhv2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function1 = function0;
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        } else {
            function1 = function0;
        }
        if (!composerStartRestartGroup.shouldExecute((i2 & 9363) != 9362, i2 & 1)) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1034959126, i2, -1, "com.zhawoilah.wgxt.ui.screens.EntryCard (EntriesScreen.kt:154)");
            }
            CommonKt.m8881PressableCardfWhpE4E(function1, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, PaddingKt.m919PaddingValues0680j_4(Dp.m8224constructorimpl(16)), ComposableLambdaKt.rememberComposableLambda(-77346605, true, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EntriesScreenKt.EntryCard$lambda$0(str2, z, str, z2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 12) & 14) | 221232, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.EntriesScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EntriesScreenKt.EntryCard$lambda$1(str, z, str2, z2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EntryCard$lambda$0(String str, boolean z, String str2, boolean z2, Composer composer, int i) {
        String str3;
        char c;
        char c2;
        byte b;
        ComposerKt.sourceInformation(composer, "C160@6241L1934:EntriesScreen.kt#8qvhv2");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-77346605, i, -1, "com.zhawoilah.wgxt.ui.screens.EntryCard.<anonymous> (EntriesScreen.kt:160)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            ComposerKt.sourceInformationMarkerStart(composer, 1397204983, "C161@6262L1583,197@7858L29,200@7988L10,201@8049L11,198@7900L265:EntriesScreen.kt#8qvhv2");
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer, 48);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion2);
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
            Updater.m4648setimpl(composerM4640constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4648setimpl(composerM4640constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4644initimpl(composerM4640constructorimpl2, Integer.valueOf(iHashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4646reconcileimpl(composerM4640constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4648setimpl(composerM4640constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, -1061262865, "C173@6775L10,174@6840L11,171@6698L375:EntriesScreen.kt#8qvhv2");
            if (z) {
                composer.startReplaceGroup(-1061283140);
                ComposerKt.sourceInformation(composer, "166@6514L11,163@6370L244,169@6635L28");
                c2 = 6;
                c = 4;
                str3 = "C101@5233L9:Row.kt#2w3rfo";
                b = -1067591671;
                IconKt.m2550Iconww6aTOc(TagKt.getTag(Icons.Filled.INSTANCE), (String) null, SizeKt.m974size3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(15)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getTertiary(), composer, 432, 0);
                SpacerKt.Spacer(SizeKt.m979width3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(4)), composer, 6);
            } else {
                str3 = "C101@5233L9:Row.kt#2w3rfo";
                c = 4;
                c2 = 6;
                b = -1067591671;
                composer.startReplaceGroup(-1067591671);
            }
            composer.endReplaceGroup();
            TextKt.m3256TextNvy7gAk(str2, RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), null, 0L, null, null, FontFamily.INSTANCE.getMonospace(), 0L, null, null, 0L, TextOverflow.INSTANCE.m8160getEllipsisgIe3tQ8(), false, 1, 0, null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelLarge(), composer, 0, 24960, 110456);
            Composer composer2 = composer;
            if (z2) {
                composer2.startReplaceGroup(-1060522896);
                ComposerKt.sourceInformation(composer2, "181@7124L689");
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                Modifier.Companion companion3 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, companion3);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM4640constructorimpl3 = Updater.m4640constructorimpl(composer2);
                Updater.m4648setimpl(composerM4640constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4648setimpl(composerM4640constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m4644initimpl(composerM4640constructorimpl3, Integer.valueOf(iHashCode3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m4646reconcileimpl(composerM4640constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m4648setimpl(composerM4640constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, str3);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer2, 2044644339, "C185@7361L11,182@7202L266,188@7493L28,190@7580L39,191@7671L10,192@7744L11,189@7546L245:EntriesScreen.kt#8qvhv2");
                IconKt.m2550Iconww6aTOc(CircleKt.getCircle(Icons.Filled.INSTANCE), (String) null, SizeKt.m974size3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(8)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getTertiary(), composer2, 432, 0);
                SpacerKt.Spacer(SizeKt.m979width3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(4)), composer2, 6);
                TextKt.m3256TextNvy7gAk(StringResources_androidKt.stringResource(R.string.entries_edited, composer2, 0), null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getTertiary(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelSmall(), composer, 0, 0, 131066);
                composer2 = composer;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
            } else {
                composer2.startReplaceGroup(-1067591671);
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(6)), composer2, 6);
            String str4 = str;
            if (str4.length() == 0) {
                str4 = "(empty)";
            }
            TextKt.m3256TextNvy7gAk(str4, null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface(), null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8160getEllipsisgIe3tQ8(), false, 3, 0, null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer, 0, 24960, 110586);
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
}
