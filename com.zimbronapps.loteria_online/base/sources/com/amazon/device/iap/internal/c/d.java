package com.amazon.device.iap.internal.c;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements com.amazon.device.iap.internal.c {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(com.amazon.device.iap.internal.e.class, e.class);
    }

    public Class a(Class cls) {
        return (Class) a.get(cls);
    }
}
