package com.google.android.gms.internal.firebase-auth-api;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zza {
    private static zza zza = new zzc(null);

    public static synchronized zza zza() {
        zza zzaVar;
        synchronized (zza.class) {
            zzaVar = zza;
        }
        return zzaVar;
    }

    public abstract URLConnection zza(URL url, String str) throws IOException;
}
