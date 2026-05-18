package E3;

import M2.x;
import P2.E;
import P2.y;
import P2.z;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c extends x3.c {
    public final z a = new z();
    public final y b = new y();
    public E c;

    public x b(x3.b bVar, ByteBuffer byteBuffer) {
        E e = this.c;
        if (e == null || bVar.j != e.f()) {
            E e2 = new E(bVar.f);
            this.c = e2;
            e2.a(bVar.f - bVar.j);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.R(array, limit);
        this.b.o(array, limit);
        this.b.r(39);
        long h = (this.b.h(1) << 32) | this.b.h(32);
        this.b.r(20);
        int h2 = this.b.h(12);
        int h3 = this.b.h(8);
        this.a.U(14);
        x.b b = h3 != 0 ? h3 != 255 ? h3 != 4 ? h3 != 5 ? h3 != 6 ? null : g.b(this.a, h, this.c) : d.b(this.a, h, this.c) : f.b(this.a) : a.b(this.a, h2, h) : new e();
        return b == null ? new x(new x.b[0]) : new x(b);
    }
}
