package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzctr extends zzcwf {
    private final zzcjl zzc;
    private final int zzd;
    private final Context zze;
    private final zzctf zzf;
    private final zzdmc zzg;
    private final zzdiq zzh;
    private final zzdbs zzi;
    private final boolean zzj;
    private final zzcdz zzk;
    private final zzdxz zzl;
    private boolean zzm;

    public zzctr(zzcwe zzcweVar, Context context, zzcjl zzcjlVar, int i, zzctf zzctfVar, zzdmc zzdmcVar, zzdiq zzdiqVar, zzdbs zzdbsVar, zzcdz zzcdzVar, zzdxz zzdxzVar) {
        super(zzcweVar);
        this.zzm = false;
        this.zzc = zzcjlVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzctfVar;
        this.zzg = zzdmcVar;
        this.zzh = zzdiqVar;
        this.zzi = zzdbsVar;
        this.zzj = ((Boolean) S5.D.c().zzd(zzbhe.zzgu)).booleanValue();
        this.zzk = zzcdzVar;
        this.zzl = zzdxzVar;
    }

    public final void zza(zzber zzberVar) {
        zzcjl zzcjlVar = this.zzc;
        if (zzcjlVar != null) {
            zzcjlVar.zzay(zzberVar);
        }
    }

    public final void zzb(Activity activity, zzbfe zzbfeVar, boolean z) throws RemoteException {
        zzcjl zzcjlVar;
        zzfir zzC;
        if (activity == null) {
            activity = this.zze;
        }
        boolean z2 = this.zzj;
        if (z2) {
            this.zzh.zza();
        }
        R5.t.g();
        zzdmc zzdmcVar = this.zzg;
        if (!F0.t(zzdmcVar.zzb())) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzpb)).booleanValue()) {
                R5.t.g();
                F0.s(activity, this.zzb, this.zzl);
            }
            if (((Boolean) S5.D.c().zzd(zzbhe.zzbi)).booleanValue()) {
                R5.t.g();
                if (F0.l(activity)) {
                    int i = o0.b;
                    W5.p.f("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://goo.gle/admob-interstitial-policies");
                    this.zzi.zze();
                    if (((Boolean) S5.D.c().zzd(zzbhe.zzbj)).booleanValue()) {
                        new zzfvr(activity.getApplicationContext(), R5.t.w().a()).zza(this.zza.zzb.zzb.zzb);
                        return;
                    }
                    return;
                }
            }
        }
        if (((Boolean) S5.D.c().zzd(zzbhe.zznq)).booleanValue() && (zzcjlVar = this.zzc) != null && (zzC = zzcjlVar.zzC()) != null && zzC.zzar && zzC.zzas != this.zzk.zzj()) {
            int i2 = o0.b;
            W5.p.f("The app open consent form has been shown.");
            this.zzi.zzc(zzfkm.zzd(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.zzm) {
            int i3 = o0.b;
            W5.p.f("App open interstitial ad is already visible.");
            this.zzi.zzc(zzfkm.zzd(10, null, null));
        }
        if (this.zzm) {
            return;
        }
        try {
            zzdmcVar.zza(z, activity, this.zzi);
            if (z2) {
                this.zzh.zzb();
            }
            this.zzm = true;
        } catch (zzdmb e) {
            this.zzi.zzd(e);
        }
    }

    public final int zzc() {
        return this.zzd;
    }

    public final void zzd() {
        super.zzd();
        zzcjl zzcjlVar = this.zzc;
        if (zzcjlVar != null) {
            zzcjlVar.destroy();
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}
