package k7;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzdf;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class u5 extends h2 {
    public volatile m5 c;
    public volatile m5 d;
    public m5 e;
    public final Map f;
    public zzdf g;
    public volatile boolean h;
    public volatile m5 i;
    public m5 j;
    public boolean k;
    public final Object l;

    public u5(q3 q3Var) {
        super(q3Var);
        this.l = new Object();
        this.f = new ConcurrentHashMap();
    }

    public final /* synthetic */ void A(Bundle bundle, m5 m5Var, m5 m5Var2, long j) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        G(m5Var, m5Var2, j, true, this.a.C().t(null, "screen_view", bundle, null, false));
    }

    public final /* synthetic */ void B(m5 m5Var, m5 m5Var2, long j, boolean z, Bundle bundle) {
        G(m5Var, m5Var2, j, z, null);
    }

    public final /* synthetic */ void C(m5 m5Var, boolean z, long j) {
        o(m5Var, false, j);
    }

    public final /* synthetic */ m5 D() {
        return this.j;
    }

    public final /* synthetic */ void E(m5 m5Var) {
        this.j = null;
    }

    public final void F(String str, m5 m5Var, boolean z) {
        m5 m5Var2;
        m5 m5Var3 = this.c == null ? this.d : this.c;
        if (m5Var.b == null) {
            m5Var2 = new m5(m5Var.a, str != null ? r(str, "Activity") : null, m5Var.c, m5Var.e, m5Var.f);
        } else {
            m5Var2 = m5Var;
        }
        this.d = this.c;
        this.c = m5Var2;
        q3 q3Var = this.a;
        q3Var.b().t(new o5(this, m5Var2, m5Var3, q3Var.e().b(), z));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(k7.m5 r16, k7.m5 r17, long r18, boolean r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.u5.G(k7.m5, k7.m5, long, boolean, android.os.Bundle):void");
    }

    public final boolean m() {
        return false;
    }

    public final void o(m5 m5Var, boolean z, long j) {
        q3 q3Var = this.a;
        q3Var.M().k(q3Var.e().b());
        if (!q3Var.z().f.d(m5Var != null && m5Var.d, z, j) || m5Var == null) {
            return;
        }
        m5Var.d = false;
    }

    public final m5 p(zzdf zzdfVar) {
        com.google.android.gms.common.internal.t.l(zzdfVar);
        Integer valueOf = Integer.valueOf(zzdfVar.zza);
        Map map = this.f;
        m5 m5Var = (m5) map.get(valueOf);
        if (m5Var == null) {
            m5 m5Var2 = new m5(null, r(zzdfVar.zzb, "Activity"), this.a.C().p0());
            map.put(valueOf, m5Var2);
            m5Var = m5Var2;
        }
        return this.i != null ? this.i : m5Var;
    }

    public final m5 q(boolean z) {
        j();
        h();
        if (!z) {
            return this.e;
        }
        m5 m5Var = this.e;
        return m5Var != null ? m5Var : this.j;
    }

    public final String r(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] split = str.split("\\.");
        int length = split.length;
        String str3 = length > 0 ? split[length - 1] : "";
        q3 q3Var = this.a;
        return str3.length() > q3Var.w().x(null, false) ? str3.substring(0, q3Var.w().x(null, false)) : str3;
    }

    public final void s(Bundle bundle, long j) {
        synchronized (this.l) {
            try {
                if (!this.k) {
                    this.a.a().t().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.a.w().x(null, false))) {
                    this.a.a().t().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.a.w().x(null, false))) {
                    this.a.a().t().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    zzdf zzdfVar = this.g;
                    string2 = zzdfVar != null ? r(zzdfVar.zzb, "Activity") : "Activity";
                }
                m5 m5Var = this.c;
                if (this.h && m5Var != null) {
                    this.h = false;
                    boolean equals = Objects.equals(m5Var.b, string2);
                    boolean equals2 = Objects.equals(m5Var.a, string);
                    if (equals && equals2) {
                        this.a.a().t().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                q3 q3Var = this.a;
                q3Var.a().w().c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                m5 m5Var2 = this.c == null ? this.d : this.c;
                m5 m5Var3 = new m5(string, string2, q3Var.C().p0(), true, j);
                this.c = m5Var3;
                this.d = m5Var2;
                this.i = m5Var3;
                q3Var.b().t(new n5(this, bundle, m5Var3, m5Var2, q3Var.e().b()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t(zzdf zzdfVar, String str, String str2) {
        q3 q3Var = this.a;
        if (!q3Var.w().N()) {
            q3Var.a().t().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        m5 m5Var = this.c;
        if (m5Var == null) {
            q3Var.a().t().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f;
        Integer valueOf = Integer.valueOf(zzdfVar.zza);
        if (map.get(valueOf) == null) {
            q3Var.a().t().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = r(zzdfVar.zzb, "Activity");
        }
        String str3 = m5Var.b;
        String str4 = m5Var.a;
        boolean equals = Objects.equals(str3, str2);
        boolean equals2 = Objects.equals(str4, str);
        if (equals && equals2) {
            q3Var.a().t().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > q3Var.w().x(null, false))) {
            q3Var.a().t().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > q3Var.w().x(null, false))) {
            q3Var.a().t().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        q3Var.a().w().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        m5 m5Var2 = new m5(str, str2, q3Var.C().p0());
        map.put(valueOf, m5Var2);
        F(zzdfVar.zzb, m5Var2, true);
    }

    public final m5 u() {
        return this.c;
    }

    public final void v(zzdf zzdfVar, Bundle bundle) {
        Bundle bundle2;
        if (!this.a.w().N() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f.put(Integer.valueOf(zzdfVar.zza), new m5(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void w(zzdf zzdfVar) {
        Object obj = this.l;
        synchronized (obj) {
            this.k = true;
            if (!Objects.equals(zzdfVar, this.g)) {
                synchronized (obj) {
                    this.g = zzdfVar;
                    this.h = false;
                    q3 q3Var = this.a;
                    if (q3Var.w().N()) {
                        this.i = null;
                        q3Var.b().t(new t5(this));
                    }
                }
            }
        }
        q3 q3Var2 = this.a;
        if (!q3Var2.w().N()) {
            this.c = this.i;
            q3Var2.b().t(new p5(this));
            return;
        }
        F(zzdfVar.zzb, p(zzdfVar), false);
        E0 M = this.a.M();
        q3 q3Var3 = M.a;
        q3Var3.b().t(new d0(M, q3Var3.e().b()));
    }

    public final void x(zzdf zzdfVar) {
        synchronized (this.l) {
            this.k = false;
            this.h = true;
        }
        q3 q3Var = this.a;
        long b = q3Var.e().b();
        if (!q3Var.w().N()) {
            this.c = null;
            q3Var.b().t(new q5(this, b));
        } else {
            m5 p = p(zzdfVar);
            this.d = this.c;
            this.c = null;
            q3Var.b().t(new r5(this, p, b));
        }
    }

    public final void y(zzdf zzdfVar, Bundle bundle) {
        m5 m5Var;
        if (!this.a.w().N() || bundle == null || (m5Var = (m5) this.f.get(Integer.valueOf(zzdfVar.zza))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", m5Var.c);
        bundle2.putString("name", m5Var.a);
        bundle2.putString("referrer_name", m5Var.b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void z(zzdf zzdfVar) {
        synchronized (this.l) {
            try {
                if (Objects.equals(this.g, zzdfVar)) {
                    this.g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.a.w().N()) {
            this.f.remove(Integer.valueOf(zzdfVar.zza));
        }
    }
}
