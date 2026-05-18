package cb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class d1 extends K {
    public static final d1 b = new d1();

    public K B(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    public String toString() {
        return "Dispatchers.Unconfined";
    }

    public void x(Ga.i iVar, Runnable runnable) {
        h1 h1Var = (h1) iVar.get(h1.b);
        if (h1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        h1Var.a = true;
    }

    public boolean z(Ga.i iVar) {
        return false;
    }
}
