package com.zhawoilah.wgxt.data;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: SampleGxt.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/zhawoilah/wgxt/data/SampleGxt;", "", "<init>", "()V", "entry", "Lcom/zhawoilah/wgxt/data/GxtEntry;", "key", "", "text", "build", "Lcom/zhawoilah/wgxt/data/GxtDocument;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class SampleGxt {
    public static final int $stable = 0;
    public static final SampleGxt INSTANCE = new SampleGxt();

    private SampleGxt() {
    }

    private final GxtEntry entry(String key, String text) {
        return new GxtEntry(key, CrcJam.INSTANCE.hashUpper(key), false, text);
    }

    public final GxtDocument build() {
        return new GxtDocument(GxtGame.SA, 8, CollectionsKt.listOf((Object[]) new GxtTable[]{new GxtTable("MAIN", CollectionsKt.listOf((Object[]) new GxtEntry[]{entry("CJ_NAME", "Carl Johnson"), entry("GROVE", "~g~Grove Street"), entry("WELCOME", "Welcome back to San Andreas, ~y~CJ~w~."), entry("SPRAY", "~b~Pay 'n' Spray~w~ - respray your ride here."), entry("AMMU", "Ammu-Nation"), entry("WASTED", "~r~WASTED"), entry("BUSTED", "~r~BUSTED"), entry("MISSED", "Mission failed!~n~Try again."), new GxtEntry(GxtParser.INSTANCE.hashHex(439041101L), 439041101L, true, "This key isn't in the name list, so it shows its hash instead.")})), new GxtTable("HUD", CollectionsKt.listOf((Object[]) new GxtEntry[]{entry("MONEY", "$"), entry("HEALTH", "Health"), entry("ARMOUR", "Armour"), entry("WANTED", "Wanted Level"), entry("RESPECT", "Respect")}))}));
    }
}
