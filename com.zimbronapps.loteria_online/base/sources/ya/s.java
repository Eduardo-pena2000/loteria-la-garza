package Ya;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class s implements h, c {
    public final h a;
    public final int b;
    public final int c;

    public static final class a implements Iterator, Ra.a {
        public final Iterator a;
        public int b;

        public a() {
            this.a = s.d(s.this).iterator();
        }

        private final void a() {
            while (this.b < s.e(s.this) && this.a.hasNext()) {
                this.a.next();
                this.b++;
            }
        }

        public boolean hasNext() {
            a();
            return this.b < s.c(s.this) && this.a.hasNext();
        }

        public Object next() {
            a();
            if (this.b >= s.c(s.this)) {
                throw new NoSuchElementException();
            }
            this.b++;
            return this.a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public s(h sequence, int i, int i2) {
        kotlin.jvm.internal.t.g(sequence, "sequence");
        this.a = sequence;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i2).toString());
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
    }

    public static final /* synthetic */ int c(s sVar) {
        return sVar.c;
    }

    public static final /* synthetic */ h d(s sVar) {
        return sVar.a;
    }

    public static final /* synthetic */ int e(s sVar) {
        return sVar.b;
    }

    public h a(int i) {
        return i >= f() ? o.g() : new s(this.a, this.b + i, this.c);
    }

    public h b(int i) {
        if (i >= f()) {
            return this;
        }
        h hVar = this.a;
        int i2 = this.b;
        return new s(hVar, i2, i + i2);
    }

    public final int f() {
        return this.c - this.b;
    }

    public Iterator iterator() {
        return new a();
    }
}
