.class public final Lcom/zhawoilah/wgxt/ui/theme/ThemeKt;
.super Ljava/lang/Object;
.source "Theme.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTheme.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Theme.kt\ncom/zhawoilah/wgxt/ui/theme/ThemeKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,109:1\n75#2:110\n75#2:111\n1128#3,6:112\n*S KotlinDebug\n*F\n+ 1 Theme.kt\ncom/zhawoilah/wgxt/ui/theme/ThemeKt\n*L\n80#1:110\n90#1:111\n92#1:112,6\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a4\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0011\u0010\u0008\u001a\r\u0012\u0004\u0012\u00020\u00040\t\u00a2\u0006\u0002\u0008\nH\u0007\u00a2\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000c"
    }
    d2 = {
        "WazzLightColors",
        "Landroidx/compose/material3/ColorScheme;",
        "WazzDarkColors",
        "WazzTheme",
        "",
        "darkTheme",
        "",
        "dynamicColor",
        "content",
        "Lkotlin/Function0;",
        "Landroidx/compose/runtime/Composable;",
        "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V",
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
.field private static final WazzDarkColors:Landroidx/compose/material3/ColorScheme;

.field private static final WazzLightColors:Landroidx/compose/material3/ColorScheme;


# direct methods
.method public static synthetic $r8$lambda$9pTVpLi8Tmc148ZI2RRFP5BD5GY(Landroid/view/View;Z)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/zhawoilah/wgxt/ui/theme/ThemeKt;->WazzTheme$lambda$0$0(Landroid/view/View;Z)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic $r8$lambda$kWl3wPXLAUwrINQCm2ov6FrwXBQ(ZZLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcom/zhawoilah/wgxt/ui/theme/ThemeKt;->WazzTheme$lambda$1(ZZLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method static constructor <clinit>()V
    .locals 100

    .line 20
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightPrimary()J

    move-result-wide v1

    .line 21
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightOnPrimary()J

    move-result-wide v3

    .line 22
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightPrimaryContainer()J

    move-result-wide v5

    .line 23
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightOnPrimaryContainer()J

    move-result-wide v7

    .line 24
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightSecondary()J

    move-result-wide v11

    .line 25
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightOnSecondary()J

    move-result-wide v13

    .line 26
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightSecondaryContainer()J

    move-result-wide v15

    .line 27
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightOnSecondaryContainer()J

    move-result-wide v17

    .line 28
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightTertiary()J

    move-result-wide v19

    .line 29
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightOnTertiary()J

    move-result-wide v21

    .line 30
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightTertiaryContainer()J

    move-result-wide v23

    .line 31
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightOnTertiaryContainer()J

    move-result-wide v25

    .line 32
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightBackground()J

    move-result-wide v27

    .line 33
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightOnBackground()J

    move-result-wide v29

    .line 34
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightSurface()J

    move-result-wide v31

    .line 35
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightOnSurface()J

    move-result-wide v33

    .line 36
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightSurfaceVariant()J

    move-result-wide v35

    .line 37
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightOnSurfaceVariant()J

    move-result-wide v37

    .line 38
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightSurfaceContainer()J

    move-result-wide v61

    .line 39
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightSurfaceContainerHigh()J

    move-result-wide v63

    .line 40
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightOutline()J

    move-result-wide v53

    .line 41
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightError()J

    move-result-wide v45

    .line 42
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightOnError()J

    move-result-wide v47

    .line 43
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getLightErrorContainer()J

    move-result-wide v49

    const v98, 0xffff

    const/16 v99, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v51, 0x0

    const-wide/16 v55, 0x0

    const-wide/16 v57, 0x0

    const-wide/16 v59, 0x0

    const-wide/16 v65, 0x0

    const-wide/16 v67, 0x0

    const-wide/16 v69, 0x0

    const-wide/16 v71, 0x0

    const-wide/16 v73, 0x0

    const-wide/16 v75, 0x0

    const-wide/16 v77, 0x0

    const-wide/16 v79, 0x0

    const-wide/16 v81, 0x0

    const-wide/16 v83, 0x0

    const-wide/16 v85, 0x0

    const-wide/16 v87, 0x0

    const-wide/16 v89, 0x0

    const-wide/16 v91, 0x0

    const-wide/16 v93, 0x0

    const-wide/16 v95, 0x0

    const v97, 0x3a380010

    .line 19
    invoke-static/range {v1 .. v99}, Landroidx/compose/material3/ColorSchemeKt;->lightColorScheme-_VG5OTI$default(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJIILjava/lang/Object;)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    sput-object v0, Lcom/zhawoilah/wgxt/ui/theme/ThemeKt;->WazzLightColors:Landroidx/compose/material3/ColorScheme;

    .line 47
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkPrimary()J

    move-result-wide v1

    .line 48
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkOnPrimary()J

    move-result-wide v3

    .line 49
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkPrimaryContainer()J

    move-result-wide v5

    .line 50
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkOnPrimaryContainer()J

    move-result-wide v7

    .line 51
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkSecondary()J

    move-result-wide v11

    .line 52
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkOnSecondary()J

    move-result-wide v13

    .line 53
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkSecondaryContainer()J

    move-result-wide v15

    .line 54
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkOnSecondaryContainer()J

    move-result-wide v17

    .line 55
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkTertiary()J

    move-result-wide v19

    .line 56
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkOnTertiary()J

    move-result-wide v21

    .line 57
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkTertiaryContainer()J

    move-result-wide v23

    .line 58
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkOnTertiaryContainer()J

    move-result-wide v25

    .line 59
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkBackground()J

    move-result-wide v27

    .line 60
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkOnBackground()J

    move-result-wide v29

    .line 61
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkSurface()J

    move-result-wide v31

    .line 62
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkOnSurface()J

    move-result-wide v33

    .line 63
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkSurfaceVariant()J

    move-result-wide v35

    .line 64
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkOnSurfaceVariant()J

    move-result-wide v37

    .line 65
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkSurfaceContainer()J

    move-result-wide v61

    .line 66
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkSurfaceContainerHigh()J

    move-result-wide v63

    .line 67
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkOutline()J

    move-result-wide v53

    .line 68
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkError()J

    move-result-wide v45

    .line 69
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkOnError()J

    move-result-wide v47

    .line 70
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ColorKt;->getDarkErrorContainer()J

    move-result-wide v49

    .line 46
    invoke-static/range {v1 .. v99}, Landroidx/compose/material3/ColorSchemeKt;->darkColorScheme-_VG5OTI$default(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJIILjava/lang/Object;)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    sput-object v0, Lcom/zhawoilah/wgxt/ui/theme/ThemeKt;->WazzDarkColors:Landroidx/compose/material3/ColorScheme;

    return-void
.end method

.method public static final WazzTheme(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Landroidx/compose/runtime/Composer;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v7, p4

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x20967113

    .line 79
    invoke-interface {p3, v0}, Landroidx/compose/runtime/Composer;->startRestartGroup(I)Landroidx/compose/runtime/Composer;

    move-result-object v4

    const-string v1, "C(WazzTheme)N(darkTheme,dynamicColor,content)79@2899L7,89@3292L7,101@3769L148:Theme.kt#4i0dnw"

    invoke-static {v4, v1}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v1, v7, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_1

    and-int/lit8 v1, p5, 0x1

    if-nez v1, :cond_0

    invoke-interface {v4, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v7

    goto :goto_1

    :cond_1
    move v1, v7

    :goto_1
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_2

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v6, v7, 0x30

    if-nez v6, :cond_4

    invoke-interface {v4, p1}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v1, v6

    :cond_4
    :goto_3
    and-int/lit16 v6, v7, 0x180

    if-nez v6, :cond_6

    invoke-interface {v4, p2}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v1, v6

    :cond_6
    and-int/lit16 v6, v1, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v6, v8, :cond_7

    move v6, v10

    goto :goto_5

    :cond_7
    move v6, v9

    :goto_5
    and-int/lit8 v8, v1, 0x1

    invoke-interface {v4, v6, v8}, Landroidx/compose/runtime/Composer;->shouldExecute(ZI)Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->startDefaults()V

    const-string v6, "74@2705L21"

    invoke-static {v4, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    and-int/lit8 v6, v7, 0x1

    if-eqz v6, :cond_9

    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->getDefaultsInvalid()Z

    move-result v6

    if-eqz v6, :cond_8

    goto :goto_6

    .line 74
    :cond_8
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    and-int/lit8 v5, p5, 0x1

    if-eqz v5, :cond_b

    and-int/lit8 v1, v1, -0xf

    goto :goto_7

    :cond_9
    :goto_6
    and-int/lit8 v6, p5, 0x1

    if-eqz v6, :cond_a

    .line 75
    invoke-static {v4, v9}, Landroidx/compose/foundation/DarkThemeKt;->isSystemInDarkTheme(Landroidx/compose/runtime/Composer;I)Z

    move-result p0

    and-int/lit8 v1, v1, -0xf

    :cond_a
    if-eqz v5, :cond_b

    move p1, v10

    .line 74
    :cond_b
    :goto_7
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endDefaults()V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v5

    if-eqz v5, :cond_c

    const/4 v5, -0x1

    const-string v6, "com.zhawoilah.wgxt.ui.theme.WazzTheme (Theme.kt:78)"

    invoke-static {v0, v1, v5, v6}, Landroidx/compose/runtime/ComposerKt;->traceEventStart(IIILjava/lang/String;)V

    .line 80
    :cond_c
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalContext()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v0

    check-cast v0, Landroidx/compose/runtime/CompositionLocal;

    const v5, 0x789c5f52

    .line 110
    const-string v6, "CC(<get-current>):CompositionLocal.kt#9igjgp"

    invoke-static {v4, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v0}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 80
    check-cast v0, Landroid/content/Context;

    if-eqz p1, :cond_e

    .line 82
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x1f

    if-lt v8, v11, :cond_e

    if-eqz p0, :cond_d

    .line 83
    invoke-static {v0}, Landroidx/compose/material3/DynamicTonalPaletteKt;->dynamicDarkColorScheme(Landroid/content/Context;)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    goto :goto_8

    :cond_d
    invoke-static {v0}, Landroidx/compose/material3/DynamicTonalPaletteKt;->dynamicLightColorScheme(Landroid/content/Context;)Landroidx/compose/material3/ColorScheme;

    move-result-object v0

    goto :goto_8

    :cond_e
    if-eqz p0, :cond_f

    .line 86
    sget-object v0, Lcom/zhawoilah/wgxt/ui/theme/ThemeKt;->WazzDarkColors:Landroidx/compose/material3/ColorScheme;

    goto :goto_8

    .line 87
    :cond_f
    sget-object v0, Lcom/zhawoilah/wgxt/ui/theme/ThemeKt;->WazzLightColors:Landroidx/compose/material3/ColorScheme;

    .line 90
    :goto_8
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalView()Landroidx/compose/runtime/ProvidableCompositionLocal;

    move-result-object v8

    check-cast v8, Landroidx/compose/runtime/CompositionLocal;

    .line 111
    invoke-static {v4, v5, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v8}, Landroidx/compose/runtime/Composer;->consume(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    .line 90
    check-cast v5, Landroid/view/View;

    .line 91
    invoke-virtual {v5}, Landroid/view/View;->isInEditMode()Z

    move-result v6

    if-nez v6, :cond_15

    const v6, 0x431acfdc

    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    const-string v6, "91@3349L408,91@3338L419"

    invoke-static {v4, v6}, Landroidx/compose/runtime/ComposerKt;->sourceInformation(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V

    const v6, 0x54becf6b

    const-string v8, "CC(remember):Theme.kt#9igjgp"

    .line 92
    invoke-static {v4, v6, v8}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerStart(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V

    invoke-interface {v4, v5}, Landroidx/compose/runtime/Composer;->changedInstance(Ljava/lang/Object;)Z

    move-result v6

    and-int/lit8 v8, v1, 0xe

    xor-int/lit8 v8, v8, 0x6

    if-le v8, v2, :cond_10

    invoke-interface {v4, p0}, Landroidx/compose/runtime/Composer;->changed(Z)Z

    move-result v8

    if-nez v8, :cond_12

    :cond_10
    and-int/lit8 v8, v1, 0x6

    if-ne v8, v2, :cond_11

    goto :goto_9

    :cond_11
    move v10, v9

    :cond_12
    :goto_9
    or-int v2, v6, v10

    .line 112
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->rememberedValue()Ljava/lang/Object;

    move-result-object v6

    if-nez v2, :cond_13

    .line 113
    sget-object v2, Landroidx/compose/runtime/Composer;->Companion:Landroidx/compose/runtime/Composer$Companion;

    invoke-virtual {v2}, Landroidx/compose/runtime/Composer$Companion;->getEmpty()Ljava/lang/Object;

    move-result-object v2

    if-ne v6, v2, :cond_14

    .line 92
    :cond_13
    new-instance v6, Lcom/zhawoilah/wgxt/ui/theme/ThemeKt$$ExternalSyntheticLambda0;

    invoke-direct {v6, v5, p0}, Lcom/zhawoilah/wgxt/ui/theme/ThemeKt$$ExternalSyntheticLambda0;-><init>(Landroid/view/View;Z)V

    .line 115
    invoke-interface {v4, v6}, Landroidx/compose/runtime/Composer;->updateRememberedValue(Ljava/lang/Object;)V

    .line 92
    :cond_14
    check-cast v6, Lkotlin/jvm/functions/Function0;

    invoke-static {v4}, Landroidx/compose/runtime/ComposerKt;->sourceInformationMarkerEnd(Landroidx/compose/runtime/Composer;)V

    invoke-static {v6, v4, v9}, Landroidx/compose/runtime/EffectsKt;->SideEffect(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V

    goto :goto_a

    :cond_15
    const v2, 0x42e8374f

    .line 91
    invoke-interface {v4, v2}, Landroidx/compose/runtime/Composer;->startReplaceGroup(I)V

    :goto_a
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endReplaceGroup()V

    .line 104
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/TypeKt;->getWazzTypography()Landroidx/compose/material3/Typography;

    move-result-object v2

    move v5, v1

    .line 105
    invoke-static {}, Lcom/zhawoilah/wgxt/ui/theme/ShapeKt;->getWazzShapes()Landroidx/compose/material3/Shapes;

    move-result-object v1

    shl-int/lit8 v5, v5, 0x3

    and-int/lit16 v5, v5, 0x1c00

    or-int/lit16 v5, v5, 0x1b0

    const/4 v6, 0x0

    move-object v3, p2

    .line 102
    invoke-static/range {v0 .. v6}, Landroidx/compose/material3/MaterialThemeKt;->MaterialTheme(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/Shapes;Landroidx/compose/material3/Typography;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->isTraceInProgress()Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-static {}, Landroidx/compose/runtime/ComposerKt;->traceEventEnd()V

    goto :goto_b

    .line 74
    :cond_16
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->skipToGroupEnd()V

    :cond_17
    :goto_b
    move v1, p0

    move v2, p1

    .line 108
    invoke-interface {v4}, Landroidx/compose/runtime/Composer;->endRestartGroup()Landroidx/compose/runtime/ScopeUpdateScope;

    move-result-object p0

    if-eqz p0, :cond_18

    new-instance v0, Lcom/zhawoilah/wgxt/ui/theme/ThemeKt$$ExternalSyntheticLambda1;

    move-object v3, p2

    move/from16 v5, p5

    move v4, v7

    invoke-direct/range {v0 .. v5}, Lcom/zhawoilah/wgxt/ui/theme/ThemeKt$$ExternalSyntheticLambda1;-><init>(ZZLkotlin/jvm/functions/Function2;II)V

    invoke-interface {p0, v0}, Landroidx/compose/runtime/ScopeUpdateScope;->updateScope(Lkotlin/jvm/functions/Function2;)V

    :cond_18
    return-void
.end method

.method private static final WazzTheme$lambda$0$0(Landroid/view/View;Z)Lkotlin/Unit;
    .locals 3

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.app.Activity"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 94
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->toArgb-8_81llA(J)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 95
    sget-object v1, Landroidx/compose/ui/graphics/Color;->Companion:Landroidx/compose/ui/graphics/Color$Companion;

    invoke-virtual {v1}, Landroidx/compose/ui/graphics/Color$Companion;->getTransparent-0d7_KjU()J

    move-result-wide v1

    invoke-static {v1, v2}, Landroidx/compose/ui/graphics/ColorKt;->toArgb-8_81llA(J)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 96
    invoke-static {v0, p0}, Landroidx/core/view/WindowCompat;->getInsetsController(Landroid/view/Window;Landroid/view/View;)Landroidx/core/view/WindowInsetsControllerCompat;

    move-result-object p0

    const-string v0, "getInsetsController(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/lit8 v0, p1, 0x1

    .line 97
    invoke-virtual {p0, v0}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightStatusBars(Z)V

    xor-int/lit8 p1, p1, 0x1

    .line 98
    invoke-virtual {p0, p1}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightNavigationBars(Z)V

    .line 99
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method private static final WazzTheme$lambda$1(ZZLkotlin/jvm/functions/Function2;IILandroidx/compose/runtime/Composer;I)Lkotlin/Unit;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    move-result v4

    move v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcom/zhawoilah/wgxt/ui/theme/ThemeKt;->WazzTheme(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method
