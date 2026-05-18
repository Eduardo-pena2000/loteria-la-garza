package okhttp3.internal.http2;

import okhttp3.internal.concurrent.Task;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1 extends Task {
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Http2Connection.ReaderRunnable g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Settings i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1(String str, boolean z, Http2Connection.ReaderRunnable readerRunnable, boolean z2, Settings settings) {
        super(str, z);
        this.e = str;
        this.f = z;
        this.g = readerRunnable;
        this.h = z2;
        this.i = settings;
    }

    public long f() {
        this.g.f(this.h, this.i);
        return -1L;
    }
}
