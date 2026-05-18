package sb;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class F0 extends n0 {
    public int[] a;
    public int b;

    public /* synthetic */ F0(int[] iArr, kotlin.jvm.internal.k kVar) {
        this(iArr);
    }

    public /* bridge */ /* synthetic */ Object a() {
        return Ca.B.a(f());
    }

    public void b(int i) {
        if (Ca.B.n(this.a) < i) {
            int[] iArr = this.a;
            int[] copyOf = Arrays.copyOf(iArr, Wa.n.e(i, Ca.B.n(iArr) * 2));
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            this.a = Ca.B.e(copyOf);
        }
    }

    public int d() {
        return this.b;
    }

    public final void e(int i) {
        n0.c(this, 0, 1, null);
        int[] iArr = this.a;
        int d = d();
        this.b = d + 1;
        Ca.B.r(iArr, d, i);
    }

    public int[] f() {
        int[] copyOf = Arrays.copyOf(this.a, d());
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        return Ca.B.e(copyOf);
    }

    public F0(int[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.a = bufferWithData;
        this.b = Ca.B.n(bufferWithData);
        b(10);
    }
}
