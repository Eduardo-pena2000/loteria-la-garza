package com.amazon.device.iap.internal.a.b;

import com.amazon.a.a.n.a.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
abstract class b extends h {
    protected static final String b = "purchase_updates";
    protected final boolean c;

    public b(com.amazon.device.iap.internal.a.c cVar, String str, boolean z) {
        super(cVar, "purchase_updates", str, cVar.d().toString(), "2.10.5.0");
        this.c = z;
    }

    public void e() throws com.amazon.a.a.d.b {
        super.e();
        a("cursor", this.c ? null : com.amazon.device.iap.internal.util.a.a((String) ((com.amazon.device.iap.internal.a.c) j()).a().a("userId")));
        a("enablePendingPurchases", Boolean.valueOf(com.amazon.device.iap.internal.d.f().d()));
    }
}
