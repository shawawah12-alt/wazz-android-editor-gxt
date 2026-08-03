package com.zhawoilah.wgxt.viewmodel;

import android.net.Uri;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.zhawoilah.wgxt.data.GxtDocument;
import com.zhawoilah.wgxt.data.GxtGame;
import com.zhawoilah.wgxt.data.GxtParser;
import java.io.InputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: GxtViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/zhawoilah/wgxt/data/GxtDocument;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "com.zhawoilah.wgxt.viewmodel.GxtViewModel$openUri$1$doc$1", f = "GxtViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
final class GxtViewModel$openUri$1$doc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super GxtDocument>, Object> {
    final /* synthetic */ Uri $uri;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GxtViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GxtViewModel$openUri$1$doc$1(GxtViewModel gxtViewModel, Uri uri, Continuation<? super GxtViewModel$openUri$1$doc$1> continuation) {
        super(2, continuation);
        this.this$0 = gxtViewModel;
        this.$uri = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GxtViewModel$openUri$1$doc$1 gxtViewModel$openUri$1$doc$1 = new GxtViewModel$openUri$1$doc$1(this.this$0, this.$uri, continuation);
        gxtViewModel$openUri$1$doc$1.L$0 = obj;
        return gxtViewModel$openUri$1$doc$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super GxtDocument> continuation) {
        return ((GxtViewModel$openUri$1$doc$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM8923constructorimpl;
        GxtDocument gxtDocument;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        final GxtViewModel gxtViewModel = this.this$0;
        Uri uri = this.$uri;
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream inputStreamOpenInputStream = gxtViewModel.getApplication().getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                InputStream inputStream = inputStreamOpenInputStream;
                try {
                    byte[] bytes = ByteStreamsKt.readBytes(inputStream);
                    CloseableKt.closeFinally(inputStream, null);
                    if (bytes != null) {
                        gxtDocument = GxtParser.INSTANCE.parse(bytes, new Function1() { // from class: com.zhawoilah.wgxt.viewmodel.GxtViewModel$openUri$1$doc$1$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return GxtViewModel$openUri$1$doc$1.invokeSuspend$lambda$0$1(gxtViewModel, (GxtGame) obj2);
                            }
                        });
                    } else {
                        gxtDocument = null;
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(inputStream, th);
                        throw th2;
                    }
                }
            } else {
                gxtDocument = null;
            }
            objM8923constructorimpl = Result.m8923constructorimpl(gxtDocument);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8923constructorimpl = Result.m8923constructorimpl(ResultKt.createFailure(th3));
        }
        if (Result.m8929isFailureimpl(objM8923constructorimpl)) {
            return null;
        }
        return objM8923constructorimpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map invokeSuspend$lambda$0$1(GxtViewModel gxtViewModel, GxtGame gxtGame) {
        return gxtViewModel.nameLists.mapFor(gxtGame);
    }
}
