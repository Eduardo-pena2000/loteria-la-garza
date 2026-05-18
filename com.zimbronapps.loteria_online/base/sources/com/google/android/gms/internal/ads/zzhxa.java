package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final class zzhxa implements zzhxd {
    private final zzhxm zza;

    public /* synthetic */ zzhxa(zzhxm zzhxmVar, byte[] bArr) {
        this.zza = zzhxmVar;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzhxe.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
