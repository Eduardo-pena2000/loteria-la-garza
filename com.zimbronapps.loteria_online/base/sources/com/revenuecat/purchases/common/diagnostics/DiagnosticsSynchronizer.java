package com.revenuecat.purchases.common.diagnostics;

import Ca.I;
import Da.v;
import Qa.l;
import Qa.p;
import Ya.h;
import Ya.r;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class DiagnosticsSynchronizer implements DiagnosticsEventTrackerListener {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_EVENTS_TO_SYNC_PER_REQUEST = 200;
    public static final int MAX_NUMBER_POST_RETRIES = 3;
    private final Backend backend;
    private final Dispatcher diagnosticsDispatcher;
    private final DiagnosticsFileHelper diagnosticsFileHelper;
    private final DiagnosticsHelper diagnosticsHelper;
    private final DiagnosticsTracker diagnosticsTracker;
    private final AtomicBoolean isSyncing;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ void getMAX_EVENTS_TO_SYNC_PER_REQUEST$annotations() {
        }

        public static /* synthetic */ void getMAX_NUMBER_POST_RETRIES$annotations() {
        }

        private Companion() {
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ O $eventsToSync;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(O o) {
            super(1);
            this.$eventsToSync = o;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h) obj);
            return I.a;
        }

        public final void invoke(h hVar) {
            t.g(hVar, "sequence");
            this.$eventsToSync.a = r.G(r.D(hVar, 200));
        }
    }

    public static final class 1 extends u implements Qa.a {
        public 1() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            if (DiagnosticsSynchronizer.access$getDiagnosticsFileHelper$p(DiagnosticsSynchronizer.this).isDiagnosticsFileBigEnoughToSync()) {
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Diagnostics file is big enough to sync. Syncing it.");
                }
                DiagnosticsSynchronizer.this.syncDiagnosticsFileIfNeeded();
            }
        }
    }

    public static final class 1 extends u implements Qa.a {

        public static final class 3 extends u implements l {
            final /* synthetic */ int $diagnosticsCount;
            final /* synthetic */ DiagnosticsSynchronizer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 3(DiagnosticsSynchronizer diagnosticsSynchronizer, int i) {
                super(1);
                this.this$0 = diagnosticsSynchronizer;
                this.$diagnosticsCount = i;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((JSONObject) obj);
                return I.a;
            }

            public final void invoke(JSONObject jSONObject) {
                t.g(jSONObject, "it");
                LogLevel logLevel = LogLevel.VERBOSE;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Synced diagnostics file successfully.");
                }
                DiagnosticsSynchronizer.access$getDiagnosticsHelper$p(this.this$0).clearConsecutiveNumberOfErrors();
                DiagnosticsSynchronizer.access$getDiagnosticsFileHelper$p(this.this$0).clear(this.$diagnosticsCount);
                this.this$0.isSyncing().set(false);
            }
        }

        public static final class 4 extends u implements p {
            final /* synthetic */ DiagnosticsSynchronizer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 4(DiagnosticsSynchronizer diagnosticsSynchronizer) {
                super(2);
                this.this$0 = diagnosticsSynchronizer;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
                return I.a;
            }

            public final void invoke(PurchasesError purchasesError, boolean z) {
                t.g(purchasesError, "error");
                if (z) {
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    Config config = Config.INSTANCE;
                    if (config.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), "Error syncing diagnostics file: " + purchasesError + ". Will retry the next time the SDK is initialized");
                    }
                    if (DiagnosticsSynchronizer.access$getDiagnosticsHelper$p(this.this$0).increaseConsecutiveNumberOfErrors() >= 3) {
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (config.getLogLevel().compareTo(logLevel) <= 0) {
                            currentLogHandler2.v("[Purchases] - " + logLevel.name(), "Error syncing diagnostics file: " + purchasesError + ". This was the final attempt (3). Deleting diagnostics file without posting.");
                        }
                        DiagnosticsSynchronizer.access$getDiagnosticsHelper$p(this.this$0).resetDiagnosticsStatus();
                        DiagnosticsSynchronizer.access$getDiagnosticsTracker$p(this.this$0).trackMaxDiagnosticsSyncRetriesReached();
                    }
                } else {
                    LogLevel logLevel2 = LogLevel.VERBOSE;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler3.v("[Purchases] - " + logLevel2.name(), "Error syncing diagnostics file: " + purchasesError + ". Deleting diagnostics file without retrying.");
                    }
                    DiagnosticsSynchronizer.access$getDiagnosticsHelper$p(this.this$0).resetDiagnosticsStatus();
                    DiagnosticsSynchronizer.access$getDiagnosticsTracker$p(this.this$0).trackClearingDiagnosticsAfterFailedSync();
                }
                this.this$0.isSyncing().set(false);
            }
        }

        public 1() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            try {
                if (DiagnosticsSynchronizer.this.isSyncing().getAndSet(true)) {
                    LogLevel logLevel = LogLevel.VERBOSE;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.v("[Purchases] - " + logLevel.name(), "Already syncing diagnostics file.");
                        return;
                    }
                    return;
                }
                List access$getEventsToSync = DiagnosticsSynchronizer.access$getEventsToSync(DiagnosticsSynchronizer.this);
                int size = access$getEventsToSync.size();
                if (size != 0) {
                    DiagnosticsSynchronizer.access$getBackend$p(DiagnosticsSynchronizer.this).postDiagnostics(access$getEventsToSync, new 3(DiagnosticsSynchronizer.this, size), new 4(DiagnosticsSynchronizer.this));
                    return;
                }
                LogLevel logLevel2 = LogLevel.VERBOSE;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "No diagnostics to sync.");
                }
                DiagnosticsSynchronizer.this.isSyncing().set(false);
            } catch (Exception e) {
                LogLevel logLevel3 = LogLevel.VERBOSE;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.v("[Purchases] - " + logLevel3.name(), "Error syncing diagnostics file: " + e);
                }
                try {
                    DiagnosticsSynchronizer.access$getDiagnosticsHelper$p(DiagnosticsSynchronizer.this).resetDiagnosticsStatus();
                } catch (IOException e2) {
                    LogLevel logLevel4 = LogLevel.VERBOSE;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        currentLogHandler4.v("[Purchases] - " + logLevel4.name(), "Error deleting diagnostics file: " + e2);
                    }
                }
                DiagnosticsSynchronizer.this.isSyncing().set(false);
            }
        }
    }

    public DiagnosticsSynchronizer(DiagnosticsHelper diagnosticsHelper, DiagnosticsFileHelper diagnosticsFileHelper, DiagnosticsTracker diagnosticsTracker, Backend backend, Dispatcher dispatcher) {
        t.g(diagnosticsHelper, "diagnosticsHelper");
        t.g(diagnosticsFileHelper, "diagnosticsFileHelper");
        t.g(diagnosticsTracker, "diagnosticsTracker");
        t.g(backend, "backend");
        t.g(dispatcher, "diagnosticsDispatcher");
        this.diagnosticsHelper = diagnosticsHelper;
        this.diagnosticsFileHelper = diagnosticsFileHelper;
        this.diagnosticsTracker = diagnosticsTracker;
        this.backend = backend;
        this.diagnosticsDispatcher = dispatcher;
        this.isSyncing = new AtomicBoolean(false);
    }

    public static /* synthetic */ void a(Qa.a aVar) {
        enqueue$lambda$0(aVar);
    }

    public static final /* synthetic */ Backend access$getBackend$p(DiagnosticsSynchronizer diagnosticsSynchronizer) {
        return diagnosticsSynchronizer.backend;
    }

    public static final /* synthetic */ DiagnosticsFileHelper access$getDiagnosticsFileHelper$p(DiagnosticsSynchronizer diagnosticsSynchronizer) {
        return diagnosticsSynchronizer.diagnosticsFileHelper;
    }

    public static final /* synthetic */ DiagnosticsHelper access$getDiagnosticsHelper$p(DiagnosticsSynchronizer diagnosticsSynchronizer) {
        return diagnosticsSynchronizer.diagnosticsHelper;
    }

    public static final /* synthetic */ DiagnosticsTracker access$getDiagnosticsTracker$p(DiagnosticsSynchronizer diagnosticsSynchronizer) {
        return diagnosticsSynchronizer.diagnosticsTracker;
    }

    public static final /* synthetic */ List access$getEventsToSync(DiagnosticsSynchronizer diagnosticsSynchronizer) {
        return diagnosticsSynchronizer.getEventsToSync();
    }

    private final void enqueue(Qa.a aVar) {
        Dispatcher.enqueue$default(this.diagnosticsDispatcher, new a(aVar), null, 2, null);
    }

    private static final void enqueue$lambda$0(Qa.a aVar) {
        aVar.invoke();
    }

    private final List getEventsToSync() {
        O o = new O();
        o.a = v.n();
        this.diagnosticsFileHelper.readFileAsJson(new 1(o));
        return (List) o.a;
    }

    private final void syncDiagnosticsFileIfBigEnough() {
        enqueue(new 1());
    }

    public final AtomicBoolean isSyncing() {
        return this.isSyncing;
    }

    public void onEventTracked() {
        syncDiagnosticsFileIfBigEnough();
    }

    public final void syncDiagnosticsFileIfNeeded() {
        enqueue(new 1());
    }
}
