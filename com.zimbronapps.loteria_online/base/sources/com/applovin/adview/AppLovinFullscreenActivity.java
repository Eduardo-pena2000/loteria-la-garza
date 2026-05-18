package com.applovin.adview;

import T1.R0;
import T1.a1;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import android.window.OnBackInvokedCallback;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.d2;
import com.applovin.impl.e8;
import com.applovin.impl.f2;
import com.applovin.impl.g;
import com.applovin.impl.g0;
import com.applovin.impl.n1;
import com.applovin.impl.n2;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w1;
import com.applovin.impl.x4;
import com.applovin.impl.z4;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import d.v;
import j.l;
import j.m;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import q.I;
import q.J;
import q.K;
import q.L;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AppLovinFullscreenActivity extends Activity implements n1 {
    private static final Set h = Collections.newSetFromMap(new WeakHashMap());
    private static final Object i = new Object();

    @SuppressLint({"StaticFieldLeak"})
    public static n2 parentInterstitialWrapper;
    private k a;
    private w1 b;
    private final AtomicBoolean c = new AtomicBoolean(true);
    private com.applovin.impl.adview.activity.a d;
    private c e;
    private g0 f;
    private long g;

    public class a implements View.OnApplyWindowInsetsListener {
        final /* synthetic */ Boolean a;
        final /* synthetic */ boolean b;
        final /* synthetic */ com.applovin.impl.sdk.ad.b c;

        public a(Boolean bool, boolean z, com.applovin.impl.sdk.ad.b bVar) {
            this.a = bool;
            this.b = z;
            this.c = bVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            if (this.a.booleanValue()) {
                AppLovinFullscreenActivity.a(AppLovinFullscreenActivity.this, windowInsets);
            }
            if (this.b) {
                int intValue = ((Integer) AppLovinFullscreenActivity.a(AppLovinFullscreenActivity.this).a(x4.u2)).intValue();
                Insets a = R0.a(windowInsets, this.c.F0() ? intValue & (~a1.a()) : intValue | a1.a());
                view.setPadding(I.a(a), J.a(a), K.a(a), L.a(a));
            } else {
                Insets a2 = R0.a(windowInsets, ((Integer) AppLovinFullscreenActivity.a(AppLovinFullscreenActivity.this).a(x4.u2)).intValue());
                view.setPadding(I.a(a2), J.a(a2), K.a(a2), L.a(a2));
            }
            return windowInsets;
        }
    }

    public static class c implements OnBackInvokedCallback {
        private final Runnable a;

        public c(Runnable runnable) {
            this.a = runnable;
        }

        public void onBackInvoked() {
            this.a.run();
        }
    }

    public static /* synthetic */ void a(AppLovinFullscreenActivity appLovinFullscreenActivity, n2 n2Var) {
        appLovinFullscreenActivity.a(n2Var);
    }

    public static /* synthetic */ void b(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        appLovinFullscreenActivity.c();
    }

    public static /* synthetic */ void c(AppLovinFullscreenActivity appLovinFullscreenActivity, Long l) {
        appLovinFullscreenActivity.a(l);
    }

    public void dismiss(String str) {
        if (o0.j() && this.e != null) {
            j.k.a(l.a(this), this.e);
            this.e = null;
        }
        w1 w1Var = this.b;
        if (w1Var != null) {
            w1Var.a(str);
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        c();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w1 w1Var = this.b;
        if (w1Var != null) {
            w1Var.a(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            o.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss("activity_destroyed_while_in_background");
            return;
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            o.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View findViewById = findViewById(16908290);
        findViewById.setBackgroundColor(-16777216);
        if (TextUtils.isEmpty(getIntent().getStringExtra("com.applovin.interstitial.sdk_key"))) {
            n2 n2Var = parentInterstitialWrapper;
            if (n2Var != null && n2Var.f() != null) {
                n2.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", (Throwable) null, this);
            }
            finish();
            return;
        }
        this.a = AppLovinSdk.getInstance(this).a();
        n2 n2Var2 = parentInterstitialWrapper;
        com.applovin.impl.sdk.ad.b f = n2Var2 != null ? n2Var2.f() : null;
        Boolean bool = (Boolean) this.a.a(x4.E4);
        boolean z = f != null && f.L0();
        if (o0.b() && (bool.booleanValue() || z)) {
            com.applovin.adview.a.a(getWindow(), false);
            findViewById.setOnApplyWindowInsetsListener(new a(bool, z, f));
            a(f);
        } else {
            findViewById.setFitsSystemWindows(true);
            if (o0.b()) {
                e8.a(findViewById, this.a);
            }
            a(f);
        }
        if (f != null && f.r0()) {
            g.a(f, this, this.a);
        }
        if (o0.j() && ((Boolean) this.a.a(x4.g6)).booleanValue()) {
            this.e = new c(new com.applovin.adview.c(this));
            m.a(l.a(this), 0, this.e);
        }
        a();
        b();
        Integer num = (Integer) this.a.a(x4.H6);
        if (num.intValue() > 0) {
            synchronized (i) {
                Set set = h;
                set.add(this);
                n7.a("AppLovinFullscreenActivity", set.size(), num.intValue(), this.a.D());
            }
        }
        n2 n2Var3 = parentInterstitialWrapper;
        if (n2Var3 != null) {
            w1.a(n2Var3.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.h(), this.a, this, new b());
            return;
        }
        Intent intent = new Intent(this, FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.a);
        this.d = aVar;
        bindService(intent, aVar, 1);
        if (o0.h()) {
            String str = (String) this.a.n0().getExtraParameters().get("disable_set_data_dir_suffix");
            if (StringUtils.isValidString(str) && Boolean.parseBoolean(str)) {
                return;
            }
            try {
                com.applovin.adview.b.a(String.valueOf(Process.myPid()));
            } catch (Throwable unused) {
            }
        }
    }

    public void onDestroy() {
        k kVar = this.a;
        if (kVar != null && ((Boolean) kVar.a(x4.x2)).booleanValue()) {
            this.a.p0().b(z4.N);
            this.a.p0().b(z4.P);
            this.a.p0().b(z4.Q);
        }
        if (this.f != null) {
            this.a.p0().b(z4.O);
            this.f.a();
            this.f = null;
        }
        com.applovin.impl.adview.activity.a aVar = this.d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        w1 w1Var = this.b;
        if (w1Var != null) {
            if (w1Var.g()) {
                this.b.r();
            } else {
                long a2 = this.b.a();
                if (a2 >= 0) {
                    if (a2 == 0) {
                        this.b.d(true);
                    }
                    AppLovinSdkUtils.runOnUiThreadDelayed(new e(this, parentInterstitialWrapper), a2);
                } else {
                    a(this.b, false, false);
                }
            }
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        w1 w1Var = this.b;
        if (w1Var != null) {
            w1Var.a(i2, keyEvent);
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public void onPause() {
        super.onPause();
        w1 w1Var = this.b;
        if (w1Var != null) {
            w1Var.s();
        }
    }

    public void onResume() {
        w1 w1Var;
        try {
            super.onResume();
            if (this.c.get() || (w1Var = this.b) == null) {
                return;
            }
            w1Var.t();
        } catch (IllegalArgumentException e) {
            this.a.O();
            if (o.a()) {
                this.a.O().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e);
            }
            this.a.D().c("AppLovinFullscreenActivity", "onResume", e);
            dismiss("activity_on_resume_error");
        }
    }

    public void onStop() {
        super.onStop();
        w1 w1Var = this.b;
        if (w1Var != null) {
            w1Var.u();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.b != null) {
            if (!this.c.getAndSet(false)) {
                this.b.b(z);
            }
            if (z) {
                n2 n2Var = parentInterstitialWrapper;
                a(n2Var != null ? n2Var.f() : null);
            }
        }
        super.onWindowFocusChanged(z);
    }

    public void setPresenter(w1 w1Var) {
        this.b = w1Var;
    }

    public class b implements w1.g {
        public b() {
        }

        public void a(w1 w1Var) {
            AppLovinFullscreenActivity.a(AppLovinFullscreenActivity.this, w1Var);
            w1Var.w();
        }

        public void a(String str, Throwable th) {
            com.applovin.impl.sdk.ad.b f = AppLovinFullscreenActivity.parentInterstitialWrapper.f();
            n2.a(f, AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th, AppLovinFullscreenActivity.this);
            Map hashMap = CollectionUtils.hashMap("source", "createAppLovinFullscreenActivity");
            CollectionUtils.putStringIfValid("error_message", str, hashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), hashMap);
            AppLovinFullscreenActivity.a(AppLovinFullscreenActivity.this).g().a(d2.F, f, hashMap);
        }
    }

    public static /* synthetic */ void a(AppLovinFullscreenActivity appLovinFullscreenActivity, WindowInsets windowInsets) {
        appLovinFullscreenActivity.a(windowInsets);
    }

    private void b() {
        k kVar = this.a;
        if (kVar == null || !((Boolean) kVar.a(x4.y2)).booleanValue()) {
            return;
        }
        Long l = (Long) this.a.a(x4.z2);
        this.f = g0.a(l.longValue(), true, this.a, new d(this, l));
    }

    private void c() {
        w1 w1Var = this.b;
        if (w1Var != null) {
            w1Var.q();
        }
        if (n7.g(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    public static /* synthetic */ k a(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        return appLovinFullscreenActivity.a;
    }

    public static /* synthetic */ w1 a(AppLovinFullscreenActivity appLovinFullscreenActivity, w1 w1Var) {
        appLovinFullscreenActivity.b = w1Var;
        return w1Var;
    }

    private void a(WindowInsets windowInsets) {
        o0.a a2 = o0.a(windowInsets, this.a);
        o0.a c2 = o0.c(windowInsets, this.a);
        o0.a b2 = o0.b(windowInsets, this.a);
        String b3 = n7.b((Context) this);
        o0.a(a2, b3);
        o0.c(c2, b3);
        o0.b(b2, b3);
        w1 w1Var = this.b;
        if (w1Var != null) {
            w1Var.a(a2, c2, b2);
        }
    }

    private /* synthetic */ void a(n2 n2Var) {
        boolean y = this.b.y();
        boolean i2 = (n2Var == null || !y) ? false : n2Var.i();
        if (!i2) {
            this.b.d(false);
        }
        a(this.b, y, i2);
    }

    private void a(w1 w1Var, boolean z, boolean z2) {
        w1Var.a("activity_destroyed_by_app_relaunch");
        if (this.a != null) {
            Map hashMap = CollectionUtils.hashMap("source", "onDestroyAppLovinFullScreenActivity");
            n2 n2Var = parentInterstitialWrapper;
            com.applovin.impl.sdk.ad.b f = n2Var != null ? n2Var.f() : null;
            hashMap.putAll(f2.a((AppLovinAdImpl) f));
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putBoolean(jSONObject, "reshow_attempted", z);
            JsonUtils.putBoolean(jSONObject, "reshow_success", z2);
            if (f != null) {
                JsonUtils.putInt(jSONObject, "reshow_count", f.R());
            }
            hashMap.put("details", jSONObject.toString());
            this.a.D().d(d2.C0, hashMap);
        }
        w1Var.r();
    }

    private void a() {
        n2 n2Var;
        k kVar = this.a;
        if (kVar == null || !((Boolean) kVar.a(x4.x2)).booleanValue() || (n2Var = parentInterstitialWrapper) == null || n2Var.f() == null) {
            return;
        }
        com.applovin.impl.sdk.ad.b f = parentInterstitialWrapper.f();
        List j = f.j();
        if (CollectionUtils.isEmpty((Collection) j)) {
            return;
        }
        com.applovin.impl.e eVar = (com.applovin.impl.e) j.get(0);
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", eVar.c());
        JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", eVar.a());
        this.a.p0().b(z4.P, jSONObject.toString());
        this.a.p0().b(z4.N, Long.valueOf(System.currentTimeMillis()));
        this.a.p0().b(z4.Q, CollectionUtils.toJsonString(f2.a((AppLovinAdImpl) f), "{}"));
    }

    private /* synthetic */ void a(Long l) {
        this.g += l.longValue();
        this.a.p0().b(z4.O, Long.valueOf(this.g));
    }

    private void a(com.applovin.impl.sdk.ad.b bVar) {
        if (o0.b() && bVar != null && bVar.L0()) {
            v.a(getWindow().getAttributes(), 1);
            if (bVar.U0() && bVar.S0()) {
                com.applovin.impl.d.c(this);
                return;
            } else if (bVar.U0()) {
                com.applovin.impl.d.b((Activity) this);
                return;
            } else {
                if (bVar.S0()) {
                    com.applovin.impl.d.a((Activity) this);
                    return;
                }
                return;
            }
        }
        getWindow().setFlags(1024, 1024);
        com.applovin.impl.d.c(this);
    }
}
