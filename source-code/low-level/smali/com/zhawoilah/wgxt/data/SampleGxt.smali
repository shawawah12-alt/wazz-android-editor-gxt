.class public final Lcom/zhawoilah/wgxt/data/SampleGxt;
.super Ljava/lang/Object;
.source "SampleGxt.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/zhawoilah/wgxt/data/SampleGxt;",
        "",
        "<init>",
        "()V",
        "entry",
        "Lcom/zhawoilah/wgxt/data/GxtEntry;",
        "key",
        "",
        "text",
        "build",
        "Lcom/zhawoilah/wgxt/data/GxtDocument;",
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

.field public static final INSTANCE:Lcom/zhawoilah/wgxt/data/SampleGxt;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zhawoilah/wgxt/data/SampleGxt;

    invoke-direct {v0}, Lcom/zhawoilah/wgxt/data/SampleGxt;-><init>()V

    sput-object v0, Lcom/zhawoilah/wgxt/data/SampleGxt;->INSTANCE:Lcom/zhawoilah/wgxt/data/SampleGxt;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final entry(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;
    .locals 6

    .line 7
    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtEntry;

    sget-object v1, Lcom/zhawoilah/wgxt/data/CrcJam;->INSTANCE:Lcom/zhawoilah/wgxt/data/CrcJam;

    invoke-virtual {v1, p1}, Lcom/zhawoilah/wgxt/data/CrcJam;->hashUpper(Ljava/lang/String;)J

    move-result-wide v2

    const/4 v4, 0x0

    move-object v1, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/zhawoilah/wgxt/data/GxtEntry;-><init>(Ljava/lang/String;JZLjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final build()Lcom/zhawoilah/wgxt/data/GxtDocument;
    .locals 17

    move-object/from16 v0, p0

    .line 10
    new-instance v1, Lcom/zhawoilah/wgxt/data/GxtTable;

    const/16 v2, 0x9

    .line 13
    new-array v2, v2, [Lcom/zhawoilah/wgxt/data/GxtEntry;

    const-string v3, "CJ_NAME"

    const-string v4, "Carl Johnson"

    invoke-direct {v0, v3, v4}, Lcom/zhawoilah/wgxt/data/SampleGxt;->entry(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 14
    const-string v3, "GROVE"

    const-string v5, "~g~Grove Street"

    invoke-direct {v0, v3, v5}, Lcom/zhawoilah/wgxt/data/SampleGxt;->entry(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-result-object v3

    const/4 v5, 0x1

    aput-object v3, v2, v5

    .line 15
    const-string v3, "WELCOME"

    const-string v6, "Welcome back to San Andreas, ~y~CJ~w~."

    invoke-direct {v0, v3, v6}, Lcom/zhawoilah/wgxt/data/SampleGxt;->entry(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-result-object v3

    const/4 v6, 0x2

    aput-object v3, v2, v6

    .line 16
    const-string v3, "SPRAY"

    const-string v7, "~b~Pay \'n\' Spray~w~ - respray your ride here."

    invoke-direct {v0, v3, v7}, Lcom/zhawoilah/wgxt/data/SampleGxt;->entry(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-result-object v3

    const/4 v7, 0x3

    aput-object v3, v2, v7

    .line 17
    const-string v3, "AMMU"

    const-string v8, "Ammu-Nation"

    invoke-direct {v0, v3, v8}, Lcom/zhawoilah/wgxt/data/SampleGxt;->entry(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-result-object v3

    const/4 v8, 0x4

    aput-object v3, v2, v8

    .line 18
    const-string v3, "WASTED"

    const-string v9, "~r~WASTED"

    invoke-direct {v0, v3, v9}, Lcom/zhawoilah/wgxt/data/SampleGxt;->entry(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-result-object v3

    const/4 v9, 0x5

    aput-object v3, v2, v9

    .line 19
    const-string v3, "BUSTED"

    const-string v10, "~r~BUSTED"

    invoke-direct {v0, v3, v10}, Lcom/zhawoilah/wgxt/data/SampleGxt;->entry(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-result-object v3

    const/4 v10, 0x6

    aput-object v3, v2, v10

    .line 20
    const-string v3, "MISSED"

    const-string v10, "Mission failed!~n~Try again."

    invoke-direct {v0, v3, v10}, Lcom/zhawoilah/wgxt/data/SampleGxt;->entry(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-result-object v3

    const/4 v10, 0x7

    aput-object v3, v2, v10

    .line 21
    new-instance v11, Lcom/zhawoilah/wgxt/data/GxtEntry;

    sget-object v3, Lcom/zhawoilah/wgxt/data/GxtParser;->INSTANCE:Lcom/zhawoilah/wgxt/data/GxtParser;

    const-wide/32 v12, 0x1a2b3c4d

    invoke-virtual {v3, v12, v13}, Lcom/zhawoilah/wgxt/data/GxtParser;->hashHex(J)Ljava/lang/String;

    move-result-object v12

    const/4 v15, 0x1

    .line 22
    const-string v16, "This key isn\'t in the name list, so it shows its hash instead."

    const-wide/32 v13, 0x1a2b3c4d

    .line 21
    invoke-direct/range {v11 .. v16}, Lcom/zhawoilah/wgxt/data/GxtEntry;-><init>(Ljava/lang/String;JZLjava/lang/String;)V

    const/16 v3, 0x8

    aput-object v11, v2, v3

    .line 12
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 10
    const-string v10, "MAIN"

    invoke-direct {v1, v10, v2}, Lcom/zhawoilah/wgxt/data/GxtTable;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 25
    new-instance v2, Lcom/zhawoilah/wgxt/data/GxtTable;

    .line 28
    new-array v9, v9, [Lcom/zhawoilah/wgxt/data/GxtEntry;

    const-string v10, "MONEY"

    const-string v11, "$"

    invoke-direct {v0, v10, v11}, Lcom/zhawoilah/wgxt/data/SampleGxt;->entry(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-result-object v10

    aput-object v10, v9, v4

    .line 29
    const-string v10, "HEALTH"

    const-string v11, "Health"

    invoke-direct {v0, v10, v11}, Lcom/zhawoilah/wgxt/data/SampleGxt;->entry(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-result-object v10

    aput-object v10, v9, v5

    .line 30
    const-string v10, "ARMOUR"

    const-string v11, "Armour"

    invoke-direct {v0, v10, v11}, Lcom/zhawoilah/wgxt/data/SampleGxt;->entry(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-result-object v10

    aput-object v10, v9, v6

    .line 31
    const-string v10, "WANTED"

    const-string v11, "Wanted Level"

    invoke-direct {v0, v10, v11}, Lcom/zhawoilah/wgxt/data/SampleGxt;->entry(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-result-object v10

    aput-object v10, v9, v7

    .line 32
    const-string v7, "RESPECT"

    const-string v10, "Respect"

    invoke-direct {v0, v7, v10}, Lcom/zhawoilah/wgxt/data/SampleGxt;->entry(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtEntry;

    move-result-object v7

    aput-object v7, v9, v8

    .line 27
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 25
    const-string v8, "HUD"

    invoke-direct {v2, v8, v7}, Lcom/zhawoilah/wgxt/data/GxtTable;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 35
    new-instance v7, Lcom/zhawoilah/wgxt/data/GxtDocument;

    sget-object v8, Lcom/zhawoilah/wgxt/data/GxtGame;->SA:Lcom/zhawoilah/wgxt/data/GxtGame;

    new-array v6, v6, [Lcom/zhawoilah/wgxt/data/GxtTable;

    aput-object v1, v6, v4

    aput-object v2, v6, v5

    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v7, v8, v3, v1}, Lcom/zhawoilah/wgxt/data/GxtDocument;-><init>(Lcom/zhawoilah/wgxt/data/GxtGame;ILjava/util/List;)V

    return-object v7
.end method
