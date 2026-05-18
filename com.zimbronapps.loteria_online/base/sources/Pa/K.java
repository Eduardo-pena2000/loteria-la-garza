package pa;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class k extends f implements h {
    public final pa.a b;
    public final String c;
    public final List d;
    public final j e;
    public final d f;
    public M5.b g;

    public class a implements M5.e {
        public a() {
        }

        public void onAppEvent(String str, String str2) {
            k kVar = k.this;
            kVar.b.q(kVar.a, str, str2);
        }
    }

    public k(int i, pa.a aVar, String str, List list, j jVar, d dVar) {
        super(i);
        Aa.c.a(aVar);
        Aa.c.a(str);
        Aa.c.a(list);
        Aa.c.a(jVar);
        this.b = aVar;
        this.c = str;
        this.d = list;
        this.e = jVar;
        this.f = dVar;
    }

    public void a() {
        M5.b bVar = this.g;
        if (bVar != null) {
            bVar.a();
            this.g = null;
        }
    }

    public io.flutter.plugin.platform.i b() {
        M5.b bVar = this.g;
        if (bVar == null) {
            return null;
        }
        return new C(bVar);
    }

    public n c() {
        M5.b bVar = this.g;
        if (bVar == null || bVar.getAdSize() == null) {
            return null;
        }
        return new n(this.g.getAdSize());
    }

    public void d() {
        M5.b a2 = this.f.a();
        this.g = a2;
        if (this instanceof e) {
            a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        }
        this.g.setAdUnitId(this.c);
        this.g.setAppEventListener(new a());
        L5.h[] hVarArr = new L5.h[this.d.size()];
        for (int i = 0; i < this.d.size(); i++) {
            hVarArr[i] = ((n) this.d.get(i)).a();
        }
        this.g.setAdSizes(hVarArr);
        this.g.setAdListener(new s(this.a, this.b, this));
        this.g.e(this.e.l(this.c));
    }

    public void onAdLoaded() {
        M5.b bVar = this.g;
        if (bVar != null) {
            this.b.m(this.a, bVar.getResponseInfo());
        }
    }
}
