package com.google.android.gms.internal.games_v2;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzab {
    private final Handler zza;
    private boolean zzc;
    final Object zzb = new Object();
    private final HashMap zzd = new HashMap();

    public zzab(Looper looper, int i) {
        this.zza = new zzfl(looper);
    }

    public static /* bridge */ /* synthetic */ void zzb(zzab zzabVar) {
        synchronized (zzabVar.zzb) {
            zzabVar.zzc = false;
            zzabVar.zzd();
        }
    }

    public abstract void zza(String str, int i);

    public final void zzc(String str, int i) {
        synchronized (this.zzb) {
            try {
                if (!this.zzc) {
                    this.zzc = true;
                    this.zza.postDelayed(new zzaa(this), 1000L);
                }
                AtomicInteger atomicInteger = (AtomicInteger) this.zzd.get(str);
                if (atomicInteger == null) {
                    atomicInteger = new AtomicInteger();
                    this.zzd.put(str, atomicInteger);
                }
                atomicInteger.addAndGet(i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd() {
        synchronized (this.zzb) {
            try {
                for (Map.Entry entry : this.zzd.entrySet()) {
                    zza((String) entry.getKey(), ((AtomicInteger) entry.getValue()).get());
                }
                this.zzd.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
