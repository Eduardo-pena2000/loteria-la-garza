package com.google.android.gms.internal.drive;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzld extends zzla {
    private zzld() {
        super(null);
    }

    private static zzkp zzc(Object obj, long j) {
        return (zzkp) zznd.zzo(obj, j);
    }

    public final void zza(Object obj, long j) {
        zzc(obj, j).zzbp();
    }

    public /* synthetic */ zzld(zzlb zzlbVar) {
        this();
    }

    public final void zza(Object obj, Object obj2, long j) {
        zzkp zzc = zzc(obj, j);
        zzkp zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzc.zzbo()) {
                zzc = zzc.zzr(size2 + size);
            }
            zzc.addAll(zzc2);
        }
        if (size > 0) {
            zzc2 = zzc;
        }
        zznd.zza(obj, j, zzc2);
    }
}
