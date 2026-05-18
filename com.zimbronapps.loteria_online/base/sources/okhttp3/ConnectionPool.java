package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.t;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.RealConnectionPool;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ConnectionPool {
    public final RealConnectionPool a;

    public ConnectionPool(RealConnectionPool delegate) {
        t.g(delegate, "delegate");
        this.a = delegate;
    }

    public final RealConnectionPool a() {
        return this.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConnectionPool(int i, long j, TimeUnit timeUnit) {
        this(new RealConnectionPool(TaskRunner.i, i, j, timeUnit));
        t.g(timeUnit, "timeUnit");
    }

    public ConnectionPool() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
