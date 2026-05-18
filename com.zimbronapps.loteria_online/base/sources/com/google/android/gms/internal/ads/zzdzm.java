package com.google.android.gms.internal.ads;

import V5.o0;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdzm {
    private final zzbph zza;

    public zzdzm(zzbph zzbphVar) {
        this.zza = zzbphVar;
    }

    private final void zzs(zzdzl zzdzlVar) throws RemoteException {
        String zza = zzdzlVar.zza();
        String concat = "Dispatching AFMA event on publisher webview: ".concat(zza);
        int i = o0.b;
        W5.p.e(concat);
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdzl("initialize", null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("creation", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("nativeObjectCreated");
        zzs(zzdzlVar);
    }

    public final void zzc(long j) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("creation", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("nativeObjectNotCreated");
        zzs(zzdzlVar);
    }

    public final void zzd(long j) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdzlVar);
    }

    public final void zze(long j) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onAdLoaded");
        zzs(zzdzlVar);
    }

    public final void zzf(long j, int i) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onAdFailedToLoad");
        zzdzlVar.zzd(Integer.valueOf(i));
        zzs(zzdzlVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onAdOpened");
        zzs(zzdzlVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onAdClicked");
        this.zza.zzb(zzdzlVar.zza());
    }

    public final void zzi(long j) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("interstitial", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onAdClosed");
        zzs(zzdzlVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onNativeAdObjectNotAvailable");
        zzs(zzdzlVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onRewardedAdLoaded");
        zzs(zzdzlVar);
    }

    public final void zzl(long j, int i) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onRewardedAdFailedToLoad");
        zzdzlVar.zzd(Integer.valueOf(i));
        zzs(zzdzlVar);
    }

    public final void zzm(long j) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onRewardedAdOpened");
        zzs(zzdzlVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onRewardedAdFailedToShow");
        zzdzlVar.zzd(Integer.valueOf(i));
        zzs(zzdzlVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onRewardedAdClosed");
        zzs(zzdzlVar);
    }

    public final void zzp(long j, zzcaw zzcawVar) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onUserEarnedReward");
        zzdzlVar.zze(zzcawVar.zze());
        zzdzlVar.zzf(Integer.valueOf(zzcawVar.zzf()));
        zzs(zzdzlVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onAdImpression");
        zzs(zzdzlVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzdzl zzdzlVar = new zzdzl("rewarded", null);
        zzdzlVar.zzb(Long.valueOf(j));
        zzdzlVar.zzc("onAdClicked");
        zzs(zzdzlVar);
    }
}
