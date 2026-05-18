package com.google.android.gms.internal.firebase-auth-api;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzca {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzbx zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzbx zzbxVar = (zzbx) it.next();
            if (zzbxVar.zzb(str)) {
                return zzbxVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
