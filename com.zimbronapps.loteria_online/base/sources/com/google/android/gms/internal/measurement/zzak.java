package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface zzak {
    static zzao zzu(zzak zzakVar, zzao zzaoVar, zzg zzgVar, List list) {
        if (zzakVar.zzj(zzaoVar.zzc())) {
            zzao zzk = zzakVar.zzk(zzaoVar.zzc());
            if (zzk instanceof zzai) {
                return ((zzai) zzk).zza(zzgVar, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", new Object[]{zzaoVar.zzc()}));
        }
        if (!"hasOwnProperty".equals(zzaoVar.zzc())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", new Object[]{zzaoVar.zzc()}));
        }
        zzh.zza("hasOwnProperty", 1, list);
        return zzakVar.zzj(zzgVar.zza((zzao) list.get(0)).zzc()) ? zzao.zzk : zzao.zzl;
    }

    static Iterator zzv(Map map) {
        return new zzaj(map.keySet().iterator());
    }

    boolean zzj(String str);

    zzao zzk(String str);

    void zzm(String str, zzao zzaoVar);
}
