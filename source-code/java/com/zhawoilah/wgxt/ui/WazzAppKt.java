package com.zhawoilah.wgxt.ui;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.WarningKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.zhawoilah.wgxt.R;
import com.zhawoilah.wgxt.data.GxtDocument;
import com.zhawoilah.wgxt.data.GxtTable;
import com.zhawoilah.wgxt.ui.components.CommonKt;
import com.zhawoilah.wgxt.ui.screens.AboutScreenKt;
import com.zhawoilah.wgxt.ui.screens.EntriesScreenKt;
import com.zhawoilah.wgxt.ui.screens.HomeScreenKt;
import com.zhawoilah.wgxt.ui.screens.TablesScreenKt;
import com.zhawoilah.wgxt.viewmodel.GxtViewModel;
import com.zhawoilah.wgxt.viewmodel.LoadState;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: WazzApp.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0003X\u008a\u0084\u0002²\u0006\u0016\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0014X\u008a\u0084\u0002²\u0006\u0010\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016X\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002²\u0006\u0018\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u008a\u008e\u0002"}, d2 = {"WazzApp", "", "versionName", "", "onExportBytes", "Lkotlin/Function2;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "queryName", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "app_release", "loadState", "Lcom/zhawoilah/wgxt/viewmodel/LoadState;", "document", "Lcom/zhawoilah/wgxt/data/GxtDocument;", "fileName", "edits", "", "recent", "", "screen", "Lcom/zhawoilah/wgxt/ui/Screen;", "editing", "Lkotlin/Pair;", ""}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class WazzAppKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$20(String str, Function2 function2, int i, Composer composer, int i2) {
        WazzApp(str, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v16 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void WazzApp(final java.lang.String r37, final kotlin.jvm.functions.Function2<? super byte[], ? super java.lang.String, kotlin.Unit> r38, androidx.compose.runtime.Composer r39, final int r40) {
        /*
            Method dump skipped, instruction units count: 1675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zhawoilah.wgxt.ui.WazzAppKt.WazzApp(java.lang.String, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen WazzApp$lambda$7(MutableState<Screen> mutableState) {
        return mutableState.getValue();
    }

    private static final Pair<Integer, Integer> WazzApp$lambda$10(MutableState<Pair<Integer, Integer>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$12$0(GxtViewModel gxtViewModel, MutableState mutableState) {
        Screen screenWazzApp$lambda$7 = WazzApp$lambda$7(mutableState);
        if (!(screenWazzApp$lambda$7 instanceof Screen.About)) {
            if (!(screenWazzApp$lambda$7 instanceof Screen.Entries)) {
                if (screenWazzApp$lambda$7 instanceof Screen.Tables) {
                    gxtViewModel.closeDocument();
                    mutableState.setValue(Screen.Home.INSTANCE);
                } else if (!(screenWazzApp$lambda$7 instanceof Screen.Home)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                mutableState.setValue(Screen.Tables.INSTANCE);
            }
        } else {
            mutableState.setValue(Screen.Home.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$13$0(Context context, GxtViewModel gxtViewModel, Uri uri) {
        if (uri != null) {
            gxtViewModel.openUri(uri, queryName(context, uri));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$14$0(GxtViewModel gxtViewModel, CoroutineScope coroutineScope, Context context, SnackbarHostState snackbarHostState, String str, String str2, Uri uri) {
        Object objM8923constructorimpl;
        Unit unit;
        if (uri != null) {
            byte[] bArrBuildExportBytes = gxtViewModel.buildExportBytes();
            if (bArrBuildExportBytes == null) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WazzAppKt$WazzApp$createLauncher$1$1$4(snackbarHostState, str2, null), 3, null);
            } else {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uri);
                    if (outputStreamOpenOutputStream != null) {
                        OutputStream outputStream = outputStreamOpenOutputStream;
                        try {
                            outputStream.write(bArrBuildExportBytes);
                            Unit unit2 = Unit.INSTANCE;
                            CloseableKt.closeFinally(outputStream, null);
                            unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                CloseableKt.closeFinally(outputStream, th);
                                throw th2;
                            }
                        }
                    } else {
                        unit = null;
                    }
                    objM8923constructorimpl = Result.m8923constructorimpl(unit);
                } catch (Throwable th3) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM8923constructorimpl = Result.m8923constructorimpl(ResultKt.createFailure(th3));
                }
                if (Result.m8930isSuccessimpl(objM8923constructorimpl)) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WazzAppKt$WazzApp$createLauncher$1$1$2$1(snackbarHostState, str, null), 3, null);
                }
                if (Result.m8926exceptionOrNullimpl(objM8923constructorimpl) != null) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WazzAppKt$WazzApp$createLauncher$1$1$3$1(snackbarHostState, str2, null), 3, null);
                }
                Result.m8922boximpl(objM8923constructorimpl);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform WazzApp$lambda$16$0$0(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if ((AnimatedContent.getInitialState() instanceof Screen.Home) || ((AnimatedContent.getInitialState() instanceof Screen.Tables) && (AnimatedContent.getTargetState() instanceof Screen.Entries))) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(320, 0, null, 6, null), new Function1() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(WazzAppKt.WazzApp$lambda$16$0$0$0(((Integer) obj).intValue()));
                }
            }).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(320, 0, null, 6, null), 0.0f, 2, null)), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(320, 0, null, 6, null), new Function1() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(WazzAppKt.WazzApp$lambda$16$0$0$1(((Integer) obj).intValue()));
                }
            }).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null)));
        }
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(320, 0, null, 6, null), new Function1() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(WazzAppKt.WazzApp$lambda$16$0$0$2(((Integer) obj).intValue()));
            }
        }).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(320, 0, null, 6, null), 0.0f, 2, null)), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(320, 0, null, 6, null), new Function1() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(WazzAppKt.WazzApp$lambda$16$0$0$3(((Integer) obj).intValue()));
            }
        }).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int WazzApp$lambda$16$0$0$0(int i) {
        return i / 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int WazzApp$lambda$16$0$0$1(int i) {
        return (-i) / 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int WazzApp$lambda$16$0$0$2(int i) {
        return (-i) / 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int WazzApp$lambda$16$0$0$3(int i) {
        return i / 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$16$1(final ManagedActivityResultLauncher managedActivityResultLauncher, final GxtViewModel gxtViewModel, String str, final State state, final ManagedActivityResultLauncher managedActivityResultLauncher2, State state2, final MutableState mutableState, State state3, State state4, final MutableState mutableState2, AnimatedContentScope AnimatedContent, final Screen current, Composer composer, int i) {
        List<GxtTable> tables;
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        Intrinsics.checkNotNullParameter(current, "current");
        ComposerKt.sourceInformation(composer, "CN(current):WazzApp.kt#c9lyh3");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1898014351, i, -1, "com.zhawoilah.wgxt.ui.WazzApp.<anonymous>.<anonymous> (WazzApp.kt:148)");
        }
        if (current instanceof Screen.Home) {
            composer.startReplaceGroup(1369312174);
            ComposerKt.sourceInformation(composer, "151@6048L39,152@6124L19,153@6175L25,149@5966L253");
            List<String> listWazzApp$lambda$5 = WazzApp$lambda$5(state2);
            ComposerKt.sourceInformationMarkerStart(composer, 1369314584, "CC(remember):WazzApp.kt#9igjgp");
            boolean zChangedInstance = composer.changedInstance(managedActivityResultLauncher);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WazzAppKt.WazzApp$lambda$16$1$0$0(managedActivityResultLauncher);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 1369316996, "CC(remember):WazzApp.kt#9igjgp");
            boolean zChangedInstance2 = composer.changedInstance(gxtViewModel);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WazzAppKt.WazzApp$lambda$16$1$1$0(gxtViewModel);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function1 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerStart(composer, 1369318634, "CC(remember):WazzApp.kt#9igjgp");
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WazzAppKt.WazzApp$lambda$16$1$2$0(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            HomeScreenKt.HomeScreen(listWazzApp$lambda$5, function0, function1, (Function0) objRememberedValue3, composer, 3072);
            composer.endReplaceGroup();
        } else if (current instanceof Screen.About) {
            composer.startReplaceGroup(1369321333);
            ComposerKt.sourceInformation(composer, "158@6345L24,156@6256L132");
            ComposerKt.sourceInformationMarkerStart(composer, 1369324073, "CC(remember):WazzApp.kt#9igjgp");
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WazzAppKt.WazzApp$lambda$16$1$3$0(mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            AboutScreenKt.AboutScreen(str, (Function0) objRememberedValue4, composer, 48);
            composer.endReplaceGroup();
        } else {
            boolean z = true;
            if (current instanceof Screen.Tables) {
                composer.startReplaceGroup(-500512429);
                ComposerKt.sourceInformation(composer, "");
                GxtDocument gxtDocumentWazzApp$lambda$2 = WazzApp$lambda$2(state3);
                if (gxtDocumentWazzApp$lambda$2 == null) {
                    composer.startReplaceGroup(-500461000);
                    ComposerKt.sourceInformation(composer, "166@6637L36,164@6530L233");
                    CommonKt.MessageState(WarningKt.getWarning(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(R.string.state_error, composer, 0), null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 3072, 20);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-500162222);
                    ComposerKt.sourceInformation(composer, "174@7011L135,178@7190L31,179@7262L215,170@6817L687");
                    String strWazzApp$lambda$3 = WazzApp$lambda$3(state);
                    int size = WazzApp$lambda$4(state4).size();
                    ComposerKt.sourceInformationMarkerStart(composer, 1369345496, "CC(remember):WazzApp.kt#9igjgp");
                    boolean zChangedInstance3 = composer.changedInstance(gxtViewModel);
                    Object objRememberedValue5 = composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda19
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WazzAppKt.WazzApp$lambda$16$1$4$0(gxtViewModel, mutableState);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue5);
                    }
                    Function0 function2 = (Function0) objRememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerStart(composer, 1369351120, "CC(remember):WazzApp.kt#9igjgp");
                    Object objRememberedValue6 = composer.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return WazzAppKt.WazzApp$lambda$16$1$5$0(mutableState, ((Integer) obj).intValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue6);
                    }
                    Function1 function3 = (Function1) objRememberedValue6;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerStart(composer, 1369353608, "CC(remember):WazzApp.kt#9igjgp");
                    boolean zChanged = composer.changed(state) | composer.changedInstance(managedActivityResultLauncher2);
                    Object objRememberedValue7 = composer.rememberedValue();
                    if (zChanged || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda21
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WazzAppKt.WazzApp$lambda$16$1$6$0(managedActivityResultLauncher2, state);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue7);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    TablesScreenKt.TablesScreen(gxtDocumentWazzApp$lambda$2, strWazzApp$lambda$3, size, function2, function3, (Function0) objRememberedValue7, composer, GxtDocument.$stable | 24576);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else {
                if (!(current instanceof Screen.Entries)) {
                    composer.startReplaceGroup(1369312920);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-499369924);
                ComposerKt.sourceInformation(composer, "");
                GxtDocument gxtDocumentWazzApp$lambda$3 = WazzApp$lambda$2(state3);
                GxtTable gxtTable = (gxtDocumentWazzApp$lambda$3 == null || (tables = gxtDocumentWazzApp$lambda$3.getTables()) == null) ? null : (GxtTable) CollectionsKt.getOrNull(tables, ((Screen.Entries) current).getTableIndex());
                if (gxtTable == null) {
                    composer.startReplaceGroup(-499236872);
                    ComposerKt.sourceInformation(composer, "193@7871L36,191@7764L233");
                    CommonKt.MessageState(WarningKt.getWarning(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(R.string.state_error, composer, 0), null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, composer, 3072, 20);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-498945720);
                    ComposerKt.sourceInformation(composer, "199@8147L55,200@8243L57,201@8339L26,202@8409L56,197@8051L441");
                    ComposerKt.sourceInformationMarkerStart(composer, 1369381768, "CC(remember):WazzApp.kt#9igjgp");
                    int i2 = (i & 112) ^ 48;
                    boolean zChangedInstance4 = composer.changedInstance(gxtViewModel) | ((i2 > 32 && composer.changedInstance(current)) || (i & 48) == 32);
                    Object objRememberedValue8 = composer.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function1() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return WazzAppKt.WazzApp$lambda$16$1$7$0(gxtViewModel, current, ((Integer) obj).intValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue8);
                    }
                    Function1 function4 = (Function1) objRememberedValue8;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerStart(composer, 1369384842, "CC(remember):WazzApp.kt#9igjgp");
                    boolean zChangedInstance5 = composer.changedInstance(gxtViewModel) | ((i2 > 32 && composer.changedInstance(current)) || (i & 48) == 32);
                    Object objRememberedValue9 = composer.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new Function1() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda23
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(WazzAppKt.WazzApp$lambda$16$1$8$0(gxtViewModel, current, ((Integer) obj).intValue()));
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue9);
                    }
                    Function1 function5 = (Function1) objRememberedValue9;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerStart(composer, 1369387883, "CC(remember):WazzApp.kt#9igjgp");
                    Object objRememberedValue10 = composer.rememberedValue();
                    if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return WazzAppKt.WazzApp$lambda$16$1$9$0(mutableState);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue10);
                    }
                    Function0 function6 = (Function0) objRememberedValue10;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerStart(composer, 1369390153, "CC(remember):WazzApp.kt#9igjgp");
                    if ((i2 <= 32 || !composer.changedInstance(current)) && (i & 48) != 32) {
                        z = false;
                    }
                    Object objRememberedValue11 = composer.rememberedValue();
                    if (z || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new Function1() { // from class: com.zhawoilah.wgxt.ui.WazzAppKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return WazzAppKt.WazzApp$lambda$16$1$10$0(current, mutableState2, ((Integer) obj).intValue());
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue11);
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    EntriesScreenKt.EntriesScreen(gxtTable, function4, function5, function6, (Function1) objRememberedValue11, composer, GxtTable.$stable | 3072);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            }
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$16$1$0$0(ManagedActivityResultLauncher managedActivityResultLauncher) {
        managedActivityResultLauncher.launch(new String[]{"*/*"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$16$1$1$0(GxtViewModel gxtViewModel) {
        gxtViewModel.openSample();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$16$1$2$0(MutableState mutableState) {
        mutableState.setValue(Screen.About.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$16$1$3$0(MutableState mutableState) {
        mutableState.setValue(Screen.Home.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$16$1$4$0(GxtViewModel gxtViewModel, MutableState mutableState) {
        gxtViewModel.closeDocument();
        mutableState.setValue(Screen.Home.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$16$1$5$0(MutableState mutableState, int i) {
        mutableState.setValue(new Screen.Entries(i));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$16$1$6$0(ManagedActivityResultLauncher managedActivityResultLauncher, State state) {
        String strSubstringBeforeLast = StringsKt.substringBeforeLast(WazzApp$lambda$3(state), '.', WazzApp$lambda$3(state));
        if (strSubstringBeforeLast.length() == 0) {
            strSubstringBeforeLast = "export";
        }
        managedActivityResultLauncher.launch(strSubstringBeforeLast + "_edited.gxt");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String WazzApp$lambda$16$1$7$0(GxtViewModel gxtViewModel, Screen screen, int i) {
        return gxtViewModel.textOf(((Screen.Entries) screen).getTableIndex(), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean WazzApp$lambda$16$1$8$0(GxtViewModel gxtViewModel, Screen screen, int i) {
        return gxtViewModel.isEdited(((Screen.Entries) screen).getTableIndex(), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$16$1$9$0(MutableState mutableState) {
        mutableState.setValue(Screen.Tables.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$16$1$10$0(Screen screen, MutableState mutableState, int i) {
        mutableState.setValue(TuplesKt.to(Integer.valueOf(((Screen.Entries) screen).getTableIndex()), Integer.valueOf(i)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$17$0(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$18$0(GxtViewModel gxtViewModel, int i, int i2, CoroutineScope coroutineScope, MutableState mutableState, SnackbarHostState snackbarHostState, String str, String newText) {
        Intrinsics.checkNotNullParameter(newText, "newText");
        gxtViewModel.setEdit(i, i2, newText);
        mutableState.setValue(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new WazzAppKt$WazzApp$5$1$1(snackbarHostState, str, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzApp$lambda$19$0(GxtViewModel gxtViewModel, int i, int i2) {
        gxtViewModel.resetEdit(i, i2);
        return Unit.INSTANCE;
    }

    private static final String queryName(Context context, Uri uri) {
        String string;
        String str = "file.gxt";
        try {
            Result.Companion companion = Result.INSTANCE;
            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
            Unit unit = null;
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                try {
                    Cursor cursor2 = cursor;
                    int columnIndex = cursor2.getColumnIndex("_display_name");
                    if (columnIndex >= 0 && cursor2.moveToFirst() && (string = cursor2.getString(columnIndex)) != null) {
                        str = string;
                    }
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(cursor, null);
                    unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(cursor, th);
                        throw th2;
                    }
                }
            }
            Result.m8923constructorimpl(unit);
            return str;
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8923constructorimpl(ResultKt.createFailure(th3));
            return str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LoadState WazzApp$lambda$1(State<? extends LoadState> state) {
        return state.getValue();
    }

    private static final GxtDocument WazzApp$lambda$2(State<GxtDocument> state) {
        return state.getValue();
    }

    private static final String WazzApp$lambda$3(State<String> state) {
        return state.getValue();
    }

    private static final Map<String, String> WazzApp$lambda$4(State<? extends Map<String, String>> state) {
        return state.getValue();
    }

    private static final List<String> WazzApp$lambda$5(State<? extends List<String>> state) {
        return state.getValue();
    }
}
