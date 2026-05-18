package sb;

import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class O extends n0 {
    public long[] a;
    public int b;

    public O(long[] bufferWithData) {
        kotlin.jvm.internal.t.g(bufferWithData, "bufferWithData");
        this.a = bufferWithData;
        this.b = bufferWithData.length;
        b(10);
    }

    public void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            long[] copyOf = Arrays.copyOf(jArr, Wa.n.e(i, jArr.length * 2));
            kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
            this.a = copyOf;
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
        jArr[d] = j;
    }

    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] copyOf = Arrays.copyOf(this.a, d());
        kotlin.jvm.internal.t.f(copyOf, "copyOf(...)");
        return copyOf;
    }
}
