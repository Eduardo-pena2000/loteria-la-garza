package g3;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r {
    public static final AtomicLong h = new AtomicLong();
    public final long a;
    public final R2.j b;
    public final Uri c;
    public final Map d;
    public final long e;
    public final long f;
    public final long g;

    public r(long j, R2.j jVar, long j2) {
        this(j, jVar, jVar.a, Collections.emptyMap(), j2, 0L, 0L);
    }

    public static long a() {
        return h.getAndIncrement();
    }

    public r(long j, R2.j jVar, Uri uri, Map map, long j2, long j3, long j4) {
        this.a = j;
        this.b = jVar;
        this.c = uri;
        this.d = map;
        this.e = j2;
        this.f = j3;
        this.g = j4;
    }
}
