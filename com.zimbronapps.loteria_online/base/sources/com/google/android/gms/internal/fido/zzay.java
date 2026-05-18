package com.google.android.gms.internal.fido;

import com.google.android.apps.common.proguard.SideEffectFree;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzay {
    private final String zza;
    private final Set zzb;
    private final boolean zzc;

    private zzay(String str, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.zza = "com.google.android.gms.fido";
        this.zzb = set;
        this.zzc = z4;
    }

    @SideEffectFree
    public final zzaq zza(String str, long j) {
        return new zzaq(this.zza, str, Long.valueOf(j), new zzak(false, false, false, this.zzc, false, this.zzb, zzav.zza, new zzaw(Long.class)), true);
    }

    @SideEffectFree
    public final zzaq zzb(String str, String str2) {
        return new zzaq(this.zza, str, str2, new zzak(false, false, false, this.zzc, false, this.zzb, zzat.zza, new zzau(String.class)), true);
    }

    @SideEffectFree
    public final zzaq zzc(String str, boolean z) {
        return new zzaq(this.zza, str, Boolean.valueOf(z), new zzak(false, false, false, this.zzc, false, this.zzb, zzar.zza, new zzas(Boolean.class)), true);
    }

    public final zzay zzd() {
        return new zzay(this.zza, this.zzb, false, false, false, true, false);
    }

    public final zzay zze(Set set) {
        return new zzay(this.zza, set, false, false, false, this.zzc, false);
    }

    public zzay(String str) {
        this("com.google.android.gms.fido", zzcf.zzk(), false, false, false, false, false);
    }
}
