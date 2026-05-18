package U5;

import V5.F0;
import V5.o0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzbdy;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzdjm;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d extends zzbxr implements zzbdy {
    public final AdOverlayInfoParcel a;
    public final Activity b;
    public final boolean f;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public boolean g = false;
    public boolean h = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(android.app.Activity r3, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.c = r0
            r2.d = r0
            r2.e = r0
            r2.g = r0
            r2.h = r0
            r2.a = r4
            r2.b = r3
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zzfG
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()
            java.lang.Object r3 = r1.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L48
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zzfH
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()
            java.lang.Object r3 = r1.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L48
            com.google.android.gms.internal.ads.zzbgv r3 = com.google.android.gms.internal.ads.zzbhe.zzfL
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()
            java.lang.Object r3 = r1.zzd(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L79
        L48:
            U5.m r3 = r4.a
            if (r3 == 0) goto L79
            boolean r3 = r3.j
            if (r3 == 0) goto L79
            java.lang.String r3 = android.os.Build.MANUFACTURER
            com.google.android.gms.internal.ads.zzbgv r4 = com.google.android.gms.internal.ads.zzbhe.zzfJ
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()
            java.lang.Object r4 = r1.zzd(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r3.matches(r4)
            if (r3 == 0) goto L79
            java.lang.String r3 = android.os.Build.MODEL
            com.google.android.gms.internal.ads.zzbgv r4 = com.google.android.gms.internal.ads.zzbhe.zzfK
            com.google.android.gms.internal.ads.zzbhc r1 = S5.D.c()
            java.lang.Object r4 = r1.zzd(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r3 = r3.matches(r4)
            if (r3 == 0) goto L79
            r0 = 1
        L79:
            r2.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: U5.d.<init>(android.app.Activity, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel):void");
    }

    private final synchronized void zzc() {
        try {
            if (!this.d) {
                E e = this.a.c;
                if (e != null) {
                    e.zzdT(4);
                }
                this.d = true;
                if (this.f) {
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzfL)).booleanValue()) {
                        R5.t.k().zzc(this);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void zza(boolean z) {
        if (!z) {
            this.h = true;
        } else if (this.h) {
            int i = o0.b;
            W5.p.a("Foregrounded: finishing activity from LauncherOverlay");
            this.b.finish();
        }
    }

    public final /* synthetic */ void zzb() {
        if (this.g) {
            this.b.finish();
        }
    }

    public final void zzf() {
        E e = this.a.c;
        if (e != null) {
            e.zzdv();
        }
    }

    public final boolean zzg() {
        return ((Boolean) S5.D.c().zzd(zzbhe.zzfH)).booleanValue() && this.f && this.g;
    }

    public final void zzh(Bundle bundle) {
        E e;
        if (((Boolean) S5.D.c().zzd(zzbhe.zzko)).booleanValue() && !this.e) {
            this.b.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.a;
        if (adOverlayInfoParcel == null) {
            this.b.finish();
            return;
        }
        if (z) {
            this.b.finish();
            return;
        }
        if (bundle == null) {
            S5.a aVar = adOverlayInfoParcel.b;
            if (aVar != null) {
                aVar.onAdClicked();
            }
            zzdjm zzdjmVar = adOverlayInfoParcel.u;
            if (zzdjmVar != null) {
                zzdjmVar.zzdu();
            }
            Activity activity = this.b;
            if (activity.getIntent() != null && activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (e = adOverlayInfoParcel.c) != null) {
                e.zzh();
            }
        }
        if (this.f) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzfL)).booleanValue()) {
                R5.t.k().zzb(this);
            }
        }
        Activity activity2 = this.b;
        m mVar = adOverlayInfoParcel.a;
        e eVar = adOverlayInfoParcel.i;
        R5.t.e();
        if (a.b(activity2, mVar, eVar, mVar.i, null, "")) {
            return;
        }
        activity2.finish();
    }

    public final void zzk() {
        if (this.c) {
            o0.k("LauncherOverlay finishing activity");
            this.b.finish();
            return;
        }
        this.c = true;
        this.g = true;
        E e = this.a.c;
        if (e != null) {
            e.zzdx();
        }
        if (this.f) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzfG)).booleanValue()) {
                F0.l.postDelayed(new c(this), ((Integer) S5.D.c().zzd(zzbhe.zzfI)).intValue());
            }
        }
    }

    public final void zzl() {
        this.g = false;
        E e = this.a.c;
        if (e != null) {
            e.zzdw();
        }
        if (this.b.isFinishing()) {
            zzc();
        }
    }

    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.c);
    }

    public final void zzp() {
        if (this.b.isFinishing()) {
            zzc();
        }
    }

    public final void zzq() {
        if (this.b.isFinishing()) {
            zzc();
        }
    }

    public final void zzs() {
        this.e = true;
    }

    public final void zze() {
    }

    public final void zzi() {
    }

    public final void zzj() {
    }

    public final void zzn(N6.a aVar) {
    }

    public final void zzH(int i, String[] strArr, int[] iArr) {
    }

    public final void zzm(int i, int i2, Intent intent) {
    }
}
