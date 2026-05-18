package S5;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.zzfva;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n1 {
    public final String a;
    public final List b;
    public final Set c;
    public final Bundle d;
    public final String e;
    public final String f;
    public final int g;
    public final Set h;
    public final Bundle i;
    public final Set j;
    public final boolean k;
    public final String l;
    public final int m;
    public long n = 0;
    public long o;

    public n1(m1 m1Var, zzfva zzfvaVar) {
        this.o = 0L;
        this.a = m1Var.B();
        this.b = m1Var.C();
        this.c = Collections.unmodifiableSet(m1Var.v());
        this.d = m1Var.w();
        Collections.unmodifiableMap(m1Var.x());
        this.e = m1Var.D();
        this.f = m1Var.a();
        this.g = m1Var.b();
        this.h = Collections.unmodifiableSet(m1Var.y());
        this.i = m1Var.z();
        this.j = Collections.unmodifiableSet(m1Var.A());
        this.k = m1Var.c();
        this.l = m1Var.d();
        this.m = m1Var.e();
        this.o = m1Var.f();
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        return new ArrayList(this.b);
    }

    public final Set c() {
        return this.c;
    }

    public final Bundle d(Class cls) {
        return this.d.getBundle(cls.getName());
    }

    public final String e() {
        return this.e;
    }

    public final String f() {
        return this.f;
    }

    public final boolean g(Context context) {
        L5.y t = A1.f().t();
        B.a();
        Set set = this.h;
        String d = W5.g.d(context);
        return set.contains(d) || t.e().contains(d);
    }

    public final Bundle h() {
        return this.d;
    }

    public final int i() {
        return this.g;
    }

    public final Bundle j() {
        return this.i;
    }

    public final Set k() {
        return this.j;
    }

    public final boolean l() {
        return this.k;
    }

    public final String m() {
        return this.l;
    }

    public final int n() {
        return this.m;
    }

    public final void o(long j) {
        this.n = j;
    }

    public final long p() {
        return this.n;
    }

    public final long q() {
        return this.o;
    }
}
