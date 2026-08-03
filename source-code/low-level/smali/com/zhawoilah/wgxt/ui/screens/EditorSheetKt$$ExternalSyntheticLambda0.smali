.class public final synthetic Lcom/zhawoilah/wgxt/ui/screens/EditorSheetKt$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "D8$$SyntheticClass"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic f$0:Landroidx/compose/runtime/MutableState;

.field public final synthetic f$1:J

.field public final synthetic f$2:Ljava/lang/String;

.field public final synthetic f$3:Ljava/lang/String;

.field public final synthetic f$4:Lkotlin/jvm/functions/Function0;

.field public final synthetic f$5:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/MutableState;JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zhawoilah/wgxt/ui/screens/EditorSheetKt$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/runtime/MutableState;

    iput-wide p2, p0, Lcom/zhawoilah/wgxt/ui/screens/EditorSheetKt$$ExternalSyntheticLambda0;->f$1:J

    iput-object p4, p0, Lcom/zhawoilah/wgxt/ui/screens/EditorSheetKt$$ExternalSyntheticLambda0;->f$2:Ljava/lang/String;

    iput-object p5, p0, Lcom/zhawoilah/wgxt/ui/screens/EditorSheetKt$$ExternalSyntheticLambda0;->f$3:Ljava/lang/String;

    iput-object p6, p0, Lcom/zhawoilah/wgxt/ui/screens/EditorSheetKt$$ExternalSyntheticLambda0;->f$4:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/zhawoilah/wgxt/ui/screens/EditorSheetKt$$ExternalSyntheticLambda0;->f$5:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 0
    iget-object v0, p0, Lcom/zhawoilah/wgxt/ui/screens/EditorSheetKt$$ExternalSyntheticLambda0;->f$0:Landroidx/compose/runtime/MutableState;

    iget-wide v1, p0, Lcom/zhawoilah/wgxt/ui/screens/EditorSheetKt$$ExternalSyntheticLambda0;->f$1:J

    iget-object v3, p0, Lcom/zhawoilah/wgxt/ui/screens/EditorSheetKt$$ExternalSyntheticLambda0;->f$2:Ljava/lang/String;

    iget-object v4, p0, Lcom/zhawoilah/wgxt/ui/screens/EditorSheetKt$$ExternalSyntheticLambda0;->f$3:Ljava/lang/String;

    iget-object v5, p0, Lcom/zhawoilah/wgxt/ui/screens/EditorSheetKt$$ExternalSyntheticLambda0;->f$4:Lkotlin/jvm/functions/Function0;

    iget-object v6, p0, Lcom/zhawoilah/wgxt/ui/screens/EditorSheetKt$$ExternalSyntheticLambda0;->f$5:Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    check-cast v7, Landroidx/compose/foundation/layout/ColumnScope;

    move-object v8, p2

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-static/range {v0 .. v9}, Lcom/zhawoilah/wgxt/ui/screens/EditorSheetKt;->$r8$lambda$LXnlQKivqwg712q1S013OfMmYlc(Landroidx/compose/runtime/MutableState;JLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
