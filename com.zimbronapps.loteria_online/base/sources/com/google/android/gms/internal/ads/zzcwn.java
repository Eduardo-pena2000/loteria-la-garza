package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcwn implements zzens {
    public final List zza;

    public zzcwn(List list) {
        this.zza = list;
    }

    public static zzekg zza(zzemm zzemmVar) {
        return new zzekh(zzemmVar, zzcwm.zza);
    }

    public static zzekg zzb(zzekg zzekgVar) {
        return new zzekh(zzekgVar, zzcwl.zza);
    }

    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgzo.zzr((x7.e) it.next(), new zzcwk(this), zzhaf.zza());
        }
    }

    public zzcwn(zzcwf zzcwfVar) {
        this.zza = Collections.singletonList(zzgzo.zza(zzcwfVar));
    }
}
