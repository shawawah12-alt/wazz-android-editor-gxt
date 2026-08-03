package com.zhawoilah.wgxt.ui.theme;

import androidx.compose.material3.Typography;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: Type.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"WazzTypography", "Landroidx/compose/material3/Typography;", "getWazzTypography", "()Landroidx/compose/material3/Typography;", "app_release"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class TypeKt {
    private static final Typography WazzTypography;

    static {
        GenericFontFamily sansSerif = FontFamily.INSTANCE.getSansSerif();
        FontWeight black = FontWeight.INSTANCE.getBlack();
        GenericFontFamily genericFontFamily = sansSerif;
        TextStyle textStyle = new TextStyle(0L, TextUnitKt.getSp(52), black, (FontStyle) null, (FontSynthesis) null, genericFontFamily, (String) null, TextUnitKt.getSp(-0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(56), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        GenericFontFamily sansSerif2 = FontFamily.INSTANCE.getSansSerif();
        FontWeight extraBold = FontWeight.INSTANCE.getExtraBold();
        GenericFontFamily genericFontFamily2 = sansSerif2;
        TextStyle textStyle2 = new TextStyle(0L, TextUnitKt.getSp(40), extraBold, (FontStyle) null, (FontSynthesis) null, genericFontFamily2, (String) null, TextUnitKt.getSp(-0.25d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(46), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        GenericFontFamily sansSerif3 = FontFamily.INSTANCE.getSansSerif();
        TextStyle textStyle3 = new TextStyle(0L, TextUnitKt.getSp(32), FontWeight.INSTANCE.getExtraBold(), (FontStyle) null, (FontSynthesis) null, sansSerif3, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(40), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        GenericFontFamily sansSerif4 = FontFamily.INSTANCE.getSansSerif();
        TextStyle textStyle4 = new TextStyle(0L, TextUnitKt.getSp(28), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, sansSerif4, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(34), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        GenericFontFamily sansSerif5 = FontFamily.INSTANCE.getSansSerif();
        TextStyle textStyle5 = new TextStyle(0L, TextUnitKt.getSp(23), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, sansSerif5, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(30), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        GenericFontFamily sansSerif6 = FontFamily.INSTANCE.getSansSerif();
        TextStyle textStyle6 = new TextStyle(0L, TextUnitKt.getSp(20), FontWeight.INSTANCE.getSemiBold(), (FontStyle) null, (FontSynthesis) null, sansSerif6, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(26), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        GenericFontFamily sansSerif7 = FontFamily.INSTANCE.getSansSerif();
        TextStyle textStyle7 = new TextStyle(0L, TextUnitKt.getSp(19), FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, sansSerif7, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        GenericFontFamily sansSerif8 = FontFamily.INSTANCE.getSansSerif();
        FontWeight semiBold = FontWeight.INSTANCE.getSemiBold();
        GenericFontFamily genericFontFamily3 = sansSerif8;
        TextStyle textStyle8 = new TextStyle(0L, TextUnitKt.getSp(16), semiBold, (FontStyle) null, (FontSynthesis) null, genericFontFamily3, (String) null, TextUnitKt.getSp(0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(22), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        GenericFontFamily sansSerif9 = FontFamily.INSTANCE.getSansSerif();
        FontWeight semiBold2 = FontWeight.INSTANCE.getSemiBold();
        GenericFontFamily genericFontFamily4 = sansSerif9;
        TextStyle textStyle9 = new TextStyle(0L, TextUnitKt.getSp(14), semiBold2, (FontStyle) null, (FontSynthesis) null, genericFontFamily4, (String) null, TextUnitKt.getSp(0.1d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        GenericFontFamily sansSerif10 = FontFamily.INSTANCE.getSansSerif();
        FontWeight normal = FontWeight.INSTANCE.getNormal();
        GenericFontFamily genericFontFamily5 = sansSerif10;
        TextStyle textStyle10 = new TextStyle(0L, TextUnitKt.getSp(16), normal, (FontStyle) null, (FontSynthesis) null, genericFontFamily5, (String) null, TextUnitKt.getSp(0.15d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(24), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        GenericFontFamily sansSerif11 = FontFamily.INSTANCE.getSansSerif();
        FontWeight normal2 = FontWeight.INSTANCE.getNormal();
        GenericFontFamily genericFontFamily6 = sansSerif11;
        TextStyle textStyle11 = new TextStyle(0L, TextUnitKt.getSp(14), normal2, (FontStyle) null, (FontSynthesis) null, genericFontFamily6, (String) null, TextUnitKt.getSp(0.2d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        GenericFontFamily sansSerif12 = FontFamily.INSTANCE.getSansSerif();
        FontWeight normal3 = FontWeight.INSTANCE.getNormal();
        GenericFontFamily genericFontFamily7 = sansSerif12;
        TextStyle textStyle12 = new TextStyle(0L, TextUnitKt.getSp(12), normal3, (FontStyle) null, (FontSynthesis) null, genericFontFamily7, (String) null, TextUnitKt.getSp(0.3d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        GenericFontFamily sansSerif13 = FontFamily.INSTANCE.getSansSerif();
        FontWeight semiBold3 = FontWeight.INSTANCE.getSemiBold();
        GenericFontFamily genericFontFamily8 = sansSerif13;
        TextStyle textStyle13 = new TextStyle(0L, TextUnitKt.getSp(14), semiBold3, (FontStyle) null, (FontSynthesis) null, genericFontFamily8, (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(20), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        GenericFontFamily sansSerif14 = FontFamily.INSTANCE.getSansSerif();
        FontWeight semiBold4 = FontWeight.INSTANCE.getSemiBold();
        GenericFontFamily genericFontFamily9 = sansSerif14;
        TextStyle textStyle14 = new TextStyle(0L, TextUnitKt.getSp(12), semiBold4, (FontStyle) null, (FontSynthesis) null, genericFontFamily9, (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
        GenericFontFamily sansSerif15 = FontFamily.INSTANCE.getSansSerif();
        FontWeight medium = FontWeight.INSTANCE.getMedium();
        GenericFontFamily genericFontFamily10 = sansSerif15;
        WazzTypography = new Typography(textStyle, textStyle2, textStyle3, textStyle4, textStyle5, textStyle6, textStyle7, textStyle8, textStyle9, textStyle10, textStyle11, textStyle12, textStyle13, textStyle14, new TextStyle(0L, TextUnitKt.getSp(11), medium, (FontStyle) null, (FontSynthesis) null, genericFontFamily10, (String) null, TextUnitKt.getSp(0.5d), (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, TextAlign.INSTANCE.m8107getStarte0LSkKk(), 0, TextUnitKt.getSp(15), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16613209, (DefaultConstructorMarker) null));
    }

    public static final Typography getWazzTypography() {
        return WazzTypography;
    }
}
