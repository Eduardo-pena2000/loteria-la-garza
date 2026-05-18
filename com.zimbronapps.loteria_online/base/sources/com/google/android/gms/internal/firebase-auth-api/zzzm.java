package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzzm implements zzzn {
    private final zzzp zza;

    public /* synthetic */ zzzm(zzzp zzzpVar, zzzq zzzqVar) {
        this(zzzpVar);
    }

    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzzj.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return this.zza.zza(str, null);
    }

    private zzzm(zzzp zzzpVar) {
        this.zza = zzzpVar;
    }
}
