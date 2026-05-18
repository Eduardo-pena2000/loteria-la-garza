package com.unity3d.services.core.network.core;

import Ca.s;
import Ca.t;
import cb.n;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.model.HttpResponse;
import java.util.Map;
import org.chromium.net.CronetException;
import org.chromium.net.NetworkException;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlResponseInfo;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CronetClient$execute$2$callback$1 extends UnityAdsUrlRequestCallback {
    final /* synthetic */ n $cont;
    final /* synthetic */ CronetClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetClient$execute$2$callback$1(n nVar, CronetClient cronetClient, ISDKDispatchers iSDKDispatchers, long j) {
        super(iSDKDispatchers, j);
        this.$cont = nVar;
        this.this$0 = cronetClient;
    }

    public void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        super.onCanceled(urlRequest, urlResponseInfo);
        NetworkTimeoutException networkTimeoutException = new NetworkTimeoutException("Network request timed out", null, null, urlResponseInfo != null ? urlResponseInfo.getUrl() : null, urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null, null, "cronet", 38, null);
        n nVar = this.$cont;
        s.a aVar = s.b;
        nVar.resumeWith(s.b(t.a(networkTimeoutException)));
    }

    public void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        super.onFailed(urlRequest, urlResponseInfo, cronetException);
        NetworkException networkException = cronetException instanceof NetworkException ? (NetworkException) cronetException : null;
        UnityAdsNetworkException unityAdsNetworkException = new UnityAdsNetworkException("Network request failed", null, urlResponseInfo != null ? Integer.valueOf(urlResponseInfo.getHttpStatusCode()) : null, urlResponseInfo != null ? urlResponseInfo.getUrl() : null, urlResponseInfo != null ? urlResponseInfo.getNegotiatedProtocol() : null, networkException != null ? Integer.valueOf(networkException.getCronetInternalErrorCode()) : null, "cronet", 2, null);
        n nVar = this.$cont;
        s.a aVar = s.b;
        nVar.resumeWith(s.b(t.a(unityAdsNetworkException)));
    }

    public void onSucceeded(UrlRequest request, UrlResponseInfo info, byte[] bodyBytes) {
        kotlin.jvm.internal.t.g(request, "request");
        kotlin.jvm.internal.t.g(info, "info");
        kotlin.jvm.internal.t.g(bodyBytes, "bodyBytes");
        n nVar = this.$cont;
        int httpStatusCode = info.getHttpStatusCode();
        Map allHeaders = info.getAllHeaders();
        String url = info.getUrl();
        String negotiatedProtocol = info.getNegotiatedProtocol();
        long access$getContentSize = CronetClient.access$getContentSize(this.this$0, info);
        kotlin.jvm.internal.t.f(allHeaders, "allHeaders");
        kotlin.jvm.internal.t.f(url, "url");
        kotlin.jvm.internal.t.f(negotiatedProtocol, "negotiatedProtocol");
        nVar.resumeWith(s.b(new HttpResponse(bodyBytes, httpStatusCode, allHeaders, url, negotiatedProtocol, "cronet", access$getContentSize)));
    }
}
