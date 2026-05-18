package W5;

import S5.D;
import android.content.Context;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbyp;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class v implements f {
    public final Context a;
    public final String b;
    public String c;

    public v(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final String a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0170 A[PHI: r0
      0x0170: PHI (r0v5 W5.u) = (r0v4 W5.u), (r0v0 W5.u), (r0v8 W5.u) binds: [B:64:0x0164, B:58:0x016e, B:38:0x0128] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final W5.u b(java.lang.String r10, java.util.Map r11) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: W5.v.b(java.lang.String, java.util.Map):W5.u");
    }

    public final URL c(String str) {
        URL url = null;
        try {
            url = new URI(str).toURL();
        } catch (MalformedURLException e) {
            e = e;
            e(str, e);
        } catch (URISyntaxException e2) {
            e(str, e2);
            if (((Boolean) D.c().zzd(zzbhe.zzf)).booleanValue()) {
                url = d(str);
            }
        } catch (IllegalArgumentException e3) {
            e = e3;
            e(str, e);
        }
        if (url != null) {
            return url;
        }
        StringBuilder sb = new StringBuilder(str.length() + 47);
        sb.append("Falling back to direct new URL(\"");
        sb.append(str);
        sb.append("\") constructor.");
        p.a(sb.toString());
        return new URL(str);
    }

    public final URL d(String str) {
        URL url;
        try {
            p.a("Attempting to parse components, encode, and reconstruct URI.");
            URL url2 = new URL(str);
            URI uri = new URI(url2.getProtocol(), url2.getUserInfo(), url2.getHost(), url2.getPort(), url2.getPath(), url2.getQuery(), url2.getRef());
            url = uri.toURL();
            try {
                String obj = uri.toString();
                StringBuilder sb = new StringBuilder(str.length() + 114 + obj.length());
                sb.append("Successfully constructed URL after component encoding via new URI(parts).toURL() for original: \"");
                sb.append(str);
                sb.append("\" -> encoded URI: ");
                sb.append(obj);
                p.a(sb.toString());
            } catch (IllegalArgumentException e) {
                e = e;
                e(str, e);
                return url;
            } catch (URISyntaxException e2) {
                e = e2;
                e(str, e);
                return url;
            } catch (MalformedURLException e3) {
                e = e3;
                e(str, e);
                return url;
            }
        } catch (URISyntaxException | IllegalArgumentException | MalformedURLException e4) {
            e = e4;
            url = null;
        }
        return url;
    }

    public final void e(String str, Throwable th) {
        String message = th.getMessage();
        StringBuilder sb = new StringBuilder(str.length() + 32 + String.valueOf(message).length());
        sb.append("Error while parsing ping URL: ");
        sb.append(str);
        sb.append(". ");
        sb.append(message);
        p.f(sb.toString());
        zzbyp.zza(this.a).zzi(th, "HttpUrlPinger.pingUrl", ((Integer) D.c().zzd(zzbhe.zzoi)).intValue() / 100.0f);
    }

    public final u zza(String str) {
        return b(str, null);
    }
}
