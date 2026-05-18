package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzhau {
    private final OutputStream zza;

    private zzhau(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzhau zzb(OutputStream outputStream) {
        return new zzhau(outputStream);
    }

    public final void zza(zzhql zzhqlVar) throws IOException {
        try {
            zzhqlVar.zzaO(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
