package com.zhawoilah.wgxt.data;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: GxtModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/zhawoilah/wgxt/data/GxtDocument;", "", "game", "Lcom/zhawoilah/wgxt/data/GxtGame;", "bitsPerChar", "", "tables", "", "Lcom/zhawoilah/wgxt/data/GxtTable;", "<init>", "(Lcom/zhawoilah/wgxt/data/GxtGame;ILjava/util/List;)V", "getGame", "()Lcom/zhawoilah/wgxt/data/GxtGame;", "getBitsPerChar", "()I", "getTables", "()Ljava/util/List;", "totalEntries", "getTotalEntries", "isValid", "", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final /* data */ class GxtDocument {
    public static final int $stable = 8;
    private final int bitsPerChar;
    private final GxtGame game;
    private final List<GxtTable> tables;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GxtDocument copy$default(GxtDocument gxtDocument, GxtGame gxtGame, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gxtGame = gxtDocument.game;
        }
        if ((i2 & 2) != 0) {
            i = gxtDocument.bitsPerChar;
        }
        if ((i2 & 4) != 0) {
            list = gxtDocument.tables;
        }
        return gxtDocument.copy(gxtGame, i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GxtGame getGame() {
        return this.game;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBitsPerChar() {
        return this.bitsPerChar;
    }

    public final List<GxtTable> component3() {
        return this.tables;
    }

    public final GxtDocument copy(GxtGame game, int bitsPerChar, List<GxtTable> tables) {
        Intrinsics.checkNotNullParameter(game, "game");
        Intrinsics.checkNotNullParameter(tables, "tables");
        return new GxtDocument(game, bitsPerChar, tables);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GxtDocument)) {
            return false;
        }
        GxtDocument gxtDocument = (GxtDocument) other;
        return this.game == gxtDocument.game && this.bitsPerChar == gxtDocument.bitsPerChar && Intrinsics.areEqual(this.tables, gxtDocument.tables);
    }

    public int hashCode() {
        return (((this.game.hashCode() * 31) + Integer.hashCode(this.bitsPerChar)) * 31) + this.tables.hashCode();
    }

    public String toString() {
        return "GxtDocument(game=" + this.game + ", bitsPerChar=" + this.bitsPerChar + ", tables=" + this.tables + ")";
    }

    public GxtDocument(GxtGame game, int i, List<GxtTable> tables) {
        Intrinsics.checkNotNullParameter(game, "game");
        Intrinsics.checkNotNullParameter(tables, "tables");
        this.game = game;
        this.bitsPerChar = i;
        this.tables = tables;
    }

    public final GxtGame getGame() {
        return this.game;
    }

    public final int getBitsPerChar() {
        return this.bitsPerChar;
    }

    public final List<GxtTable> getTables() {
        return this.tables;
    }

    public final int getTotalEntries() {
        Iterator<T> it = this.tables.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((GxtTable) it.next()).getEntries().size();
        }
        return size;
    }

    public final boolean isValid() {
        return (this.game == GxtGame.UNKNOWN || this.tables.isEmpty()) ? false : true;
    }
}
