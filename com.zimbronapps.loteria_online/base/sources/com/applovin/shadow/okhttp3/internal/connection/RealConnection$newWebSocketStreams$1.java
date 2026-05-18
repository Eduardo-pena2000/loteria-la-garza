package com.applovin.shadow.okhttp3.internal.connection;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.BufferedSource;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class RealConnection$newWebSocketStreams$1 extends RealWebSocket.Streams {
    final /* synthetic */ Exchange $exchange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$newWebSocketStreams$1(BufferedSource bufferedSource, BufferedSink bufferedSink, Exchange exchange) {
        super(true, bufferedSource, bufferedSink);
        this.$exchange = exchange;
    }

    public void close() {
        this.$exchange.bodyComplete(-1L, true, true, null);
    }
}
