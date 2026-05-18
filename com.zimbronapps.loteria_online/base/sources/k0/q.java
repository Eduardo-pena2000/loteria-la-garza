package k0;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k0.p;
import w.P;
import w.d0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q implements p {
    public final Qa.l a;
    public final P b;
    public P c;

    public static final class a implements p.a {
        public final /* synthetic */ P a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Qa.a c;

        public a(P p, String str, Qa.a aVar) {
            this.a = p;
            this.b = str;
            this.c = aVar;
        }

        public void a() {
            List list = (List) this.a.u(this.b);
            if (list != null) {
                list.remove(this.c);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            this.a.x(this.b, list);
        }
    }

    public q(Map map, Qa.l lVar) {
        this.a = lVar;
        this.b = (map == null || map.isEmpty()) ? null : s.e(map);
    }

    public boolean a(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    public p.a b(String str, Qa.a aVar) {
        if (s.d(str)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        P p = this.c;
        if (p == null) {
            p = d0.b();
            this.c = p;
        }
        Object e = p.e(str);
        if (e == null) {
            e = new ArrayList();
            p.x(str, e);
        }
        ((List) e).add(aVar);
        return new a(p, str, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.Map e() {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.q.e():java.util.Map");
    }

    public Object f(String str) {
        P p;
        P p2 = this.b;
        List list = p2 != null ? (List) p2.u(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && (p = this.b) != null) {
        }
        return list.get(0);
    }
}
