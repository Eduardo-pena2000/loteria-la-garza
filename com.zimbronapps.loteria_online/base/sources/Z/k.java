package z;

import b0.U1;
import b0.h2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class k implements h2 {
    public final s0 a;
    public final b0.C0 b;
    public q c;
    public long d;
    public long e;
    public boolean f;

    public k(s0 s0Var, Object obj, q qVar, long j, long j2, boolean z) {
        q e;
        this.a = s0Var;
        this.b = U1.i(obj, null, 2, null);
        this.c = (qVar == null || (e = r.e(qVar)) == null) ? l.i(s0Var, obj) : e;
        this.d = j;
        this.e = j2;
        this.f = z;
    }

    public final long a() {
        return this.e;
    }

    public final long e() {
        return this.d;
    }

    public final s0 f() {
        return this.a;
    }

    public final Object g() {
        return this.a.b().invoke(this.c);
    }

    public Object getValue() {
        return this.b.getValue();
    }

    public final q h() {
        return this.c;
    }

    public final boolean k() {
        return this.f;
    }

    public final void o(long j) {
        this.e = j;
    }

    public final void p(long j) {
        this.d = j;
    }

    public final void r(boolean z) {
        this.f = z;
    }

    public void s(Object obj) {
        this.b.setValue(obj);
    }

    public final void t(q qVar) {
        this.c = qVar;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + g() + ", isRunning=" + this.f + ", lastFrameTimeNanos=" + this.d + ", finishedTimeNanos=" + this.e + ')';
    }

    public /* synthetic */ k(s0 s0Var, Object obj, q qVar, long j, long j2, boolean z, int i, kotlin.jvm.internal.k kVar) {
        this(s0Var, obj, (i & 4) != 0 ? null : qVar, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }
}
