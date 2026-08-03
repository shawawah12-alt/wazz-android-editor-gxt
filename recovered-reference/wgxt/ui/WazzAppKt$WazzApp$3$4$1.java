package com.zhawoilah.wgxt.ui;

import android.content.Context;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.zhawoilah.wgxt.R;
import com.zhawoilah.wgxt.viewmodel.GxtViewModel;
import com.zhawoilah.wgxt.viewmodel.LoadState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: WazzApp.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "com.zhawoilah.wgxt.ui.WazzAppKt$WazzApp$3$4$1", f = "WazzApp.kt", i = {0}, l = {224}, m = "invokeSuspend", n = {"st"}, s = {"L$0"}, v = 1)
final class WazzAppKt$WazzApp$3$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ State<LoadState> $loadState$delegate;
    final /* synthetic */ MutableState<Screen> $screen$delegate;
    final /* synthetic */ SnackbarHostState $snackbar;
    final /* synthetic */ GxtViewModel $vm;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WazzAppKt$WazzApp$3$4$1(SnackbarHostState snackbarHostState, Context context, GxtViewModel gxtViewModel, State<? extends LoadState> state, MutableState<Screen> mutableState, Continuation<? super WazzAppKt$WazzApp$3$4$1> continuation) {
        super(2, continuation);
        this.$snackbar = snackbarHostState;
        this.$context = context;
        this.$vm = gxtViewModel;
        this.$loadState$delegate = state;
        this.$screen$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WazzAppKt$WazzApp$3$4$1(this.$snackbar, this.$context, this.$vm, this.$loadState$delegate, this.$screen$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WazzAppKt$WazzApp$3$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LoadState loadStateWazzApp$lambda$1 = WazzAppKt.WazzApp$lambda$1(this.$loadState$delegate);
            if (loadStateWazzApp$lambda$1 instanceof LoadState.Error) {
                SnackbarHostState snackbarHostState = this.$snackbar;
                String string = ((LoadState.Error) loadStateWazzApp$lambda$1).getFormatIssue() ? this.$context.getString(R.string.state_error_format) : this.$context.getString(R.string.state_error);
                Intrinsics.checkNotNull(string);
                this.L$0 = SpillingKt.nullOutSpilledVariable(loadStateWazzApp$lambda$1);
                this.label = 1;
                if (SnackbarHostState.showSnackbar$default(snackbarHostState, string, null, false, null, this, 14, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$vm.closeDocument();
        this.$screen$delegate.setValue(Screen.Home.INSTANCE);
        return Unit.INSTANCE;
    }
}
