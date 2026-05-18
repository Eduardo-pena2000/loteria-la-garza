package pa;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class r extends f implements h {
    public final a b;
    public final String c;
    public final n d;
    public final m e;
    public final d f;
    public L5.j g;

    public r(int i, a aVar, String str, m mVar, n nVar, d dVar) {
        super(i);
        Aa.c.a(aVar);
        Aa.c.a(str);
        Aa.c.a(mVar);
        Aa.c.a(nVar);
        this.b = aVar;
        this.c = str;
        this.e = mVar;
        this.d = nVar;
        this.f = dVar;
    }

    public void a() {
        L5.j jVar = this.g;
        if (jVar != null) {
            jVar.a();
            this.g = null;
        }
    }

    public io.flutter.plugin.platform.i b() {
        L5.j jVar = this.g;
        if (jVar == null) {
            return null;
        }
        return new C(jVar);
    }

    public n c() {
        L5.j jVar = this.g;
        if (jVar == null || jVar.getAdSize() == null) {
            return null;
        }
        return new n(this.g.getAdSize());
    }

    public void d() {
        L5.j b = this.f.b();
        this.g = b;
        b.setAdUnitId(this.c);
        this.g.setAdSize(this.d.a());
        this.g.setOnPaidEventListener(new B(this.b, this));
        this.g.setAdListener(new s(this.a, this.b, this));
        this.g.b(this.e.b(this.c));
    }

    public void onAdLoaded() {
        L5.j jVar = this.g;
        if (jVar != null) {
            this.b.m(this.a, jVar.getResponseInfo());
        }
    }
}
