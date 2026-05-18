package com.google.android.gms.internal.firebase-auth-api;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzc extends zza {
    public /* synthetic */ zzc(zzb zzbVar) {
        this();
    }

    public final URLConnection zza(URL url, String str) throws IOException {
        return url.openConnection();
    }

    private zzc() {
    }
}
