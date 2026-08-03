.class public final Lcom/zhawoilah/wgxt/data/GxtToken;
.super Ljava/lang/Object;
.source "GxtTokens.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/zhawoilah/wgxt/data/GxtToken;",
        "",
        "token",
        "",
        "label",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "getToken",
        "()Ljava/lang/String;",
        "getLabel",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
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
.field private final label:Ljava/lang/String;

.field private final token:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->token:Ljava/lang/String;

    iput-object p2, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->label:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/zhawoilah/wgxt/data/GxtToken;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/zhawoilah/wgxt/data/GxtToken;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->token:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->label:Ljava/lang/String;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/zhawoilah/wgxt/data/GxtToken;->copy(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtToken;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->token:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;)Lcom/zhawoilah/wgxt/data/GxtToken;
    .locals 1

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "label"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zhawoilah/wgxt/data/GxtToken;

    invoke-direct {v0, p1, p2}, Lcom/zhawoilah/wgxt/data/GxtToken;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zhawoilah/wgxt/data/GxtToken;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zhawoilah/wgxt/data/GxtToken;

    iget-object v1, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->token:Ljava/lang/String;

    iget-object v3, p1, Lcom/zhawoilah/wgxt/data/GxtToken;->token:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->label:Ljava/lang/String;

    iget-object p1, p1, Lcom/zhawoilah/wgxt/data/GxtToken;->label:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 3

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v0

    const-string v1, "id"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :indo

    const-string v1, "in"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :original

    :indo
    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->label:Ljava/lang/String;

    const-string v1, "New line"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_0

    const-string v0, "Baris baru"

    return-object v0

    :next_0

    const-string v1, "White"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_1

    const-string v0, "Putih"

    return-object v0

    :next_1

    const-string v1, "Red"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_2

    const-string v0, "Merah"

    return-object v0

    :next_2

    const-string v1, "Green"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_3

    const-string v0, "Hijau"

    return-object v0

    :next_3

    const-string v1, "Blue"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_4

    const-string v0, "Biru"

    return-object v0

    :next_4

    const-string v1, "Yellow"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_5

    const-string v0, "Kuning"

    return-object v0

    :next_5

    const-string v1, "Purple"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_6

    const-string v0, "Ungu"

    return-object v0

    :next_6

    const-string v1, "Black"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_7

    const-string v0, "Hitam"

    return-object v0

    :next_7

    const-string v1, "Highlight"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_8

    const-string v0, "Sorotan"

    return-object v0

    :next_8

    const-string v1, "Number"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_9

    const-string v0, "Angka"

    return-object v0

    :next_9

    const-string v1, "String"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_10

    const-string v0, "Teks"

    return-object v0

    :next_10

    const-string v1, "Key"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_11

    const-string v0, "Tombol"

    return-object v0

    :next_11

    const-string v1, "White (default text)"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_12

    const-string v0, "Putih (warna teks bawaan)"

    return-object v0

    :next_12

    const-string v1, "Purple / pink"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_13

    const-string v0, "Ungu / merah muda"

    return-object v0

    :next_13

    const-string v1, "Orange"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_14

    const-string v0, "Oranye"

    return-object v0

    :next_14

    const-string v1, "Light pink"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_15

    const-string v0, "Merah muda terang"

    return-object v0

    :next_15

    const-string v1, "Grey / soft white"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_16

    const-string v0, "Abu-abu / putih lembut"

    return-object v0

    :next_16

    const-string v1, "New line (line break)"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_17

    const-string v0, "Baris baru"

    return-object v0

    :next_17

    const-string v1, "Highlight / bright white"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_18

    const-string v0, "Sorotan / putih terang"

    return-object v0

    :next_18

    const-string v1, "Reset to standard style"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_19

    const-string v0, "Kembalikan gaya standar"

    return-object v0

    :next_19

    const-string v1, "Insert a string value"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_20

    const-string v0, "Sisipkan nilai teks"

    return-object v0

    :next_20

    const-string v1, "Insert a number value"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_21

    const-string v0, "Sisipkan nilai angka"

    return-object v0

    :next_21

    const-string v1, "Shows a control / key binding"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_22

    const-string v0, "Tampilkan tombol kontrol"

    return-object v0

    :next_22

    const-string v1, "Left"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_23

    const-string v0, "Kiri"

    return-object v0

    :next_23

    const-string v1, "Right"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_24

    const-string v0, "Kanan"

    return-object v0

    :next_24

    const-string v1, "Up"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_25

    const-string v0, "Atas"

    return-object v0

    :next_25

    const-string v1, "Down"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :next_26

    const-string v0, "Bawah"

    return-object v0

    :next_26

    :original
    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final getToken()Ljava/lang/String;
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->token:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->token:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->label:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->token:Ljava/lang/String;

    iget-object v1, p0, Lcom/zhawoilah/wgxt/data/GxtToken;->label:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "GxtToken(token="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", label="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
