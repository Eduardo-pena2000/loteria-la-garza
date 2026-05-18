package com.unity3d.services.core.network.model;

import Da.S;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class HttpResponseKt {
    public static final boolean isSuccessful(HttpResponse httpResponse) {
        t.g(httpResponse, "<this>");
        int statusCode = httpResponse.getStatusCode();
        return 200 <= statusCode && statusCode < 300;
    }

    public static final HttpResponse toHttpResponse(UnityAdsNetworkException unityAdsNetworkException) {
        t.g(unityAdsNetworkException, "<this>");
        Integer code = unityAdsNetworkException.getCode();
        int intValue = code != null ? code.intValue() : 520;
        Map h = S.h();
        String url = unityAdsNetworkException.getUrl();
        String str = url == null ? "" : url;
        String protocol = unityAdsNetworkException.getProtocol();
        String str2 = protocol == null ? "" : protocol;
        String client = unityAdsNetworkException.getClient();
        if (client == null) {
            client = "unknown";
        }
        return new HttpResponse("", intValue, h, str, str2, client, 0L, 64, null);
    }
}
