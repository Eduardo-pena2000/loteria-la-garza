package com.applovin.impl.mediation.ads;

import com.applovin.mediation.MaxAdFormat;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ MaxAdFormat c;
    public final /* synthetic */ String d;
    public final /* synthetic */ com.applovin.impl.sdk.k e;
    public final /* synthetic */ String f;

    public /* synthetic */ w(String str, String str2, MaxAdFormat maxAdFormat, String str3, com.applovin.impl.sdk.k kVar, String str4) {
        this.a = str;
        this.b = str2;
        this.c = maxAdFormat;
        this.d = str3;
        this.e = kVar;
        this.f = str4;
    }

    public final void run() {
        a.b(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
