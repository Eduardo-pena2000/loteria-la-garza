package okhttp3.internal.http2;

import okhttp3.internal.concurrent.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2Connection$sendDegradedPingLater$$inlined$execute$default$1 extends Task {
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Http2Connection g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$sendDegradedPingLater$$inlined$execute$default$1(String str, boolean z, Http2Connection http2Connection) {
        super(str, z);
        this.e = str;
        this.f = z;
        this.g = http2Connection;
    }

    public long f() {
        this.g.w0(false, 2, 0);
        return -1L;
    }
}
