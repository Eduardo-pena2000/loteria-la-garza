package Ya;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class t implements h, c {
    public final h a;
    public final int b;

    public static final class a implements Iterator, Ra.a {
        public int a;
        public final Iterator b;

        public a(t tVar) {
            this.a = t.c(tVar);
            this.b = t.d(tVar).iterator();
        }

        public boolean hasNext() {
            return this.a > 0 && this.b.hasNext();
        }

        public Object next() {
            int i = this.a;
            if (i == 0) {
                throw new NoSuchElementException();
            }
            this.a = i - 1;
            return this.b.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t(h sequence, int i) {
        kotlin.jvm.internal.t.g(sequence, "sequence");
        this.a = sequence;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    public static final /* synthetic */ int c(t tVar) {
        return tVar.b;
    }

    public static final /* synthetic */ h d(t tVar) {
        return tVar.a;
    }

    public h a(int i) {
        int i2 = this.b;
        return i >= i2 ? o.g() : new s(this.a, i, i2);
    }

    public h b(int i) {
        return i >= this.b ? this : new t(this.a, i);
    }

    public Iterator iterator() {
        return new a(this);
    }
}
