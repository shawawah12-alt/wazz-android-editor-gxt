package com.zhawoilah.wgxt.ui.screens;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material.icons.filled.RestartAltKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import com.zhawoilah.wgxt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EditorSheet.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$EditorSheetKt {
    public static final ComposableSingletons$EditorSheetKt INSTANCE = new ComposableSingletons$EditorSheetKt();
    private static Function2<Composer, Integer, Unit> lambda$1983092705 = ComposableLambdaKt.composableLambdaInstance(1983092705, false, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.ComposableSingletons$EditorSheetKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$EditorSheetKt.lambda_1983092705$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$380809664 = ComposableLambdaKt.composableLambdaInstance(380809664, false, new Function3() { // from class: com.zhawoilah.wgxt.ui.screens.ComposableSingletons$EditorSheetKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$EditorSheetKt.lambda_380809664$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });
    private static Function3<RowScope, Composer, Integer, Unit> lambda$887234867 = ComposableLambdaKt.composableLambdaInstance(887234867, false, new Function3() { // from class: com.zhawoilah.wgxt.ui.screens.ComposableSingletons$EditorSheetKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$EditorSheetKt.lambda_887234867$lambda$0((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1983092705$app_release() {
        return lambda$1983092705;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$380809664$app_release() {
        return lambda$380809664;
    }

    public final Function3<RowScope, Composer, Integer, Unit> getLambda$887234867$app_release() {
        return lambda$887234867;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1983092705$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C139@5717L42,139@5712L48:EditorSheet.kt#8qvhv2");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1983092705, i, -1, "com.zhawoilah.wgxt.ui.screens.ComposableSingletons$EditorSheetKt.lambda$1983092705.<anonymous> (EditorSheet.kt:139)");
            }
            TextKt.m3256TextNvy7gAk(StringResources_androidKt.stringResource(R.string.editor_value_hint, composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_380809664$lambda$0(RowScope TextButton, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation(composer, "C187@7848L56,188@7925L28,189@7979L37,189@7974L43:EditorSheet.kt#8qvhv2");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(380809664, i, -1, "com.zhawoilah.wgxt.ui.screens.ComposableSingletons$EditorSheetKt.lambda$380809664.<anonymous> (EditorSheet.kt:187)");
            }
            IconKt.m2550Iconww6aTOc(RestartAltKt.getRestartAlt(Icons.Filled.INSTANCE), (String) null, (Modifier) null, 0L, composer, 48, 12);
            SpacerKt.Spacer(SizeKt.m979width3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(6)), composer, 6);
            TextKt.m3256TextNvy7gAk(StringResources_androidKt.stringResource(R.string.editor_reset, composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_887234867$lambda$0(RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation(composer, "C196@8251L51,197@8323L28,198@8377L36,198@8372L42:EditorSheet.kt#8qvhv2");
        if (!composer.shouldExecute((i & 17) != 16, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(887234867, i, -1, "com.zhawoilah.wgxt.ui.screens.ComposableSingletons$EditorSheetKt.lambda$887234867.<anonymous> (EditorSheet.kt:196)");
            }
            IconKt.m2550Iconww6aTOc(CheckKt.getCheck(Icons.Filled.INSTANCE), (String) null, (Modifier) null, 0L, composer, 48, 12);
            SpacerKt.Spacer(SizeKt.m979width3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(6)), composer, 6);
            TextKt.m3256TextNvy7gAk(StringResources_androidKt.stringResource(R.string.action_save, composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
