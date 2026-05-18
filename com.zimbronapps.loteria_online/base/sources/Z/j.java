package z;

import z.S;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class j {
    public static final /* synthetic */ q a(s0 s0Var, Object obj) {
        return b(s0Var, obj);
    }

    public static final q b(s0 s0Var, Object obj) {
        if (obj == null) {
            return null;
        }
        return (q) s0Var.a().invoke(obj);
    }

    public static final i c(i iVar, long j) {
        return new i0(iVar, j);
    }

    public static final M d(C c, b0 b0Var, long j) {
        return new M(c, b0Var, j, null);
    }

    public static /* synthetic */ M e(C c, b0 b0Var, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            b0Var = b0.Restart;
        }
        if ((i & 4) != 0) {
            j = k0.c(0, 0, 2, null);
        }
        return d(c, b0Var, j);
    }

    public static final S f(Qa.l lVar) {
        S.b bVar = new S.b();
        lVar.invoke(bVar);
        return new S(bVar);
    }

    public static final h0 g(float f, float f2, Object obj) {
        return new h0(f, f2, obj);
    }

    public static /* synthetic */ h0 h(float f, float f2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return g(f, f2, obj);
    }

    public static final r0 i(int i, int i2, D d) {
        return new r0(i, i2, d);
    }

    public static /* synthetic */ r0 j(int i, int i2, D d, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            d = F.d();
        }
        return i(i, i2, d);
    }
}
