package Va;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class a extends Ua.a {
    public long f(long j, long j2) {
        return ThreadLocalRandom.current().nextLong(j, j2);
    }

    public Random g() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        t.f(current, "current(...)");
        return current;
    }
}
