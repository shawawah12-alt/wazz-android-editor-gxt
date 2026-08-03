.class public final synthetic Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda2;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic f$0:Ljava/lang/String;

.field public final synthetic f$1:Z

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Z

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda2;->f$0:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda2;->f$1:Z

    iput-object p3, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda2;->f$2:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda2;->f$3:Z

    iput-object p5, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda2;->f$4:Lkotlin/jvm/functions/Function0;

    iput p6, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda2;->f$5:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    iget-object v0, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda2;->f$0:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda2;->f$1:Z

    iget-object v2, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda2;->f$2:Ljava/lang/String;

    iget-boolean v3, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda2;->f$3:Z

    iget-object v4, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda2;->f$4:Lkotlin/jvm/functions/Function0;

    iget v5, p0, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt$$ExternalSyntheticLambda2;->f$5:I

    move-object v6, p1

    check-cast v6, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-static/range {v0 .. v7}, Lcom/zhawoilah/wgxt/ui/screens/EntriesScreenKt;->$r8$lambda$TVjpwa54h7QwWb-QrptuiQcJeW4(Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
