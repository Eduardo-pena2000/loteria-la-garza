package okhttp3.internal.ws;

import java.io.IOException;
import kotlin.jvm.internal.t;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.ws.RealWebSocket;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RealWebSocket$connect$1 implements Callback {
    public final /* synthetic */ RealWebSocket a;
    public final /* synthetic */ Request b;

    public void onFailure(Call call, IOException e) {
        t.g(call, "call");
        t.g(e, "e");
        this.a.l(e, null);
    }

    public void onResponse(Call call, Response response) {
        t.g(call, "call");
        t.g(response, "response");
        Exchange g = response.g();
        try {
            this.a.i(response, g);
            t.d(g);
            RealWebSocket.Streams n = g.n();
            WebSocketExtensions a = WebSocketExtensions.g.a(response.r());
            RealWebSocket.g(this.a, a);
            if (!RealWebSocket.f(this.a, a)) {
                RealWebSocket realWebSocket = this.a;
                synchronized (realWebSocket) {
                    RealWebSocket.d(realWebSocket).clear();
                    realWebSocket.j(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            try {
                this.a.n(Util.i + " WebSocket " + this.b.j().n(), n);
                this.a.m().f(this.a, response);
                this.a.p();
            } catch (Exception e) {
                this.a.l(e, null);
            }
        } catch (IOException e2) {
            if (g != null) {
                g.v();
            }
            this.a.l(e2, response);
            Util.m(response);
        }
    }
}
