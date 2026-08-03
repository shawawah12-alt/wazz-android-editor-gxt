package com.zhawoilah.wgxt.ui.theme;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.DynamicTonalPaletteKt;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Theme.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0011\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\b\nH\u0007¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"WazzLightColors", "Landroidx/compose/material3/ColorScheme;", "WazzDarkColors", "WazzTheme", "", "darkTheme", "", "dynamicColor", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class ThemeKt {
    private static final ColorScheme WazzDarkColors;
    private static final ColorScheme WazzLightColors;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzTheme$lambda$1(boolean z, boolean z2, Function2 function2, int i, int i2, Composer composer, int i3) {
        WazzTheme(z, z2, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    static {
        long lightPrimary = ColorKt.getLightPrimary();
        long lightOnPrimary = ColorKt.getLightOnPrimary();
        long lightPrimaryContainer = ColorKt.getLightPrimaryContainer();
        long lightOnPrimaryContainer = ColorKt.getLightOnPrimaryContainer();
        long lightSecondary = ColorKt.getLightSecondary();
        long lightOnSecondary = ColorKt.getLightOnSecondary();
        long lightSecondaryContainer = ColorKt.getLightSecondaryContainer();
        long lightOnSecondaryContainer = ColorKt.getLightOnSecondaryContainer();
        long lightTertiary = ColorKt.getLightTertiary();
        long lightOnTertiary = ColorKt.getLightOnTertiary();
        long lightTertiaryContainer = ColorKt.getLightTertiaryContainer();
        long lightOnTertiaryContainer = ColorKt.getLightOnTertiaryContainer();
        long lightBackground = ColorKt.getLightBackground();
        long lightOnBackground = ColorKt.getLightOnBackground();
        long lightSurface = ColorKt.getLightSurface();
        long lightOnSurface = ColorKt.getLightOnSurface();
        long lightSurfaceVariant = ColorKt.getLightSurfaceVariant();
        long lightOnSurfaceVariant = ColorKt.getLightOnSurfaceVariant();
        long lightSurfaceContainer = ColorKt.getLightSurfaceContainer();
        long lightSurfaceContainerHigh = ColorKt.getLightSurfaceContainerHigh();
        WazzLightColors = ColorSchemeKt.m2229lightColorScheme_VG5OTI$default(lightPrimary, lightOnPrimary, lightPrimaryContainer, lightOnPrimaryContainer, 0L, lightSecondary, lightOnSecondary, lightSecondaryContainer, lightOnSecondaryContainer, lightTertiary, lightOnTertiary, lightTertiaryContainer, lightOnTertiaryContainer, lightBackground, lightOnBackground, lightSurface, lightOnSurface, lightSurfaceVariant, lightOnSurfaceVariant, 0L, 0L, 0L, ColorKt.getLightError(), ColorKt.getLightOnError(), ColorKt.getLightErrorContainer(), 0L, ColorKt.getLightOutline(), 0L, 0L, 0L, lightSurfaceContainer, lightSurfaceContainerHigh, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 976748560, 65535, null);
        long darkPrimary = ColorKt.getDarkPrimary();
        long darkOnPrimary = ColorKt.getDarkOnPrimary();
        long darkPrimaryContainer = ColorKt.getDarkPrimaryContainer();
        long darkOnPrimaryContainer = ColorKt.getDarkOnPrimaryContainer();
        long darkSecondary = ColorKt.getDarkSecondary();
        long darkOnSecondary = ColorKt.getDarkOnSecondary();
        long darkSecondaryContainer = ColorKt.getDarkSecondaryContainer();
        long darkOnSecondaryContainer = ColorKt.getDarkOnSecondaryContainer();
        long darkTertiary = ColorKt.getDarkTertiary();
        long darkOnTertiary = ColorKt.getDarkOnTertiary();
        long darkTertiaryContainer = ColorKt.getDarkTertiaryContainer();
        long darkOnTertiaryContainer = ColorKt.getDarkOnTertiaryContainer();
        long darkBackground = ColorKt.getDarkBackground();
        long darkOnBackground = ColorKt.getDarkOnBackground();
        long darkSurface = ColorKt.getDarkSurface();
        long darkOnSurface = ColorKt.getDarkOnSurface();
        long darkSurfaceVariant = ColorKt.getDarkSurfaceVariant();
        long darkOnSurfaceVariant = ColorKt.getDarkOnSurfaceVariant();
        long darkSurfaceContainer = ColorKt.getDarkSurfaceContainer();
        long darkSurfaceContainerHigh = ColorKt.getDarkSurfaceContainerHigh();
        WazzDarkColors = ColorSchemeKt.m2223darkColorScheme_VG5OTI$default(darkPrimary, darkOnPrimary, darkPrimaryContainer, darkOnPrimaryContainer, 0L, darkSecondary, darkOnSecondary, darkSecondaryContainer, darkOnSecondaryContainer, darkTertiary, darkOnTertiary, darkTertiaryContainer, darkOnTertiaryContainer, darkBackground, darkOnBackground, darkSurface, darkOnSurface, darkSurfaceVariant, darkOnSurfaceVariant, 0L, 0L, 0L, ColorKt.getDarkError(), ColorKt.getDarkOnError(), ColorKt.getDarkErrorContainer(), 0L, ColorKt.getDarkOutline(), 0L, 0L, 0L, darkSurfaceContainer, darkSurfaceContainerHigh, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 976748560, 65535, null);
    }

    public static final void WazzTheme(final boolean z, boolean z2, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        ColorScheme colorSchemeDynamicDarkColorScheme;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(546730259);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WazzTheme)N(darkTheme,dynamicColor,content)79@2899L7,89@3292L7,101@3769L148:Theme.kt#4i0dnw");
        if ((i & 6) == 0) {
            i3 = (((i2 & 1) == 0 && composerStartRestartGroup.changed(z)) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        boolean z3 = true;
        if (composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            ComposerKt.sourceInformation(composerStartRestartGroup, "74@2705L21");
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 1) != 0) {
                    z = DarkThemeKt.isSystemInDarkTheme(composerStartRestartGroup, 0);
                    i3 &= -15;
                }
                if (i4 != 0) {
                    z2 = true;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 1) != 0) {
                    i3 &= -15;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(546730259, i3, -1, "com.zhawoilah.wgxt.ui.theme.WazzTheme (Theme.kt:78)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = composerStartRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            Context context = (Context) objConsume;
            if (z2 && Build.VERSION.SDK_INT >= 31) {
                colorSchemeDynamicDarkColorScheme = z ? DynamicTonalPaletteKt.dynamicDarkColorScheme(context) : DynamicTonalPaletteKt.dynamicLightColorScheme(context);
            } else if (z) {
                colorSchemeDynamicDarkColorScheme = WazzDarkColors;
            } else {
                colorSchemeDynamicDarkColorScheme = WazzLightColors;
            }
            ProvidableCompositionLocal<View> localView = AndroidCompositionLocals_androidKt.getLocalView();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = composerStartRestartGroup.consume(localView);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            final View view = (View) objConsume2;
            if (view.isInEditMode()) {
                composerStartRestartGroup.startReplaceGroup(1122514767);
            } else {
                composerStartRestartGroup.startReplaceGroup(1125830620);
                ComposerKt.sourceInformation(composerStartRestartGroup, "91@3349L408,91@3338L419");
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1421791083, "CC(remember):Theme.kt#9igjgp");
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(view);
                if ((((i3 & 14) ^ 6) <= 4 || !composerStartRestartGroup.changed(z)) && (i3 & 6) != 4) {
                    z3 = false;
                }
                boolean z4 = zChangedInstance | z3;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.zhawoilah.wgxt.ui.theme.ThemeKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ThemeKt.WazzTheme$lambda$0$0(view, z);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                EffectsKt.SideEffect((Function0) objRememberedValue, composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            MaterialThemeKt.MaterialTheme(colorSchemeDynamicDarkColorScheme, ShapeKt.getWazzShapes(), TypeKt.getWazzTypography(), content, composerStartRestartGroup, ((i3 << 3) & 7168) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final boolean z5 = z;
        final boolean z6 = z2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.theme.ThemeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ThemeKt.WazzTheme$lambda$1(z5, z6, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WazzTheme$lambda$0$0(View view, boolean z) {
        Context context = view.getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        Window window = ((Activity) context).getWindow();
        window.setStatusBarColor(androidx.compose.ui.graphics.ColorKt.m5444toArgb8_81llA(Color.INSTANCE.m5425getTransparent0d7_KjU()));
        window.setNavigationBarColor(androidx.compose.ui.graphics.ColorKt.m5444toArgb8_81llA(Color.INSTANCE.m5425getTransparent0d7_KjU()));
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, view);
        Intrinsics.checkNotNullExpressionValue(insetsController, "getInsetsController(...)");
        insetsController.setAppearanceLightStatusBars(!z);
        insetsController.setAppearanceLightNavigationBars(!z);
        return Unit.INSTANCE;
    }
}
