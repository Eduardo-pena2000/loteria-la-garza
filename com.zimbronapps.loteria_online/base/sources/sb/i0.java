package sb;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class I0 extends n0 {
    public long[] a;
    public int b;

    public /* synthetic */ I0(long[] jArr, kotlin.jvm.internal.k kVar) {
        this(jArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return Ca.D.a(f());
    }

    public void b(int i) {
        if (Ca.D.n(this.a) < i) {
            long[] jArr = this.a;
            long[] copyOf = Arrays.copyOf(jArr, Wa.n.e(i, Ca.D.n(jArr) * 2));
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            this.a = Ca.D.e(copyOf);
        }
    }

    public int d() {
        return this.b;
    }

    public final void e(long j) {
        n0.c(this, 0, 1, null);
        long[] jArr = this.a;
        int d = d();
        this.b = d + 1;
        Ca.D.r(jArr, d, j);
    }

    public long[] f() {
        long[] copyOf = Arrays.copyOf(this.a, d());
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        return Ca.D.e(copyOf);
    }

    public I0(long[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.a = bufferWithData;
        this.b = Ca.D.n(bufferWithData);
        b(10);
    }
}
