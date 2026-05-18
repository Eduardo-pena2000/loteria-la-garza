package okhttp3.internal.http2;

import java.io.IOException;
import kotlin.jvm.internal.t;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.platform.Platform;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1 extends Task {
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ Http2Connection g;
    public final /* synthetic */ Http2Stream h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Http2Connection$ReaderRunnable$headers$lambda-2$$inlined$execute$default$1(String str, boolean z, Http2Connection http2Connection, Http2Stream http2Stream) {
        super(str, z);
        this.e = str;
        this.f = z;
        this.g = http2Connection;
        this.h = http2Stream;
    }

    public long f() {
        try {
            this.g.J().b(this.h);
            return -1L;
        } catch (IOException e) {
            Platform.a.g().k(t.o("Http2Connection.Listener failure for ", this.g.E()), 4, e);
            try {
                this.h.d(ErrorCode.PROTOCOL_ERROR, e);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
