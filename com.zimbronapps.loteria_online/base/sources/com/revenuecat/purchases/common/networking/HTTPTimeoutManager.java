package com.revenuecat.purchases.common.networking;

import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class HTTPTimeoutManager {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_TIMEOUT_MS = 30000;
    public static final long REDUCED_TIMEOUT_MS = 2000;
    public static final long SUPPORTED_FALLBACK_TIMEOUT_MS = 5000;
    public static final long TEST_DIVIDER = 10;
    public static final long TIMEOUT_RESET_INTERVAL_MS = 600000;
    private final AppConfig appConfig;
    private final DateProvider dateProvider;
    private final AtomicLong lastTimeoutRequestTime;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public enum RequestResult {
        SUCCESS_ON_MAIN_BACKEND,
        TIMEOUT_ON_MAIN_BACKEND_FOR_FALLBACK_SUPPORTED_ENDPOINT,
        OTHER_RESULT
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RequestResult.values().length];
            try {
                iArr[RequestResult.SUCCESS_ON_MAIN_BACKEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RequestResult.TIMEOUT_ON_MAIN_BACKEND_FOR_FALLBACK_SUPPORTED_ENDPOINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RequestResult.OTHER_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HTTPTimeoutManager(AppConfig appConfig, DateProvider dateProvider) {
        t.g(appConfig, "appConfig");
        t.g(dateProvider, "dateProvider");
        this.appConfig = appConfig;
        this.dateProvider = dateProvider;
        this.lastTimeoutRequestTime = new AtomicLong(0L);
    }

    private final void resetTimeout() {
        this.lastTimeoutRequestTime.set(0L);
    }

    private final boolean shouldResetTimeout() {
        long j = this.lastTimeoutRequestTime.get();
        return j != 0 && this.dateProvider.getNow().getTime() - j >= 600000;
    }

    public final long getTimeoutForRequest(boolean z, boolean z2) {
        if (shouldResetTimeout()) {
            resetTimeout();
        }
        long j = (z || !z2) ? 30000L : this.lastTimeoutRequestTime.get() > 0 ? 2000L : 5000L;
        return this.appConfig.getRunningTests() ? j / 10 : j;
    }

    public final void recordRequestResult(RequestResult requestResult) {
        t.g(requestResult, "result");
        int i = WhenMappings.$EnumSwitchMapping$0[requestResult.ordinal()];
        if (i == 1) {
            resetTimeout();
        } else {
            if (i != 2) {
                return;
            }
            this.lastTimeoutRequestTime.set(this.dateProvider.getNow().getTime());
        }
    }

    public /* synthetic */ HTTPTimeoutManager(AppConfig appConfig, DateProvider dateProvider, int i, k kVar) {
        this(appConfig, (i & 2) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
