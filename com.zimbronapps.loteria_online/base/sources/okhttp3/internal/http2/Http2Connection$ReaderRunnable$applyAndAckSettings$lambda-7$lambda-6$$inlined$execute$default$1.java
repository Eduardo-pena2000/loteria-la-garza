package okhttp3.internal.http2;

import kotlin.jvm.internal.O;
import okhttp3.internal.concurrent.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1 extends Task {
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Http2Connection g;
    public final /* synthetic */ O h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1(String str, boolean z, Http2Connection http2Connection, O o) {
        super(str, z);
        this.e = str;
        this.f = z;
        this.g = http2Connection;
        this.h = o;
    }

    public long f() {
        this.g.J().a(this.g, (Settings) this.h.a);
        return -1L;
    }
}
