package v0;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class h0 {
    public static final a Companion = new a(null);
    private final long intrinsicSize;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static /* synthetic */ h0 c(a aVar, List list, float f, float f2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = I1.a.a();
            }
            return aVar.b(list, f, f2, i);
        }

        public final h0 a(List list, long j, long j2, int i) {
            return new f1(list, null, j, j2, i, null);
        }

        public final h0 b(List list, float f, float f2, int i) {
            return a(list, u0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L)), u0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)), i);
        }

        public a() {
        }
    }

    public /* synthetic */ h0(kotlin.jvm.internal.k kVar) {
        this();
    }

    public abstract void applyTo-Pq9zytI(long j, k1 k1Var, float f);

    public long getIntrinsicSize-NH-jbRc() {
        return this.intrinsicSize;
    }

    public h0() {
        this.intrinsicSize = u0.l.b.a();
    }
}
