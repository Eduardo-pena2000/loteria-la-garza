package v0;

import android.graphics.Shader;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f1 extends A1 {
    public final List a;
    public final List b;
    public final long c;
    public final long d;
    public final int e;

    public /* synthetic */ f1(List list, List list2, long j, long j2, int i, kotlin.jvm.internal.k kVar) {
        this(list, list2, j, j2, i);
    }

    public Shader createShader-uvyYCjk(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.c >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : this.c >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.c & 4294967295L)) == Float.POSITIVE_INFINITY ? j & 4294967295L : this.c & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.d >> 32)) == Float.POSITIVE_INFINITY ? j >> 32 : this.d >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.d & 4294967295L)) == Float.POSITIVE_INFINITY ? j & 4294967295L : this.d & 4294967295L));
        return B1.a(u0.f.e((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L)), u0.f.e((Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32)), this.a, this.b, this.e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return kotlin.jvm.internal.t.c(this.a, f1Var.a) && kotlin.jvm.internal.t.c(this.b, f1Var.b) && u0.f.j(this.c, f1Var.c) && u0.f.j(this.d, f1Var.d) && I1.f(this.e, f1Var.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long getIntrinsicSize-NH-jbRc() {
        /*
            r8 = this;
            long r0 = r8.c
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            r3 = 2143289344(0x7fc00000, float:NaN)
            if (r1 != 0) goto L42
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L42
            long r0 = r8.d
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L42
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L42
            long r0 = r8.c
            long r0 = r0 >> r2
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r4 = r8.d
            long r4 = r4 >> r2
            int r1 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            goto L43
        L42:
            r0 = r3
        L43:
            long r4 = r8.c
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            int r1 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L85
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L85
            long r4 = r8.d
            long r4 = r4 & r6
            int r1 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L85
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L85
            long r3 = r8.c
            long r3 = r3 & r6
            int r1 = (int) r3
            float r1 = java.lang.Float.intBitsToFloat(r1)
            long r3 = r8.d
            long r3 = r3 & r6
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r1 = r1 - r3
            float r3 = java.lang.Math.abs(r1)
        L85:
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r3
            long r0 = r0 << r2
            long r2 = r3 & r6
            long r0 = r0 | r2
            long r0 = u0.l.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.f1.getIntrinsicSize-NH-jbRc():long");
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + u0.f.o(this.c)) * 31) + u0.f.o(this.d)) * 31) + I1.g(this.e);
    }

    public String toString() {
        String str;
        String str2 = "";
        if (((((this.c & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + u0.f.s(this.c) + ", ";
        } else {
            str = "";
        }
        if ((((9187343241974906880L ^ (this.d & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + u0.f.s(this.d) + ", ";
        }
        return "LinearGradient(colors=" + this.a + ", stops=" + this.b + ", " + str + str2 + "tileMode=" + I1.h(this.e) + ')';
    }

    public f1(List list, List list2, long j, long j2, int i) {
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }
}
