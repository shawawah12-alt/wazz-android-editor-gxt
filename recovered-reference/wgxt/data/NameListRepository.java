package com.zhawoilah.wgxt.data;

import android.content.Context;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: NameListRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u000e\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000RB\u0010\u0006\u001a6\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0007j\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t`\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/zhawoilah/wgxt/data/NameListRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cache", "Ljava/util/HashMap;", "Lcom/zhawoilah/wgxt/data/GxtGame;", "", "", "", "Lkotlin/collections/HashMap;", "mapFor", "game", "countFor", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class NameListRepository {
    public static final int $stable = 8;
    private final HashMap<GxtGame, Map<Long, String>> cache;
    private final Context context;

    /* JADX INFO: compiled from: NameListRepository.kt */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GxtGame.values().length];
            try {
                iArr[GxtGame.SA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GxtGame.III.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GxtGame.VC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NameListRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.cache = new HashMap<>();
    }

    public final synchronized Map<Long, String> mapFor(GxtGame game) {
        String str;
        Intrinsics.checkNotNullParameter(game, "game");
        Map<Long, String> map = this.cache.get(game);
        if (map != null) {
            return map;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[game.ordinal()];
        if (i == 1) {
            str = "namelists/sa.txt";
        } else if (i == 2) {
            str = "namelists/iii.txt";
        } else if (i == 3) {
            str = "namelists/vc.txt";
        } else {
            return MapsKt.emptyMap();
        }
        HashMap map2 = new HashMap(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
        try {
            Result.Companion companion = Result.INSTANCE;
            NameListRepository nameListRepository = this;
            InputStream inputStreamOpen = this.context.getAssets().open(str);
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            Reader inputStreamReader = new InputStreamReader(inputStreamOpen, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            BufferedReader bufferedReader2 = bufferedReader instanceof BufferedReader ? bufferedReader : new BufferedReader(bufferedReader, 8192);
            try {
                Iterator<String> it = TextStreamsKt.lineSequence(bufferedReader2).iterator();
                while (it.hasNext()) {
                    String string = StringsKt.trim((CharSequence) it.next()).toString();
                    if (string.length() > 0) {
                        map2.put(Long.valueOf(CrcJam.INSTANCE.hashUpper(string)), string);
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(bufferedReader2, null);
                Result.m8923constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(bufferedReader2, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8923constructorimpl(ResultKt.createFailure(th3));
        }
        this.cache.put(game, map2);
        return map2;
    }

    public final int countFor(GxtGame game) {
        Intrinsics.checkNotNullParameter(game, "game");
        return mapFor(game).size();
    }
}
