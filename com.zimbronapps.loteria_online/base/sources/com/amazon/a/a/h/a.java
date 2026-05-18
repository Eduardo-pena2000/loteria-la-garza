package com.amazon.a.a.h;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a implements Serializable {
    public static final String a = "name";
    public static final String b = "time";
    private static final long c = 1;
    private final Map d;

    public a(String str) {
        HashMap hashMap = new HashMap();
        this.d = hashMap;
        hashMap.put("name", str);
        hashMap.put("time", String.valueOf(System.currentTimeMillis()));
    }

    public a a(String str, String str2) {
        this.d.put(str, str2);
        return this;
    }

    public String toString() {
        return "Metric: [" + this.d.toString() + "]";
    }

    public Map a() {
        return this.d;
    }
}
