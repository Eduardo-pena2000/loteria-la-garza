package com.unity3d.services.core.network.mapper;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.request.WebRequest;
import java.util.Map;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebRequestToHttpRequestKt {
    public static final HttpRequest toHttpRequest(WebRequest webRequest) {
        t.g(webRequest, "<this>");
        String url = webRequest.getUrl().toString();
        String requestType = webRequest.getRequestType();
        t.f(requestType, "requestType");
        RequestType valueOf = RequestType.valueOf(requestType);
        Map headers = webRequest.getHeaders();
        byte[] body = webRequest.getBody();
        t.f(url, "toString()");
        t.f(headers, "headers");
        return new HttpRequest(url, null, valueOf, body, headers, null, null, null, null, 0, 0, 0, 0, false, null, null, 0, 131042, null);
    }
}
