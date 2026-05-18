package Ya;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class b implements h, c {
    public final h a;
    public final int b;

    public static final class a implements Iterator, Ra.a {
        public final Iterator a;
        public int b;

        public a(b bVar) {
            this.a = b.d(bVar).iterator();
            this.b = b.c(bVar);
        }

        public final void a() {
            while (this.b > 0 && this.a.hasNext()) {
                this.a.next();
                this.b--;
            }
        }

        public boolean hasNext() {
            a();
            return this.a.hasNext();
        }

        public Object next() {
            a();
            return this.a.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(h sequence, int i) {
        kotlin.jvm.internal.t.g(sequence, "sequence");
        this.a = sequence;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    public static final /* synthetic */ int c(b bVar) {
        return bVar.b;
    }

    public static final /* synthetic */ h d(b bVar) {
        return bVar.a;
    }

    public h a(int i) {
        int i2 = this.b + i;
        return i2 < 0 ? new b(this, i) : new b(this.a, i2);
    }

    public h b(int i) {
        int i2 = this.b;
        int i3 = i2 + i;
        return i3 < 0 ? new t(this, i) : new s(this.a, i2, i3);
    }

    public Iterator iterator() {
        return new a(this);
    }
}
