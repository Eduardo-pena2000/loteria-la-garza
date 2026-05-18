package okhttp3;

import kotlin.jvm.internal.t;
import xb.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RequestBody$Companion$toRequestBody$2 extends RequestBody {
    public final /* synthetic */ MediaType b;
    public final /* synthetic */ int c;
    public final /* synthetic */ byte[] d;
    public final /* synthetic */ int e;

    public RequestBody$Companion$toRequestBody$2(MediaType mediaType, int i, byte[] bArr, int i2) {
        this.b = mediaType;
        this.c = i;
        this.d = bArr;
        this.e = i2;
    }

    public long a() {
        return this.c;
    }

    public MediaType b() {
        return this.b;
    }

    public void g(f sink) {
        t.g(sink, "sink");
        sink.write(this.d, this.e, this.c);
    }
}
