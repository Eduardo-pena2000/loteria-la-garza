package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzeyp implements Callable {
    static final /* synthetic */ zzeyp zza = new zzeyp();

    private /* synthetic */ zzeyp() {
    }

    public final /* synthetic */ Object call() {
        Bundle bundle = new Bundle();
        Runtime runtime = Runtime.getRuntime();
        bundle.putLong("runtime_free", runtime.freeMemory());
        bundle.putLong("runtime_max", runtime.maxMemory());
        bundle.putLong("runtime_total", runtime.totalMemory());
        bundle.putInt("web_view_count", R5.t.l().zzl());
        if (((Boolean) S5.D.c().zzd(zzbhe.zzpO)).booleanValue()) {
            ActivityManager.MemoryInfo zzw = R5.t.l().zzw();
            if (zzw != null) {
                if (E6.q.l()) {
                    bundle.putLong("a_ad_mem", x.a(zzw));
                }
                bundle.putLong("a_total", zzw.totalMem);
                bundle.putLong("a_avai", zzw.availMem);
                bundle.putLong("a_threshold", zzw.threshold);
                bundle.putBoolean("a_is_low_mem", zzw.lowMemory);
            }
            bundle.putLong("runtime_avai_processors", runtime.availableProcessors());
        }
        return new zzeyr(bundle);
    }
}
