package com.applovin.impl;

import android.app.Activity;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.applovin.impl.b1;
import com.applovin.impl.o7;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class z1 extends a2 {
    private final o7 p0;
    private final Set q0;

    public class a implements b1.b {
        public a() {
        }

        public void a() {
            long seconds = TimeUnit.MILLISECONDS.toSeconds(z1.this.g0 - (z1.this.P.getDuration() - z1.this.P.getCurrentPosition()));
            int C = z1.this.C();
            HashSet hashSet = new HashSet();
            for (y7 y7Var : new HashSet(z1.a(z1.this))) {
                if (y7Var.a(seconds, C)) {
                    hashSet.add(y7Var);
                    z1.a(z1.this).remove(y7Var);
                }
            }
            z1.a(z1.this, (Set) hashSet);
            if (C >= 25 && C < 50) {
                z1.b(z1.this).getAdEventTracker().x();
                return;
            }
            if (C >= 50 && C < 75) {
                z1.b(z1.this).getAdEventTracker().y();
            } else if (C >= 75) {
                z1.b(z1.this).getAdEventTracker().C();
            }
        }

        public boolean b() {
            return !z1.this.j0;
        }
    }

    public z1(com.applovin.impl.sdk.ad.b bVar, Activity activity, Map map, com.applovin.impl.sdk.k kVar, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        super(bVar, activity, map, kVar, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
        HashSet hashSet = new HashSet();
        this.q0 = hashSet;
        o7 o7Var = (o7) bVar;
        this.p0 = o7Var;
        if (o7Var.r1()) {
            ImageView a2 = u7.a(o7Var.l1().e(), activity, kVar);
            this.X = a2;
            a2.setOnClickListener(new E7(this, bVar, kVar, activity));
        }
        o7.d dVar = o7.d.VIDEO;
        hashSet.addAll(o7Var.a(dVar, z7.a));
        a(o7.d.IMPRESSION);
        a(dVar, "creativeView");
        o7Var.getAdEventTracker().g();
    }

    public static /* synthetic */ void V(z1 z1Var, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, Activity activity, View view) {
        z1Var.a(bVar, kVar, activity, view);
    }

    private void W() {
        if (!G() || this.q0.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.c.k("AppLovinFullscreenActivity", "Firing " + this.q0.size() + " un-fired video progress trackers when video was completed.");
        }
        a(this.q0);
    }

    public static /* synthetic */ Set a(z1 z1Var) {
        return z1Var.q0;
    }

    public static /* synthetic */ o7 b(z1 z1Var) {
        return z1Var.p0;
    }

    public void D() {
        a(o7.d.VIDEO, "skip");
        this.p0.getAdEventTracker().B();
        super.D();
    }

    public void E() {
        super.E();
        o7 o7Var = this.p0;
        if (o7Var != null) {
            o7Var.getAdEventTracker().i();
        }
    }

    public void O() {
        long P;
        int r;
        long j = 0;
        if (this.p0.O() >= 0 || this.p0.P() >= 0) {
            if (this.p0.O() >= 0) {
                P = this.p0.O();
            } else {
                o7 o7Var = this.p0;
                b8 p1 = o7Var.p1();
                if (p1 == null || p1.d() <= 0) {
                    long j2 = this.g0;
                    if (j2 > 0) {
                        j = j2;
                    }
                } else {
                    j = TimeUnit.SECONDS.toMillis(p1.d());
                }
                if (o7Var.W0() && (r = (int) o7Var.r()) > 0) {
                    j += TimeUnit.SECONDS.toMillis(r);
                }
                P = (long) (j * (this.p0.P() / 100.0d));
            }
            c(P);
        }
    }

    public void R() {
        super.R();
        o7 o7Var = this.p0;
        if (o7Var != null) {
            o7Var.getAdEventTracker().j();
        }
    }

    public void S() {
        W();
        if (!a8.a(this.p0)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a("AppLovinFullscreenActivity", "VAST ad does not have valid companion ad - dismissing...");
            }
            a("no_valid_companion_ad");
        } else {
            if (this.j0) {
                return;
            }
            a(o7.d.COMPANION, "creativeView");
            this.p0.getAdEventTracker().w();
            super.S();
        }
    }

    public void U() {
        super.U();
        a(o7.d.VIDEO, this.f0 ? "mute" : "unmute");
        this.p0.getAdEventTracker().b(this.f0);
    }

    public void d(long j) {
        super.d(j);
        this.p0.getAdEventTracker().b(TimeUnit.MILLISECONDS.toSeconds(j), n7.e(this.b));
    }

    public void g(String str) {
        a(o7.d.ERROR, t7.MEDIA_FILE_ERROR);
        this.p0.getAdEventTracker().b(str);
        super.g(str);
    }

    public void s() {
        super.s();
        a(this.j0 ? o7.d.COMPANION : o7.d.VIDEO, "pause");
        this.p0.getAdEventTracker().z();
    }

    public void t() {
        super.t();
        a(this.j0 ? o7.d.COMPANION : o7.d.VIDEO, "resume");
        this.p0.getAdEventTracker().A();
    }

    public void v() {
        this.c0.c();
        super.v();
    }

    public void w() {
        a((ViewGroup) null);
    }

    private boolean V() {
        return this.X != null && this.p0.r1();
    }

    public static /* synthetic */ void a(z1 z1Var, Set set) {
        z1Var.a(set);
    }

    private /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, Activity activity, View view) {
        Uri c = this.p0.l1().c();
        if (c != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.c.a("AppLovinFullscreenActivity", "Industry Icon clicked, opening URL: " + c);
            }
            a(o7.d.INDUSTRY_ICON_CLICK);
            if (bVar.isCustomTabsEnabled()) {
                kVar.z().a(c, b().getController(), activity);
            } else {
                k7.b(c, bVar, activity, kVar);
            }
        }
    }

    public void a(String str) {
        if (this.p0 != null) {
            a(o7.d.VIDEO, "close");
            a(o7.d.COMPANION, "close");
        }
        super.a(str);
    }

    public void a(ViewGroup viewGroup) {
        super.a(viewGroup);
        if (V()) {
            a(o7.d.INDUSTRY_ICON_IMPRESSION);
            this.X.setVisibility(0);
        }
        this.c0.a("PROGRESS_TRACKING", TimeUnit.SECONDS.toMillis(1L), new a());
        List arrayList = new ArrayList();
        com.applovin.impl.a aVar = this.Q;
        if (aVar != null) {
            arrayList.add(new h4(aVar, FriendlyObstructionPurpose.OTHER, "video stream buffering indicator"));
        }
        com.applovin.impl.adview.g gVar = this.R;
        if (gVar != null) {
            arrayList.add(new h4(gVar, FriendlyObstructionPurpose.CLOSE_AD, "skip button"));
        }
        i0 i0Var = this.S;
        if (i0Var != null) {
            arrayList.add(new h4(i0Var, FriendlyObstructionPurpose.OTHER, "countdown clock"));
        }
        ProgressBar progressBar = this.V;
        if (progressBar != null) {
            arrayList.add(new h4(progressBar, FriendlyObstructionPurpose.OTHER, "progress bar"));
        }
        ProgressBar progressBar2 = this.W;
        if (progressBar2 != null) {
            arrayList.add(new h4(progressBar2, FriendlyObstructionPurpose.OTHER, "postitial progress bar"));
        }
        ImageView imageView = this.T;
        if (imageView != null) {
            arrayList.add(new h4(imageView, FriendlyObstructionPurpose.VIDEO_CONTROLS, "mute button"));
        }
        com.applovin.impl.adview.l lVar = this.U;
        if (lVar != null) {
            arrayList.add(new h4(lVar, FriendlyObstructionPurpose.VIDEO_CONTROLS, "generic webview overlay containing HTML controls"));
        }
        com.applovin.impl.adview.k kVar = this.j;
        if (kVar != null && kVar.a()) {
            com.applovin.impl.adview.k kVar2 = this.j;
            arrayList.add(new h4(kVar2, FriendlyObstructionPurpose.NOT_VISIBLE, kVar2.getIdentifier()));
        }
        this.p0.getAdEventTracker().b((View) this.P, arrayList);
    }

    public void a(MotionEvent motionEvent) {
        a(o7.d.VIDEO_CLICK);
        this.p0.getAdEventTracker().v();
        super.a(motionEvent);
    }

    private void a(Set set) {
        a(set, t7.UNSPECIFIED);
    }

    private void a(o7.d dVar) {
        a(dVar, t7.UNSPECIFIED);
    }

    private void a(o7.d dVar, String str) {
        a(dVar, str, t7.UNSPECIFIED);
    }

    private void a(o7.d dVar, t7 t7Var) {
        a(dVar, "", t7Var);
    }

    private void a(o7.d dVar, String str, t7 t7Var) {
        a(this.p0.a(dVar, str), t7Var);
    }

    private void a(Set set, t7 t7Var) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(this.P.getCurrentPosition());
        c8 q1 = this.p0.q1();
        Uri d = q1 != null ? q1.d() : null;
        if (com.applovin.impl.sdk.o.a()) {
            this.c.a("AppLovinFullscreenActivity", "Firing " + set.size() + " tracker(s): " + set);
        }
        a8.a(set, seconds, d, t7Var, this.b);
    }
}
