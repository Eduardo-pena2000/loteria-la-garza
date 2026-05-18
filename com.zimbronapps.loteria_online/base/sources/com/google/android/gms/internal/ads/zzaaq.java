package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaaq {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzaar zzaarVar) {
        zzb(zzaarVar);
        this.zza.add(new zzaap(handler, zzaarVar));
    }

    public final void zzb(zzaar zzaarVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zza;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzaap zzaapVar = (zzaap) it.next();
            if (zzaapVar.zzc() == zzaarVar) {
                zzaapVar.zza();
                copyOnWriteArrayList.remove(zzaapVar);
            }
        }
    }

    public final void zzc(int i, long j, long j2) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzaap zzaapVar = (zzaap) it.next();
            if (!zzaapVar.zzd()) {
                zzaapVar.zzb().post(new zzaao(zzaapVar, i, j, j2));
            }
        }
    }
}
