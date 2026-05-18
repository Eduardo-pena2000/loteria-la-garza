package okhttp3.internal.ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.jvm.internal.t;
import xb.e;
import xb.f;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class WebSocketWriter implements Closeable {
    public final boolean a;
    public final f b;
    public final Random c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final e g;
    public final e h;
    public boolean i;
    public MessageDeflater j;
    public final byte[] k;
    public final e.a l;

    public WebSocketWriter(boolean z, f sink, Random random, boolean z2, boolean z3, long j) {
        t.g(sink, "sink");
        t.g(random, "random");
        this.a = z;
        this.b = sink;
        this.c = random;
        this.d = z2;
        this.e = z3;
        this.f = j;
        this.g = new e();
        this.h = sink.getBuffer();
        this.k = z ? new byte[4] : null;
        this.l = z ? new e.a() : null;
    }

    public final void a(int i, h hVar) {
        h hVar2 = h.e;
        if (i != 0 || hVar != null) {
            if (i != 0) {
                WebSocketProtocol.a.c(i);
            }
            e eVar = new e();
            eVar.writeShort(i);
            if (hVar != null) {
                eVar.m0(hVar);
            }
            hVar2 = eVar.y();
        }
        try {
            b(8, hVar2);
        } finally {
            this.i = true;
        }
    }

    public final void b(int i, h hVar) {
        if (this.i) {
            throw new IOException("closed");
        }
        int size = hVar.size();
        if (size > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        this.h.writeByte(i | 128);
        if (this.a) {
            this.h.writeByte(size | 128);
            Random random = this.c;
            byte[] bArr = this.k;
            t.d(bArr);
            random.nextBytes(bArr);
            this.h.write(this.k);
            if (size > 0) {
                long A = this.h.A();
                this.h.m0(hVar);
                e eVar = this.h;
                e.a aVar = this.l;
                t.d(aVar);
                eVar.v(aVar);
                this.l.d(A);
                WebSocketProtocol.a.b(this.l, this.k);
                this.l.close();
            }
        } else {
            this.h.writeByte(size);
            this.h.m0(hVar);
        }
        this.b.flush();
    }

    public final void c(int i, h data) {
        t.g(data, "data");
        if (this.i) {
            throw new IOException("closed");
        }
        this.g.m0(data);
        int i2 = i | 128;
        if (this.d && data.size() >= this.f) {
            MessageDeflater messageDeflater = this.j;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.e);
                this.j = messageDeflater;
            }
            messageDeflater.a(this.g);
            i2 = i | 192;
        }
        long A = this.g.A();
        this.h.writeByte(i2);
        int i3 = this.a ? 128 : 0;
        if (A <= 125) {
            this.h.writeByte(i3 | ((int) A));
        } else if (A <= 65535) {
            this.h.writeByte(i3 | 126);
            this.h.writeShort((int) A);
        } else {
            this.h.writeByte(i3 | 127);
            this.h.R(A);
        }
        if (this.a) {
            Random random = this.c;
            byte[] bArr = this.k;
            t.d(bArr);
            random.nextBytes(bArr);
            this.h.write(this.k);
            if (A > 0) {
                e eVar = this.g;
                e.a aVar = this.l;
                t.d(aVar);
                eVar.v(aVar);
                this.l.d(0L);
                WebSocketProtocol.a.b(this.l, this.k);
                this.l.close();
            }
        }
        this.h.j1(this.g, A);
        this.b.emit();
    }

    public void close() {
        MessageDeflater messageDeflater = this.j;
        if (messageDeflater == null) {
            return;
        }
        messageDeflater.close();
    }

    public final void d(h payload) {
        t.g(payload, "payload");
        b(9, payload);
    }

    public final void f(h payload) {
        t.g(payload, "payload");
        b(10, payload);
    }
}
