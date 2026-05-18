package com.applovin.impl;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.applovin.creative.MaxCreativeDebuggerActivity;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.d;
import com.applovin.impl.m1;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class e1 implements m1.a {
    private static WeakReference m;
    private static final AtomicBoolean n = new AtomicBoolean();
    private final com.applovin.impl.sdk.k a;
    private final Context b;
    private final Map c;
    private final d1 e;
    private m1 g;
    private g7 h;
    private int i;
    private boolean j;
    private long k;
    private boolean l;
    private final Object d = new Object();
    private WeakReference f = new WeakReference((Object) null);

    public class a extends LinkedHashMap {
        public a(int i) {
            super(i);
        }

        public boolean removeEldestEntry(Map.Entry entry) {
            return size() > 10;
        }
    }

    public class b extends com.applovin.impl.b {
        public b() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Started Creative Debugger");
                if (!e1.a(e1.this) || e1.c().get() != activity) {
                    MaxCreativeDebuggerActivity maxCreativeDebuggerActivity = (MaxCreativeDebuggerActivity) activity;
                    e1.a(new WeakReference(maxCreativeDebuggerActivity));
                    maxCreativeDebuggerActivity.a(e1.b(e1.this), e1.c(e1.this).e());
                }
                e1.d().set(false);
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof MaxCreativeDebuggerActivity) {
                com.applovin.impl.sdk.o.g("AppLovinSdk", "Creative Debugger destroyed");
                e1.a((WeakReference) null);
            }
        }
    }

    public class c implements d.b {
        final /* synthetic */ Object a;

        public c(Object obj) {
            this.a = obj;
        }

        public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
            maxCreativeDebuggerDisplayedAdActivity.a(new q1(this.a, e1.c(e1.this).H().b()), e1.c(e1.this));
            e1.d().set(false);
        }
    }

    public e1(com.applovin.impl.sdk.k kVar) {
        this.a = kVar;
        Context o = com.applovin.impl.sdk.k.o();
        this.b = o;
        this.c = new a(10);
        this.e = new d1(o);
    }

    public static /* synthetic */ boolean a(e1 e1Var) {
        return e1Var.h();
    }

    public static /* synthetic */ d1 b(e1 e1Var) {
        return e1Var.e;
    }

    public static /* synthetic */ WeakReference c() {
        return m;
    }

    public static /* synthetic */ void d(e1 e1Var) {
        e1Var.j();
    }

    public static /* synthetic */ void e(e1 e1Var, View view, FrameLayout frameLayout) {
        e1Var.a(view, frameLayout);
    }

    public static /* synthetic */ void f(e1 e1Var) {
        e1Var.i();
    }

    public static /* synthetic */ void g(e1 e1Var, View view) {
        e1Var.a(view);
    }

    public static /* synthetic */ void h(e1 e1Var) {
        e1Var.e();
    }

    public static /* synthetic */ void i(e1 e1Var, View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        e1Var.a(view, frameLayout, viewTreeObserver, onGlobalLayoutListener);
    }

    public static /* synthetic */ boolean j(e1 e1Var, FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        return e1Var.a(frameLayout, view, motionEvent);
    }

    private void m() {
        this.a.e().a(new b());
    }

    public void k() {
        m1 m1Var = this.g;
        if (m1Var != null) {
            m1Var.b();
        }
    }

    public void l() {
        if (g()) {
            this.j = ((Boolean) this.a.a(x4.l1)).booleanValue();
            if (this.g == null) {
                this.g = new m1(this.a, this);
            }
            this.g.a();
        }
    }

    public void n() {
        List arrayList;
        if (h() || !n.compareAndSet(false, true)) {
            com.applovin.impl.sdk.o.h("AppLovinSdk", "Creative Debugger is already showing");
            return;
        }
        Object a2 = this.a.H().a();
        if (a2 != null) {
            e(a2);
            return;
        }
        synchronized (this.d) {
            arrayList = new ArrayList(this.c.values());
        }
        Collections.reverse(arrayList);
        this.e.a(arrayList, this.a);
        if (!this.l) {
            m();
            this.l = true;
        }
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger...");
        d.a(this.b, MaxCreativeDebuggerActivity.class);
    }

    public static /* synthetic */ WeakReference a(WeakReference weakReference) {
        m = weakReference;
        return weakReference;
    }

    public static /* synthetic */ com.applovin.impl.sdk.k c(e1 e1Var) {
        return e1Var.a;
    }

    public static /* synthetic */ AtomicBoolean d() {
        return n;
    }

    private void e(Object obj) {
        com.applovin.impl.sdk.o.g("AppLovinSdk", "Starting Creative Debugger for current fullscreen ad...");
        d.a(this.b, MaxCreativeDebuggerDisplayedAdActivity.class, this.a.e(), new c(obj));
    }

    private Drawable f() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    private boolean h() {
        WeakReference weakReference = m;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    private /* synthetic */ void i() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime() - this.k);
        if (this.k == 0 || seconds < 10) {
            return;
        }
        this.a.D().a(d2.d, "showingMediationDebuggerFromHoldingCreativeDebuggerButton");
        this.a.W0();
    }

    private /* synthetic */ void j() {
        this.i = 0;
    }

    public void b() {
        if (this.i == 0) {
            this.h = g7.a(TimeUnit.SECONDS.toMillis(3L), this.a, new D0(this));
        }
        int i = this.i;
        if (i % 2 == 0) {
            this.i = i + 1;
        }
    }

    public boolean g() {
        return ((Boolean) this.a.a(x4.k1)).booleanValue() && this.a.n0().isCreativeDebuggerEnabled();
    }

    private boolean c(Object obj) {
        MaxAdFormat format;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            format = ((com.applovin.impl.sdk.ad.b) obj).getAdZone().d();
        } else {
            format = obj instanceof y2 ? ((y2) obj).getFormat() : null;
        }
        return format != null && format.isFullscreenAd();
    }

    public void a() {
        int i = this.i;
        if (i % 2 == 1) {
            this.i = i + 1;
        }
        if (this.i / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new G0(this));
            this.i = 0;
            this.h.a();
        }
    }

    public void d(Object obj) {
        if (g() && obj != null) {
            if (!w3.a(obj) || c(obj)) {
                String b2 = b(obj);
                synchronized (this.d) {
                    try {
                        q1 q1Var = (q1) this.c.get(b2);
                        if (q1Var != null) {
                            q1Var.a(obj);
                        } else {
                            this.c.put(b2, new q1(obj, System.currentTimeMillis()));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    private void e() {
        if (g() && this.f.get() == null && !h()) {
            Activity b2 = this.a.e().b();
            if (b2 == null) {
                this.a.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.a.O().b("AppLovinSdk", "Failed to display Creative Debugger button");
                    return;
                }
                return;
            }
            View findViewById = b2.findViewById(16908290);
            if (findViewById instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) findViewById;
                View a2 = a(frameLayout, b2);
                frameLayout.addView(a2);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150L);
                a2.startAnimation(alphaAnimation);
                ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
                E0 e0 = new E0(this, a2, frameLayout);
                viewTreeObserver.addOnGlobalLayoutListener(e0);
                AppLovinSdkUtils.runOnUiThreadDelayed(new F0(this, a2, frameLayout, viewTreeObserver, e0), TimeUnit.SECONDS.toMillis(5L));
                this.f = new WeakReference(a2);
            }
        }
    }

    private void b(View view, FrameLayout frameLayout) {
        if (this.j) {
            view.setOnTouchListener((View.OnTouchListener) null);
            this.k = 0L;
        }
        frameLayout.removeView(view);
        this.f = new WeakReference((Object) null);
    }

    private /* synthetic */ void a(View view, FrameLayout frameLayout) {
        if (view.getParent() != null || this.f.get() == null) {
            return;
        }
        frameLayout.addView(view);
    }

    private /* synthetic */ void a(View view, FrameLayout frameLayout, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (this.k > 0 && this.j) {
            view.setVisibility(4);
        } else {
            b(view, frameLayout);
        }
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public String b(q1 q1Var) {
        com.applovin.impl.sdk.ad.b c2 = q1Var.c();
        y2 e = q1Var.e();
        if (c2 == null) {
            if (e != null) {
                return e.D();
            }
            return null;
        }
        return "json_v3!" + Base64.encodeToString(c2.getOriginalFullResponse().toString().getBytes(), 2);
    }

    private View a(FrameLayout frameLayout, Activity activity) {
        ImageButton button;
        int dpToPx = AppLovinSdkUtils.dpToPx(activity, 40);
        int i = dpToPx / 10;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dpToPx, dpToPx, 8388629);
        layoutParams.setMargins(i, i, i, i);
        try {
            button = new ImageButton(activity);
            button.setImageDrawable(activity.getResources().getDrawable(R.drawable.applovin_ic_white_small));
            button.setScaleType(ImageView.ScaleType.FIT_CENTER);
            button.setPadding(i, i, i, i * 2);
        } catch (Throwable unused) {
            button = new Button(activity);
            button.setText("ⓘ");
            button.setTextColor(-1);
            button.setAllCaps(false);
            button.setTextSize(2, 20.0f);
            button.setPadding(0, 0, 0, 0);
        }
        button.setLayoutParams(layoutParams);
        button.setBackground(f());
        if (this.j) {
            button.setOnTouchListener(new H0(this, frameLayout));
        } else {
            button.setOnClickListener(new I0(this));
        }
        if (o0.d()) {
            button.setElevation(AppLovinSdkUtils.dpToPx(activity, 5));
        }
        return button;
    }

    private String b(Object obj) {
        String Q;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            Q = ((com.applovin.impl.sdk.ad.b) obj).getMediationServeId();
        } else {
            Q = obj instanceof y2 ? ((y2) obj).Q() : null;
        }
        return StringUtils.isValidString(Q) ? Q : UUID.randomUUID().toString();
    }

    private /* synthetic */ boolean a(FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.k = SystemClock.elapsedRealtime();
            AppLovinSdkUtils.runOnUiThreadDelayed(new J0(this), TimeUnit.SECONDS.toMillis(10L));
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (view.getVisibility() == 0) {
                this.k = 0L;
                n();
            } else {
                b(view, frameLayout);
            }
        }
        return true;
    }

    private /* synthetic */ void a(View view) {
        n();
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.Serializable, java.lang.Object[]] */
    public void a(q1 q1Var, Context context, boolean z) {
        String a2 = a(q1Var);
        v2 v2Var = new v2();
        if (z) {
            v2Var.b("Please describe the issue you had with this ad:\n\n\n\n");
        }
        v2Var.b(a2);
        String b2 = b(q1Var);
        if (b2 != null) {
            v2Var.a("\nBid Response:\n");
            v2Var.a(b2);
        }
        String str = q1Var.c() != null ? "AppLovin Ad Report" : "MAX Ad Report";
        Intent createChooser = Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage((String) null), "Share Ad Report");
        if (z) {
            try {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:")).putExtra("android.intent.extra.SUBJECT", str).putExtra("android.intent.extra.TEXT", v2Var.toString()).setPackage("com.google.android.gm");
                String str2 = (String) this.a.n0().getExtraParameters().get("creative_debugger_email_recipients");
                if (StringUtils.isValidString(str2)) {
                    intent.putExtra("android.intent.extra.EMAIL", (Serializable) CollectionUtils.explode(str2).toArray());
                }
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException unused) {
                context.startActivity(createChooser);
                return;
            }
        }
        context.startActivity(createChooser);
    }

    public String a(q1 q1Var) {
        v2 v2Var = new v2();
        v2Var.b("Ad Info:\n");
        y2 e = q1Var.e();
        com.applovin.impl.sdk.ad.b c2 = q1Var.c();
        if (e != null) {
            v2Var.a(e);
        } else if (c2 != null) {
            v2Var.a("Network", "APPLOVIN").a(c2).b(c2);
        }
        v2Var.a(this.a);
        v2Var.a("Epoch Timestamp (ms)", Long.valueOf(q1Var.b()));
        v2 v2Var2 = new v2();
        v2Var2.a("Platform", "fireos".equals(this.a.A().A()) ? "Fire OS" : "Android").a("AppLovin SDK Version", AppLovinSdk.VERSION).a("Plugin Version", this.a.a(x4.L3)).a("App Package Name", this.b.getPackageName()).a("Device", String.format("%s %s (%s)", new Object[]{Build.BRAND, Build.MODEL, Build.DEVICE})).a("OS Version", Build.VERSION.RELEASE).a("AppLovin Random Token", this.a.h0()).a("Ad Review Version", j.b()).a(a(q1Var.a())).a("User ID", this.a.w0().e() != null ? this.a.w0().e() : "None").a("MD", this.a.a(x4.t));
        v2Var.a("\nDebug Info:\n").a(u4.b(v2Var2.toString(), n7.a(this.a), u4.a.d, this.a.i0(), this.a));
        return v2Var.toString();
    }

    private Bundle a(Object obj) {
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CreativeDebuggerService", "Retrieving Ad Review info for ad: " + obj);
        }
        String a2 = n7.a(obj);
        Bundle a3 = this.a.j().a(a2);
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CreativeDebuggerService", "Serve id: " + a2);
        }
        this.a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.a.O().a("CreativeDebuggerService", "Public data: " + a3);
        }
        if (a3 == null) {
            return null;
        }
        for (String str : a3.keySet()) {
            Object obj2 = a3.get(str);
            a3.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj2, a3);
        }
        return a3;
    }
}
