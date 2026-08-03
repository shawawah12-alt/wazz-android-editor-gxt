.class public final synthetic Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda9;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Lcom/zhawoilah/wgxt/data/GxtTable;

.field public final synthetic f$1:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/zhawoilah/wgxt/data/GxtTable;Ljava/util/List;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda9;->f$0:Lcom/zhawoilah/wgxt/data/GxtTable;

    iput-object p2, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda9;->f$1:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda9;->f$0:Lcom/zhawoilah/wgxt/data/GxtTable;

    iget-object v1, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda9;->f$1:Ljava/util/List;

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-static {v0, v1, p1, p2}, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt;->$r8$lambda$knBJe2N7EC2WCI7ld1WQY5LJdLQ(Lcom/zhawoilah/wgxt/data/GxtTable;Ljava/util/List;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
