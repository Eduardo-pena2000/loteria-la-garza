package okhttp3;

import kotlin.jvm.internal.t;
import xb.f;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {
    public final /* synthetic */ MediaType b;
    public final /* synthetic */ h c;

    public long a() {
        return this.c.size();
    }

    public MediaType b() {
        return this.b;
    }

    public void g(f sink) {
        t.g(sink, "sink");
        sink.m0(this.c);
    }
}
