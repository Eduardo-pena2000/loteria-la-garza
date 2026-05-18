package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e0 extends o7.d implements h.b, h.c {
    public static final a.a h = n7.d.c;
    public final Context a;
    public final Handler b;
    public final a.a c;
    public final Set d;
    public final com.google.android.gms.common.internal.f e;
    public n7.e f;
    public d0 g;

    public e0(Context context, Handler handler, com.google.android.gms.common.internal.f fVar) {
        a.a aVar = h;
        this.a = context;
        this.b = handler;
        this.e = (com.google.android.gms.common.internal.f) com.google.android.gms.common.internal.t.m(fVar, "ClientSettings must not be null");
        this.d = fVar.i();
        this.c = aVar;
    }

    public static /* bridge */ /* synthetic */ d0 q1(e0 e0Var) {
        return e0Var.g;
    }

    public static /* bridge */ /* synthetic */ void r1(e0 e0Var, o7.l lVar) {
        v6.b M1 = lVar.M1();
        if (M1.R1()) {
            com.google.android.gms.common.internal.U u = (com.google.android.gms.common.internal.U) com.google.android.gms.common.internal.t.l(lVar.N1());
            v6.b M12 = u.M1();
            if (!M12.R1()) {
                String valueOf = String.valueOf(M12);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                e0Var.g.a(M12);
                e0Var.f.disconnect();
                return;
            }
            e0Var.g.b(u.N1(), e0Var.d);
        } else {
            e0Var.g.a(M1);
        }
        e0Var.f.disconnect();
    }

    public final void O(o7.l lVar) {
        this.b.post(new c0(this, lVar));
    }

    public final void onConnected(Bundle bundle) {
        this.f.a(this);
    }

    public final void onConnectionFailed(v6.b bVar) {
        this.g.a(bVar);
    }

    public final void onConnectionSuspended(int i) {
        this.g.d(i);
    }

    public final void s1(d0 d0Var) {
        n7.e eVar = this.f;
        if (eVar != null) {
            eVar.disconnect();
        }
        this.e.n(Integer.valueOf(System.identityHashCode(this)));
        a.a aVar = this.c;
        Context context = this.a;
        Handler handler = this.b;
        com.google.android.gms.common.internal.f fVar = this.e;
        this.f = aVar.buildClient(context, handler.getLooper(), fVar, (Object) fVar.k(), (h.b) this, (h.c) this);
        this.g = d0Var;
        Set set = this.d;
        if (set == null || set.isEmpty()) {
            this.b.post(new b0(this));
        } else {
            this.f.b();
        }
    }

    public final void t1() {
        n7.e eVar = this.f;
        if (eVar != null) {
            eVar.disconnect();
        }
    }
}
