package com.zhawoilah.wgxt.ui.components;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Common.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0007\u001aX\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0012\u001a;\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a0\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00192\u0011\u0010\f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010 \u001aJ\u0010!\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0015\b\u0002\u0010%\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\rH\u0007¢\u0006\u0002\u0010&¨\u0006'²\u0006\n\u0010(\u001a\u00020\u001eX\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002"}, d2 = {"PressableCard", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Landroidx/compose/runtime/Composable;", "PressableCard-fWhpE4E", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "rememberInteraction", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/interaction/MutableInteractionSource;", "IconBadge", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "tint", "container", "size", "", "IconBadge-DTcfvLk", "(Landroidx/compose/ui/graphics/vector/ImageVector;JJLandroidx/compose/ui/Modifier;ILandroidx/compose/runtime/Composer;II)V", "StaggerReveal", "visible", "", "delayMillis", "(ZILkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "MessageState", "title", "", "subtitle", "action", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "app_release", "pressed", "scale", ""}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class CommonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IconBadge_DTcfvLk$lambda$1(ImageVector imageVector, long j, long j2, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        m8880IconBadgeDTcfvLk(imageVector, j, j2, modifier, i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageState$lambda$1(ImageVector imageVector, String str, String str2, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        MessageState(imageVector, str, str2, modifier, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PressableCard_fWhpE4E$lambda$3(Function0 function0, Modifier modifier, Shape shape, long j, PaddingValues paddingValues, Function2 function2, int i, int i2, Composer composer, int i3) {
        m8881PressableCardfWhpE4E(function0, modifier, shape, j, paddingValues, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StaggerReveal$lambda$2(boolean z, int i, Function2 function2, int i2, Composer composer, int i3) {
        StaggerReveal(z, i, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:51:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e7 A[PHI: r4 r7 r8 r10
      0x00e7: PHI (r4v25 int) = (r4v15 int), (r4v27 int), (r4v28 int) binds: [B:88:0x0119, B:76:0x00e3, B:77:0x00e5] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r7v13 androidx.compose.ui.Modifier) = (r7v4 androidx.compose.ui.Modifier), (r7v2 androidx.compose.ui.Modifier), (r7v2 androidx.compose.ui.Modifier) binds: [B:88:0x0119, B:76:0x00e3, B:77:0x00e5] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r8v21 androidx.compose.ui.graphics.Shape) = 
      (r8v8 androidx.compose.ui.graphics.Shape)
      (r8v6 androidx.compose.ui.graphics.Shape)
      (r8v6 androidx.compose.ui.graphics.Shape)
     binds: [B:88:0x0119, B:76:0x00e3, B:77:0x00e5] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r10v13 long) = (r10v4 long), (r10v2 long), (r10v2 long) binds: [B:88:0x0119, B:76:0x00e3, B:77:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:87:0x010b  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:92:0x0133  */
    /* JADX WARN: Code duplicated, block: B:95:0x014a  */
    /* JADX WARN: Code duplicated, block: B:96:0x014e  */
    /* JADX WARN: Code duplicated, block: B:99:0x01be  */
    /* JADX INFO: renamed from: PressableCard-fWhpE4E, reason: not valid java name */
    public static final void m8881PressableCardfWhpE4E(final Function0<Unit> onClick, Modifier modifier, Shape shape, long j, PaddingValues paddingValues, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier.Companion companion;
        CornerBasedShape large;
        long surfaceContainer;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        boolean z;
        final Modifier modifier2;
        final Shape shape2;
        final long j2;
        final PaddingValues paddingValues3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i6;
        PaddingValues paddingValuesM919PaddingValues0680j_4;
        Modifier modifier3;
        Shape shape3;
        MutableInteractionSource mutableInteractionSourceRememberInteraction;
        float f;
        int i7;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(909797928);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(PressableCard)N(onClick,modifier,shape,color:c#ui.graphics.Color,contentPadding,content)49@2224L21,50@2277L25,51@2320L221,63@2748L67,56@2546L269:Common.kt#qv7s45");
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 == 0) {
            if ((i & 48) == 0) {
                companion = modifier;
                i3 |= composerStartRestartGroup.changed(companion) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if ((i2 & 4) == 0) {
                    large = shape;
                    int i9 = composerStartRestartGroup.changed(large) ? 256 : 128;
                    i3 |= i9;
                } else {
                    large = shape;
                }
                i3 |= i9;
            } else {
                large = shape;
            }
            if ((i & 3072) == 0) {
                if ((i2 & 8) == 0) {
                    surfaceContainer = j;
                    int i10 = composerStartRestartGroup.changed(surfaceContainer) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    surfaceContainer = j;
                }
                i3 |= i10;
            } else {
                surfaceContainer = j;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                if ((196608 & i) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                    composerStartRestartGroup.startDefaults();
                    ComposerKt.sourceInformation(composerStartRestartGroup, "44@1998L6,45@2074L11");
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i8 != 0) {
                            companion = Modifier.INSTANCE;
                        }
                        if ((i2 & 4) != 0) {
                            large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getLarge();
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            surfaceContainer = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainer();
                            i3 &= -7169;
                        }
                        if (i4 != 0) {
                            Modifier modifier4 = companion;
                            i6 = i3;
                            paddingValuesM919PaddingValues0680j_4 = PaddingKt.m919PaddingValues0680j_4(Dp.m8224constructorimpl(0));
                            modifier3 = modifier4;
                            shape3 = large;
                        }
                        long j3 = surfaceContainer;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(909797928, i6, -1, "com.zhawoilah.wgxt.ui.components.PressableCard (Common.kt:48)");
                        }
                        mutableInteractionSourceRememberInteraction = rememberInteraction(composerStartRestartGroup, 0);
                        if (PressableCard_fWhpE4E$lambda$0(PressInteractionKt.collectIsPressedAsState(mutableInteractionSourceRememberInteraction, composerStartRestartGroup, 0))) {
                            f = 0.97f;
                        } else {
                            f = 1.0f;
                        }
                        final PaddingValues paddingValues4 = paddingValuesM919PaddingValues0680j_4;
                        float f2 = f;
                        int i11 = i6;
                        int i12 = i11 << 3;
                        j2 = j3;
                        shape2 = shape3;
                        Modifier modifier5 = modifier3;
                        SurfaceKt.m3087Surfaceo_FOJdg(onClick, ScaleKt.scale(modifier3, PressableCard_fWhpE4E$lambda$1(AnimateAsStateKt.animateFloatAsState(f2, AnimationSpecKt.spring$default(0.5f, 1500.0f, null, 4, null), 0.0f, "cardScale", null, composerStartRestartGroup, 3120, 20))), false, shape2, j2, 0L, Dp.m8224constructorimpl(2), 0.0f, null, mutableInteractionSourceRememberInteraction, ComposableLambdaKt.rememberComposableLambda(1441917245, true, new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CommonKt.PressableCard_fWhpE4E$lambda$2(paddingValues4, content, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | 1572864 | (i12 & 7168) | (i12 & 57344), 6, 420);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier5;
                        paddingValues3 = paddingValues4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                    }
                    modifier3 = companion;
                    shape3 = large;
                    i6 = i3;
                    paddingValuesM919PaddingValues0680j_4 = paddingValues2;
                    long j4 = surfaceContainer;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(909797928, i6, -1, "com.zhawoilah.wgxt.ui.components.PressableCard (Common.kt:48)");
                    }
                    mutableInteractionSourceRememberInteraction = rememberInteraction(composerStartRestartGroup, 0);
                    if (PressableCard_fWhpE4E$lambda$0(PressInteractionKt.collectIsPressedAsState(mutableInteractionSourceRememberInteraction, composerStartRestartGroup, 0))) {
                        f = 0.97f;
                    } else {
                        f = 1.0f;
                    }
                    final PaddingValues paddingValues5 = paddingValuesM919PaddingValues0680j_4;
                    float f3 = f;
                    int i13 = i6;
                    int i14 = i13 << 3;
                    j2 = j4;
                    shape2 = shape3;
                    Modifier modifier6 = modifier3;
                    SurfaceKt.m3087Surfaceo_FOJdg(onClick, ScaleKt.scale(modifier3, PressableCard_fWhpE4E$lambda$1(AnimateAsStateKt.animateFloatAsState(f3, AnimationSpecKt.spring$default(0.5f, 1500.0f, null, 4, null), 0.0f, "cardScale", null, composerStartRestartGroup, 3120, 20))), false, shape2, j2, 0L, Dp.m8224constructorimpl(2), 0.0f, null, mutableInteractionSourceRememberInteraction, ComposableLambdaKt.rememberComposableLambda(1441917245, true, new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CommonKt.PressableCard_fWhpE4E$lambda$2(paddingValues5, content, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, (i13 & 14) | 1572864 | (i14 & 7168) | (i14 & 57344), 6, 420);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier6;
                    paddingValues3 = paddingValues5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier2 = companion;
                    shape2 = large;
                    j2 = surfaceContainer;
                    paddingValues3 = paddingValues2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CommonKt.PressableCard_fWhpE4E$lambda$3(onClick, modifier2, shape2, j2, paddingValues3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            paddingValues2 = paddingValues;
            if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                ComposerKt.sourceInformation(composerStartRestartGroup, "44@1998L6,45@2074L11");
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getLarge();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        surfaceContainer = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainer();
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        Modifier modifier7 = companion;
                        i6 = i3;
                        paddingValuesM919PaddingValues0680j_4 = PaddingKt.m919PaddingValues0680j_4(Dp.m8224constructorimpl(0));
                        modifier3 = modifier7;
                        shape3 = large;
                    } else {
                        modifier3 = companion;
                        shape3 = large;
                        i6 = i3;
                        paddingValuesM919PaddingValues0680j_4 = paddingValues2;
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getLarge();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        surfaceContainer = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainer();
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        Modifier modifier8 = companion;
                        i6 = i3;
                        paddingValuesM919PaddingValues0680j_4 = PaddingKt.m919PaddingValues0680j_4(Dp.m8224constructorimpl(0));
                        modifier3 = modifier8;
                        shape3 = large;
                    } else {
                        modifier3 = companion;
                        shape3 = large;
                        i6 = i3;
                        paddingValuesM919PaddingValues0680j_4 = paddingValues2;
                    }
                }
                long j5 = surfaceContainer;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(909797928, i6, -1, "com.zhawoilah.wgxt.ui.components.PressableCard (Common.kt:48)");
                }
                mutableInteractionSourceRememberInteraction = rememberInteraction(composerStartRestartGroup, 0);
                if (PressableCard_fWhpE4E$lambda$0(PressInteractionKt.collectIsPressedAsState(mutableInteractionSourceRememberInteraction, composerStartRestartGroup, 0))) {
                    f = 0.97f;
                } else {
                    f = 1.0f;
                }
                final PaddingValues paddingValues6 = paddingValuesM919PaddingValues0680j_4;
                float f4 = f;
                int i15 = i6;
                int i16 = i15 << 3;
                j2 = j5;
                shape2 = shape3;
                Modifier modifier9 = modifier3;
                SurfaceKt.m3087Surfaceo_FOJdg(onClick, ScaleKt.scale(modifier3, PressableCard_fWhpE4E$lambda$1(AnimateAsStateKt.animateFloatAsState(f4, AnimationSpecKt.spring$default(0.5f, 1500.0f, null, 4, null), 0.0f, "cardScale", null, composerStartRestartGroup, 3120, 20))), false, shape2, j2, 0L, Dp.m8224constructorimpl(2), 0.0f, null, mutableInteractionSourceRememberInteraction, ComposableLambdaKt.rememberComposableLambda(1441917245, true, new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CommonKt.PressableCard_fWhpE4E$lambda$2(paddingValues6, content, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i15 & 14) | 1572864 | (i16 & 7168) | (i16 & 57344), 6, 420);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier9;
                paddingValues3 = paddingValues6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = companion;
                shape2 = large;
                j2 = surfaceContainer;
                paddingValues3 = paddingValues2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CommonKt.PressableCard_fWhpE4E$lambda$3(onClick, modifier2, shape2, j2, paddingValues3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 48;
        companion = modifier;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                large = shape;
                if (composerStartRestartGroup.changed(large)) {
                }
                i3 |= i9;
            } else {
                large = shape;
            }
            i3 |= i9;
        } else {
            large = shape;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                surfaceContainer = j;
                if (composerStartRestartGroup.changed(surfaceContainer)) {
                }
                i3 |= i10;
            } else {
                surfaceContainer = j;
            }
            i3 |= i10;
        } else {
            surfaceContainer = j;
        }
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            if ((196608 & i) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
                composerStartRestartGroup.startDefaults();
                ComposerKt.sourceInformation(composerStartRestartGroup, "44@1998L6,45@2074L11");
                if ((i & 1) != 0) {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getLarge();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        surfaceContainer = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainer();
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        Modifier modifier10 = companion;
                        i6 = i3;
                        paddingValuesM919PaddingValues0680j_4 = PaddingKt.m919PaddingValues0680j_4(Dp.m8224constructorimpl(0));
                        modifier3 = modifier10;
                        shape3 = large;
                    } else {
                        modifier3 = companion;
                        shape3 = large;
                        i6 = i3;
                        paddingValuesM919PaddingValues0680j_4 = paddingValues2;
                    }
                } else {
                    if (i8 != 0) {
                        companion = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) != 0) {
                        large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getLarge();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        surfaceContainer = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainer();
                        i3 &= -7169;
                    }
                    if (i4 != 0) {
                        Modifier modifier11 = companion;
                        i6 = i3;
                        paddingValuesM919PaddingValues0680j_4 = PaddingKt.m919PaddingValues0680j_4(Dp.m8224constructorimpl(0));
                        modifier3 = modifier11;
                        shape3 = large;
                    } else {
                        modifier3 = companion;
                        shape3 = large;
                        i6 = i3;
                        paddingValuesM919PaddingValues0680j_4 = paddingValues2;
                    }
                }
                long j6 = surfaceContainer;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(909797928, i6, -1, "com.zhawoilah.wgxt.ui.components.PressableCard (Common.kt:48)");
                }
                mutableInteractionSourceRememberInteraction = rememberInteraction(composerStartRestartGroup, 0);
                if (PressableCard_fWhpE4E$lambda$0(PressInteractionKt.collectIsPressedAsState(mutableInteractionSourceRememberInteraction, composerStartRestartGroup, 0))) {
                    f = 0.97f;
                } else {
                    f = 1.0f;
                }
                final PaddingValues paddingValues7 = paddingValuesM919PaddingValues0680j_4;
                float f5 = f;
                int i17 = i6;
                int i18 = i17 << 3;
                j2 = j6;
                shape2 = shape3;
                Modifier modifier12 = modifier3;
                SurfaceKt.m3087Surfaceo_FOJdg(onClick, ScaleKt.scale(modifier3, PressableCard_fWhpE4E$lambda$1(AnimateAsStateKt.animateFloatAsState(f5, AnimationSpecKt.spring$default(0.5f, 1500.0f, null, 4, null), 0.0f, "cardScale", null, composerStartRestartGroup, 3120, 20))), false, shape2, j2, 0L, Dp.m8224constructorimpl(2), 0.0f, null, mutableInteractionSourceRememberInteraction, ComposableLambdaKt.rememberComposableLambda(1441917245, true, new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CommonKt.PressableCard_fWhpE4E$lambda$2(paddingValues7, content, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i17 & 14) | 1572864 | (i18 & 7168) | (i18 & 57344), 6, 420);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier12;
                paddingValues3 = paddingValues7;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier2 = companion;
                shape2 = large;
                j2 = surfaceContainer;
                paddingValues3 = paddingValues2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CommonKt.PressableCard_fWhpE4E$lambda$3(onClick, modifier2, shape2, j2, paddingValues3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        paddingValues2 = paddingValues;
        if ((196608 & i) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i3 & 1)) {
            composerStartRestartGroup.startDefaults();
            ComposerKt.sourceInformation(composerStartRestartGroup, "44@1998L6,45@2074L11");
            if ((i & 1) != 0) {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getLarge();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    surfaceContainer = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainer();
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    Modifier modifier13 = companion;
                    i6 = i3;
                    paddingValuesM919PaddingValues0680j_4 = PaddingKt.m919PaddingValues0680j_4(Dp.m8224constructorimpl(0));
                    modifier3 = modifier13;
                    shape3 = large;
                } else {
                    modifier3 = companion;
                    shape3 = large;
                    i6 = i3;
                    paddingValuesM919PaddingValues0680j_4 = paddingValues2;
                }
            } else {
                if (i8 != 0) {
                    companion = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    large = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, MaterialTheme.$stable).getLarge();
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    surfaceContainer = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainer();
                    i3 &= -7169;
                }
                if (i4 != 0) {
                    Modifier modifier14 = companion;
                    i6 = i3;
                    paddingValuesM919PaddingValues0680j_4 = PaddingKt.m919PaddingValues0680j_4(Dp.m8224constructorimpl(0));
                    modifier3 = modifier14;
                    shape3 = large;
                } else {
                    modifier3 = companion;
                    shape3 = large;
                    i6 = i3;
                    paddingValuesM919PaddingValues0680j_4 = paddingValues2;
                }
            }
            long j7 = surfaceContainer;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(909797928, i6, -1, "com.zhawoilah.wgxt.ui.components.PressableCard (Common.kt:48)");
            }
            mutableInteractionSourceRememberInteraction = rememberInteraction(composerStartRestartGroup, 0);
            if (PressableCard_fWhpE4E$lambda$0(PressInteractionKt.collectIsPressedAsState(mutableInteractionSourceRememberInteraction, composerStartRestartGroup, 0))) {
                f = 0.97f;
            } else {
                f = 1.0f;
            }
            final PaddingValues paddingValues8 = paddingValuesM919PaddingValues0680j_4;
            float f6 = f;
            int i19 = i6;
            int i110 = i19 << 3;
            j2 = j7;
            shape2 = shape3;
            Modifier modifier15 = modifier3;
            SurfaceKt.m3087Surfaceo_FOJdg(onClick, ScaleKt.scale(modifier3, PressableCard_fWhpE4E$lambda$1(AnimateAsStateKt.animateFloatAsState(f6, AnimationSpecKt.spring$default(0.5f, 1500.0f, null, 4, null), 0.0f, "cardScale", null, composerStartRestartGroup, 3120, 20))), false, shape2, j2, 0L, Dp.m8224constructorimpl(2), 0.0f, null, mutableInteractionSourceRememberInteraction, ComposableLambdaKt.rememberComposableLambda(1441917245, true, new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommonKt.PressableCard_fWhpE4E$lambda$2(paddingValues8, content, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i19 & 14) | 1572864 | (i110 & 7168) | (i110 & 57344), 6, 420);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier15;
            paddingValues3 = paddingValues8;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = companion;
            shape2 = large;
            j2 = surfaceContainer;
            paddingValues3 = paddingValues2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommonKt.PressableCard_fWhpE4E$lambda$3(onClick, modifier2, shape2, j2, paddingValues3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PressableCard_fWhpE4E$lambda$2(PaddingValues paddingValues, Function2 function2, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C64@2758L51:Common.kt#qv7s45");
        if (!composer.shouldExecute((i & 3) != 2, i & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1441917245, i, -1, "com.zhawoilah.wgxt.ui.components.PressableCard.<anonymous> (Common.kt:64)");
            }
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
            ComposerKt.sourceInformationMarkerStart(composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierPadding);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM4640constructorimpl = Updater.m4640constructorimpl(composer);
            Updater.m4648setimpl(composerM4640constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4648setimpl(composerM4640constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4644initimpl(composerM4640constructorimpl, Integer.valueOf(iHashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4646reconcileimpl(composerM4640constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4648setimpl(composerM4640constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composer, 1964551171, "C64@2798L9:Common.kt#qv7s45");
            function2.invoke(composer, 0);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final MutableInteractionSource rememberInteraction(Composer composer, int i) {
        ComposerKt.sourceInformationMarkerStart(composer, -432050736, "C(rememberInteraction)70@2922L39:Common.kt#qv7s45");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-432050736, i, -1, "com.zhawoilah.wgxt.ui.components.rememberInteraction (Common.kt:70)");
        }
        ComposerKt.sourceInformationMarkerStart(composer, 1411073111, "CC(remember):Common.kt#9igjgp");
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
            composer.updateRememberedValue(objRememberedValue);
        }
        MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd(composer);
        return mutableInteractionSource;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x010c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0118  */
    /* JADX WARN: Code duplicated, block: B:68:0x011c  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: IconBadge-DTcfvLk, reason: not valid java name */
    public static final void m8880IconBadgeDTcfvLk(final ImageVector icon, final long j, final long j2, Modifier modifier, int i, Composer composer, final int i2, final int i3) {
        int i4;
        long j3;
        Modifier modifier2;
        int i5;
        int i6;
        int i7;
        boolean z;
        final Modifier modifier3;
        final int i8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier.Companion companion;
        int i9;
        Function0<ComposeUiNode> constructor;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1164868792);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(IconBadge)N(icon,tint:c#ui.graphics.Color,container:c#ui.graphics.Color,modifier,size)81@3228L287:Common.kt#qv7s45");
        if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(icon) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            j3 = j;
            i4 |= composerStartRestartGroup.changed(j3) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        int i10 = i3 & 8;
        if (i10 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    i6 = i;
                    if (composerStartRestartGroup.changed(i6)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i4 |= i7;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                } else {
                    if (i10 != 0) {
                        companion = Modifier.INSTANCE;
                    } else {
                        companion = modifier2;
                    }
                    if (i5 != 0) {
                        i9 = 44;
                    } else {
                        i9 = i6;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1164868792, i4, -1, "com.zhawoilah.wgxt.ui.components.IconBadge (Common.kt:80)");
                    }
                    Modifier modifierM297backgroundbw27NRU$default = BackgroundKt.m297backgroundbw27NRU$default(ClipKt.clip(SizeKt.m974size3ABfNKs(companion, Dp.m8224constructorimpl(i9)), RoundedCornerShapeKt.getCircleShape()), j2, null, 2, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM297backgroundbw27NRU$default);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM4640constructorimpl = Updater.m4640constructorimpl(composerStartRestartGroup);
                    Updater.m4648setimpl(composerM4640constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4648setimpl(composerM4640constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m4644initimpl(composerM4640constructorimpl, Integer.valueOf(iHashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m4646reconcileimpl(composerM4640constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m4648setimpl(composerM4640constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1463564996, "C88@3416L93:Common.kt#qv7s45");
                    i6 = i9;
                    Modifier modifier4 = companion;
                    IconKt.m2550Iconww6aTOc(icon, (String) null, SizeKt.m974size3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl((float) (((double) i9) * 0.5d))), j3, composerStartRestartGroup, ((i4 << 6) & 7168) | (i4 & 14) | 48, 0);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                }
                i8 = i6;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CommonKt.IconBadge_DTcfvLk$lambda$1(icon, j, j2, modifier3, i8, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 24576;
            i6 = i;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i5 != 0) {
                    i9 = 44;
                } else {
                    i9 = i6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1164868792, i4, -1, "com.zhawoilah.wgxt.ui.components.IconBadge (Common.kt:80)");
                }
                Modifier modifierM297backgroundbw27NRU$default2 = BackgroundKt.m297backgroundbw27NRU$default(ClipKt.clip(SizeKt.m974size3ABfNKs(companion, Dp.m8224constructorimpl(i9)), RoundedCornerShapeKt.getCircleShape()), j2, null, 2, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM297backgroundbw27NRU$default2);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4640constructorimpl2 = Updater.m4640constructorimpl(composerStartRestartGroup);
                Updater.m4648setimpl(composerM4640constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4648setimpl(composerM4640constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m4644initimpl(composerM4640constructorimpl2, Integer.valueOf(iHashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m4646reconcileimpl(composerM4640constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m4648setimpl(composerM4640constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1463564996, "C88@3416L93:Common.kt#qv7s45");
                i6 = i9;
                Modifier modifier5 = companion;
                IconKt.m2550Iconww6aTOc(icon, (String) null, SizeKt.m974size3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl((float) (((double) i9) * 0.5d))), j3, composerStartRestartGroup, ((i4 << 6) & 7168) | (i4 & 14) | 48, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            i8 = i6;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CommonKt.IconBadge_DTcfvLk$lambda$1(icon, j, j2, modifier3, i8, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                i6 = i;
                if (composerStartRestartGroup.changed(i6)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i4 |= i7;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                if (i10 != 0) {
                    companion = Modifier.INSTANCE;
                } else {
                    companion = modifier2;
                }
                if (i5 != 0) {
                    i9 = 44;
                } else {
                    i9 = i6;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1164868792, i4, -1, "com.zhawoilah.wgxt.ui.components.IconBadge (Common.kt:80)");
                }
                Modifier modifierM297backgroundbw27NRU$default3 = BackgroundKt.m297backgroundbw27NRU$default(ClipKt.clip(SizeKt.m974size3ABfNKs(companion, Dp.m8224constructorimpl(i9)), RoundedCornerShapeKt.getCircleShape()), j2, null, 2, null);
                Alignment center3 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center3, false);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM297backgroundbw27NRU$default3);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4640constructorimpl3 = Updater.m4640constructorimpl(composerStartRestartGroup);
                Updater.m4648setimpl(composerM4640constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4648setimpl(composerM4640constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m4644initimpl(composerM4640constructorimpl3, Integer.valueOf(iHashCode3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m4646reconcileimpl(composerM4640constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m4648setimpl(composerM4640constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1463564996, "C88@3416L93:Common.kt#qv7s45");
                i6 = i9;
                Modifier modifier6 = companion;
                IconKt.m2550Iconww6aTOc(icon, (String) null, SizeKt.m974size3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl((float) (((double) i9) * 0.5d))), j3, composerStartRestartGroup, ((i4 << 6) & 7168) | (i4 & 14) | 48, 0);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
            }
            i8 = i6;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CommonKt.IconBadge_DTcfvLk$lambda$1(icon, j, j2, modifier3, i8, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 24576;
        i6 = i;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i4 & 1)) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i10 != 0) {
                companion = Modifier.INSTANCE;
            } else {
                companion = modifier2;
            }
            if (i5 != 0) {
                i9 = 44;
            } else {
                i9 = i6;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1164868792, i4, -1, "com.zhawoilah.wgxt.ui.components.IconBadge (Common.kt:80)");
            }
            Modifier modifierM297backgroundbw27NRU$default4 = BackgroundKt.m297backgroundbw27NRU$default(ClipKt.clip(SizeKt.m974size3ABfNKs(companion, Dp.m8224constructorimpl(i9)), RoundedCornerShapeKt.getCircleShape()), j2, null, 2, null);
            Alignment center4 = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(center4, false);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM297backgroundbw27NRU$default4);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4640constructorimpl4 = Updater.m4640constructorimpl(composerStartRestartGroup);
            Updater.m4648setimpl(composerM4640constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4648setimpl(composerM4640constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4644initimpl(composerM4640constructorimpl4, Integer.valueOf(iHashCode4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4646reconcileimpl(composerM4640constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4648setimpl(composerM4640constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1463564996, "C88@3416L93:Common.kt#qv7s45");
            i6 = i9;
            Modifier modifier7 = companion;
            IconKt.m2550Iconww6aTOc(icon, (String) null, SizeKt.m974size3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl((float) (((double) i9) * 0.5d))), j3, composerStartRestartGroup, ((i4 << 6) & 7168) | (i4 & 14) | 48, 0);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier7;
        }
        i8 = i6;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommonKt.IconBadge_DTcfvLk$lambda$1(icon, j, j2, modifier3, i8, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void StaggerReveal(boolean z, final int i, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i2) {
        int i3;
        final boolean z2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1063583792);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(StaggerReveal)N(visible,delayMillis,content)102@3847L10,104@3901L13,99@3695L219:Common.kt#qv7s45");
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if (!composerStartRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            z2 = z;
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1063583792, i3, -1, "com.zhawoilah.wgxt.ui.components.StaggerReveal (Common.kt:98)");
            }
            EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(320, i, null, 4, null), 0.0f, 2, null);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(360, i, null, 4, null);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 98200666, "CC(remember):Common.kt#9igjgp");
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(CommonKt.StaggerReveal$lambda$0$0(((Integer) obj).intValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            z2 = z;
            AnimatedVisibilityKt.AnimatedVisibility(z2, (Modifier) null, enterTransitionFadeIn$default.plus(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(120, 0, null, 6, null), 0.0f, 2, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-685549400, true, new Function3() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CommonKt.StaggerReveal$lambda$1(content, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 199680, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommonKt.StaggerReveal$lambda$2(z2, i, content, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int StaggerReveal$lambda$0$0(int i) {
        return i / 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StaggerReveal$lambda$1(Function2 function2, AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation(composer, "C104@3903L9:Common.kt#qv7s45");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-685549400, i, -1, "com.zhawoilah.wgxt.ui.components.StaggerReveal.<anonymous> (Common.kt:104)");
        }
        function2.invoke(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x006e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x008a  */
    /* JADX WARN: Code duplicated, block: B:47:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x011f  */
    /* JADX WARN: Code duplicated, block: B:73:0x012b  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0212  */
    /* JADX WARN: Code duplicated, block: B:78:0x0282  */
    /* JADX WARN: Code duplicated, block: B:81:0x028f  */
    /* JADX WARN: Code duplicated, block: B:82:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:85:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:87:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:90:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void MessageState(final ImageVector icon, final String title, String str, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function3;
        int i7;
        int i8;
        boolean z;
        final String str3;
        final Modifier modifier3;
        final Function2<? super Composer, ? super Integer, Unit> function4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        String str4;
        Modifier modifier4;
        Function0<ComposeUiNode> constructor;
        String str5;
        int i9;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(831403318);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(MessageState)N(icon,title,subtitle,modifier,action)116@4169L958:Common.kt#qv7s45");
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                str2 = str;
                i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        function3 = function2;
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i3;
                    if ((i8 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (composerStartRestartGroup.shouldExecute(z, i8 & 1)) {
                        composerStartRestartGroup.skipToGroupEnd();
                        str3 = str2;
                        modifier3 = modifier2;
                    } else {
                        if (i10 != 0) {
                            str4 = null;
                        } else {
                            str4 = str2;
                        }
                        if (i4 != 0) {
                            modifier4 = Modifier.INSTANCE;
                        } else {
                            modifier4 = modifier2;
                        }
                        if (i6 != 0) {
                            function3 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(831403318, i8, -1, "com.zhawoilah.wgxt.ui.components.MessageState (Common.kt:115)");
                        }
                        Modifier modifierM926padding3ABfNKs = PaddingKt.m926padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m8224constructorimpl(32));
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, composerStartRestartGroup, 54);
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM926padding3ABfNKs);
                        constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        Composer composerM4640constructorimpl = Updater.m4640constructorimpl(composerStartRestartGroup);
                        Updater.m4648setimpl(composerM4640constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4648setimpl(composerM4640constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Updater.m4644initimpl(composerM4640constructorimpl, Integer.valueOf(iHashCode), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        Updater.m4646reconcileimpl(composerM4640constructorimpl, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        Updater.m4648setimpl(composerM4640constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1593508352, "C123@4431L11,124@4499L11,121@4362L203,127@4574L30,128@4647L10,128@4613L87:Common.kt#qv7s45");
                        m8880IconBadgeDTcfvLk(icon, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainerHigh(), null, 72, composerStartRestartGroup, (i8 & 14) | 24576, 8);
                        SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(16)), composerStartRestartGroup, 6);
                        Modifier modifier5 = modifier4;
                        Function2<? super Composer, ? super Integer, Unit> function5 = function3;
                        TextKt.m3256TextNvy7gAk(title, null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composerStartRestartGroup, (i8 >> 3) & 14, 0, 130046);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (str4 != null) {
                            composerStartRestartGroup.startReplaceGroup(1593859736);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "130@4745L29,133@4857L10,134@4918L11,131@4787L220");
                            SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(6)), composerStartRestartGroup, 6);
                            str5 = str4;
                            i9 = 6;
                            TextKt.m3256TextNvy7gAk(str5, null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), composerStartRestartGroup, (i8 >> 6) & 14, 0, 130042);
                            composerStartRestartGroup = composerStartRestartGroup;
                        } else {
                            str5 = str4;
                            i9 = 6;
                            composerStartRestartGroup.startReplaceGroup(1589156726);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function3 = function5;
                        if (function3 != null) {
                            composerStartRestartGroup.startReplaceGroup(1594165675);
                            ComposerKt.sourceInformation(composerStartRestartGroup, "139@5060L30,140@5103L8");
                            SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(20)), composerStartRestartGroup, i9);
                            function3.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 12) & 14));
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1589156726);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        composerStartRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str3 = str5;
                        modifier3 = modifier5;
                    }
                    function4 = function3;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CommonKt.MessageState$lambda$1(icon, title, str3, modifier3, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i3 |= 24576;
                function3 = function2;
                i8 = i3;
                if ((i8 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i8 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    str3 = str2;
                    modifier3 = modifier2;
                } else {
                    if (i10 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i4 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(831403318, i8, -1, "com.zhawoilah.wgxt.ui.components.MessageState (Common.kt:115)");
                    }
                    Modifier modifierM926padding3ABfNKs2 = PaddingKt.m926padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m8224constructorimpl(32));
                    Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center2 = Arrangement.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(center2, centerHorizontally2, composerStartRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM926padding3ABfNKs2);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM4640constructorimpl2 = Updater.m4640constructorimpl(composerStartRestartGroup);
                    Updater.m4648setimpl(composerM4640constructorimpl2, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4648setimpl(composerM4640constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m4644initimpl(composerM4640constructorimpl2, Integer.valueOf(iHashCode2), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m4646reconcileimpl(composerM4640constructorimpl2, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m4648setimpl(composerM4640constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1593508352, "C123@4431L11,124@4499L11,121@4362L203,127@4574L30,128@4647L10,128@4613L87:Common.kt#qv7s45");
                    m8880IconBadgeDTcfvLk(icon, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainerHigh(), null, 72, composerStartRestartGroup, (i8 & 14) | 24576, 8);
                    SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(16)), composerStartRestartGroup, 6);
                    Modifier modifier6 = modifier4;
                    Function2<? super Composer, ? super Integer, Unit> function6 = function3;
                    TextKt.m3256TextNvy7gAk(title, null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composerStartRestartGroup, (i8 >> 3) & 14, 0, 130046);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (str4 != null) {
                        composerStartRestartGroup.startReplaceGroup(1593859736);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "130@4745L29,133@4857L10,134@4918L11,131@4787L220");
                        SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(6)), composerStartRestartGroup, 6);
                        str5 = str4;
                        i9 = 6;
                        TextKt.m3256TextNvy7gAk(str5, null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), composerStartRestartGroup, (i8 >> 6) & 14, 0, 130042);
                        composerStartRestartGroup = composerStartRestartGroup;
                    } else {
                        str5 = str4;
                        i9 = 6;
                        composerStartRestartGroup.startReplaceGroup(1589156726);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function3 = function6;
                    if (function3 != null) {
                        composerStartRestartGroup.startReplaceGroup(1594165675);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "139@5060L30,140@5103L8");
                        SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(20)), composerStartRestartGroup, i9);
                        function3.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 12) & 14));
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1589156726);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str3 = str5;
                    modifier3 = modifier6;
                }
                function4 = function3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CommonKt.MessageState$lambda$1(icon, title, str3, modifier3, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 3072;
            modifier2 = modifier;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i8 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i8 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    str3 = str2;
                    modifier3 = modifier2;
                } else {
                    if (i10 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i4 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(831403318, i8, -1, "com.zhawoilah.wgxt.ui.components.MessageState (Common.kt:115)");
                    }
                    Modifier modifierM926padding3ABfNKs3 = PaddingKt.m926padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m8224constructorimpl(32));
                    Alignment.Horizontal centerHorizontally3 = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center3 = Arrangement.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(center3, centerHorizontally3, composerStartRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM926padding3ABfNKs3);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM4640constructorimpl3 = Updater.m4640constructorimpl(composerStartRestartGroup);
                    Updater.m4648setimpl(composerM4640constructorimpl3, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4648setimpl(composerM4640constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m4644initimpl(composerM4640constructorimpl3, Integer.valueOf(iHashCode3), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m4646reconcileimpl(composerM4640constructorimpl3, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m4648setimpl(composerM4640constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1593508352, "C123@4431L11,124@4499L11,121@4362L203,127@4574L30,128@4647L10,128@4613L87:Common.kt#qv7s45");
                    m8880IconBadgeDTcfvLk(icon, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainerHigh(), null, 72, composerStartRestartGroup, (i8 & 14) | 24576, 8);
                    SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(16)), composerStartRestartGroup, 6);
                    Modifier modifier7 = modifier4;
                    Function2<? super Composer, ? super Integer, Unit> function7 = function3;
                    TextKt.m3256TextNvy7gAk(title, null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composerStartRestartGroup, (i8 >> 3) & 14, 0, 130046);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (str4 != null) {
                        composerStartRestartGroup.startReplaceGroup(1593859736);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "130@4745L29,133@4857L10,134@4918L11,131@4787L220");
                        SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(6)), composerStartRestartGroup, 6);
                        str5 = str4;
                        i9 = 6;
                        TextKt.m3256TextNvy7gAk(str5, null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), composerStartRestartGroup, (i8 >> 6) & 14, 0, 130042);
                        composerStartRestartGroup = composerStartRestartGroup;
                    } else {
                        str5 = str4;
                        i9 = 6;
                        composerStartRestartGroup.startReplaceGroup(1589156726);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function3 = function7;
                    if (function3 != null) {
                        composerStartRestartGroup.startReplaceGroup(1594165675);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "139@5060L30,140@5103L8");
                        SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(20)), composerStartRestartGroup, i9);
                        function3.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 12) & 14));
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1589156726);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str3 = str5;
                    modifier3 = modifier7;
                }
                function4 = function3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CommonKt.MessageState$lambda$1(icon, title, str3, modifier3, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            function3 = function2;
            i8 = i3;
            if ((i8 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i8 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                str3 = str2;
                modifier3 = modifier2;
            } else {
                if (i10 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i4 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i6 != 0) {
                    function3 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(831403318, i8, -1, "com.zhawoilah.wgxt.ui.components.MessageState (Common.kt:115)");
                }
                Modifier modifierM926padding3ABfNKs4 = PaddingKt.m926padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m8224constructorimpl(32));
                Alignment.Horizontal centerHorizontally4 = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical center4 = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(center4, centerHorizontally4, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM926padding3ABfNKs4);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4640constructorimpl4 = Updater.m4640constructorimpl(composerStartRestartGroup);
                Updater.m4648setimpl(composerM4640constructorimpl4, measurePolicyColumnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4648setimpl(composerM4640constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m4644initimpl(composerM4640constructorimpl4, Integer.valueOf(iHashCode4), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m4646reconcileimpl(composerM4640constructorimpl4, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m4648setimpl(composerM4640constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1593508352, "C123@4431L11,124@4499L11,121@4362L203,127@4574L30,128@4647L10,128@4613L87:Common.kt#qv7s45");
                m8880IconBadgeDTcfvLk(icon, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainerHigh(), null, 72, composerStartRestartGroup, (i8 & 14) | 24576, 8);
                SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(16)), composerStartRestartGroup, 6);
                Modifier modifier8 = modifier4;
                Function2<? super Composer, ? super Integer, Unit> function8 = function3;
                TextKt.m3256TextNvy7gAk(title, null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composerStartRestartGroup, (i8 >> 3) & 14, 0, 130046);
                composerStartRestartGroup = composerStartRestartGroup;
                if (str4 != null) {
                    composerStartRestartGroup.startReplaceGroup(1593859736);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "130@4745L29,133@4857L10,134@4918L11,131@4787L220");
                    SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(6)), composerStartRestartGroup, 6);
                    str5 = str4;
                    i9 = 6;
                    TextKt.m3256TextNvy7gAk(str5, null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), composerStartRestartGroup, (i8 >> 6) & 14, 0, 130042);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    str5 = str4;
                    i9 = 6;
                    composerStartRestartGroup.startReplaceGroup(1589156726);
                }
                composerStartRestartGroup.endReplaceGroup();
                function3 = function8;
                if (function3 != null) {
                    composerStartRestartGroup.startReplaceGroup(1594165675);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "139@5060L30,140@5103L8");
                    SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(20)), composerStartRestartGroup, i9);
                    function3.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 12) & 14));
                } else {
                    composerStartRestartGroup.startReplaceGroup(1589156726);
                }
                composerStartRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str3 = str5;
                modifier3 = modifier8;
            }
            function4 = function3;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CommonKt.MessageState$lambda$1(icon, title, str3, modifier3, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 384;
        str2 = str;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i3;
                if ((i8 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (composerStartRestartGroup.shouldExecute(z, i8 & 1)) {
                    composerStartRestartGroup.skipToGroupEnd();
                    str3 = str2;
                    modifier3 = modifier2;
                } else {
                    if (i10 != 0) {
                        str4 = null;
                    } else {
                        str4 = str2;
                    }
                    if (i4 != 0) {
                        modifier4 = Modifier.INSTANCE;
                    } else {
                        modifier4 = modifier2;
                    }
                    if (i6 != 0) {
                        function3 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(831403318, i8, -1, "com.zhawoilah.wgxt.ui.components.MessageState (Common.kt:115)");
                    }
                    Modifier modifierM926padding3ABfNKs5 = PaddingKt.m926padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m8224constructorimpl(32));
                    Alignment.Horizontal centerHorizontally5 = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center5 = Arrangement.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(center5, centerHorizontally5, composerStartRestartGroup, 54);
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                    int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM926padding3ABfNKs5);
                    constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM4640constructorimpl5 = Updater.m4640constructorimpl(composerStartRestartGroup);
                    Updater.m4648setimpl(composerM4640constructorimpl5, measurePolicyColumnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4648setimpl(composerM4640constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Updater.m4644initimpl(composerM4640constructorimpl5, Integer.valueOf(iHashCode5), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    Updater.m4646reconcileimpl(composerM4640constructorimpl5, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    Updater.m4648setimpl(composerM4640constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1593508352, "C123@4431L11,124@4499L11,121@4362L203,127@4574L30,128@4647L10,128@4613L87:Common.kt#qv7s45");
                    m8880IconBadgeDTcfvLk(icon, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainerHigh(), null, 72, composerStartRestartGroup, (i8 & 14) | 24576, 8);
                    SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(16)), composerStartRestartGroup, 6);
                    Modifier modifier9 = modifier4;
                    Function2<? super Composer, ? super Integer, Unit> function9 = function3;
                    TextKt.m3256TextNvy7gAk(title, null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composerStartRestartGroup, (i8 >> 3) & 14, 0, 130046);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (str4 != null) {
                        composerStartRestartGroup.startReplaceGroup(1593859736);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "130@4745L29,133@4857L10,134@4918L11,131@4787L220");
                        SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(6)), composerStartRestartGroup, 6);
                        str5 = str4;
                        i9 = 6;
                        TextKt.m3256TextNvy7gAk(str5, null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), composerStartRestartGroup, (i8 >> 6) & 14, 0, 130042);
                        composerStartRestartGroup = composerStartRestartGroup;
                    } else {
                        str5 = str4;
                        i9 = 6;
                        composerStartRestartGroup.startReplaceGroup(1589156726);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function3 = function9;
                    if (function3 != null) {
                        composerStartRestartGroup.startReplaceGroup(1594165675);
                        ComposerKt.sourceInformation(composerStartRestartGroup, "139@5060L30,140@5103L8");
                        SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(20)), composerStartRestartGroup, i9);
                        function3.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 12) & 14));
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1589156726);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    composerStartRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str3 = str5;
                    modifier3 = modifier9;
                }
                function4 = function3;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CommonKt.MessageState$lambda$1(icon, title, str3, modifier3, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i3 |= 24576;
            function3 = function2;
            i8 = i3;
            if ((i8 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i8 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                str3 = str2;
                modifier3 = modifier2;
            } else {
                if (i10 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i4 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i6 != 0) {
                    function3 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(831403318, i8, -1, "com.zhawoilah.wgxt.ui.components.MessageState (Common.kt:115)");
                }
                Modifier modifierM926padding3ABfNKs6 = PaddingKt.m926padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m8224constructorimpl(32));
                Alignment.Horizontal centerHorizontally6 = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical center6 = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(center6, centerHorizontally6, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int iHashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM926padding3ABfNKs6);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4640constructorimpl6 = Updater.m4640constructorimpl(composerStartRestartGroup);
                Updater.m4648setimpl(composerM4640constructorimpl6, measurePolicyColumnMeasurePolicy6, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4648setimpl(composerM4640constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m4644initimpl(composerM4640constructorimpl6, Integer.valueOf(iHashCode6), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m4646reconcileimpl(composerM4640constructorimpl6, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m4648setimpl(composerM4640constructorimpl6, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance6 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1593508352, "C123@4431L11,124@4499L11,121@4362L203,127@4574L30,128@4647L10,128@4613L87:Common.kt#qv7s45");
                m8880IconBadgeDTcfvLk(icon, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainerHigh(), null, 72, composerStartRestartGroup, (i8 & 14) | 24576, 8);
                SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(16)), composerStartRestartGroup, 6);
                Modifier modifier10 = modifier4;
                Function2<? super Composer, ? super Integer, Unit> function10 = function3;
                TextKt.m3256TextNvy7gAk(title, null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composerStartRestartGroup, (i8 >> 3) & 14, 0, 130046);
                composerStartRestartGroup = composerStartRestartGroup;
                if (str4 != null) {
                    composerStartRestartGroup.startReplaceGroup(1593859736);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "130@4745L29,133@4857L10,134@4918L11,131@4787L220");
                    SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(6)), composerStartRestartGroup, 6);
                    str5 = str4;
                    i9 = 6;
                    TextKt.m3256TextNvy7gAk(str5, null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), composerStartRestartGroup, (i8 >> 6) & 14, 0, 130042);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    str5 = str4;
                    i9 = 6;
                    composerStartRestartGroup.startReplaceGroup(1589156726);
                }
                composerStartRestartGroup.endReplaceGroup();
                function3 = function10;
                if (function3 != null) {
                    composerStartRestartGroup.startReplaceGroup(1594165675);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "139@5060L30,140@5103L8");
                    SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(20)), composerStartRestartGroup, i9);
                    function3.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 12) & 14));
                } else {
                    composerStartRestartGroup.startReplaceGroup(1589156726);
                }
                composerStartRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str3 = str5;
                modifier3 = modifier10;
            }
            function4 = function3;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CommonKt.MessageState$lambda$1(icon, title, str3, modifier3, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 3072;
        modifier2 = modifier;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                function3 = function2;
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i3;
            if ((i8 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (composerStartRestartGroup.shouldExecute(z, i8 & 1)) {
                composerStartRestartGroup.skipToGroupEnd();
                str3 = str2;
                modifier3 = modifier2;
            } else {
                if (i10 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                if (i4 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if (i6 != 0) {
                    function3 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(831403318, i8, -1, "com.zhawoilah.wgxt.ui.components.MessageState (Common.kt:115)");
                }
                Modifier modifierM926padding3ABfNKs7 = PaddingKt.m926padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m8224constructorimpl(32));
                Alignment.Horizontal centerHorizontally7 = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical center7 = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy7 = ColumnKt.columnMeasurePolicy(center7, centerHorizontally7, composerStartRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
                int iHashCode7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM926padding3ABfNKs7);
                constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM4640constructorimpl7 = Updater.m4640constructorimpl(composerStartRestartGroup);
                Updater.m4648setimpl(composerM4640constructorimpl7, measurePolicyColumnMeasurePolicy7, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4648setimpl(composerM4640constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Updater.m4644initimpl(composerM4640constructorimpl7, Integer.valueOf(iHashCode7), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                Updater.m4646reconcileimpl(composerM4640constructorimpl7, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                Updater.m4648setimpl(composerM4640constructorimpl7, modifierMaterializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance7 = ColumnScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1593508352, "C123@4431L11,124@4499L11,121@4362L203,127@4574L30,128@4647L10,128@4613L87:Common.kt#qv7s45");
                m8880IconBadgeDTcfvLk(icon, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainerHigh(), null, 72, composerStartRestartGroup, (i8 & 14) | 24576, 8);
                SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(16)), composerStartRestartGroup, 6);
                Modifier modifier11 = modifier4;
                Function2<? super Composer, ? super Integer, Unit> function11 = function3;
                TextKt.m3256TextNvy7gAk(title, null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composerStartRestartGroup, (i8 >> 3) & 14, 0, 130046);
                composerStartRestartGroup = composerStartRestartGroup;
                if (str4 != null) {
                    composerStartRestartGroup.startReplaceGroup(1593859736);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "130@4745L29,133@4857L10,134@4918L11,131@4787L220");
                    SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(6)), composerStartRestartGroup, 6);
                    str5 = str4;
                    i9 = 6;
                    TextKt.m3256TextNvy7gAk(str5, null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), composerStartRestartGroup, (i8 >> 6) & 14, 0, 130042);
                    composerStartRestartGroup = composerStartRestartGroup;
                } else {
                    str5 = str4;
                    i9 = 6;
                    composerStartRestartGroup.startReplaceGroup(1589156726);
                }
                composerStartRestartGroup.endReplaceGroup();
                function3 = function11;
                if (function3 != null) {
                    composerStartRestartGroup.startReplaceGroup(1594165675);
                    ComposerKt.sourceInformation(composerStartRestartGroup, "139@5060L30,140@5103L8");
                    SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(20)), composerStartRestartGroup, i9);
                    function3.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 12) & 14));
                } else {
                    composerStartRestartGroup.startReplaceGroup(1589156726);
                }
                composerStartRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                composerStartRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str3 = str5;
                modifier3 = modifier11;
            }
            function4 = function3;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CommonKt.MessageState$lambda$1(icon, title, str3, modifier3, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i3 |= 24576;
        function3 = function2;
        i8 = i3;
        if ((i8 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (composerStartRestartGroup.shouldExecute(z, i8 & 1)) {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str2;
            modifier3 = modifier2;
        } else {
            if (i10 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            if (i4 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i6 != 0) {
                function3 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(831403318, i8, -1, "com.zhawoilah.wgxt.ui.components.MessageState (Common.kt:115)");
            }
            Modifier modifierM926padding3ABfNKs8 = PaddingKt.m926padding3ABfNKs(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m8224constructorimpl(32));
            Alignment.Horizontal centerHorizontally8 = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center8 = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy8 = ColumnKt.columnMeasurePolicy(center8, centerHorizontally8, composerStartRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -1159599143, "CC(Layout)P(!1,2)81@3355L27,84@3521L416:Layout.kt#80mrfh");
            int iHashCode8 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composerStartRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM926padding3ABfNKs8);
            constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM4640constructorimpl8 = Updater.m4640constructorimpl(composerStartRestartGroup);
            Updater.m4648setimpl(composerM4640constructorimpl8, measurePolicyColumnMeasurePolicy8, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4648setimpl(composerM4640constructorimpl8, currentCompositionLocalMap8, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Updater.m4644initimpl(composerM4640constructorimpl8, Integer.valueOf(iHashCode8), ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            Updater.m4646reconcileimpl(composerM4640constructorimpl8, ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            Updater.m4648setimpl(composerM4640constructorimpl8, modifierMaterializeModifier8, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance8 = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 1593508352, "C123@4431L11,124@4499L11,121@4362L203,127@4574L30,128@4647L10,128@4613L87:Common.kt#qv7s45");
            m8880IconBadgeDTcfvLk(icon, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getSurfaceContainerHigh(), null, 72, composerStartRestartGroup, (i8 & 14) | 24576, 8);
            SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(16)), composerStartRestartGroup, 6);
            Modifier modifier12 = modifier4;
            Function2<? super Composer, ? super Integer, Unit> function12 = function3;
            TextKt.m3256TextNvy7gAk(title, null, 0L, null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getTitleMedium(), composerStartRestartGroup, (i8 >> 3) & 14, 0, 130046);
            composerStartRestartGroup = composerStartRestartGroup;
            if (str4 != null) {
                composerStartRestartGroup.startReplaceGroup(1593859736);
                ComposerKt.sourceInformation(composerStartRestartGroup, "130@4745L29,133@4857L10,134@4918L11,131@4787L220");
                SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(6)), composerStartRestartGroup, 6);
                str5 = str4;
                i9 = 6;
                TextKt.m3256TextNvy7gAk(str5, null, MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), null, 0L, null, null, null, 0L, null, TextAlign.m8095boximpl(TextAlign.INSTANCE.m8102getCentere0LSkKk()), 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodyMedium(), composerStartRestartGroup, (i8 >> 6) & 14, 0, 130042);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                str5 = str4;
                i9 = 6;
                composerStartRestartGroup.startReplaceGroup(1589156726);
            }
            composerStartRestartGroup.endReplaceGroup();
            function3 = function12;
            if (function3 != null) {
                composerStartRestartGroup.startReplaceGroup(1594165675);
                ComposerKt.sourceInformation(composerStartRestartGroup, "139@5060L30,140@5103L8");
                SpacerKt.Spacer(SizeKt.m960height3ABfNKs(Modifier.INSTANCE, Dp.m8224constructorimpl(20)), composerStartRestartGroup, i9);
                function3.invoke(composerStartRestartGroup, Integer.valueOf((i8 >> 12) & 14));
            } else {
                composerStartRestartGroup.startReplaceGroup(1589156726);
            }
            composerStartRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            composerStartRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str3 = str5;
            modifier3 = modifier12;
        }
        function4 = function3;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.zhawoilah.wgxt.ui.components.CommonKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommonKt.MessageState$lambda$1(icon, title, str3, modifier3, function4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean PressableCard_fWhpE4E$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    private static final float PressableCard_fWhpE4E$lambda$1(State<Float> state) {
        return state.getValue().floatValue();
    }
}
