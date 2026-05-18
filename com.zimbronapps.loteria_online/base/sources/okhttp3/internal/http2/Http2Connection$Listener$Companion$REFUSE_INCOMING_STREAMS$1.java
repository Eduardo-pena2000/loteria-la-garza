package okhttp3.internal.http2;

import kotlin.jvm.internal.t;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1 extends Http2Connection.Listener {
    public void b(Http2Stream stream) {
        t.g(stream, "stream");
        stream.d(ErrorCode.REFUSED_STREAM, null);
    }
}
