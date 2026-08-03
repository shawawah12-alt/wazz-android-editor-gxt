package com.zhawoilah.wgxt.viewmodel;

import android.app.Application;
import android.net.Uri;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.zhawoilah.wgxt.data.GxtDocument;
import com.zhawoilah.wgxt.data.GxtEntry;
import com.zhawoilah.wgxt.data.GxtGame;
import com.zhawoilah.wgxt.data.GxtTable;
import com.zhawoilah.wgxt.data.GxtWriter;
import com.zhawoilah.wgxt.data.NameListRepository;
import com.zhawoilah.wgxt.data.RecentStore;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: GxtViewModel.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\"\u001a\u00020#J\u0016\u0010$\u001a\u00020\u00162\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#J\u0016\u0010'\u001a\u00020(2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#J\u001e\u0010)\u001a\u00020*2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010+\u001a\u00020\u0016J\u0016\u0010,\u001a\u00020*2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#J\u0006\u0010-\u001a\u00020#J\u0006\u0010.\u001a\u00020*J\u0016\u0010/\u001a\u00020*2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0016J\b\u00103\u001a\u0004\u0018\u000104J\u0006\u00105\u001a\u00020*R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R \u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u001a0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u001a0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u001f0\u001e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00066"}, d2 = {"Lcom/zhawoilah/wgxt/viewmodel/GxtViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "app", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "nameLists", "Lcom/zhawoilah/wgxt/data/NameListRepository;", "recentStore", "Lcom/zhawoilah/wgxt/data/RecentStore;", "_loadState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/zhawoilah/wgxt/viewmodel/LoadState;", "loadState", "Lkotlinx/coroutines/flow/StateFlow;", "getLoadState", "()Lkotlinx/coroutines/flow/StateFlow;", "_document", "Lcom/zhawoilah/wgxt/data/GxtDocument;", "document", "getDocument", "_fileName", "", "fileName", "getFileName", "_edits", "", "edits", "getEdits", "recent", "Lkotlinx/coroutines/flow/Flow;", "", "getRecent", "()Lkotlinx/coroutines/flow/Flow;", "saNameCount", "", "textOf", "tableIndex", "entryIndex", "isEdited", "", "setEdit", "", "value", "resetEdit", "pendingEditCount", "openSample", "openUri", "uri", "Landroid/net/Uri;", "displayName", "buildExportBytes", "", "closeDocument", "app_release"}, k = 1, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
public final class GxtViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<GxtDocument> _document;
    private final MutableStateFlow<Map<String, String>> _edits;
    private final MutableStateFlow<String> _fileName;
    private final MutableStateFlow<LoadState> _loadState;
    private final StateFlow<GxtDocument> document;
    private final StateFlow<Map<String, String>> edits;
    private final StateFlow<String> fileName;
    private final StateFlow<LoadState> loadState;
    private final NameListRepository nameLists;
    private final Flow<List<String>> recent;
    private final RecentStore recentStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GxtViewModel(Application app) {
        super(app);
        Intrinsics.checkNotNullParameter(app, "app");
        Application application = app;
        this.nameLists = new NameListRepository(application);
        RecentStore recentStore = new RecentStore(application);
        this.recentStore = recentStore;
        MutableStateFlow<LoadState> MutableStateFlow = StateFlowKt.MutableStateFlow(LoadState.Idle.INSTANCE);
        this._loadState = MutableStateFlow;
        this.loadState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<GxtDocument> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this._document = MutableStateFlow2;
        this.document = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<String> MutableStateFlow3 = StateFlowKt.MutableStateFlow("");
        this._fileName = MutableStateFlow3;
        this.fileName = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Map<String, String>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(MapsKt.emptyMap());
        this._edits = MutableStateFlow4;
        this.edits = FlowKt.asStateFlow(MutableStateFlow4);
        this.recent = recentStore.getRecent();
    }

    public final StateFlow<LoadState> getLoadState() {
        return this.loadState;
    }

    public final StateFlow<GxtDocument> getDocument() {
        return this.document;
    }

    public final StateFlow<String> getFileName() {
        return this.fileName;
    }

    public final StateFlow<Map<String, String>> getEdits() {
        return this.edits;
    }

    public final Flow<List<String>> getRecent() {
        return this.recent;
    }

    public final int saNameCount() {
        return this.nameLists.countFor(GxtGame.SA);
    }

    public final String textOf(int tableIndex, int entryIndex) {
        List<GxtTable> tables;
        GxtTable gxtTable;
        List<GxtEntry> entries;
        GxtEntry gxtEntry;
        String original;
        String str = this._edits.getValue().get(GxtViewModelKt.cellKey(tableIndex, entryIndex));
        if (str != null) {
            return str;
        }
        GxtDocument value = this._document.getValue();
        return (value == null || (tables = value.getTables()) == null || (gxtTable = (GxtTable) CollectionsKt.getOrNull(tables, tableIndex)) == null || (entries = gxtTable.getEntries()) == null || (gxtEntry = (GxtEntry) CollectionsKt.getOrNull(entries, entryIndex)) == null || (original = gxtEntry.getOriginal()) == null) ? "" : original;
    }

    public final boolean isEdited(int tableIndex, int entryIndex) {
        GxtDocument value;
        List<GxtTable> tables;
        GxtTable gxtTable;
        List<GxtEntry> entries;
        GxtEntry gxtEntry;
        String original;
        String str = this._edits.getValue().get(GxtViewModelKt.cellKey(tableIndex, entryIndex));
        if (str == null || (value = this._document.getValue()) == null || (tables = value.getTables()) == null || (gxtTable = (GxtTable) CollectionsKt.getOrNull(tables, tableIndex)) == null || (entries = gxtTable.getEntries()) == null || (gxtEntry = (GxtEntry) CollectionsKt.getOrNull(entries, entryIndex)) == null || (original = gxtEntry.getOriginal()) == null) {
            return false;
        }
        return !Intrinsics.areEqual(str, original);
    }

    public final void setEdit(int tableIndex, int entryIndex, String value) {
        List<GxtTable> tables;
        GxtTable gxtTable;
        List<GxtEntry> entries;
        GxtEntry gxtEntry;
        String original;
        Intrinsics.checkNotNullParameter(value, "value");
        GxtDocument value2 = this._document.getValue();
        if (value2 == null || (tables = value2.getTables()) == null || (gxtTable = (GxtTable) CollectionsKt.getOrNull(tables, tableIndex)) == null || (entries = gxtTable.getEntries()) == null || (gxtEntry = (GxtEntry) CollectionsKt.getOrNull(entries, entryIndex)) == null || (original = gxtEntry.getOriginal()) == null) {
            return;
        }
        MutableStateFlow<Map<String, String>> mutableStateFlow = this._edits;
        Map<String, String> mutableMap = MapsKt.toMutableMap(mutableStateFlow.getValue());
        if (Intrinsics.areEqual(value, original)) {
            mutableMap.remove(GxtViewModelKt.cellKey(tableIndex, entryIndex));
        } else {
            mutableMap.put(GxtViewModelKt.cellKey(tableIndex, entryIndex), value);
        }
        mutableStateFlow.setValue(mutableMap);
    }

    public final void resetEdit(int tableIndex, int entryIndex) {
        MutableStateFlow<Map<String, String>> mutableStateFlow = this._edits;
        Map<String, String> mutableMap = MapsKt.toMutableMap(mutableStateFlow.getValue());
        mutableMap.remove(GxtViewModelKt.cellKey(tableIndex, entryIndex));
        mutableStateFlow.setValue(mutableMap);
    }

    public final int pendingEditCount() {
        return this._edits.getValue().size();
    }

    /* JADX INFO: renamed from: com.zhawoilah.wgxt.viewmodel.GxtViewModel$openSample$1, reason: invalid class name */
    /* JADX INFO: compiled from: GxtViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(c = "com.zhawoilah.wgxt.viewmodel.GxtViewModel$openSample$1", f = "GxtViewModel.kt", i = {1}, l = {87, 92}, m = "invokeSuspend", n = {"doc"}, s = {"L$0"}, v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GxtViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0082, code lost:
        
            if (r5.this$0.recentStore.add("sample.gxt", r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r5.L$0
                com.zhawoilah.wgxt.data.GxtDocument r0 = (com.zhawoilah.wgxt.data.GxtDocument) r0
                kotlin.ResultKt.throwOnFailure(r6)
                goto L85
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L3f
            L22:
                kotlin.ResultKt.throwOnFailure(r6)
                kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getDefault()
                kotlin.coroutines.CoroutineContext r6 = (kotlin.coroutines.CoroutineContext) r6
                com.zhawoilah.wgxt.viewmodel.GxtViewModel$openSample$1$doc$1 r1 = new com.zhawoilah.wgxt.viewmodel.GxtViewModel$openSample$1$doc$1
                r4 = 0
                r1.<init>(r4)
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                r4 = r5
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r5.label = r3
                java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r1, r4)
                if (r6 != r0) goto L3f
                goto L84
            L3f:
                com.zhawoilah.wgxt.data.GxtDocument r6 = (com.zhawoilah.wgxt.data.GxtDocument) r6
                com.zhawoilah.wgxt.viewmodel.GxtViewModel r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.access$get_document$p(r1)
                r1.setValue(r6)
                com.zhawoilah.wgxt.viewmodel.GxtViewModel r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.access$get_edits$p(r1)
                java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
                r1.setValue(r3)
                com.zhawoilah.wgxt.viewmodel.GxtViewModel r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.access$get_fileName$p(r1)
                java.lang.String r3 = "sample.gxt"
                r1.setValue(r3)
                com.zhawoilah.wgxt.viewmodel.GxtViewModel r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.access$get_loadState$p(r1)
                com.zhawoilah.wgxt.viewmodel.LoadState$Loaded r4 = com.zhawoilah.wgxt.viewmodel.LoadState.Loaded.INSTANCE
                r1.setValue(r4)
                com.zhawoilah.wgxt.viewmodel.GxtViewModel r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.this
                com.zhawoilah.wgxt.data.RecentStore r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.access$getRecentStore$p(r1)
                r4 = r5
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
                r5.L$0 = r6
                r5.label = r2
                java.lang.Object r6 = r1.add(r3, r4)
                if (r6 != r0) goto L85
            L84:
                return r0
            L85:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zhawoilah.wgxt.viewmodel.GxtViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void openSample() {
        this._loadState.setValue(LoadState.Loading.INSTANCE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: com.zhawoilah.wgxt.viewmodel.GxtViewModel$openUri$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: GxtViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 2, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    @DebugMetadata(c = "com.zhawoilah.wgxt.viewmodel.GxtViewModel$openUri$1", f = "GxtViewModel.kt", i = {1}, l = {99, 115}, m = "invokeSuspend", n = {"doc"}, s = {"L$0"}, v = 1)
    static final class C03591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $displayName;
        final /* synthetic */ Uri $uri;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C03591(String str, Uri uri, Continuation<? super C03591> continuation) {
            super(2, continuation);
            this.$displayName = str;
            this.$uri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GxtViewModel.this.new C03591(this.$displayName, this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C03591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00b0, code lost:
        
            if (r7.this$0.recentStore.add(r7.$displayName, r7) == r0) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r7.L$0
                com.zhawoilah.wgxt.data.GxtDocument r0 = (com.zhawoilah.wgxt.data.GxtDocument) r0
                kotlin.ResultKt.throwOnFailure(r8)
                goto Lb3
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.ResultKt.throwOnFailure(r8)
                goto L44
            L23:
                kotlin.ResultKt.throwOnFailure(r8)
                kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
                kotlin.coroutines.CoroutineContext r8 = (kotlin.coroutines.CoroutineContext) r8
                com.zhawoilah.wgxt.viewmodel.GxtViewModel$openUri$1$doc$1 r1 = new com.zhawoilah.wgxt.viewmodel.GxtViewModel$openUri$1$doc$1
                com.zhawoilah.wgxt.viewmodel.GxtViewModel r4 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.this
                android.net.Uri r5 = r7.$uri
                r6 = 0
                r1.<init>(r4, r5, r6)
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                r4 = r7
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r7.label = r3
                java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r1, r4)
                if (r8 != r0) goto L44
                goto Lb2
            L44:
                com.zhawoilah.wgxt.data.GxtDocument r8 = (com.zhawoilah.wgxt.data.GxtDocument) r8
                if (r8 != 0) goto L58
                com.zhawoilah.wgxt.viewmodel.GxtViewModel r8 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r8 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.access$get_loadState$p(r8)
                com.zhawoilah.wgxt.viewmodel.LoadState$Error r0 = new com.zhawoilah.wgxt.viewmodel.LoadState$Error
                r1 = 0
                r0.<init>(r1)
                r8.setValue(r0)
                goto Lb3
            L58:
                boolean r1 = r8.isValid()
                if (r1 != 0) goto L6d
                com.zhawoilah.wgxt.viewmodel.GxtViewModel r8 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r8 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.access$get_loadState$p(r8)
                com.zhawoilah.wgxt.viewmodel.LoadState$Error r0 = new com.zhawoilah.wgxt.viewmodel.LoadState$Error
                r0.<init>(r3)
                r8.setValue(r0)
                goto Lb3
            L6d:
                com.zhawoilah.wgxt.viewmodel.GxtViewModel r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.access$get_document$p(r1)
                r1.setValue(r8)
                com.zhawoilah.wgxt.viewmodel.GxtViewModel r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.access$get_edits$p(r1)
                java.util.Map r3 = kotlin.collections.MapsKt.emptyMap()
                r1.setValue(r3)
                com.zhawoilah.wgxt.viewmodel.GxtViewModel r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.access$get_fileName$p(r1)
                java.lang.String r3 = r7.$displayName
                r1.setValue(r3)
                com.zhawoilah.wgxt.viewmodel.GxtViewModel r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.access$get_loadState$p(r1)
                com.zhawoilah.wgxt.viewmodel.LoadState$Loaded r3 = com.zhawoilah.wgxt.viewmodel.LoadState.Loaded.INSTANCE
                r1.setValue(r3)
                com.zhawoilah.wgxt.viewmodel.GxtViewModel r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.this
                com.zhawoilah.wgxt.data.RecentStore r1 = com.zhawoilah.wgxt.viewmodel.GxtViewModel.access$getRecentStore$p(r1)
                java.lang.String r3 = r7.$displayName
                r4 = r7
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
                r7.L$0 = r8
                r7.label = r2
                java.lang.Object r8 = r1.add(r3, r4)
                if (r8 != r0) goto Lb3
            Lb2:
                return r0
            Lb3:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zhawoilah.wgxt.viewmodel.GxtViewModel.C03591.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void openUri(Uri uri, String displayName) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this._loadState.setValue(LoadState.Loading.INSTANCE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C03591(displayName, uri, null), 3, null);
    }

    public final byte[] buildExportBytes() {
        Object objM8923constructorimpl;
        GxtDocument value = this._document.getValue();
        if (value == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            GxtViewModel gxtViewModel = this;
            objM8923constructorimpl = Result.m8923constructorimpl(GxtWriter.INSTANCE.write(value, new Function2() { // from class: com.zhawoilah.wgxt.viewmodel.GxtViewModel$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return this.f$0.textOf(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            }));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM8923constructorimpl = Result.m8923constructorimpl(ResultKt.createFailure(th));
        }
        return (byte[]) (Result.m8929isFailureimpl(objM8923constructorimpl) ? null : objM8923constructorimpl);
    }

    public final void closeDocument() {
        this._document.setValue(null);
        this._edits.setValue(MapsKt.emptyMap());
        this._fileName.setValue("");
        this._loadState.setValue(LoadState.Idle.INSTANCE);
    }
}
