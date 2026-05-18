package Q8;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class l extends b {
    public static final Pattern k = Pattern.compile("^[a-zA-Z0-9 ]+$");
    public final d a;
    public final c b;
    public Y8.a d;
    public U8.a e;
    public final String h;
    public boolean i;
    public boolean j;
    public final List c = new ArrayList();
    public boolean f = false;
    public boolean g = false;

    public l(c cVar, d dVar) {
        this.b = cVar;
        this.a = dVar;
        String uuid = UUID.randomUUID().toString();
        this.h = uuid;
        k(null);
        this.e = (dVar.c() == e.HTML || dVar.c() == e.JAVASCRIPT) ? new U8.b(uuid, dVar.j()) : new U8.c(uuid, dVar.f(), dVar.g());
        this.e.t();
        S8.c.e().b(this);
        this.e.d(cVar);
    }

    public void b() {
        if (this.g) {
            return;
        }
        this.d.clear();
        u();
        this.g = true;
        p().p();
        S8.c.e().d(this);
        p().l();
        this.e = null;
    }

    public void c(View view) {
        if (this.g) {
            return;
        }
        V8.g.d(view, "AdView is null");
        if (h() == view) {
            return;
        }
        k(view);
        p().a();
        i(view);
    }

    public void d() {
        if (this.f) {
            return;
        }
        this.f = true;
        S8.c.e().f(this);
        this.e.b(S8.h.d().c());
        this.e.i(S8.a.a().c());
        this.e.e(this, this.a);
    }

    public final void e() {
        if (this.i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    public void f(List list) {
        if (l()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) ((Y8.a) it.next()).get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }

    public final void g() {
        if (this.j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public View h() {
        return (View) this.d.get();
    }

    public final void i(View view) {
        Collection<l> c = S8.c.e().c();
        if (c == null || c.isEmpty()) {
            return;
        }
        for (l lVar : c) {
            if (lVar != this && lVar.h() == view) {
                lVar.d.clear();
            }
        }
    }

    public List j() {
        return this.c;
    }

    public final void k(View view) {
        this.d = new Y8.a(view);
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return this.f && !this.g;
    }

    public boolean n() {
        return this.g;
    }

    public String o() {
        return this.h;
    }

    public U8.a p() {
        return this.e;
    }

    public boolean q() {
        return this.b.b();
    }

    public boolean r() {
        return this.f;
    }

    public void s() {
        e();
        p().q();
        this.i = true;
    }

    public void t() {
        g();
        p().s();
        this.j = true;
    }

    public void u() {
        if (this.g) {
            return;
        }
        this.c.clear();
    }
}
