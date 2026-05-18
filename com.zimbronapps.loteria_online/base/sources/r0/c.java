package R0;

import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import u0.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c {
    public final Qa.a a;
    public h b;
    public Qa.a c;
    public Qa.a d;
    public Qa.a e;
    public Qa.a f;
    public Qa.a g;

    public c(Qa.a aVar, h hVar, Qa.a aVar2, Qa.a aVar3, Qa.a aVar4, Qa.a aVar5, Qa.a aVar6) {
        this.a = aVar;
        this.b = hVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = aVar4;
        this.f = aVar5;
        this.g = aVar6;
    }

    public final void a(Menu menu, b bVar) {
        menu.add(0, bVar.b(), bVar.c(), bVar.d()).setShowAsAction(1);
    }

    public final void b(Menu menu, b bVar, Qa.a aVar) {
        if (aVar != null && menu.findItem(bVar.b()) == null) {
            a(menu, bVar);
        } else {
            if (aVar != null || menu.findItem(bVar.b()) == null) {
                return;
            }
            menu.removeItem(bVar.b());
        }
    }

    public final h c() {
        return this.b;
    }

    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        t.d(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == b.c.b()) {
            Qa.a aVar = this.c;
            if (aVar != null) {
                aVar.invoke();
            }
        } else if (itemId == b.d.b()) {
            Qa.a aVar2 = this.d;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        } else if (itemId == b.e.b()) {
            Qa.a aVar3 = this.e;
            if (aVar3 != null) {
                aVar3.invoke();
            }
        } else if (itemId == b.f.b()) {
            Qa.a aVar4 = this.f;
            if (aVar4 != null) {
                aVar4.invoke();
            }
        } else {
            if (itemId != b.g.b()) {
                return false;
            }
            Qa.a aVar5 = this.g;
            if (aVar5 != null) {
                aVar5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.c != null) {
            a(menu, b.c);
        }
        if (this.d != null) {
            a(menu, b.d);
        }
        if (this.e != null) {
            a(menu, b.e);
        }
        if (this.f != null) {
            a(menu, b.f);
        }
        if (this.g == null || Build.VERSION.SDK_INT < 26) {
            return true;
        }
        a(menu, b.g);
        return true;
    }

    public final void f() {
        Qa.a aVar = this.a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final boolean g(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        n(menu);
        return true;
    }

    public final void h(Qa.a aVar) {
        this.g = aVar;
    }

    public final void i(Qa.a aVar) {
        this.c = aVar;
    }

    public final void j(Qa.a aVar) {
        this.e = aVar;
    }

    public final void k(Qa.a aVar) {
        this.d = aVar;
    }

    public final void l(Qa.a aVar) {
        this.f = aVar;
    }

    public final void m(h hVar) {
        this.b = hVar;
    }

    public final void n(Menu menu) {
        b(menu, b.c, this.c);
        b(menu, b.d, this.d);
        b(menu, b.e, this.e);
        b(menu, b.f, this.f);
        b(menu, b.g, this.g);
    }

    public /* synthetic */ c(Qa.a aVar, h hVar, Qa.a aVar2, Qa.a aVar3, Qa.a aVar4, Qa.a aVar5, Qa.a aVar6, int i, k kVar) {
        this((i & 1) != 0 ? null : aVar, (i & 2) != 0 ? h.e.a() : hVar, (i & 4) != 0 ? null : aVar2, (i & 8) != 0 ? null : aVar3, (i & 16) != 0 ? null : aVar4, (i & 32) != 0 ? null : aVar5, (i & 64) != 0 ? null : aVar6);
    }
}
