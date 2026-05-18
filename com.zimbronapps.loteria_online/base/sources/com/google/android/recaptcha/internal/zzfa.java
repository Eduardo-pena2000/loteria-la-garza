package com.google.android.recaptcha.internal;

import Ca.l;
import Ca.m;
import Na.q;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzfa implements zzey {
    private final l zza;

    public zzfa() {
        int i = zzav.zza;
        this.zza = m.b(zzez.zza);
    }

    public final zzsc zza(String str, zzto zztoVar) throws zzbd {
        zzew zzewVar = null;
        try {
            try {
                try {
                    zzewVar = ((zzex) this.zza.getValue()).zza(str);
                    zzewVar.zzc();
                    zzewVar.zze(zztoVar.zzd());
                    zzsc zzscVar = (zzsc) zzewVar.zza(zzsc.zzi());
                    zzewVar.zzd();
                    return zzscVar;
                } catch (zzbd e) {
                    if (zzewVar == null) {
                        throw e;
                    }
                    if (!t.c(e.zza(), zzba.zzau)) {
                        throw e;
                    }
                    try {
                        throw zzbc.zza(zztu.zzg(zzewVar.zzb().getErrorStream()).zzi());
                    } catch (Exception e2) {
                        throw new zzbd(zzbb.zzc, zzba.zzG, e2.getMessage());
                    }
                }
            } catch (Exception e3) {
                throw new zzbd(zzbb.zzc, zzba.zzF, e3.getMessage());
            }
        } catch (Throwable th) {
            if (zzewVar != null) {
                zzewVar.zzd();
            }
            throw th;
        }
    }

    public final String zzb(String str) throws zzbd {
        try {
            try {
                HttpURLConnection openConnection = new URL(str).openConnection();
                t.e(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = openConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new zzbd(zzbb.zzc, new zzba(httpURLConnection.getResponseCode()), null);
                }
                try {
                    return q.e(t.c("gzip", httpURLConnection.getContentEncoding()) ? new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream())) : new InputStreamReader(httpURLConnection.getInputStream()));
                } catch (Exception unused) {
                    throw new zzbd(zzbb.zzc, zzba.zzP, null);
                }
            } catch (Exception unused2) {
                throw new zzbd(zzbb.zzc, zzba.zzO, null);
            }
        } catch (Exception unused3) {
            throw new zzbd(zzbb.zzb, zzba.zzN, null);
        }
    }
}
