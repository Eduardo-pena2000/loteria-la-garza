package o3;

import o3.J;
import o3.y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x implements J {
    public final y a;
    public final long b;

    public x(y yVar, long j) {
        this.a = yVar;
        this.b = j;
    }

    public final K a(long j, long j2) {
        return new K((j * 1000000) / this.a.e, this.b + j2);
    }

    public J.a f(long j) {
        P2.a.h(this.a.k);
        y yVar = this.a;
        y.a aVar = yVar.k;
        long[] jArr = aVar.a;
        long[] jArr2 = aVar.b;
        int h = P2.K.h(jArr, yVar.i(j), true, false);
        K a = a(h == -1 ? 0L : jArr[h], h != -1 ? jArr2[h] : 0L);
        if (a.a == j || h == jArr.length - 1) {
            return new J.a(a);
        }
        int i = h + 1;
        return new J.a(a, a(jArr[i], jArr2[i]));
    }

    public boolean i() {
        return true;
    }

    public long l() {
        return this.a.f();
    }
}
