package s5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class h extends d {
    public final i j;

    public h(boolean z, i iVar) {
        this.a = z;
        this.j = iVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(z ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.b = iVar.g(allocate, 16L);
        this.c = iVar.h(allocate, 32L);
        this.d = iVar.h(allocate, 40L);
        this.e = iVar.g(allocate, 54L);
        this.f = iVar.g(allocate, 56L);
        this.g = iVar.g(allocate, 58L);
        this.h = iVar.g(allocate, 60L);
        this.i = iVar.g(allocate, 62L);
    }

    public c a(long j, int i) {
        return new b(this.j, this, j, i);
    }

    public e b(long j) {
        return new k(this.j, this, j);
    }

    public f c(int i) {
        return new m(this.j, this, i);
    }
}
