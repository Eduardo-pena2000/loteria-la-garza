package q9;

import da.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class g implements c.b {
    public c.b a;

    public class a implements c.d {
        public a() {
        }

        public void i(Object obj) {
            g.d(g.this, null);
        }

        public void k(Object obj, c.b bVar) {
            g.d(g.this, bVar);
        }
    }

    public g(da.b bVar, String str) {
        new da.c(bVar, str).d(new a());
    }

    public static /* bridge */ /* synthetic */ void d(g gVar, c.b bVar) {
        gVar.a = bVar;
    }

    public void a(Object obj) {
        c.b bVar = this.a;
        if (bVar != null) {
            bVar.a(obj);
        }
    }

    public void b(String str, String str2, Object obj) {
        c.b bVar = this.a;
        if (bVar != null) {
            bVar.b(str, str2, obj);
        }
    }

    public void c() {
        c.b bVar = this.a;
        if (bVar != null) {
            bVar.c();
        }
    }
}
