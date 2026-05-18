package com.unity3d.services.ads.gmascar.bridges;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class AdapterStatusBridge extends GenericBridge {
    private static final String initializeStateMethodName = "getInitializationState";
    private Class _adapterStateClass;

    public class 1 extends HashMap {
        public 1() {
            put("getInitializationState", new Class[0]);
        }
    }

    public AdapterStatusBridge() {
        super(new 1());
        AdapterStatusStateBridge adapterStatusStateBridge = new AdapterStatusStateBridge();
        try {
            this._adapterStateClass = Class.forName(adapterStatusStateBridge.getClassName());
        } catch (ClassNotFoundException e) {
            DeviceLog.debug("ERROR: Could not find class %s %s", adapterStatusStateBridge.getClassName(), e.getLocalizedMessage());
        }
    }

    public Object[] getAdapterStatesEnum() {
        return this._adapterStateClass.getEnumConstants();
    }

    public String getClassName() {
        return "com.google.android.gms.ads.initialization.AdapterStatus";
    }

    public boolean isGMAInitialized(Object obj) {
        Object[] adapterStatesEnum = getAdapterStatesEnum();
        if (adapterStatesEnum != null) {
            return callNonVoidMethod("getInitializationState", obj, new Object[0]) == adapterStatesEnum[1];
        }
        DeviceLog.debug("ERROR: Could not get adapter states enum from AdapterStatus.State");
        return false;
    }
}
