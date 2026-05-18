package U5;

import V5.F0;
import V5.o0;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbwx;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzejg;
import com.google.android.gms.internal.ads.zzejh;
import com.google.android.gms.internal.ads.zzejz;
import com.google.android.gms.internal.ads.zzekb;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzgrt;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class z extends zzbxr implements i {
    public static final int w = Color.argb(0, 0, 0, 0);
    public final Activity a;
    public AdOverlayInfoParcel b;
    public zzcjl c;
    public t d;
    public H e;
    public FrameLayout g;
    public WebChromeClient.CustomViewCallback h;
    public s k;
    public Runnable o;
    public boolean p;
    public boolean q;
    public Toolbar u;
    public boolean f = false;
    public boolean i = false;
    public boolean j = false;
    public boolean l = false;
    public int v = 1;
    public final Object m = new Object();
    public final View.OnClickListener n = new n(this);
    public boolean r = false;
    public boolean s = false;
    public boolean t = true;

    public z(Activity activity) {
        this.a = activity;
    }

    public static final void w1(zzekb zzekbVar, View view) {
        if (zzekbVar == null || view == null) {
            return;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgl)).booleanValue() && zzekbVar.zzb()) {
            return;
        }
        R5.t.y().zzh(zzekbVar.zza(), view);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1(boolean r46) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.z.A1(boolean):void");
    }

    public final void B1(String str) {
        Toolbar toolbar = this.u;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    public final void q1() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        E e;
        if (!this.a.isFinishing() || this.r) {
            return;
        }
        this.r = true;
        zzcjl zzcjlVar = this.c;
        if (zzcjlVar != null) {
            zzcjlVar.zzH(this.v - 1);
            synchronized (this.m) {
                try {
                    if (!this.p && this.c.zzaa()) {
                        if (((Boolean) S5.D.c().zzd(zzbhe.zzfX)).booleanValue() && !this.s && (adOverlayInfoParcel = this.b) != null && (e = adOverlayInfoParcel.c) != null) {
                            e.zzdS();
                        }
                        p pVar = new p(this);
                        this.o = pVar;
                        F0.l.postDelayed(pVar, ((Long) S5.D.c().zzd(zzbhe.zzbE)).longValue());
                        return;
                    }
                } finally {
                }
            }
        }
        r1();
    }

    public final void r1() {
        zzcjl zzcjlVar;
        E e;
        if (this.s) {
            return;
        }
        this.s = true;
        zzcjl zzcjlVar2 = this.c;
        if (zzcjlVar2 != null) {
            this.k.removeView(zzcjlVar2.zzE());
            t tVar = this.d;
            if (tVar != null) {
                this.c.zzai(tVar.d);
                this.c.zzag(false);
                if (((Boolean) S5.D.c().zzd(zzbhe.zzof)).booleanValue() && this.c.getParent() != null) {
                    this.c.getParent().removeView(this.c.zzE());
                }
                ViewGroup viewGroup = this.d.c;
                View zzE = this.c.zzE();
                t tVar2 = this.d;
                viewGroup.addView(zzE, tVar2.a, tVar2.b);
                this.d = null;
            } else {
                Activity activity = this.a;
                if (activity.getApplicationContext() != null) {
                    this.c.zzai(activity.getApplicationContext());
                }
            }
            this.c = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && (e = adOverlayInfoParcel.c) != null) {
            e.zzdT(this.v);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.b;
        if (adOverlayInfoParcel2 == null || (zzcjlVar = adOverlayInfoParcel2.d) == null) {
            return;
        }
        w1(zzcjlVar.zzU(), this.b.d.zzE());
    }

    public final void s1() {
        synchronized (this.m) {
            try {
                this.p = true;
                Runnable runnable = this.o;
                if (runnable != null) {
                    zzfyn zzfynVar = F0.l;
                    zzfynVar.removeCallbacks(runnable);
                    zzfynVar.post(this.o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void t1(zzejh zzejhVar) {
        zzbxl zzbxlVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel == null || (zzbxlVar = adOverlayInfoParcel.v) == null) {
            throw new r("noioou");
        }
        zzbxlVar.zzh(N6.b.s1(zzejhVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u1(android.content.res.Configuration r7) {
        /*
            r6 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r6.b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            R5.l r0 = r0.o
            if (r0 == 0) goto L10
            boolean r0 = r0.b
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            android.app.Activity r3 = r6.a
            V5.V0 r4 = R5.t.j()
            boolean r7 = r4.d(r3, r7)
            boolean r4 = r6.j
            if (r4 == 0) goto L37
            if (r0 != 0) goto L37
            com.google.android.gms.internal.ads.zzbgv r0 = com.google.android.gms.internal.ads.zzbhe.zzbm
            com.google.android.gms.internal.ads.zzbhc r4 = S5.D.c()
            java.lang.Object r0 = r4.zzd(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            goto L37
        L34:
            r7 = r2
        L35:
            r0 = r7
            goto L5b
        L37:
            if (r7 == 0) goto L4b
            com.google.android.gms.internal.ads.zzbgv r7 = com.google.android.gms.internal.ads.zzbhe.zzbl
            com.google.android.gms.internal.ads.zzbhc r0 = S5.D.c()
            java.lang.Object r7 = r0.zzd(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L34
        L4b:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r7 = r6.b
            if (r7 == 0) goto L59
            R5.l r7 = r7.o
            if (r7 == 0) goto L59
            boolean r7 = r7.g
            if (r7 == 0) goto L59
            r7 = r1
            goto L35
        L59:
            r7 = r1
            r0 = r2
        L5b:
            android.view.Window r3 = r3.getWindow()
            com.google.android.gms.internal.ads.zzbgv r4 = com.google.android.gms.internal.ads.zzbhe.zzbL
            com.google.android.gms.internal.ads.zzbhc r5 = S5.D.c()
            java.lang.Object r4 = r5.zzd(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L87
            android.view.View r4 = r3.getDecorView()
            if (r7 == 0) goto L80
            if (r0 == 0) goto L7d
            r7 = 5894(0x1706, float:8.259E-42)
        L7b:
            r0 = r1
            goto L83
        L7d:
            r7 = 5380(0x1504, float:7.539E-42)
            goto L7b
        L80:
            r7 = 256(0x100, float:3.59E-43)
            r0 = r2
        L83:
            r4.setSystemUiVisibility(r7)
            goto La7
        L87:
            r4 = 2048(0x800, float:2.87E-42)
            r5 = 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto La0
            r3.addFlags(r5)
            r3.clearFlags(r4)
            if (r0 == 0) goto L9e
            android.view.View r7 = r3.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r7.setSystemUiVisibility(r0)
        L9e:
            r0 = r1
            goto La7
        La0:
            r3.addFlags(r4)
            r3.clearFlags(r5)
            r0 = r2
        La7:
            com.google.android.gms.internal.ads.zzbgv r7 = com.google.android.gms.internal.ads.zzbhe.zzoS
            com.google.android.gms.internal.ads.zzbhc r4 = S5.D.c()
            java.lang.Object r7 = r4.zzd(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto Lcf
            int r7 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r7 > r4) goto Lcf
            r4 = 28
            if (r7 < r4) goto Lcf
            if (r0 == 0) goto Lcf
            android.view.WindowManager$LayoutParams r7 = r3.getAttributes()
            d.v.a(r7, r1)
            T1.m0.b(r3, r2)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.z.u1(android.content.res.Configuration):void");
    }

    public final void v1(View view) {
        zzekb zzU;
        zzejz zzV;
        zzcjl zzcjlVar = this.c;
        if (zzcjlVar == null) {
            return;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzgm)).booleanValue() && (zzV = zzcjlVar.zzV()) != null) {
            zzV.zzf(view);
        } else if (((Boolean) S5.D.c().zzd(zzbhe.zzgl)).booleanValue() && (zzU = zzcjlVar.zzU()) != null && zzU.zzb()) {
            R5.t.y().zzg(zzU.zza(), view);
        }
    }

    public final void x1(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        R5.l lVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        R5.l lVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) S5.D.c().zzd(zzbhe.zzbF)).booleanValue() && (adOverlayInfoParcel2 = this.b) != null && (lVar2 = adOverlayInfoParcel2.o) != null && lVar2.h;
        boolean z5 = ((Boolean) S5.D.c().zzd(zzbhe.zzbG)).booleanValue() && (adOverlayInfoParcel = this.b) != null && (lVar = adOverlayInfoParcel.o) != null && lVar.i;
        if (z && z2 && z4 && !z5) {
            new zzbwx(this.c, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        H h = this.e;
        if (h != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            h.a(z3);
        }
    }

    public final void y1(int i) {
        Activity activity = this.a;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) S5.D.c().zzd(zzbhe.zzgU)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) S5.D.c().zzd(zzbhe.zzgV)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) S5.D.c().zzd(zzbhe.zzgW)).intValue()) {
                    if (i2 <= ((Integer) S5.D.c().zzd(zzbhe.zzgX)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            R5.t.l().zzh(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void z1(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.a;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.g = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.g.addView(view, -1, -1);
        activity.setContentView(this.g);
        this.q = true;
        this.h = customViewCallback;
        this.f = true;
    }

    public final void zzC() {
        if (this.l) {
            this.l = false;
            zzD();
        }
    }

    public final void zzD() {
        this.c.zzI();
    }

    public final void zzE() {
        this.k.b = true;
    }

    public final void zzH(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.a;
            zzejg zze = zzejh.zze();
            zze.zza(activity);
            zze.zzb(this.b.k == 5 ? this : null);
            try {
                this.b.v.zzi(strArr, iArr, N6.b.s1(zze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zzb() {
        this.v = 3;
        Activity activity = this.a;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.k != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzcjl zzcjlVar = this.c;
        if (zzcjlVar != null) {
            zzcjlVar.zzae(null);
        }
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && this.f) {
            y1(adOverlayInfoParcel.j);
        }
        if (this.g != null) {
            this.a.setContentView(this.k);
            this.q = true;
            this.g.removeAllViews();
            this.g = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.h;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.h = null;
        }
        this.f = false;
    }

    public final void zzd() {
        this.v = 2;
        this.a.finish();
    }

    public final void zze() {
        this.v = 1;
    }

    public final void zzf() {
        E e;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel == null || (e = adOverlayInfoParcel.c) == null) {
            return;
        }
        e.zzdv();
    }

    public final boolean zzg() {
        this.v = 1;
        if (this.c == null) {
            return true;
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzkq)).booleanValue() && this.c.canGoBack()) {
            this.c.goBack();
            return false;
        }
        boolean zzZ = this.c.zzZ();
        if (!zzZ) {
            this.c.zze("onbackblocked", Collections.emptyMap());
        }
        return zzZ;
    }

    public void zzh(Bundle bundle) {
        E e;
        if (!this.q) {
            this.a.requestWindowFeature(1);
        }
        this.i = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            Activity activity = this.a;
            AdOverlayInfoParcel M1 = AdOverlayInfoParcel.M1(activity.getIntent());
            this.b = M1;
            if (M1 == null) {
                throw new r("Could not get info for ad overlay.");
            }
            if (M1.w) {
                if (Build.VERSION.SDK_INT >= 28) {
                    w.a(activity, true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.b.m.c > 7500000) {
                this.v = 4;
            }
            if (activity.getIntent() != null) {
                this.t = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.b;
            R5.l lVar = adOverlayInfoParcel.o;
            if (lVar != null) {
                boolean z = lVar.a;
                this.j = z;
                if (z) {
                    if (adOverlayInfoParcel.k != 5 && lVar.f != -1) {
                        new v(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.k == 5) {
                this.j = true;
                if (adOverlayInfoParcel.k != 5) {
                    new v(this, null).zzb();
                }
            } else {
                this.j = false;
            }
            if (bundle == null) {
                if (this.t) {
                    zzdbs zzdbsVar = this.b.t;
                    if (zzdbsVar != null) {
                        zzdbsVar.zza();
                    }
                    E e2 = this.b.c;
                    if (e2 != null) {
                        e2.zzh();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.b;
                if (adOverlayInfoParcel2.k != 1) {
                    S5.a aVar = adOverlayInfoParcel2.b;
                    if (aVar != null) {
                        aVar.onAdClicked();
                    }
                    zzdjm zzdjmVar = this.b.u;
                    if (zzdjmVar != null) {
                        zzdjmVar.zzdu();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.b;
            if (adOverlayInfoParcel3 != null && (e = adOverlayInfoParcel3.c) != null) {
                e.zzdo();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.b;
            s sVar = new s(activity, adOverlayInfoParcel4.n, adOverlayInfoParcel4.m.a, adOverlayInfoParcel4.s);
            this.k = sVar;
            sVar.setId(1000);
            R5.t.j().i(activity);
            AdOverlayInfoParcel adOverlayInfoParcel5 = this.b;
            int i = adOverlayInfoParcel5.k;
            if (i == 1) {
                A1(false);
                return;
            }
            if (i == 2) {
                this.d = new t(adOverlayInfoParcel5.d);
                A1(false);
            } else if (i == 3) {
                A1(true);
            } else {
                if (i != 5) {
                    throw new r("Could not determine ad overlay type.");
                }
                A1(false);
            }
        } catch (r e3) {
            String message = e3.getMessage();
            int i2 = o0.b;
            W5.p.f(message);
            this.v = 4;
            this.a.finish();
        }
    }

    public final void zzi() {
        E e;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel == null || (e = adOverlayInfoParcel.c) == null) {
            return;
        }
        e.zzdq();
    }

    public final void zzj() {
        E e;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzfZ)).booleanValue()) {
            zzcjl zzcjlVar = this.c;
            if (zzcjlVar == null || zzcjlVar.zzX()) {
                int i = o0.b;
                W5.p.f("The webview does not exist. Ignoring action.");
            } else {
                this.c.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel == null || (e = adOverlayInfoParcel.c) == null) {
            return;
        }
        e.zzdp();
    }

    public final void zzk() {
        E e;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && (e = adOverlayInfoParcel.c) != null) {
            e.zzdx();
        }
        u1(this.a.getResources().getConfiguration());
        if (((Boolean) S5.D.c().zzd(zzbhe.zzfZ)).booleanValue()) {
            return;
        }
        zzcjl zzcjlVar = this.c;
        if (zzcjlVar != null && !zzcjlVar.zzX()) {
            this.c.onResume();
        } else {
            int i = o0.b;
            W5.p.f("The webview does not exist. Ignoring action.");
        }
    }

    public final void zzl() {
        E e;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && (e = adOverlayInfoParcel.c) != null) {
            e.zzdw();
        }
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzfZ)).booleanValue() && this.c != null && (!this.a.isFinishing() || this.d == null)) {
            this.c.onPause();
        }
        q1();
    }

    public final void zzm(int i, int i2, Intent intent) {
        zzdxz zzI;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            zzbgv zzbgvVar = zzbhe.zzoD;
            if (((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 66);
                sb.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb.append(i2);
                o0.k(sb.toString());
                zzcjl zzcjlVar = this.c;
                if (zzcjlVar == null || zzcjlVar.zzP() == null || (zzI = zzcjlVar.zzP().zzI()) == null || (adOverlayInfoParcel = this.b) == null || !((Boolean) S5.D.c().zzd(zzbgvVar)).booleanValue()) {
                    return;
                }
                zzdxy zza = zzI.zza();
                zza.zzc("action", "hilca");
                zza.zzc("gqi", zzgrt.zza(adOverlayInfoParcel.q));
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length());
                sb2.append(i2);
                zza.zzc("hilr", sb2.toString());
                if (i2 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zza.zzc("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zza.zzc("hills", stringExtra2);
                    }
                }
                zza.zzf();
            }
        }
    }

    public final void zzn(N6.a aVar) {
        u1((Configuration) N6.b.r1(aVar));
    }

    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.i);
    }

    public final void zzp() {
        E e;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && (e = adOverlayInfoParcel.c) != null) {
            e.zzdy();
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zzfZ)).booleanValue() && this.c != null && (!this.a.isFinishing() || this.d == null)) {
            this.c.onPause();
        }
        q1();
    }

    public final void zzq() {
        E e;
        AdOverlayInfoParcel adOverlayInfoParcel = this.b;
        if (adOverlayInfoParcel != null && (e = adOverlayInfoParcel.c) != null) {
            e.zzdz();
        }
        zzcjl zzcjlVar = this.c;
        if (zzcjlVar != null) {
            try {
                this.k.removeView(zzcjlVar.zzE());
            } catch (NullPointerException unused) {
            }
        }
        q1();
    }

    public final void zzr(boolean z) {
        if (this.b.w) {
            return;
        }
        int intValue = ((Integer) S5.D.c().zzd(zzbhe.zzgc)).intValue();
        boolean z2 = ((Boolean) S5.D.c().zzd(zzbhe.zzbH)).booleanValue() || z;
        G g = new G();
        g.d = 50;
        g.a = true != z2 ? 0 : intValue;
        g.b = true != z2 ? intValue : 0;
        g.c = intValue;
        this.e = new H(this.a, g, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        x1(z, this.b.g);
        this.k.addView(this.e, layoutParams);
        v1(this.e);
    }

    public final void zzs() {
        this.q = true;
    }

    public final void zzu(boolean z) {
        if (z) {
            this.k.setBackgroundColor(0);
        } else {
            this.k.setBackgroundColor(-16777216);
        }
    }

    public final void zzv() {
        this.k.removeView(this.e);
        zzr(true);
    }
}
