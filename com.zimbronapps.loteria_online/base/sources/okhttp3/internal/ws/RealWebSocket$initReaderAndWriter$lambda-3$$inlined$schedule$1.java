package okhttp3.internal.ws;

import okhttp3.internal.concurrent.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1 extends Task {
    public final /* synthetic */ String e;
    public final /* synthetic */ RealWebSocket f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealWebSocket$initReaderAndWriter$lambda-3$$inlined$schedule$1(String str, RealWebSocket realWebSocket, long j) {
        super(str, false, 2, null);
        this.e = str;
        this.f = realWebSocket;
        this.g = j;
    }

    public long f() {
        this.f.s();
        return this.g;
    }
}
