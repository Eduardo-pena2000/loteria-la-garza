package i1;

import Z0.E;
import Z0.G;
import Z0.Y0;
import Z0.y;
import d1.u;
import java.util.List;
import java.util.Locale;
import l1.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static final y a(String str, Y0 y0, List list, List list2, n1.d dVar, u.b bVar) {
        return new e(str, y0, list, list2, bVar, dVar);
    }

    public static final /* synthetic */ boolean b(Y0 y0) {
        return c(y0);
    }

    public static final boolean c(Y0 y0) {
        E a;
        G y = y0.y();
        return !(((y == null || (a = y.a()) == null) ? null : Z0.i.d(a.b())) == null ? false : Z0.i.g(r1.j(), Z0.i.b.c()));
    }

    public static final int d(int i, h1.e eVar) {
        Locale locale;
        l.a aVar = l1.l.b;
        if (l1.l.j(i, aVar.b())) {
            return 2;
        }
        if (!l1.l.j(i, aVar.c())) {
            if (l1.l.j(i, aVar.d())) {
                return 0;
            }
            if (l1.l.j(i, aVar.e())) {
                return 1;
            }
            if (!l1.l.j(i, aVar.a()) && !l1.l.j(i, aVar.f())) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            if (eVar == null || (locale = eVar.e(0).b()) == null) {
                locale = Locale.getDefault();
            }
            int a = R1.l.a(locale);
            if (a == 0 || a != 1) {
                return 2;
            }
        }
        return 3;
    }
}
