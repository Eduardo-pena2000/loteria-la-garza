package com.applovin.impl.sdk;

import com.applovin.impl.g7;
import com.applovin.impl.sdk.a;
import com.applovin.impl.t1;
import com.applovin.impl.x4;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class b {
    private final k a;
    private final WeakReference b;
    private final WeakReference c;
    private g7 d;

    private b(t1 t1Var, a.a aVar, k kVar) {
        this.b = new WeakReference(t1Var);
        this.c = new WeakReference(aVar);
        this.a = kVar;
    }

    public static /* synthetic */ void a(b bVar) {
        bVar.c();
    }

    private /* synthetic */ void c() {
        d();
        this.a.f().a(this);
    }

    public t1 b() {
        return (t1) this.b.get();
    }

    public void d() {
        a();
        t1 b = b();
        if (b == null) {
            return;
        }
        b.setExpired();
        a.a aVar = (a.a) this.c.get();
        if (aVar == null) {
            return;
        }
        aVar.onAdExpired(b);
    }

    public static b a(t1 t1Var, a.a aVar, k kVar) {
        b bVar = new b(t1Var, aVar, kVar);
        bVar.a(t1Var.getTimeToLiveMillis());
        return bVar;
    }

    public void a(long j) {
        a();
        if (((Boolean) this.a.a(x4.b1)).booleanValue() || !this.a.m0().isApplicationPaused()) {
            this.d = g7.a(j, this.a, new z(this));
        }
    }

    public void a() {
        g7 g7Var = this.d;
        if (g7Var != null) {
            g7Var.a();
            this.d = null;
        }
    }
}
