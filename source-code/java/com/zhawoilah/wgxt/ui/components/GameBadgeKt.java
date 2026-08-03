package com.zhawoilah.wgxt.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import com.zhawoilah.wgxt.R;
import com.zhawoilah.wgxt.data.GxtGame;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GameBadge.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"GameBadge", "", "game", "Lcom/zhawoilah/wgxt/data/GxtGame;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/zhawoilah/wgxt/data/GxtGame;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_release"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GameBadgeKt {

    /* JADX INFO: compiled from: GameBadge.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GxtGame.values().length];
            try {
                iArr[GxtGame.III.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GxtGame.VC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GxtGame.SA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GxtGame.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GameBadge$lambda$0(GxtGame gxtGame, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GameBadge(gxtGame, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:35:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x0176  */
    /* JADX WARN: Code duplicated, block: B:48:0x017a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0186  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public static final void GameBadge(final GxtGame game, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier.Companion companion;
        int i4;
        String strStringResource;
        Intrinsics.checkNotNullParameter(game, "game");
        Composer composerStartRestartGroup = composer.startRestartGroup(1567863581);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(GameBadge)N(game,modifier)25@939L10,26@993L11,29@1135L11,23@881L350:GameBadge.kt#qv7s45");
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(game.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                if (i5 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1567863581, i3, -1, "com.zhawoilah.wgxt.ui.components.GameBadge (GameBadge.kt:16)");
                }
                i4 = WhenMappings.$EnumSwitchMapping$0[game.ordinal()];
                if (i4 != 1) {
                    composerStartRestartGroup.startReplaceGroup(-816615842);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "18@662L33");
                    strStringResource = StringResources_androidKt.stringResource(R.string.game_iii, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 != 2) {
                    composerStartRestartGroup.startReplaceGroup(-816614051);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "19@718L32");
                    strStringResource = StringResources_androidKt.stringResource(R.string.game_vc, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 != 3) {
                    composerStartRestartGroup.startReplaceGroup(-816612291);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "20@773L32");
                    strStringResource = StringResources_androidKt.stringResource(R.string.game_sa, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (i4 == 4) {
                        composerStartRestartGroup.startReplaceGroup(-816616808);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-816610366);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "21@833L37");
                    strStringResource = StringResources_androidKt.stringResource(R.string.game_unknown, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelMedium();
                long onSecondaryContainer = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSecondaryContainer();
                Modifier modifierM927paddingVpY3zN4 = PaddingKt.m927paddingVpY3zN4(BackgroundKt.m297backgroundbw27NRU$default(ClipKt.clip(companion, RoundedCornerShapeKt.RoundedCornerShape(50)), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSecondaryContainer(), null, 2, null), Dp.m8224constructorimpl(12), Dp.m8224constructorimpl(5));
                String str = strStringResource;
                modifier3 = companion;
                composer2 = composerStartRestartGroup;
                TextKt.m3256TextNvy7gAk(str, modifierM927paddingVpY3zN4, onSecondaryContainer, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelMedium, composer2, 0, 0, 131064);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.GameBadgeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GameBadgeKt.GameBadge$lambda$0(game, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i5 != 0) {
                companion = Modifier.INSTANCE;
            } else {
                companion = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1567863581, i3, -1, "com.zhawoilah.wgxt.ui.components.GameBadge (GameBadge.kt:16)");
            }
            i4 = WhenMappings.$EnumSwitchMapping$0[game.ordinal()];
            if (i4 != 1) {
                composerStartRestartGroup.startReplaceGroup(-816615842);
                ComposerKt.sourceInformation(composerStartRestartGroup, "18@662L33");
                strStringResource = StringResources_androidKt.stringResource(R.string.game_iii, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i4 != 2) {
                composerStartRestartGroup.startReplaceGroup(-816614051);
                ComposerKt.sourceInformation(composerStartRestartGroup, "19@718L32");
                strStringResource = StringResources_androidKt.stringResource(R.string.game_vc, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else if (i4 != 3) {
                composerStartRestartGroup.startReplaceGroup(-816612291);
                ComposerKt.sourceInformation(composerStartRestartGroup, "20@773L32");
                strStringResource = StringResources_androidKt.stringResource(R.string.game_sa, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (i4 == 4) {
                    composerStartRestartGroup.startReplaceGroup(-816616808);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(-816610366);
                ComposerKt.sourceInformation(composerStartRestartGroup, "21@833L37");
                strStringResource = StringResources_androidKt.stringResource(R.string.game_unknown, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            TextStyle labelMedium2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getLabelMedium();
            long onSecondaryContainer2 = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSecondaryContainer();
            Modifier modifierM927paddingVpY3zN5 = PaddingKt.m927paddingVpY3zN4(BackgroundKt.m297backgroundbw27NRU$default(ClipKt.clip(companion, RoundedCornerShapeKt.RoundedCornerShape(50)), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSecondaryContainer(), null, 2, null), Dp.m8224constructorimpl(12), Dp.m8224constructorimpl(5));
            String str2 = strStringResource;
            modifier3 = companion;
            composer2 = composerStartRestartGroup;
            TextKt.m3256TextNvy7gAk(str2, modifierM927paddingVpY3zN5, onSecondaryContainer2, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, labelMedium2, composer2, 0, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.GameBadgeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GameBadgeKt.GameBadge$lambda$0(game, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
