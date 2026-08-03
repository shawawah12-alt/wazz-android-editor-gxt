.class public final Lcom/zhawoilah/wgxt/data/GxtEntry;
.super Ljava/lang/Object;
.source "GxtModels.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u000fR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000c\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/zhawoilah/wgxt/data/GxtEntry;",
        "",
        "keyName",
        "",
        "hash",
        "",
        "isHashOnly",
        "",
        "original",
        "<init>",
        "(Ljava/lang/String;JZLjava/lang/String;)V",
        "getKeyName",
        "()Ljava/lang/String;",
        "getHash",
        "()J",
        "()Z",
        "getOriginal",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field public static final $stable:I


# instance fields
.field private final hash:J

.field private final isHashOnly:Z

.field private final keyName:Ljava/lang/String;

.field private final original:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JZLjava/lang/String;)V
    .locals 1

    const-string v0, "keyName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "original"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->keyName:Ljava/lang/String;

    .line 20
    iput-wide p2, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->hash:J

    .line 21
    iput-boolean p4, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->isHashOnly:Z

    .line 22
    iput-object p5, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->original:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/zhawoilah/wgxt/data/GxtEntry;Ljava/lang/String;JZLjava/lang/String;ILjava/lang/Object;)Lcom/zhawoilah/wgxt/data/GxtEntry;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->keyName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-wide p2, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->hash:J

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-boolean p4, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->isHashOnly:Z

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    iget-object p5, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->original:Ljava/lang/String;

    :cond_3
    move p6, p4

    move-object p7, p5

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/zhawoilah/wgxt/data/GxtEntry;->copy(Ljava/lang/String;JZLjava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->keyName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->hash:J

    return-wide v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->isHashOnly:Z

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->original:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;JZLjava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;
    .locals 7

    const-string v0, "keyName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "original"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/zhawoilah/wgxt/data/GxtEntry;-><init>(Ljava/lang/String;JZLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zhawoilah/wgxt/data/GxtEntry;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zhawoilah/wgxt/data/GxtEntry;

    iget-object v1, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->keyName:Ljava/lang/String;

    iget-object v3, p1, Lcom/zhawoilah/wgxt/data/GxtEntry;->keyName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->hash:J

    iget-wide v5, p1, Lcom/zhawoilah/wgxt/data/GxtEntry;->hash:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->isHashOnly:Z

    iget-boolean v3, p1, Lcom/zhawoilah/wgxt/data/GxtEntry;->isHashOnly:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->original:Ljava/lang/String;

    iget-object p1, p1, Lcom/zhawoilah/wgxt/data/GxtEntry;->original:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getHash()J
    .locals 2

    .line 20
    iget-wide v0, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->hash:J

    return-wide v0
.end method

.method public final getKeyName()Ljava/lang/String;
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->keyName:Ljava/lang/String;

    return-object v0
.end method

.method public final getOriginal()Ljava/lang/String;
    .locals 1

    .line 22
    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->original:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->keyName:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->hash:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->isHashOnly:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->original:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isHashOnly()Z
    .locals 1

    .line 21
    iget-boolean v0, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->isHashOnly:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->keyName:Ljava/lang/String;

    iget-wide v1, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->hash:J

    iget-boolean v3, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->isHashOnly:Z

    iget-object v4, p0, Lcom/zhawoilah/wgxt/data/GxtEntry;->original:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "GxtEntry(keyName="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, ", hash="

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", isHashOnly="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", original="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
