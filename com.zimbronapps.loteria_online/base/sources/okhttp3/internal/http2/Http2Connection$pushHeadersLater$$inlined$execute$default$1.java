package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import okhttp3.internal.concurrent.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2Connection$pushHeadersLater$$inlined$execute$default$1 extends Task {
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Http2Connection g;
    public final /* synthetic */ int h;
    public final /* synthetic */ List i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushHeadersLater$$inlined$execute$default$1(String str, boolean z, Http2Connection http2Connection, int i, List list, boolean z2) {
        super(str, z);
        this.e = str;
        this.f = z;
        this.g = http2Connection;
        this.h = i;
        this.i = list;
        this.j = z2;
    }

    public long f() {
        boolean onHeaders = Http2Connection.k(this.g).onHeaders(this.h, this.i, this.j);
        if (onHeaders) {
            try {
                this.g.W().r(this.h, ErrorCode.CANCEL);
            } catch (IOException unused) {
                return -1L;
            }
        }
        if (!onHeaders && !this.j) {
            return -1L;
        }
        synchronized (this.g) {
            Http2Connection.c(this.g).remove(Integer.valueOf(this.h));
        }
        return -1L;
    }
}
