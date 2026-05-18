package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzeoj extends zzepk {
    private final zzdjv zza;

    public zzeoj(zzdbd zzdbdVar, zzdjk zzdjkVar, zzdbx zzdbxVar, zzdcm zzdcmVar, zzdcr zzdcrVar, zzdbs zzdbsVar, zzdgj zzdgjVar, zzdki zzdkiVar, zzddq zzddqVar, zzdjv zzdjvVar, zzdgf zzdgfVar) {
        super(zzdbdVar, zzdjkVar, zzdbxVar, zzdcmVar, zzdcrVar, zzdgjVar, zzddqVar, zzdkiVar, zzdgfVar, zzdbsVar);
        this.zza = zzdjvVar;
    }

    public final void zzn() {
        this.zza.zzc();
    }

    public final void zzo() {
        this.zza.zza();
    }

    public final void zzp(zzcas zzcasVar) {
        this.zza.zzb(zzcasVar);
    }

    public final void zzr(zzcaw zzcawVar) throws RemoteException {
        this.zza.zzb(new zzcas(zzcawVar.zze(), zzcawVar.zzf()));
    }

    public final void zzt() throws RemoteException {
        this.zza.zzc();
    }

    public final void zzz() throws RemoteException {
        this.zza.zzb(null);
    }
}
