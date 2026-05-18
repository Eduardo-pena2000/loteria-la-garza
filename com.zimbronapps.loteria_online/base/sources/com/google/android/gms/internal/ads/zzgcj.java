package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzgcj implements zzgcd {
    private final int zza;
    private final byte[] zzb;

    public zzgcj(int i, byte[] bArr) {
        this.zza = i;
        this.zzb = bArr;
    }

    public final int zza() {
        return this.zza;
    }

    public final String zzb() throws IOException {
        return new String(this.zzb);
    }
}
