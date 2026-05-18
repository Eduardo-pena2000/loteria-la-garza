package Ya;

import Ca.I;
import Ca.s;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class i extends j implements Iterator, Ga.e, Ra.a {
    public int a;
    public Object b;
    public Iterator c;
    public Ga.e d;

    public Object a(Object obj, Ga.e eVar) {
        this.b = obj;
        this.a = 3;
        this.d = eVar;
        Object f = Ha.c.f();
        if (f == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return f == Ha.c.f() ? f : I.a;
    }

    public final Throwable b() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    public final Object e() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public final void f(Ga.e eVar) {
        this.d = eVar;
    }

    public Ga.i getContext() {
        return Ga.j.a;
    }

    public boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw b();
                }
                Iterator it = this.c;
                kotlin.jvm.internal.t.d(it);
                if (it.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.c = null;
            }
            this.a = 5;
            Ga.e eVar = this.d;
            kotlin.jvm.internal.t.d(eVar);
            this.d = null;
            s.a aVar = Ca.s.b;
            eVar.resumeWith(Ca.s.b(I.a));
        }
    }

    public Object next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            return e();
        }
        if (i == 2) {
            this.a = 1;
            Iterator it = this.c;
            kotlin.jvm.internal.t.d(it);
            return it.next();
        }
        if (i != 3) {
            throw b();
        }
        this.a = 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(Object obj) {
        Ca.t.b(obj);
        this.a = 4;
    }
}
