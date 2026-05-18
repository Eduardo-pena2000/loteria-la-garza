package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbwg implements Y5.l, Y5.r, Y5.x, Y5.c, Y5.i {
    final zzbtz zza;

    public zzbwg(zzbtz zzbtzVar) {
        this.zza = zzbtzVar;
    }

    public final void onAdClosed() {
        try {
            this.zza.zzf();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(L5.b bVar) {
        try {
            int a = bVar.a();
            String c = bVar.c();
            String b = bVar.b();
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 59 + String.valueOf(c).length() + 16 + String.valueOf(b).length());
            sb.append("Mediated ad failed to show: Error Code = ");
            sb.append(a);
            sb.append(". Error Message = ");
            sb.append(c);
            sb.append(" Error Domain = ");
            sb.append(b);
            W5.p.f(sb.toString());
            this.zza.zzy(bVar.d());
        } catch (RemoteException unused) {
        }
    }

    public final void onAdLeftApplication() {
        try {
            this.zza.zzh();
        } catch (RemoteException unused) {
        }
    }

    public final void onAdOpened() {
        try {
            this.zza.zzi();
        } catch (RemoteException unused) {
        }
    }

    public final void onUserEarnedReward() {
        try {
            this.zza.zzz();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoComplete() {
        try {
            this.zza.zzn();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoMute() {
    }

    public final void onVideoPause() {
        try {
            this.zza.zzq();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoPlay() {
        try {
            this.zza.zzu();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoStart() {
        try {
            this.zza.zzo();
        } catch (RemoteException unused) {
        }
    }

    public final void onVideoUnmute() {
    }

    public final void reportAdClicked() {
        try {
            this.zza.zze();
        } catch (RemoteException unused) {
        }
    }

    public final void reportAdImpression() {
        try {
            this.zza.zzk();
        } catch (RemoteException unused) {
        }
    }

    public final void onUserEarnedReward(f6.b bVar) {
        try {
            this.zza.zzr(new zzcbq(bVar));
        } catch (RemoteException unused) {
        }
    }

    public final void onAdFailedToShow(String str) {
        try {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
            sb.append("Mediated ad failed to show: ");
            sb.append(str);
            W5.p.f(sb.toString());
            this.zza.zzv(str);
        } catch (RemoteException unused) {
        }
    }
}
