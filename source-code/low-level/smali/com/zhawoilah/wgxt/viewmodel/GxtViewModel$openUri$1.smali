.class final Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "GxtViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;->openUri(Landroid/net/Uri;Ljava/lang/String;)V
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
    c = "com.zhawoilah.wgxt.viewmodel.GxtViewModel$openUri$1"
    f = "GxtViewModel.kt"
    i = {
        0x1
    }
    l = {
        0x63,
        0x73
    }
    m = "invokeSuspend"
    n = {
        "doc"
    }
    s = {
        "L$0"
    }
    v = 0x1
.end annotation


# instance fields
.field final synthetic $displayName:Ljava/lang/String;

.field final synthetic $uri:Landroid/net/Uri;

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;


# direct methods
.method constructor <init>(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Ljava/lang/String;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;",
            "Ljava/lang/String;",
            "Landroid/net/Uri;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    iput-object p2, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->$displayName:Ljava/lang/String;

    iput-object p3, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->$uri:Landroid/net/Uri;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;

    iget-object v0, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    iget-object v1, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->$displayName:Ljava/lang/String;

    iget-object v2, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->$uri:Landroid/net/Uri;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;-><init>(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Ljava/lang/String;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v0

    .line 98
    iget v1, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/zhawoilah/wgxt/data/GxtDocument;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 99
    invoke-static {}, Lkotlinx/coroutines/Dispatchers;->getIO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p1

    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    new-instance v1, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;

    iget-object v4, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    iget-object v5, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->$uri:Landroid/net/Uri;

    const/4 v6, 0x0

    invoke-direct {v1, v4, v5, v6}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;-><init>(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    iput v3, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->label:I

    invoke-static {p1, v1, v4}, Lkotlinx/coroutines/BuildersKt;->withContext(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    .line 98
    :cond_3
    :goto_0
    check-cast p1, Lcom/zhawoilah/wgxt/data/GxtDocument;

    if-nez p1, :cond_4

    .line 107
    iget-object p1, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    invoke-static {p1}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;->access$get_loadState$p(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    new-instance v0, Lcom/zhawoilah/wgxt/viewmodel/LoadState$Error;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zhawoilah/wgxt/viewmodel/LoadState$Error;-><init>(Z)V

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    goto :goto_2

    .line 108
    :cond_4
    invoke-virtual {p1}, Lcom/zhawoilah/wgxt/data/GxtDocument;->isValid()Z

    move-result v1

    if-nez v1, :cond_5

    .line 109
    iget-object p1, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    invoke-static {p1}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;->access$get_loadState$p(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object p1

    new-instance v0, Lcom/zhawoilah/wgxt/viewmodel/LoadState$Error;

    invoke-direct {v0, v3}, Lcom/zhawoilah/wgxt/viewmodel/LoadState$Error;-><init>(Z)V

    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    goto :goto_2

    .line 111
    :cond_5
    iget-object v1, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    invoke-static {v1}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;->access$get_document$p(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    invoke-interface {v1, p1}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 112
    iget-object v1, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    invoke-static {v1}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;->access$get_edits$p(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 113
    iget-object v1, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    invoke-static {v1}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;->access$get_fileName$p(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    iget-object v3, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->$displayName:Ljava/lang/String;

    invoke-interface {v1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 114
    iget-object v1, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    invoke-static {v1}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;->access$get_loadState$p(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;)Lkotlinx/coroutines/flow/MutableStateFlow;

    move-result-object v1

    sget-object v3, Lcom/zhawoilah/wgxt/viewmodel/LoadState$Loaded;->INSTANCE:Lcom/zhawoilah/wgxt/viewmodel/LoadState$Loaded;

    invoke-interface {v1, v3}, Lkotlinx/coroutines/flow/MutableStateFlow;->setValue(Ljava/lang/Object;)V

    .line 115
    iget-object v1, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    invoke-static {v1}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;->access$getRecentStore$p(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;)Lcom/zhawoilah/wgxt/data/RecentStore;

    move-result-object v1

    iget-object v3, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->$displayName:Ljava/lang/String;

    move-object v4, p0

    check-cast v4, Lkotlin/coroutines/Continuation;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->L$0:Ljava/lang/Object;

    iput v2, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->label:I

    invoke-virtual {v1, v3, v4}, Lcom/zhawoilah/wgxt/data/RecentStore;->add(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_1
    return-object v0

    .line 117
    :cond_6
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
