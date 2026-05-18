package sb;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class H extends n0 {
    public int[] a;
    public int b;

    public H(int[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.a = bufferWithData;
        this.b = bufferWithData.length;
        b(10);
    }

    public void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            int[] copyOf = Arrays.copyOf(iArr, Wa.n.e(i, iArr.length * 2));
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            this.a = copyOf;
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
        iArr[d] = i;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] copyOf = Arrays.copyOf(this.a, d());
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        return copyOf;
    }
}
