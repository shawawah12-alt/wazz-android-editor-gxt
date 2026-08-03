package com.zhawoilah.wgxt.ui;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: WazzApp.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "com.zhawoilah.wgxt.ui.WazzAppKt$WazzApp$createLauncher$1$1$3$1", f = "WazzApp.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {}, v = 1)
final class WazzAppKt$WazzApp$createLauncher$1$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $exportErrorMsg;
    final /* synthetic */ SnackbarHostState $snackbar;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WazzAppKt$WazzApp$createLauncher$1$1$3$1(SnackbarHostState snackbarHostState, String str, Continuation<? super WazzAppKt$WazzApp$createLauncher$1$1$3$1> continuation) {
        super(2, continuation);
        this.$snackbar = snackbarHostState;
        this.$exportErrorMsg = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WazzAppKt$WazzApp$createLauncher$1$1$3$1(this.$snackbar, this.$exportErrorMsg, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WazzAppKt$WazzApp$createLauncher$1$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (SnackbarHostState.showSnackbar$default(this.$snackbar, this.$exportErrorMsg, null, false, null, this, 14, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
