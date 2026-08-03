.class public final Lcom/zhawoilah/wgxt/data/GxtDocument;
.super Ljava/lang/Object;
.source "GxtModels.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGxtModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GxtModels.kt\ncom/zhawoilah/wgxt/data/GxtDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003J-\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u00142\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0015\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/zhawoilah/wgxt/data/GxtDocument;",
        "",
        "game",
        "Lcom/zhawoilah/wgxt/data/GxtGame;",
        "bitsPerChar",
        "",
        "tables",
        "",
        "Lcom/zhawoilah/wgxt/data/GxtTable;",
        "<init>",
        "(Lcom/zhawoilah/wgxt/data/GxtGame;ILjava/util/List;)V",
        "getGame",
        "()Lcom/zhawoilah/wgxt/data/GxtGame;",
        "getBitsPerChar",
        "()I",
        "getTables",
        "()Ljava/util/List;",
        "totalEntries",
        "getTotalEntries",
        "isValid",
        "",
        "()Z",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
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
.field private final bitsPerChar:I

.field private final game:Lcom/zhawoilah/wgxt/data/GxtGame;

.field private final tables:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtTable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zhawoilah/wgxt/data/GxtGame;ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zhawoilah/wgxt/data/GxtGame;",
            "I",
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtTable;",
            ">;)V"
        }
    .end annotation

    const-string v0, "game"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tables"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->game:Lcom/zhawoilah/wgxt/data/GxtGame;

    .line 32
    iput p2, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->bitsPerChar:I

    .line 33
    iput-object p3, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->tables:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Lcom/zhawoilah/wgxt/data/GxtDocument;Lcom/zhawoilah/wgxt/data/GxtGame;ILjava/util/List;ILjava/lang/Object;)Lcom/zhawoilah/wgxt/data/GxtDocument;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->game:Lcom/zhawoilah/wgxt/data/GxtGame;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->bitsPerChar:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->tables:Ljava/util/List;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zhawoilah/wgxt/data/GxtDocument;->copy(Lcom/zhawoilah/wgxt/data/GxtGame;ILjava/util/List;)Lcom/zhawoilah/wgxt/data/GxtDocument;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/zhawoilah/wgxt/data/GxtGame;
    .locals 1

    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->game:Lcom/zhawoilah/wgxt/data/GxtGame;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->bitsPerChar:I

    return v0
.end method

.method public final component3()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtTable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->tables:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/zhawoilah/wgxt/data/GxtGame;ILjava/util/List;)Lcom/zhawoilah/wgxt/data/GxtDocument;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zhawoilah/wgxt/data/GxtGame;",
            "I",
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtTable;",
            ">;)",
            "Lcom/zhawoilah/wgxt/data/GxtDocument;"
        }
    .end annotation

    const-string v0, "game"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tables"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtDocument;

    invoke-direct {v0, p1, p2, p3}, Lcom/zhawoilah/wgxt/data/GxtDocument;-><init>(Lcom/zhawoilah/wgxt/data/GxtGame;ILjava/util/List;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zhawoilah/wgxt/data/GxtDocument;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zhawoilah/wgxt/data/GxtDocument;

    iget-object v1, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->game:Lcom/zhawoilah/wgxt/data/GxtGame;

    iget-object v3, p1, Lcom/zhawoilah/wgxt/data/GxtDocument;->game:Lcom/zhawoilah/wgxt/data/GxtGame;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->bitsPerChar:I

    iget v3, p1, Lcom/zhawoilah/wgxt/data/GxtDocument;->bitsPerChar:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->tables:Ljava/util/List;

    iget-object p1, p1, Lcom/zhawoilah/wgxt/data/GxtDocument;->tables:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBitsPerChar()I
    .locals 1

    .line 32
    iget v0, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->bitsPerChar:I

    return v0
.end method

.method public final getGame()Lcom/zhawoilah/wgxt/data/GxtGame;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->game:Lcom/zhawoilah/wgxt/data/GxtGame;

    return-object v0
.end method

.method public final getTables()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtTable;",
            ">;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->tables:Ljava/util/List;

    return-object v0
.end method

.method public final getTotalEntries()I
    .locals 3

    .line 35
    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->tables:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/zhawoilah/wgxt/data/GxtTable;

    invoke-virtual {v2}, Lcom/zhawoilah/wgxt/data/GxtTable;->getEntries()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    goto :goto_0

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->game:Lcom/zhawoilah/wgxt/data/GxtGame;

    invoke-virtual {v0}, Lcom/zhawoilah/wgxt/data/GxtGame;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->bitsPerChar:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->tables:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isValid()Z
    .locals 2

    .line 36
    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->game:Lcom/zhawoilah/wgxt/data/GxtGame;

    sget-object v1, Lcom/zhawoilah/wgxt/data/GxtGame;->UNKNOWN:Lcom/zhawoilah/wgxt/data/GxtGame;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->tables:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->game:Lcom/zhawoilah/wgxt/data/GxtGame;

    iget v1, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->bitsPerChar:I

    iget-object v2, p0, Lcom/zhawoilah/wgxt/data/GxtDocument;->tables:Ljava/util/List;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "GxtDocument(game="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ", bitsPerChar="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tables="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
