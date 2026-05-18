package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzko implements zzoi {
    protected int zza = 0;

    public static void zzc(Iterable iterable, List list) {
        zzkn.zzd(iterable, list);
    }

    public int zza(zzow zzowVar) {
        throw null;
    }

    public final zzle zzb() {
        try {
            int zzo = zzo();
            zzle zzleVar = zzle.zzb;
            byte[] bArr = new byte[zzo];
            zzlk zzlkVar = new zzlk(bArr, 0, zzo);
            zze(zzlkVar);
            zzlkVar.zzC();
            return new zzlc(bArr);
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public final byte[] zzd() {
        try {
            int zzo = zzo();
            byte[] bArr = new byte[zzo];
            zzlk zzlkVar = new zzlk(bArr, 0, zzo);
            zze(zzlkVar);
            zzlkVar.zzC();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
