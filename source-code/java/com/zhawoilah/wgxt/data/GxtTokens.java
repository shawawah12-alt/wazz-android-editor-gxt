package com.zhawoilah.wgxt.data;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: GxtTokens.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/zhawoilah/wgxt/data/GxtTokens;", "", "<init>", "()V", "common", "", "Lcom/zhawoilah/wgxt/data/GxtToken;", "getCommon", "()Ljava/util/List;", "colors", "getColors", "formatting", "getFormatting", "placeholders", "getPlaceholders", "buttons", "getButtons", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GxtTokens {
    public static final GxtTokens INSTANCE = new GxtTokens();
    private static final List<GxtToken> common = CollectionsKt.listOf((Object[]) new GxtToken[]{new GxtToken("~n~", "New line"), new GxtToken("~w~", "White"), new GxtToken("~r~", "Red"), new GxtToken("~g~", "Green"), new GxtToken("~b~", "Blue"), new GxtToken("~y~", "Yellow"), new GxtToken("~p~", "Purple"), new GxtToken("~l~", "Black"), new GxtToken("~h~", "Highlight"), new GxtToken("~1~", "Number"), new GxtToken("~a~", "String"), new GxtToken("~k~", "Key")});
    private static final List<GxtToken> colors = CollectionsKt.listOf((Object[]) new GxtToken[]{new GxtToken("~w~", "White (default text)"), new GxtToken("~r~", "Red"), new GxtToken("~g~", "Green"), new GxtToken("~b~", "Blue"), new GxtToken("~y~", "Yellow"), new GxtToken("~p~", "Purple / pink"), new GxtToken("~o~", "Orange"), new GxtToken("~q~", "Light pink"), new GxtToken("~l~", "Black"), new GxtToken("~z~", "Grey / soft white")});
    private static final List<GxtToken> formatting = CollectionsKt.listOf((Object[]) new GxtToken[]{new GxtToken("~n~", "New line (line break)"), new GxtToken("~h~", "Highlight / bright white"), new GxtToken("~s~", "Reset to standard style")});
    private static final List<GxtToken> placeholders = CollectionsKt.listOf((Object[]) new GxtToken[]{new GxtToken("~a~", "Insert a string value"), new GxtToken("~1~", "Insert a number value")});
    private static final List<GxtToken> buttons = CollectionsKt.listOf((Object[]) new GxtToken[]{new GxtToken("~k~", "Shows a control / key binding"), new GxtToken("~<~", "Left"), new GxtToken("~>~", "Right"), new GxtToken("~up~", "Up"), new GxtToken("~down~", "Down")});
    public static final int $stable = 8;

    private GxtTokens() {
    }

    public final List<GxtToken> getCommon() {
        return common;
    }

    public final List<GxtToken> getColors() {
        return colors;
    }

    public final List<GxtToken> getFormatting() {
        return formatting;
    }

    public final List<GxtToken> getPlaceholders() {
        return placeholders;
    }

    public final List<GxtToken> getButtons() {
        return buttons;
    }
}
