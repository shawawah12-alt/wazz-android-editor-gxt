.class public final Lcom/zhawoilah/wgxt/data/GxtTokens;
.super Ljava/lang/Object;
.source "GxtTokens.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008R\u0017\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0008R\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u0008R\u0017\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0008\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/zhawoilah/wgxt/data/GxtTokens;",
        "",
        "<init>",
        "()V",
        "common",
        "",
        "Lcom/zhawoilah/wgxt/data/GxtToken;",
        "getCommon",
        "()Ljava/util/List;",
        "colors",
        "getColors",
        "formatting",
        "getFormatting",
        "placeholders",
        "getPlaceholders",
        "buttons",
        "getButtons",
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

.field public static final INSTANCE:Lcom/zhawoilah/wgxt/data/GxtTokens;

.field private static final buttons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtToken;",
            ">;"
        }
    .end annotation
.end field

.field private static final colors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtToken;",
            ">;"
        }
    .end annotation
.end field

.field private static final common:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtToken;",
            ">;"
        }
    .end annotation
.end field

.field private static final formatting:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtToken;",
            ">;"
        }
    .end annotation
.end field

.field private static final placeholders:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtToken;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 26

    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtTokens;

    invoke-direct {v0}, Lcom/zhawoilah/wgxt/data/GxtTokens;-><init>()V

    sput-object v0, Lcom/zhawoilah/wgxt/data/GxtTokens;->INSTANCE:Lcom/zhawoilah/wgxt/data/GxtTokens;

    const/16 v0, 0xc

    .line 9
    new-array v0, v0, [Lcom/zhawoilah/wgxt/data/GxtToken;

    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "New line"

    const-string v3, "~n~"

    invoke-direct {v1, v3, v2}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 10
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v4, "White"

    const-string v5, "~w~"

    invoke-direct {v1, v5, v4}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x1

    aput-object v1, v0, v4

    .line 11
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v6, "~r~"

    const-string v7, "Red"

    invoke-direct {v1, v6, v7}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v8, 0x2

    aput-object v1, v0, v8

    .line 12
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v9, "~g~"

    const-string v10, "Green"

    invoke-direct {v1, v9, v10}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v11, 0x3

    aput-object v1, v0, v11

    .line 13
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v12, "~b~"

    const-string v13, "Blue"

    invoke-direct {v1, v12, v13}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v14, 0x4

    aput-object v1, v0, v14

    .line 14
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v15, "~y~"

    move/from16 v16, v2

    const-string v2, "Yellow"

    invoke-direct {v1, v15, v2}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move/from16 v17, v4

    const/4 v4, 0x5

    aput-object v1, v0, v4

    .line 15
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    move/from16 v18, v14

    const-string v14, "Purple"

    move/from16 v19, v4

    const-string v4, "~p~"

    invoke-direct {v1, v4, v14}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v14, 0x6

    aput-object v1, v0, v14

    .line 16
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    move/from16 v20, v14

    const-string v14, "~l~"

    move/from16 v21, v8

    const-string v8, "Black"

    invoke-direct {v1, v14, v8}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v22, 0x7

    aput-object v1, v0, v22

    .line 17
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    move/from16 v23, v11

    const-string v11, "~h~"

    move-object/from16 v24, v0

    const-string v0, "Highlight"

    invoke-direct {v1, v11, v0}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x8

    aput-object v1, v24, v0

    .line 18
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v11, "~1~"

    move/from16 v25, v0

    const-string v0, "Number"

    invoke-direct {v1, v11, v0}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x9

    aput-object v1, v24, v0

    .line 19
    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v1, "~a~"

    const-string v11, "String"

    invoke-direct {v0, v1, v11}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0xa

    aput-object v0, v24, v1

    .line 20
    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v1, "~k~"

    const-string v11, "Key"

    invoke-direct {v0, v1, v11}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0xb

    aput-object v0, v24, v1

    .line 8
    invoke-static/range {v24 .. v24}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/zhawoilah/wgxt/data/GxtTokens;->common:Ljava/util/List;

    const/16 v0, 0xa

    .line 26
    new-array v0, v0, [Lcom/zhawoilah/wgxt/data/GxtToken;

    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v11, "White (default text)"

    invoke-direct {v1, v5, v11}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v16

    .line 27
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    invoke-direct {v1, v6, v7}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v17

    .line 28
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    invoke-direct {v1, v9, v10}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v21

    .line 29
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    invoke-direct {v1, v12, v13}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v23

    .line 30
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    invoke-direct {v1, v15, v2}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v18

    .line 31
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "Purple / pink"

    invoke-direct {v1, v4, v2}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v19

    .line 32
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "~o~"

    const-string v4, "Orange"

    invoke-direct {v1, v2, v4}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v20

    .line 33
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "~q~"

    const-string v4, "Light pink"

    invoke-direct {v1, v2, v4}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v22

    .line 34
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    invoke-direct {v1, v14, v8}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v25

    .line 35
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "~z~"

    const-string v4, "Grey / soft white"

    invoke-direct {v1, v2, v4}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x9

    aput-object v1, v0, v2

    .line 25
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/zhawoilah/wgxt/data/GxtTokens;->colors:Ljava/util/List;

    move/from16 v0, v23

    .line 39
    new-array v1, v0, [Lcom/zhawoilah/wgxt/data/GxtToken;

    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "New line (line break)"

    invoke-direct {v0, v3, v2}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v0, v1, v16

    .line 40
    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "~h~"

    const-string v3, "Highlight / bright white"

    invoke-direct {v0, v2, v3}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v0, v1, v17

    .line 41
    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "~s~"

    const-string v3, "Reset to standard style"

    invoke-direct {v0, v2, v3}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v0, v1, v21

    .line 38
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/zhawoilah/wgxt/data/GxtTokens;->formatting:Ljava/util/List;

    move/from16 v0, v21

    .line 45
    new-array v1, v0, [Lcom/zhawoilah/wgxt/data/GxtToken;

    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "~a~"

    const-string v3, "Insert a string value"

    invoke-direct {v0, v2, v3}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v0, v1, v16

    .line 46
    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "~1~"

    const-string v3, "Insert a number value"

    invoke-direct {v0, v2, v3}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v0, v1, v17

    .line 44
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/zhawoilah/wgxt/data/GxtTokens;->placeholders:Ljava/util/List;

    move/from16 v0, v19

    .line 50
    new-array v0, v0, [Lcom/zhawoilah/wgxt/data/GxtToken;

    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "~k~"

    const-string v3, "Shows a control / key binding"

    invoke-direct {v1, v2, v3}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v16

    .line 51
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "~<~"

    const-string v3, "Left"

    invoke-direct {v1, v2, v3}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v17

    .line 52
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "~>~"

    const-string v3, "Right"

    invoke-direct {v1, v2, v3}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v21, 0x2

    aput-object v1, v0, v21

    .line 53
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "~up~"

    const-string v3, "Up"

    invoke-direct {v1, v2, v3}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v23, 0x3

    aput-object v1, v0, v23

    .line 54
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const-string v2, "~down~"

    const-string v3, "Down"

    invoke-direct {v1, v2, v3}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v18

    .line 49
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/zhawoilah/wgxt/data/GxtTokens;->buttons:Ljava/util/List;

    sput v25, Lcom/zhawoilah/wgxt/data/GxtTokens;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getButtons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtToken;",
            ">;"
        }
    .end annotation

    .line 49
    sget-object v0, Lcom/zhawoilah/wgxt/data/GxtTokens;->buttons:Ljava/util/List;

    return-object v0
.end method

.method public final getColors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtToken;",
            ">;"
        }
    .end annotation

    .line 25
    sget-object v0, Lcom/zhawoilah/wgxt/data/GxtTokens;->colors:Ljava/util/List;

    return-object v0
.end method

.method public final getCommon()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtToken;",
            ">;"
        }
    .end annotation

    .line 8
    sget-object v0, Lcom/zhawoilah/wgxt/data/GxtTokens;->common:Ljava/util/List;

    return-object v0
.end method

.method public final getFormatting()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtToken;",
            ">;"
        }
    .end annotation

    .line 38
    sget-object v0, Lcom/zhawoilah/wgxt/data/GxtTokens;->formatting:Ljava/util/List;

    return-object v0
.end method

.method public final getPlaceholders()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zhawoilah/wgxt/data/GxtToken;",
            ">;"
        }
    .end annotation

    .line 44
    sget-object v0, Lcom/zhawoilah/wgxt/data/GxtTokens;->placeholders:Ljava/util/List;

    return-object v0
.end method
