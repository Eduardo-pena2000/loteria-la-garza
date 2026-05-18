package okhttp3.internal.http2;

import Ca.I;
import okhttp3.internal.concurrent.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2Connection$pushResetLater$$inlined$execute$default$1 extends Task {
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Http2Connection g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ErrorCode i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushResetLater$$inlined$execute$default$1(String str, boolean z, Http2Connection http2Connection, int i, ErrorCode errorCode) {
        super(str, z);
        this.e = str;
        this.f = z;
        this.g = http2Connection;
        this.h = i;
        this.i = errorCode;
    }

    public long f() {
        Http2Connection.k(this.g).a(this.h, this.i);
        synchronized (this.g) {
            Http2Connection.c(this.g).remove(Integer.valueOf(this.h));
            I i = I.a;
        }
        return -1L;
    }
}
