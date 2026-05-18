package V2;

import N2.b;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a0 extends N2.d {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m = P2.K.f;
    public int n;
    public long o;

    public boolean b() {
        return super.b() && this.n == 0;
    }

    public ByteBuffer c() {
        int i;
        if (super.b() && (i = this.n) > 0) {
            k(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.c();
    }

    public void e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i == 0) {
            return;
        }
        int min = Math.min(i, this.l);
        this.o += min / this.b.d;
        this.l -= min;
        byteBuffer.position(position + min);
        if (this.l > 0) {
            return;
        }
        int i2 = i - min;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer k = k(length);
        int p = P2.K.p(length, 0, this.n);
        k.put(this.m, 0, p);
        int p2 = P2.K.p(length - p, 0, i2);
        byteBuffer.limit(byteBuffer.position() + p2);
        k.put(byteBuffer);
        byteBuffer.limit(limit);
        int i3 = i2 - p2;
        int i4 = this.n - p;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, p, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        k.flip();
    }

    public b.a g(b.a aVar) {
        if (aVar.c != 2) {
            throw new b.b(aVar);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? b.a.e : aVar;
    }

    public void h() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    public void i() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    public void j() {
        this.m = P2.K.f;
    }

    public long l() {
        return this.o;
    }

    public void m() {
        this.o = 0L;
    }

    public void n(int i, int i2) {
        this.i = i;
        this.j = i2;
    }
}
