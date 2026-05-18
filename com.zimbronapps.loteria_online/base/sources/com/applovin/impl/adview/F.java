package com.applovin.impl.adview;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.applovin.impl.adview.e;
import com.applovin.impl.n1;
import com.applovin.impl.x4;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
class f extends Dialog implements n1 {
    private final Activity a;
    private final com.applovin.impl.sdk.k b;
    private final com.applovin.impl.sdk.o c;
    private final b d;
    private final com.applovin.impl.sdk.ad.a e;
    private RelativeLayout f;
    private e g;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        public void onAnimationEnd(Animation animation) {
            f.a(f.this).setClickable(true);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    public f(com.applovin.impl.sdk.ad.a aVar, b bVar, Activity activity, com.applovin.impl.sdk.k kVar) {
        super(activity, 16973840);
        if (aVar == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (bVar == null) {
            throw new IllegalArgumentException("No main view specified");
        }
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.b = kVar;
        this.c = kVar.O();
        this.a = activity;
        this.d = bVar;
        this.e = aVar;
        requestWindowFeature(1);
        setCancelable(false);
    }

    public static /* synthetic */ e a(f fVar) {
        return fVar.g;
    }

    public static /* synthetic */ void b(f fVar) {
        super.dismiss();
    }

    public static /* synthetic */ void c(f fVar) {
        fVar.f();
    }

    public static /* synthetic */ void d(f fVar, View view) {
        fVar.a(view);
    }

    public static /* synthetic */ void e(f fVar) {
        fVar.e();
    }

    public static /* synthetic */ void f(f fVar, View view) {
        fVar.b(view);
    }

    private void g() {
        this.a.runOnUiThread(new J(this));
    }

    public void dismiss(String str) {
        this.a.runOnUiThread(new I(this));
    }

    public void onBackPressed() {
        this.d.a("javascript:al_onBackPressed();");
        dismiss("expanded_ad_dialog_back_button");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d();
    }

    public void onStart() {
        super.onStart();
        try {
            Window window = getWindow();
            if (window != null) {
                window.setFlags(this.a.getWindow().getAttributes().flags, this.a.getWindow().getAttributes().flags);
                window.addFlags(16777216);
            } else if (com.applovin.impl.sdk.o.a()) {
                this.c.b("ExpandedAdDialog", "Unable to turn on hardware acceleration - window is null");
            }
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a("ExpandedAdDialog", "Setting window flags failed.", th);
            }
        }
    }

    private void a() {
        this.d.a("javascript:al_onCloseTapped();");
        dismiss("expanded_ad_dialog_close_button");
    }

    private /* synthetic */ void b(View view) {
        if (this.g.isClickable()) {
            this.g.performClick();
        }
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.d.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = new RelativeLayout(this.a);
        this.f = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f.setBackgroundColor(-1157627904);
        this.f.addView(this.d);
        if (!this.e.l1()) {
            a(this.e.f1());
            g();
        }
        setContentView(this.f);
    }

    private /* synthetic */ void e() {
        this.f.removeView(this.d);
        b(this);
    }

    private /* synthetic */ void f() {
        try {
            if (this.g == null) {
                a();
            }
            this.g.setVisibility(0);
            this.g.bringToFront();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            this.g.startAnimation(alphaAnimation);
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a("ExpandedAdDialog", "Unable to fade in close button", th);
            }
            a();
        }
    }

    public b c() {
        return this.d;
    }

    private void a(e.a aVar) {
        if (this.g != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.k("ExpandedAdDialog", "Attempting to create duplicate close button");
                return;
            }
            return;
        }
        e a2 = e.a(aVar, this.a);
        this.g = a2;
        a2.setVisibility(8);
        this.g.setOnClickListener(new G(this));
        this.g.setClickable(false);
        int a3 = a(((Integer) this.b.a(x4.z1)).intValue());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a3, a3);
        layoutParams.addRule(10);
        com.applovin.impl.sdk.k kVar = this.b;
        x4 x4Var = x4.C1;
        layoutParams.addRule(((Boolean) kVar.a(x4Var)).booleanValue() ? 9 : 11);
        this.g.a(a3);
        int a4 = a(((Integer) this.b.a(x4.B1)).intValue());
        int a5 = a(((Integer) this.b.a(x4.A1)).intValue());
        layoutParams.setMargins(a5, a4, a5, 0);
        this.f.addView(this.g, layoutParams);
        this.g.bringToFront();
        int a6 = a(((Integer) this.b.a(x4.D1)).intValue());
        View view = new View(this.a);
        view.setBackgroundColor(0);
        int i = a3 + a6;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i);
        layoutParams2.addRule(10);
        layoutParams2.addRule(((Boolean) this.b.a(x4Var)).booleanValue() ? 9 : 11);
        layoutParams2.setMargins(a5 - a(5), a4 - a(5), a5 - a(5), 0);
        view.setOnClickListener(new H(this));
        this.f.addView(view, layoutParams2);
        view.bringToFront();
    }

    public com.applovin.impl.sdk.ad.a b() {
        return this.e;
    }

    private /* synthetic */ void a(View view) {
        a();
    }

    private int a(int i) {
        return AppLovinSdkUtils.dpToPx(this.a, i);
    }
}
