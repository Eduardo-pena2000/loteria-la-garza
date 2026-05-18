package sb;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class u0 extends n0 {
    public short[] a;
    public int b;

    public u0(short[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.a = bufferWithData;
        this.b = bufferWithData.length;
        b(10);
    }

    public void b(int i) {
        short[] sArr = this.a;
        if (sArr.length < i) {
            short[] copyOf = Arrays.copyOf(sArr, Wa.n.e(i, sArr.length * 2));
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            this.a = copyOf;
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
        sArr[d] = s;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] copyOf = Arrays.copyOf(this.a, d());
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        return copyOf;
    }
}
