package com.applovin.shadow.okhttp3;

import com.applovin.shadow.okio.ByteString;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class WebSocketListener {
    public void onClosed(WebSocket webSocket, int i, String str) {
        t.g(webSocket, "webSocket");
        t.g(str, "reason");
    }

    public void onClosing(WebSocket webSocket, int i, String str) {
        t.g(webSocket, "webSocket");
        t.g(str, "reason");
    }

    public void onFailure(WebSocket webSocket, Throwable th, Response response) {
        t.g(webSocket, "webSocket");
        t.g(th, "t");
    }

    public void onMessage(WebSocket webSocket, ByteString byteString) {
        t.g(webSocket, "webSocket");
        t.g(byteString, "bytes");
    }

    public void onOpen(WebSocket webSocket, Response response) {
        t.g(webSocket, "webSocket");
        t.g(response, "response");
    }

    public void onMessage(WebSocket webSocket, String str) {
        t.g(webSocket, "webSocket");
        t.g(str, "text");
    }
}
