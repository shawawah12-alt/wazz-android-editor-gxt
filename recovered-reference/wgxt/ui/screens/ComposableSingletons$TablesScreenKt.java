package com.zhawoilah.wgxt.ui.screens;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.SaveAltKt;
import androidx.compose.material3.IconKt;
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

/* JADX INFO: compiled from: TablesScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$TablesScreenKt {
    public static final ComposableSingletons$TablesScreenKt INSTANCE = new ComposableSingletons$TablesScreenKt();

    /* JADX INFO: renamed from: lambda$-1906909214, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f133lambda$1906909214 = ComposableLambdaKt.composableLambdaInstance(-1906909214, false, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.ComposableSingletons$TablesScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$TablesScreenKt.lambda__1906909214$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-563948989, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f134lambda$563948989 = ComposableLambdaKt.composableLambdaInstance(-563948989, false, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.ComposableSingletons$TablesScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$TablesScreenKt.lambda__563948989$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1860665733 = ComposableLambdaKt.composableLambdaInstance(1860665733, false, new Function3() { // from class: com.zhawoilah.wgxt.ui.screens.ComposableSingletons$TablesScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            return ComposableSingletons$TablesScreenKt.lambda_1860665733$lambda$0((LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1906909214$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8899getLambda$1906909214$app_release() {
        return f133lambda$1906909214;
    }

    /* JADX INFO: renamed from: getLambda$-563948989$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8900getLambda$563948989$app_release() {
        return f134lambda$563948989;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1860665733$app_release() {
        return lambda$1860665733;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1906909214$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C80@3554L36,78@3434L183:TablesScreen.kt#8qvhv2");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1906909214, i, -1, "com.zhawoilah.wgxt.ui.screens.ComposableSingletons$TablesScreenKt.lambda$-1906909214.<anonymous> (TablesScreen.kt:78)");
            }
            IconKt.m2550Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), StringResources_androidKt.stringResource(R.string.action_back, composer, 0), (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__563948989$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C93@3998L53:TablesScreen.kt#8qvhv2");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-563948989, i, -1, "com.zhawoilah.wgxt.ui.screens.ComposableSingletons$TablesScreenKt.lambda$-563948989.<anonymous> (TablesScreen.kt:93)");
            }
            IconKt.m2550Iconww6aTOc(SaveAltKt.getSaveAlt(Icons.Filled.INSTANCE), (String) null, (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1860665733$lambda$0(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation(composer, "C118@5010L30:TablesScreen.kt#8qvhv2");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1860665733, i, -1, "com.zhawoilah.wgxt.ui.screens.ComposableSingletons$TablesScreenKt.lambda$1860665733.<anonymous> (TablesScreen.kt:118)");
            }
            SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(72)), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
