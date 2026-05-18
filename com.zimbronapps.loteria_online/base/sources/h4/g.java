package H4;

import G4.m;
import G4.p;
import G4.u;
import G4.x;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class g extends u {
    public static final String j = m.f("WorkContinuationImpl");
    public final i a;
    public final String b;
    public final G4.e c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public boolean h;
    public p i;

    public g(i iVar, List list) {
        this(iVar, null, G4.e.KEEP, list, null);
    }

    public static boolean i(g gVar, Set set) {
        set.addAll(gVar.c());
        Set l = l(gVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (l.contains((String) it.next())) {
                return true;
            }
        }
        List e = gVar.e();
        if (e != null && !e.isEmpty()) {
            Iterator it2 = e.iterator();
            while (it2.hasNext()) {
                if (i((g) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set l(g gVar) {
        HashSet hashSet = new HashSet();
        List e = gVar.e();
        if (e != null && !e.isEmpty()) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((g) it.next()).c());
            }
        }
        return hashSet;
    }

    public p a() {
        if (this.h) {
            m.c().h(j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.e)}), new Throwable[0]);
        } else {
            Q4.b bVar = new Q4.b(this);
            this.a.p().b(bVar);
            this.i = bVar.d();
        }
        return this.i;
    }

    public G4.e b() {
        return this.c;
    }

    public List c() {
        return this.e;
    }

    public String d() {
        return this.b;
    }

    public List e() {
        return this.g;
    }

    public List f() {
        return this.d;
    }

    public i g() {
        return this.a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.h;
    }

    public void k() {
        this.h = true;
    }

    public g(i iVar, String str, G4.e eVar, List list, List list2) {
        this.a = iVar;
        this.b = str;
        this.c = eVar;
        this.d = list;
        this.g = list2;
        this.e = new ArrayList(list.size());
        this.f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f.addAll(((g) it.next()).f);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String a = ((x) list.get(i)).a();
            this.e.add(a);
            this.f.add(a);
        }
    }
}
