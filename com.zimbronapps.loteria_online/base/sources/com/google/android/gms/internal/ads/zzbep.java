package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbep implements Comparator {
    public zzbep(zzbeq zzbeqVar) {
        Objects.requireNonNull(zzbeqVar);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbef zzbefVar = (zzbef) obj;
        zzbef zzbefVar2 = (zzbef) obj2;
        if (zzbefVar.zzb() < zzbefVar2.zzb()) {
            return -1;
        }
        if (zzbefVar.zzb() <= zzbefVar2.zzb()) {
            if (zzbefVar.zza() < zzbefVar2.zza()) {
                return -1;
            }
            if (zzbefVar.zza() <= zzbefVar2.zza()) {
                float zzd = (zzbefVar.zzd() - zzbefVar.zzb()) * (zzbefVar.zzc() - zzbefVar.zza());
                float zzd2 = (zzbefVar2.zzd() - zzbefVar2.zzb()) * (zzbefVar2.zzc() - zzbefVar2.zza());
                if (zzd > zzd2) {
                    return -1;
                }
                if (zzd >= zzd2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
