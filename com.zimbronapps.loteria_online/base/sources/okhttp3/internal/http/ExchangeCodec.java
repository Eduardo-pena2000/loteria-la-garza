package okhttp3.internal.http;

import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import xb.J;
import xb.L;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface ExchangeCodec {

    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    L a(Response response);

    long b(Response response);

    J c(Request request, long j);

    void cancel();

    void d(Request request);

    void finishRequest();

    void flushRequest();

    RealConnection getConnection();

    Response.Builder readResponseHeaders(boolean z);
}
