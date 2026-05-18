package c3;

import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h extends S2.f {
    public long j;
    public int k;
    public int l;

    public h() {
        super(2);
        this.l = 32;
    }

    public void A(int i) {
        P2.a.a(i > 0);
        this.l = i;
    }

    public void f() {
        super.f();
        this.k = 0;
    }

    public boolean u(S2.f fVar) {
        P2.a.a(!fVar.r());
        P2.a.a(!fVar.h());
        P2.a.a(!fVar.i());
        if (!v(fVar)) {
            return false;
        }
        int i = this.k;
        this.k = i + 1;
        if (i == 0) {
            this.f = fVar.f;
            if (fVar.l()) {
                n(1);
            }
        }
        ByteBuffer byteBuffer = fVar.d;
        if (byteBuffer != null) {
            p(byteBuffer.remaining());
            this.d.put(byteBuffer);
        }
        this.j = fVar.f;
        return true;
    }

    public final boolean v(S2.f fVar) {
        ByteBuffer byteBuffer;
        if (!z()) {
            return true;
        }
        if (this.k >= this.l) {
            return false;
        }
        ByteBuffer byteBuffer2 = fVar.d;
        return byteBuffer2 == null || (byteBuffer = this.d) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000;
    }

    public long w() {
        return this.f;
    }

    public long x() {
        return this.j;
    }

    public int y() {
        return this.k;
    }

    public boolean z() {
        return this.k > 0;
    }
}
