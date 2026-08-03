.class final Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "WazzApp.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zhawoilah/wgxt/ui/WazzAppKt;->WazzApp(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lkotlinx/coroutines/CoroutineScope;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "",
        "Lkotlinx/coroutines/CoroutineScope;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.zhawoilah.wgxt.ui.WazzAppKt$WazzApp$3$4$1"
    f = "WazzApp.kt"
    i = {
        0x0
    }
    l = {
        0xe0
    }
    m = "invokeSuspend"
    n = {
        "st"
    }
    s = {
        "L$0"
    }
    v = 0x1
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $loadState$delegate:Landroidx/compose/runtime/State;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/State<",
            "Lcom/zhawoilah/wgxt/viewmodel/LoadState;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $screen$delegate:Landroidx/compose/runtime/MutableState;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/zhawoilah/wgxt/ui/Screen;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $snackbar:Landroidx/compose/material3/SnackbarHostState;

.field final synthetic $vm:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/material3/SnackbarHostState;Landroid/content/Context;Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/material3/SnackbarHostState;",
            "Landroid/content/Context;",
            "Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lcom/zhawoilah/wgxt/viewmodel/LoadState;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/zhawoilah/wgxt/ui/Screen;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$snackbar:Landroidx/compose/material3/SnackbarHostState;

    iput-object p2, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$vm:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    iput-object p4, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$loadState$delegate:Landroidx/compose/runtime/State;

    iput-object p5, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$screen$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;

    iget-object v1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$snackbar:Landroidx/compose/material3/SnackbarHostState;

    iget-object v2, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$context:Landroid/content/Context;

    iget-object v3, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$vm:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    iget-object v4, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$loadState$delegate:Landroidx/compose/runtime/State;

    iget-object v5, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$screen$delegate:Landroidx/compose/runtime/MutableState;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;-><init>(Landroidx/compose/material3/SnackbarHostState;Landroid/content/Context;Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/CoroutineScope;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 221
    iget v1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/zhawoilah/wgxt/viewmodel/LoadState;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 222
    iget-object p1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$loadState$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/zhawoilah/wgxt/ui/WazzAppKt;->access$WazzApp$lambda$1(Landroidx/compose/runtime/State;)Lcom/zhawoilah/wgxt/viewmodel/LoadState;

    move-result-object p1

    .line 223
    instance-of v1, p1, Lcom/zhawoilah/wgxt/viewmodel/LoadState$Error;

    if-eqz v1, :cond_4

    .line 224
    iget-object v3, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$snackbar:Landroidx/compose/material3/SnackbarHostState;

    .line 225
    move-object v1, p1

    check-cast v1, Lcom/zhawoilah/wgxt/viewmodel/LoadState$Error;

    invoke-virtual {v1}, Lcom/zhawoilah/wgxt/viewmodel/LoadState$Error;->getFormatIssue()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$context:Landroid/content/Context;

    sget v4, Lcom/zhawoilah/wgxt/R$string;->state_error_format:I

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    .line 226
    :cond_2
    iget-object v1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$context:Landroid/content/Context;

    sget v4, Lcom/zhawoilah/wgxt/R$string;->state_error:I

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    :goto_0
    move-object v4, v1

    .line 225
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 224
    move-object v8, p0

    check-cast v8, Lkotlin/coroutines/Continuation;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->label:I

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v9, 0xe

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Landroidx/compose/material3/SnackbarHostState;->showSnackbar$default(Landroidx/compose/material3/SnackbarHostState;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/material3/SnackbarDuration;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    .line 228
    :cond_3
    :goto_1
    iget-object p1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$vm:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    invoke-virtual {p1}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;->closeDocument()V

    .line 229
    iget-object p1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$3$4$1;->$screen$delegate:Landroidx/compose/runtime/MutableState;

    sget-object v0, Lcom/zhawoilah/wgxt/ui/Screen$Home;->INSTANCE:Lcom/zhawoilah/wgxt/ui/Screen$Home;

    check-cast v0, Lcom/zhawoilah/wgxt/ui/Screen;

    invoke-static {p1, v0}, Lcom/zhawoilah/wgxt/ui/WazzAppKt;->access$WazzApp$lambda$8(Landroidx/compose/runtime/MutableState;Lcom/zhawoilah/wgxt/ui/Screen;)V

    .line 231
    :cond_4
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
