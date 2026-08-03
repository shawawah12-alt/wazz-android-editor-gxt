.class final Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1;
.super Ljava/lang/Object;
.source "TablesScreen.kt"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt;->TablesScreen(Lcom/zhawoilah/wgxt/data/GxtDocument;Ljava/lang/String;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2<",
        "Landroidx/compose/runtime/Composer;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTablesScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TablesScreen.kt\ncom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,168:1\n1128#2,6:169\n*S KotlinDebug\n*F\n+ 1 TablesScreen.kt\ncom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1\n*L\n115#1:169,6\n*E\n"
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
.field final synthetic $index:I

.field final synthetic $onOpenTable:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $table:Lcom/zhawoilah/wgxt/data/GxtTable;


# direct methods
.method constructor <init>(Lcom/zhawoilah/wgxt/data/GxtTable;Lkotlin/jvm/functions/Function1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/zhawoilah/wgxt/data/GxtTable;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1;->$table:Lcom/zhawoilah/wgxt/data/GxtTable;

    iput-object p2, p0, Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1;->$onOpenTable:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1;->$index:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 111
    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1;->invoke(Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "C114@4913L22,111@4774L184:TablesScreen.kt#8qvhv2"

    invoke-static {p1, v0}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    invoke-interface {p1, v0, v1}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, -0x1

    const-string v1, "com.zhawoilah.wgxt.ui.screens.TablesScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TablesScreen.kt:111)"

    const v3, -0x7de64597

    invoke-static {v3, p2, v0, v1}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 113
    :cond_1
    iget-object p2, p0, Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1;->$table:Lcom/zhawoilah/wgxt/data/GxtTable;

    invoke-virtual {p2}, Lcom/zhawoilah/wgxt/data/GxtTable;->getName()Ljava/lang/String;

    move-result-object p2

    .line 114
    iget-object v0, p0, Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1;->$table:Lcom/zhawoilah/wgxt/data/GxtTable;

    invoke-virtual {v0}, Lcom/zhawoilah/wgxt/data/GxtTable;->getEntries()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const v1, 0x6294d85f

    const-string v3, "CC(remember):TablesScreen.kt#9igjgp"

    .line 115
    invoke-static {p1, v1, v3}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    iget-object v1, p0, Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1;->$onOpenTable:Lkotlin/jvm/functions/Function1;

    invoke-interface {p1, v1}, Landroidx/compose/runtime/Composer;->changed(Ljava/lang/Object;)Z

    move-result v1

    iget v3, p0, Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1;->$index:I

    invoke-interface {p1, v3}, Landroidx/compose/runtime/Composer;->changed(I)Z

    move-result v3

    or-int/2addr v1, v3

    iget-object v3, p0, Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1;->$onOpenTable:Lkotlin/jvm/functions/Function1;

    iget v4, p0, Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1;->$index:I

    .line 169
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_2

    .line 170
    sget-object v1, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v1}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_3

    .line 115
    :cond_2
    new-instance v1, Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1$1$1;

    invoke-direct {v1, v3, v4}, Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt$TablesScreen$3$1$1$1$1$1$1;-><init>(Lkotlin/jvm/functions/Function1;I)V

    move-object v5, v1

    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 172
    invoke-interface {p1, v5}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 115
    :cond_3
    check-cast v5, Lkotlin/jvm/functions/Function0;

    invoke-static {p1}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 112
    invoke-static {p2, v0, v5, p1, v2}, Lcom/zhawoilah/wgxt/ui/screens/TablesScreenKt;->access$TableRow(Ljava/lang/String;ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    :cond_4
    return-void

    .line 111
    :cond_5
    invoke-interface {p1}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    return-void
.end method
