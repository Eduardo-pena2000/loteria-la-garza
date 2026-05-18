package okhttp3;

import Na.c;
import java.io.File;
import kotlin.jvm.internal.t;
import xb.L;
import xb.f;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {
    public final /* synthetic */ MediaType b;
    public final /* synthetic */ File c;

    public long a() {
        return this.c.length();
    }

    public MediaType b() {
        return this.b;
    }

    public void g(f sink) {
        t.g(sink, "sink");
        L j = x.j(this.c);
        try {
            sink.p1(j);
            c.a(j, null);
        } finally {
        }
    }
}
