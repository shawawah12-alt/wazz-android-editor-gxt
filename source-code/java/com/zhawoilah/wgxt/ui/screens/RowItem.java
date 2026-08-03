package com.zhawoilah.wgxt.ui.screens;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import com.zhawoilah.wgxt.data.GxtEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EntriesScreen.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/zhawoilah/wgxt/ui/screens/RowItem;", "", "entryIndex", "", "entry", "Lcom/zhawoilah/wgxt/data/GxtEntry;", "<init>", "(ILcom/zhawoilah/wgxt/data/GxtEntry;)V", "getEntryIndex", "()I", "getEntry", "()Lcom/zhawoilah/wgxt/data/GxtEntry;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
final /* data */ class RowItem {
    private final GxtEntry entry;
    private final int entryIndex;

    public static /* synthetic */ RowItem copy$default(RowItem rowItem, int i, GxtEntry gxtEntry, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = rowItem.entryIndex;
        }
        if ((i2 & 2) != 0) {
            gxtEntry = rowItem.entry;
        }
        return rowItem.copy(i, gxtEntry);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getEntryIndex() {
        return this.entryIndex;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GxtEntry getEntry() {
        return this.entry;
    }

    public final RowItem copy(int entryIndex, GxtEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        return new RowItem(entryIndex, entry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowItem)) {
            return false;
        }
        RowItem rowItem = (RowItem) other;
        return this.entryIndex == rowItem.entryIndex && Intrinsics.areEqual(this.entry, rowItem.entry);
    }

    public int hashCode() {
        return (Integer.hashCode(this.entryIndex) * 31) + this.entry.hashCode();
    }

    public String toString() {
        return "RowItem(entryIndex=" + this.entryIndex + ", entry=" + this.entry + ")";
    }

    public RowItem(int i, GxtEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.entryIndex = i;
        this.entry = entry;
    }

    public final GxtEntry getEntry() {
        return this.entry;
    }

    public final int getEntryIndex() {
        return this.entryIndex;
    }
}
