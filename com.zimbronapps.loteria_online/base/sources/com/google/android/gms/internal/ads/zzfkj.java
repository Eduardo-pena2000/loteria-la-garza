package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzfkj {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzgzy zzc;

    public zzfkj(Callable callable, zzgzy zzgzyVar) {
        this.zzb = callable;
        this.zzc = zzgzyVar;
    }

    public final synchronized void zza(int i) {
        Deque deque = this.zza;
        int size = i - deque.size();
        for (int i2 = 0; i2 < size; i2++) {
            deque.add(this.zzc.submit(this.zzb));
        }
    }

    public final synchronized x7.e zzb() {
        zza(1);
        return (x7.e) this.zza.poll();
    }

    public final synchronized void zzc(x7.e eVar) {
        this.zza.addFirst(eVar);
    }
}
