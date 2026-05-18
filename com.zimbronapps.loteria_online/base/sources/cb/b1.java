package cb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class b1 extends hb.z implements Runnable {
    public final long e;

    public b1(long j, Ga.e eVar) {
        super(eVar.getContext(), eVar);
        this.e = j;
    }

    public String p0() {
        return super.p0() + "(timeMillis=" + this.e + ')';
    }

    public void run() {
        J(c1.a(this.e, Z.c(getContext()), this));
    }
}
