.class public final synthetic Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/zhawoilah/wgxt/data/GxtTable;

.field public final synthetic f$1:Ljava/util/List;

.field public final synthetic f$2:Lkotlin/jvm/functions/Function0;


# direct methods
.method public synthetic constructor <init>(Lcom/zhawoilah/wgxt/data/GxtTable;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda6;->f$0:Lcom/zhawoilah/wgxt/data/GxtTable;

    iput-object p2, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda6;->f$1:Ljava/util/List;

    iput-object p3, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda6;->f$2:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda6;->f$0:Lcom/zhawoilah/wgxt/data/GxtTable;

    iget-object v1, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda6;->f$1:Ljava/util/List;

    iget-object v2, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda6;->f$2:Lkotlin/jvm/functions/Function0;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, v2, p1, p2}, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt;->$r8$lambda$B4JxN60m-Rjp0kxEmRrP_y__Z0I(Lcom/zhawoilah/wgxt/data/GxtTable;Ljava/util/List;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
