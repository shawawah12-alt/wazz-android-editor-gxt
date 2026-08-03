package com.zhawoilah.wgxt.viewmodel;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;

/* JADX INFO: compiled from: GxtViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/zhawoilah/wgxt/viewmodel/LoadState;", "", "Idle", "Loading", "Error", "Loaded", "Lcom/zhawoilah/wgxt/viewmodel/LoadState$Error;", "Lcom/zhawoilah/wgxt/viewmodel/LoadState$Idle;", "Lcom/zhawoilah/wgxt/viewmodel/LoadState$Loaded;", "Lcom/zhawoilah/wgxt/viewmodel/LoadState$Loading;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public interface LoadState {

    /* JADX INFO: compiled from: GxtViewModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/zhawoilah/wgxt/viewmodel/LoadState$Idle;", "Lcom/zhawoilah/wgxt/viewmodel/LoadState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* data */ class Idle implements LoadState {
        public static final int $stable = 0;
        public static final Idle INSTANCE = new Idle();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Idle)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -1850058426;
        }

        public String toString() {
            return "Idle";
        }

        private Idle() {
        }
    }

    /* JADX INFO: compiled from: GxtViewModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/zhawoilah/wgxt/viewmodel/LoadState$Loading;", "Lcom/zhawoilah/wgxt/viewmodel/LoadState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* data */ class Loading implements LoadState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 897120906;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* JADX INFO: compiled from: GxtViewModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/zhawoilah/wgxt/viewmodel/LoadState$Error;", "Lcom/zhawoilah/wgxt/viewmodel/LoadState;", "formatIssue", "", "<init>", "(Z)V", "getFormatIssue", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* data */ class Error implements LoadState {
        public static final int $stable = 0;
        private final boolean formatIssue;

        public static /* synthetic */ Error copy$default(Error error, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = error.formatIssue;
            }
            return error.copy(z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getFormatIssue() {
            return this.formatIssue;
        }

        public final Error copy(boolean formatIssue) {
            return new Error(formatIssue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && this.formatIssue == ((Error) other).formatIssue;
        }

        public int hashCode() {
            return Boolean.hashCode(this.formatIssue);
        }

        public String toString() {
            return "Error(formatIssue=" + this.formatIssue + ")";
        }

        public Error(boolean z) {
            this.formatIssue = z;
        }

        public final boolean getFormatIssue() {
            return this.formatIssue;
        }
    }

    /* JADX INFO: compiled from: GxtViewModel.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/zhawoilah/wgxt/viewmodel/LoadState$Loaded;", "Lcom/zhawoilah/wgxt/viewmodel/LoadState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* data */ class Loaded implements LoadState {
        public static final int $stable = 0;
        public static final Loaded INSTANCE = new Loaded();

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 306033911;
        }

        public String toString() {
            return "Loaded";
        }

        private Loaded() {
        }
    }
}
