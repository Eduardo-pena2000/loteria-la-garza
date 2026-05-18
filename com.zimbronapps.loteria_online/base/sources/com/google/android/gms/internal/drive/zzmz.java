package com.google.android.gms.internal.drive;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzmz extends zzmx {
    private static void zza(Object obj, zzmy zzmyVar) {
        ((zzkk) obj).zzrq = zzmyVar;
    }

    public final /* synthetic */ void zzc(Object obj, zzns zznsVar) throws IOException {
        ((zzmy) obj).zza(zznsVar);
    }

    public final void zzd(Object obj) {
        ((zzkk) obj).zzrq.zzbp();
    }

    public final /* synthetic */ void zze(Object obj, Object obj2) {
        zza(obj, (zzmy) obj2);
    }

    public final /* synthetic */ Object zzez() {
        return zzmy.zzfb();
    }

    public final /* synthetic */ void zzf(Object obj, Object obj2) {
        zza(obj, (zzmy) obj2);
    }

    public final /* synthetic */ Object zzg(Object obj, Object obj2) {
        zzmy zzmyVar = (zzmy) obj;
        zzmy zzmyVar2 = (zzmy) obj2;
        return zzmyVar2.equals(zzmy.zzfa()) ? zzmyVar : zzmy.zza(zzmyVar, zzmyVar2);
    }

    public final /* synthetic */ int zzn(Object obj) {
        return ((zzmy) obj).zzcx();
    }

    public final /* synthetic */ Object zzr(Object obj) {
        return ((zzkk) obj).zzrq;
    }

    public final /* synthetic */ int zzs(Object obj) {
        return ((zzmy) obj).zzfc();
    }

    public final /* synthetic */ void zza(Object obj, zzns zznsVar) throws IOException {
        ((zzmy) obj).zzb(zznsVar);
    }

    public final /* synthetic */ void zza(Object obj, int i, zzjc zzjcVar) {
        ((zzmy) obj).zzb((i << 3) | 2, zzjcVar);
    }

    public final /* synthetic */ void zza(Object obj, int i, long j) {
        ((zzmy) obj).zzb(i << 3, Long.valueOf(j));
    }
}
