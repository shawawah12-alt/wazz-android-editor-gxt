package com.zhawoilah.wgxt.data;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CrcJam.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/zhawoilah/wgxt/data/CrcJam;", "", "<init>", "()V", "table", "", "hash", "", "input", "", "hashUpper", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class CrcJam {
    public static final int $stable;
    public static final CrcJam INSTANCE = new CrcJam();
    private static final int[] table;

    private CrcJam() {
    }

    static {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i2 & 1;
                i2 >>>= 1;
                if (i4 != 0) {
                    i2 ^= -306674912;
                }
            }
            iArr[i] = i2;
        }
        table = iArr;
        $stable = 8;
    }

    public final long hash(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        int length = input.length();
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i >>> 8;
            i = table[(i ^ input.charAt(i2)) & 255] ^ i3;
        }
        return ((long) i) & 4294967295L;
    }

    public final long hashUpper(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String upperCase = input.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return hash(upperCase);
    }
}
