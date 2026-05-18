package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzfe implements zzdx {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzfe(Handler handler) {
        this.zzb = handler;
    }

    public static /* synthetic */ void zzp(zzfd zzfdVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzfdVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static zzfd zzq() {
        zzfd zzfdVar;
        List list = zza;
        synchronized (list) {
            try {
                zzfdVar = list.isEmpty() ? new zzfd(null) : (zzfd) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfdVar;
    }

    public final Looper zza() {
        return this.zzb.getLooper();
    }

    public final boolean zzb(int i) {
        return this.zzb.hasMessages(i);
    }

    public final zzdw zzc(int i) {
        Handler handler = this.zzb;
        zzfd zzq = zzq();
        zzq.zzb(handler.obtainMessage(i), this);
        return zzq;
    }

    public final zzdw zzd(int i, Object obj) {
        Handler handler = this.zzb;
        zzfd zzq = zzq();
        zzq.zzb(handler.obtainMessage(i, obj), this);
        return zzq;
    }

    public final zzdw zze(int i, int i2, int i3) {
        Handler handler = this.zzb;
        zzfd zzq = zzq();
        zzq.zzb(handler.obtainMessage(i, i2, i3), this);
        return zzq;
    }

    public final zzdw zzf(int i, int i2, int i3, Object obj) {
        Handler handler = this.zzb;
        zzfd zzq = zzq();
        zzq.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzq;
    }

    public final boolean zzg(zzdw zzdwVar) {
        return ((zzfd) zzdwVar).zzc(this.zzb);
    }

    public final boolean zzh(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    public final boolean zzi(int i, int i2) {
        return this.zzb.sendEmptyMessageDelayed(i, i2);
    }

    public final boolean zzj(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    public final void zzk(int i) {
        this.zzb.removeMessages(i);
    }

    public final void zzl(Runnable runnable) {
        this.zzb.removeCallbacks(runnable);
    }

    public final void zzm(Object obj) {
        this.zzb.removeCallbacksAndMessages((Object) null);
    }

    public final boolean zzn(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    public final boolean zzo(Runnable runnable, long j) {
        return this.zzb.postDelayed(runnable, 1000L);
    }
}
