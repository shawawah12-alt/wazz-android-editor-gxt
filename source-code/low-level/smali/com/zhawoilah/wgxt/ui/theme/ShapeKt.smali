.class public final Lcom/zhawoilah/wgxt/ui/theme/ShapeKt;
.super Ljava/lang/Object;
.source "Shape.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shape.kt\ncom/zhawoilah/wgxt/ui/theme/ShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,15:1\n122#2:16\n122#2:17\n122#2:18\n122#2:19\n122#2:20\n*S KotlinDebug\n*F\n+ 1 Shape.kt\ncom/zhawoilah/wgxt/ui/theme/ShapeKt\n*L\n9#1:16\n10#1:17\n11#1:18\n12#1:19\n13#1:20\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "WazzShapes",
        "Landroidx/compose/material3/Shapes;",
        "getWazzShapes",
        "()Landroidx/compose/material3/Shapes;",
        "app_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final WazzShapes:Landroidx/compose/material3/Shapes;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 8
    new-instance v0, Landroidx/compose/material3/Shapes;

    const/16 v1, 0x8

    int-to-float v1, v1

    .line 16
    invoke-static {v1}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v1

    .line 9
    invoke-static {v1}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v1

    check-cast v1, Landroidx/compose/foundation/shape/CornerBasedShape;

    const/16 v2, 0xe

    int-to-float v2, v2

    .line 17
    invoke-static {v2}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v2

    .line 10
    invoke-static {v2}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v2

    check-cast v2, Landroidx/compose/foundation/shape/CornerBasedShape;

    const/16 v3, 0x14

    int-to-float v3, v3

    .line 18
    invoke-static {v3}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v3

    .line 11
    invoke-static {v3}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v3

    check-cast v3, Landroidx/compose/foundation/shape/CornerBasedShape;

    const/16 v4, 0x1c

    int-to-float v4, v4

    .line 19
    invoke-static {v4}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v4

    .line 12
    invoke-static {v4}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v4

    check-cast v4, Landroidx/compose/foundation/shape/CornerBasedShape;

    const/16 v5, 0x24

    int-to-float v5, v5

    .line 20
    invoke-static {v5}, Landroidx/compose/ui/unit/Dp;->constructor-impl(F)F

    move-result v5

    .line 13
    invoke-static {v5}, Landroidx/compose/foundation/shape/RoundedCornerShapeKt;->RoundedCornerShape-0680j_4(F)Landroidx/compose/foundation/shape/RoundedCornerShape;

    move-result-object v5

    check-cast v5, Landroidx/compose/foundation/shape/CornerBasedShape;

    .line 8
    invoke-direct/range {v0 .. v5}, Landroidx/compose/material3/Shapes;-><init>(Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;Landroidx/compose/foundation/shape/CornerBasedShape;)V

    sput-object v0, Lcom/zhawoilah/wgxt/ui/theme/ShapeKt;->WazzShapes:Landroidx/compose/material3/Shapes;

    return-void
.end method

.method public static final getWazzShapes()Landroidx/compose/material3/Shapes;
    .locals 1

    .line 8
    sget-object v0, Lcom/zhawoilah/wgxt/ui/theme/ShapeKt;->WazzShapes:Landroidx/compose/material3/Shapes;

    return-object v0
.end method
