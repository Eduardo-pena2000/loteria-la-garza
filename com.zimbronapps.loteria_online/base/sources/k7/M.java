package k7;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class m extends T3 {
    public Boolean b;
    public String c;
    public l d;
    public Boolean e;

    public m(q3 q3Var) {
        super(q3Var);
        this.d = k.a;
    }

    public static final long n() {
        return ((Long) f2.e.b(null)).longValue();
    }

    public static final int o() {
        return Math.max(0, ((Integer) f2.j.b(null)).intValue());
    }

    public static final long p() {
        return ((Integer) f2.l.b(null)).intValue();
    }

    public static final long q() {
        return ((Long) f2.S.b(null)).longValue();
    }

    public static final long r() {
        return ((Long) f2.N.b(null)).longValue();
    }

    public final long A() {
        this.a.c();
        return 133005L;
    }

    public final boolean B() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        q3 q3Var = this.a;
                        ApplicationInfo applicationInfo = q3Var.d().getApplicationInfo();
                        String a = E6.t.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z = false;
                            if (str != null && str.equals(a)) {
                                z = true;
                            }
                            this.e = Boolean.valueOf(z);
                        }
                        if (this.e == null) {
                            this.e = Boolean.TRUE;
                            q3Var.a().o().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.e.booleanValue();
    }

    public final String C(String str, e2 e2Var) {
        return TextUtils.isEmpty(str) ? (String) e2Var.b(null) : (String) e2Var.b(this.d.f(str, e2Var.a()));
    }

    public final long D(String str, e2 e2Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) e2Var.b(null)).longValue();
        }
        String f = this.d.f(str, e2Var.a());
        if (TextUtils.isEmpty(f)) {
            return ((Long) e2Var.b(null)).longValue();
        }
        try {
            return ((Long) e2Var.b(Long.valueOf(Long.parseLong(f)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) e2Var.b(null)).longValue();
        }
    }

    public final int E(String str, e2 e2Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) e2Var.b(null)).intValue();
        }
        String f = this.d.f(str, e2Var.a());
        if (TextUtils.isEmpty(f)) {
            return ((Integer) e2Var.b(null)).intValue();
        }
        try {
            return ((Integer) e2Var.b(Integer.valueOf(Integer.parseInt(f)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) e2Var.b(null)).intValue();
        }
    }

    public final int F(String str, e2 e2Var, int i, int i2) {
        return Math.max(Math.min(E(str, e2Var), i2), i);
    }

    public final double G(String str, e2 e2Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) e2Var.b(null)).doubleValue();
        }
        String f = this.d.f(str, e2Var.a());
        if (TextUtils.isEmpty(f)) {
            return ((Double) e2Var.b(null)).doubleValue();
        }
        try {
            return ((Double) e2Var.b(Double.valueOf(Double.parseDouble(f)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) e2Var.b(null)).doubleValue();
        }
    }

    public final boolean H(String str, e2 e2Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) e2Var.b(null)).booleanValue();
        }
        String f = this.d.f(str, e2Var.a());
        return TextUtils.isEmpty(f) ? ((Boolean) e2Var.b(null)).booleanValue() : ((Boolean) e2Var.b(Boolean.valueOf("1".equals(f)))).booleanValue();
    }

    public final Bundle I() {
        try {
            q3 q3Var = this.a;
            if (q3Var.d().getPackageManager() == null) {
                q3Var.a().o().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c = G6.e.a(q3Var.d()).c(q3Var.d().getPackageName(), 128);
            if (c != null) {
                return c.metaData;
            }
            q3Var.a().o().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            this.a.a().o().b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final Boolean J(String str) {
        com.google.android.gms.common.internal.t.f(str);
        Bundle I = I();
        if (I == null) {
            this.a.a().o().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (I.containsKey(str)) {
            return Boolean.valueOf(I.getBoolean(str));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List K(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            com.google.android.gms.common.internal.t.f(r4)
            android.os.Bundle r0 = r3.I()
            r1 = 0
            if (r0 != 0) goto L1d
            k7.q3 r4 = r3.a
            k7.C2 r4 = r4.a()
            k7.A2 r4 = r4.o()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            k7.q3 r0 = r3.a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.d()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            k7.q3 r0 = r3.a
            k7.C2 r0 = r0.a()
            k7.A2 r0 = r0.o()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.m.K(java.lang.String):java.util.List");
    }

    public final boolean L() {
        this.a.c();
        Boolean J = J("firebase_analytics_collection_deactivated");
        return J != null && J.booleanValue();
    }

    public final boolean M() {
        Boolean J = J("google_analytics_adid_collection_enabled");
        return J == null || J.booleanValue();
    }

    public final boolean N() {
        Boolean J = J("google_analytics_automatic_screen_reporting_enabled");
        return J == null || J.booleanValue();
    }

    public final X3 O(String str, boolean z) {
        Object obj;
        com.google.android.gms.common.internal.t.f(str);
        q3 q3Var = this.a;
        Bundle I = I();
        if (I == null) {
            q3Var.a().o().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = I.get(str);
        }
        if (obj == null) {
            return X3.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return X3.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return X3.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return X3.POLICY;
        }
        q3Var.a().r().b("Invalid manifest metadata for", str);
        return X3.UNINITIALIZED;
    }

    public final boolean P() {
        Boolean J = J("google_analytics_sgtm_upload_enabled");
        if (J == null) {
            return false;
        }
        return J.booleanValue();
    }

    public final void Q(String str) {
        this.c = str;
    }

    public final String R() {
        return this.c;
    }

    public final String i() {
        return s("debug.firebase.analytics.app", "");
    }

    public final String j() {
        return s("debug.deferred.deeplink", "");
    }

    public final boolean k(String str) {
        return "1".equals(this.d.f(str, "gaia_collection_enabled"));
    }

    public final boolean l(String str) {
        return "1".equals(this.d.f(str, "measurement.event_sampling_enabled"));
    }

    public final boolean m() {
        if (this.b == null) {
            Boolean J = J("app_measurement_lite");
            this.b = J;
            if (J == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.G();
    }

    public final String s(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{str, ""});
            com.google.android.gms.common.internal.t.l(str3);
            return str3;
        } catch (InvocationTargetException e) {
            this.a.a().o().b("SystemProperties.get() threw an exception", e);
            return "";
        } catch (ClassNotFoundException e2) {
            this.a.a().o().b("Could not find SystemProperties class", e2);
            return "";
        } catch (IllegalAccessException e3) {
            this.a.a().o().b("Could not access SystemProperties.get()", e3);
            return "";
        } catch (NoSuchMethodException e4) {
            this.a.a().o().b("Could not find SystemProperties.get() method", e4);
            return "";
        }
    }

    public final void t(l lVar) {
        this.d = lVar;
    }

    public final String u() {
        this.a.c();
        return "FA";
    }

    public final int v() {
        return this.a.C().V(201500000, true) ? 100 : 25;
    }

    public final int w(String str) {
        return F(str, f2.Y, 25, 100);
    }

    public final int x(String str, boolean z) {
        if (z) {
            return F(str, f2.i0, 100, 500);
        }
        return 500;
    }

    public final int y(String str, boolean z) {
        return Math.max(x(str, z), 256);
    }

    public final int z(String str) {
        return F(str, f2.X, 500, 2000);
    }
}
