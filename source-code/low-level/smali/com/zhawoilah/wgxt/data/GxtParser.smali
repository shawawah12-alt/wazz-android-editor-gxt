.class public final Lcom/zhawoilah/wgxt/data/GxtParser;
.super Ljava/lang/Object;
.source "GxtParser.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zhawoilah/wgxt/data/GxtParser$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGxtParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GxtParser.kt\ncom/zhawoilah/wgxt/data/GxtParser\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1563#2:108\n1634#2,3:109\n1617#2,9:112\n1869#2:121\n1563#2:122\n1634#2,3:123\n1870#2:128\n1626#2:129\n1#3:126\n1#3:127\n*S KotlinDebug\n*F\n+ 1 GxtParser.kt\ncom/zhawoilah/wgxt/data/GxtParser\n*L\n45#1:108\n45#1:109,3\n68#1:112,9\n68#1:121\n89#1:122\n89#1:123,3\n68#1:128\n68#1:129\n68#1:127\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J.\u0010\u0008\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000c0\u000bJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002JD\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000cH\u0002J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\r\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/zhawoilah/wgxt/data/GxtParser;",
        "",
        "<init>",
        "()V",
        "detect",
        "Lcom/zhawoilah/wgxt/data/GxtGame;",
        "data",
        "",
        "parse",
        "Lcom/zhawoilah/wgxt/data/GxtDocument;",
        "resolver",
        "Lkotlin/Function1;",
        "",
        "",
        "",
        "parseIII",
        "parseTabl",
        "tablStart",
        "",
        "entrySize",
        "bits",
        "game",
        "map",
        "hashHex",
        "h",
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

.field public static final INSTANCE:Lcom/zhawoilah/wgxt/data/GxtParser;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtParser;

    invoke-direct {v0}, Lcom/zhawoilah/wgxt/data/GxtParser;-><init>()V

    sput-object v0, Lcom/zhawoilah/wgxt/data/GxtParser;->INSTANCE:Lcom/zhawoilah/wgxt/data/GxtParser;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final parseIII([B)Lcom/zhawoilah/wgxt/data/GxtDocument;
    .locals 12

    const/4 v0, 0x4

    .line 35
    invoke-static {p1, v0}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->le32([BI)I

    move-result v0

    .line 36
    div-int/lit8 v1, v0, 0xc

    .line 37
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/16 v3, 0x8

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v1, :cond_0

    .line 40
    invoke-static {p1, v3}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->le32([BI)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    add-int/lit8 v6, v3, 0x4

    invoke-static {p1, v6}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->name8([BI)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0xc

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    add-int/2addr v0, v1

    .line 45
    check-cast v2, Ljava/lang/Iterable;

    .line 108
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v3, Ljava/util/Collection;

    .line 109
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 110
    check-cast v4, Lkotlin/Pair;

    invoke-virtual {v4}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-virtual {v4}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Ljava/lang/String;

    .line 46
    new-instance v6, Lcom/zhawoilah/wgxt/data/GxtEntry;

    add-int/2addr v5, v0

    invoke-static {p1, v5, v1}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->readText([BII)Ljava/lang/String;

    move-result-object v11

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/zhawoilah/wgxt/data/GxtEntry;-><init>(Ljava/lang/String;JZLjava/lang/String;)V

    .line 110
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 111
    :cond_1
    check-cast v3, Ljava/util/List;

    .line 48
    new-instance p1, Lcom/zhawoilah/wgxt/data/GxtDocument;

    sget-object v0, Lcom/zhawoilah/wgxt/data/GxtGame;->III:Lcom/zhawoilah/wgxt/data/GxtGame;

    new-instance v2, Lcom/zhawoilah/wgxt/data/GxtTable;

    const-string v4, "MAIN"

    invoke-direct {v2, v4, v3}, Lcom/zhawoilah/wgxt/data/GxtTable;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {p1, v0, v1, v2}, Lcom/zhawoilah/wgxt/data/GxtDocument;-><init>(Lcom/zhawoilah/wgxt/data/GxtGame;ILjava/util/List;)V

    return-object p1
.end method

.method private final parseTabl([BIIILcom/zhawoilah/wgxt/data/GxtGame;Ljava/util/Map;)Lcom/zhawoilah/wgxt/data/GxtDocument;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([BIII",
            "Lcom/zhawoilah/wgxt/data/GxtGame;",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/zhawoilah/wgxt/data/GxtDocument;"
        }
    .end annotation

    move-object/from16 v0, p1

    move/from16 v1, p3

    move/from16 v2, p4

    add-int/lit8 v3, p2, 0x4

    .line 59
    invoke-static {v0, v3}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->le32([BI)I

    move-result v3

    .line 60
    div-int/lit8 v3, v3, 0xc

    const/16 v4, 0x8

    add-int/lit8 v5, p2, 0x8

    .line 62
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v3, :cond_0

    .line 64
    invoke-static {v0, v5}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->name8([BI)Ljava/lang/String;

    move-result-object v9

    add-int/lit8 v10, v5, 0x8

    invoke-static {v0, v10}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->le32([BI)I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0xc

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 68
    :cond_0
    check-cast v6, Ljava/lang/Iterable;

    .line 112
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .line 121
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 120
    check-cast v6, Lkotlin/Pair;

    invoke-virtual {v6}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-virtual {v6}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    const/4 v9, 0x0

    if-lez v6, :cond_3

    .line 69
    array-length v10, v0

    if-lt v6, v10, :cond_1

    goto :goto_2

    .line 71
    :cond_1
    invoke-static {v0, v6}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->tagAt([BI)Ljava/lang/String;

    move-result-object v10

    const-string v11, "TKEY"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    add-int/lit8 v6, v6, 0x8

    .line 72
    :cond_2
    invoke-static {v0, v6}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->tagAt([BI)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_4

    :cond_3
    :goto_2
    move-object/from16 v10, p6

    move/from16 v16, v4

    goto/16 :goto_8

    :cond_4
    add-int/lit8 v10, v6, 0x4

    .line 73
    invoke-static {v0, v10}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->le32([BI)I

    move-result v10

    .line 74
    div-int v11, v10, v1

    add-int/lit8 v6, v6, 0x8

    .line 76
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v11}, Ljava/util/ArrayList;-><init>(I)V

    move v14, v6

    const/4 v13, 0x0

    :goto_3
    if-ge v13, v11, :cond_6

    .line 78
    invoke-static {v0, v14}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->le32([BI)I

    move-result v15

    if-ne v1, v4, :cond_5

    move/from16 v16, v4

    add-int/lit8 v4, v14, 0x4

    .line 80
    invoke-static {v0, v4}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->le32([BI)I

    move-result v4

    move-object/from16 v17, v8

    int-to-long v7, v4

    const-wide v18, 0xffffffffL

    and-long v7, v7, v18

    .line 81
    new-instance v4, Lkotlin/Triple;

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-direct {v4, v15, v7, v9}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    move/from16 v16, v4

    move-object/from16 v17, v8

    .line 83
    new-instance v4, Lkotlin/Triple;

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const-wide/16 v18, 0x0

    invoke-static/range {v18 .. v19}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    add-int/lit8 v15, v14, 0x4

    invoke-static {v0, v15}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->name8([BI)Ljava/lang/String;

    move-result-object v15

    invoke-direct {v4, v7, v8, v15}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_4
    add-int/2addr v14, v1

    add-int/lit8 v13, v13, 0x1

    move/from16 v4, v16

    move-object/from16 v8, v17

    goto :goto_3

    :cond_6
    move/from16 v16, v4

    move-object/from16 v17, v8

    add-int/2addr v6, v10

    add-int/lit8 v6, v6, 0x8

    .line 89
    check-cast v12, Ljava/lang/Iterable;

    .line 122
    new-instance v4, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v12, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v4, Ljava/util/Collection;

    .line 123
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 124
    check-cast v8, Lkotlin/Triple;

    invoke-virtual {v8}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v9

    invoke-virtual {v8}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    move-result-wide v20

    invoke-virtual {v8}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v8

    move-object v11, v8

    check-cast v11, Ljava/lang/String;

    add-int/2addr v9, v6

    .line 90
    invoke-static {v0, v9, v2}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->readText([BII)Ljava/lang/String;

    move-result-object v23

    if-eqz v11, :cond_7

    .line 92
    new-instance v10, Lcom/zhawoilah/wgxt/data/GxtEntry;

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v15, v23

    invoke-direct/range {v10 .. v15}, Lcom/zhawoilah/wgxt/data/GxtEntry;-><init>(Ljava/lang/String;JZLjava/lang/String;)V

    move-object v8, v10

    move-object/from16 v10, p6

    goto :goto_7

    .line 94
    :cond_7
    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    move-object/from16 v10, p6

    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v19, v8

    check-cast v19, Ljava/lang/String;

    if-eqz v19, :cond_8

    .line 95
    new-instance v18, Lcom/zhawoilah/wgxt/data/GxtEntry;

    const/16 v22, 0x0

    invoke-direct/range {v18 .. v23}, Lcom/zhawoilah/wgxt/data/GxtEntry;-><init>(Ljava/lang/String;JZLjava/lang/String;)V

    goto :goto_6

    :cond_8
    move-wide/from16 v8, v20

    .line 96
    new-instance v18, Lcom/zhawoilah/wgxt/data/GxtEntry;

    sget-object v11, Lcom/zhawoilah/wgxt/data/GxtParser;->INSTANCE:Lcom/zhawoilah/wgxt/data/GxtParser;

    invoke-virtual {v11, v8, v9}, Lcom/zhawoilah/wgxt/data/GxtParser;->hashHex(J)Ljava/lang/String;

    move-result-object v19

    const/16 v22, 0x1

    invoke-direct/range {v18 .. v23}, Lcom/zhawoilah/wgxt/data/GxtEntry;-><init>(Ljava/lang/String;JZLjava/lang/String;)V

    :goto_6
    move-object/from16 v8, v18

    .line 124
    :goto_7
    invoke-interface {v4, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_9
    move-object/from16 v10, p6

    .line 125
    check-cast v4, Ljava/util/List;

    .line 100
    move-object/from16 v8, v17

    check-cast v8, Ljava/lang/CharSequence;

    invoke-interface {v8}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-nez v6, :cond_a

    const-string v8, "MAIN"

    :cond_a
    check-cast v8, Ljava/lang/String;

    new-instance v9, Lcom/zhawoilah/wgxt/data/GxtTable;

    invoke-direct {v9, v8, v4}, Lcom/zhawoilah/wgxt/data/GxtTable;-><init>(Ljava/lang/String;Ljava/util/List;)V

    :goto_8
    if-eqz v9, :cond_b

    .line 120
    invoke-interface {v3, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_b
    move/from16 v4, v16

    goto/16 :goto_1

    .line 129
    :cond_c
    check-cast v3, Ljava/util/List;

    .line 102
    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtDocument;

    move-object/from16 v1, p5

    invoke-direct {v0, v1, v2, v3}, Lcom/zhawoilah/wgxt/data/GxtDocument;-><init>(Lcom/zhawoilah/wgxt/data/GxtGame;ILjava/util/List;)V

    return-object v0
.end method


# virtual methods
.method public final detect([B)Lcom/zhawoilah/wgxt/data/GxtGame;
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    array-length v0, p1

    const/16 v1, 0x8

    if-ge v0, v1, :cond_0

    sget-object p1, Lcom/zhawoilah/wgxt/data/GxtGame;->UNKNOWN:Lcom/zhawoilah/wgxt/data/GxtGame;

    return-object p1

    :cond_0
    const/4 v0, 0x0

    .line 11
    invoke-static {p1, v0}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->tagAt([BI)Ljava/lang/String;

    move-result-object v0

    .line 12
    const-string v1, "TKEY"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object p1, Lcom/zhawoilah/wgxt/data/GxtGame;->III:Lcom/zhawoilah/wgxt/data/GxtGame;

    return-object p1

    .line 13
    :cond_1
    const-string v1, "TABL"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lcom/zhawoilah/wgxt/data/GxtGame;->VC:Lcom/zhawoilah/wgxt/data/GxtGame;

    return-object p1

    :cond_2
    const/4 v0, 0x4

    .line 14
    invoke-static {p1, v0}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->tagAt([BI)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lcom/zhawoilah/wgxt/data/GxtGame;->SA:Lcom/zhawoilah/wgxt/data/GxtGame;

    return-object p1

    :cond_3
    sget-object p1, Lcom/zhawoilah/wgxt/data/GxtGame;->UNKNOWN:Lcom/zhawoilah/wgxt/data/GxtGame;

    return-object p1
.end method

.method public final hashHex(J)Ljava/lang/String;
    .locals 1

    const/16 v0, 0x10

    .line 105
    invoke-static {v0}, Lkotlin/text/CharsKt;->checkRadix(I)I

    move-result v0

    invoke-static {p1, p2, v0}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, p2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "toUpperCase(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p2, 0x8

    const/16 v0, 0x30

    invoke-static {p1, p2, v0}, Lkotlin/text/StringsKt;->padStart(Ljava/lang/String;IC)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "0x"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final parse([BLkotlin/jvm/functions/Function1;)Lcom/zhawoilah/wgxt/data/GxtDocument;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/zhawoilah/wgxt/data/GxtGame;",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/Long;",
            "Ljava/lang/String;",
            ">;>;)",
            "Lcom/zhawoilah/wgxt/data/GxtDocument;"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    .line 20
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/zhawoilah/wgxt/data/GxtParser;->detect([B)Lcom/zhawoilah/wgxt/data/GxtGame;

    move-result-object v1

    sget-object v2, Lcom/zhawoilah/wgxt/data/GxtParser$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v1}, Lcom/zhawoilah/wgxt/data/GxtGame;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-eq v1, v2, :cond_2

    const/4 v3, 0x3

    if-eq v1, v3, :cond_0

    .line 27
    new-instance p1, Lcom/zhawoilah/wgxt/data/GxtDocument;

    sget-object p2, Lcom/zhawoilah/wgxt/data/GxtGame;->UNKNOWN:Lcom/zhawoilah/wgxt/data/GxtGame;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-direct {p1, p2, v0, v1}, Lcom/zhawoilah/wgxt/data/GxtDocument;-><init>(Lcom/zhawoilah/wgxt/data/GxtGame;ILjava/util/List;)V

    return-object p1

    .line 24
    :cond_0
    invoke-static {p1, v2}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->le16([BI)I

    move-result v1

    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    move v7, v2

    goto :goto_0

    :cond_1
    move v7, v0

    .line 25
    :goto_0
    sget-object v8, Lcom/zhawoilah/wgxt/data/GxtGame;->SA:Lcom/zhawoilah/wgxt/data/GxtGame;

    sget-object v1, Lcom/zhawoilah/wgxt/data/GxtGame;->SA:Lcom/zhawoilah/wgxt/data/GxtGame;

    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    move-object v9, p2

    check-cast v9, Ljava/util/Map;

    const/4 v5, 0x4

    const/16 v6, 0x8

    move-object v3, p0

    move-object v4, p1

    invoke-direct/range {v3 .. v9}, Lcom/zhawoilah/wgxt/data/GxtParser;->parseTabl([BIIILcom/zhawoilah/wgxt/data/GxtGame;Ljava/util/Map;)Lcom/zhawoilah/wgxt/data/GxtDocument;

    move-result-object p1

    return-object p1

    :cond_2
    move-object v2, p1

    .line 22
    sget-object v6, Lcom/zhawoilah/wgxt/data/GxtGame;->VC:Lcom/zhawoilah/wgxt/data/GxtGame;

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v7

    const/4 v3, 0x0

    const/16 v4, 0xc

    const/16 v5, 0x10

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lcom/zhawoilah/wgxt/data/GxtParser;->parseTabl([BIIILcom/zhawoilah/wgxt/data/GxtGame;Ljava/util/Map;)Lcom/zhawoilah/wgxt/data/GxtDocument;

    move-result-object p1

    return-object p1

    :cond_3
    move-object v2, p1

    .line 21
    invoke-direct {p0, v2}, Lcom/zhawoilah/wgxt/data/GxtParser;->parseIII([B)Lcom/zhawoilah/wgxt/data/GxtDocument;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 30
    :catch_0
    new-instance p1, Lcom/zhawoilah/wgxt/data/GxtDocument;

    sget-object p2, Lcom/zhawoilah/wgxt/data/GxtGame;->UNKNOWN:Lcom/zhawoilah/wgxt/data/GxtGame;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-direct {p1, p2, v0, v1}, Lcom/zhawoilah/wgxt/data/GxtDocument;-><init>(Lcom/zhawoilah/wgxt/data/GxtGame;ILjava/util/List;)V

    return-object p1
.end method
