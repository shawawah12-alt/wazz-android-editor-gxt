.class public final Lcom/zhawoilah/wgxt/data/GxtWriter;
.super Ljava/lang/Object;
.source "GxtWriter.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zhawoilah/wgxt/data/GxtWriter$W;,
        Lcom/zhawoilah/wgxt/data/GxtWriter$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGxtWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GxtWriter.kt\ncom/zhawoilah/wgxt/data/GxtWriter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1068#2:105\n1573#2:106\n1604#2,4:107\n1056#2:111\n*S KotlinDebug\n*F\n+ 1 GxtWriter.kt\ncom/zhawoilah/wgxt/data/GxtWriter\n*L\n34#1:105\n77#1:106\n77#1:107,4\n80#1:111\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ*\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002J:\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002JN\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/zhawoilah/wgxt/data/GxtWriter;",
        "",
        "<init>",
        "()V",
        "write",
        "",
        "doc",
        "Lcom/zhawoilah/wgxt/data/GxtDocument;",
        "textOf",
        "Lkotlin/Function2;",
        "",
        "",
        "writeIII",
        "writeTabl",
        "entrySize",
        "header",
        "",
        "buildTable",
        "Lkotlin/Pair;",
        "table",
        "Lcom/zhawoilah/wgxt/data/GxtTable;",
        "tableOriginalIndex",
        "bits",
        "W",
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

.field public static final INSTANCE:Lcom/zhawoilah/wgxt/data/GxtWriter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtWriter;

    invoke-direct {v0}, Lcom/zhawoilah/wgxt/data/GxtWriter;-><init>()V

    sput-object v0, Lcom/zhawoilah/wgxt/data/GxtWriter;->INSTANCE:Lcom/zhawoilah/wgxt/data/GxtWriter;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final buildTable(Lcom/zhawoilah/wgxt/data/GxtTable;IIILkotlin/jvm/functions/Function2;)Lkotlin/Pair;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zhawoilah/wgxt/data/GxtTable;",
            "III",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)",
            "Lkotlin/Pair<",
            "[B[B>;"
        }
    .end annotation

    .line 77
    invoke-virtual {p1}, Lcom/zhawoilah/wgxt/data/GxtTable;->getEntries()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 106
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 108
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-gez v2, :cond_0

    .line 109
    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_0
    check-cast v3, Lcom/zhawoilah/wgxt/data/GxtEntry;

    .line 78
    new-instance v5, Lcom/zhawoilah/wgxt/data/GxtWriter$W;

    invoke-virtual {v3}, Lcom/zhawoilah/wgxt/data/GxtEntry;->getHash()J

    move-result-wide v6

    invoke-virtual {v3}, Lcom/zhawoilah/wgxt/data/GxtEntry;->getKeyName()Ljava/lang/String;

    move-result-object v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p5, v8, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-direct {v5, v6, v7, v3, v2}, Lcom/zhawoilah/wgxt/data/GxtWriter$W;-><init>(JLjava/lang/String;Ljava/lang/String;)V

    .line 109
    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v4

    goto :goto_0

    .line 110
    :cond_1
    check-cast v0, Ljava/util/List;

    const/16 p1, 0x8

    .line 80
    check-cast v0, Ljava/lang/Iterable;

    if-ne p3, p1, :cond_2

    .line 111
    new-instance p2, Lcom/zhawoilah/wgxt/data/GxtWriter$buildTable$$inlined$sortedBy$1;

    invoke-direct {p2}, Lcom/zhawoilah/wgxt/data/GxtWriter$buildTable$$inlined$sortedBy$1;-><init>()V

    goto :goto_1

    :cond_2
    new-instance p2, Lcom/zhawoilah/wgxt/data/GxtWriter$buildTable$$inlined$sortedBy$2;

    invoke-direct {p2}, Lcom/zhawoilah/wgxt/data/GxtWriter$buildTable$$inlined$sortedBy$2;-><init>()V

    :goto_1
    check-cast p2, Ljava/util/Comparator;

    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p2

    .line 82
    new-instance p5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p5}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 83
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [I

    .line 84
    move-object v2, p2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v3

    move v4, v1

    :goto_2
    if-ge v4, v3, :cond_3

    .line 85
    invoke-virtual {p5}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v5

    aput v5, v0, v4

    .line 86
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/zhawoilah/wgxt/data/GxtWriter$W;

    invoke-virtual {v5}, Lcom/zhawoilah/wgxt/data/GxtWriter$W;->getText()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p4}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->encodeText(Ljava/lang/String;I)[B

    move-result-object v5

    invoke-virtual {p5, v5}, Ljava/io/ByteArrayOutputStream;->write([B)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 88
    :cond_3
    invoke-virtual {p5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p4

    .line 90
    new-instance p5, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p5}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 91
    const-string v3, "TKEY"

    invoke-static {p5, v3}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->writeTag(Ljava/io/ByteArrayOutputStream;Ljava/lang/String;)V

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    mul-int/2addr v3, p3

    invoke-static {p5, v3}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->writeLE32(Ljava/io/ByteArrayOutputStream;I)V

    .line 92
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    :goto_3
    if-ge v1, v2, :cond_5

    .line 93
    aget v3, v0, v1

    invoke-static {p5, v3}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->writeLE32(Ljava/io/ByteArrayOutputStream;I)V

    if-ne p3, p1, :cond_4

    .line 94
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/zhawoilah/wgxt/data/GxtWriter$W;

    invoke-virtual {v3}, Lcom/zhawoilah/wgxt/data/GxtWriter$W;->getHash()J

    move-result-wide v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v3, v3

    invoke-static {p5, v3}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->writeLE32(Ljava/io/ByteArrayOutputStream;I)V

    goto :goto_4

    .line 95
    :cond_4
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/zhawoilah/wgxt/data/GxtWriter$W;

    invoke-virtual {v3}, Lcom/zhawoilah/wgxt/data/GxtWriter$W;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->name8Bytes(Ljava/lang/String;)[B

    move-result-object v3

    invoke-virtual {p5, v3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 98
    :cond_5
    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 99
    const-string p2, "TDAT"

    invoke-static {p1, p2}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->writeTag(Ljava/io/ByteArrayOutputStream;Ljava/lang/String;)V

    array-length p2, p4

    invoke-static {p1, p2}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->writeLE32(Ljava/io/ByteArrayOutputStream;I)V

    invoke-virtual {p1, p4}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 101
    invoke-virtual {p5}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p2

    invoke-virtual {p1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    return-object p1
.end method

.method private final writeIII(Lcom/zhawoilah/wgxt/data/GxtDocument;Lkotlin/jvm/functions/Function2;)[B
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zhawoilah/wgxt/data/GxtDocument;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    .line 19
    invoke-virtual {p1}, Lcom/zhawoilah/wgxt/data/GxtDocument;->getTables()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/zhawoilah/wgxt/data/GxtTable;

    const/16 v4, 0xc

    invoke-virtual {p1}, Lcom/zhawoilah/wgxt/data/GxtDocument;->getBitsPerChar()I

    move-result v5

    const/4 v3, 0x0

    move-object v1, p0

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/zhawoilah/wgxt/data/GxtWriter;->buildTable(Lcom/zhawoilah/wgxt/data/GxtTable;IIILkotlin/jvm/functions/Function2;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    .line 20
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 21
    invoke-virtual {v0, p2}, Ljava/io/ByteArrayOutputStream;->write([B)V

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 22
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    const-string p2, "toByteArray(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final writeTabl(Lcom/zhawoilah/wgxt/data/GxtDocument;IZLkotlin/jvm/functions/Function2;)[B
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zhawoilah/wgxt/data/GxtDocument;",
            "IZ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    .line 31
    invoke-virtual {p1}, Lcom/zhawoilah/wgxt/data/GxtDocument;->getBitsPerChar()I

    move-result v4

    .line 33
    invoke-virtual {p1}, Lcom/zhawoilah/wgxt/data/GxtDocument;->getTables()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->withIndex(Ljava/lang/Iterable;)Ljava/lang/Iterable;

    move-result-object p1

    .line 105
    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtWriter$writeTabl$$inlined$sortedByDescending$1;

    invoke-direct {v0}, Lcom/zhawoilah/wgxt/data/GxtWriter$writeTabl$$inlined$sortedByDescending$1;-><init>()V

    check-cast v0, Ljava/util/Comparator;

    invoke-static {p1, v0}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    .line 35
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    .line 37
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v10, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/collections/IndexedValue;

    invoke-virtual {v0}, Lkotlin/collections/IndexedValue;->component1()I

    move-result v2

    invoke-virtual {v0}, Lkotlin/collections/IndexedValue;->component2()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/zhawoilah/wgxt/data/GxtTable;

    move-object v0, p0

    move v3, p2

    move-object v5, p4

    .line 40
    invoke-direct/range {v0 .. v5}, Lcom/zhawoilah/wgxt/data/GxtWriter;->buildTable(Lcom/zhawoilah/wgxt/data/GxtTable;IIILkotlin/jvm/functions/Function2;)Lkotlin/Pair;

    move-result-object p2

    invoke-virtual {p2}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, [B

    invoke-virtual {p2}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [B

    .line 41
    invoke-virtual {v1}, Lcom/zhawoilah/wgxt/data/GxtTable;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v2, "MAIN"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-array v0, v10, [B

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lcom/zhawoilah/wgxt/data/GxtTable;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->name8Bytes(Ljava/lang/String;)[B

    move-result-object v0

    :goto_1
    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 43
    invoke-virtual {v0, p4}, Ljava/io/ByteArrayOutputStream;->write([B)V

    invoke-virtual {v0, p2}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 44
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p2

    invoke-virtual {v8, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move p2, v3

    move-object p4, v5

    goto :goto_0

    :cond_1
    const/4 p2, 0x4

    if-eqz p3, :cond_2

    move p4, p2

    goto :goto_2

    :cond_2
    move p4, v10

    :goto_2
    add-int/lit8 p4, p4, 0x8

    mul-int/lit8 v0, v6, 0xc

    add-int/2addr p4, v0

    .line 49
    new-array v1, v6, [I

    move v2, v10

    :goto_3
    if-ge v2, v6, :cond_3

    .line 51
    aput p4, v1, v2

    .line 52
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    array-length v3, v3

    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [B

    array-length v5, v5

    add-int/2addr v3, v5

    add-int/2addr p4, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 55
    :cond_3
    new-instance p4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    if-eqz p3, :cond_4

    .line 56
    invoke-static {p4, p2}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->writeLE16(Ljava/io/ByteArrayOutputStream;I)V

    invoke-static {p4, v4}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->writeLE16(Ljava/io/ByteArrayOutputStream;I)V

    .line 57
    :cond_4
    const-string p2, "TABL"

    invoke-static {p4, p2}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->writeTag(Ljava/io/ByteArrayOutputStream;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->writeLE32(Ljava/io/ByteArrayOutputStream;I)V

    move p2, v10

    :goto_4
    if-ge p2, v6, :cond_5

    .line 59
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lkotlin/collections/IndexedValue;

    invoke-virtual {p3}, Lkotlin/collections/IndexedValue;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/zhawoilah/wgxt/data/GxtTable;

    invoke-virtual {p3}, Lcom/zhawoilah/wgxt/data/GxtTable;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->name8Bytes(Ljava/lang/String;)[B

    move-result-object p3

    invoke-virtual {p4, p3}, Ljava/io/ByteArrayOutputStream;->write([B)V

    .line 60
    aget p3, v1, p2

    invoke-static {p4, p3}, Lcom/zhawoilah/wgxt/data/GxtBinaryKt;->writeLE32(Ljava/io/ByteArrayOutputStream;I)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_4

    :cond_5
    :goto_5
    if-ge v10, v6, :cond_6

    .line 63
    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-virtual {p4, p1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    invoke-virtual {p4, p1}, Ljava/io/ByteArrayOutputStream;->write([B)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 65
    :cond_6
    invoke-virtual {p4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1

    const-string p2, "toByteArray(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final write(Lcom/zhawoilah/wgxt/data/GxtDocument;Lkotlin/jvm/functions/Function2;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zhawoilah/wgxt/data/GxtDocument;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    const-string v0, "doc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "textOf"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-virtual {p1}, Lcom/zhawoilah/wgxt/data/GxtDocument;->getGame()Lcom/zhawoilah/wgxt/data/GxtGame;

    move-result-object v0

    sget-object v1, Lcom/zhawoilah/wgxt/data/GxtWriter$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/zhawoilah/wgxt/data/GxtGame;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    const/16 v0, 0xc

    const/4 v1, 0x0

    .line 15
    invoke-direct {p0, p1, v0, v1, p2}, Lcom/zhawoilah/wgxt/data/GxtWriter;->writeTabl(Lcom/zhawoilah/wgxt/data/GxtDocument;IZLkotlin/jvm/functions/Function2;)[B

    move-result-object p1

    return-object p1

    :cond_0
    const/16 v0, 0x8

    .line 14
    invoke-direct {p0, p1, v0, v1, p2}, Lcom/zhawoilah/wgxt/data/GxtWriter;->writeTabl(Lcom/zhawoilah/wgxt/data/GxtDocument;IZLkotlin/jvm/functions/Function2;)[B

    move-result-object p1

    return-object p1

    .line 13
    :cond_1
    invoke-direct {p0, p1, p2}, Lcom/zhawoilah/wgxt/data/GxtWriter;->writeIII(Lcom/zhawoilah/wgxt/data/GxtDocument;Lkotlin/jvm/functions/Function2;)[B

    move-result-object p1

    return-object p1
.end method
