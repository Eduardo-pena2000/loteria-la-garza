package okhttp3.internal.ws;

import Na.c;
import java.io.Closeable;
import java.util.zip.Deflater;
import kotlin.jvm.internal.t;
import xb.J;
import xb.e;
import xb.h;
import xb.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MessageDeflater implements Closeable {
    public final boolean a;
    public final e b;
    public final Deflater c;
    public final i d;

    public MessageDeflater(boolean z) {
        this.a = z;
        e eVar = new e();
        this.b = eVar;
        Deflater deflater = new Deflater(-1, true);
        this.c = deflater;
        this.d = new i((J) eVar, deflater);
    }

    public final void a(e buffer) {
        t.g(buffer, "buffer");
        if (this.b.A() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.a) {
            this.c.reset();
        }
        this.d.j1(buffer, buffer.A());
        this.d.flush();
        if (b(this.b, MessageDeflaterKt.a())) {
            long A = this.b.A() - 4;
            e.a x = e.x(this.b, null, 1, null);
            try {
                x.c(A);
                c.a(x, null);
            } finally {
            }
        } else {
            this.b.writeByte(0);
        }
        e eVar = this.b;
        buffer.j1(eVar, eVar.A());
    }

    public final boolean b(e eVar, h hVar) {
        return eVar.t(eVar.A() - hVar.size(), hVar);
    }

    public void close() {
        this.d.close();
    }
}
