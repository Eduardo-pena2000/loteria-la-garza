package fb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class c extends gb.e {
    public final Qa.p d;

    public /* synthetic */ c(Qa.p pVar, Ga.i iVar, int i, eb.a aVar, int i2, kotlin.jvm.internal.k kVar) {
        this(pVar, (i2 & 2) != 0 ? Ga.j.a : iVar, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? eb.a.a : aVar);
    }

    public static /* synthetic */ Object n(c cVar, eb.v vVar, Ga.e eVar) {
        Object invoke = cVar.d.invoke(vVar, eVar);
        return invoke == Ha.c.f() ? invoke : Ca.I.a;
    }

    public Object h(eb.v vVar, Ga.e eVar) {
        return n(this, vVar, eVar);
    }

    public gb.e i(Ga.i iVar, int i, eb.a aVar) {
        return new c(this.d, iVar, i, aVar);
    }

    public String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }

    public c(Qa.p pVar, Ga.i iVar, int i, eb.a aVar) {
        super(iVar, i, aVar);
        this.d = pVar;
    }
}
