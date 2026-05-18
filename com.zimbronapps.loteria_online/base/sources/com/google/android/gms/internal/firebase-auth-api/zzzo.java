package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzzo implements zzzn {
    private final zzzp zza;

    public /* synthetic */ zzzo(zzzp zzzpVar, zzzq zzzqVar) {
        this(zzzpVar);
    }

    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzzj.zza("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
        Throwable th = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception e) {
                if (th == null) {
                    th = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", th);
    }

    private zzzo(zzzp zzzpVar) {
        this.zza = zzzpVar;
    }
}
