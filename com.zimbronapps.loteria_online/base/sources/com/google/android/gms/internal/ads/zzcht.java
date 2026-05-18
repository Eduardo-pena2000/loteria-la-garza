package com.google.android.gms.internal.ads;

import V5.o0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
final /* synthetic */ class zzcht implements zzfxz {
    private final /* synthetic */ String zza;

    public /* synthetic */ zzcht(String str) {
        this.zza = str;
    }

    public final /* synthetic */ URLConnection zza() {
        int i = zzchu.zzd;
        R5.t.u();
        int intValue = ((Integer) S5.D.c().zzd(zzbhe.zzaj)).intValue();
        URL url = new URL(this.zza);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 > 20) {
                throw new IOException("Too many redirects (20)");
            }
            int i3 = zzfxs.zzb;
            HttpURLConnection openConnection = url.openConnection();
            openConnection.setConnectTimeout(intValue);
            openConnection.setReadTimeout(intValue);
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = openConnection;
            W5.m mVar = new W5.m(null);
            mVar.a(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            mVar.c(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                throw new IOException("Protocol is null");
            }
            if (!protocol.equals("http") && !protocol.equals("https")) {
                throw new IOException("Unsupported scheme: ".concat(protocol));
            }
            String concat = "Redirecting to ".concat(headerField);
            int i4 = o0.b;
            W5.p.a(concat);
            httpURLConnection.disconnect();
            url = url2;
        }
    }
}
