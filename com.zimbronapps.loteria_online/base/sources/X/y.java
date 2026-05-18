package X;

import b0.b1;
import v0.E1;
import v0.t1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class Y {
    public static final b1 a = b0.H.j(a.a);

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final X invoke() {
            return new X(null, null, null, null, null, 31, null);
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a0.l.values().length];
            try {
                iArr[a0.l.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a0.l.CornerExtraLargeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a0.l.CornerExtraSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a0.l.CornerExtraSmallTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a0.l.CornerFull.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a0.l.CornerLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a0.l.CornerLargeEnd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a0.l.CornerLargeTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a0.l.CornerMedium.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a0.l.CornerNone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a0.l.CornerSmall.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            a = iArr;
        }
    }

    public static final M.a a(M.a aVar) {
        float f = (float) 0.0d;
        return M.a.b(aVar, M.c.c(n1.h.g(f)), null, null, M.c.c(n1.h.g(f)), 6, null);
    }

    public static final E1 b(X x, a0.l lVar) {
        switch (b.a[lVar.ordinal()]) {
            case 1:
                return x.a();
            case 2:
                return e(x.a());
            case 3:
                return x.b();
            case 4:
                return e(x.b());
            case 5:
                return M.i.g();
            case 6:
                return x.c();
            case 7:
                return a(x.c());
            case 8:
                return e(x.c());
            case 9:
                return x.d();
            case 10:
                return t1.a();
            case 11:
                return x.e();
            default:
                throw new Ca.o();
        }
    }

    public static final b1 c() {
        return a;
    }

    public static final E1 d(a0.l lVar, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(1629172543, i, -1, "androidx.compose.material3.<get-value> (Shapes.kt:191)");
        }
        E1 b2 = b(E.a.b(mVar, 6), lVar);
        if (b0.w.L()) {
            b0.w.T();
        }
        return b2;
    }

    public static final M.a e(M.a aVar) {
        float f = (float) 0.0d;
        return M.a.b(aVar, null, null, M.c.c(n1.h.g(f)), M.c.c(n1.h.g(f)), 3, null);
    }
}
