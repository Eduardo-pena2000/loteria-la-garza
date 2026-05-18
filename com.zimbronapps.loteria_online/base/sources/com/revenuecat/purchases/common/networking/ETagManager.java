package com.revenuecat.purchases.common.networking;

import Ca.l;
import Ca.m;
import Ca.o;
import Ca.q;
import Ca.x;
import Da.S;
import Qa.a;
import android.content.Context;
import android.content.SharedPreferences;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.networking.HTTPResult;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ETagManager {
    public static final Companion Companion = new Companion(null);
    private final DateProvider dateProvider;
    private final l prefs;

    public static final class 1 extends u implements a {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(Context context) {
            super(0);
            this.$context = context;
        }

        public final SharedPreferences invoke() {
            return ETagManager.Companion.initializeSharedPreferences(this.$context);
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final SharedPreferences initializeSharedPreferences(Context context) {
            t.g(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + "_preferences_etags", 0);
            t.f(sharedPreferences, "context.getSharedPrefere…DE_PRIVATE,\n            )");
            return sharedPreferences;
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VerificationResult.values().length];
            try {
                iArr[VerificationResult.VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VerificationResult.NOT_REQUESTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VerificationResult.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VerificationResult.VERIFIED_ON_DEVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ETagManager(Context context, l lVar, DateProvider dateProvider) {
        t.g(context, "context");
        t.g(lVar, "prefs");
        t.g(dateProvider, "dateProvider");
        this.prefs = lVar;
        this.dateProvider = dateProvider;
    }

    public static /* synthetic */ Map getETagHeaders$purchases_defaultsBc8Release$default(ETagManager eTagManager, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return eTagManager.getETagHeaders$purchases_defaultsBc8Release(str, z, z2);
    }

    private final HTTPResultWithETag getStoredResultSavedInSharedPreferences(String str) {
        String string = ((SharedPreferences) this.prefs.getValue()).getString(str, (String) null);
        if (string != null) {
            return HTTPResultWithETag.Companion.deserialize(string);
        }
        return null;
    }

    private final boolean shouldStoreBackendResult(HTTPResult hTTPResult) {
        int responseCode = hTTPResult.getResponseCode();
        return (responseCode == 304 || responseCode >= 500 || hTTPResult.getVerificationResult() == VerificationResult.FAILED) ? false : true;
    }

    private final boolean shouldUseETag(HTTPResultWithETag hTTPResultWithETag, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$0[hTTPResultWithETag.getHttpResult().getVerificationResult().ordinal()];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            if (i != 3 && i != 4) {
                throw new o();
            }
        } else if (!z) {
            return true;
        }
        return false;
    }

    private final synchronized void storeResult(String str, HTTPResult hTTPResult, String str2) {
        ((SharedPreferences) this.prefs.getValue()).edit().putString(str, new HTTPResultWithETag(new ETagData(str2, this.dateProvider.getNow()), HTTPResult.copy$default(hTTPResult, 0, null, HTTPResult.Origin.CACHE, null, null, false, false, 123, null)).serialize()).apply();
    }

    public final synchronized void clearCaches$purchases_defaultsBc8Release() {
        ((SharedPreferences) this.prefs.getValue()).edit().clear().apply();
    }

    public final Map getETagHeaders$purchases_defaultsBc8Release(String str, boolean z, boolean z2) {
        ETagData eTagData;
        Date lastRefreshTime;
        t.g(str, "urlString");
        String str2 = null;
        HTTPResultWithETag storedResultSavedInSharedPreferences = z2 ? null : getStoredResultSavedInSharedPreferences(str);
        if (storedResultSavedInSharedPreferences == null || (eTagData = storedResultSavedInSharedPreferences.getETagData()) == null || !shouldUseETag(storedResultSavedInSharedPreferences, z)) {
            eTagData = null;
        }
        String eTag = eTagData != null ? eTagData.getETag() : null;
        if (eTag == null) {
            eTag = "";
        }
        q a = x.a("X-RevenueCat-ETag", eTag);
        if (eTagData != null && (lastRefreshTime = eTagData.getLastRefreshTime()) != null) {
            str2 = Long.valueOf(lastRefreshTime.getTime()).toString();
        }
        return S.l(new q[]{a, x.a("X-RC-Last-Refresh-Time", str2)});
    }

    public final HTTPResult getHTTPResultFromCacheOrBackend$purchases_defaultsBc8Release(int i, String str, String str2, String str3, boolean z, Date date, VerificationResult verificationResult, boolean z2, boolean z3) {
        HTTPResult hTTPResult;
        LogHandler currentLogHandler;
        String str4;
        String str5;
        t.g(str, "payload");
        t.g(str3, "urlString");
        t.g(verificationResult, "verificationResult");
        HTTPResult hTTPResult2 = new HTTPResult(i, str, HTTPResult.Origin.BACKEND, date, verificationResult, z2, z3);
        if (str2 != null) {
            if (shouldUseCachedVersion$purchases_defaultsBc8Release(i)) {
                HTTPResult storedResult$purchases_defaultsBc8Release = getStoredResult$purchases_defaultsBc8Release(str3);
                if (storedResult$purchases_defaultsBc8Release != null) {
                    hTTPResult = HTTPResult.copy$default(storedResult$purchases_defaultsBc8Release, 0, null, null, date == null ? storedResult$purchases_defaultsBc8Release.getRequestDate() : date, verificationResult, false, false, 103, null);
                } else {
                    hTTPResult = null;
                }
                if (hTTPResult != null) {
                    return hTTPResult;
                }
                if (!z) {
                    return null;
                }
                LogIntent logIntent = LogIntent.WARNING;
                ETagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1 eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1 = new ETagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1(logIntent, hTTPResult2);
                switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                    case 1:
                        LogLevel logLevel = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) > 0) {
                            return hTTPResult2;
                        }
                        str4 = "[Purchases] - " + logLevel.name();
                        str5 = (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke();
                        break;
                    case 2:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke(), null);
                        return hTTPResult2;
                    case 3:
                        LogLevel logLevel2 = LogLevel.WARN;
                        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) > 0) {
                            return hTTPResult2;
                        }
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                        return hTTPResult2;
                    case 4:
                        LogLevel logLevel3 = LogLevel.INFO;
                        LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) > 0) {
                            return hTTPResult2;
                        }
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                        return hTTPResult2;
                    case 5:
                        LogLevel logLevel4 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) > 0) {
                            return hTTPResult2;
                        }
                        str4 = "[Purchases] - " + logLevel4.name();
                        str5 = (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke();
                        break;
                    case 6:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke(), null);
                        return hTTPResult2;
                    case 7:
                        LogLevel logLevel5 = LogLevel.INFO;
                        LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) > 0) {
                            return hTTPResult2;
                        }
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                        return hTTPResult2;
                    case 8:
                        LogLevel logLevel6 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) > 0) {
                            return hTTPResult2;
                        }
                        str4 = "[Purchases] - " + logLevel6.name();
                        str5 = (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke();
                        break;
                    case 9:
                        LogLevel logLevel7 = LogLevel.DEBUG;
                        currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) > 0) {
                            return hTTPResult2;
                        }
                        str4 = "[Purchases] - " + logLevel7.name();
                        str5 = (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke();
                        break;
                    case 10:
                        LogLevel logLevel8 = LogLevel.WARN;
                        LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) > 0) {
                            return hTTPResult2;
                        }
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                        return hTTPResult2;
                    case 11:
                        LogLevel logLevel9 = LogLevel.WARN;
                        LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) > 0) {
                            return hTTPResult2;
                        }
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                        return hTTPResult2;
                    case 12:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke(), null);
                        return hTTPResult2;
                    case 13:
                        LogLevel logLevel10 = LogLevel.WARN;
                        LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                        if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) > 0) {
                            return hTTPResult2;
                        }
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke());
                        return hTTPResult2;
                    case 14:
                        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) eTagManager$getHTTPResultFromCacheOrBackend$lambda$3$$inlined$log$1.invoke(), null);
                        return hTTPResult2;
                    default:
                        return hTTPResult2;
                }
                currentLogHandler.d(str4, str5);
                return hTTPResult2;
            }
            storeBackendResultIfNoError$purchases_defaultsBc8Release(str3, hTTPResult2, str2);
        }
        return hTTPResult2;
    }

    public final HTTPResult getStoredResult$purchases_defaultsBc8Release(String str) {
        t.g(str, "urlString");
        HTTPResultWithETag storedResultSavedInSharedPreferences = getStoredResultSavedInSharedPreferences(str);
        if (storedResultSavedInSharedPreferences != null) {
            return storedResultSavedInSharedPreferences.getHttpResult();
        }
        return null;
    }

    public final boolean shouldUseCachedVersion$purchases_defaultsBc8Release(int i) {
        return i == 304;
    }

    public final void storeBackendResultIfNoError$purchases_defaultsBc8Release(String str, HTTPResult hTTPResult, String str2) {
        t.g(str, "urlString");
        t.g(hTTPResult, "resultFromBackend");
        t.g(str2, "eTagInResponse");
        if (shouldStoreBackendResult(hTTPResult)) {
            storeResult(str, hTTPResult, str2);
        }
    }

    public /* synthetic */ ETagManager(Context context, l lVar, DateProvider dateProvider, int i, k kVar) {
        this(context, (i & 2) != 0 ? m.b(new 1(context)) : lVar, (i & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
