package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzeab extends zzbqj {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfoe zzd;
    final /* synthetic */ zzcen zze;
    final /* synthetic */ zzeak zzf;

    public zzeab(zzeak zzeakVar, Object obj, String str, long j, zzfoe zzfoeVar, zzcen zzcenVar) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfoeVar;
        this.zze = zzcenVar;
        Objects.requireNonNull(zzeakVar);
        this.zzf = zzeakVar;
    }

    public final void zze() {
        synchronized (this.zza) {
            zzeak zzeakVar = this.zzf;
            String str = this.zzb;
            zzeakVar.zzm(str, true, "", (int) (R5.t.o().b() - this.zzc));
            zzeakVar.zzr().zzb(str);
            zzeakVar.zzs().zzb(str);
            zzfor zzt = zzeakVar.zzt();
            zzfoe zzfoeVar = this.zzd;
            zzfoeVar.zzd(true);
            zzt.zzb(zzfoeVar.zzm());
            this.zze.zzc(Boolean.TRUE);
        }
    }

    public final void zzf(String str) {
        synchronized (this.zza) {
            zzeak zzeakVar = this.zzf;
            String str2 = this.zzb;
            zzeakVar.zzm(str2, false, str, (int) (R5.t.o().b() - this.zzc));
            zzeakVar.zzr().zzc(str2, "error");
            zzeakVar.zzs().zzc(str2, "error");
            zzfor zzt = zzeakVar.zzt();
            zzfoe zzfoeVar = this.zzd;
            zzfoeVar.zzk(str);
            zzfoeVar.zzd(false);
            zzt.zzb(zzfoeVar.zzm());
            this.zze.zzc(Boolean.FALSE);
        }
    }
}
