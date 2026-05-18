package Ya;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class u implements h {
    public final h a;
    public final Qa.l b;

    public static final class a implements Iterator, Ra.a {
        public final Iterator a;
        public int b = -1;
        public Object c;

        public a() {
            this.a = u.d(u.this).iterator();
        }

        private final void a() {
            if (this.a.hasNext()) {
                Object next = this.a.next();
                if (((Boolean) u.c(u.this).invoke(next)).booleanValue()) {
                    this.b = 1;
                    this.c = next;
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

    public u(h sequence, Qa.l predicate) {
        kotlin.jvm.internal.t.g(sequence, "sequence");
        kotlin.jvm.internal.t.g(predicate, "predicate");
        this.a = sequence;
        this.b = predicate;
    }

    public static final /* synthetic */ Qa.l c(u uVar) {
        return uVar.b;
    }

    public static final /* synthetic */ h d(u uVar) {
        return uVar.a;
    }

    public Iterator iterator() {
        return new a();
    }
}
