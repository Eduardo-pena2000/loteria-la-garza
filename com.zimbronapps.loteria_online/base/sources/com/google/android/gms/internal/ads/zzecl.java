package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzecl implements zzaqu {
    final /* synthetic */ zzecm zza;

    public zzecl(zzecm zzecmVar) {
        Objects.requireNonNull(zzecmVar);
        this.zza = zzecmVar;
    }

    public final void zza(int i) {
        zzaqv zzd;
        try {
            zzfpb zza = zzfpc.zza();
            zza.zzh(i != 0 ? i != 1 ? i != 2 ? i != 3 ? 7 : 6 : 5 : 4 : 3);
            if (i == 0 && (zzd = this.zza.zzc().zzd()) != null) {
                zza.zzb(zzd.zzb());
                zza.zzc(zzd.zzc());
                zza.zzd(zzd.zzd());
                zza.zze(zzd.zze());
                zza.zzf(zzd.zzf());
                if (!TextUtils.isEmpty(zzd.zza())) {
                    zza.zza(zzd.zza());
                }
                if (!TextUtils.isEmpty(zzd.zzg())) {
                    zza.zzg(zzd.zzg());
                }
            }
            zzecm zzecmVar = this.zza;
            zzecmVar.zzc().zzc();
            zzdxz zzd2 = zzecmVar.zzd();
            String encodeToString = Base64.encodeToString(((zzfpc) zza.zzbm()).zzaN(), 1);
            if (((Boolean) S5.D.c().zzd(zzbhe.zzfO)).booleanValue()) {
                zzdxy zza2 = zzd2.zza();
                zza2.zzc("action", "irda");
                zza2.zzc("irdd", encodeToString);
                zza2.zzf();
            }
            zzecmVar.zze().c(true);
        } catch (Exception e) {
            if (((Boolean) S5.D.c().zzd(zzbhe.zzfP)).booleanValue()) {
                zzecm zzecmVar2 = this.zza;
                if (zzecmVar2.zzb == null) {
                    zzecmVar2.zzb = zzbyp.zzc(zzecmVar2.zzb());
                }
                zzecmVar2.zzb.zzh(e, "InstallReferrerUnsampled.onInstallReferrerSetupFinished");
                return;
            }
            zzecm zzecmVar3 = this.zza;
            if (zzecmVar3.zza == null) {
                zzecmVar3.zza = zzbyp.zza(zzecmVar3.zzb());
            }
            zzecmVar3.zza.zzh(e, "InstallReferrer.onInstallReferrerSetupFinished");
        }
    }
}
