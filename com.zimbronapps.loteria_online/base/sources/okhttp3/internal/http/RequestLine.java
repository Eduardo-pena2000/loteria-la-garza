package okhttp3.internal.http;

import java.net.Proxy;
import kotlin.jvm.internal.t;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RequestLine {
    public static final RequestLine a = new RequestLine();

    private RequestLine() {
    }

    public final String a(Request request, Proxy.Type proxyType) {
        t.g(request, "request");
        t.g(proxyType, "proxyType");
        StringBuilder sb = new StringBuilder();
        sb.append(request.h());
        sb.append(' ');
        RequestLine requestLine = a;
        if (requestLine.b(request, proxyType)) {
            sb.append(request.j());
        } else {
            sb.append(requestLine.c(request.j()));
        }
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        t.f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public final boolean b(Request request, Proxy.Type type) {
        return !request.g() && type == Proxy.Type.HTTP;
    }

    public final String c(HttpUrl url) {
        t.g(url, "url");
        String d = url.d();
        String f = url.f();
        if (f == null) {
            return d;
        }
        return d + '?' + f;
    }
}
