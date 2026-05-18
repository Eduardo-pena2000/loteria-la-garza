package k7;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.android.gms.internal.measurement.zzkm;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class q3 implements V3 {
    public static volatile q3 E;
    public int A;
    public int B;
    public final long D;
    public final Context a;
    public final boolean b;
    public final f c;
    public final m d;
    public final Q2 e;
    public final C2 f;
    public final i3 g;
    public final w6 h;
    public final l7 i;
    public final v2 j;
    public final E6.f k;
    public final u5 l;
    public final b5 m;
    public final E0 n;
    public final g5 o;
    public final String p;
    public t2 q;
    public e6 r;
    public C s;
    public q2 t;
    public i5 u;
    public Boolean w;
    public long x;
    public volatile Boolean y;
    public volatile boolean z;
    public boolean v = false;
    public final AtomicInteger C = new AtomicInteger(0);

    public q3(h4 h4Var) {
        com.google.android.gms.common.internal.t.l(h4Var);
        Context context = h4Var.a;
        f fVar = new f(context);
        this.c = fVar;
        Y1.a = fVar;
        this.a = context;
        this.b = h4Var.e;
        this.y = h4Var.b;
        this.p = h4Var.g;
        this.z = true;
        zzkm.zzb(context);
        E6.f c = E6.i.c();
        this.k = c;
        Long l = h4Var.f;
        this.D = l != null ? l.longValue() : c.a();
        this.d = new m(this);
        Q2 q2 = new Q2(this);
        q2.m();
        this.e = q2;
        C2 c2 = new C2(this);
        c2.m();
        this.f = c2;
        l7 l7Var = new l7(this);
        l7Var.m();
        this.i = l7Var;
        this.j = new v2(new g4(h4Var, this));
        this.n = new E0(this);
        u5 u5Var = new u5(this);
        u5Var.k();
        this.l = u5Var;
        b5 b5Var = new b5(this);
        b5Var.k();
        this.m = b5Var;
        w6 w6Var = new w6(this);
        w6Var.k();
        this.h = w6Var;
        g5 g5Var = new g5(this);
        g5Var.m();
        this.o = g5Var;
        i3 i3Var = new i3(this);
        i3Var.m();
        this.g = i3Var;
        zzdd zzddVar = h4Var.d;
        boolean z = zzddVar == null || zzddVar.zzb == 0;
        if (context.getApplicationContext() instanceof Application) {
            t(b5Var);
            if (b5Var.a.a.getApplicationContext() instanceof Application) {
                Application applicationContext = b5Var.a.a.getApplicationContext();
                if (b5Var.c == null) {
                    b5Var.c = new N4(b5Var);
                }
                if (z) {
                    applicationContext.unregisterActivityLifecycleCallbacks(b5Var.c);
                    applicationContext.registerActivityLifecycleCallbacks(b5Var.c);
                    C2 c22 = b5Var.a.f;
                    u(c22);
                    c22.w().a("Registered activity lifecycle callback");
                }
            }
        } else {
            u(c2);
            c2.r().a("Application context is not an Application");
        }
        i3Var.t(new k3(this, h4Var));
    }

    public static q3 O(Context context, zzdd zzddVar, Long l) {
        Bundle bundle;
        if (zzddVar != null) {
            Bundle bundle2 = zzddVar.zzd;
            zzddVar = new zzdd(zzddVar.zza, zzddVar.zzb, zzddVar.zzc, bundle2, null);
        }
        com.google.android.gms.common.internal.t.l(context);
        com.google.android.gms.common.internal.t.l(context.getApplicationContext());
        if (E == null) {
            synchronized (q3.class) {
                try {
                    if (E == null) {
                        E = new q3(new h4(context, zzddVar, l));
                    }
                } finally {
                }
            }
        } else if (zzddVar != null && (bundle = zzddVar.zzd) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.google.android.gms.common.internal.t.l(E);
            E.y = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.google.android.gms.common.internal.t.l(E);
        return E;
    }

    public static final void q() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void r(G1 g1) {
        if (g1 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void s(T3 t3) {
        if (t3 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void t(h2 h2Var) {
        if (h2Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!h2Var.i()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(h2Var.getClass())));
        }
    }

    public static final void u(U3 u3) {
        if (u3 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!u3.k()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(u3.getClass())));
        }
    }

    public final i3 A() {
        return this.g;
    }

    public final b5 B() {
        b5 b5Var = this.m;
        t(b5Var);
        return b5Var;
    }

    public final l7 C() {
        l7 l7Var = this.i;
        s(l7Var);
        return l7Var;
    }

    public final v2 D() {
        return this.j;
    }

    public final t2 E() {
        t(this.q);
        return this.q;
    }

    public final g5 F() {
        g5 g5Var = this.o;
        u(g5Var);
        return g5Var;
    }

    public final boolean G() {
        return this.b;
    }

    public final String H() {
        return this.p;
    }

    public final u5 I() {
        u5 u5Var = this.l;
        t(u5Var);
        return u5Var;
    }

    public final e6 J() {
        t(this.r);
        return this.r;
    }

    public final C K() {
        u(this.s);
        return this.s;
    }

    public final q2 L() {
        t(this.t);
        return this.t;
    }

    public final E0 M() {
        E0 e0 = this.n;
        r(e0);
        return e0;
    }

    public final i5 N() {
        r(this.u);
        return this.u;
    }

    public final void P(boolean z) {
        this.y = Boolean.valueOf(z);
    }

    public final C2 a() {
        C2 c2 = this.f;
        u(c2);
        return c2;
    }

    public final i3 b() {
        i3 i3Var = this.g;
        u(i3Var);
        return i3Var;
    }

    public final f c() {
        return this.c;
    }

    public final Context d() {
        return this.a;
    }

    public final E6.f e() {
        return this.k;
    }

    public final boolean f() {
        return this.y != null && this.y.booleanValue();
    }

    public final boolean g() {
        return h() == 0;
    }

    public final int h() {
        i3 i3Var = this.g;
        u(i3Var);
        i3Var.h();
        m mVar = this.d;
        if (mVar.L()) {
            return 1;
        }
        u(i3Var);
        i3Var.h();
        if (!this.z) {
            return 8;
        }
        Q2 q2 = this.e;
        s(q2);
        Boolean t = q2.t();
        if (t != null) {
            return t.booleanValue() ? 0 : 3;
        }
        f fVar = mVar.a.c;
        Boolean J = mVar.J("firebase_analytics_collection_enabled");
        return J != null ? J.booleanValue() ? 0 : 4 : (this.y == null || this.y.booleanValue()) ? 0 : 7;
    }

    public final void i(boolean z) {
        i3 i3Var = this.g;
        u(i3Var);
        i3Var.h();
        this.z = z;
    }

    public final boolean j() {
        i3 i3Var = this.g;
        u(i3Var);
        i3Var.h();
        return this.z;
    }

    public final void k() {
        this.A++;
    }

    public final void l() {
        this.C.incrementAndGet();
    }

    public final boolean m() {
        if (!this.v) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        i3 i3Var = this.g;
        u(i3Var);
        i3Var.h();
        Boolean bool = this.w;
        if (bool == null || this.x == 0 || (!bool.booleanValue() && Math.abs(this.k.b() - this.x) > 1000)) {
            this.x = this.k.b();
            l7 l7Var = this.i;
            s(l7Var);
            boolean z = false;
            if (l7Var.M("android.permission.INTERNET")) {
                s(l7Var);
                if (l7Var.M("android.permission.ACCESS_NETWORK_STATE")) {
                    Context context = this.a;
                    if (G6.e.a(context).g() || this.d.m() || (l7.j0(context) && l7.E(context, false))) {
                        z = true;
                    }
                }
            }
            Boolean valueOf = Boolean.valueOf(z);
            this.w = valueOf;
            if (valueOf.booleanValue()) {
                s(l7Var);
                this.w = Boolean.valueOf(l7Var.o(L().r()));
            }
        }
        return this.w.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean n() {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.q3.n():boolean");
    }

    public final /* synthetic */ void o(String str, int i, Throwable th, byte[] bArr, Map map) {
        int i2;
        if (i != 200 && i != 204) {
            i2 = 304;
            if (i != 304) {
                i2 = i;
            }
            C2 c2 = this.f;
            u(c2);
            c2.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
        }
        i2 = i;
        if (th == null) {
            Q2 q2 = this.e;
            s(q2);
            q2.u.b(true);
            if (bArr == null || bArr.length == 0) {
                C2 c22 = this.f;
                u(c22);
                c22.v().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String optString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(optString)) {
                    C2 c23 = this.f;
                    u(c23);
                    c23.v().a("Deferred Deep Link is empty.");
                    return;
                }
                String optString2 = jSONObject.optString("gclid", "");
                String optString3 = jSONObject.optString("gbraid", "");
                String optString4 = jSONObject.optString("gad_source", "");
                double optDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                l7 l7Var = this.i;
                s(l7Var);
                q3 q3Var = l7Var.a;
                if (!TextUtils.isEmpty(optString)) {
                    Context context = q3Var.a;
                    List queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0);
                    if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(optString3)) {
                            bundle.putString("gbraid", optString3);
                        }
                        if (!TextUtils.isEmpty(optString4)) {
                            bundle.putString("gad_source", optString4);
                        }
                        bundle.putString("gclid", optString2);
                        bundle.putString("_cis", "ddp");
                        this.m.t("auto", "_cmp", bundle);
                        s(l7Var);
                        if (TextUtils.isEmpty(optString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor edit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            edit.putString("deeplink", optString);
                            edit.putLong("timestamp", Double.doubleToRawLongBits(optDouble));
                            if (edit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = l7Var.a.a;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                } else {
                                    p3.a(context2, intent, null, o3.a(n3.a(m3.a(), true)));
                                    return;
                                }
                            }
                            return;
                        } catch (RuntimeException e) {
                            C2 c24 = l7Var.a.f;
                            u(c24);
                            c24.o().b("Failed to persist Deferred Deep Link. exception", e);
                            return;
                        }
                    }
                }
                C2 c25 = this.f;
                u(c25);
                c25.r().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                return;
            } catch (JSONException e2) {
                C2 c26 = this.f;
                u(c26);
                c26.o().b("Failed to parse the Deferred Deep Link response. exception", e2);
                return;
            }
        }
        C2 c27 = this.f;
        u(c27);
        c27.r().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
    }

    public final /* synthetic */ void p(h4 h4Var) {
        i3 i3Var = this.g;
        u(i3Var);
        i3Var.h();
        m mVar = this.d;
        mVar.u();
        C c = new C(this);
        c.m();
        this.s = c;
        zzdd zzddVar = h4Var.d;
        q2 q2Var = new q2(this, h4Var.c, zzddVar == null ? 0L : zzddVar.zza);
        q2Var.k();
        this.t = q2Var;
        t2 t2Var = new t2(this);
        t2Var.k();
        this.q = t2Var;
        e6 e6Var = new e6(this);
        e6Var.k();
        this.r = e6Var;
        l7 l7Var = this.i;
        l7Var.n();
        this.e.n();
        this.t.l();
        i5 i5Var = new i5(this);
        i5Var.k();
        this.u = i5Var;
        i5Var.l();
        C2 c2 = this.f;
        u(c2);
        A2 u = c2.u();
        mVar.A();
        u.b("App measurement initialized, version", 133005L);
        u(c2);
        c2.u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String q = q2Var.q();
        s(l7Var);
        if (l7Var.P(q, mVar.R())) {
            u(c2);
            c2.u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            u(c2);
            c2.u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(q)));
        }
        u(c2);
        c2.v().a("Debug-level message logging enabled");
        int i = this.A;
        AtomicInteger atomicInteger = this.C;
        if (i != atomicInteger.get()) {
            u(c2);
            c2.o().c("Not all components initialized", Integer.valueOf(this.A), Integer.valueOf(atomicInteger.get()));
        }
        this.v = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(com.google.android.gms.internal.measurement.zzdd r14) {
        /*
            Method dump skipped, instructions count: 1043
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.q3.v(com.google.android.gms.internal.measurement.zzdd):void");
    }

    public final m w() {
        return this.d;
    }

    public final Q2 x() {
        Q2 q2 = this.e;
        s(q2);
        return q2;
    }

    public final C2 y() {
        C2 c2 = this.f;
        if (c2 == null || !c2.k()) {
            return null;
        }
        return c2;
    }

    public final w6 z() {
        w6 w6Var = this.h;
        t(w6Var);
        return w6Var;
    }
}
