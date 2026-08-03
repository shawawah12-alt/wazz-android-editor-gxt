package com.zhawoilah.wgxt.ui.screens;

import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.SearchKt;
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

/* JADX INFO: compiled from: EntriesScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ComposableSingletons$EntriesScreenKt {
    public static final ComposableSingletons$EntriesScreenKt INSTANCE = new ComposableSingletons$EntriesScreenKt();

    /* JADX INFO: renamed from: lambda$-1706914998, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f127lambda$1706914998 = ComposableLambdaKt.composableLambdaInstance(-1706914998, false, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.ComposableSingletons$EntriesScreenKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$EntriesScreenKt.lambda__1706914998$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: lambda$-1183285590, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f126lambda$1183285590 = ComposableLambdaKt.composableLambdaInstance(-1183285590, false, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.ComposableSingletons$EntriesScreenKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$EntriesScreenKt.lambda__1183285590$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1238468169 = ComposableLambdaKt.composableLambdaInstance(1238468169, false, new Function2() { // from class: com.zhawoilah.wgxt.ui.screens.ComposableSingletons$EntriesScreenKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ComposableSingletons$EntriesScreenKt.lambda_1238468169$lambda$0((Composer) obj, ((Integer) obj2).intValue());
        }
    });

    /* JADX INFO: renamed from: getLambda$-1183285590$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8890getLambda$1183285590$app_release() {
        return f126lambda$1183285590;
    }

    /* JADX INFO: renamed from: getLambda$-1706914998$app_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m8891getLambda$1706914998$app_release() {
        return f127lambda$1706914998;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1238468169$app_release() {
        return lambda$1238468169;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1706914998$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C96@3898L36,96@3835L100:EntriesScreen.kt#8qvhv2");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1706914998, i, -1, "com.zhawoilah.wgxt.ui.screens.ComposableSingletons$EntriesScreenKt.lambda$-1706914998.<anonymous> (EntriesScreen.kt:96)");
            }
            IconKt.m2550Iconww6aTOc(ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), StringResources_androidKt.stringResource(R.string.action_back, composer, 0), (Modifier) null, 0L, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda__1183285590$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C109@4365L39,109@4360L45:EntriesScreen.kt#8qvhv2");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1183285590, i, -1, "com.zhawoilah.wgxt.ui.screens.ComposableSingletons$EntriesScreenKt.lambda$-1183285590.<anonymous> (EntriesScreen.kt:109)");
            }
            TextKt.m3256TextNvy7gAk(StringResources_androidKt.stringResource(R.string.entries_search, composer, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 262142);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit lambda_1238468169$lambda$0(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C110@4441L52:EntriesScreen.kt#8qvhv2");
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1238468169, i, -1, "com.zhawoilah.wgxt.ui.screens.ComposableSingletons$EntriesScreenKt.lambda$1238468169.<anonymous> (EntriesScreen.kt:110)");
            }
            IconKt.m2550Iconww6aTOc(SearchKt.getSearch(Icons.Filled.INSTANCE), (String) null, (Modifier) null, 0L, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
