package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhat implements zzhbl {
    private final InputStream zza;

    private zzhat(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzhbl zza(byte[] bArr) {
        return new zzhat(new ByteArrayInputStream(bArr));
    }

    public final zzhql zzb() throws IOException {
        try {
            return zzhql.zzg(this.zza, zzibb.zza());
        } finally {
            this.zza.close();
        }
    }
}
