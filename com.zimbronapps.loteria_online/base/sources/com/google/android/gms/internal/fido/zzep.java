package com.google.android.gms.internal.fido;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzep extends zzev {
    private static final zzep zza = new zzep(zzev.zze());
    private final AtomicReference zzb;

    public zzep(zzev zzevVar) {
        this.zzb = new AtomicReference(zzevVar);
    }

    public static final zzep zzb() {
        return zza;
    }

    public final zzdr zza() {
        return ((zzev) this.zzb.get()).zza();
    }

    public final zzfi zzc() {
        return ((zzev) this.zzb.get()).zzc();
    }

    public final boolean zzd(String str, Level level, boolean z) {
        ((zzev) this.zzb.get()).zzd(str, level, z);
        return false;
    }
}
