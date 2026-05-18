package z;

import b0.U1;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class q0 {
    public final b0.C0 a;

    public /* synthetic */ q0(kotlin.jvm.internal.k kVar) {
        this();
    }

    public abstract Object a();

    public final boolean b() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public abstract void c(Object obj);

    public final void d(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }

    public abstract void e(o0 o0Var);

    public abstract void f();

    public q0() {
        this.a = U1.i(Boolean.FALSE, null, 2, null);
    }
}
