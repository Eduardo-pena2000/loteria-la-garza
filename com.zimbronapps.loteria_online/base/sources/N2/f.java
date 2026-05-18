package N2;

import N2.b;
import P2.K;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class f implements b {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public b.a e;
    public b.a f;
    public b.a g;
    public b.a h;
    public boolean i;
    public e j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public f() {
        b.a aVar = b.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = b.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    public final long a(long j) {
        if (this.o < 1024) {
            return (long) (this.c * j);
        }
        long l = this.n - ((e) P2.a.e(this.j)).l();
        int i = this.h.a;
        int i2 = this.g.a;
        return i == i2 ? K.X0(j, l, this.o) : K.X0(j, l * i, this.o * i2);
    }

    public final boolean b() {
        e eVar;
        return this.p && ((eVar = this.j) == null || eVar.k() == 0);
    }

    public final ByteBuffer c() {
        int k;
        e eVar = this.j;
        if (eVar != null && (k = eVar.k()) > 0) {
            if (this.k.capacity() < k) {
                ByteBuffer order = ByteBuffer.allocateDirect(k).order(ByteOrder.nativeOrder());
                this.k = order;
                this.l = order.asShortBuffer();
            } else {
                this.k.clear();
                this.l.clear();
            }
            eVar.j(this.l);
            this.o += k;
            this.k.limit(k);
            this.m = this.k;
        }
        ByteBuffer byteBuffer = this.m;
        this.m = b.a;
        return byteBuffer;
    }

    public final b.a d(b.a aVar) {
        if (aVar.c != 2) {
            throw new b.b(aVar);
        }
        int i = this.b;
        if (i == -1) {
            i = aVar.a;
        }
        this.e = aVar;
        b.a aVar2 = new b.a(i, aVar.b, 2);
        this.f = aVar2;
        this.i = true;
        return aVar2;
    }

    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            e eVar = (e) P2.a.e(this.j);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            eVar.t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final void f() {
        e eVar = this.j;
        if (eVar != null) {
            eVar.s();
        }
        this.p = true;
    }

    public final void flush() {
        if (isActive()) {
            b.a aVar = this.e;
            this.g = aVar;
            b.a aVar2 = this.f;
            this.h = aVar2;
            if (this.i) {
                this.j = new e(aVar.a, aVar.b, this.c, this.d, aVar2.a);
            } else {
                e eVar = this.j;
                if (eVar != null) {
                    eVar.i();
                }
            }
        }
        this.m = b.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    public final void g(float f) {
        if (this.d != f) {
            this.d = f;
            this.i = true;
        }
    }

    public final void h(float f) {
        if (this.c != f) {
            this.c = f;
            this.i = true;
        }
    }

    public final boolean isActive() {
        return this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a);
    }

    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        b.a aVar = b.a.e;
        this.e = aVar;
        this.f = aVar;
        this.g = aVar;
        this.h = aVar;
        ByteBuffer byteBuffer = b.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
