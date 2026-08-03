package com.zhawoilah.wgxt.ui.screens;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
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
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.HistoryKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import com.zhawoilah.wgxt.ui.components.CommonKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HomeScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001aE\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007¢\u0006\u0002\u0010\t\u001a\u001b\u0010\n\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0003¢\u0006\u0002\u0010\f\u001a\u001b\u0010\r\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0003¢\u0006\u0002\u0010\f\u001a\u0015\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"HomeScreen", "", "recent", "", "", "onOpenFile", "Lkotlin/Function0;", "onOpenSample", "onAbout", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "OpenCard", "onClick", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SampleRow", "RecentRow", HintConstants.AUTOFILL_HINT_NAME, "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class HomeScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$2(List list, Function0 function0, Function0 function1, Function0 function2, int i, Composer composer, int i2) {
        HomeScreen(list, function0, function1, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OpenCard$lambda$0(Function0 function0, int i, Composer composer, int i2) {
        OpenCard(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecentRow$lambda$1(String str, int i, Composer composer, int i2) {
        RecentRow(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SampleRow$lambda$0(Function0 function0, int i, Composer composer, int i2) {
        SampleRow(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void HomeScreen(final List<String> recent, final Function0<Unit> onOpenFile, final Function0<Unit> onOpenSample, final Function0<Unit> onAbout, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(recent, "recent");
        Intrinsics.checkNotNullParameter(onOpenFile, "onOpenFile");
        Intrinsics.checkNotNullParameter(onOpenSample, "onOpenSample");
        Intrinsics.checkNotNullParameter(onAbout, "onAbout");
        Composer composerStartRestartGroup = composer.startRestartGroup(406627588);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(HomeScreen)N(recent,onOpenFile,onOpenSample,onAbout)55@2278L1195,85@3481L1257,54@2251L2487:HomeScreen.kt#8qvhv2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(recent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onOpenFile) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onOpenSample) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onAbout) ? 2048 : 1024;
        }
        if (!composerStartRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(406627588, i2, -1, "com.zhawoilah.wgxt.ui.screens.HomeScreen (HomeScreen.kt:53)");
            }
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m2873ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(461544128, true, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.HomeScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenKt.HomeScreen$lambda$0(onAbout, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1128802603, true, new Function3() { // from class: com.zhawoilah.wgxt.ui.screens.HomeScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.HomeScreen$lambda$1(onOpenFile, onOpenSample, recent, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.HomeScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenKt.HomeScreen$lambda$2(recent, onOpenFile, onOpenSample, onAbout, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$0(final Function0 function0, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C75@3165L283,56@2292L1171:HomeScreen.kt#8qvhv2");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(461544128, i, -1, "com.zhawoilah.wgxt.ui.screens.HomeScreen.<anonymous> (HomeScreen.kt:56)");
            }
            AppBarKt.m2018TopAppBarGHTll3U(ComposableSingletons$HomeScreenKt.INSTANCE.m8896getLambda$1934085500$app_release(), null, null, ComposableLambdaKt.rememberComposableLambda(81875503, true, new Function3() { // from class: com.zhawoilah.wgxt.ui.screens.HomeScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return HomeScreenKt.HomeScreen$lambda$0$0(function0, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), 0.0f, null, null, null, composer, 3078, 246);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$0$0(Function0 function0, RowScope TopAppBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation(composer, "C76@3187L243:HomeScreen.kt#8qvhv2");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(81875503, i, -1, "com.zhawoilah.wgxt.ui.screens.HomeScreen.<anonymous>.<anonymous> (HomeScreen.kt:76)");
            }
            IconButtonKt.IconButton(function0, null, false, null, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m8898getLambda$898831535$app_release(), composer, 1572864, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$1(final Function0 function0, final Function0 function1, final List list, PaddingValues padding, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(padding, "padding");
        ComposerKt.sourceInformation(composer, "CN(padding)90@3751L981,86@3502L1230:HomeScreen.kt#8qvhv2");
        if ((i & 6) == 0) {
            i2 = i | (composer.changed(padding) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composer.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1128802603, i2, -1, "com.zhawoilah.wgxt.ui.screens.HomeScreen.<anonymous> (HomeScreen.kt:86)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), padding);
            float f = 20;
            PaddingValues paddingValuesM922PaddingValuesa9UjIt4 = PaddingKt.m922PaddingValuesa9UjIt4(Dp.m8224constructorimpl(f), Dp.m8224constructorimpl(8), Dp.m8224constructorimpl(f), Dp.m8224constructorimpl(28));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM781spacedBy0680j_4 = Arrangement.INSTANCE.m781spacedBy0680j_4(Dp.m8224constructorimpl(14));
            ComposerKt.sourceInformationMarkerStart(composer, 1847434026, "CC(remember):HomeScreen.kt#9igjgp");
            boolean zChanged = composer.changed(function0) | composer.changed(function1) | composer.changedInstance(list);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.zhawoilah.wgxt.ui.screens.HomeScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeScreenKt.HomeScreen$lambda$1$0$0(list, function0, function1, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            LazyDslKt.LazyColumn(modifierPadding, null, paddingValuesM922PaddingValuesa9UjIt4, false, horizontalOrVerticalM781spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer, 24576, 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$1$0$0(final List list, final Function0 function0, final Function0 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1242655658, true, new Function3() { // from class: com.zhawoilah.wgxt.ui.screens.HomeScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$1$0$0$0(function0, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1127618079, true, new Function3() { // from class: com.zhawoilah.wgxt.ui.screens.HomeScreenKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return HomeScreenKt.HomeScreen$lambda$1$0$0$1(function1, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.getLambda$138452706$app_release(), 3, null);
        if (list.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$HomeScreenKt.INSTANCE.m8894getLambda$10057723$app_release(), 3, null);
        } else {
            final HomeScreenKt$HomeScreen$lambda$1$0$0$$inlined$items$default$1 homeScreenKt$HomeScreen$lambda$1$0$0$$inlined$items$default$1 = new Function1() { // from class: com.zhawoilah.wgxt.ui.screens.HomeScreenKt$HomeScreen$lambda$1$0$0$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(String str) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((String) obj);
                }
            };
            LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.zhawoilah.wgxt.ui.screens.HomeScreenKt$HomeScreen$lambda$1$0$0$$inlined$items$default$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int i) {
                    return homeScreenKt$HomeScreen$lambda$1$0$0$$inlined$items$default$1.invoke(list.get(i));
                }
            }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.zhawoilah.wgxt.ui.screens.HomeScreenKt$HomeScreen$lambda$1$0$0$$inlined$items$default$4
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
                    String str = (String) list.get(i);
                    composer.startReplaceGroup(-55945572);
                    ComposerKt.sourceInformation(composer, "CN(name)*116@4684L22:HomeScreen.kt#8qvhv2");
                    HomeScreenKt.RecentRow(str, composer, 0);
                    composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$1$0$0$0(Function0 function0, LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C92@3788L30:HomeScreen.kt#8qvhv2");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1242655658, i, -1, "com.zhawoilah.wgxt.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:92)");
            }
            OpenCard(function0, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HomeScreen$lambda$1$0$0$1(Function0 function0, LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C95@3860L33:HomeScreen.kt#8qvhv2");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1127618079, i, -1, "com.zhawoilah.wgxt.ui.screens.HomeScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeScreen.kt:95)");
            }
            SampleRow(function0, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void OpenCard(Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1684500163);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(OpenCard)N(onClick)127@4918L11,124@4802L1593:HomeScreen.kt#8qvhv2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            function1 = function0;
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1684500163, i2, -1, "com.zhawoilah.wgxt.ui.screens.OpenCard (HomeScreen.kt:123)");
            }
            function1 = function0;
            CommonKt.m8881PressableCardfWhpE4E(function1, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getPrimaryContainer(), PaddingKt.m919PaddingValues0680j_4(Dp.m8224constructorimpl(20)), ComposableSingletons$HomeScreenKt.INSTANCE.m8895getLambda$1829101510$app_release(), composerStartRestartGroup, (i2 & 14) | 221232, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.HomeScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenKt.OpenCard$lambda$0(function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SampleRow(Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-285701565);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(SampleRow)N(onClick)169@6460L908:HomeScreen.kt#8qvhv2");
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            function1 = function0;
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-285701565, i2, -1, "com.zhawoilah.wgxt.ui.screens.SampleRow (HomeScreen.kt:168)");
            }
            function1 = function0;
            CommonKt.m8881PressableCardfWhpE4E(function1, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, 0L, PaddingKt.m919PaddingValues0680j_4(Dp.m8224constructorimpl(16)), ComposableSingletons$HomeScreenKt.INSTANCE.m8897getLambda$473376026$app_release(), composerStartRestartGroup, (i2 & 14) | 221232, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.HomeScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenKt.SampleRow$lambda$0(function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RecentRow(final String str, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1061015603);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(RecentRow)N(name)201@7519L6,202@7572L11,198@7426L710:HomeScreen.kt#8qvhv2");
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (!composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1061015603, i2, -1, "com.zhawoilah.wgxt.ui.screens.RecentRow (HomeScreen.kt:197)");
            }
            Modifier modifierM926padding3ABfNKs = PaddingKt.m926padding3ABfNKs(BackgroundKt.m297backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getMedium()), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainer(), null, 2, null), Dp.m8224constructorimpl(14));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM926padding3ABfNKs);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4640constructorimpl = Updater.m4640constructorimpl(composerStartRestartGroup);
            Updater.m4648setimpl(composerM4640constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4648setimpl(composerM4640constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4644initimpl(composerM4640constructorimpl, Integer.valueOf(iHashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4646reconcileimpl(composerM4640constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4648setimpl(composerM4640constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -867884889, "C208@7788L11,209@7856L11,206@7703L219,212@7931L29,215@8027L10,213@7969L161:HomeScreen.kt#8qvhv2");
            CommonKt.m8880IconBadgeDTcfvLk(HistoryKt.getHistory(Icons.Filled.INSTANCE), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainerHigh(), null, 36, composerStartRestartGroup, 24576, 8);
            SpacerKt.Spacer(SizeKt.m979width3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(12)), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            TextKt.m3256TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8160getEllipsisgIe3tQ8(), false, 1, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyLarge(), composer2, i2 & 14, 24960, 110590);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.HomeScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreenKt.RecentRow$lambda$1(str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
