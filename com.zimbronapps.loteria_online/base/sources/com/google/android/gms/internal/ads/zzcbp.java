package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcbp implements Y5.x {
    private final zzbtz zza;

    public zzcbp(zzbtz zzbtzVar) {
        this.zza = zzbtzVar;
    }

    public final void onAdClosed() {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdClosed.");
        try {
            this.zza.zzf();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToShow(L5.b bVar) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdFailedToShow.");
        int a = bVar.a();
        String c = bVar.c();
        String b = bVar.b();
        int length = String.valueOf(a).length();
        StringBuilder sb = new StringBuilder(length + 60 + String.valueOf(c).length() + 16 + String.valueOf(b).length());
        sb.append("Mediation ad failed to show: Error Code = ");
        sb.append(a);
        sb.append(". Error Message = ");
        sb.append(c);
        sb.append(" Error Domain = ");
        sb.append(b);
        W5.p.f(sb.toString());
        try {
            this.zza.zzy(bVar.d());
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdOpened() {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdOpened.");
        try {
            this.zza.zzi();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onUserEarnedReward() {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onUserEarnedReward.");
        try {
            this.zza.zzz();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoComplete() {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onVideoComplete.");
        try {
            this.zza.zzt();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onVideoStart() {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onVideoStart.");
        try {
            this.zza.zzo();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void reportAdClicked() {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called reportAdClicked.");
        try {
            this.zza.zze();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void reportAdImpression() {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called reportAdImpression.");
        try {
            this.zza.zzk();
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onUserEarnedReward(f6.b bVar) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onUserEarnedReward.");
        try {
            this.zza.zzr(new zzcbq(bVar));
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }

    public final void onAdFailedToShow(String str) {
        com.google.android.gms.common.internal.t.e("#008 Must be called on the main UI thread.");
        W5.p.a("Adapter called onAdFailedToShow.");
        W5.p.f("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.zza.zzv(str);
        } catch (RemoteException e) {
            W5.p.i("#007 Could not call remote method.", e);
        }
    }
}
