package com.google.android.gms.internal.auth;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfj extends zzfl {
    public /* synthetic */ zzfj(zzfi zzfiVar) {
        super(null);
    }

    public final void zza(Object obj, long j) {
        ((zzez) zzhj.zzf(obj, j)).zzb();
    }

    public final void zzb(Object obj, Object obj2, long j) {
        zzez zzezVar = (zzez) zzhj.zzf(obj, j);
        zzez zzezVar2 = (zzez) zzhj.zzf(obj2, j);
        int size = zzezVar.size();
        int size2 = zzezVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzezVar.zzc()) {
                zzezVar = zzezVar.zzd(size2 + size);
            }
            zzezVar.addAll(zzezVar2);
        }
        if (size > 0) {
            zzezVar2 = zzezVar;
        }
        zzhj.zzp(obj, j, zzezVar2);
    }

    private zzfj() {
        super(null);
    }
}
