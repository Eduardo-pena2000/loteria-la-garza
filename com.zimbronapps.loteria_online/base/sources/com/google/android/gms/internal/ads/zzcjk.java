package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcjk extends WebChromeClient {
    private final zzcjl zza;

    public zzcjk(zzcjl zzcjlVar) {
        this.zza = zzcjlVar;
    }

    private static final Context zzb(WebView webView) {
        if (!(webView instanceof zzcjl)) {
            return webView.getContext();
        }
        zzcjl zzcjlVar = (zzcjl) webView;
        Activity zzj = zzcjlVar.zzj();
        return zzj != null ? zzj : zzcjlVar.getContext();
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcjl)) {
            int i = o0.b;
            W5.p.f("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        U5.z zzL = ((zzcjl) webView).zzL();
        if (zzL != null) {
            zzL.zzb();
        } else {
            int i2 = o0.b;
            W5.p.f("Tried to close an AdWebView not associated with an overlay.");
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        int length = String.valueOf(message).length();
        StringBuilder sb = new StringBuilder(length + 6 + String.valueOf(sourceId).length() + 1 + String.valueOf(lineNumber).length() + 1);
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzcjj.zza[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            int i2 = o0.b;
            W5.p.c(sb2);
        } else if (i == 2) {
            int i3 = o0.b;
            W5.p.f(sb2);
        } else if (i == 3 || i == 4) {
            int i4 = o0.b;
            W5.p.e(sb2);
        } else if (i != 5) {
            int i5 = o0.b;
            W5.p.e(sb2);
        } else {
            int i6 = o0.b;
            W5.p.a(sb2);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        zzcjl zzcjlVar = this.zza;
        if (zzcjlVar.zzQ() != null) {
            webView2.setWebViewClient(zzcjlVar.zzQ());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > 1048576) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(j + Math.min(131072L, j4), 1048576L);
        } else {
            if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onGeolocationPermissionsShowPrompt(java.lang.String r6, android.webkit.GeolocationPermissions.Callback r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L59
            com.google.android.gms.internal.ads.zzcjl r0 = r5.zza
            R5.t.g()
            android.content.Context r1 = r0.getContext()
            java.lang.String r2 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r1 = V5.F0.f(r1, r2)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L24
            R5.t.g()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = V5.F0.f(r0, r1)
            if (r0 == 0) goto L26
        L24:
            r0 = r3
            goto L27
        L26:
            r0 = r2
        L27:
            com.google.android.gms.internal.ads.zzbgv r1 = com.google.android.gms.internal.ads.zzbhe.zzoH
            com.google.android.gms.internal.ads.zzbhc r4 = S5.D.c()
            java.lang.Object r1 = r4.zzd(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3d
            r7.invoke(r6, r2, r3)
            goto L40
        L3d:
            r7.invoke(r6, r0, r3)
        L40:
            com.google.android.gms.internal.ads.zzbgv r6 = com.google.android.gms.internal.ads.zzbhe.zzoI
            com.google.android.gms.internal.ads.zzbhc r7 = S5.D.c()
            java.lang.Object r6 = r7.zzd(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L59
            int r6 = V5.o0.b
            java.lang.String r6 = "AdWebChromeClient.onGeolocationPermissionsShowPrompt()"
            W5.p.a(r6)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjk.onGeolocationPermissionsShowPrompt(java.lang.String, android.webkit.GeolocationPermissions$Callback):void");
    }

    public final void onHideCustomView() {
        U5.z zzL = this.zza.zzL();
        if (zzL != null) {
            zzL.zzc();
        } else {
            int i = o0.b;
            W5.p.f("Could not get ad overlay when hiding custom view.");
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "alert", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return zza(zzb(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return zza(zzb(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        U5.z zzL = this.zza.zzL();
        if (zzL != null) {
            zzL.z1(view, customViewCallback);
            zzL.y1(i);
        } else {
            int i2 = o0.b;
            W5.p.f("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
        }
    }

    public final boolean zza(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzcjl zzcjlVar;
        R5.b zzh;
        try {
            zzcjlVar = this.zza;
        } catch (WindowManager.BadTokenException e) {
            int i = o0.b;
            W5.p.g("Fail to display Dialog.", e);
        }
        if (zzcjlVar != null && zzcjlVar.zzP() != null && zzcjlVar.zzP().zzh() != null && (zzh = zzcjlVar.zzP().zzh()) != null && !zzh.b()) {
            StringBuilder sb = new StringBuilder(str.length() + 9 + String.valueOf(str3).length() + 2);
            sb.append("window.");
            sb.append(str);
            sb.append("('");
            sb.append(str3);
            sb.append("')");
            zzh.c(sb.toString());
            return false;
        }
        R5.t.g();
        AlertDialog.Builder p = F0.p(context);
        p.setTitle(str2);
        if (z) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(context);
            textView.setText(str3);
            EditText editText = new EditText(context);
            editText.setText(str4);
            linearLayout.addView(textView);
            linearLayout.addView(editText);
            p.setView(linearLayout).setPositiveButton(17039370, new zzcji(jsPromptResult, editText)).setNegativeButton(17039360, new zzcjh(jsPromptResult)).setOnCancelListener(new zzcjg(jsPromptResult)).create().show();
        } else {
            p.setMessage(str3).setPositiveButton(17039370, new zzcjf(jsResult)).setNegativeButton(17039360, new zzcje(jsResult)).setOnCancelListener(new zzcjd(jsResult)).create().show();
        }
        return true;
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
