package T9;

import T9.c;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ c a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ c.f d;
    public final /* synthetic */ ByteBuffer e;
    public final /* synthetic */ long f;

    public /* synthetic */ b(c cVar, String str, int i, c.f fVar, ByteBuffer byteBuffer, long j) {
        this.a = cVar;
        this.b = str;
        this.c = i;
        this.d = fVar;
        this.e = byteBuffer;
        this.f = j;
    }

    public final void run() {
        c.i(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
