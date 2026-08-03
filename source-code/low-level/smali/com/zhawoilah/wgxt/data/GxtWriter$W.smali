.class final Lcom/zhawoilah/wgxt/data/GxtWriter$W;
.super Ljava/lang/Object;
.source "GxtWriter.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zhawoilah/wgxt/data/GxtWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "W"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/zhawoilah/wgxt/data/GxtWriter$W;",
        "",
        "hash",
        "",
        "name",
        "",
        "text",
        "<init>",
        "(JLjava/lang/String;Ljava/lang/String;)V",
        "getHash",
        "()J",
        "getName",
        "()Ljava/lang/String;",
        "getText",
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


# instance fields
.field private final hash:J

.field private final name:Ljava/lang/String;

.field private final text:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "text"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/zhawoilah/wgxt/data/GxtWriter$W;->hash:J

    iput-object p3, p0, Lcom/zhawoilah/wgxt/data/GxtWriter$W;->name:Ljava/lang/String;

    iput-object p4, p0, Lcom/zhawoilah/wgxt/data/GxtWriter$W;->text:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getHash()J
    .locals 2

    .line 68
    iget-wide v0, p0, Lcom/zhawoilah/wgxt/data/GxtWriter$W;->hash:J

    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtWriter$W;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtWriter$W;->text:Ljava/lang/String;

    return-object v0
.end method
