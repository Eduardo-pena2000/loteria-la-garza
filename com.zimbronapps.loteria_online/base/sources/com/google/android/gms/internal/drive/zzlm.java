package com.google.android.gms.internal.drive;

import java.util.Iterator;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzlm implements zzll {
    public final Object zzb(Object obj, Object obj2) {
        zzlk zzlkVar = (zzlk) obj;
        zzlk zzlkVar2 = (zzlk) obj2;
        if (!zzlkVar2.isEmpty()) {
            if (!zzlkVar.isMutable()) {
                zzlkVar = zzlkVar.zzdx();
            }
            zzlkVar.zza(zzlkVar2);
        }
        return zzlkVar;
    }

    public final Map zzh(Object obj) {
        return (zzlk) obj;
    }

    public final Map zzi(Object obj) {
        return (zzlk) obj;
    }

    public final boolean zzj(Object obj) {
        return !((zzlk) obj).isMutable();
    }

    public final Object zzk(Object obj) {
        ((zzlk) obj).zzbp();
        return obj;
    }

    public final Object zzl(Object obj) {
        return zzlk.zzdw().zzdx();
    }

    public final zzlj zzm(Object obj) {
        throw new NoSuchMethodError();
    }

    public final int zzb(int i, Object obj, Object obj2) {
        zzlk zzlkVar = (zzlk) obj;
        if (zzlkVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzlkVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
