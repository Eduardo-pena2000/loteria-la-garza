package com.amazon.device.iap.internal.a.a;

import com.amazon.a.a.n.a.h;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
abstract class a extends h {
    protected static final String b = "getItem_data";
    protected final Set c;

    public a(com.amazon.device.iap.internal.a.c cVar, String str, Set set) {
        super(cVar, "getItem_data", str, cVar.d().toString(), "2.10.5.0");
        this.c = set;
        a("skus", set);
    }
}
