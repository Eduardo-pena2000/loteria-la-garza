package com.unity3d.services.ads.gmascar.bridges.mobileads;

import android.content.Context;
import com.unity3d.services.core.reflection.GenericBridge;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class MobileAdsBridgeBase extends GenericBridge implements IMobileAdsBridge {
    public static final String initializationStatusMethodName = "getInitializationStatus";
    public static final String initializeMethodName = "initialize";

    public MobileAdsBridgeBase(Map map) {
        super(map);
    }

    public String getClassName() {
        return "com.google.android.gms.ads.MobileAds";
    }

    public Object getInitializationStatus() {
        return callNonVoidMethod("getInitializationStatus", null, new Object[0]);
    }

    public String getVersionString() {
        Object callNonVoidMethod = callNonVoidMethod(getVersionMethodName(), null, new Object[0]);
        return callNonVoidMethod == null ? "0.0.0" : callNonVoidMethod.toString();
    }

    public abstract boolean hasSCARBiddingSupport();

    public void initialize(Context context, Object obj) {
        callVoidMethod("initialize", null, context, obj);
    }
}
