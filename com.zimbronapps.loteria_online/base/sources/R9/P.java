package r9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class p implements n {
    public final String a;
    public final int b;
    public final int c;
    public final LinkedList d = new LinkedList();
    public final Set e = new HashSet();
    public final Set f = new HashSet();
    public final Map g = new HashMap();

    public p(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public static /* synthetic */ void e(p pVar, m mVar) {
        pVar.h(mVar);
    }

    public synchronized void c() {
        try {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((m) it.next()).f();
            }
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                ((m) it2.next()).f();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void d(k kVar) {
        this.d.add(kVar);
        Iterator it = new HashSet(this.e).iterator();
        while (it.hasNext()) {
            j((m) it.next());
        }
    }

    public m f(String str, int i) {
        return new m(str, i);
    }

    public final synchronized k g(m mVar) {
        k kVar;
        m mVar2;
        try {
            ListIterator listIterator = this.d.listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                kVar = (k) listIterator.next();
                mVar2 = kVar.a() != null ? (m) this.g.get(kVar.a()) : null;
                if (mVar2 == null) {
                    break;
                }
            } while (mVar2 != mVar);
            listIterator.remove();
            return kVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final synchronized void h(m mVar) {
        try {
            HashSet hashSet = new HashSet(this.e);
            this.f.remove(mVar);
            this.e.add(mVar);
            if (!mVar.b() && mVar.d() != null) {
                this.g.remove(mVar.d());
            }
            j(mVar);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                j((m) it.next());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void j(m mVar) {
        try {
            k g = g(mVar);
            if (g != null) {
                this.f.add(mVar);
                this.e.remove(mVar);
                if (g.a() != null) {
                    this.g.put(g.a(), mVar);
                }
                mVar.e(g);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void start() {
        for (int i = 0; i < this.b; i++) {
            m f = f(this.a + i, this.c);
            f.g(new o(this, f));
            this.e.add(f);
        }
    }
}
