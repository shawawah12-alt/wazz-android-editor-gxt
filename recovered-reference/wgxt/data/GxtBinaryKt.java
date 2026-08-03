package com.zhawoilah.wgxt.data;

import androidx.autofill.HintConstants;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: compiled from: GxtBinary.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0000\u001a\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000bH\u0000\u001a\u0014\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0000\u001a\u0014\u0010\u0013\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u0015\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0005H\u0000\u001a \u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u001c"}, d2 = {"CP1252", "Ljava/nio/charset/Charset;", "getCP1252", "()Ljava/nio/charset/Charset;", "le16", "", "b", "", "o", "le32", "tagAt", "", "name8", "name8Bytes", HintConstants.AUTOFILL_HINT_NAME, "writeTag", "", "Ljava/io/ByteArrayOutputStream;", "tag", "writeLE16", "v", "writeLE32", "encodeText", "text", "bits", "readText", "data", "start", "app_release"}, k = 2, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GxtBinaryKt {
    private static final Charset CP1252;

    static {
        Object objM8923constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM8923constructorimpl = Result.m8923constructorimpl(Charset.forName("windows-1252"));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8923constructorimpl = Result.m8923constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8926exceptionOrNullimpl(objM8923constructorimpl) != null) {
            objM8923constructorimpl = Charsets.ISO_8859_1;
        }
        CP1252 = (Charset) objM8923constructorimpl;
    }

    public static final Charset getCP1252() {
        return CP1252;
    }

    public static final int le16(byte[] b, int i) {
        Intrinsics.checkNotNullParameter(b, "b");
        int i2 = i + 1;
        if (i2 >= b.length) {
            return 0;
        }
        return ((b[i2] & UByte.MAX_VALUE) << 8) | (b[i] & UByte.MAX_VALUE);
    }

    public static final int le32(byte[] b, int i) {
        Intrinsics.checkNotNullParameter(b, "b");
        int i2 = i + 3;
        if (i2 >= b.length) {
            return 0;
        }
        return ((b[i2] & UByte.MAX_VALUE) << 24) | ((b[i + 2] & UByte.MAX_VALUE) << 16) | (b[i] & UByte.MAX_VALUE) | ((b[i + 1] & UByte.MAX_VALUE) << 8);
    }

    public static final String tagAt(byte[] b, int i) {
        Intrinsics.checkNotNullParameter(b, "b");
        return i + 4 > b.length ? "" : new String(b, i, 4, Charsets.US_ASCII);
    }

    public static final String name8(byte[] b, int i) {
        Intrinsics.checkNotNullParameter(b, "b");
        StringBuilder sb = new StringBuilder(8);
        int iMin = Math.min(i + 8, b.length);
        while (i < iMin) {
            int i2 = b[i] & UByte.MAX_VALUE;
            if (i2 == 0) {
                break;
            }
            sb.append((char) i2);
            i++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final byte[] name8Bytes(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        byte[] bArr = new byte[8];
        byte[] bytes = name.getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        System.arraycopy(bytes, 0, bArr, 0, Math.min(8, bytes.length));
        return bArr;
    }

    public static final void writeTag(ByteArrayOutputStream byteArrayOutputStream, String tag) {
        Intrinsics.checkNotNullParameter(byteArrayOutputStream, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        byte[] bytes = tag.getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byteArrayOutputStream.write(bytes);
    }

    public static final void writeLE16(ByteArrayOutputStream byteArrayOutputStream, int i) {
        Intrinsics.checkNotNullParameter(byteArrayOutputStream, "<this>");
        byteArrayOutputStream.write(i & 255);
        byteArrayOutputStream.write((i >>> 8) & 255);
    }

    public static final void writeLE32(ByteArrayOutputStream byteArrayOutputStream, int i) {
        Intrinsics.checkNotNullParameter(byteArrayOutputStream, "<this>");
        byteArrayOutputStream.write(i & 255);
        byteArrayOutputStream.write((i >>> 8) & 255);
        byteArrayOutputStream.write((i >>> 16) & 255);
        byteArrayOutputStream.write((i >>> 24) & 255);
    }

    public static final byte[] encodeText(String text, int i) {
        Intrinsics.checkNotNullParameter(text, "text");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i == 16) {
            int length = text.length();
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = text.charAt(i2);
                byteArrayOutputStream.write(cCharAt & 255);
                byteArrayOutputStream.write((cCharAt >>> '\b') & 255);
            }
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(0);
        } else {
            byte[] bytes = text.getBytes(CP1252);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            byteArrayOutputStream.write(bytes);
            byteArrayOutputStream.write(0);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final String readText(byte[] data, int i, int i2) {
        int i3;
        int iLe16;
        Intrinsics.checkNotNullParameter(data, "data");
        if (i < 0 || i >= data.length) {
            return "";
        }
        if (i2 == 16) {
            StringBuilder sb = new StringBuilder();
            while (i + 1 < data.length && (iLe16 = le16(data, i)) != 0) {
                sb.append((char) iLe16);
                i += 2;
            }
            String string = sb.toString();
            Intrinsics.checkNotNull(string);
            return string;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i < data.length && (i3 = data[i] & UByte.MAX_VALUE) != 0) {
            byteArrayOutputStream.write(i3);
            i++;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
        return new String(byteArray, CP1252);
    }
}
