package S2;

import M2.q;
import M2.v;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class f extends S2.a {
    public q b;
    public final c c;
    public ByteBuffer d;
    public boolean e;
    public long f;
    public ByteBuffer g;
    public final int h;
    public final int i;

    public static final class a extends IllegalStateException {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            super("Buffer too small (" + i + " < " + i2 + ")");
            this.a = i;
            this.b = i2;
        }
    }

    static {
        v.a("media3.decoder");
    }

    public f(int i) {
        this(i, 0);
    }

    public static f s() {
        return new f(0);
    }

    public void f() {
        super.f();
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final ByteBuffer o(int i) {
        int i2 = this.h;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.d;
        throw new a(byteBuffer == null ? 0 : byteBuffer.capacity(), i);
    }

    public void p(int i) {
        int i2 = i + this.i;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = o(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer o = o(i3);
        o.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            o.put(byteBuffer);
        }
        this.d = o;
    }

    public final void q() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final boolean r() {
        return g(1073741824);
    }

    public void t(int i) {
        ByteBuffer byteBuffer = this.g;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.g = ByteBuffer.allocate(i);
        } else {
            this.g.clear();
        }
    }

    public f(int i, int i2) {
        this.c = new c();
        this.h = i;
        this.i = i2;
    }
}
