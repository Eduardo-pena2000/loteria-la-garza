package okhttp3.internal.ws;

import okhttp3.internal.concurrent.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RealWebSocket$writeOneFrame$lambda-8$$inlined$execute$default$1 extends Task {
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ RealWebSocket g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealWebSocket$writeOneFrame$lambda-8$$inlined$execute$default$1(String str, boolean z, RealWebSocket realWebSocket) {
        super(str, z);
        this.e = str;
        this.f = z;
        this.g = realWebSocket;
    }

    public long f() {
        this.g.h();
        return -1L;
    }
}
