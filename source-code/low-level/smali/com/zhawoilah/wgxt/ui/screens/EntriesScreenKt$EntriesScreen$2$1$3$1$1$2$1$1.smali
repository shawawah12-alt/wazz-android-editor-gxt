.class final Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$EntriesScreen$2$1$3$1$1$2$1$1;
.super Ljava/lang/Object;
.source "EntriesScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt;->EntriesScreen(Lcom/zhawoilah/wgxt/data/GxtTable;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function0<",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $onOpenEntry:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $row:Lcom/zhawoilah/wgxt/ui/screens/RowItem;


# direct methods
.method constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/zhawoilah/wgxt/ui/screens/RowItem;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/zhawoilah/wgxt/ui/screens/RowItem;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$EntriesScreen$2$1$3$1$1$2$1$1;->$onOpenEntry:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$EntriesScreen$2$1$3$1$1$2$1$1;->$row:Lcom/zhawoilah/wgxt/ui/screens/RowItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 138
    invoke-virtual {p0}, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$EntriesScreen$2$1$3$1$1$2$1$1;->invoke()V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 138
    iget-object v0, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$EntriesScreen$2$1$3$1$1$2$1$1;->$onOpenEntry:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$EntriesScreen$2$1$3$1$1$2$1$1;->$row:Lcom/zhawoilah/wgxt/ui/screens/RowItem;

    invoke-virtual {v1}, Lcom/zhawoilah/wgxt/ui/screens/RowItem;->getEntryIndex()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
