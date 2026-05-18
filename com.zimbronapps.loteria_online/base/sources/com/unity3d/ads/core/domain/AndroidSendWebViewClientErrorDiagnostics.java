package com.unity3d.ads.core.domain;

import Ca.x;
import Da.Q;
import Da.S;
import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class AndroidSendWebViewClientErrorDiagnostics implements SendWebViewClientErrorDiagnostics {
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidSendWebViewClientErrorDiagnostics(SendDiagnosticEvent sendDiagnosticEvent) {
        t.g(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    public void invoke(List errors) {
        t.g(errors, "errors");
        Iterator it = errors.iterator();
        while (it.hasNext()) {
            WebViewClientError webViewClientError = (WebViewClientError) it.next();
            String url = webViewClientError.getUrl();
            Map f = (url == null || url.length() == 0) ? null : Q.f(x.a("webview_url", webViewClientError.getUrl()));
            Map o = S.o(x.a("reason", Integer.valueOf(webViewClientError.getReason().getCode())));
            if (webViewClientError.getStatusCode() != null) {
                o.put("webview_error_code", webViewClientError.getStatusCode());
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_error", null, f, o, null, null, 50, null);
        }
    }
}
