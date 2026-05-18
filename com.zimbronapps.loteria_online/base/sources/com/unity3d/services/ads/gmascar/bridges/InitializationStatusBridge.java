package com.unity3d.services.ads.gmascar.bridges;

import com.unity3d.services.core.reflection.GenericBridge;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class InitializationStatusBridge extends GenericBridge {
    private static final String adapterStatusMapMethodName = "getAdapterStatusMap";

    public class 1 extends HashMap {
        public 1() {
            put("getAdapterStatusMap", new Class[0]);
        }
    }

    public InitializationStatusBridge() {
        super(new 1());
    }

    public Map getAdapterStatusMap(Object obj) {
        return (Map) callNonVoidMethod("getAdapterStatusMap", obj, new Object[0]);
    }

    public String getClassName() {
        return "com.google.android.gms.ads.initialization.InitializationStatus";
    }
}
