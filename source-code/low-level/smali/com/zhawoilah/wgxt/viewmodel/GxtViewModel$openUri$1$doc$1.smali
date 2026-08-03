.class final Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "GxtViewModel.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lcom/zhawoilah/wgxt/data/GxtDocument;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGxtViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GxtViewModel.kt\ncom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/zhawoilah/wgxt/data/GxtDocument;",
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
    c = "com.zhawoilah.wgxt.viewmodel.GxtViewModel$openUri$1$doc$1"
    f = "GxtViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $uri:Landroid/net/Uri;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;


# direct methods
.method public static synthetic $r8$lambda$rQIaPVfCJpHYhV4U_ABICfJ0NVg(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Lcom/zhawoilah/wgxt/data/GxtGame;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;->invokeSuspend$lambda$0$1(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Lcom/zhawoilah/wgxt/data/GxtGame;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method constructor <init>(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;",
            "Landroid/net/Uri;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;->this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    iput-object p2, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;->$uri:Landroid/net/Uri;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method private static final invokeSuspend$lambda$0$1(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Lcom/zhawoilah/wgxt/data/GxtGame;)Ljava/util/Map;
    .locals 0

    .line 103
    invoke-static {p0}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;->access$getNameLists$p(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;)Lcom/zhawoilah/wgxt/data/NameListRepository;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/zhawoilah/wgxt/data/NameListRepository;->mapFor(Lcom/zhawoilah/wgxt/data/GxtGame;)Ljava/util/Map;

    move-result-object p0

    return-object p0
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

    new-instance v0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;

    iget-object v1, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;->this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    iget-object v2, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;->$uri:Landroid/net/Uri;

    invoke-direct {v0, v1, v2, p2}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;-><init>(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlin/coroutines/Continuation;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/CoroutineScope;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;->invoke(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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
            "Lcom/zhawoilah/wgxt/data/GxtDocument;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;

    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lkotlinx/coroutines/CoroutineScope;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 99
    iget v0, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;->label:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 100
    iget-object p1, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;->this$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    iget-object v0, p0, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1;->$uri:Landroid/net/Uri;

    const/4 v1, 0x0

    :try_start_0
    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 101
    invoke-virtual {p1}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;->getApplication()Landroid/app/Application;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Application;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    .line 102
    invoke-virtual {v2, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 101
    check-cast v0, Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 102
    :try_start_1
    move-object v2, v0

    check-cast v2, Ljava/io/InputStream;

    invoke-static {v2}, Lkotlin/io/ByteStreamsKt;->readBytes(Ljava/io/InputStream;)[B

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v0, v1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    if-eqz v2, :cond_0

    .line 103
    sget-object v0, Lcom/zhawoilah/wgxt/data/GxtParser;->INSTANCE:Lcom/zhawoilah/wgxt/data/GxtParser;

    new-instance v3, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1$$ExternalSyntheticLambda0;

    invoke-direct {v3, p1}, Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel$openUri$1$doc$1$$ExternalSyntheticLambda0;-><init>(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;)V

    invoke-virtual {v0, v2, v3}, Lcom/zhawoilah/wgxt/data/GxtParser;->parse([BLkotlin/jvm/functions/Function1;)Lcom/zhawoilah/wgxt/data/GxtDocument;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 102
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v2

    :try_start_4
    invoke-static {v0, p1}, Lkotlin/io/CloseableKt;->closeFinally(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v2

    :cond_0
    move-object p1, v1

    .line 100
    :goto_0
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception p1

    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 104
    :goto_1
    invoke-static {p1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    :cond_1
    move-object v1, p1

    :goto_2
    return-object v1

    .line 99
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
