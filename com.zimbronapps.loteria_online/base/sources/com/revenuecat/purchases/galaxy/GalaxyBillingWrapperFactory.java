package com.revenuecat.purchases.galaxy;

import android.content.Context;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.caching.DeviceCache;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class GalaxyBillingWrapperFactory {
    public static final GalaxyBillingWrapperFactory INSTANCE = new GalaxyBillingWrapperFactory();

    private GalaxyBillingWrapperFactory() {
    }

    public final BillingAbstract createGalaxyBillingWrapper(PurchasesStateProvider purchasesStateProvider, Context context, GalaxyBillingMode galaxyBillingMode, DeviceCache deviceCache) {
        t.g(purchasesStateProvider, "stateProvider");
        t.g(context, "context");
        t.g(galaxyBillingMode, "billingMode");
        t.g(deviceCache, "deviceCache");
        try {
            Object newInstance = Class.forName("com.revenuecat.purchases.galaxy.GalaxyBillingWrapper").getDeclaredConstructor(new Class[]{PurchasesStateProvider.class, Context.class, GalaxyBillingMode.class, DeviceCache.class}).newInstance(new Object[]{purchasesStateProvider, context, galaxyBillingMode, deviceCache});
            t.e(newInstance, "null cannot be cast to non-null type com.revenuecat.purchases.common.BillingAbstract");
            return (BillingAbstract) newInstance;
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException("Failed to create GalaxyBillingWrapper", e);
        } catch (NoSuchMethodException e2) {
            throw new IllegalStateException("Failed to find GalaxyBillingWrapper constructor. Please ensure that you've declared a dependency on the purchases-galaxy module.", e2);
        } catch (ClassNotFoundException e3) {
            NoClassDefFoundError noClassDefFoundError = new NoClassDefFoundError(e3.getMessage());
            noClassDefFoundError.initCause(e3);
            throw noClassDefFoundError;
        }
    }
}
