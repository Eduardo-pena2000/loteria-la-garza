package com.unity3d.services.store.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.store.gpbl.StoreBilling;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StoreLifecycleListener implements Application.ActivityLifecycleCallbacks {
    private final ArrayList _purchaseTypes;
    private final StoreBilling _storeBilling;
    private final StoreEventListener _storeEventListener;

    public StoreLifecycleListener(ArrayList _purchaseTypes, StoreBilling _storeBilling, StoreEventListener _storeEventListener) {
        t.g(_purchaseTypes, "_purchaseTypes");
        t.g(_storeBilling, "_storeBilling");
        t.g(_storeEventListener, "_storeEventListener");
        this._purchaseTypes = _purchaseTypes;
        this._storeBilling = _storeBilling;
        this._storeEventListener = _storeEventListener;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        t.g(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        t.g(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        t.g(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        t.g(activity, "activity");
        try {
            Iterator it = this._purchaseTypes.iterator();
            while (it.hasNext()) {
                this._storeBilling.getPurchases((String) it.next(), this._storeEventListener);
            }
        } catch (ClassNotFoundException e) {
            DeviceLog.warning("Couldn't fetch purchases onActivityResumed. " + e.getMessage());
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        t.g(activity, "activity");
        t.g(outState, "outState");
    }

    public void onActivityStarted(Activity activity) {
        t.g(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        t.g(activity, "activity");
    }
}
