package com.revenuecat.purchases;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.revenuecat.purchases.amazon.AmazonBilling;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.BackendHelper;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.galaxy.GalaxyBillingMode;
import com.revenuecat.purchases.galaxy.GalaxyBillingWrapperFactory;
import com.revenuecat.purchases.google.BillingWrapper;
import com.revenuecat.purchases.google.history.PurchaseHistoryManager;
import com.revenuecat.purchases.simulatedstore.SimulatedStoreBillingWrapper;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class BillingFactory {
    public static final BillingFactory INSTANCE = new BillingFactory();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Store.values().length];
            try {
                iArr[Store.TEST_STORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Store.PLAY_STORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Store.AMAZON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Store.GALAXY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BillingFactory() {
    }

    public final BillingAbstract createBilling(Store store, Application application, BackendHelper backendHelper, DeviceCache deviceCache, boolean z, DiagnosticsTracker diagnosticsTracker, PurchasesStateProvider purchasesStateProvider, boolean z2, GalaxyBillingMode galaxyBillingMode, Backend backend) {
        t.g(store, "store");
        t.g(application, "application");
        t.g(backendHelper, "backendHelper");
        t.g(deviceCache, "cache");
        t.g(purchasesStateProvider, "stateProvider");
        t.g(galaxyBillingMode, "galaxyBillingMode");
        t.g(backend, "backend");
        int i = WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i == 1) {
            return new SimulatedStoreBillingWrapper(deviceCache, new Handler(application.getMainLooper()), purchasesStateProvider, backend, null, 16, null);
        }
        if (i == 2) {
            return new BillingWrapper(new BillingWrapper.ClientFactory(application, z2), new Handler(application.getMainLooper()), deviceCache, diagnosticsTracker, purchasesStateProvider, new PurchaseHistoryManager(application), null, null, false, 448, null);
        }
        if (i == 3) {
            try {
                Context applicationContext = application.getApplicationContext();
                t.f(applicationContext, "application.applicationContext");
                return new AmazonBilling(applicationContext, deviceCache, z, new Handler(application.getMainLooper()), backendHelper, purchasesStateProvider, diagnosticsTracker);
            } catch (NoClassDefFoundError e) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Make sure purchases-amazon is added as dependency", e);
                throw e;
            }
        }
        if (i == 4) {
            try {
                GalaxyBillingWrapperFactory galaxyBillingWrapperFactory = GalaxyBillingWrapperFactory.INSTANCE;
                Context applicationContext2 = application.getApplicationContext();
                t.f(applicationContext2, "application.applicationContext");
                return galaxyBillingWrapperFactory.createGalaxyBillingWrapper(purchasesStateProvider, applicationContext2, galaxyBillingMode, deviceCache);
            } catch (NoClassDefFoundError e2) {
                LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Make sure purchases-galaxy is added as dependency", e2);
                throw e2;
            }
        }
        LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Incompatible store (" + store + ") used", null);
        throw new IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
    }
}
