package pa;

import androidx.lifecycle.k;
import da.c;
import da.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class c implements androidx.lifecycle.o, j.c, c.d {
    public final da.j a;
    public final da.c b;
    public c.b c;

    public c(da.b bVar) {
        da.j jVar = new da.j(bVar, "plugins.flutter.io/google_mobile_ads/app_state_method");
        this.a = jVar;
        jVar.e(this);
        da.c cVar = new da.c(bVar, "plugins.flutter.io/google_mobile_ads/app_state_event");
        this.b = cVar;
        cVar.d(this);
    }

    public void b() {
        androidx.lifecycle.E.l().getLifecycle().removeObserver(this);
    }

    public void i(Object obj) {
        this.c = null;
    }

    public void k(Object obj, c.b bVar) {
        this.c = bVar;
    }

    public void onMethodCall(da.i iVar, j.d dVar) {
        String str = iVar.a;
        str.hashCode();
        if (str.equals("stop")) {
            b();
        } else if (str.equals("start")) {
            start();
        } else {
            dVar.c();
        }
    }

    public void onStateChanged(androidx.lifecycle.r rVar, k.a aVar) {
        c.b bVar;
        c.b bVar2;
        if (aVar == k.a.ON_START && (bVar2 = this.c) != null) {
            bVar2.a("foreground");
        } else {
            if (aVar != k.a.ON_STOP || (bVar = this.c) == null) {
                return;
            }
            bVar.a("background");
        }
    }

    public void start() {
        androidx.lifecycle.E.l().getLifecycle().addObserver(this);
    }
}
