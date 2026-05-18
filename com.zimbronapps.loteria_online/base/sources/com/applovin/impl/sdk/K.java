package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.impl.a5;
import com.applovin.impl.c4;
import com.applovin.impl.c6;
import com.applovin.impl.d2;
import com.applovin.impl.d6;
import com.applovin.impl.e1;
import com.applovin.impl.f1;
import com.applovin.impl.f7;
import com.applovin.impl.h8;
import com.applovin.impl.i5;
import com.applovin.impl.j1;
import com.applovin.impl.j4;
import com.applovin.impl.k2;
import com.applovin.impl.k3;
import com.applovin.impl.l3;
import com.applovin.impl.l7;
import com.applovin.impl.l8;
import com.applovin.impl.m7;
import com.applovin.impl.mediation.MaxSegmentCollectionImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.n7;
import com.applovin.impl.o2;
import com.applovin.impl.p3;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.r1;
import com.applovin.impl.r3;
import com.applovin.impl.r6;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdService;
import com.applovin.impl.sdk.network.PostbackServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.impl.t5;
import com.applovin.impl.u0;
import com.applovin.impl.u3;
import com.applovin.impl.v3;
import com.applovin.impl.w3;
import com.applovin.impl.w4;
import com.applovin.impl.x4;
import com.applovin.impl.y3;
import com.applovin.impl.y4;
import com.applovin.impl.z2;
import com.applovin.impl.z4;
import com.applovin.impl.z6;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class k {
    public static k C0;
    protected static Context D0;
    private static boolean E0;
    private static final boolean G0;
    private static volatile com.applovin.impl.c H0;
    private String a;
    private String b;
    private WeakReference c;
    private final long d;
    private long e;
    private long f;
    private Long g;
    private long h;
    private com.applovin.impl.mediation.e i0;
    private final AppLovinSdkSettings j;
    private MaxSegmentCollection k;
    private List k0;
    private String l;
    private boolean p0;
    private volatile AppLovinSdk q;
    private String u0;
    private AppLovinSdkInitializationConfiguration v0;
    private AppLovinSdk.SdkInitializationListener y0;
    private AppLovinSdk.SdkInitializationListener z0;
    private static final Object I0 = new Object();
    private static final long F0 = System.currentTimeMillis();
    private final AtomicBoolean i = new AtomicBoolean();
    private final AtomicReference m = new AtomicReference();
    private final AtomicReference n = new AtomicReference();
    private final AtomicReference o = new AtomicReference();
    private final AtomicReference p = new AtomicReference();
    private final o r = new o(this);
    private final com.applovin.impl.f s = new com.applovin.impl.f(this);
    private final z2 t = new z2(this);
    private final r1 u = new r1(this);
    private final l7 v = new l7(this);
    private final AtomicReference w = new AtomicReference();
    private final AtomicReference x = new AtomicReference();
    private final AtomicReference y = new AtomicReference();
    private final AtomicReference z = new AtomicReference();
    private final AtomicReference A = new AtomicReference();
    private final AtomicReference B = new AtomicReference();
    private final AtomicReference C = new AtomicReference();
    private final AtomicReference D = new AtomicReference();
    private final AtomicReference E = new AtomicReference();
    private final AtomicReference F = new AtomicReference();
    private final AtomicReference G = new AtomicReference();
    private final AtomicReference H = new AtomicReference();
    private final AtomicReference I = new AtomicReference();
    private final AtomicReference J = new AtomicReference();
    private final AtomicReference K = new AtomicReference();
    private final AtomicReference L = new AtomicReference();
    private final AtomicReference M = new AtomicReference();
    private final AtomicReference N = new AtomicReference();
    private final AtomicReference O = new AtomicReference();
    private final AtomicReference P = new AtomicReference();
    private final AtomicReference Q = new AtomicReference();
    private final AtomicReference R = new AtomicReference();
    private final AtomicReference S = new AtomicReference();
    private final AtomicReference T = new AtomicReference();
    private final AtomicReference U = new AtomicReference();
    private final AtomicReference V = new AtomicReference();
    private final AtomicReference W = new AtomicReference();
    private final AtomicReference X = new AtomicReference();
    private final AtomicReference Y = new AtomicReference();
    private final AtomicReference Z = new AtomicReference();
    private final AtomicReference a0 = new AtomicReference();
    private final AtomicReference b0 = new AtomicReference();
    private final AtomicReference c0 = new AtomicReference();
    private final AtomicReference d0 = new AtomicReference();
    private final AtomicReference e0 = new AtomicReference();
    private final AtomicReference f0 = new AtomicReference();
    private final AtomicReference g0 = new AtomicReference();
    private final AtomicReference h0 = new AtomicReference();
    private final AtomicReference j0 = new AtomicReference();
    private final Object l0 = new Object();
    private final AtomicBoolean m0 = new AtomicBoolean(true);
    private final AtomicBoolean n0 = new AtomicBoolean();
    private final AtomicBoolean o0 = new AtomicBoolean();
    private boolean q0 = false;
    private boolean r0 = false;
    private boolean s0 = false;
    private int t0 = 0;
    private final Object w0 = new Object();
    private SdkConfigurationImpl x0 = new SdkConfigurationImpl(this);
    private final i5 A0 = new r6(this, true, "scheduleAdLoadIntegrationError", new P(this));
    private final i5 B0 = new r6(this, true, "sdkInit", new Q(this));

    public class a implements t5.b {
        public a() {
        }

        public void a(JSONObject jSONObject) {
            boolean isValid = JsonUtils.isValid(jSONObject);
            k.a(k.this, jSONObject);
            if (((Boolean) k.this.a(r3.e8)).booleanValue()) {
                k kVar = k.this;
                k.a(kVar, new com.applovin.impl.mediation.e(kVar));
            }
            k.this.m().a();
            com.applovin.impl.r0.a(jSONObject, isValid, k.this);
            Boolean bool = JsonUtils.getBoolean(jSONObject, "smd", Boolean.FALSE);
            k.this.U().a(bool.booleanValue(), JsonUtils.getInt(jSONObject, "smd_delay_sec", 2));
            k.this.D().b();
            JSONObject jSONObject2 = new JSONObject();
            JsonUtils.putString(jSONObject2, "default_browser_package_name", StringUtils.emptyIfNull(l.J()));
            JsonUtils.putBoolean(jSONObject2, "init_success", isValid);
            JsonUtils.putInt(jSONObject2, "default_preferences_key_count", PreferenceManager.getDefaultSharedPreferences(k.D0).getAll().size());
            k.this.v0().d(d2.f, CollectionUtils.map("details", jSONObject2.toString()));
            k kVar2 = k.this;
            k.a(kVar2, k.b(kVar2, jSONObject));
            if (isValid) {
                k.d(k.this).setEnabledAmazonAdUnitIds(CollectionUtils.explode(JsonUtils.getString(jSONObject, "eaaui", "")));
            }
            k.this.s0().a(jSONObject);
            k.c(k.this, jSONObject);
            t2.b(((Boolean) k.this.a(x4.w6)).booleanValue());
            t2.a(((Boolean) k.this.a(x4.x6)).booleanValue());
            k.e(k.this);
            if (!((Boolean) k.this.a(x4.d3)).booleanValue() || isValid || !com.applovin.impl.r0.a(k.o())) {
                k.g(k.this);
                return;
            }
            k.this.O();
            if (o.a()) {
                k.this.O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
            }
            k.f(k.this);
        }
    }

    public class b implements u0.c {
        public b() {
        }

        public void a(u0.b bVar) {
            k.this.O();
            if (o.a()) {
                k.this.O().a("AppLovinSdk", "Terms and Privacy Policy flow completed with status: " + bVar);
            }
            k.h(k.this).set(bVar.b());
            if (!bVar.a()) {
                k.a(k.this, "Initializing SDK in MAX environment...");
                return;
            }
            k.this.O();
            if (o.a()) {
                k.this.O().a("AppLovinSdk", "Re-initializing SDK with the updated privacy settings...");
            }
            k.this.R0();
            k.this.Q0();
        }
    }

    public class c implements t5.b {
        public c() {
        }

        public void a(JSONObject jSONObject) {
            k.a(k.this, jSONObject);
            k.c(k.this).set(false);
            k.g(k.this);
        }
    }

    public class d implements y3.a {
        final /* synthetic */ y3 a;

        public d(y3 y3Var) {
            this.a = y3Var;
        }

        public void a() {
            k.this.O();
            if (o.a()) {
                k.this.O().d("AppLovinSdk", "Connected to internet - re-initializing SDK");
            }
            synchronized (k.a(k.this)) {
                try {
                    if (!k.b(k.this)) {
                        k.this.R0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a.b(this);
        }

        public void b() {
        }
    }

    static {
        try {
            AppLovinSdkUtils.runOnUiThread(new K());
            G0 = true;
        } catch (Throwable unused) {
            G0 = false;
        }
    }

    public k(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        this.p0 = false;
        C0 = this;
        this.j = appLovinSdkSettings;
        this.d = System.currentTimeMillis();
        this.p0 = true;
        if (!F0()) {
            throw new RuntimeException("As of version 12.0.0, the AppLovin MAX SDK requires Java 8. For more information visit our docs: https://support.axon.ai/en/max/android/overview/integration");
        }
        D0 = context.getApplicationContext();
        if (context instanceof Activity) {
            this.c = new WeakReference((Activity) context);
        }
    }

    private void A0() {
        Context context = D0;
        o O = O();
        a5 p0 = p0();
        com.applovin.impl.u0 x = x();
        a(context);
        m0();
        j();
        c0();
        S().a(MaxAdapter.InitializationStatus.INITIALIZING);
        NativeCrashReporter.a(this);
        String str = this.a;
        if (str == null || str.length() != 86) {
            o.h("AppLovinSdk", "SDK key provided is invalid (" + this.a + "). Expected length: 86 characters.\n\nStack trace:\n" + Log.getStackTraceString(new Throwable()));
        }
        if (StringUtils.isValidString(this.b) && this.b.length() != 36) {
            String str2 = "Axon event key length " + this.b + " is invalid - expected 36";
            if (n7.c(this)) {
                throw new IllegalArgumentException(str2);
            }
            o.h("AppLovinSdk", str2);
        }
        if (x.l()) {
            String str3 = "Terms Flow has been replaced. " + x.g();
            if (n7.c(this)) {
                throw new IllegalStateException(str3);
            }
            o.h("AppLovinSdk", str3);
        }
        if (n7.j()) {
            o.h("AppLovinSdk", "Failed to find class for name: com.applovin.sdk.AppLovinSdk. Please ensure proguard rules have not been omitted from the build.");
        }
        if (!n7.b(this)) {
            o.h("AppLovinSdk", "Detected non-Android core JSON library. Please double-check that none of your third party libraries include custom implementation of org.json.JSONObject.");
        }
        if (n7.m(context)) {
            this.j.setVerboseLogging(true);
        }
        o0().a(x4.k, Boolean.valueOf(this.j.isVerboseLoggingEnabled()));
        w3.e(this);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        z4 z4Var = z4.c;
        if (TextUtils.isEmpty((String) p0.a(z4Var, (Object) null, defaultSharedPreferences))) {
            this.r0 = true;
            p0.b(z4Var, Boolean.toString(true), defaultSharedPreferences);
        } else {
            p0.b(z4Var, Boolean.toString(false), defaultSharedPreferences);
        }
        z4 z4Var2 = z4.d;
        if (((Boolean) p0.a(z4Var2, Boolean.FALSE)).booleanValue()) {
            if (o.a()) {
                O.a("AppLovinSdk", "Initializing SDK for non-maiden launch");
            }
            this.s0 = true;
        } else {
            if (o.a()) {
                O.a("AppLovinSdk", "Initializing SDK for maiden launch");
            }
            p0.b(z4Var2, Boolean.TRUE);
            p0.b(z4.t, Boolean.valueOf(x.j()));
        }
        z4 z4Var3 = z4.e;
        this.f = ((Long) p0.a(z4Var3, 0L)).longValue() + 1;
        p0().b(z4Var3, Long.valueOf(this.f));
        z4 z4Var4 = z4.f;
        this.g = (Long) p0.a(z4Var4, null);
        p0().b(z4Var4, Long.valueOf(F0));
        z4 z4Var5 = z4.g;
        String str4 = (String) p0.a(z4Var5, null);
        if (StringUtils.isValidString(str4)) {
            if (AppLovinSdk.VERSION_CODE > n7.g(str4)) {
                p0.b(z4Var5, AppLovinSdk.VERSION);
            }
        } else {
            p0.b(z4Var5, AppLovinSdk.VERSION);
        }
        v0().d(d2.e, CollectionUtils.map("details", "isInitProviderContextSet=" + E0));
    }

    public static boolean F0() {
        return G0;
    }

    private /* synthetic */ void I0() {
        if (q0().f()) {
            return;
        }
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Timing out adapters init...");
        }
        q0().g();
        b(true);
    }

    private /* synthetic */ void J0() {
        d6 q0 = q0();
        int i = this.t0 + 1;
        this.t0 = i;
        q0.a((i5) new t5(i, this, new c()), d6.b.CORE);
    }

    private /* synthetic */ void K0() {
        if (G0()) {
            k2.b(this);
        }
    }

    private /* synthetic */ void L0() {
        synchronized (this.l0) {
            try {
                boolean a2 = com.applovin.impl.r0.a(o());
                if (!G0()) {
                    O();
                    if (o.a()) {
                        O().a("AppLovinSdk", "non-MAX mediation detected, mediation provider is: " + V());
                    }
                }
                if (!((Boolean) a(x4.e3)).booleanValue() || a2) {
                    R0();
                }
                if (((Boolean) a(x4.d3)).booleanValue() && !a2) {
                    O();
                    if (o.a()) {
                        O().d("AppLovinSdk", "SDK initialized with no internet connection - listening for connection");
                    }
                    S0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void N0() {
        Long l = (Long) a(x4.m3);
        if (l.longValue() >= 0 && this.i.compareAndSet(false, true)) {
            h8.a(l.longValue(), false, this, new O(this));
        }
    }

    private void P0() {
        if (!G0()) {
            c("Initializing SDK in non-MAX environment...");
            return;
        }
        if (!this.n0.compareAndSet(false, true)) {
            c("Consent flow is already shown. Initializing SDK in MAX environment...");
        } else if (!x().j()) {
            c("Consent flow is not enabled. Initializing SDK in MAX environment...");
        } else {
            x().a(u0(), new b());
        }
    }

    private void S0() {
        y3 c0 = c0();
        c0.a(new d(c0));
    }

    private Map W() {
        try {
            return JsonUtils.toStringMap(new JSONObject((String) a(x4.i4)));
        } catch (JSONException unused) {
            return Collections.emptyMap();
        }
    }

    public static /* synthetic */ void a(k kVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        kVar.a(sdkInitializationListener);
    }

    public static /* synthetic */ void b(k kVar, String str) {
        kVar.b(str);
    }

    public static /* synthetic */ AtomicBoolean c(k kVar) {
        return kVar.i;
    }

    public static /* synthetic */ SdkConfigurationImpl d(k kVar) {
        return kVar.x0;
    }

    public static /* synthetic */ void e(k kVar) {
        kVar.P0();
    }

    public static /* synthetic */ void f(k kVar) {
        kVar.S0();
    }

    public static /* synthetic */ void g(k kVar) {
        kVar.N0();
    }

    public static /* synthetic */ AtomicBoolean h(k kVar) {
        return kVar.o0;
    }

    public static /* synthetic */ void i(k kVar) {
        kVar.J0();
    }

    public static /* synthetic */ void j(k kVar) {
        kVar.I0();
    }

    public static /* synthetic */ void k(k kVar) {
        kVar.K0();
    }

    public static /* synthetic */ void l(k kVar) {
        kVar.L0();
    }

    public static /* synthetic */ void m(k kVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        kVar.b(sdkInitializationListener);
    }

    public static /* synthetic */ void n(k kVar, AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        kVar.a(appLovinSdkInitializationConfiguration);
    }

    public static Context o() {
        return D0;
    }

    public l A() {
        Object obj = this.A.get();
        if (obj == null) {
            synchronized (this.A) {
                try {
                    obj = this.A.get();
                    if (obj == null) {
                        obj = new l(this);
                        this.A.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.A) {
            obj = null;
        }
        return (l) obj;
    }

    public j1 B() {
        Object obj = this.D.get();
        if (obj == null) {
            synchronized (this.D) {
                try {
                    obj = this.D.get();
                    if (obj == null) {
                        obj = new j1(this);
                        this.D.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.D) {
            obj = null;
        }
        return (j1) obj;
    }

    public boolean B0() {
        boolean z;
        synchronized (this.l0) {
            z = this.q0;
        }
        return z;
    }

    public String C() {
        return this.u0;
    }

    public boolean C0() {
        return this.r0;
    }

    public r1 D() {
        return this.u;
    }

    public boolean D0() {
        boolean z;
        synchronized (this.w0) {
            z = this.v0 != null;
        }
        return z;
    }

    public String E() {
        return w0().d();
    }

    public boolean E0() {
        boolean z;
        synchronized (this.l0) {
            z = this.p0;
        }
        return z;
    }

    public EventServiceImpl F() {
        Object obj = this.o.get();
        if (obj == null) {
            synchronized (this.o) {
                try {
                    obj = this.o.get();
                    if (obj == null) {
                        obj = new EventServiceImpl(this);
                        this.o.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.o) {
            obj = null;
        }
        return (EventServiceImpl) obj;
    }

    public m G() {
        Object obj = this.G.get();
        if (obj == null) {
            synchronized (this.G) {
                try {
                    obj = this.G.get();
                    if (obj == null) {
                        obj = new m(this);
                        this.G.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.G) {
            obj = null;
        }
        return (m) obj;
    }

    public boolean G0() {
        return StringUtils.containsIgnoreCase(V(), "max");
    }

    public n H() {
        Object obj = this.I.get();
        if (obj == null) {
            synchronized (this.I) {
                try {
                    obj = this.I.get();
                    if (obj == null) {
                        obj = new n(this);
                        this.I.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.I) {
            obj = null;
        }
        return (n) obj;
    }

    public boolean H0() {
        return n7.a("com.unity3d.player.UnityPlayerActivity");
    }

    public Activity I() {
        WeakReference weakReference;
        if (!((Boolean) a(x4.y4)).booleanValue() || (weakReference = this.c) == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public AppLovinSdkInitializationConfiguration J() {
        return this.v0;
    }

    public long K() {
        return this.d;
    }

    public Long L() {
        return this.g;
    }

    public long M() {
        return this.f;
    }

    public void M0() {
        b(false);
    }

    public o2 N() {
        Object obj = this.X.get();
        if (obj == null) {
            synchronized (this.X) {
                try {
                    obj = this.X.get();
                    if (obj == null) {
                        obj = new o2(this);
                        this.X.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.X) {
            obj = null;
        }
        return (o2) obj;
    }

    public o O() {
        return this.r;
    }

    public void O0() {
        if (StringUtils.isValidString(this.l)) {
            return;
        }
        this.l = "max";
    }

    public z2 P() {
        return this.t;
    }

    public com.applovin.impl.mediation.d Q() {
        Object obj = this.h0.get();
        if (obj == null) {
            synchronized (this.h0) {
                try {
                    obj = this.h0.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.mediation.d(this);
                        this.h0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.h0) {
            obj = null;
        }
        return (com.applovin.impl.mediation.d) obj;
    }

    public void Q0() {
        t().a();
    }

    public com.applovin.impl.mediation.e R() {
        return this.i0;
    }

    public void R0() {
        synchronized (this.l0) {
            this.p0 = true;
            q0().h();
            d();
        }
    }

    public com.applovin.impl.mediation.f S() {
        Object obj = this.c0.get();
        if (obj == null) {
            synchronized (this.c0) {
                try {
                    obj = this.c0.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.mediation.f(this);
                        this.c0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.c0) {
            obj = null;
        }
        return (com.applovin.impl.mediation.f) obj;
    }

    public com.applovin.impl.mediation.g T() {
        Object obj = this.b0.get();
        if (obj == null) {
            synchronized (this.b0) {
                try {
                    obj = this.b0.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.mediation.g(this);
                        this.b0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.b0) {
            obj = null;
        }
        return (com.applovin.impl.mediation.g) obj;
    }

    public void T0() {
        o.h("AppLovinSdk", "Resetting SDK state...");
        o0().a();
        o0().e();
        if (this.m0.compareAndSet(true, false)) {
            R0();
        } else {
            this.m0.set(true);
        }
    }

    public p3 U() {
        Object obj = this.f0.get();
        if (obj == null) {
            synchronized (this.f0) {
                try {
                    obj = this.f0.get();
                    if (obj == null) {
                        obj = new p3(this);
                        this.f0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.f0) {
            obj = null;
        }
        return (p3) obj;
    }

    public void U0() {
        if (StringUtils.isValidString(this.u0)) {
            return;
        }
        this.u0 = "max";
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Detected mediation provider: MAX");
        }
    }

    public String V() {
        return this.l;
    }

    public void V0() {
        y().n();
    }

    public void W0() {
        a((Map) null);
    }

    public MediationServiceImpl X() {
        Object obj = this.d0.get();
        if (obj == null) {
            synchronized (this.d0) {
                try {
                    obj = this.d0.get();
                    if (obj == null) {
                        obj = new MediationServiceImpl(this);
                        this.d0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.d0) {
            obj = null;
        }
        return (MediationServiceImpl) obj;
    }

    public void X0() {
        if ("admob".equalsIgnoreCase(this.l) && ((Boolean) a(x4.M3)).booleanValue()) {
            String str = (String) a(x4.L3);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            String str2 = AppLovinSdk.VERSION;
            sb.append(str2);
            sb.append(".");
            if (str.startsWith(sb.toString())) {
                return;
            }
            String str3 = "Mismatched AdMob adapter (" + str + ") and AppLovin SDK (" + str2 + ") versions detected, which may cause compatibility issues.";
            o.h("AppLovinSdk", str3);
            AppLovinSdkUtils.runOnUiThread(true, new N(this, str3));
        }
    }

    public u3 Y() {
        Object obj = this.z.get();
        if (obj == null) {
            synchronized (this.z) {
                try {
                    obj = this.z.get();
                    if (obj == null) {
                        obj = new u3(this);
                        this.z.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.z) {
            obj = null;
        }
        return (u3) obj;
    }

    public v3 Z() {
        Object obj = this.e0.get();
        if (obj == null) {
            synchronized (this.e0) {
                try {
                    obj = this.e0.get();
                    if (obj == null) {
                        obj = new v3();
                        this.e0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.e0) {
            obj = null;
        }
        return (v3) obj;
    }

    public p a0() {
        Object obj = this.g0.get();
        if (obj == null) {
            synchronized (this.g0) {
                try {
                    obj = this.g0.get();
                    if (obj == null) {
                        obj = new p(this);
                        this.g0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.g0) {
            obj = null;
        }
        return (p) obj;
    }

    public AppLovinNativeAdService b0() {
        Object obj = this.n.get();
        if (obj == null) {
            synchronized (this.n) {
                try {
                    obj = this.n.get();
                    if (obj == null) {
                        obj = new AppLovinNativeAdService(this);
                        this.n.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.n) {
            obj = null;
        }
        return (AppLovinNativeAdService) obj;
    }

    public y3 c0() {
        Object obj = this.L.get();
        if (obj == null) {
            synchronized (this.L) {
                try {
                    obj = this.L.get();
                    if (obj == null) {
                        obj = new y3(o());
                        this.L.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.L) {
            obj = null;
        }
        return (y3) obj;
    }

    public c4 d0() {
        Object obj = this.W.get();
        if (obj == null) {
            synchronized (this.W) {
                try {
                    obj = this.W.get();
                    if (obj == null) {
                        obj = new c4(this);
                        this.W.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.W) {
            obj = null;
        }
        return (c4) obj;
    }

    public j4 e0() {
        Object obj = this.S.get();
        if (obj == null) {
            synchronized (this.S) {
                try {
                    obj = this.S.get();
                    if (obj == null) {
                        obj = new j4(this);
                        this.S.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.S) {
            obj = null;
        }
        return (j4) obj;
    }

    public com.applovin.impl.sdk.network.b f0() {
        Object obj = this.Z.get();
        if (obj == null) {
            synchronized (this.Z) {
                try {
                    obj = this.Z.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.sdk.network.b(this);
                        this.Z.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.Z) {
            obj = null;
        }
        return (com.applovin.impl.sdk.network.b) obj;
    }

    public PostbackServiceImpl g0() {
        Object obj = this.Y.get();
        if (obj == null) {
            synchronized (this.Y) {
                try {
                    obj = this.Y.get();
                    if (obj == null) {
                        obj = new PostbackServiceImpl(this);
                        this.Y.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.Y) {
            obj = null;
        }
        return (PostbackServiceImpl) obj;
    }

    public String h0() {
        return w0().a();
    }

    public String i0() {
        return this.a;
    }

    public MaxSegmentCollectionImpl j0() {
        return (MaxSegmentCollectionImpl) this.k;
    }

    public Map k0() {
        MaxSegmentCollectionImpl j0 = j0();
        if (j0 == null) {
            return null;
        }
        return j0.getJsonData();
    }

    public w4 l0() {
        Object obj = this.N.get();
        if (obj == null) {
            synchronized (this.N) {
                try {
                    obj = this.N.get();
                    if (obj == null) {
                        obj = new w4(this);
                        this.N.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.N) {
            obj = null;
        }
        return (w4) obj;
    }

    public SessionTracker m0() {
        Object obj = this.H.get();
        if (obj == null) {
            synchronized (this.H) {
                try {
                    obj = this.H.get();
                    if (obj == null) {
                        obj = new SessionTracker(this);
                        this.H.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.H) {
            obj = null;
        }
        return (SessionTracker) obj;
    }

    public AppLovinSdkSettings n0() {
        return this.j;
    }

    public y4 o0() {
        Object obj = this.x.get();
        if (obj == null) {
            synchronized (this.x) {
                try {
                    obj = this.x.get();
                    if (obj == null) {
                        obj = new y4(this);
                        this.x.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.x) {
            obj = null;
        }
        return (y4) obj;
    }

    public i p() {
        Object obj = this.O.get();
        if (obj == null) {
            synchronized (this.O) {
                try {
                    obj = this.O.get();
                    if (obj == null) {
                        obj = new i(this);
                        this.O.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.O) {
            obj = null;
        }
        return (i) obj;
    }

    public a5 p0() {
        Object obj = this.B.get();
        if (obj == null) {
            synchronized (this.B) {
                try {
                    obj = this.B.get();
                    if (obj == null) {
                        obj = new a5(this);
                        this.B.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.B) {
            obj = null;
        }
        return (a5) obj;
    }

    public String q() {
        return this.b;
    }

    public d6 q0() {
        Object obj = this.w.get();
        if (obj == null) {
            synchronized (this.w) {
                try {
                    obj = this.w.get();
                    if (obj == null) {
                        obj = new d6(this);
                        this.w.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.w) {
            obj = null;
        }
        return (d6) obj;
    }

    public String r() {
        return w0().b();
    }

    public z6 r0() {
        Object obj = this.Q.get();
        if (obj == null) {
            synchronized (this.Q) {
                try {
                    obj = this.Q.get();
                    if (obj == null) {
                        obj = new z6(this);
                        this.Q.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.Q) {
            obj = null;
        }
        return (z6) obj;
    }

    public CmpServiceImpl s() {
        Object obj = this.p.get();
        if (obj == null) {
            synchronized (this.p) {
                try {
                    obj = this.p.get();
                    if (obj == null) {
                        obj = new CmpServiceImpl(this);
                        this.p.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.p) {
            obj = null;
        }
        return (CmpServiceImpl) obj;
    }

    public f7 s0() {
        Object obj = this.j0.get();
        if (obj == null) {
            synchronized (this.j0) {
                try {
                    obj = this.j0.get();
                    if (obj == null) {
                        obj = new f7(this);
                        this.j0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.j0) {
            obj = null;
        }
        return (f7) obj;
    }

    public j t() {
        Object obj = this.M.get();
        if (obj == null) {
            synchronized (this.M) {
                try {
                    obj = this.M.get();
                    if (obj == null) {
                        obj = new j(this);
                        this.M.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.M) {
            obj = null;
        }
        return (j) obj;
    }

    public long t0() {
        if (this.h == 0) {
            return -1L;
        }
        return System.currentTimeMillis() - this.h;
    }

    public String toString() {
        return "CoreSdk{sdkKey='" + this.a + "', enabled=" + this.q0 + ", isFirstSession=" + this.r0 + '}';
    }

    public String u() {
        return w0().c();
    }

    public Activity u0() {
        Activity b2 = a(o()).b();
        return b2 != null ? b2 : I();
    }

    public SdkConfigurationImpl v() {
        return this.x0;
    }

    public l7 v0() {
        return this.v;
    }

    public com.applovin.impl.q0 w() {
        Object obj = this.y.get();
        if (obj == null) {
            synchronized (this.y) {
                try {
                    obj = this.y.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.q0(this);
                        this.y.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.y) {
            obj = null;
        }
        return (com.applovin.impl.q0) obj;
    }

    public m7 w0() {
        Object obj = this.C.get();
        if (obj == null) {
            synchronized (this.C) {
                try {
                    obj = this.C.get();
                    if (obj == null) {
                        obj = new m7(this);
                        this.C.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.C) {
            obj = null;
        }
        return (m7) obj;
    }

    public com.applovin.impl.u0 x() {
        Object obj = this.P.get();
        if (obj == null) {
            synchronized (this.P) {
                try {
                    obj = this.P.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.u0(this);
                        this.P.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.P) {
            obj = null;
        }
        return (com.applovin.impl.u0) obj;
    }

    public l8 x0() {
        Object obj = this.K.get();
        if (obj == null) {
            synchronized (this.K) {
                try {
                    obj = this.K.get();
                    if (obj == null) {
                        obj = new l8(this);
                        this.K.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.K) {
            obj = null;
        }
        return (l8) obj;
    }

    public e1 y() {
        Object obj = this.R.get();
        if (obj == null) {
            synchronized (this.R) {
                try {
                    obj = this.R.get();
                    if (obj == null) {
                        obj = new e1(this);
                        this.R.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.R) {
            obj = null;
        }
        return (e1) obj;
    }

    public AppLovinSdk y0() {
        return this.q;
    }

    public f1 z() {
        Object obj = this.T.get();
        if (obj == null) {
            synchronized (this.T) {
                try {
                    obj = this.T.get();
                    if (obj == null) {
                        obj = new f1(this);
                        this.T.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.T) {
            obj = null;
        }
        return (f1) obj;
    }

    public boolean z0() {
        return this.s0;
    }

    public static /* synthetic */ void a(k kVar, JSONObject jSONObject) {
        kVar.c(jSONObject);
    }

    public static /* synthetic */ boolean b(k kVar) {
        return kVar.p0;
    }

    public static /* synthetic */ void c(k kVar, JSONObject jSONObject) {
        kVar.b(jSONObject);
    }

    private void d() {
        d6 q0 = q0();
        int i = this.t0 + 1;
        this.t0 = i;
        q0.a((i5) new t5(i, this, new a()), d6.b.CORE);
    }

    public static long n() {
        return F0;
    }

    public com.applovin.impl.c e() {
        return a(D0);
    }

    public com.applovin.impl.sdk.a f() {
        Object obj = this.F.get();
        if (obj == null) {
            synchronized (this.F) {
                try {
                    obj = this.F.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.sdk.a(this);
                        this.F.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.F) {
            obj = null;
        }
        return (com.applovin.impl.sdk.a) obj;
    }

    public com.applovin.impl.f g() {
        return this.s;
    }

    public com.applovin.impl.sdk.d h() {
        Object obj = this.U.get();
        if (obj == null) {
            synchronized (this.U) {
                try {
                    obj = this.U.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.sdk.d(this);
                        this.U.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.U) {
            obj = null;
        }
        return (com.applovin.impl.sdk.d) obj;
    }

    public e i() {
        Object obj = this.E.get();
        if (obj == null) {
            synchronized (this.E) {
                try {
                    obj = this.E.get();
                    if (obj == null) {
                        obj = new e(this);
                        this.E.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.E) {
            obj = null;
        }
        return (e) obj;
    }

    public com.applovin.impl.j j() {
        Object obj = this.a0.get();
        if (obj == null) {
            synchronized (this.a0) {
                try {
                    obj = this.a0.get();
                    if (obj == null) {
                        obj = new com.applovin.impl.j(this);
                        this.a0.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.a0) {
            obj = null;
        }
        return (com.applovin.impl.j) obj;
    }

    public AppLovinAdServiceImpl k() {
        Object obj = this.m.get();
        if (obj == null) {
            synchronized (this.m) {
                try {
                    obj = this.m.get();
                    if (obj == null) {
                        obj = new AppLovinAdServiceImpl(this);
                        this.m.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.m) {
            obj = null;
        }
        return (AppLovinAdServiceImpl) obj;
    }

    public g l() {
        Object obj = this.J.get();
        if (obj == null) {
            synchronized (this.J) {
                try {
                    obj = this.J.get();
                    if (obj == null) {
                        obj = new g(this);
                        this.J.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.J) {
            obj = null;
        }
        return (g) obj;
    }

    public h m() {
        Object obj = this.V.get();
        if (obj == null) {
            synchronized (this.V) {
                try {
                    obj = this.V.get();
                    if (obj == null) {
                        obj = new h(this);
                        this.V.set(obj);
                    }
                } finally {
                }
            }
        }
        if (obj == this.V) {
            obj = null;
        }
        return (h) obj;
    }

    public static /* synthetic */ void a(k kVar, String str) {
        kVar.c(str);
    }

    public static /* synthetic */ List b(k kVar, JSONObject jSONObject) {
        return kVar.a(jSONObject);
    }

    private void c(JSONObject jSONObject) {
        if (JsonUtils.isValid(jSONObject)) {
            this.h = System.currentTimeMillis();
            com.applovin.impl.r0.c(jSONObject, this);
            com.applovin.impl.r0.b(jSONObject, this);
            com.applovin.impl.r0.a(jSONObject, this);
            l3.f(jSONObject, this);
            l3.d(jSONObject, this);
            l3.e(jSONObject, this);
            l3.g(jSONObject, this);
        }
    }

    public static /* synthetic */ com.applovin.impl.mediation.e a(k kVar, com.applovin.impl.mediation.e eVar) {
        kVar.i0 = eVar;
        return eVar;
    }

    public static void b(Context context) {
        if (context == null) {
            return;
        }
        D0 = context.getApplicationContext();
        E0 = true;
    }

    public static /* synthetic */ Object a(k kVar) {
        return kVar.l0;
    }

    public static /* synthetic */ List a(k kVar, List list) {
        kVar.k0 = list;
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration) {
        A0();
        this.j.attachAppLovinSdk(this);
        String pluginVersion = appLovinSdkInitializationConfiguration.getPluginVersion();
        if (pluginVersion != null) {
            o.g("AppLovinSdk", "Setting plugin version: " + pluginVersion);
            o0().a(x4.L3, pluginVersion);
        }
        if (appLovinSdkInitializationConfiguration.isExceptionHandlerEnabled() && ((Boolean) a(x4.s)).booleanValue()) {
            AppLovinExceptionHandler.shared().addSdk(this);
            AppLovinExceptionHandler.shared().enable();
        }
        d6 q0 = q0();
        i5 i5Var = this.A0;
        d6.b bVar = d6.b.CORE;
        q0.a(i5Var, bVar);
        q0().a(this.B0, bVar);
    }

    public void a(AppLovinSdk appLovinSdk) {
        this.q = appLovinSdk;
    }

    public static String a(String str) {
        return a(str, (List) null);
    }

    public static String a(int i) {
        return a(i, (List) null);
    }

    public static String a(String str, List list) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Context o = o();
        return a(o.getResources().getIdentifier(str, "string", o.getPackageName()), list);
    }

    private void c(String str) {
        O();
        if (o.a()) {
            O().a("AppLovinSdk", str);
        }
        q0().a(new c6(this));
    }

    public static String a(int i, List list) {
        String string = o().getResources().getString(i);
        return list != null ? String.format(string, list.toArray()) : string;
    }

    public void c() {
        synchronized (this.l0) {
            try {
                if (!this.p0 && !this.q0) {
                    R0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void b(JSONObject jSONObject) {
        Iterator it = JsonUtils.getList(jSONObject, "error_messages", Collections.emptyList()).iterator();
        while (it.hasNext()) {
            o.h("AppLovinSdk", (String) it.next());
        }
    }

    public static com.applovin.impl.c a(Context context) {
        if (H0 == null) {
            synchronized (I0) {
                try {
                    if (H0 == null) {
                        H0 = new com.applovin.impl.c(context);
                    }
                } finally {
                }
            }
        }
        return H0;
    }

    private /* synthetic */ void b(String str) {
        if (!n7.c(this)) {
            HashMap hashMap = new HashMap();
            hashMap.put("details", "admob");
            hashMap.put("error_message", str);
            D().a(d2.S0, "adapterVersionMismatch", (Map) hashMap);
            return;
        }
        throw new IllegalStateException(str);
    }

    public List c(x4 x4Var) {
        return o0().c(x4Var);
    }

    public void c(z4 z4Var) {
        p0().b(z4Var);
    }

    public void a(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        synchronized (this.w0) {
            try {
                if (this.v0 != null) {
                    o.h("AppLovinSdk", "AppLovin SDK already initialized with configuration: " + this.v0 + ". Ignoring the provided initialization configuration.");
                    if (!B0() || sdkInitializationListener == null) {
                        return;
                    }
                    AppLovinSdkUtils.runOnUiThread(new I(this, sdkInitializationListener));
                    return;
                }
                this.e = System.currentTimeMillis();
                this.v0 = appLovinSdkInitializationConfiguration;
                this.y0 = sdkInitializationListener;
                this.a = appLovinSdkInitializationConfiguration.getSdkKey();
                this.b = appLovinSdkInitializationConfiguration.getAxonEventKey();
                this.l = appLovinSdkInitializationConfiguration.getMediationProvider();
                this.k = appLovinSdkInitializationConfiguration.getSegmentCollection();
                n7.a((Runnable) new J(this, appLovinSdkInitializationConfiguration));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(boolean z) {
        AppLovinSdk.SdkInitializationListener sdkInitializationListener;
        if (x().i() || (sdkInitializationListener = this.y0) == null) {
            return;
        }
        if (B0()) {
            this.y0 = null;
            this.z0 = null;
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS);
        } else {
            if (this.z0 == sdkInitializationListener) {
                return;
            }
            S().a(MaxAdapter.InitializationStatus.INITIALIZED_FAILURE);
            if (((Boolean) a(x4.p)).booleanValue()) {
                this.y0 = null;
            } else {
                this.z0 = sdkInitializationListener;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putBoolean(jSONObject, "enabled", B0());
        JsonUtils.putBoolean(jSONObject, "timeout", z);
        JsonUtils.putBoolean(jSONObject, "consent_flow_shown", this.o0.get());
        long currentTimeMillis = System.currentTimeMillis() - this.e;
        Map hashMap = new HashMap();
        hashMap.put("duration_ms", String.valueOf(currentTimeMillis));
        hashMap.put("details", jSONObject.toString());
        this.v.d(d2.j, hashMap);
        AppLovinSdkUtils.runOnUiThreadDelayed(new L(this, sdkInitializationListener), Math.max(0L, ((Long) a(x4.q)).longValue()));
    }

    private /* synthetic */ void a(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        sdkInitializationListener.onSdkInitialized(this.x0);
    }

    private List a(JSONObject jSONObject) {
        List asList = Arrays.asList(JsonUtils.getString(jSONObject, "eaf", "").split(","));
        ArrayList arrayList = new ArrayList(asList.size());
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            MaxAdFormat formatFromString = MaxAdFormat.formatFromString((String) it.next());
            if (formatFromString != null) {
                arrayList.add(formatFromString);
            }
        }
        return arrayList;
    }

    private /* synthetic */ void b(AppLovinSdk.SdkInitializationListener sdkInitializationListener) {
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "Calling back publisher's initialization completion handler...");
        }
        sdkInitializationListener.onSdkInitialized(this.x0);
    }

    public void a(boolean z) {
        synchronized (this.l0) {
            this.p0 = false;
            this.q0 = z;
        }
        if (z) {
            List a2 = w3.a(this);
            if (a2.isEmpty()) {
                q0().g();
                M0();
                return;
            }
            Long l = (Long) a(r3.o7);
            r6 r6Var = new r6(this, true, "timeoutInitAdapters", new M(this));
            O();
            if (o.a()) {
                O().a("AppLovinSdk", "Waiting for required adapters to init: " + a2 + " - timing out in " + l + "ms...");
            }
            q0().a(r6Var, d6.b.TIMEOUT, l.longValue(), true);
        }
    }

    public List b(x4 x4Var) {
        return o0().b(x4Var);
    }

    public void b(z4 z4Var, Object obj) {
        p0().b(z4Var, obj);
    }

    public Object b(z4 z4Var) {
        return p0().a(z4Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006d, code lost:
    
        r12 = r4.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (r12.hasNext() == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007b, code lost:
    
        r13 = (java.util.Map.Entry) r12.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (r11.startsWith((java.lang.String) r13.getKey()) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        r15.u0 = (java.lang.String) r13.getValue();
        O();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009c, code lost:
    
        if (com.applovin.impl.sdk.o.a() == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        O().a("AppLovinSdk", "Detected mediation provider: " + r15.u0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        if (r6.booleanValue() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        r2.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c2, code lost:
    
        r8 = java.lang.Integer.valueOf(r8.intValue() - 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String b() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.k.b():java.lang.String");
    }

    public void a(k3 k3Var) {
        if (q0().f()) {
            return;
        }
        List a2 = w3.a(this);
        if (a2.size() <= 0 || !S().a().containsAll(a2)) {
            return;
        }
        O();
        if (o.a()) {
            O().a("AppLovinSdk", "All required adapters initialized");
        }
        q0().g();
        M0();
    }

    public boolean a(MaxAdFormat maxAdFormat) {
        List list = this.k0;
        return (list == null || list.size() <= 0 || this.k0.contains(maxAdFormat)) ? false : true;
    }

    public void a() {
        String str = (String) p0().a(z4.g, null);
        if (StringUtils.isValidString(str)) {
            if (AppLovinSdk.VERSION_CODE < n7.g(str)) {
                o.h("AppLovinSdk", "Current version (" + AppLovinSdk.VERSION + ") is older than earlier installed version (" + str + "), which may cause compatibility issues.");
            }
        }
    }

    public Object a(x4 x4Var) {
        return o0().a(x4Var);
    }

    public boolean a(x4 x4Var, MaxAdFormat maxAdFormat) {
        return b(x4Var).contains(maxAdFormat);
    }

    public void a(Map map) {
        U().a(map);
    }

    public void a(Uri uri) {
        B().a(uri);
    }

    public void a(String str, Object obj, SharedPreferences.Editor editor) {
        p0().a(str, obj, editor);
    }

    public Object a(z4 z4Var) {
        return a(z4Var, (Object) null);
    }

    public Object a(z4 z4Var, Object obj) {
        return p0().a(z4Var, obj);
    }

    public Object a(String str, Object obj, Class cls, SharedPreferences sharedPreferences) {
        return a5.a(str, obj, cls, sharedPreferences);
    }

    public void a(SharedPreferences sharedPreferences) {
        p0().a(sharedPreferences);
    }
}
