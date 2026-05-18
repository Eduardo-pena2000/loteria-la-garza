package okhttp3.internal.connection;

import okhttp3.internal.concurrent.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RealConnectionPool$cleanupTask$1 extends Task {
    public final /* synthetic */ RealConnectionPool e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnectionPool$cleanupTask$1(RealConnectionPool realConnectionPool, String str) {
        super(str, false, 2, null);
        this.e = realConnectionPool;
    }

    public long f() {
        return this.e.b(System.nanoTime());
    }
}
