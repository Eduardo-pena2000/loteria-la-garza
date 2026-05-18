package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzi {
    public static zzao zza(Object obj) {
        if (obj == null) {
            return zzao.zzg;
        }
        if (obj instanceof String) {
            return new zzas((String) obj);
        }
        if (obj instanceof Double) {
            return new zzah((Double) obj);
        }
        if (obj instanceof Long) {
            return new zzah(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new zzah(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new zzaf((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            zzae zzaeVar = new zzae();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzaeVar.zzn(zzaeVar.zzh(), zza(it.next()));
            }
            return zzaeVar;
        }
        zzal zzalVar = new zzal();
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            zzao zza = zza(map.get(obj2));
            if (obj2 != null) {
                if (!(obj2 instanceof String)) {
                    obj2 = obj2.toString();
                }
                zzalVar.zzm((String) obj2, zza);
            }
        }
        return zzalVar;
    }

    public static zzao zzb(zzje zzjeVar) {
        if (zzjeVar == null) {
            return zzao.zzf;
        }
        int zzj = zzjeVar.zzj() - 1;
        if (zzj == 1) {
            return zzjeVar.zzc() ? new zzas(zzjeVar.zzd()) : zzao.zzm;
        }
        if (zzj == 2) {
            return zzjeVar.zzg() ? new zzah(Double.valueOf(zzjeVar.zzh())) : new zzah(null);
        }
        if (zzj == 3) {
            return zzjeVar.zze() ? new zzaf(Boolean.valueOf(zzjeVar.zzf())) : new zzaf(null);
        }
        if (zzj != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List zza = zzjeVar.zza();
        ArrayList arrayList = new ArrayList();
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            arrayList.add(zzb((zzje) it.next()));
        }
        return new zzap(zzjeVar.zzb(), arrayList);
    }
}
