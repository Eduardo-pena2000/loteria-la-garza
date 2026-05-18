package pa;

import L5.g;
import N5.a;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class i {
    public final Context a;

    public i(Context context) {
        this.a = context;
    }

    public void a(String str, M5.a aVar, a.a aVar2) {
        N5.a.load(this.a, str, aVar, aVar2);
    }

    public void b(String str, M5.a aVar, M5.d dVar) {
        M5.c.load(this.a, str, aVar, dVar);
    }

    public void c(String str, NativeAd.c cVar, com.google.android.gms.ads.nativead.b bVar, L5.e eVar, M5.a aVar) {
        new g.a(this.a, str).b(cVar).d(bVar).c(eVar).a().a(aVar);
    }

    public void d(String str, M5.a aVar, f6.d dVar) {
        f6.c.load(this.a, str, aVar, dVar);
    }

    public void e(String str, M5.a aVar, g6.b bVar) {
        g6.a.load(this.a, str, aVar, bVar);
    }

    public void f(String str, AdRequest adRequest, a.a aVar) {
        N5.a.load(this.a, str, adRequest, aVar);
    }

    public void g(String str, AdRequest adRequest, X5.b bVar) {
        X5.a.load(this.a, str, adRequest, bVar);
    }

    public void h(String str, NativeAd.c cVar, com.google.android.gms.ads.nativead.b bVar, L5.e eVar, AdRequest adRequest) {
        new g.a(this.a, str).b(cVar).d(bVar).c(eVar).a().b(adRequest);
    }

    public void i(String str, AdRequest adRequest, f6.d dVar) {
        f6.c.load(this.a, str, adRequest, dVar);
    }

    public void j(String str, AdRequest adRequest, g6.b bVar) {
        g6.a.load(this.a, str, adRequest, bVar);
    }
}
