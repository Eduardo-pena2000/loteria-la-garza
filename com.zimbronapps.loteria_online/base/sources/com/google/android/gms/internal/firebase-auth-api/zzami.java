package com.google.android.gms.internal.firebase-auth-api;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzami implements zzamf {
    public final int zza(int i, Object obj, Object obj2) {
        zzamg zzamgVar = (zzamg) obj;
        if (zzamgVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzamgVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    public final Object zzb(Object obj) {
        return zzamg.zza().zzb();
    }

    public final Object zzc(Object obj) {
        ((zzamg) obj).zzc();
        return obj;
    }

    public final Map zzd(Object obj) {
        return (zzamg) obj;
    }

    public final Map zze(Object obj) {
        return (zzamg) obj;
    }

    public final boolean zzf(Object obj) {
        return !((zzamg) obj).zzd();
    }

    public final zzamd zza(Object obj) {
        throw new NoSuchMethodError();
    }

    public final Object zza(Object obj, Object obj2) {
        zzamg zzamgVar = (zzamg) obj;
        zzamg zzamgVar2 = (zzamg) obj2;
        if (!zzamgVar2.isEmpty()) {
            if (!zzamgVar.zzd()) {
                zzamgVar = zzamgVar.zzb();
            }
            zzamgVar.zza(zzamgVar2);
        }
        return zzamgVar;
    }
}
