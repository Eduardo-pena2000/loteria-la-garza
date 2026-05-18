package com.google.android.gms.internal.consent_sdk;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzda {
    private static Boolean zza;

    private zzda() {
    }

    public static void zza(WebView webView, String str) {
        boolean booleanValue;
        synchronized (zzda.class) {
            if (zza == null) {
                try {
                    webView.evaluateJavascript("(function(){})()", (ValueCallback) null);
                    zza = Boolean.TRUE;
                } catch (IllegalStateException unused) {
                    zza = Boolean.FALSE;
                }
                booleanValue = zza.booleanValue();
            } else {
                booleanValue = zza.booleanValue();
            }
        }
        if (booleanValue) {
            webView.evaluateJavascript(str, (ValueCallback) null);
        } else {
            webView.loadUrl("javascript:".concat(str));
        }
    }
}
