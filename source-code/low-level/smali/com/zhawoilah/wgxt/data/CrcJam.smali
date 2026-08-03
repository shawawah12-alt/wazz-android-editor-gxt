.class public final Lcom/zhawoilah/wgxt/data/CrcJam;
.super Ljava/lang/Object;
.source "CrcJam.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/zhawoilah/wgxt/data/CrcJam;",
        "",
        "<init>",
        "()V",
        "table",
        "",
        "hash",
        "",
        "input",
        "",
        "hashUpper",
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

.field public static final INSTANCE:Lcom/zhawoilah/wgxt/data/CrcJam;

.field private static final table:[I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/zhawoilah/wgxt/data/CrcJam;

    invoke-direct {v0}, Lcom/zhawoilah/wgxt/data/CrcJam;-><init>()V

    sput-object v0, Lcom/zhawoilah/wgxt/data/CrcJam;->INSTANCE:Lcom/zhawoilah/wgxt/data/CrcJam;

    const/16 v0, 0x100

    .line 10
    new-array v1, v0, [I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/16 v4, 0x8

    if-ge v3, v0, :cond_2

    move v5, v2

    move v6, v3

    :goto_1
    if-ge v5, v4, :cond_1

    and-int/lit8 v7, v6, 0x1

    ushr-int/lit8 v6, v6, 0x1

    if-eqz v7, :cond_0

    const v7, -0x12477ce0

    xor-int/2addr v6, v7

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 16
    :cond_1
    aput v6, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 10
    :cond_2
    sput-object v1, Lcom/zhawoilah/wgxt/data/CrcJam;->table:[I

    sput v4, Lcom/zhawoilah/wgxt/data/CrcJam;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final hash(Ljava/lang/String;)J
    .locals 6

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    ushr-int/lit8 v4, v1, 0x8

    .line 24
    sget-object v5, Lcom/zhawoilah/wgxt/data/CrcJam;->table:[I

    xor-int/2addr v1, v3

    and-int/lit16 v1, v1, 0xff

    aget v1, v5, v1

    xor-int/2addr v1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    int-to-long v0, v1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method public final hashUpper(Ljava/lang/String;)J
    .locals 2

    const-string v0, "input"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/zhawoilah/wgxt/data/CrcJam;->hash(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method
