package com.google.android.gms.internal.firebase-auth-api;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzajm implements zzamm {
    protected int zza = 0;

    public int zza(zzanb zzanbVar) {
        int zzi = zzi();
        if (zzi != -1) {
            return zzi;
        }
        int zza = zzanbVar.zza(this);
        zzb(zza);
        return zza;
    }

    public void zzb(int i) {
        throw new UnsupportedOperationException();
    }

    public int zzi() {
        throw new UnsupportedOperationException();
    }

    public final zzajv zzj() {
        try {
            zzake zzc = zzajv.zzc(zzl());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final byte[] zzk() {
        try {
            byte[] bArr = new byte[zzl()];
            zzakn zzb = zzakn.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    public final void zza(OutputStream outputStream) throws IOException {
        zzakn zza = zzakn.zza(outputStream, zzakn.zze(zzl()));
        zza(zza);
        zza.zzc();
    }
}
