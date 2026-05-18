package L4;

import G4.m;
import M4.c;
import M4.e;
import M4.f;
import M4.g;
import M4.h;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d implements c.a {
    public static final String d = m.f("WorkConstraintsTracker");
    public final c a;
    public final M4.c[] b;
    public final Object c;

    public d(Context context, S4.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = cVar;
        this.b = new M4.c[]{new M4.a(applicationContext, aVar), new M4.b(applicationContext, aVar), new h(applicationContext, aVar), new M4.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.c = new Object();
    }

    public void a(List list) {
        synchronized (this.c) {
            try {
                List arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (c(str)) {
                        m.c().a(d, String.format("Constraints met for %s", new Object[]{str}), new Throwable[0]);
                        arrayList.add(str);
                    }
                }
                c cVar = this.a;
                if (cVar != null) {
                    cVar.f(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(List list) {
        synchronized (this.c) {
            try {
                c cVar = this.a;
                if (cVar != null) {
                    cVar.b(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.c) {
            try {
                for (M4.c cVar : this.b) {
                    if (cVar.d(str)) {
                        m.c().a(d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Iterable iterable) {
        synchronized (this.c) {
            try {
                for (M4.c cVar : this.b) {
                    cVar.g(null);
                }
                for (M4.c cVar2 : this.b) {
                    cVar2.e(iterable);
                }
                for (M4.c cVar3 : this.b) {
                    cVar3.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.c) {
            try {
                for (M4.c cVar : this.b) {
                    cVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
