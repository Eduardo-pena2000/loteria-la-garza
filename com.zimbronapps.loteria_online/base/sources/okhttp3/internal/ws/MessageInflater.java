package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.jvm.internal.t;
import xb.L;
import xb.e;
import xb.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class MessageInflater implements Closeable {
    public final boolean a;
    public final e b;
    public final Inflater c;
    public final r d;

    public MessageInflater(boolean z) {
        this.a = z;
        e eVar = new e();
        this.b = eVar;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.d = new r((L) eVar, inflater);
    }

    public final void a(e buffer) {
        t.g(buffer, "buffer");
        if (this.b.A() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.a) {
            this.c.reset();
        }
        this.b.p1(buffer);
        this.b.writeInt(65535);
        long bytesRead = this.c.getBytesRead() + this.b.A();
        do {
            this.d.a(buffer, Long.MAX_VALUE);
        } while (this.c.getBytesRead() < bytesRead);
    }

    public void close() {
        this.d.close();
    }
}
