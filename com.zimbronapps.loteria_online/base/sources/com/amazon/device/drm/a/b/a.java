package com.amazon.device.drm.a.b;

import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements com.amazon.device.drm.a.b {
    private static final Map a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(com.amazon.device.drm.a.c.class, c.class);
    }

    public Class a(Class cls) {
        return (Class) a.get(cls);
    }
}
