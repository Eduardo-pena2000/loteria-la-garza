package com.google.android.recaptcha.internal;

import Ca.e;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzik extends WebViewClient {
    final /* synthetic */ zzja zza;

    public zzik(zzja zzjaVar) {
        this.zza = zzjaVar;
    }

    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    public final void onPageFinished(WebView webView, String str) {
        long zza = zzja.zzr(this.zza).zza(TimeUnit.MICROSECONDS);
        int i = zzbk.zza;
        zzbk.zza(zzbl.zzg.zza(), zza);
    }

    @e
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        zzbb zzbbVar = zzbb.zzc;
        zzba zzbaVar = (zzba) zzja.zzy(this.zza).get(Integer.valueOf(i));
        if (zzbaVar == null) {
            zzbaVar = zzba.zzM;
        }
        zzbd zzbdVar = new zzbd(zzbbVar, zzbaVar, null);
        this.zza.zzA().hashCode();
        zzbdVar.getMessage();
        this.zza.zzA().b(zzbdVar);
    }

    @e
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        zzja zzjaVar = this.zza;
        Uri parse = Uri.parse(str);
        zzja.zzp(zzjaVar);
        t.d(parse);
        if (!zzfk.zzc(parse) || zzja.zzp(this.zza).zza(parse)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzQ, null);
        this.zza.zzA().hashCode();
        parse.toString();
        this.zza.zzA().b(zzbdVar);
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
