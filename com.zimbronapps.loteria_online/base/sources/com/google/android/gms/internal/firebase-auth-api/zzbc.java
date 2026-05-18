package com.google.android.gms.internal.firebase-auth-api;

import com.google.android.gms.internal.firebase-auth-api.zzvv;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbc implements zzby {
    private final OutputStream zza;

    private zzbc(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzby zza(OutputStream outputStream) {
        return new zzbc(outputStream);
    }

    public final void zza(zzvv zzvvVar) throws IOException {
        try {
            ((zzvv) ((zzalf) ((zzvv.zza) zzvvVar.zzn()).zza().zze())).zza(this.zza);
        } finally {
            this.zza.close();
        }
    }

    public final void zza(zzxh zzxhVar) throws IOException {
        try {
            zzxhVar.zza(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
