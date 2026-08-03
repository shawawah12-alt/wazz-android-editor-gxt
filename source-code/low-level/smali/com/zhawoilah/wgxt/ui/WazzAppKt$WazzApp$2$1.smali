.class final Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;
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
    c = "com.zhawoilah.wgxt.ui.WazzAppKt$WazzApp$2$1"
    f = "WazzApp.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
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

.field label:I


# direct methods
.method constructor <init>(Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/State<",
            "+",
            "Lcom/zhawoilah/wgxt/viewmodel/LoadState;",
            ">;",
            "Landroidx/compose/runtime/MutableState<",
            "Lcom/zhawoilah/wgxt/ui/Screen;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;->$loadState$delegate:Landroidx/compose/runtime/State;

    iput-object p2, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;->$screen$delegate:Landroidx/compose/runtime/MutableState;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
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

    new-instance p1, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;

    iget-object v0, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;->$loadState$delegate:Landroidx/compose/runtime/State;

    iget-object v1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;->$screen$delegate:Landroidx/compose/runtime/MutableState;

    invoke-direct {p1, v0, v1, p2}, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;-><init>(Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Lkotlin/coroutines/Continuation;)V

    check-cast p1, Lkotlin/coroutines/Continuation;

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 127
    iget v0, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;->label:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 128
    iget-object p1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;->$loadState$delegate:Landroidx/compose/runtime/State;

    invoke-static {p1}, Lcom/zhawoilah/wgxt/ui/WazzAppKt;->access$WazzApp$lambda$1(Landroidx/compose/runtime/State;)Lcom/zhawoilah/wgxt/viewmodel/LoadState;

    move-result-object p1

    instance-of p1, p1, Lcom/zhawoilah/wgxt/viewmodel/LoadState$Loaded;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;->$screen$delegate:Landroidx/compose/runtime/MutableState;

    invoke-static {p1}, Lcom/zhawoilah/wgxt/ui/WazzAppKt;->access$WazzApp$lambda$7(Landroidx/compose/runtime/MutableState;)Lcom/zhawoilah/wgxt/ui/Screen;

    move-result-object p1

    instance-of p1, p1, Lcom/zhawoilah/wgxt/ui/Screen$Home;

    if-eqz p1, :cond_0

    .line 129
    iget-object p1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$WazzApp$2$1;->$screen$delegate:Landroidx/compose/runtime/MutableState;

    sget-object v0, Lcom/zhawoilah/wgxt/ui/Screen$Tables;->INSTANCE:Lcom/zhawoilah/wgxt/ui/Screen$Tables;

    check-cast v0, Lcom/zhawoilah/wgxt/ui/Screen;

    invoke-static {p1, v0}, Lcom/zhawoilah/wgxt/ui/WazzAppKt;->access$WazzApp$lambda$8(Landroidx/compose/runtime/MutableState;Lcom/zhawoilah/wgxt/ui/Screen;)V

    .line 131
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 127
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
