package T1;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class z {
    public final Runnable a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final Map c = new HashMap();

    public static class a {
        public final androidx.lifecycle.k a;
        public androidx.lifecycle.o b;

        public a(androidx.lifecycle.k kVar, androidx.lifecycle.o oVar) {
            this.a = kVar;
            this.b = oVar;
            kVar.addObserver(oVar);
        }

        public void a() {
            this.a.removeObserver(this.b);
            this.b = null;
        }
    }

    public z(Runnable runnable) {
        this.a = runnable;
    }

    public static /* synthetic */ void a(z zVar, k.b bVar, B b, androidx.lifecycle.r rVar, k.a aVar) {
        zVar.g(bVar, b, rVar, aVar);
    }

    public static /* synthetic */ void b(z zVar, B b, androidx.lifecycle.r rVar, k.a aVar) {
        zVar.f(b, rVar, aVar);
    }

    public void c(B b) {
        this.b.add(b);
        this.a.run();
    }

    public void d(B b, androidx.lifecycle.r rVar) {
        c(b);
        androidx.lifecycle.k lifecycle = rVar.getLifecycle();
        a aVar = (a) this.c.remove(b);
        if (aVar != null) {
            aVar.a();
        }
        this.c.put(b, new a(lifecycle, new y(this, b)));
    }

    public void e(B b, androidx.lifecycle.r rVar, k.b bVar) {
        androidx.lifecycle.k lifecycle = rVar.getLifecycle();
        a aVar = (a) this.c.remove(b);
        if (aVar != null) {
            aVar.a();
        }
        this.c.put(b, new a(lifecycle, new x(this, bVar, b)));
    }

    public final /* synthetic */ void f(B b, androidx.lifecycle.r rVar, k.a aVar) {
        if (aVar == k.a.ON_DESTROY) {
            l(b);
        }
    }

    public final /* synthetic */ void g(k.b bVar, B b, androidx.lifecycle.r rVar, k.a aVar) {
        if (aVar == k.a.d(bVar)) {
            c(b);
            return;
        }
        if (aVar == k.a.ON_DESTROY) {
            l(b);
        } else if (aVar == k.a.b(bVar)) {
            this.b.remove(b);
            this.a.run();
        }
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).d(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).a(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (((B) it.next()).c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((B) it.next()).b(menu);
        }
    }

    public void l(B b) {
        this.b.remove(b);
        a aVar = (a) this.c.remove(b);
        if (aVar != null) {
            aVar.a();
        }
        this.a.run();
    }
}
