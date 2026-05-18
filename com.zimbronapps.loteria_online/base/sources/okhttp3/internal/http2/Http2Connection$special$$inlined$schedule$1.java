package okhttp3.internal.http2;

import okhttp3.internal.concurrent.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2Connection$special$$inlined$schedule$1 extends Task {
    public final /* synthetic */ String e;
    public final /* synthetic */ Http2Connection f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$special$$inlined$schedule$1(String str, Http2Connection http2Connection, long j) {
        super(str, false, 2, null);
        this.e = str;
        this.f = http2Connection;
        this.g = j;
    }

    public long f() {
        boolean z;
        synchronized (this.f) {
            if (Http2Connection.h(this.f) < Http2Connection.g(this.f)) {
                z = true;
            } else {
                Http2Connection.v(this.f, Http2Connection.g(this.f) + 1);
                z = false;
            }
        }
        if (z) {
            Http2Connection.a(this.f, null);
            return -1L;
        }
        this.f.w0(false, 1, 0);
        return this.g;
    }
}
