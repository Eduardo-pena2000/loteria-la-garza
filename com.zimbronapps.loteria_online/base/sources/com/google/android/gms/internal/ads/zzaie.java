package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzaie extends zzain {
    public final byte[] zza;

    public zzaie(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaie.class == obj.getClass()) {
            zzaie zzaieVar = (zzaie) obj;
            if (this.zzf.equals(zzaieVar.zzf) && Arrays.equals(this.zza, zzaieVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.zzf.hashCode() + 527) * 31) + Arrays.hashCode(this.zza);
    }
}
