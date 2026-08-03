.class public final synthetic Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


# instance fields
.field public final synthetic f$0:Landroidx/activity/compose/ManagedActivityResultLauncher;

.field public final synthetic f$1:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Landroidx/compose/runtime/State;

.field public final synthetic f$4:Landroidx/activity/compose/ManagedActivityResultLauncher;

.field public final synthetic f$5:Landroidx/compose/runtime/State;

.field public final synthetic f$6:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$7:Landroidx/compose/runtime/State;

.field public final synthetic f$8:Landroidx/compose/runtime/State;

.field public final synthetic f$9:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Landroidx/activity/compose/ManagedActivityResultLauncher;Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Ljava/lang/String;Landroidx/compose/runtime/State;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$0:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p2, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$1:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    iput-object p3, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$3:Landroidx/compose/runtime/State;

    iput-object p5, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$4:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iput-object p6, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$5:Landroidx/compose/runtime/State;

    iput-object p7, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$6:Landroidx/compose/runtime/MutableState;

    iput-object p8, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$7:Landroidx/compose/runtime/State;

    iput-object p9, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$8:Landroidx/compose/runtime/State;

    iput-object p10, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$9:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 0
    iget-object v0, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$0:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$1:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    iget-object v2, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$2:Ljava/lang/String;

    iget-object v3, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$3:Landroidx/compose/runtime/State;

    iget-object v4, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$4:Landroidx/activity/compose/ManagedActivityResultLauncher;

    iget-object v5, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$5:Landroidx/compose/runtime/State;

    iget-object v6, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$6:Landroidx/compose/runtime/MutableState;

    iget-object v7, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$7:Landroidx/compose/runtime/State;

    iget-object v8, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$8:Landroidx/compose/runtime/State;

    iget-object v9, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda6;->f$9:Landroidx/compose/runtime/MutableState;

    move-object v10, p1

    check-cast v10, Landroidx/compose/animation/AnimatedContentScope;

    move-object/from16 v11, p2

    check-cast v11, Lcom/zhawoilah/wgxt/ui/Screen;

    move-object/from16 v12, p3

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p4

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static/range {v0 .. v13}, Lcom/zhawoilah/wgxt/ui/WazzAppKt;->$r8$lambda$QvWw7UN3CG9-WVfbpy-ceJzPC_w(Landroidx/activity/compose/ManagedActivityResultLauncher;Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Ljava/lang/String;Landroidx/compose/runtime/State;Landroidx/activity/compose/ManagedActivityResultLauncher;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/animation/AnimatedContentScope;Lcom/zhawoilah/wgxt/ui/Screen;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
