package com.zhawoilah.wgxt.data;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: GxtParser.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J.\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002JD\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0002J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\r¨\u0006\u0019"}, d2 = {"Lcom/zhawoilah/wgxt/data/GxtParser;", "", "<init>", "()V", "detect", "Lcom/zhawoilah/wgxt/data/GxtGame;", "data", "", "parse", "Lcom/zhawoilah/wgxt/data/GxtDocument;", "resolver", "Lkotlin/Function1;", "", "", "", "parseIII", "parseTabl", "tablStart", "", "entrySize", "bits", "game", "map", "hashHex", "h", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GxtParser {
    public static final int $stable = 0;
    public static final GxtParser INSTANCE = new GxtParser();

    /* JADX INFO: compiled from: GxtParser.kt */
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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private GxtParser() {
    }

    public final GxtGame detect(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length < 8) {
            return GxtGame.UNKNOWN;
        }
        String strTagAt = GxtBinaryKt.tagAt(data, 0);
        if (Intrinsics.areEqual(strTagAt, "TKEY")) {
            return GxtGame.III;
        }
        if (Intrinsics.areEqual(strTagAt, "TABL")) {
            return GxtGame.VC;
        }
        return Intrinsics.areEqual(GxtBinaryKt.tagAt(data, 4), "TABL") ? GxtGame.SA : GxtGame.UNKNOWN;
    }

    public final GxtDocument parse(byte[] data, Function1<? super GxtGame, ? extends Map<Long, String>> resolver) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(resolver, "resolver");
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[detect(data).ordinal()];
            if (i == 1) {
                return parseIII(data);
            }
            if (i == 2) {
                return parseTabl(data, 0, 12, 16, GxtGame.VC, MapsKt.emptyMap());
            }
            if (i == 3) {
                return parseTabl(data, 4, 8, GxtBinaryKt.le16(data, 2) == 16 ? 16 : 8, GxtGame.SA, resolver.invoke(GxtGame.SA));
            }
            return new GxtDocument(GxtGame.UNKNOWN, 8, CollectionsKt.emptyList());
        } catch (Exception unused) {
            return new GxtDocument(GxtGame.UNKNOWN, 8, CollectionsKt.emptyList());
        }
    }

    private final GxtDocument parseIII(byte[] data) {
        int iLe32 = GxtBinaryKt.le32(data, 4);
        int i = iLe32 / 12;
        ArrayList arrayList = new ArrayList(i);
        int i2 = 8;
        for (int i3 = 0; i3 < i; i3++) {
            arrayList.add(TuplesKt.to(Integer.valueOf(GxtBinaryKt.le32(data, i2)), GxtBinaryKt.name8(data, i2 + 4)));
            i2 += 12;
        }
        int i4 = iLe32 + 16;
        ArrayList<Pair> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (Pair pair : arrayList2) {
            arrayList3.add(new GxtEntry((String) pair.component2(), 0L, false, GxtBinaryKt.readText(data, ((Number) pair.component1()).intValue() + i4, 16)));
        }
        return new GxtDocument(GxtGame.III, 16, CollectionsKt.listOf(new GxtTable("MAIN", arrayList3)));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007c  */
    private final GxtDocument parseTabl(byte[] data, int tablStart, int entrySize, int bits, GxtGame game, Map<Long, String> map) {
        int i;
        GxtEntry gxtEntry;
        GxtEntry gxtEntry2;
        int iLe32 = GxtBinaryKt.le32(data, tablStart + 4) / 12;
        int i2 = 8;
        int i3 = tablStart + 8;
        ArrayList<Pair> arrayList = new ArrayList(iLe32);
        for (int i4 = 0; i4 < iLe32; i4++) {
            arrayList.add(TuplesKt.to(GxtBinaryKt.name8(data, i3), Integer.valueOf(GxtBinaryKt.le32(data, i3 + 8))));
            i3 += 12;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) pair.component1();
            int iIntValue = ((Number) pair.component2()).intValue();
            GxtTable gxtTable = null;
            if (iIntValue <= 0 || iIntValue >= data.length) {
                i = i2;
            } else {
                if (!Intrinsics.areEqual(GxtBinaryKt.tagAt(data, iIntValue), "TKEY")) {
                    iIntValue += 8;
                }
                if (Intrinsics.areEqual(GxtBinaryKt.tagAt(data, iIntValue), "TKEY")) {
                    int iLe33 = GxtBinaryKt.le32(data, iIntValue + 4);
                    int i5 = iLe33 / entrySize;
                    int i6 = iIntValue + 8;
                    ArrayList arrayList3 = new ArrayList(i5);
                    int i7 = i6;
                    int i8 = 0;
                    while (i8 < i5) {
                        int iLe34 = GxtBinaryKt.le32(data, i7);
                        if (entrySize == i2) {
                            arrayList3.add(new Triple(Integer.valueOf(iLe34), Long.valueOf(((long) GxtBinaryKt.le32(data, i7 + 4)) & 4294967295L), null));
                        } else {
                            arrayList3.add(new Triple(Integer.valueOf(iLe34), 0L, GxtBinaryKt.name8(data, i7 + 4)));
                        }
                        i7 += entrySize;
                        i8++;
                        i2 = i2;
                        str = str;
                    }
                    i = i2;
                    String str2 = str;
                    int i9 = i6 + iLe33 + 8;
                    ArrayList<Triple> arrayList4 = arrayList3;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                    for (Triple triple : arrayList4) {
                        int iIntValue2 = ((Number) triple.component1()).intValue();
                        long jLongValue = ((Number) triple.component2()).longValue();
                        String str3 = (String) triple.component3();
                        String text = GxtBinaryKt.readText(data, iIntValue2 + i9, bits);
                        if (str3 != null) {
                            gxtEntry2 = new GxtEntry(str3, 0L, false, text);
                        } else {
                            String str4 = map.get(Long.valueOf(jLongValue));
                            if (str4 != null) {
                                gxtEntry = new GxtEntry(str4, jLongValue, false, text);
                            } else {
                                gxtEntry = new GxtEntry(INSTANCE.hashHex(jLongValue), jLongValue, true, text);
                            }
                            gxtEntry2 = gxtEntry;
                        }
                        arrayList5.add(gxtEntry2);
                    }
                    ArrayList arrayList6 = arrayList5;
                    String str5 = str2;
                    if (str5.length() == 0) {
                        str5 = "MAIN";
                    }
                    gxtTable = new GxtTable(str5, arrayList6);
                } else {
                    i = i2;
                }
            }
            if (gxtTable != null) {
                arrayList2.add(gxtTable);
            }
            i2 = i;
        }
        return new GxtDocument(game, bits, arrayList2);
    }

    public final String hashHex(long h) {
        String string = Long.toString(h, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String upperCase = string.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return "0x" + StringsKt.padStart(upperCase, 8, '0');
    }
}
