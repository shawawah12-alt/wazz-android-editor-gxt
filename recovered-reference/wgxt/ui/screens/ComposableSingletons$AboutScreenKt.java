package com.zhawoilah.wgxt.ui.screens;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.zhawoilah.wgxt.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AboutScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$AboutScreenKt {
    public static final ComposableSingletons$AboutScreenKt INSTANCE = new ComposableSingletons$AboutScreenKt();
    private static Function2<Composer, Integer, Unit> lambda$1099782895 = ComposableLambdaKt.composableLambdaInstance(1099782895, false, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.ComposableSingletons$AboutScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$AboutScreenKt.lambda_1099782895$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1830235023 = ComposableLambdaKt.composableLambdaInstance(1830235023, false, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.ComposableSingletons$AboutScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$AboutScreenKt.lambda_1830235023$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$1099782895$app_release() {
        return lambda$1099782895;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1830235023$app_release() {
        return lambda$1830235023;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1099782895$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C58@2399L36,58@2394L42:AboutScreen.kt#8qvhv2");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1099782895, i, -1, "com.zhawoilah.wgxt.ui.screens.ComposableSingletons$AboutScreenKt.lambda$1099782895.<anonymous> (AboutScreen.kt:58)");
            }
            TextKt.m3256TextNvy7gAk(StringResources_androidKt.stringResource(R.string.about_title, composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1830235023$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C61@2613L36,61@2550L100:AboutScreen.kt#8qvhv2");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1830235023, i, -1, "com.zhawoilah.wgxt.ui.screens.ComposableSingletons$AboutScreenKt.lambda$1830235023.<anonymous> (AboutScreen.kt:61)");
            }
            IconKt.m2550Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), StringResources_androidKt.stringResource(R.string.action_back, composer, 0), (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
