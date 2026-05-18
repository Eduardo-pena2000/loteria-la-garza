package N2;

import N2.b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d implements b {
    public b.a b;
    public b.a c;
    public b.a d;
    public b.a e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public d() {
        ByteBuffer byteBuffer = b.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        b.a aVar = b.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
    }

    public final boolean a() {
        return this.g.hasRemaining();
    }

    public boolean b() {
        return this.h && this.g == b.a;
    }

    public ByteBuffer c() {
        ByteBuffer byteBuffer = this.g;
        this.g = b.a;
        return byteBuffer;
    }

    public final b.a d(b.a aVar) {
        this.d = aVar;
        this.e = g(aVar);
        return isActive() ? this.e : b.a.e;
    }

    public final void f() {
        this.h = true;
        i();
    }

    public final void flush() {
        this.g = b.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        h();
    }

    public abstract b.a g(b.a aVar);

    public boolean isActive() {
        return this.e != b.a.e;
    }

    public final ByteBuffer k(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    public final void reset() {
        flush();
        this.f = b.a;
        b.a aVar = b.a.e;
        this.d = aVar;
        this.e = aVar;
        this.b = aVar;
        this.c = aVar;
        j();
    }

    public void h() {
    }

    public void i() {
    }

    public void j() {
    }
}
