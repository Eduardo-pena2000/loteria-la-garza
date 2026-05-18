package com.google.android.gms.internal.firebase-auth-api;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzaz implements zzbv {
    private final InputStream zza;

    private zzaz(InputStream inputStream) {
        this.zza = inputStream;
    }

    public static zzbv zza(byte[] bArr) {
        return new zzaz(new ByteArrayInputStream(bArr));
    }

    public final zzxh zzb() throws IOException {
        try {
            return zzxh.zza(this.zza, zzaku.zza());
        } finally {
            this.zza.close();
        }
    }

    public final zzvv zza() throws IOException {
        try {
            return zzvv.zza(this.zza, zzaku.zza());
        } finally {
            this.zza.close();
        }
    }
}
