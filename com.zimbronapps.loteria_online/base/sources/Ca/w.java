package ca;

import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class w {
    public final da.a a;

    public w(T9.a aVar) {
        this.a = new da.a(aVar, "flutter/system", da.e.a);
    }

    public void a() {
        Q9.b.f("SystemChannel", "Sending memory pressure warning to Flutter.");
        HashMap hashMap = new HashMap(1);
        hashMap.put("type", "memoryPressure");
        this.a.c(hashMap);
    }
}
