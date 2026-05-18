package com.applovin.shadow.okhttp3.internal.http2;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.io.IOException;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 extends Http2Connection.Listener {
    public void onStream(Http2Stream http2Stream) throws IOException {
        t.g(http2Stream, "stream");
        http2Stream.close(ErrorCode.REFUSED_STREAM, null);
    }
}
