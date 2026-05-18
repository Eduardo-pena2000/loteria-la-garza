package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class zzdhd {
    protected final Map zza = new HashMap();

    public zzdhd(Set set) {
        zzr(set);
    }

    public final synchronized void zzp(zzdje zzdjeVar) {
        zzq(zzdjeVar.zza, zzdjeVar.zzb);
    }

    public final synchronized void zzq(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzr(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzp((zzdje) it.next());
        }
    }

    public final synchronized void zzs(zzdhc zzdhcVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            ((Executor) entry.getValue()).execute(new zzdhb(zzdhcVar, entry.getKey()));
        }
    }
}
