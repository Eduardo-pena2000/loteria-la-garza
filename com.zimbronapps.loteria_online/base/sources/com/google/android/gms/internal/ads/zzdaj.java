package com.google.android.gms.internal.ads;

import V5.q0;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzdaj {
    private final zzfnu zza;
    private final W5.a zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzika zzg;
    private final String zzh;
    private final zzfba zzi;
    private final q0 zzj;
    private final zzfjk zzk;
    private final int zzl;
    private final zzdgy zzm;

    public zzdaj(zzfnu zzfnuVar, W5.a aVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, zzika zzikaVar, q0 q0Var, String str2, zzfba zzfbaVar, zzfjk zzfjkVar, zzdgy zzdgyVar, int i) {
        this.zza = zzfnuVar;
        this.zzb = aVar;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzikaVar;
        this.zzh = str2;
        this.zzi = zzfbaVar;
        this.zzj = q0Var;
        this.zzk = zzfjkVar;
        this.zzm = zzdgyVar;
        this.zzl = i;
    }

    public final x7.e zza(Bundle bundle) {
        this.zzm.zza();
        zzfno zzfnoVar = zzfno.SIGNALS;
        zzfnu zzfnuVar = this.zza;
        Objects.requireNonNull(zzfnuVar);
        return zzfnf.zza(this.zzi.zza(new zzdah(new Bundle(), new Bundle()), bundle, this.zzl == 2), zzfnoVar, zzfnuVar).zzi();
    }

    public final x7.e zzb() {
        Bundle bundle = new Bundle();
        if (((Boolean) S5.D.c().zzd(zzbhe.zzcK)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzt;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        x7.e zza = zza(bundle);
        return this.zza.zzb(zzfno.REQUEST_PARCEL, zza, (x7.e) this.zzg.zzb()).zza(new zzdai(this, zza, bundle)).zzi();
    }

    public final /* synthetic */ zzbzu zzc(x7.e eVar, Bundle bundle) {
        zzdah zzdahVar = (zzdah) eVar.get();
        Bundle bundle2 = zzdahVar.zza;
        String str = (String) ((x7.e) this.zzg.zzb()).get();
        boolean z = ((Boolean) S5.D.c().zzd(zzbhe.zzhV)).booleanValue() && this.zzj.zzx();
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        return new zzbzu(bundle2, this.zzb, this.zzc, this.zzd, list, packageInfo, str, str2, null, null, z, this.zzk.zza(), bundle, zzdahVar.zzb, this.zzl);
    }
}
