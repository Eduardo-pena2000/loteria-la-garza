package I4;

import G4.m;
import G4.v;
import H4.e;
import H4.i;
import L4.c;
import L4.d;
import P4.p;
import Q4.j;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b implements e, c, H4.b {
    public static final String i = m.f("GreedyScheduler");
    public final Context a;
    public final i b;
    public final d c;
    public a e;
    public boolean f;
    public Boolean h;
    public final Set d = new HashSet();
    public final Object g = new Object();

    public b(Context context, androidx.work.a aVar, S4.a aVar2, i iVar) {
        this.a = context;
        this.b = iVar;
        this.c = new d(context, aVar2, this);
        this.e = new a(this, aVar.k());
    }

    public void a(String str) {
        if (this.h == null) {
            g();
        }
        if (!this.h.booleanValue()) {
            m.c().d(i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        h();
        m.c().a(i, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(str);
        }
        this.b.x(str);
    }

    public void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m.c().a(i, String.format("Constraints not met: Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
            this.b.x(str);
        }
    }

    public void c(p... pVarArr) {
        if (this.h == null) {
            g();
        }
        if (!this.h.booleanValue()) {
            m.c().d(i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.b == v.ENQUEUED) {
                if (currentTimeMillis < a) {
                    a aVar = this.e;
                    if (aVar != null) {
                        aVar.a(pVar);
                    }
                } else if (!pVar.b()) {
                    m.c().a(i, String.format("Starting work for %s", new Object[]{pVar.a}), new Throwable[0]);
                    this.b.u(pVar.a);
                } else if (pVar.j.h()) {
                    m.c().a(i, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{pVar}), new Throwable[0]);
                } else if (pVar.j.e()) {
                    m.c().a(i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{pVar}), new Throwable[0]);
                } else {
                    hashSet.add(pVar);
                    hashSet2.add(pVar.a);
                }
            }
        }
        synchronized (this.g) {
            try {
                if (!hashSet.isEmpty()) {
                    m.c().a(i, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", hashSet2)}), new Throwable[0]);
                    this.d.addAll(hashSet);
                    this.c.d(this.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d() {
        return false;
    }

    public void e(String str, boolean z) {
        i(str);
    }

    public void f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            m.c().a(i, String.format("Constraints met: Scheduling work ID %s", new Object[]{str}), new Throwable[0]);
            this.b.u(str);
        }
    }

    public final void g() {
        this.h = Boolean.valueOf(j.b(this.a, this.b.i()));
    }

    public final void h() {
        if (this.f) {
            return;
        }
        this.b.m().c(this);
        this.f = true;
    }

    public final void i(String str) {
        synchronized (this.g) {
            try {
                Iterator it = this.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    p pVar = (p) it.next();
                    if (pVar.a.equals(str)) {
                        m.c().a(i, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                        this.d.remove(pVar);
                        this.c.d(this.d);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
