package okhttp3.internal.connection;

import okhttp3.internal.ws.RealWebSocket;
import xb.f;
import xb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RealConnection$newWebSocketStreams$1 extends RealWebSocket.Streams {
    public final /* synthetic */ g d;
    public final /* synthetic */ f e;
    public final /* synthetic */ Exchange f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$newWebSocketStreams$1(g gVar, f fVar, Exchange exchange) {
        super(true, gVar, fVar);
        this.d = gVar;
        this.e = fVar;
        this.f = exchange;
    }

    public void close() {
        this.f.a(-1L, true, true, null);
    }
}
