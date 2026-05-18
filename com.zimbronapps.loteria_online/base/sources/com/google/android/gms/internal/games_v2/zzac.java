package com.google.android.gms.internal.games_v2;

import java.util.concurrent.atomic.AtomicReference;
import z.Y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzac {
    private final AtomicReference zza = new AtomicReference();

    public abstract zzab zza();

    public final void zzb() {
        zzab zzabVar = (zzab) this.zza.get();
        if (zzabVar != null) {
            zzabVar.zzd();
        }
    }

    public final void zzc(String str, int i) {
        zzab zzabVar = (zzab) this.zza.get();
        if (zzabVar == null) {
            zzab zza = zza();
            AtomicReference atomicReference = this.zza;
            while (true) {
                if (Y.a(atomicReference, (Object) null, zza)) {
                    zzabVar = zza;
                    break;
                } else if (atomicReference.get() != null) {
                    zzabVar = (zzab) this.zza.get();
                    break;
                }
            }
        }
        zzabVar.zzc(str, i);
    }
}
