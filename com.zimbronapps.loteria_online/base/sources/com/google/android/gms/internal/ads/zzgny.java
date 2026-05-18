package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgny implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzgoa zza;

    public zzgny(zzgoa zzgoaVar) {
        Objects.requireNonNull(zzgoaVar);
        this.zza = zzgoaVar;
    }

    public final void onOpActiveChanged(String str, int i, String str2, boolean z) {
        zzgoa zzgoaVar = this.zza;
        synchronized (zzgoaVar) {
            try {
                if (z) {
                    zzgoaVar.zzg(System.currentTimeMillis());
                    zzgoaVar.zzj(true);
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (zzgoaVar.zzh() > 0 && currentTimeMillis >= zzgoaVar.zzh()) {
                        zzgoaVar.zzi(currentTimeMillis - zzgoaVar.zzh());
                    }
                    zzgoaVar.zzj(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
