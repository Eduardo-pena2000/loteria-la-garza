package k7;

import android.app.Application;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzkp;
import com.google.android.gms.internal.measurement.zzkq;
import com.google.android.gms.internal.measurement.zzqp;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import t7.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class b5 extends h2 {
    public N4 c;
    public e4 d;
    public final Set e;
    public boolean f;
    public final AtomicReference g;
    public final Object h;
    public boolean i;
    public int j;
    public z k;
    public z l;
    public PriorityQueue m;
    public boolean n;
    public a4 o;
    public final AtomicLong p;
    public long q;
    public final t7 r;
    public boolean s;
    public z t;
    public SharedPreferences.OnSharedPreferenceChangeListener u;
    public z v;
    public final k7 w;

    public b5(q3 q3Var) {
        super(q3Var);
        this.e = new CopyOnWriteArraySet();
        this.h = new Object();
        this.i = false;
        this.j = 1;
        this.s = true;
        this.w = new C4(this);
        this.g = new AtomicReference();
        this.o = a4.c;
        this.q = -1L;
        this.p = new AtomicLong(0L);
        this.r = new t7(q3Var);
    }

    public final void A(String str, String str2, long j, Object obj) {
        this.a.b().t(new t4(this, str, str2, obj, j));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.t.f(r10)
            com.google.android.gms.common.internal.t.f(r11)
            r9.h()
            r9.j()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L74
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L53
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L53
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            r12 = 1
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r12 == r11) goto L37
            r11 = 0
            goto L38
        L37:
            r11 = r2
        L38:
            k7.q3 r4 = r9.a
            java.lang.Long r12 = java.lang.Long.valueOf(r11)
            k7.Q2 r11 = r4.x()
            k7.P2 r11 = r11.n
            long r4 = r12.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r11.b(r0)
        L51:
            r11 = r1
            goto L63
        L53:
            if (r12 != 0) goto L63
            k7.q3 r11 = r9.a
            k7.Q2 r11 = r11.x()
            k7.P2 r11 = r11.n
            java.lang.String r0 = "unset"
            r11.b(r0)
            goto L51
        L63:
            k7.q3 r0 = r9.a
            k7.C2 r0 = r0.a()
            k7.A2 r0 = r0.w()
            java.lang.String r1 = "Setting user property(FE)"
            java.lang.String r2 = "non_personalized_ads(_npa)"
            r0.c(r1, r2, r12)
        L74:
            r4 = r11
            r7 = r12
            k7.q3 r11 = r9.a
            boolean r12 = r11.g()
            if (r12 != 0) goto L8e
            k7.q3 r10 = r9.a
            k7.C2 r10 = r10.a()
            k7.A2 r10 = r10.w()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.a(r11)
            return
        L8e:
            boolean r11 = r11.m()
            if (r11 != 0) goto L95
            return
        L95:
            k7.q3 r11 = r9.a
            k7.h7 r12 = new k7.h7
            r3 = r12
            r5 = r13
            r8 = r10
            r3.<init>(r4, r5, r7, r8)
            k7.e6 r10 = r11.J()
            r10.o(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.b5.B(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final Map C(String str, String str2, boolean z) {
        q3 q3Var = this.a;
        if (q3Var.b().p()) {
            q3Var.a().o().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        q3Var.c();
        if (f.a()) {
            q3Var.a().o().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.b().u(atomicReference, 5000L, "get user properties", new A4(this, atomicReference, null, str, str2, z));
        List<h7> list = (List) atomicReference.get();
        if (list == null) {
            q3Var.a().o().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        w.a aVar = new w.a(list.size());
        for (h7 h7Var : list) {
            Object zza = h7Var.zza();
            if (zza != null) {
                aVar.put(h7Var.b, zza);
            }
        }
        return aVar;
    }

    public final String D() {
        return (String) this.g.get();
    }

    public final void E(String str) {
        this.g.set(str);
    }

    public final void F() {
        h();
        q3 q3Var = this.a;
        if (q3Var.x().u.a()) {
            q3Var.a().v().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a = q3Var.x().v.a();
        q3Var.x().v.b(1 + a);
        q3Var.w();
        if (a >= 5) {
            q3Var.a().r().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            q3Var.x().u.b(true);
        } else {
            if (this.t == null) {
                this.t = new v4(this, this.a);
            }
            this.t.b(0L);
        }
    }

    public final void G(long j) {
        this.g.set((Object) null);
        this.a.b().t(new w4(this, j));
    }

    public final void H() {
        h();
        j();
        if (this.a.m()) {
            q3 q3Var = this.a;
            m w = q3Var.w();
            w.a.c();
            Boolean J = w.J("google_analytics_deferred_deep_link_enabled");
            if (J != null && J.booleanValue()) {
                q3Var.a().v().a("Deferred Deep Link feature enabled.");
                q3Var.b().t(new Y4(this));
            }
            this.a.J().s();
            this.s = false;
            Q2 x = q3Var.x();
            x.h();
            String string = x.p().getString("previous_os_version", (String) null);
            x.a.K().l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = x.p().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            q3Var.K().l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            t("auto", "_ou", bundle);
        }
    }

    public final void I(e4 e4Var) {
        e4 e4Var2;
        h();
        j();
        if (e4Var != null && e4Var != (e4Var2 = this.d)) {
            com.google.android.gms.common.internal.t.p(e4Var2 == null, "EventInterceptor already set.");
        }
        this.d = e4Var;
    }

    public final void J(f4 f4Var) {
        j();
        com.google.android.gms.common.internal.t.l(f4Var);
        if (this.e.add(f4Var)) {
            return;
        }
        this.a.a().r().a("OnEventListener already registered");
    }

    public final void K(f4 f4Var) {
        j();
        com.google.android.gms.common.internal.t.l(f4Var);
        if (this.e.remove(f4Var)) {
            return;
        }
        this.a.a().r().a("OnEventListener had not been registered");
    }

    public final int L(String str) {
        com.google.android.gms.common.internal.t.f(str);
        this.a.w();
        return 25;
    }

    public final void M(Bundle bundle) {
        N(bundle, this.a.e().a());
    }

    public final void N(Bundle bundle, long j) {
        com.google.android.gms.common.internal.t.l(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.a.a().r().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        com.google.android.gms.common.internal.t.l(bundle2);
        W3.b(bundle2, "app_id", String.class, null);
        W3.b(bundle2, "origin", String.class, null);
        W3.b(bundle2, "name", String.class, null);
        W3.b(bundle2, "value", Object.class, null);
        W3.b(bundle2, "trigger_event_name", String.class, null);
        W3.b(bundle2, "trigger_timeout", Long.class, 0L);
        W3.b(bundle2, "timed_out_event_name", String.class, null);
        W3.b(bundle2, "timed_out_event_params", Bundle.class, null);
        W3.b(bundle2, "triggered_event_name", String.class, null);
        W3.b(bundle2, "triggered_event_params", Bundle.class, null);
        W3.b(bundle2, "time_to_live", Long.class, 0L);
        W3.b(bundle2, "expired_event_name", String.class, null);
        W3.b(bundle2, "expired_event_params", Bundle.class, null);
        com.google.android.gms.common.internal.t.f(bundle2.getString("name"));
        com.google.android.gms.common.internal.t.f(bundle2.getString("origin"));
        com.google.android.gms.common.internal.t.l(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        q3 q3Var = this.a;
        if (q3Var.C().y0(string) != 0) {
            q3Var.a().o().b("Invalid conditional user property name", q3Var.D().c(string));
            return;
        }
        if (q3Var.C().y(string, obj) != 0) {
            q3Var.a().o().c("Invalid conditional user property value", q3Var.D().c(string), obj);
            return;
        }
        Object z = q3Var.C().z(string, obj);
        if (z == null) {
            q3Var.a().o().c("Unable to normalize conditional user property value", q3Var.D().c(string), obj);
            return;
        }
        W3.a(bundle2, z);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            q3Var.w();
            if (j2 > 15552000000L || j2 < 1) {
                q3Var.a().o().c("Invalid conditional user property timeout", q3Var.D().c(string), Long.valueOf(j2));
                return;
            }
        }
        long j3 = bundle2.getLong("time_to_live");
        q3Var.w();
        if (j3 > 15552000000L || j3 < 1) {
            q3Var.a().o().c("Invalid conditional user property time to live", q3Var.D().c(string), Long.valueOf(j3));
        } else {
            q3Var.b().t(new x4(this, bundle2));
        }
    }

    public final void O(String str, String str2, Bundle bundle) {
        q3 q3Var = this.a;
        long a = q3Var.e().a();
        com.google.android.gms.common.internal.t.f(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", a);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        q3Var.b().t(new y4(this, bundle2));
    }

    public final ArrayList P(String str, String str2) {
        q3 q3Var = this.a;
        if (q3Var.b().p()) {
            q3Var.a().o().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        q3Var.c();
        if (f.a()) {
            q3Var.a().o().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.a.b().u(atomicReference, 5000L, "get conditional user properties", new z4(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return l7.h0(list);
        }
        q3Var.a().o().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final String Q() {
        m5 u = this.a.I().u();
        if (u != null) {
            return u.a;
        }
        return null;
    }

    public final String R() {
        m5 u = this.a.I().u();
        if (u != null) {
            return u.b;
        }
        return null;
    }

    public final String S() {
        try {
            return l5.a(this.a.d(), "google_app_id", this.a.H());
        } catch (IllegalStateException e) {
            this.a.a().o().b("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    public final /* synthetic */ void T(SharedPreferences sharedPreferences, String str) {
        q3 q3Var = this.a;
        if (!q3Var.w().H(null, f2.a1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                q3Var.a().w().a("IABTCF_TCString change picked up in listener.");
                ((z) com.google.android.gms.common.internal.t.l(this.v)).b(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            q3Var.a().w().a("IABTCF_TCString change picked up in listener.");
            ((z) com.google.android.gms.common.internal.t.l(this.v)).b(500L);
        }
    }

    public final /* synthetic */ void U(Bundle bundle) {
        Bundle bundle2;
        int i;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            q3 q3Var = this.a;
            bundle2 = new Bundle(q3Var.x().z.a());
            Iterator it = bundle.keySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                Object obj = bundle.get(str);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (q3Var.C().B0(obj)) {
                        q3Var.C().B(this.w, null, 27, null, null, 0);
                    }
                    q3Var.a().t().c("Invalid default event parameter type. Name, value", str, obj);
                } else if (l7.N(str)) {
                    q3Var.a().t().b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    bundle2.remove(str);
                } else if (q3Var.C().C0("param", str, q3Var.w().x(null, false), obj)) {
                    q3Var.C().A(bundle2, str, obj);
                }
            }
            q3Var.C();
            int v = q3Var.w().v();
            if (bundle2.size() > v) {
                for (String str2 : new TreeSet(bundle2.keySet())) {
                    i++;
                    if (i > v) {
                        bundle2.remove(str2);
                    }
                }
                q3Var.C().B(this.w, null, 26, null, null, 0);
                q3Var.a().t().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        q3 q3Var2 = this.a;
        q3Var2.x().z.b(bundle2);
        if (!bundle.isEmpty() || q3Var2.w().H(null, f2.X0)) {
            this.a.J().v(bundle2);
        }
    }

    public final /* synthetic */ void V(int i) {
        if (this.k == null) {
            this.k = new m4(this, this.a);
        }
        this.k.b(i * 1000);
    }

    public final /* synthetic */ void W(Boolean bool, boolean z) {
        f0(bool, true);
    }

    public final /* synthetic */ void X(a4 a4Var, long j, boolean z, boolean z2) {
        h();
        j();
        q3 q3Var = this.a;
        a4 w = q3Var.x().w();
        if (j <= this.q && a4.u(w.b(), a4Var.b())) {
            q3Var.a().u().b("Dropped out-of-date consent setting, proposed settings", a4Var);
            return;
        }
        Q2 x = q3Var.x();
        q3 q3Var2 = x.a;
        x.h();
        int b = a4Var.b();
        if (!x.v(b)) {
            q3Var.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(a4Var.b()));
            return;
        }
        q3 q3Var3 = this.a;
        SharedPreferences.Editor edit = x.p().edit();
        edit.putString("consent_settings", a4Var.l());
        edit.putInt("consent_source", b);
        edit.apply();
        q3Var.a().w().b("Setting storage consent(FE)", a4Var);
        this.q = j;
        if (q3Var3.J().D()) {
            q3Var3.J().Z(z);
        } else {
            q3Var3.J().Y(z);
        }
        if (z2) {
            q3Var3.J().q(new AtomicReference());
        }
    }

    public final /* synthetic */ void Z(boolean z) {
        this.i = false;
    }

    public final /* synthetic */ int a0() {
        return this.j;
    }

    public final /* synthetic */ void b0(int i) {
        this.j = i;
    }

    public final /* synthetic */ z c0() {
        return this.t;
    }

    public final /* synthetic */ int d0(Throwable th) {
        String message = th.getMessage();
        this.n = false;
        int i = 2;
        if (message != null) {
            if ((th instanceof IllegalStateException) || message.contains("garbage collected") || th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
                i = 1;
                if (message.contains("Background")) {
                    this.n = true;
                    return 1;
                }
            } else if ((th instanceof SecurityException) && !message.endsWith("READ_DEVICE_CONFIG")) {
                return 3;
            }
        }
        return i;
    }

    public final j5 e0(G6 g6) {
        try {
            URL url = new URI(g6.c).toURL();
            AtomicReference atomicReference = new AtomicReference();
            String s = this.a.L().s();
            q3 q3Var = this.a;
            A2 w = q3Var.a().w();
            Long valueOf = Long.valueOf(g6.a);
            w.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", valueOf, g6.c, Integer.valueOf(g6.b.length));
            if (!TextUtils.isEmpty(g6.g)) {
                q3Var.a().w().c("[sgtm] Uploading data from app. row_id", valueOf, g6.g);
            }
            HashMap hashMap = new HashMap();
            Bundle bundle = g6.d;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str, string);
                }
            }
            g5 F = q3Var.F();
            byte[] bArr = g6.b;
            O4 o4 = new O4(this, atomicReference, g6);
            F.l();
            com.google.android.gms.common.internal.t.l(url);
            com.google.android.gms.common.internal.t.l(bArr);
            com.google.android.gms.common.internal.t.l(o4);
            F.a.b().w(new f5(F, s, url, bArr, hashMap, o4));
            try {
                q3 q3Var2 = q3Var.C().a;
                long a = q3Var2.e().a() + 60000;
                synchronized (atomicReference) {
                    for (long j = 60000; atomicReference.get() == null && j > 0; j = a - q3Var2.e().a()) {
                        try {
                            atomicReference.wait(j);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.a.a().r().a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? j5.b : (j5) atomicReference.get();
        } catch (URISyntaxException | MalformedURLException e) {
            this.a.a().o().d("[sgtm] Bad upload url for row_id", g6.c, Long.valueOf(g6.a), e);
            return j5.d;
        }
    }

    public final void f0(Boolean bool, boolean z) {
        h();
        j();
        q3 q3Var = this.a;
        q3Var.a().v().b("Setting app measurement enabled (FE)", bool);
        q3Var.x().s(bool);
        if (z) {
            Q2 x = q3Var.x();
            q3 q3Var2 = x.a;
            x.h();
            SharedPreferences.Editor edit = x.p().edit();
            if (bool != null) {
                edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                edit.remove("measurement_enabled_from_api");
            }
            edit.apply();
        }
        if (this.a.j() || !(bool == null || bool.booleanValue())) {
            Y();
        }
    }

    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final void Y() {
        h();
        q3 q3Var = this.a;
        String a = q3Var.x().n.a();
        if (a != null) {
            if ("unset".equals(a)) {
                B("app", "_npa", null, q3Var.e().a());
            } else {
                B("app", "_npa", Long.valueOf(true != "true".equals(a) ? 0L : 1L), q3Var.e().a());
            }
        }
        if (!this.a.g() || !this.s) {
            q3Var.a().v().a("Updating Scion state (FE)");
            this.a.J().X();
        } else {
            q3Var.a().v().a("Recording app launch after enabling measurement for the first time (FE)");
            H();
            this.a.z().e.a();
            q3Var.b().t(new o4(this));
        }
    }

    public final void h0() {
        q3 q3Var = this.a;
        if (!(q3Var.d().getApplicationContext() instanceof Application) || this.c == null) {
            return;
        }
        q3Var.d().getApplicationContext().unregisterActivityLifecycleCallbacks(this.c);
    }

    public final Boolean i0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.a.b().u(atomicReference, 15000L, "boolean test flag value", new u4(this, atomicReference));
    }

    public final String j0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.a.b().u(atomicReference, 15000L, "String test flag value", new D4(this, atomicReference));
    }

    public final Long k0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.a.b().u(atomicReference, 15000L, "long test flag value", new E4(this, atomicReference));
    }

    public final Integer l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.a.b().u(atomicReference, 15000L, "int test flag value", new F4(this, atomicReference));
    }

    public final boolean m() {
        return false;
    }

    public final Double m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.a.b().u(atomicReference, 15000L, "double test flag value", new G4(this, atomicReference));
    }

    public final void n0(Boolean bool) {
        j();
        this.a.b().t(new H4(this, bool));
    }

    public final void o(a4 a4Var) {
        h();
        boolean z = (a4Var.o(Z3.ANALYTICS_STORAGE) && a4Var.o(Z3.AD_STORAGE)) || this.a.J().C();
        q3 q3Var = this.a;
        if (z != q3Var.j()) {
            q3Var.i(z);
            Q2 x = this.a.x();
            q3 q3Var2 = x.a;
            x.h();
            Boolean valueOf = x.p().contains("measurement_enabled_from_api") ? Boolean.valueOf(x.p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || valueOf == null || valueOf.booleanValue()) {
                f0(Boolean.valueOf(z), false);
            }
        }
    }

    public final void o0(Bundle bundle, int i, long j) {
        Boolean bool;
        Boolean string;
        j();
        a4 a4Var = a4.c;
        Z3[] b = Y3.STORAGE.b();
        int length = b.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                break;
            }
            String str = b[i2].a;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    bool = string;
                    break;
                }
            }
            i2++;
        }
        if (bool != null) {
            q3 q3Var = this.a;
            q3Var.a().t().b("Ignoring invalid consent setting", bool);
            q3Var.a().t().a("Valid consent values are 'granted', 'denied'");
        }
        boolean p = this.a.b().p();
        a4 e = a4.e(bundle, i);
        if (e.c()) {
            q0(e, p);
        }
        A h = A.h(bundle, i);
        if (h.d()) {
            p0(h, p);
        }
        Boolean i3 = A.i(bundle);
        if (i3 != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (p) {
                B(str2, "allow_personalized_ads", i3.toString(), j);
            } else {
                z(str2, "allow_personalized_ads", i3.toString(), false, j);
            }
        }
    }

    public final void p(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, this.a.e().a());
    }

    public final void p0(A a, boolean z) {
        I4 i4 = new I4(this, a);
        if (!z) {
            this.a.b().t(i4);
        } else {
            h();
            i4.run();
        }
    }

    public final void q(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.a.I().s(bundle2, j);
            return;
        }
        boolean z3 = true;
        if (z2 && this.d != null && !l7.N(str2)) {
            z3 = false;
        }
        x(str == null ? "app" : str, str2, j, bundle2, z2, z3, z, null);
    }

    public final void q0(a4 a4Var, boolean z) {
        boolean z2;
        a4 a4Var2;
        boolean z3;
        boolean z4;
        j();
        int b = a4Var.b();
        if (b != -10) {
            X3 p = a4Var.p();
            X3 x3 = X3.UNINITIALIZED;
            if (p == x3 && a4Var.q() == x3) {
                this.a.a().t().a("Ignoring empty consent settings");
                return;
            }
        }
        synchronized (this.h) {
            try {
                z2 = false;
                if (a4.u(b, this.o.b())) {
                    z3 = a4Var.r(this.o);
                    Z3 z32 = Z3.ANALYTICS_STORAGE;
                    if (a4Var.o(z32) && !this.o.o(z32)) {
                        z2 = true;
                    }
                    a4 t = a4Var.t(this.o);
                    this.o = t;
                    a4Var2 = t;
                    z4 = z2;
                    z2 = true;
                } else {
                    a4Var2 = a4Var;
                    z3 = false;
                    z4 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            this.a.a().u().b("Ignoring lower-priority consent settings, proposed settings", a4Var2);
            return;
        }
        long andIncrement = this.p.getAndIncrement();
        if (z3) {
            this.g.set((Object) null);
            J4 j4 = new J4(this, a4Var2, andIncrement, z4);
            if (!z) {
                this.a.b().v(j4);
                return;
            } else {
                h();
                j4.run();
                return;
            }
        }
        K4 k4 = new K4(this, a4Var2, andIncrement, z4);
        if (z) {
            h();
            k4.run();
        } else if (b == 30 || b == -10) {
            this.a.b().v(k4);
        } else {
            this.a.b().t(k4);
        }
    }

    public final void r() {
        q3 q3Var;
        e2 e2Var;
        x6 x6Var;
        x6 x6Var2;
        int i;
        b5 b5Var;
        zzkq zzkqVar;
        h();
        q3 q3Var2 = this.a;
        q3Var2.a().v().a("Handle tcf update.");
        SharedPreferences q = q3Var2.x().q();
        HashMap hashMap = new HashMap();
        e2 e2Var2 = f2.a1;
        if (((Boolean) e2Var2.b(null)).booleanValue()) {
            t7.r rVar = z6.a;
            zzkp zzkpVar = zzkp.zzb;
            y6 y6Var = y6.a;
            Map.Entry a = a5.a(zzkpVar, y6Var);
            zzkp zzkpVar2 = zzkp.zzc;
            y6 y6Var2 = y6.d;
            e2Var = e2Var2;
            q3Var = q3Var2;
            t7.s r = t7.s.r(a, a5.a(zzkpVar2, y6Var2), a5.a(zzkp.zzd, y6Var), a5.a(zzkp.zze, y6Var), a5.a(zzkp.zzh, y6Var2), a5.a(zzkp.zzj, y6Var2), a5.a(zzkp.zzk, y6Var2));
            t7.t s = t7.t.s("CH");
            char[] cArr = new char[5];
            boolean contains = q.contains("IABTCF_TCString");
            int b = z6.b(q, "IABTCF_CmpSdkID");
            int b2 = z6.b(q, "IABTCF_PolicyVersion");
            int b3 = z6.b(q, "IABTCF_gdprApplies");
            int b4 = z6.b(q, "IABTCF_PurposeOneTreatment");
            int b5 = z6.b(q, "IABTCF_EnableAdvertiserConsentMode");
            String a2 = z6.a(q, "IABTCF_PublisherCC");
            s.a a3 = t7.s.a();
            t7.U q2 = r.n().q();
            while (q2.hasNext()) {
                zzkp zzkpVar3 = (zzkp) q2.next();
                int zza = zzkpVar3.zza();
                StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + 28);
                sb.append("IABTCF_PublisherRestrictions");
                sb.append(zza);
                String a4 = z6.a(q, sb.toString());
                if (TextUtils.isEmpty(a4) || a4.length() < 755) {
                    zzkqVar = zzkq.zzd;
                } else {
                    int digit = Character.digit(a4.charAt(754), 10);
                    zzkqVar = (digit < 0 || digit > zzkq.values().length || digit == 0) ? zzkq.zza : digit != 1 ? digit != 2 ? zzkq.zzd : zzkq.zzc : zzkq.zzb;
                }
                a3.f(zzkpVar3, zzkqVar);
            }
            t7.s c = a3.c();
            String a5 = z6.a(q, "IABTCF_PurposeConsents");
            String a6 = z6.a(q, "IABTCF_VendorConsents");
            boolean z = !TextUtils.isEmpty(a6) && a6.length() >= 755 && a6.charAt(754) == '1';
            String a7 = z6.a(q, "IABTCF_PurposeLegitimateInterests");
            String a8 = z6.a(q, "IABTCF_VendorLegitimateInterests");
            boolean z2 = !TextUtils.isEmpty(a8) && a8.length() >= 755 && a8.charAt(754) == '1';
            cArr[0] = '2';
            x6Var = new x6(z6.d(r, c, s, cArr, b, b5, b3, b2, b4, a2, a5, a7, z, z2, contains));
        } else {
            q3Var = q3Var2;
            e2Var = e2Var2;
            String a9 = z6.a(q, "IABTCF_VendorConsents");
            if (!"".equals(a9) && a9.length() > 754) {
                hashMap.put("GoogleConsent", String.valueOf(a9.charAt(754)));
            }
            int b6 = z6.b(q, "IABTCF_gdprApplies");
            if (b6 != -1) {
                hashMap.put("gdprApplies", String.valueOf(b6));
            }
            int b7 = z6.b(q, "IABTCF_EnableAdvertiserConsentMode");
            if (b7 != -1) {
                hashMap.put("EnableAdvertiserConsentMode", String.valueOf(b7));
            }
            int b8 = z6.b(q, "IABTCF_PolicyVersion");
            if (b8 != -1) {
                hashMap.put("PolicyVersion", String.valueOf(b8));
            }
            String a10 = z6.a(q, "IABTCF_PurposeConsents");
            if (!"".equals(a10)) {
                hashMap.put("PurposeConsents", a10);
            }
            int b9 = z6.b(q, "IABTCF_CmpSdkID");
            if (b9 != -1) {
                hashMap.put("CmpSdkID", String.valueOf(b9));
            }
            x6Var = new x6(hashMap);
        }
        q3Var.a().w().b("Tcf preferences read", x6Var);
        if (!q3Var.w().H(null, e2Var)) {
            if (q3Var.x().x(x6Var)) {
                Bundle b10 = x6Var.b();
                q3Var.a().w().b("Consent generated from Tcf", b10);
                if (b10 != Bundle.EMPTY) {
                    o0(b10, -30, q3Var.e().a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", x6Var.e());
                t("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        Q2 x = q3Var.x();
        x.h();
        String string = x.p().getString("stored_tcf_param", "");
        HashMap hashMap2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            x6Var2 = new x6(hashMap2);
        } else {
            String[] split = string.split(";");
            int length = split.length;
            int i2 = 0;
            while (i2 < length) {
                String[] split2 = split[i2].split("=");
                if (split2.length < 2 || !z6.a.contains(split2[0])) {
                    i = 1;
                } else {
                    i = 1;
                    hashMap2.put(split2[0], split2[1]);
                }
                i2 += i;
            }
            x6Var2 = new x6(hashMap2);
        }
        if (q3Var.x().x(x6Var)) {
            Bundle b11 = x6Var.b();
            q3Var.a().w().b("Consent generated from Tcf", b11);
            if (b11 != Bundle.EMPTY) {
                b5Var = this;
                b5Var.o0(b11, -30, q3Var.e().a());
            } else {
                b5Var = this;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", x6Var.d(x6Var2));
            bundle2.putString("_tcfd2", x6Var.c());
            bundle2.putString("_tcfd", x6Var.e());
            b5Var.t("auto", "_tcf", bundle2);
        }
    }

    public final void r0(Runnable runnable) {
        j();
        q3 q3Var = this.a;
        if (q3Var.b().p()) {
            q3Var.a().o().a("Cannot retrieve and upload batches from analytics worker thread");
            return;
        }
        if (q3Var.b().q()) {
            q3Var.a().o().a("Cannot retrieve and upload batches from analytics network thread");
            return;
        }
        q3Var.c();
        if (f.a()) {
            q3Var.a().o().a("Cannot retrieve and upload batches from main thread");
            return;
        }
        q3Var.a().w().a("[sgtm] Started client-side batch upload work.");
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (!z) {
            q3Var.a().w().a("[sgtm] Getting upload batches from service (FE)");
            AtomicReference atomicReference = new AtomicReference();
            q3Var.b().u(atomicReference, 10000L, "[sgtm] Getting upload batches", new Z4(this, atomicReference));
            K6 k6 = (K6) atomicReference.get();
            if (k6 == null) {
                break;
            }
            List list = k6.a;
            if (!list.isEmpty()) {
                q3Var.a().w().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                i += list.size();
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    j5 e0 = e0((G6) it.next());
                    if (e0 == j5.c) {
                        i2++;
                    } else if (e0 == j5.e) {
                        z = true;
                        break;
                    }
                }
            } else {
                break;
            }
        }
        q3Var.a().w().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(i), Integer.valueOf(i2));
        runnable.run();
    }

    public final void s() {
        h();
        q3 q3Var = this.a;
        q3Var.a().v().a("Register tcfPrefChangeListener.");
        if (this.u == null) {
            this.v = new r4(this, this.a);
            this.u = new V4(this);
        }
        q3Var.x().q().registerOnSharedPreferenceChangeListener(this.u);
    }

    public final void s0(long j) {
        h();
        if (this.l == null) {
            this.l = new j4(this, this.a);
        }
        this.l.b(j);
    }

    public final void t(String str, String str2, Bundle bundle) {
        h();
        u(str, str2, this.a.e().a(), bundle);
    }

    public final void t0() {
        h();
        z zVar = this.l;
        if (zVar != null) {
            zVar.d();
        }
    }

    public final void u(String str, String str2, long j, Bundle bundle) {
        h();
        v(str, str2, j, bundle, true, this.d == null || l7.N(str2), true, null);
    }

    public final void u0() {
        zzqp.zza();
        q3 q3Var = this.a;
        if (q3Var.w().H(null, f2.R0)) {
            if (q3Var.b().p()) {
                q3Var.a().o().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            q3Var.c();
            if (f.a()) {
                q3Var.a().o().a("Cannot get trigger URIs from main thread");
                return;
            }
            j();
            q3Var.a().w().a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            q3Var.b().u(atomicReference, 10000L, "get trigger URIs", new Q4(this, atomicReference));
            List list = (List) atomicReference.get();
            if (list == null) {
                q3Var.a().q().a("Timed out waiting for get trigger URIs");
            } else {
                q3Var.b().t(new S4(this, list));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(java.lang.String r25, java.lang.String r26, long r27, android.os.Bundle r29, boolean r30, boolean r31, boolean r32, java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 1225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.b5.v(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final boolean v0() {
        return this.n;
    }

    public final void w(String str, String str2, Bundle bundle, String str3) {
        q3.q();
        x("auto", str2, this.a.e().a(), bundle, false, true, true, str3);
    }

    public final PriorityQueue w0() {
        if (this.m == null) {
            this.m = new PriorityQueue(Comparator.comparing(T4.a, U4.a));
        }
        return this.m;
    }

    public final void x(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        String[] strArr = l7.i;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Bundle[] bundleArr = (Parcelable[]) obj;
                    while (i < bundleArr.length) {
                        Bundle bundle3 = bundleArr[i];
                        if (bundle3 instanceof Bundle) {
                            bundleArr[i] = new Bundle(bundle3);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        this.a.b().t(new s4(this, str, str2, j, bundle2, z, z2, z3, str3));
    }

    public final void x0() {
        B6 b6;
        h();
        this.n = false;
        if (w0().isEmpty() || this.i || (b6 = (B6) w0().poll()) == null) {
            return;
        }
        q3 q3Var = this.a;
        a4.a H = q3Var.C().H();
        if (H != null) {
            this.i = true;
            A2 w = q3Var.a().w();
            String str = b6.a;
            w.b("Registering trigger URI", str);
            x7.e d = H.d(Uri.parse(str));
            if (d != null) {
                x7.c.a(d, new l4(this, b6), new k4(this));
            } else {
                this.i = false;
                w0().add(b6);
            }
        }
    }

    public final void y(String str, String str2, Object obj, boolean z) {
        z("auto", "_ldl", obj, true, this.a.e().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
        /*
            r16 = this;
            r6 = r16
            r2 = r18
            r0 = r19
            r1 = 0
            r3 = 24
            if (r20 == 0) goto L17
            k7.q3 r4 = r6.a
            k7.l7 r4 = r4.C()
            int r4 = r4.y0(r2)
        L15:
            r12 = r4
            goto L41
        L17:
            k7.q3 r4 = r6.a
            k7.l7 r4 = r4.C()
            java.lang.String r5 = "user property"
            boolean r7 = r4.t0(r5, r2)
            r8 = 6
            if (r7 != 0) goto L28
        L26:
            r12 = r8
            goto L41
        L28:
            java.lang.String[] r7 = k7.d4.a
            r9 = 0
            boolean r7 = r4.v0(r5, r7, r9, r2)
            if (r7 != 0) goto L34
            r4 = 15
            goto L15
        L34:
            k7.q3 r7 = r4.a
            r7.w()
            boolean r4 = r4.w0(r5, r3, r2)
            if (r4 != 0) goto L40
            goto L26
        L40:
            r12 = r1
        L41:
            r4 = 1
            if (r12 == 0) goto L67
            k7.q3 r0 = r6.a
            k7.l7 r5 = r0.C()
            r0.w()
            java.lang.String r14 = r5.q(r2, r3, r4)
            if (r2 == 0) goto L57
            int r1 = r18.length()
        L57:
            r15 = r1
            k7.q3 r0 = r6.a
            k7.k7 r10 = r6.w
            k7.l7 r9 = r0.C()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.B(r10, r11, r12, r13, r14, r15)
            return
        L67:
            if (r17 != 0) goto L6c
            java.lang.String r5 = "app"
            goto L6e
        L6c:
            r5 = r17
        L6e:
            if (r0 == 0) goto Lc0
            k7.q3 r7 = r6.a
            k7.l7 r8 = r7.C()
            int r12 = r8.y(r2, r0)
            if (r12 == 0) goto Laa
            k7.l7 r5 = r7.C()
            r7.w()
            java.lang.String r14 = r5.q(r2, r3, r4)
            boolean r2 = r0 instanceof java.lang.String
            if (r2 != 0) goto L92
            boolean r2 = r0 instanceof java.lang.CharSequence
            if (r2 == 0) goto L90
            goto L92
        L90:
            r15 = r1
            goto L9b
        L92:
            java.lang.String r0 = r19.toString()
            int r1 = r0.length()
            goto L90
        L9b:
            k7.q3 r0 = r6.a
            k7.k7 r10 = r6.w
            k7.l7 r9 = r0.C()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.B(r10, r11, r12, r13, r14, r15)
            return
        Laa:
            k7.l7 r1 = r7.C()
            java.lang.Object r7 = r1.z(r2, r0)
            if (r7 == 0) goto Lbf
            r0 = r16
            r1 = r5
            r2 = r18
            r3 = r21
            r5 = r7
            r0.A(r1, r2, r3, r5)
        Lbf:
            return
        Lc0:
            r7 = 0
            r0 = r16
            r1 = r5
            r2 = r18
            r3 = r21
            r5 = r7
            r0.A(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.b5.z(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }
}
