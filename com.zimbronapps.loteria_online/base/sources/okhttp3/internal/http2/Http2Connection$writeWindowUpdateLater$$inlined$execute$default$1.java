package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1 extends Task {
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Http2Connection g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1(String str, boolean z, Http2Connection http2Connection, int i, long j) {
        super(str, z);
        this.e = str;
        this.f = z;
        this.g = http2Connection;
        this.h = i;
        this.i = j;
    }

    public long f() {
        try {
            this.g.W().t(this.h, this.i);
            return -1L;
        } catch (IOException e) {
            Http2Connection.a(this.g, e);
            return -1L;
        }
    }
}
