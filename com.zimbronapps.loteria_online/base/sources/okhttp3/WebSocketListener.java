package okhttp3;

import kotlin.jvm.internal.t;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class WebSocketListener {
    public void a(WebSocket webSocket, int i, String reason) {
        t.g(webSocket, "webSocket");
        t.g(reason, "reason");
    }

    public void b(WebSocket webSocket, int i, String reason) {
        t.g(webSocket, "webSocket");
        t.g(reason, "reason");
    }

    public void c(WebSocket webSocket, Throwable t, Response response) {
        t.g(webSocket, "webSocket");
        t.g(t, "t");
    }

    public void d(WebSocket webSocket, String text) {
        t.g(webSocket, "webSocket");
        t.g(text, "text");
    }

    public void e(WebSocket webSocket, h bytes) {
        t.g(webSocket, "webSocket");
        t.g(bytes, "bytes");
    }

    public void f(WebSocket webSocket, Response response) {
        t.g(webSocket, "webSocket");
        t.g(response, "response");
    }
}
