package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzbfu extends PushbackInputStream {
    final /* synthetic */ zzbfx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbfu(zzbfx zzbfxVar, InputStream inputStream, int i) {
        super(inputStream, 1);
        Objects.requireNonNull(zzbfxVar);
        this.zza = zzbfxVar;
    }

    public final synchronized void close() throws IOException {
        this.zza.zzc.zzb();
        super.close();
    }
}
