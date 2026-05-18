package com.unity3d.services.ads.offerwall;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements InvocationHandler {
    public final /* synthetic */ OfferwallAdapterBridge a;

    public /* synthetic */ a(OfferwallAdapterBridge offerwallAdapterBridge) {
        this.a = offerwallAdapterBridge;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return OfferwallAdapterBridge.a(this.a, obj, method, objArr);
    }
}
