package H2;

import androidx.lifecycle.V;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public final Y a;
    public final X.c b;
    public final F2.a c;
    public final f d;

    public h(Y y, X.c cVar, F2.a aVar) {
        t.g(y, "store");
        t.g(cVar, "factory");
        t.g(aVar, "defaultExtras");
        this.a = y;
        this.b = cVar;
        this.c = aVar;
        this.d = new f();
    }

    public static final /* synthetic */ F2.a a(h hVar) {
        return hVar.c;
    }

    public static final /* synthetic */ X.c b(h hVar) {
        return hVar.b;
    }

    public static final /* synthetic */ Y c(h hVar) {
        return hVar.a;
    }

    public static /* synthetic */ V e(h hVar, Xa.c cVar, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = j.a.c(cVar);
        }
        return hVar.d(cVar, str);
    }

    public final V d(Xa.c cVar, String str) {
        V b;
        t.g(cVar, "modelClass");
        t.g(str, "key");
        synchronized (this.d) {
            try {
                b = c(this).b(str);
                if (cVar.a(b)) {
                    if (b(this) instanceof X.e) {
                        X.e eVar = (X.e) b(this);
                        t.d(b);
                        eVar.a(b);
                    }
                    t.e(b, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.internal.ViewModelProviderImpl.getViewModel");
                } else {
                    F2.b bVar = new F2.b(a(this));
                    bVar.c(X.c, str);
                    b = i.a(b(this), cVar, bVar);
                    c(this).d(str, b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }
}
