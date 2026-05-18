package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgmz {
    private final Set zza;
    private final zzgnq zzb;

    public zzgmz(zzgnq zzgnqVar, Set set) {
        this.zza = set;
        this.zzb = zzgnqVar;
    }

    public final void zza(List list) {
        this.zzb.zza(list);
    }

    public final Map zzb() {
        Map hashMap = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgnb) it.next()).zzb(hashMap);
        }
        return hashMap;
    }

    public final Map zzc(Context context, View view) {
        Map hashMap = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgnb) it.next()).zzc(hashMap, context, view);
        }
        return hashMap;
    }

    public final Map zzd() {
        Map hashMap = new HashMap();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgnb) it.next()).zzd(hashMap);
        }
        return hashMap;
    }
}
