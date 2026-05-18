package okhttp3.internal.connection;

import Ca.g;
import java.io.IOException;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RouteException extends RuntimeException {
    public final IOException a;
    public IOException b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException firstConnectException) {
        super(firstConnectException);
        t.g(firstConnectException, "firstConnectException");
        this.a = firstConnectException;
        this.b = firstConnectException;
    }

    public final void a(IOException e) {
        t.g(e, "e");
        g.a(this.a, e);
        this.b = e;
    }

    public final IOException b() {
        return this.a;
    }

    public final IOException c() {
        return this.b;
    }
}
