package Ya;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class e implements h {
    public final h a;
    public final boolean b;
    public final Qa.l c;

    public static final class a implements Iterator, Ra.a {
        public final Iterator a;
        public int b = -1;
        public Object c;

        public a() {
            this.a = e.e(e.this).iterator();
        }

        public final void a() {
            while (this.a.hasNext()) {
                Object next = this.a.next();
                if (((Boolean) e.c(e.this).invoke(next)).booleanValue() == e.d(e.this)) {
                    this.c = next;
                    this.b = 1;
                    return;
                }
            }
            this.b = 0;
        }

        public boolean hasNext() {
            if (this.b == -1) {
                a();
            }
            return this.b == 1;
        }

        public Object next() {
            if (this.b == -1) {
                a();
            }
            if (this.b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.c;
            this.c = null;
            this.b = -1;
            return obj;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public e(h sequence, boolean z, Qa.l predicate) {
        kotlin.jvm.internal.t.g(sequence, "sequence");
        kotlin.jvm.internal.t.g(predicate, "predicate");
        this.a = sequence;
        this.b = z;
        this.c = predicate;
    }

    public static final /* synthetic */ Qa.l c(e eVar) {
        return eVar.c;
    }

    public static final /* synthetic */ boolean d(e eVar) {
        return eVar.b;
    }

    public static final /* synthetic */ h e(e eVar) {
        return eVar.a;
    }

    public Iterator iterator() {
        return new a();
    }
}
