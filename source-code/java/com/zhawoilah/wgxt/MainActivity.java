package com.zhawoilah.wgxt;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.zhawoilah.wgxt.ui.WazzAppKt;
import com.zhawoilah.wgxt.ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/zhawoilah/wgxt/MainActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class MainActivity extends ComponentActivity {
    public static final int $stable = 8;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Object objM8923constructorimpl;
        super.onCreate(savedInstanceState);
        MainActivity mainActivity = this;
        EdgeToEdge.enable$default(mainActivity, null, null, 3, null);
        try {
            Result.Companion companion = Result.INSTANCE;
            MainActivity mainActivity2 = this;
            String str = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
            if (str == null) {
                str = "1.0";
            }
            objM8923constructorimpl = Result.m8923constructorimpl(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8923constructorimpl = Result.m8923constructorimpl(ResultKt.createFailure(th));
        }
        final String str2 = (String) (Result.m8929isFailureimpl(objM8923constructorimpl) ? "1.0" : objM8923constructorimpl);
        ComponentActivityKt.setContent$default(mainActivity, null, ComposableLambdaKt.composableLambdaInstance(68645455, true, new Function2() { // from class: com.zhawoilah.wgxt.MainActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainActivity.onCreate$lambda$1(str2, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(final String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C22@793L354,22@783L364:MainActivity.kt#ueo3o7");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(68645455, i, -1, "com.zhawoilah.wgxt.MainActivity.onCreate.<anonymous> (MainActivity.kt:22)");
            }
            ThemeKt.WazzTheme(false, false, ComposableLambdaKt.rememberComposableLambda(1831879709, true, new Function2() { // from class: com.zhawoilah.wgxt.MainActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivity.onCreate$lambda$1$0(str, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0(final String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C25@917L11,26@959L174,23@811L322:MainActivity.kt#ueo3o7");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1831879709, i, -1, "com.zhawoilah.wgxt.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:23)");
            }
            SurfaceKt.m3084SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-744874184, true, new Function2() { // from class: com.zhawoilah.wgxt.MainActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivity.onCreate$lambda$1$0$0(str, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 12582918, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0$0(String str, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C29@1081L11,27@981L134:MainActivity.kt#ueo3o7");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-744874184, i, -1, "com.zhawoilah.wgxt.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:27)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 1435451523, "CC(remember):MainActivity.kt#9igjgp");
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.zhawoilah.wgxt.MainActivity$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MainActivity.onCreate$lambda$1$0$0$0$0((byte[]) obj, (String) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            WazzAppKt.WazzApp(str, (Function2) objRememberedValue, composer, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0$0$0$0(byte[] bArr, String str) {
        Intrinsics.checkNotNullParameter(bArr, "<unused var>");
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }
}
