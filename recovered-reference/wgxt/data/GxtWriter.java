package com.zhawoilah.wgxt.data;

import androidx.autofill.HintConstants;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.exifinterface.media.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GxtWriter.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ*\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002J:\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002JN\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¨\u0006\u0018"}, d2 = {"Lcom/zhawoilah/wgxt/data/GxtWriter;", "", "<init>", "()V", "write", "", "doc", "Lcom/zhawoilah/wgxt/data/GxtDocument;", "textOf", "Lkotlin/Function2;", "", "", "writeIII", "writeTabl", "entrySize", "header", "", "buildTable", "Lkotlin/Pair;", "table", "Lcom/zhawoilah/wgxt/data/GxtTable;", "tableOriginalIndex", "bits", ExifInterface.LONGITUDE_WEST, "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GxtWriter {
    public static final int $stable = 0;
    public static final GxtWriter INSTANCE = new GxtWriter();

    /* JADX INFO: compiled from: GxtWriter.kt */
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
                iArr[GxtGame.SA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private GxtWriter() {
    }

    public final byte[] write(GxtDocument doc, Function2<? super Integer, ? super Integer, String> textOf) {
        Intrinsics.checkNotNullParameter(doc, "doc");
        Intrinsics.checkNotNullParameter(textOf, "textOf");
        int i = WhenMappings.$EnumSwitchMapping$0[doc.getGame().ordinal()];
        if (i == 1) {
            return writeIII(doc, textOf);
        }
        if (i == 2) {
            return writeTabl(doc, 8, true, textOf);
        }
        return writeTabl(doc, 12, false, textOf);
    }

    private final byte[] writeIII(GxtDocument doc, Function2<? super Integer, ? super Integer, String> textOf) {
        Pair<byte[], byte[]> pairBuildTable = buildTable(doc.getTables().get(0), 0, 12, doc.getBitsPerChar(), textOf);
        byte[] bArrComponent1 = pairBuildTable.component1();
        byte[] bArrComponent2 = pairBuildTable.component2();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArrComponent1);
        byteArrayOutputStream.write(bArrComponent2);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    private final byte[] writeTabl(GxtDocument doc, int entrySize, boolean header, Function2<? super Integer, ? super Integer, String> textOf) {
        int i;
        int bitsPerChar = doc.getBitsPerChar();
        List listSortedWith = CollectionsKt.sortedWith(CollectionsKt.withIndex(doc.getTables()), new Comparator() { // from class: com.zhawoilah.wgxt.data.GxtWriter$writeTabl$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Boolean.valueOf(Intrinsics.areEqual(((GxtTable) ((IndexedValue) t2).getValue()).getName(), "MAIN")), Boolean.valueOf(Intrinsics.areEqual(((GxtTable) ((IndexedValue) t).getValue()).getName(), "MAIN")));
            }
        });
        int size = listSortedWith.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        Iterator it = listSortedWith.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) it.next();
            int index = indexedValue.getIndex();
            GxtTable gxtTable = (GxtTable) indexedValue.component2();
            int i2 = entrySize;
            Function2<? super Integer, ? super Integer, String> function2 = textOf;
            Pair<byte[], byte[]> pairBuildTable = buildTable(gxtTable, index, i2, bitsPerChar, function2);
            byte[] bArrComponent1 = pairBuildTable.component1();
            byte[] bArrComponent2 = pairBuildTable.component2();
            arrayList.add(Intrinsics.areEqual(gxtTable.getName(), "MAIN") ? new byte[0] : GxtBinaryKt.name8Bytes(gxtTable.getName()));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(bArrComponent1);
            byteArrayOutputStream.write(bArrComponent2);
            arrayList2.add(byteArrayOutputStream.toByteArray());
            entrySize = i2;
            textOf = function2;
        }
        int i3 = size * 12;
        int length = (header ? 4 : 0) + 8 + i3;
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = length;
            length += ((byte[]) arrayList.get(i4)).length + ((byte[]) arrayList2.get(i4)).length;
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        if (header) {
            GxtBinaryKt.writeLE16(byteArrayOutputStream2, 4);
            GxtBinaryKt.writeLE16(byteArrayOutputStream2, bitsPerChar);
        }
        GxtBinaryKt.writeTag(byteArrayOutputStream2, "TABL");
        GxtBinaryKt.writeLE32(byteArrayOutputStream2, i3);
        for (int i5 = 0; i5 < size; i5++) {
            byteArrayOutputStream2.write(GxtBinaryKt.name8Bytes(((GxtTable) ((IndexedValue) listSortedWith.get(i5)).getValue()).getName()));
            GxtBinaryKt.writeLE32(byteArrayOutputStream2, iArr[i5]);
        }
        for (i = 0; i < size; i++) {
            byteArrayOutputStream2.write((byte[]) arrayList.get(i));
            byteArrayOutputStream2.write((byte[]) arrayList2.get(i));
        }
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: GxtWriter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/zhawoilah/wgxt/data/GxtWriter$W;", "", "hash", "", HintConstants.AUTOFILL_HINT_NAME, "", "text", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "getHash", "()J", "getName", "()Ljava/lang/String;", "getText", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    static final class W {
        private final long hash;
        private final String name;
        private final String text;

        public W(long j, String name, String text) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(text, "text");
            this.hash = j;
            this.name = name;
            this.text = text;
        }

        public final long getHash() {
            return this.hash;
        }

        public final String getName() {
            return this.name;
        }

        public final String getText() {
            return this.text;
        }
    }

    private final Pair<byte[], byte[]> buildTable(GxtTable table, int tableOriginalIndex, int entrySize, int bits, Function2<? super Integer, ? super Integer, String> textOf) {
        List<GxtEntry> entries = table.getEntries();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
        int i = 0;
        for (Object obj : entries) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            GxtEntry gxtEntry = (GxtEntry) obj;
            arrayList.add(new W(gxtEntry.getHash(), gxtEntry.getKeyName(), textOf.invoke(Integer.valueOf(tableOriginalIndex), Integer.valueOf(i))));
            i = i2;
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList, entrySize == 8 ? new Comparator() { // from class: com.zhawoilah.wgxt.data.GxtWriter$buildTable$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((GxtWriter.W) t).getHash()), Long.valueOf(((GxtWriter.W) t2).getHash()));
            }
        } : new Comparator() { // from class: com.zhawoilah.wgxt.data.GxtWriter$buildTable$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(((GxtWriter.W) t).getName(), ((GxtWriter.W) t2).getName());
            }
        });
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int[] iArr = new int[listSortedWith.size()];
        List list = listSortedWith;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = byteArrayOutputStream.size();
            byteArrayOutputStream.write(GxtBinaryKt.encodeText(((W) listSortedWith.get(i3)).getText(), bits));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        GxtBinaryKt.writeTag(byteArrayOutputStream2, "TKEY");
        GxtBinaryKt.writeLE32(byteArrayOutputStream2, listSortedWith.size() * entrySize);
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            GxtBinaryKt.writeLE32(byteArrayOutputStream2, iArr[i4]);
            if (entrySize == 8) {
                GxtBinaryKt.writeLE32(byteArrayOutputStream2, (int) (((W) listSortedWith.get(i4)).getHash() & 4294967295L));
            } else {
                byteArrayOutputStream2.write(GxtBinaryKt.name8Bytes(((W) listSortedWith.get(i4)).getName()));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
        GxtBinaryKt.writeTag(byteArrayOutputStream3, "TDAT");
        GxtBinaryKt.writeLE32(byteArrayOutputStream3, byteArray.length);
        byteArrayOutputStream3.write(byteArray);
        return TuplesKt.to(byteArrayOutputStream2.toByteArray(), byteArrayOutputStream3.toByteArray());
    }
}
