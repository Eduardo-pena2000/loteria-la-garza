package com.unity3d.services.store;

import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.store.core.StoreExceptionHandler;
import com.unity3d.services.store.core.StoreLifecycleListener;
import com.unity3d.services.store.gpbl.StoreBilling;
import com.unity3d.services.store.gpbl.listeners.BillingInitializationListener;
import com.unity3d.services.store.gpbl.listeners.FeatureSupportedListener;
import com.unity3d.services.store.gpbl.listeners.PurchaseHistoryResponseListener;
import com.unity3d.services.store.gpbl.listeners.PurchasesResponseListener;
import com.unity3d.services.store.gpbl.listeners.SkuDetailsResponseListener;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import fb.P;
import fb.z;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StoreMonitor {
    private final z _isInitialized;
    private StoreBilling storeBilling;
    private final StoreExceptionHandler storeExceptionHandler;
    private StoreLifecycleListener storeLifecycleListener;

    public StoreMonitor(StoreExceptionHandler storeExceptionHandler) {
        t.g(storeExceptionHandler, "storeExceptionHandler");
        this.storeExceptionHandler = storeExceptionHandler;
        this._isInitialized = P.a(Boolean.FALSE);
    }

    public final void getPurchaseHistory(int i, String str, int i2, PurchaseHistoryResponseListener purchaseHistoryResponseListener) {
        t.g(purchaseHistoryResponseListener, "purchaseHistoryResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                storeBilling.getPurchaseHistory(str, i2, purchaseHistoryResponseListener);
            }
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASE_HISTORY_LIST_REQUEST_ERROR, i, e);
        }
    }

    public final void getPurchases(int i, String str, PurchasesResponseListener purchasesResponseListener) {
        t.g(purchasesResponseListener, "purchasesResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (storeBilling != null) {
                storeBilling.getPurchases(str, purchasesResponseListener);
            }
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.PURCHASES_REQUEST_ERROR, i, e);
        }
    }

    public final void getSkuDetails(int i, String str, List list, SkuDetailsResponseListener skuDetailsResponseListener) {
        t.g(skuDetailsResponseListener, "skuDetailsResponseListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            if (storeBilling != null) {
                storeBilling.getSkuDetails(str, list, skuDetailsResponseListener);
            }
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.SKU_DETAILS_LIST_REQUEST_ERROR, i, e);
        }
    }

    public final void initialize(BillingInitializationListener billingInitializationListener) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        t.g(billingInitializationListener, "billingInitializationListener");
        if (isInitialized()) {
            billingInitializationListener.onIsAlreadyInitialized();
            return;
        }
        StoreBilling storeBilling = new StoreBilling(ClientProperties.getApplicationContext(), billingInitializationListener);
        this.storeBilling = storeBilling;
        storeBilling.initialize(billingInitializationListener);
        this._isInitialized.setValue(Boolean.TRUE);
    }

    public final int isFeatureSupported(int i, String str, FeatureSupportedListener featureSupportedListener) {
        t.g(featureSupportedListener, "featureSupportedListener");
        try {
            StoreBilling storeBilling = this.storeBilling;
            r0 = storeBilling != null ? storeBilling.isFeatureSupported(str) : -1;
            featureSupportedListener.onFeatureSupported(r0);
        } catch (Exception e) {
            this.storeExceptionHandler.handleStoreException(StoreEvent.IS_FEATURE_SUPPORTED_REQUEST_ERROR, i, e);
        }
        return r0;
    }

    public final boolean isInitialized() {
        return ((Boolean) this._isInitialized.getValue()).booleanValue();
    }

    public final void startPurchaseTracking(ArrayList purchaseTypes, StoreEventListener storeEventListener) {
        t.g(purchaseTypes, "purchaseTypes");
        t.g(storeEventListener, "storeEventListener");
        if (this.storeLifecycleListener != null) {
            stopPurchaseTracking();
        }
        StoreBilling storeBilling = this.storeBilling;
        t.d(storeBilling);
        this.storeLifecycleListener = new StoreLifecycleListener(purchaseTypes, storeBilling, storeEventListener);
        ClientProperties.getApplication().registerActivityLifecycleCallbacks(this.storeLifecycleListener);
    }

    public final void stopPurchaseTracking() {
        if (this.storeLifecycleListener != null) {
            ClientProperties.getApplication().unregisterActivityLifecycleCallbacks(this.storeLifecycleListener);
            this.storeLifecycleListener = null;
        }
    }
}
