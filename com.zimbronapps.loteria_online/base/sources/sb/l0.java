package sb;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class L0 extends n0 {
    public short[] a;
    public int b;

    public /* synthetic */ L0(short[] sArr, kotlin.jvm.internal.k kVar) {
        this(sArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return Ca.G.a(f());
    }

    public void b(int i) {
        if (Ca.G.n(this.a) < i) {
            short[] sArr = this.a;
            short[] copyOf = Arrays.copyOf(sArr, Wa.n.e(i, Ca.G.n(sArr) * 2));
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            this.a = Ca.G.e(copyOf);
        }
    }

    public int d() {
        return this.b;
    }

    public final void e(short s) {
        n0.c(this, 0, 1, null);
        short[] sArr = this.a;
        int d = d();
        this.b = d + 1;
        Ca.G.r(sArr, d, s);
    }

    public short[] f() {
        short[] copyOf = Arrays.copyOf(this.a, d());
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        return Ca.G.e(copyOf);
    }

    public L0(short[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.a = bufferWithData;
        this.b = Ca.G.n(bufferWithData);
        b(10);
    }
}
