package com.google.android.gms.internal.consent_sdk;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzpa implements zzrq {
    protected int zza = 0;

    public final void zzE(OutputStream outputStream) throws IOException {
        int zzn = zzn();
        int i = zzpv.zzf;
        if (zzn > 4096) {
            zzn = 4096;
        }
        zzpt zzptVar = new zzpt(outputStream, zzn);
        zzB(zzptVar);
        zzptVar.zzI();
    }

    public int zzj(zzsa zzsaVar) {
        throw null;
    }

    public final zzpm zzk() {
        try {
            int zzn = zzn();
            zzpm zzpmVar = zzpm.zzb;
            byte[] bArr = new byte[zzn];
            int i = zzpv.zzf;
            zzpr zzprVar = new zzpr(bArr, 0, zzn);
            zzB(zzprVar);
            if (zzprVar.zzb() == 0) {
                return new zzpk(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }
}
