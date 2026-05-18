package com.revenuecat.purchases.common;

import Ca.I;
import Ua.c;
import Wa.l;
import Wa.n;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.networking.HTTPResult;
import com.revenuecat.purchases.common.networking.NullPointerReadingErrorStreamException;
import com.revenuecat.purchases.common.verification.SignatureVerificationException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class Dispatcher {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final double INTEGRATION_TEST_DELAY_PERCENTAGE = 0.01d;
    private final ExecutorService executorService;
    private final Handler mainHandler;
    private final boolean runningIntegrationTests;

    public static abstract class AsyncCall implements Runnable {
        public abstract HTTPResult call() throws JSONException, IOException;

        public void onCompletion(HTTPResult hTTPResult) {
            t.g(hTTPResult, "result");
        }

        public void onError(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
        }

        public void run() {
            try {
                onCompletion(call());
            } catch (IOException e) {
                PurchasesError purchasesError = ErrorsKt.toPurchasesError((Exception) e);
                LogUtilsKt.errorLog(purchasesError);
                onError(purchasesError);
            } catch (JSONException e2) {
                PurchasesError purchasesError2 = ErrorsKt.toPurchasesError((Exception) e2);
                LogUtilsKt.errorLog(purchasesError2);
                onError(purchasesError2);
            } catch (NullPointerReadingErrorStreamException e3) {
                PurchasesError purchasesError3 = ErrorsKt.toPurchasesError(e3);
                LogUtilsKt.errorLog(purchasesError3);
                onError(purchasesError3);
            } catch (SignatureVerificationException e4) {
                PurchasesError purchasesError4 = ErrorsKt.toPurchasesError(e4);
                LogUtilsKt.errorLog(purchasesError4);
                onError(purchasesError4);
            } catch (SecurityException e5) {
                PurchasesError purchasesError5 = ErrorsKt.toPurchasesError((Exception) e5);
                LogUtilsKt.errorLog(purchasesError5);
                onError(purchasesError5);
            }
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public Dispatcher(ExecutorService executorService, Handler handler, boolean z) {
        t.g(executorService, "executorService");
        this.executorService = executorService;
        this.mainHandler = handler;
        this.runningIntegrationTests = z;
    }

    public static /* synthetic */ void a(Runnable runnable, Dispatcher dispatcher) {
        enqueue$lambda$3$lambda$2(runnable, dispatcher);
    }

    public static /* synthetic */ void b(Throwable th) {
        enqueue$lambda$3$lambda$2$lambda$1(th);
    }

    public static /* synthetic */ void enqueue$default(Dispatcher dispatcher, Runnable runnable, Delay delay, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i & 2) != 0) {
            delay = Delay.NONE;
        }
        dispatcher.enqueue(runnable, delay);
    }

    private static final void enqueue$lambda$3$lambda$2(Runnable runnable, Dispatcher dispatcher) {
        try {
            runnable.run();
        } catch (Throwable th) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Exception running command: " + th, null);
            Handler handler = dispatcher.mainHandler;
            if (handler != null) {
                handler.post(new b(th));
            }
        }
    }

    public void close() {
        synchronized (this.executorService) {
            this.executorService.shutdownNow();
        }
    }

    public void enqueue(Runnable runnable, Delay delay) {
        t.g(runnable, "command");
        t.g(delay, "delay");
        synchronized (this.executorService) {
            try {
                if (!this.executorService.isShutdown()) {
                    a aVar = new a(runnable, this);
                    if (delay == Delay.NONE || !(this.executorService instanceof ScheduledExecutorService)) {
                        this.executorService.submit(aVar);
                    } else {
                        long t = n.t(new l(ab.b.q(delay.getMinDelay-UwyO8pc()), ab.b.q(delay.getMaxDelay-UwyO8pc())), c.a);
                        if (this.runningIntegrationTests) {
                            t = (long) (t * 0.01d);
                        }
                        this.executorService.schedule(aVar, t, TimeUnit.MILLISECONDS);
                    }
                }
                I i = I.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isClosed() {
        boolean isShutdown;
        synchronized (this.executorService) {
            isShutdown = this.executorService.isShutdown();
        }
        return isShutdown;
    }

    public /* synthetic */ Dispatcher(ExecutorService executorService, Handler handler, boolean z, int i, k kVar) {
        this(executorService, (i & 2) != 0 ? new Handler(Looper.getMainLooper()) : handler, (i & 4) != 0 ? false : z);
    }

    private static final void enqueue$lambda$3$lambda$2$lambda$1(Throwable th) {
        throw th;
    }
}
