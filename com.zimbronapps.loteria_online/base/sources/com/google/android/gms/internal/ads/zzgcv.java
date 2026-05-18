package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzgcv implements zzgda {
    private final byte[] zza;

    public zzgcv(byte[] bArr) {
        this.zza = bArr;
    }

    public final /* synthetic */ void zza(Object obj, OutputStream outputStream) throws IOException {
        outputStream.write((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ Object zzb(InputStream inputStream) {
        try {
            return zzgxf.zza(inputStream);
        } catch (IOException e) {
            throw new zzgcw("Cannot read bytes.", e);
        }
    }

    public final /* synthetic */ Object zzc() {
        return this.zza;
    }
}
