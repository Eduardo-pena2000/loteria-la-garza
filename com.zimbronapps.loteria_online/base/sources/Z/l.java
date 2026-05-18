package z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class l {
    public static final k a(float f, float f2, long j, long j2, boolean z) {
        return new k(u0.b(kotlin.jvm.internal.m.a), Float.valueOf(f), r.a(f2), j, j2, z);
    }

    public static final k b(s0 s0Var, Object obj, Object obj2, long j, long j2, boolean z) {
        return new k(s0Var, obj, (q) s0Var.a().invoke(obj2), j, j2, z);
    }

    public static /* synthetic */ k c(float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        long j3 = (i & 4) != 0 ? Long.MIN_VALUE : j;
        long j4 = (i & 8) == 0 ? j2 : Long.MIN_VALUE;
        if ((i & 16) != 0) {
            z = false;
        }
        return a(f, f2, j3, j4, z);
    }

    public static /* synthetic */ k d(s0 s0Var, Object obj, Object obj2, long j, long j2, boolean z, int i, Object obj3) {
        return b(s0Var, obj, obj2, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }

    public static final k e(k kVar, float f, float f2, long j, long j2, boolean z) {
        return new k(kVar.f(), Float.valueOf(f), r.a(f2), j, j2, z);
    }

    public static final k f(k kVar, Object obj, q qVar, long j, long j2, boolean z) {
        return new k(kVar.f(), obj, qVar, j, j2, z);
    }

    public static /* synthetic */ k g(k kVar, float f, float f2, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            f = ((Number) kVar.getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((m) kVar.h()).f();
        }
        float f3 = f2;
        if ((i & 4) != 0) {
            j = kVar.e();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = kVar.a();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = kVar.k();
        }
        return e(kVar, f, f3, j3, j4, z);
    }

    public static /* synthetic */ k h(k kVar, Object obj, q qVar, long j, long j2, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = kVar.getValue();
        }
        if ((i & 2) != 0) {
            qVar = r.e(kVar.h());
        }
        q qVar2 = qVar;
        if ((i & 4) != 0) {
            j = kVar.e();
        }
        long j3 = j;
        if ((i & 8) != 0) {
            j2 = kVar.a();
        }
        long j4 = j2;
        if ((i & 16) != 0) {
            z = kVar.k();
        }
        return f(kVar, obj, qVar2, j3, j4, z);
    }

    public static final q i(s0 s0Var, Object obj) {
        q qVar = (q) s0Var.a().invoke(obj);
        qVar.d();
        return qVar;
    }
}
