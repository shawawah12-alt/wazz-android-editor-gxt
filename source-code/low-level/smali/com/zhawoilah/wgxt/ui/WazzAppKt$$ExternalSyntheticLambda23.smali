.class public final synthetic Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda23;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic f$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

.field public final synthetic f$1:Lcom/zhawoilah/wgxt/ui/Screen;


# direct methods
.method public synthetic constructor <init>(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Lcom/zhawoilah/wgxt/ui/Screen;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda23;->f$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    iput-object p2, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda23;->f$1:Lcom/zhawoilah/wgxt/ui/Screen;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 0
    iget-object v0, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda23;->f$0:Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;

    iget-object v1, p0, Lcom/zhawoilah/wgxt/ui/WazzAppKt$$ExternalSyntheticLambda23;->f$1:Lcom/zhawoilah/wgxt/ui/Screen;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, v1, p1}, Lcom/zhawoilah/wgxt/ui/WazzAppKt;->$r8$lambda$jzQmKKVmLuhHjSL0ciXcrp8AmqY(Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;Lcom/zhawoilah/wgxt/ui/Screen;I)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
