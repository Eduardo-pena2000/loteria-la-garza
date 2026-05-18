package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzguu extends zzgsd {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzgrd zzb;

    public zzguu(Iterator it, zzgrd zzgrdVar) {
        this.zza = it;
        this.zzb = zzgrdVar;
    }

    public final Object zza() {
        zzgrd zzgrdVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzgrdVar = this.zzb;
            next = it.next();
        } while (!zzgrdVar.zza(next));
        return next;
    }
}
