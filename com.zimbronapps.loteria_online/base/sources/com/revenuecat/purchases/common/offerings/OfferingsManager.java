package com.revenuecat.purchases.common.offerings;

import Ca.I;
import Ca.q;
import Da.S;
import Da.Y;
import Qa.l;
import Qa.p;
import android.os.Handler;
import android.os.Looper;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.DurationExtensionsKt;
import com.revenuecat.purchases.common.GetOfferingsErrorHandlingBehavior;
import com.revenuecat.purchases.common.HTTPResponseOriginalSource;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.paywalls.OfferingFontPreDownloader;
import com.revenuecat.purchases.utils.OfferingImagePreDownloader;
import java.util.Date;
import java.util.Set;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfferingsManager {
    private final Backend backend;
    private final DateProvider dateProvider;
    private final DiagnosticsTracker diagnosticsTrackerIfEnabled;
    private final Offerings emptyOfferings;
    private final Handler mainHandler;
    private final OfferingFontPreDownloader offeringFontPreDownloader;
    private final OfferingImagePreDownloader offeringImagePreDownloader;
    private final OfferingsCache offeringsCache;
    private final OfferingsFactory offeringsFactory;
    private final boolean uiPreviewMode;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiagnosticsTracker.CacheStatus.values().length];
            try {
                iArr[DiagnosticsTracker.CacheStatus.NOT_CHECKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiagnosticsTracker.CacheStatus.NOT_FOUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class 1 extends u implements l {
        final /* synthetic */ l $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar) {
            super(1);
            this.$onError = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "error");
            OfferingsManager.access$handleErrorFetchingOfferings(OfferingsManager.this, purchasesError, this.$onError);
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ JSONObject $offeringsJSON;
        final /* synthetic */ l $onSuccess;

        public static final class 2 extends u implements Qa.a {
            final /* synthetic */ OfferingsResultData $offeringsResultData;
            final /* synthetic */ l $onSuccess;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public 2(l lVar, OfferingsResultData offeringsResultData) {
                super(0);
                this.$onSuccess = lVar;
                this.$offeringsResultData = offeringsResultData;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                l lVar = this.$onSuccess;
                if (lVar != null) {
                    lVar.invoke(this.$offeringsResultData);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(JSONObject jSONObject, l lVar) {
            super(1);
            this.$offeringsJSON = jSONObject;
            this.$onSuccess = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OfferingsResultData) obj);
            return I.a;
        }

        public final void invoke(OfferingsResultData offeringsResultData) {
            t.g(offeringsResultData, "offeringsResultData");
            Offering current = offeringsResultData.getOfferings().getCurrent();
            if (current != null) {
                OfferingsManager.access$getOfferingImagePreDownloader$p(OfferingsManager.this).preDownloadOfferingImages(current);
            }
            OfferingsManager.access$getOfferingFontPreDownloader$p(OfferingsManager.this).preDownloadOfferingFontsIfNeeded(offeringsResultData.getOfferings());
            OfferingsManager.access$getOfferingsCache$p(OfferingsManager.this).cacheOfferings(offeringsResultData.getOfferings(), this.$offeringsJSON);
            OfferingsManager.access$dispatch(OfferingsManager.this, new 2(this.$onSuccess, offeringsResultData));
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ l $onSuccess;
        final /* synthetic */ OfferingsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, OfferingsManager offeringsManager) {
            super(0);
            this.$onSuccess = lVar;
            this.this$0 = offeringsManager;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            l lVar = this.$onSuccess;
            if (lVar != null) {
                lVar.invoke(new OfferingsResultData(OfferingsManager.access$getEmptyOfferings$p(this.this$0), Y.b(), Y.b()));
            }
        }
    }

    public static final class 3 extends u implements p {
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(l lVar, l lVar2) {
            super(2);
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((JSONObject) obj, (HTTPResponseOriginalSource) obj2);
            return I.a;
        }

        public final void invoke(JSONObject jSONObject, HTTPResponseOriginalSource hTTPResponseOriginalSource) {
            t.g(jSONObject, "body");
            t.g(hTTPResponseOriginalSource, "originalDataSource");
            OfferingsManager.access$createAndCacheOfferings(OfferingsManager.this, jSONObject, hTTPResponseOriginalSource, false, this.$onError, this.$onSuccess);
        }
    }

    public static final class 4 extends u implements p {
        final /* synthetic */ l $onError;
        final /* synthetic */ l $onSuccess;

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GetOfferingsErrorHandlingBehavior.values().length];
                try {
                    iArr[GetOfferingsErrorHandlingBehavior.SHOULD_FALLBACK_TO_CACHED_OFFERINGS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GetOfferingsErrorHandlingBehavior.SHOULD_NOT_FALLBACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 4(l lVar, l lVar2) {
            super(2);
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((PurchasesError) obj, (GetOfferingsErrorHandlingBehavior) obj2);
            return I.a;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke(com.revenuecat.purchases.PurchasesError r7, com.revenuecat.purchases.common.GetOfferingsErrorHandlingBehavior r8) {
            /*
                r6 = this;
                java.lang.String r0 = "backendError"
                kotlin.jvm.internal.t.g(r7, r0)
                java.lang.String r0 = "errorBehavior"
                kotlin.jvm.internal.t.g(r8, r0)
                int[] r0 = com.revenuecat.purchases.common.offerings.OfferingsManager.fetchAndCacheOfferings.4.WhenMappings.$EnumSwitchMapping$0
                int r8 = r8.ordinal()
                r8 = r0[r8]
                r0 = 1
                if (r8 == r0) goto L22
                r0 = 2
                if (r8 == r0) goto L1a
                goto L8d
            L1a:
                com.revenuecat.purchases.common.offerings.OfferingsManager r8 = com.revenuecat.purchases.common.offerings.OfferingsManager.this
                Qa.l r0 = r6.$onError
                com.revenuecat.purchases.common.offerings.OfferingsManager.access$handleErrorFetchingOfferings(r8, r7, r0)
                goto L8d
            L22:
                com.revenuecat.purchases.common.offerings.OfferingsManager r8 = com.revenuecat.purchases.common.offerings.OfferingsManager.this
                com.revenuecat.purchases.common.offerings.OfferingsCache r8 = com.revenuecat.purchases.common.offerings.OfferingsManager.access$getOfferingsCache$p(r8)
                org.json.JSONObject r1 = r8.getCachedOfferingsResponse()
                if (r1 != 0) goto L36
                com.revenuecat.purchases.common.offerings.OfferingsManager r8 = com.revenuecat.purchases.common.offerings.OfferingsManager.this
                Qa.l r0 = r6.$onError
                com.revenuecat.purchases.common.offerings.OfferingsManager.access$handleErrorFetchingOfferings(r8, r7, r0)
                goto L8d
            L36:
                com.revenuecat.purchases.LogLevel r7 = com.revenuecat.purchases.LogLevel.WARN
                com.revenuecat.purchases.LogHandler r8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler()
                com.revenuecat.purchases.common.Config r0 = com.revenuecat.purchases.common.Config.INSTANCE
                com.revenuecat.purchases.LogLevel r0 = r0.getLogLevel()
                int r0 = r0.compareTo(r7)
                if (r0 > 0) goto L62
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "[Purchases] - "
                r0.append(r2)
                java.lang.String r7 = r7.name()
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                java.lang.String r0 = "Error fetching offerings. Using disk cache."
                r8.w(r7, r0)
            L62:
                java.lang.String r7 = "rc_original_source"
                java.lang.String r7 = com.revenuecat.purchases.utils.JSONObjectExtensionsKt.optNullableString(r1, r7)
                if (r7 == 0) goto L80
                com.revenuecat.purchases.common.HTTPResponseOriginalSource r7 = com.revenuecat.purchases.common.HTTPResponseOriginalSource.valueOf(r7)     // Catch: java.lang.IllegalArgumentException -> L6f
                goto L7c
            L6f:
                r7 = move-exception
                com.revenuecat.purchases.LogHandler r8 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler()
                java.lang.String r0 = "[Purchases] - ERROR"
                java.lang.String r2 = "Invalid original data source for cached offerings"
                r8.e(r0, r2, r7)
                r7 = 0
            L7c:
                if (r7 == 0) goto L80
            L7e:
                r2 = r7
                goto L83
            L80:
                com.revenuecat.purchases.common.HTTPResponseOriginalSource r7 = com.revenuecat.purchases.common.HTTPResponseOriginalSource.MAIN
                goto L7e
            L83:
                com.revenuecat.purchases.common.offerings.OfferingsManager r0 = com.revenuecat.purchases.common.offerings.OfferingsManager.this
                Qa.l r4 = r6.$onError
                Qa.l r5 = r6.$onSuccess
                r3 = 1
                com.revenuecat.purchases.common.offerings.OfferingsManager.access$createAndCacheOfferings(r0, r1, r2, r3, r4, r5)
            L8d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.offerings.OfferingsManager.fetchAndCacheOfferings.4.invoke(com.revenuecat.purchases.PurchasesError, com.revenuecat.purchases.common.GetOfferingsErrorHandlingBehavior):void");
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ DiagnosticsTracker.CacheStatus $cacheStatus;
        final /* synthetic */ p $onErrorTracked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(p pVar, DiagnosticsTracker.CacheStatus cacheStatus) {
            super(1);
            this.$onErrorTracked = pVar;
            this.$cacheStatus = cacheStatus;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "it");
            this.$onErrorTracked.invoke(purchasesError, this.$cacheStatus);
        }
    }

    public static final class 3 extends u implements l {
        final /* synthetic */ DiagnosticsTracker.CacheStatus $cacheStatus;
        final /* synthetic */ p $onSuccessTracked;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(p pVar, DiagnosticsTracker.CacheStatus cacheStatus) {
            super(1);
            this.$onSuccessTracked = pVar;
            this.$cacheStatus = cacheStatus;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OfferingsResultData) obj);
            return I.a;
        }

        public final void invoke(OfferingsResultData offeringsResultData) {
            t.g(offeringsResultData, "it");
            this.$onSuccessTracked.invoke(offeringsResultData, this.$cacheStatus);
        }
    }

    public static final class 1 extends u implements Qa.a {
        final /* synthetic */ l $onSuccess;
        final /* synthetic */ OfferingsManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 1(l lVar, OfferingsManager offeringsManager) {
            super(0);
            this.$onSuccess = lVar;
            this.this$0 = offeringsManager;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            l lVar = this.$onSuccess;
            if (lVar != null) {
                lVar.invoke(OfferingsManager.access$getEmptyOfferings$p(this.this$0));
            }
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ PurchasesError $error;
        final /* synthetic */ l $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(l lVar, PurchasesError purchasesError) {
            super(0);
            this.$onError = lVar;
            this.$error = purchasesError;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            l lVar = this.$onError;
            if (lVar != null) {
                lVar.invoke(this.$error);
            }
        }
    }

    public static final class 2 extends u implements Qa.a {
        final /* synthetic */ Offerings $cachedOfferings;
        final /* synthetic */ l $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(l lVar, Offerings offerings) {
            super(0);
            this.$onSuccess = lVar;
            this.$cachedOfferings = offerings;
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            l lVar = this.$onSuccess;
            if (lVar != null) {
                lVar.invoke(this.$cachedOfferings);
            }
        }
    }

    public OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, DiagnosticsTracker diagnosticsTracker, OfferingFontPreDownloader offeringFontPreDownloader, boolean z, DateProvider dateProvider, Handler handler) {
        t.g(offeringsCache, "offeringsCache");
        t.g(backend, "backend");
        t.g(offeringsFactory, "offeringsFactory");
        t.g(offeringImagePreDownloader, "offeringImagePreDownloader");
        t.g(offeringFontPreDownloader, "offeringFontPreDownloader");
        t.g(dateProvider, "dateProvider");
        this.offeringsCache = offeringsCache;
        this.backend = backend;
        this.offeringsFactory = offeringsFactory;
        this.offeringImagePreDownloader = offeringImagePreDownloader;
        this.diagnosticsTrackerIfEnabled = diagnosticsTracker;
        this.offeringFontPreDownloader = offeringFontPreDownloader;
        this.uiPreviewMode = z;
        this.dateProvider = dateProvider;
        this.mainHandler = handler;
        this.emptyOfferings = new Offerings(null, S.h());
    }

    public static /* synthetic */ void a(Qa.a aVar) {
        dispatch$lambda$6(aVar);
    }

    public static final /* synthetic */ void access$createAndCacheOfferings(OfferingsManager offeringsManager, JSONObject jSONObject, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z, l lVar, l lVar2) {
        offeringsManager.createAndCacheOfferings(jSONObject, hTTPResponseOriginalSource, z, lVar, lVar2);
    }

    public static final /* synthetic */ void access$dispatch(OfferingsManager offeringsManager, Qa.a aVar) {
        offeringsManager.dispatch(aVar);
    }

    public static final /* synthetic */ Offerings access$getEmptyOfferings$p(OfferingsManager offeringsManager) {
        return offeringsManager.emptyOfferings;
    }

    public static final /* synthetic */ OfferingFontPreDownloader access$getOfferingFontPreDownloader$p(OfferingsManager offeringsManager) {
        return offeringsManager.offeringFontPreDownloader;
    }

    public static final /* synthetic */ OfferingImagePreDownloader access$getOfferingImagePreDownloader$p(OfferingsManager offeringsManager) {
        return offeringsManager.offeringImagePreDownloader;
    }

    public static final /* synthetic */ OfferingsCache access$getOfferingsCache$p(OfferingsManager offeringsManager) {
        return offeringsManager.offeringsCache;
    }

    public static final /* synthetic */ void access$handleErrorFetchingOfferings(OfferingsManager offeringsManager, PurchasesError purchasesError, l lVar) {
        offeringsManager.handleErrorFetchingOfferings(purchasesError, lVar);
    }

    public static final /* synthetic */ void access$trackGetOfferingsResultIfNeeded(OfferingsManager offeringsManager, Date date, DiagnosticsTracker.CacheStatus cacheStatus, PurchasesError purchasesError, Set set, Set set2) {
        offeringsManager.trackGetOfferingsResultIfNeeded(date, cacheStatus, purchasesError, set, set2);
    }

    private final void createAndCacheOfferings(JSONObject jSONObject, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z, l lVar, l lVar2) {
        this.offeringsFactory.createOfferings(jSONObject, hTTPResponseOriginalSource, z, new 1(lVar), new 2(jSONObject, lVar2));
    }

    public static /* synthetic */ void createAndCacheOfferings$default(OfferingsManager offeringsManager, JSONObject jSONObject, HTTPResponseOriginalSource hTTPResponseOriginalSource, boolean z, l lVar, l lVar2, int i, Object obj) {
        offeringsManager.createAndCacheOfferings(jSONObject, hTTPResponseOriginalSource, z, (i & 8) != 0 ? null : lVar, (i & 16) != 0 ? null : lVar2);
    }

    private final q createTrackedOfferingsCallbacks(Date date, l lVar, l lVar2) {
        return new q(new OfferingsManager$createTrackedOfferingsCallbacks$onErrorWithTracking$1(this, date, lVar), new OfferingsManager$createTrackedOfferingsCallbacks$onSuccessWithTracking$1(this, date, lVar2));
    }

    private final void dispatch(Qa.a aVar) {
        if (t.c(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            aVar.invoke();
            return;
        }
        Handler handler = this.mainHandler;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.post(new c(aVar));
    }

    private static final void dispatch$lambda$6(Qa.a aVar) {
        aVar.invoke();
    }

    public static /* synthetic */ void fetchAndCacheOfferings$default(OfferingsManager offeringsManager, String str, boolean z, l lVar, l lVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        if ((i & 8) != 0) {
            lVar2 = null;
        }
        offeringsManager.fetchAndCacheOfferings(str, z, lVar, lVar2);
    }

    private final void fetchOfferingsFromNetwork(String str, boolean z, DiagnosticsTracker.CacheStatus cacheStatus, p pVar, p pVar2) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1 offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1 = new OfferingsManager$fetchOfferingsFromNetwork$$inlined$log$1(logIntent, cacheStatus);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchOfferingsFromNetwork$$inlined$log$1.invoke(), null);
                break;
        }
        fetchAndCacheOfferings(str, z, new 2(pVar, cacheStatus), new 3(pVar2, cacheStatus));
    }

    public static /* synthetic */ void getOfferings$default(OfferingsManager offeringsManager, String str, boolean z, l lVar, l lVar2, boolean z2, int i, Object obj) {
        l lVar3 = (i & 4) != 0 ? null : lVar;
        l lVar4 = (i & 8) != 0 ? null : lVar2;
        if ((i & 16) != 0) {
            z2 = false;
        }
        offeringsManager.getOfferings(str, z, lVar3, lVar4, z2);
    }

    private final void handleErrorFetchingOfferings(PurchasesError purchasesError, l lVar) {
        LogHandler currentLogHandler;
        String str;
        String str2;
        LogIntent logIntent = Y.e(new PurchasesErrorCode[]{PurchasesErrorCode.ConfigurationError, PurchasesErrorCode.UnexpectedBackendResponseError}).contains(purchasesError.getCode()) ? LogIntent.RC_ERROR : LogIntent.GOOGLE_ERROR;
        OfferingsManager$handleErrorFetchingOfferings$$inlined$log$1 offeringsManager$handleErrorFetchingOfferings$$inlined$log$1 = new OfferingsManager$handleErrorFetchingOfferings$$inlined$log$1(logIntent, purchasesError);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str = "[Purchases] - " + logLevel.name();
                    str2 = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str = "[Purchases] - " + logLevel4.name();
                    str2 = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str = "[Purchases] - " + logLevel6.name();
                    str2 = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str = "[Purchases] - " + logLevel7.name();
                    str2 = (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str, str2);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$handleErrorFetchingOfferings$$inlined$log$1.invoke(), null);
                break;
        }
        this.offeringsCache.forceCacheStale();
        dispatch(new 2(lVar, purchasesError));
    }

    private final void trackGetOfferingsResultIfNeeded(Date date, DiagnosticsTracker.CacheStatus cacheStatus, PurchasesError purchasesError, Set set, Set set2) {
        PurchasesErrorCode code;
        if (this.diagnosticsTrackerIfEnabled == null) {
            return;
        }
        long between = DurationExtensionsKt.between(ab.b.b, date, this.dateProvider.getNow());
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        Integer num = null;
        String message = purchasesError != null ? purchasesError.getMessage() : null;
        if (purchasesError != null && (code = purchasesError.getCode()) != null) {
            num = Integer.valueOf(code.getCode());
        }
        diagnosticsTracker.trackGetOfferingsResult-B8UsjHI(set, set2, message, num, null, cacheStatus, between);
    }

    private final void trackGetOfferingsStartedIfNeeded() {
        DiagnosticsTracker diagnosticsTracker = this.diagnosticsTrackerIfEnabled;
        if (diagnosticsTracker != null) {
            diagnosticsTracker.trackGetOfferingsStarted();
        }
    }

    private final void vendCachedOfferingsAndMaybeRefresh(String str, boolean z, Offerings offerings, Date date, l lVar) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        LogIntent logIntent = LogIntent.DEBUG;
        OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1 offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1 = new OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1(logIntent);
        int[] iArr = LogWrapperKt.WhenMappings.$EnumSwitchMapping$0;
        switch (iArr[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$1.invoke(), null);
                break;
        }
        boolean isOfferingsCacheStale = this.offeringsCache.isOfferingsCacheStale(z);
        trackGetOfferingsResultIfNeeded(date, isOfferingsCacheStale ? DiagnosticsTracker.CacheStatus.STALE : DiagnosticsTracker.CacheStatus.VALID, null, null, null);
        dispatch(new 2(lVar, offerings));
        if (isOfferingsCacheStale) {
            OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2 offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2 = new OfferingsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2(logIntent, z);
            switch (iArr[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel11 = LogLevel.DEBUG;
                    LogHandler currentLogHandler8 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel11) <= 0) {
                        currentLogHandler8.d("[Purchases] - " + logLevel11.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel12 = LogLevel.WARN;
                    LogHandler currentLogHandler9 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel12) <= 0) {
                        currentLogHandler9.w("[Purchases] - " + logLevel12.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel13 = LogLevel.INFO;
                    LogHandler currentLogHandler10 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel13) <= 0) {
                        currentLogHandler10.i("[Purchases] - " + logLevel13.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel14 = LogLevel.DEBUG;
                    LogHandler currentLogHandler11 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel14) <= 0) {
                        currentLogHandler11.d("[Purchases] - " + logLevel14.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel15 = LogLevel.INFO;
                    LogHandler currentLogHandler12 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel15) <= 0) {
                        currentLogHandler12.i("[Purchases] - " + logLevel15.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel16 = LogLevel.DEBUG;
                    LogHandler currentLogHandler13 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel16) <= 0) {
                        currentLogHandler13.d("[Purchases] - " + logLevel16.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel17 = LogLevel.DEBUG;
                    LogHandler currentLogHandler14 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel17) <= 0) {
                        currentLogHandler14.d("[Purchases] - " + logLevel17.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel18 = LogLevel.WARN;
                    LogHandler currentLogHandler15 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel18) <= 0) {
                        currentLogHandler15.w("[Purchases] - " + logLevel18.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel19 = LogLevel.WARN;
                    LogHandler currentLogHandler16 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel19) <= 0) {
                        currentLogHandler16.w("[Purchases] - " + logLevel19.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel20 = LogLevel.WARN;
                    LogHandler currentLogHandler17 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel20) <= 0) {
                        currentLogHandler17.w("[Purchases] - " + logLevel20.name(), (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$vendCachedOfferingsAndMaybeRefresh$$inlined$log$2.invoke(), null);
                    break;
            }
            fetchAndCacheOfferings$default(this, str, z, null, null, 12, null);
        }
    }

    public final void clearInMemoryOfferingsCache() {
        this.offeringsCache.clearInMemoryOfferingsCache();
    }

    public final void fetchAndCacheOfferings(String str, boolean z, l lVar, l lVar2) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(str, "appUserID");
        if (this.uiPreviewMode) {
            dispatch(new 1(lVar2, this));
            return;
        }
        LogIntent logIntent = LogIntent.RC_SUCCESS;
        OfferingsManager$fetchAndCacheOfferings$$inlined$log$1 offeringsManager$fetchAndCacheOfferings$$inlined$log$1 = new OfferingsManager$fetchAndCacheOfferings$$inlined$log$1(logIntent);
        switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
            case 1:
                LogLevel logLevel = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    str2 = "[Purchases] - " + logLevel.name();
                    str3 = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 2:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 3:
                LogLevel logLevel2 = LogLevel.WARN;
                LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 4:
                LogLevel logLevel3 = LogLevel.INFO;
                LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                    currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 5:
                LogLevel logLevel4 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                    str2 = "[Purchases] - " + logLevel4.name();
                    str3 = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 6:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 7:
                LogLevel logLevel5 = LogLevel.INFO;
                LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                    currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 8:
                LogLevel logLevel6 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                    str2 = "[Purchases] - " + logLevel6.name();
                    str3 = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 9:
                LogLevel logLevel7 = LogLevel.DEBUG;
                currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                    str2 = "[Purchases] - " + logLevel7.name();
                    str3 = (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke();
                    currentLogHandler.d(str2, str3);
                    break;
                }
                break;
            case 10:
                LogLevel logLevel8 = LogLevel.WARN;
                LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                    currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 11:
                LogLevel logLevel9 = LogLevel.WARN;
                LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                    currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 12:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
            case 13:
                LogLevel logLevel10 = LogLevel.WARN;
                LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                    currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke());
                    break;
                }
                break;
            case 14:
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$fetchAndCacheOfferings$$inlined$log$1.invoke(), null);
                break;
        }
        this.backend.getOfferings(str, z, new 3(lVar, lVar2), new 4(lVar, lVar2));
    }

    public final String getCachedCurrentOfferingIdentifier() {
        Offering current;
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (cachedOfferings == null || (current = cachedOfferings.getCurrent()) == null) {
            return null;
        }
        return current.getIdentifier();
    }

    public final void getOfferings(String str, boolean z, l lVar, l lVar2, boolean z2) {
        t.g(str, "appUserID");
        if (this.uiPreviewMode) {
            dispatch(new 1(lVar2, this));
            return;
        }
        trackGetOfferingsStartedIfNeeded();
        Date now = this.dateProvider.getNow();
        q createTrackedOfferingsCallbacks = createTrackedOfferingsCallbacks(now, lVar, lVar2);
        p pVar = (p) createTrackedOfferingsCallbacks.a();
        p pVar2 = (p) createTrackedOfferingsCallbacks.b();
        Offerings cachedOfferings = this.offeringsCache.getCachedOfferings();
        if (z2) {
            fetchOfferingsFromNetwork(str, z, DiagnosticsTracker.CacheStatus.NOT_CHECKED, pVar, pVar2);
        } else if (cachedOfferings == null) {
            fetchOfferingsFromNetwork(str, z, DiagnosticsTracker.CacheStatus.NOT_FOUND, pVar, pVar2);
        } else {
            vendCachedOfferingsAndMaybeRefresh(str, z, cachedOfferings, now, lVar2);
        }
    }

    public final void onAppForeground(String str) {
        LogHandler currentLogHandler;
        String str2;
        String str3;
        t.g(str, "appUserID");
        if (!this.uiPreviewMode && this.offeringsCache.isOfferingsCacheStale(false)) {
            LogIntent logIntent = LogIntent.DEBUG;
            OfferingsManager$onAppForeground$$inlined$log$1 offeringsManager$onAppForeground$$inlined$log$1 = new OfferingsManager$onAppForeground$$inlined$log$1(logIntent);
            switch (LogWrapperKt.WhenMappings.$EnumSwitchMapping$0[logIntent.ordinal()]) {
                case 1:
                    LogLevel logLevel = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        str2 = "[Purchases] - " + logLevel.name();
                        str3 = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 2:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 3:
                    LogLevel logLevel2 = LogLevel.WARN;
                    LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                        currentLogHandler2.w("[Purchases] - " + logLevel2.name(), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 4:
                    LogLevel logLevel3 = LogLevel.INFO;
                    LogHandler currentLogHandler3 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel3) <= 0) {
                        currentLogHandler3.i("[Purchases] - " + logLevel3.name(), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 5:
                    LogLevel logLevel4 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel4) <= 0) {
                        str2 = "[Purchases] - " + logLevel4.name();
                        str3 = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 6:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 7:
                    LogLevel logLevel5 = LogLevel.INFO;
                    LogHandler currentLogHandler4 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel5) <= 0) {
                        currentLogHandler4.i("[Purchases] - " + logLevel5.name(), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 8:
                    LogLevel logLevel6 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel6) <= 0) {
                        str2 = "[Purchases] - " + logLevel6.name();
                        str3 = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 9:
                    LogLevel logLevel7 = LogLevel.DEBUG;
                    currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel7) <= 0) {
                        str2 = "[Purchases] - " + logLevel7.name();
                        str3 = (String) offeringsManager$onAppForeground$$inlined$log$1.invoke();
                        currentLogHandler.d(str2, str3);
                        break;
                    }
                    break;
                case 10:
                    LogLevel logLevel8 = LogLevel.WARN;
                    LogHandler currentLogHandler5 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel8) <= 0) {
                        currentLogHandler5.w("[Purchases] - " + logLevel8.name(), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 11:
                    LogLevel logLevel9 = LogLevel.WARN;
                    LogHandler currentLogHandler6 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel9) <= 0) {
                        currentLogHandler6.w("[Purchases] - " + logLevel9.name(), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 12:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
                case 13:
                    LogLevel logLevel10 = LogLevel.WARN;
                    LogHandler currentLogHandler7 = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel10) <= 0) {
                        currentLogHandler7.w("[Purchases] - " + logLevel10.name(), (String) offeringsManager$onAppForeground$$inlined$log$1.invoke());
                        break;
                    }
                    break;
                case 14:
                    LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", (String) offeringsManager$onAppForeground$$inlined$log$1.invoke(), null);
                    break;
            }
            fetchAndCacheOfferings$default(this, str, false, null, null, 12, null);
        }
    }

    public /* synthetic */ OfferingsManager(OfferingsCache offeringsCache, Backend backend, OfferingsFactory offeringsFactory, OfferingImagePreDownloader offeringImagePreDownloader, DiagnosticsTracker diagnosticsTracker, OfferingFontPreDownloader offeringFontPreDownloader, boolean z, DateProvider dateProvider, Handler handler, int i, k kVar) {
        this(offeringsCache, backend, offeringsFactory, offeringImagePreDownloader, diagnosticsTracker, offeringFontPreDownloader, (i & 64) != 0 ? false : z, (i & 128) != 0 ? new DefaultDateProvider() : dateProvider, (i & 256) != 0 ? new Handler(Looper.getMainLooper()) : handler);
    }
}
