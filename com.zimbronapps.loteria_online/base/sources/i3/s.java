package I3;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final M2.q f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    public final t[] k;

    public s(int i, int i2, long j, long j2, long j3, M2.q qVar, int i3, t[] tVarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = qVar;
        this.g = i3;
        this.k = tVarArr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public t a(int i) {
        t[] tVarArr = this.k;
        if (tVarArr == null) {
            return null;
        }
        return tVarArr[i];
    }
}
