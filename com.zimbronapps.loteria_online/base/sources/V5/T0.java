package V5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzcdp;
import com.google.android.gms.internal.ads.zzcei;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class t0 implements q0 {
    public boolean b;
    public x7.e d;
    public SharedPreferences f;
    public SharedPreferences.Editor g;
    public String i;
    public String j;
    public final Object a = new Object();
    public final List c = new ArrayList();
    public zzbee e = null;
    public boolean h = true;
    public boolean k = true;
    public String l = "-1";
    public int m = -1;
    public zzcdp n = new zzcdp("", 0);
    public long o = 0;
    public long p = 0;
    public int q = -1;
    public int r = 0;
    public Set s = Collections.emptySet();
    public JSONObject t = new JSONObject();
    public boolean u = true;
    public boolean v = true;
    public String w = null;
    public String x = "";
    public boolean y = false;
    public String z = "";
    public String A = "{}";
    public int B = -1;
    public int C = -1;
    public long D = 0;
    public boolean E = false;

    public final void a(int i) {
        p();
        synchronized (this.a) {
            try {
                this.m = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(String str) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkq)).booleanValue()) {
            p();
            synchronized (this.a) {
                try {
                    if (this.x.equals(str)) {
                        return;
                    }
                    this.x = str;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.g.apply();
                    }
                    q();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(boolean z) {
        p();
        synchronized (this.a) {
            try {
                if (this.E) {
                    return;
                }
                this.E = true;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("is_install_referrer_reported", true);
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(boolean z) {
        p();
        synchronized (this.a) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + ((Long) S5.D.c().zzd(zzbhe.zzlU)).longValue();
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z);
                    this.g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(long j) {
        p();
        synchronized (this.a) {
            try {
                if (this.D == j) {
                    return;
                }
                this.D = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j);
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(String str) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkF)).booleanValue()) {
            p();
            synchronized (this.a) {
                try {
                    if (this.z.equals(str)) {
                        return;
                    }
                    this.z = str;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.g.apply();
                    }
                    q();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void g(int i) {
        p();
        synchronized (this.a) {
            try {
                if (this.C == i) {
                    return;
                }
                this.C = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(String str) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkT)).booleanValue()) {
            p();
            synchronized (this.a) {
                try {
                    if (this.A.equals(str)) {
                        return;
                    }
                    this.A = str;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.g.apply();
                    }
                    q();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void i(String str) {
        p();
        synchronized (this.a) {
            try {
                this.l = str;
                if (this.g != null) {
                    if (str.equals("-1")) {
                        this.g.remove("IABTCF_TCString");
                    } else {
                        this.g.putString("IABTCF_TCString", str);
                    }
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(int i) {
        p();
        synchronized (this.a) {
            try {
                if (this.q == i) {
                    return;
                }
                this.q = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i);
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("template_id", r9);
        r3.put("uses_media_view", r10);
        r3.put("timestamp_ms", R5.t.o().a());
        r1.put(r2, r3);
        r7.t.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        r10 = V5.o0.b;
        W5.p.g("Could not update native advanced settings", r8);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(java.lang.String r8, java.lang.String r9, boolean r10) {
        /*
            r7 = this;
            r7.p()
            java.lang.Object r0 = r7.a
            monitor-enter(r0)
            org.json.JSONObject r1 = r7.t     // Catch: java.lang.Throwable -> L14
            org.json.JSONArray r1 = r1.optJSONArray(r8)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L17
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r8 = move-exception
            goto L8e
        L17:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L14
            r3 = 0
            r4 = r3
        L1d:
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L14
            if (r4 >= r5) goto L48
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2b:
            java.lang.String r6 = "template_id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L14
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L45
            if (r10 == 0) goto L43
            java.lang.String r2 = "uses_media_view"
            boolean r2 = r5.optBoolean(r2, r3)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L43:
            r2 = r4
            goto L48
        L45:
            int r4 = r4 + 1
            goto L1d
        L48:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r3.<init>()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r4 = "template_id"
            r3.put(r4, r9)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r9 = "uses_media_view"
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r9 = "timestamp_ms"
            E6.f r10 = R5.t.o()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            long r4 = r10.a()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r3.put(r9, r4)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            org.json.JSONObject r9 = r7.t     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r9.put(r8, r1)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            goto L75
        L6d:
            r8 = move-exception
            java.lang.String r9 = "Could not update native advanced settings"
            int r10 = V5.o0.b     // Catch: java.lang.Throwable -> L14
            W5.p.g(r9, r8)     // Catch: java.lang.Throwable -> L14
        L75:
            android.content.SharedPreferences$Editor r8 = r7.g     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L89
            java.lang.String r9 = "native_advanced_settings"
            org.json.JSONObject r10 = r7.t     // Catch: java.lang.Throwable -> L14
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L14
            r8.putString(r9, r10)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r8 = r7.g     // Catch: java.lang.Throwable -> L14
            r8.apply()     // Catch: java.lang.Throwable -> L14
        L89:
            r7.q()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L8e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V5.t0.k(java.lang.String, java.lang.String, boolean):void");
    }

    public final void l(Runnable runnable) {
        this.c.add(runnable);
    }

    public final void m(long j) {
        p();
        synchronized (this.a) {
            try {
                if (this.p == j) {
                    return;
                }
                this.p = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j);
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzbee n() {
        if (!this.b) {
            return null;
        }
        if ((zzc() && zze()) || !((Boolean) zzbiv.zzb.zze()).booleanValue()) {
            return null;
        }
        synchronized (this.a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.e == null) {
                    this.e = new zzbee();
                }
                this.e.zza();
                int i = o0.b;
                W5.p.e("start fetching content...");
                return this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void o(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            synchronized (this.a) {
                try {
                    this.f = sharedPreferences;
                    this.g = edit;
                    NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    this.h = this.f.getBoolean("use_https", this.h);
                    this.u = this.f.getBoolean("content_url_opted_out", this.u);
                    this.i = this.f.getString("content_url_hashes", this.i);
                    this.k = this.f.getBoolean("gad_idless", this.k);
                    this.v = this.f.getBoolean("content_vertical_opted_out", this.v);
                    this.j = this.f.getString("content_vertical_hashes", this.j);
                    this.r = this.f.getInt("version_code", this.r);
                    if (((Boolean) zzbiw.zzg.zze()).booleanValue() && S5.D.c().zzc()) {
                        this.n = new zzcdp("", 0L);
                    } else {
                        this.n = new zzcdp(this.f.getString("app_settings_json", this.n.zzd()), this.f.getLong("app_settings_last_update_ms", this.n.zzb()));
                    }
                    this.o = this.f.getLong("app_last_background_time_ms", this.o);
                    this.q = this.f.getInt("request_in_session_count", this.q);
                    this.p = this.f.getLong("first_ad_req_time_ms", this.p);
                    this.s = this.f.getStringSet("never_pool_slots", this.s);
                    this.w = this.f.getString("display_cutout", this.w);
                    this.B = this.f.getInt("app_measurement_npa", this.B);
                    this.C = this.f.getInt("sd_app_measure_npa", this.C);
                    this.D = this.f.getLong("sd_app_measure_npa_ts", this.D);
                    this.x = this.f.getString("inspector_info", this.x);
                    this.y = this.f.getBoolean("linked_device", this.y);
                    this.z = this.f.getString("linked_ad_unit", this.z);
                    this.A = this.f.getString("inspector_ui_storage", this.A);
                    this.l = this.f.getString("IABTCF_TCString", this.l);
                    this.m = this.f.getInt("gad_has_consent_for_cookies", this.m);
                    this.E = this.f.getBoolean("is_install_referrer_reported", this.E);
                    try {
                        this.t = new JSONObject(this.f.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e) {
                        int i = o0.b;
                        W5.p.g("Could not convert native advanced settings to json object", e);
                    }
                    q();
                } finally {
                }
            }
        } catch (Throwable th) {
            R5.t.l().zzg(th, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            o0.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th);
        }
    }

    public final void p() {
        x7.e eVar = this.d;
        if (eVar == null || eVar.isDone()) {
            return;
        }
        try {
            this.d.get(1L, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            e = e;
            int i = o0.b;
            W5.p.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e2) {
            e = e2;
            int i2 = o0.b;
            W5.p.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (CancellationException e3) {
            e = e3;
            int i22 = o0.b;
            W5.p.d("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (InterruptedException e4) {
            Thread.currentThread().interrupt();
            int i3 = o0.b;
            W5.p.g("Interrupted while waiting for preferences loaded.", e4);
        }
    }

    public final void q() {
        zzcei.zza.execute(new r0(this));
    }

    public final String zzB() {
        p();
        return this.l;
    }

    public final int zzD() {
        p();
        return this.m;
    }

    public final long zzF() {
        long j;
        p();
        synchronized (this.a) {
            j = this.D;
        }
        return j;
    }

    public final String zzH() {
        String str;
        p();
        synchronized (this.a) {
            str = this.x;
        }
        return str;
    }

    public final boolean zzJ() {
        boolean z;
        p();
        synchronized (this.a) {
            z = this.y;
        }
        return z;
    }

    public final void zzK(boolean z) {
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkF)).booleanValue()) {
            p();
            synchronized (this.a) {
                try {
                    if (this.y == z) {
                        return;
                    }
                    this.y = z;
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z);
                        this.g.apply();
                    }
                    q();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String zzL() {
        String str;
        p();
        synchronized (this.a) {
            str = this.z;
        }
        return str;
    }

    public final String zzN() {
        String str;
        p();
        synchronized (this.a) {
            str = this.A;
        }
        return str;
    }

    public final boolean zzP() {
        boolean z;
        p();
        synchronized (this.a) {
            z = this.E;
        }
        return z;
    }

    public final void zza(Context context) {
        synchronized (this.a) {
            try {
                if (this.f != null) {
                    return;
                }
                this.d = zzcei.zza.submit(new s0(this, context, "admob"));
                this.b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzb(boolean z) {
        p();
        synchronized (this.a) {
            try {
                if (this.u == z) {
                    return;
                }
                this.u = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z);
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc() {
        boolean z;
        p();
        synchronized (this.a) {
            z = this.u;
        }
        return z;
    }

    public final void zzd(boolean z) {
        p();
        synchronized (this.a) {
            try {
                if (this.v == z) {
                    return;
                }
                this.v = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z);
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zze() {
        boolean z;
        p();
        synchronized (this.a) {
            z = this.v;
        }
        return z;
    }

    public final void zzf(int i) {
        p();
        synchronized (this.a) {
            try {
                if (this.r == i) {
                    return;
                }
                this.r = i;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putInt("version_code", i);
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zzg() {
        int i;
        p();
        synchronized (this.a) {
            i = this.r;
        }
        return i;
    }

    public final void zzh(String str) {
        p();
        synchronized (this.a) {
            try {
                long a = R5.t.o().a();
                if (str != null && !str.equals(this.n.zzd())) {
                    this.n = new zzcdp(str, a);
                    SharedPreferences.Editor editor = this.g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.g.putLong("app_settings_last_update_ms", a);
                        this.g.apply();
                    }
                    q();
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.n.zza(a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzcdp zzi() {
        zzcdp zzcdpVar;
        p();
        synchronized (this.a) {
            try {
                if (((Boolean) S5.D.c().zzd(zzbhe.zzne)).booleanValue() && this.n.zzj()) {
                    Iterator it = this.c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                zzcdpVar = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcdpVar;
    }

    public final zzcdp zzj() {
        zzcdp zzcdpVar;
        synchronized (this.a) {
            zzcdpVar = this.n;
        }
        return zzcdpVar;
    }

    public final void zzl(long j) {
        p();
        synchronized (this.a) {
            try {
                if (this.o == j) {
                    return;
                }
                this.o = j;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j);
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long zzm() {
        long j;
        p();
        synchronized (this.a) {
            j = this.o;
        }
        return j;
    }

    public final int zzo() {
        int i;
        p();
        synchronized (this.a) {
            i = this.q;
        }
        return i;
    }

    public final long zzq() {
        long j;
        p();
        synchronized (this.a) {
            j = this.p;
        }
        return j;
    }

    public final JSONObject zzs() {
        JSONObject jSONObject;
        p();
        synchronized (this.a) {
            jSONObject = this.t;
        }
        return jSONObject;
    }

    public final void zzt() {
        p();
        synchronized (this.a) {
            try {
                this.t = new JSONObject();
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String zzu() {
        String str;
        p();
        synchronized (this.a) {
            str = this.w;
        }
        return str;
    }

    public final void zzv(String str) {
        p();
        synchronized (this.a) {
            try {
                if (TextUtils.equals(this.w, str)) {
                    return;
                }
                this.w = str;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzw(boolean z) {
        p();
        synchronized (this.a) {
            try {
                if (z == this.k) {
                    return;
                }
                this.k = z;
                SharedPreferences.Editor editor = this.g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z);
                    this.g.apply();
                }
                q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzx() {
        boolean z;
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzbd)).booleanValue()) {
            return false;
        }
        p();
        synchronized (this.a) {
            z = this.k;
        }
        return z;
    }

    public final boolean zzz() {
        p();
        synchronized (this.a) {
            try {
                SharedPreferences sharedPreferences = this.f;
                boolean z = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.k) {
                    z = true;
                }
                return z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
