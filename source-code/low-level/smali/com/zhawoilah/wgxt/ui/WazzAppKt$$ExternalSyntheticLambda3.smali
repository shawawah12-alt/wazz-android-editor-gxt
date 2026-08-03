.class public final synthetic Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda3;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Landroid/content/Context;

.field public final synthetic f$1:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda3;->f$0:Landroid/content/Context;

    iput-object p2, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda3;->f$1:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda3;->f$0:Landroid/content/Context;

    iget-object v1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda3;->f$1:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, p1}, Lcom/zhawoilah/wgxt/ui/WazzAppKt;->$r8$lambda$g75PGeDwQBbUUA6jACl0M2avPpE(Landroid/content/Context;Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Landroid/net/Uri;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
