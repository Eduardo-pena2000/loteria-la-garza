package com.google.android.recaptcha.internal;

import Ca.l;
import Ca.m;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfm {
    private final l zza;

    public zzfm() {
        int i = zzav.zza;
        this.zza = m.b(zzfl.zza);
    }

    public final HttpURLConnection zza(String str) throws zzbd, MalformedURLException, IOException {
        if (!((zzfk) this.zza.getValue()).zzb(str)) {
            throw new zzbd(zzbb.zzc, zzba.zzQ, null);
        }
        HttpURLConnection openConnection = new URL(str).openConnection();
        t.e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        return openConnection;
    }
}
