package com.zhawoilah.wgxt.data;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GxtModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/zhawoilah/wgxt/data/GxtEntry;", "", "keyName", "", "hash", "", "isHashOnly", "", "original", "<init>", "(Ljava/lang/String;JZLjava/lang/String;)V", "getKeyName", "()Ljava/lang/String;", "getHash", "()J", "()Z", "getOriginal", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class GxtEntry {
    public static final int $stable = 0;
    private final long hash;
    private final boolean isHashOnly;
    private final String keyName;
    private final String original;

    public static /* synthetic */ GxtEntry copy$default(GxtEntry gxtEntry, String str, long j, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gxtEntry.keyName;
        }
        if ((i & 2) != 0) {
            j = gxtEntry.hash;
        }
        if ((i & 4) != 0) {
            z = gxtEntry.isHashOnly;
        }
        if ((i & 8) != 0) {
            str2 = gxtEntry.original;
        }
        return gxtEntry.copy(str, j, z, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKeyName() {
        return this.keyName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getHash() {
        return this.hash;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsHashOnly() {
        return this.isHashOnly;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOriginal() {
        return this.original;
    }

    public final GxtEntry copy(String keyName, long hash, boolean isHashOnly, String original) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(original, "original");
        return new GxtEntry(keyName, hash, isHashOnly, original);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GxtEntry)) {
            return false;
        }
        GxtEntry gxtEntry = (GxtEntry) other;
        return Intrinsics.areEqual(this.keyName, gxtEntry.keyName) && this.hash == gxtEntry.hash && this.isHashOnly == gxtEntry.isHashOnly && Intrinsics.areEqual(this.original, gxtEntry.original);
    }

    public int hashCode() {
        return (((((this.keyName.hashCode() * 31) + Long.hashCode(this.hash)) * 31) + Boolean.hashCode(this.isHashOnly)) * 31) + this.original.hashCode();
    }

    public String toString() {
        return "GxtEntry(keyName=" + this.keyName + ", hash=" + this.hash + ", isHashOnly=" + this.isHashOnly + ", original=" + this.original + ")";
    }

    public GxtEntry(String keyName, long j, boolean z, String original) {
        Intrinsics.checkNotNullParameter(keyName, "keyName");
        Intrinsics.checkNotNullParameter(original, "original");
        this.keyName = keyName;
        this.hash = j;
        this.isHashOnly = z;
        this.original = original;
    }

    public final String getKeyName() {
        return this.keyName;
    }

    public final long getHash() {
        return this.hash;
    }

    public final boolean isHashOnly() {
        return this.isHashOnly;
    }

    public final String getOriginal() {
        return this.original;
    }
}
