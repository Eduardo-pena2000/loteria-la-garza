package cb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class D0 extends H0 implements A {
    public final boolean c;

    public D0(B0 b0) {
        super(true);
        h0(b0);
        this.c = N0();
    }

    public final boolean N0() {
        H0 t;
        u b0 = b0();
        v vVar = b0 instanceof v ? (v) b0 : null;
        if (vVar != null && (t = vVar.t()) != null) {
            while (!t.X()) {
                u b02 = t.b0();
                v vVar2 = b02 instanceof v ? (v) b02 : null;
                if (vVar2 != null && (t = vVar2.t()) != null) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean X() {
        return this.c;
    }

    public boolean Z() {
        return true;
    }

    public boolean a() {
        return n0(Ca.I.a);
    }

    public boolean b(Throwable th) {
        return n0(new C(th, false, 2, null));
    }
}
