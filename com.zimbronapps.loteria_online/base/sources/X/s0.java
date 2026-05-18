package X;

import Z0.Y0;
import b0.b1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class s0 {
    public static final b1 a = b0.H.j(a.a);

    public static final class a extends kotlin.jvm.internal.u implements Qa.a {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r0 invoke() {
            return new r0(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a0.u.values().length];
            try {
                iArr[a0.u.d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a0.u.e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a0.u.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a0.u.g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a0.u.h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a0.u.i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a0.u.m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a0.u.n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a0.u.o.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a0.u.a.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a0.u.b.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[a0.u.c.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[a0.u.j.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[a0.u.k.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[a0.u.l.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            a = iArr;
        }
    }

    public static final Y0 a(r0 r0Var, a0.u uVar) {
        switch (b.a[uVar.ordinal()]) {
            case 1:
                return r0Var.e();
            case 2:
                return r0Var.f();
            case 3:
                return r0Var.g();
            case 4:
                return r0Var.h();
            case 5:
                return r0Var.i();
            case 6:
                return r0Var.j();
            case 7:
                return r0Var.n();
            case 8:
                return r0Var.o();
            case 9:
                return r0Var.p();
            case 10:
                return r0Var.b();
            case 11:
                return r0Var.c();
            case 12:
                return r0Var.d();
            case 13:
                return r0Var.k();
            case 14:
                return r0Var.l();
            case 15:
                return r0Var.m();
            default:
                throw new Ca.o();
        }
    }

    public static final b1 b() {
        return a;
    }

    public static final Y0 c(a0.u uVar, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(-1049072145, i, -1, "androidx.compose.material3.<get-value> (Typography.kt:209)");
        }
        Y0 a2 = a(E.a.c(mVar, 6), uVar);
        if (b0.w.L()) {
            b0.w.T();
        }
        return a2;
    }
}
