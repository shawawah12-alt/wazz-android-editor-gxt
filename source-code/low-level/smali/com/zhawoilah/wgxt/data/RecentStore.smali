.class public final Lcom/zhawoilah/wgxt/data/RecentStore;
.super Ljava/lang/Object;
.source "RecentStore.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRecentStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecentStore.kt\ncom/zhawoilah/wgxt/data/RecentStore\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,30:1\n49#2:31\n51#2:35\n46#3:32\n51#3:34\n105#4:33\n*S KotlinDebug\n*F\n+ 1 RecentStore.kt\ncom/zhawoilah/wgxt/data/RecentStore\n*L\n18#1:31\n18#1:35\n18#1:32\n18#1:34\n18#1:33\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0082D\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u000c0\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/zhawoilah/wgxt/data/RecentStore;",
        "",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "key",
        "Landroidx/datastore/preferences/core/Preferences$Key;",
        "",
        "sep",
        "recent",
        "Lkotlinx/coroutines/flow/Flow;",
        "",
        "getRecent",
        "()Lkotlinx/coroutines/flow/Flow;",
        "add",
        "",
        "name",
        "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final context:Landroid/content/Context;

.field private final key:Landroidx/datastore/preferences/core/Preferences$Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/datastore/preferences/core/Preferences$Key<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final recent:Lkotlinx/coroutines/flow/Flow;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private final sep:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zhawoilah/wgxt/data/RecentStore;->context:Landroid/content/Context;

    .line 15
    const-string v0, "recent_names"

    invoke-static {v0}, Landroidx/datastore/preferences/core/PreferencesKeys;->stringKey(Ljava/lang/String;)Landroidx/datastore/preferences/core/Preferences$Key;

    move-result-object v0

    iput-object v0, p0, Lcom/zhawoilah/wgxt/data/RecentStore;->key:Landroidx/datastore/preferences/core/Preferences$Key;

    .line 16
    const-string v0, "\u0001"

    iput-object v0, p0, Lcom/zhawoilah/wgxt/data/RecentStore;->sep:Ljava/lang/String;

    .line 18
    invoke-static {p1}, Lcom/zhawoilah/wgxt/data/RecentStoreKt;->access$getRecentDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    move-result-object p1

    invoke-interface {p1}, Landroidx/datastore/core/DataStore;->getData()Lkotlinx/coroutines/flow/Flow;

    move-result-object p1

    .line 33
    new-instance v0, Lcom/zhawoilah/wgxt/data/RecentStore$special$$inlined$map$1;

    invoke-direct {v0, p1, p0}, Lcom/zhawoilah/wgxt/data/RecentStore$special$$inlined$map$1;-><init>(Lkotlinx/coroutines/flow/Flow;Lcom/zhawoilah/wgxt/data/RecentStore;)V

    check-cast v0, Lkotlinx/coroutines/flow/Flow;

    .line 18
    iput-object v0, p0, Lcom/zhawoilah/wgxt/data/RecentStore;->recent:Lkotlinx/coroutines/flow/Flow;

    return-void
.end method

.method public static final synthetic access$getKey$p(Lcom/zhawoilah/wgxt/data/RecentStore;)Landroidx/datastore/preferences/core/Preferences$Key;
    .locals 0

    .line 13
    iget-object p0, p0, Lcom/zhawoilah/wgxt/data/RecentStore;->key:Landroidx/datastore/preferences/core/Preferences$Key;

    return-object p0
.end method

.method public static final synthetic access$getSep$p(Lcom/zhawoilah/wgxt/data/RecentStore;)Ljava/lang/String;
    .locals 0

    .line 13
    iget-object p0, p0, Lcom/zhawoilah/wgxt/data/RecentStore;->sep:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final add(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/RecentStore;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/zhawoilah/wgxt/data/RecentStoreKt;->access$getRecentDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;

    move-result-object v0

    new-instance v1, Lcom/zhawoilah/wgxt/data/RecentStore$add$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/zhawoilah/wgxt/data/RecentStore$add$2;-><init>(Lcom/zhawoilah/wgxt/data/RecentStore;Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    check-cast v1, Lkotlin/jvm/functions/Function2;

    invoke-static {v0, v1, p2}, Landroidx/datastore/preferences/core/PreferencesKt;->edit(Landroidx/datastore/core/DataStore;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final getRecent()Lkotlinx/coroutines/flow/Flow;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/flow/Flow<",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .line 18
    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/RecentStore;->recent:Lkotlinx/coroutines/flow/Flow;

    return-object v0
.end method
