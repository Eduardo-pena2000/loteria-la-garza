package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgdf {
    private final zzika zza;
    private final zzika zzb;
    private final ExecutorService zzc;
    private final zzika zzd;
    private x7.e zze = null;

    public zzgdf(zzika zzikaVar, zzika zzikaVar2, ExecutorService executorService, zzika zzikaVar3) {
        this.zza = zzikaVar;
        this.zzb = zzikaVar2;
        this.zzc = executorService;
        this.zzd = zzikaVar3;
    }

    public final synchronized x7.e zza() {
        try {
            x7.e eVar = this.zze;
            if (eVar != null) {
                return eVar;
            }
            Set set = (Set) this.zzb.zzb();
            ArrayList arrayList = new ArrayList(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                arrayList.add(((zzgdd) it.next()).zza());
            }
            zzgoe zzgoeVar = (zzgoe) this.zzd.zzb();
            x7.e zzk = zzgzo.zzk(zzgzo.zzm(arrayList), zzgde.zza, this.zzc);
            zzgoeVar.zze(2, zzk);
            this.zze = zzk;
            Iterator it2 = ((Set) this.zza.zzb()).iterator();
            while (it2.hasNext()) {
                ((zzgdd) it2.next()).zza();
            }
            x7.e eVar2 = this.zze;
            if (eVar2 != null) {
                return eVar2;
            }
            throw null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized x7.e zzb() {
        x7.e eVar;
        eVar = this.zze;
        if (eVar == null) {
            throw null;
        }
        return eVar;
    }
}
