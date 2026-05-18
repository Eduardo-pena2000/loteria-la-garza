package com.revenuecat.purchases.common.offlineentitlements;

import Ca.I;
import Ca.q;
import Ca.x;
import Da.D;
import Da.v;
import Qa.l;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.common.AppConfig;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class OfflineEntitlementsManager {
    private CustomerInfo _offlineCustomerInfo;
    private final AppConfig appConfig;
    private final Backend backend;
    private final DeviceCache deviceCache;
    private final DiagnosticsTracker diagnosticsTracker;
    private final OfflineCustomerInfoCalculator offlineCustomerInfoCalculator;
    private final Map offlineCustomerInfoCallbackCache;

    public static final class 2 extends u implements l {
        final /* synthetic */ String $appUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(String str) {
            super(1);
            this.$appUserId = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CustomerInfo) obj);
            return I.a;
        }

        public final void invoke(CustomerInfo customerInfo) {
            t.g(customerInfo, "customerInfo");
            OfflineEntitlementsManager offlineEntitlementsManager = OfflineEntitlementsManager.this;
            String str = this.$appUserId;
            synchronized (offlineEntitlementsManager) {
                try {
                    LogLevel logLevel = LogLevel.WARN;
                    LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                    if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                        currentLogHandler.w("[Purchases] - " + logLevel.name(), "Using offline computed customer info. In this state EntitlementInfo's isSandbox will always be false. Additionally, the expiration date may be inaccurate. Once the transactions are synced with our backend, these values will be automatically corrected.");
                    }
                    DiagnosticsTracker access$getDiagnosticsTracker$p = OfflineEntitlementsManager.access$getDiagnosticsTracker$p(offlineEntitlementsManager);
                    if (access$getDiagnosticsTracker$p != null) {
                        access$getDiagnosticsTracker$p.trackEnteredOfflineEntitlementsMode();
                    }
                    OfflineEntitlementsManager.access$set_offlineCustomerInfo$p(offlineEntitlementsManager, customerInfo);
                    String cachedAppUserID$purchases_defaultsBc8Release = OfflineEntitlementsManager.access$getDeviceCache$p(offlineEntitlementsManager).getCachedAppUserID$purchases_defaultsBc8Release();
                    if (cachedAppUserID$purchases_defaultsBc8Release != null) {
                        OfflineEntitlementsManager.access$getDeviceCache$p(offlineEntitlementsManager).clearCustomerInfoCache$purchases_defaultsBc8Release(cachedAppUserID$purchases_defaultsBc8Release);
                    }
                    List list = (List) OfflineEntitlementsManager.access$getOfflineCustomerInfoCallbackCache$p(offlineEntitlementsManager).remove(str);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((l) ((q) it.next()).a()).invoke(customerInfo);
                        }
                    }
                    I i = I.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class 3 extends u implements l {
        final /* synthetic */ String $appUserId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(String str) {
            super(1);
            this.$appUserId = str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "it");
            OfflineEntitlementsManager offlineEntitlementsManager = OfflineEntitlementsManager.this;
            String str = this.$appUserId;
            synchronized (offlineEntitlementsManager) {
                try {
                    List list = (List) OfflineEntitlementsManager.access$getOfflineCustomerInfoCallbackCache$p(offlineEntitlementsManager).remove(str);
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((l) ((q) it.next()).b()).invoke(purchasesError);
                        }
                    }
                    I i = I.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final class 2 extends u implements l {
        final /* synthetic */ l $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 2(l lVar) {
            super(1);
            this.$completion = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ProductEntitlementMapping) obj);
            return I.a;
        }

        public final void invoke(ProductEntitlementMapping productEntitlementMapping) {
            t.g(productEntitlementMapping, "productEntitlementMapping");
            OfflineEntitlementsManager.access$getDeviceCache$p(OfflineEntitlementsManager.this).cacheProductEntitlementMapping$purchases_defaultsBc8Release(productEntitlementMapping);
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                currentLogHandler.d("[Purchases] - " + logLevel.name(), "Successfully updated product entitlement mappings.");
            }
            l lVar = this.$completion;
            if (lVar != null) {
                lVar.invoke((Object) null);
            }
        }
    }

    public static final class 3 extends u implements l {
        final /* synthetic */ l $completion;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public 3(l lVar) {
            super(1);
            this.$completion = lVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return I.a;
        }

        public final void invoke(PurchasesError purchasesError) {
            t.g(purchasesError, "e");
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            String format = String.format("Error updating product entitlement mappings. Error: %s.", Arrays.copyOf(new Object[]{purchasesError}, 1));
            t.f(format, "format(...)");
            currentLogHandler.e("[Purchases] - ERROR", format, null);
            l lVar = this.$completion;
            if (lVar != null) {
                lVar.invoke(purchasesError);
            }
        }
    }

    public OfflineEntitlementsManager(Backend backend, OfflineCustomerInfoCalculator offlineCustomerInfoCalculator, DeviceCache deviceCache, AppConfig appConfig, DiagnosticsTracker diagnosticsTracker) {
        t.g(backend, "backend");
        t.g(offlineCustomerInfoCalculator, "offlineCustomerInfoCalculator");
        t.g(deviceCache, "deviceCache");
        t.g(appConfig, "appConfig");
        this.backend = backend;
        this.offlineCustomerInfoCalculator = offlineCustomerInfoCalculator;
        this.deviceCache = deviceCache;
        this.appConfig = appConfig;
        this.diagnosticsTracker = diagnosticsTracker;
        this.offlineCustomerInfoCallbackCache = new LinkedHashMap();
    }

    public static final /* synthetic */ DeviceCache access$getDeviceCache$p(OfflineEntitlementsManager offlineEntitlementsManager) {
        return offlineEntitlementsManager.deviceCache;
    }

    public static final /* synthetic */ DiagnosticsTracker access$getDiagnosticsTracker$p(OfflineEntitlementsManager offlineEntitlementsManager) {
        return offlineEntitlementsManager.diagnosticsTracker;
    }

    public static final /* synthetic */ Map access$getOfflineCustomerInfoCallbackCache$p(OfflineEntitlementsManager offlineEntitlementsManager) {
        return offlineEntitlementsManager.offlineCustomerInfoCallbackCache;
    }

    public static final /* synthetic */ void access$set_offlineCustomerInfo$p(OfflineEntitlementsManager offlineEntitlementsManager, CustomerInfo customerInfo) {
        offlineEntitlementsManager._offlineCustomerInfo = customerInfo;
    }

    private final boolean isOfflineEntitlementsEnabled() {
        return this.appConfig.getFinishTransactions() && this.appConfig.getEnableOfflineEntitlements() && !this.appConfig.getCustomEntitlementComputation() && this.appConfig.getStore() != Store.TEST_STORE;
    }

    public static /* synthetic */ void updateProductEntitlementMappingCacheIfStale$default(OfflineEntitlementsManager offlineEntitlementsManager, l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = null;
        }
        offlineEntitlementsManager.updateProductEntitlementMappingCacheIfStale(lVar);
    }

    public final void calculateAndCacheOfflineCustomerInfo(String str, l lVar, l lVar2) {
        t.g(str, "appUserId");
        t.g(lVar, "onSuccess");
        t.g(lVar2, "onError");
        if (!this.appConfig.getEnableOfflineEntitlements()) {
            lVar2.invoke(new PurchasesError(PurchasesErrorCode.UnsupportedError, "Offline entitlements not enabled in this version."));
            return;
        }
        synchronized (this) {
            try {
                boolean containsKey = this.offlineCustomerInfoCallbackCache.containsKey(str);
                List list = (List) this.offlineCustomerInfoCallbackCache.get(str);
                if (list == null) {
                    list = v.n();
                }
                this.offlineCustomerInfoCallbackCache.put(str, D.v0(list, Da.u.e(x.a(lVar, lVar2))));
                if (!containsKey) {
                    I i = I.a;
                    this.offlineCustomerInfoCalculator.computeOfflineCustomerInfo(str, new 2(str), new 3(str));
                    return;
                }
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    String str2 = "[Purchases] - " + logLevel.name();
                    String format = String.format("Already calculating offline customer info for %s.", Arrays.copyOf(new Object[]{str}, 1));
                    t.f(format, "format(...)");
                    currentLogHandler.d(str2, format);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final CustomerInfo getOfflineCustomerInfo() {
        return this._offlineCustomerInfo;
    }

    public final synchronized void resetOfflineCustomerInfoCache() {
        try {
            if (this._offlineCustomerInfo != null) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d("[Purchases] - " + logLevel.name(), "Resetting offline customer info cache.");
                }
                this._offlineCustomerInfo = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean shouldCalculateOfflineCustomerInfoInGetCustomerInfoRequest(boolean z, String str) {
        t.g(str, "appUserId");
        return z && isOfflineEntitlementsEnabled() && this.deviceCache.getCachedCustomerInfo$purchases_defaultsBc8Release(str) == null;
    }

    public final boolean shouldCalculateOfflineCustomerInfoInPostReceipt(boolean z) {
        return z && isOfflineEntitlementsEnabled();
    }

    public final void updateProductEntitlementMappingCacheIfStale(l lVar) {
        if (!isOfflineEntitlementsEnabled() || !this.deviceCache.isProductEntitlementMappingCacheStale$purchases_defaultsBc8Release()) {
            if (lVar != null) {
                lVar.invoke((Object) null);
                return;
            }
            return;
        }
        LogLevel logLevel = LogLevel.DEBUG;
        LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
            currentLogHandler.d("[Purchases] - " + logLevel.name(), "Product entitlement mappings are stale. Updating.");
        }
        this.backend.getProductEntitlementMapping(new 2(lVar), new 3(lVar));
    }
}
