package okhttp3.internal.http2;

import java.io.IOException;
import okhttp3.internal.concurrent.Task;
import xb.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2Connection$pushDataLater$$inlined$execute$default$1 extends Task {
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Http2Connection g;
    public final /* synthetic */ int h;
    public final /* synthetic */ e i;
    public final /* synthetic */ int j;
    public final /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$pushDataLater$$inlined$execute$default$1(String str, boolean z, Http2Connection http2Connection, int i, e eVar, int i2, boolean z2) {
        super(str, z);
        this.e = str;
        this.f = z;
        this.g = http2Connection;
        this.h = i;
        this.i = eVar;
        this.j = i2;
        this.k = z2;
    }

    public long f() {
        try {
            boolean b = Http2Connection.k(this.g).b(this.h, this.i, this.j, this.k);
            if (b) {
                this.g.W().r(this.h, ErrorCode.CANCEL);
            }
            if (!b && !this.k) {
                return -1L;
            }
            synchronized (this.g) {
                Http2Connection.c(this.g).remove(Integer.valueOf(this.h));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
