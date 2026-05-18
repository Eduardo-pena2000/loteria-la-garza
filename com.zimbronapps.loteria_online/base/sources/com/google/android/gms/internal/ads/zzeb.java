package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeb implements Runnable {
    private final /* synthetic */ CopyOnWriteArraySet zza;
    private final /* synthetic */ int zzb;
    private final /* synthetic */ zzdy zzc;

    public /* synthetic */ zzeb(CopyOnWriteArraySet copyOnWriteArraySet, int i, zzdy zzdyVar) {
        this.zza = copyOnWriteArraySet;
        this.zzb = i;
        this.zzc = zzdyVar;
    }

    public final /* synthetic */ void run() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzdy zzdyVar = this.zzc;
            ((zzea) it.next()).zza(this.zzb, zzdyVar);
        }
    }
}
