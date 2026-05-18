package Ya;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class f implements h {
    public final h a;
    public final Qa.l b;
    public final Qa.l c;

    public static final class a implements Iterator, Ra.a {
        public final Iterator a;
        public Iterator b;
        public int c;

        public a() {
            this.a = f.d(f.this).iterator();
        }

        public final boolean a() {
            Iterator it = this.b;
            if (it != null && it.hasNext()) {
                this.c = 1;
                return true;
            }
            while (this.a.hasNext()) {
                Iterator it2 = (Iterator) f.c(f.this).invoke(f.e(f.this).invoke(this.a.next()));
                if (it2.hasNext()) {
                    this.b = it2;
                    this.c = 1;
                    return true;
                }
            }
            this.c = 2;
            this.b = null;
            return false;
        }

        public boolean hasNext() {
            int i = this.c;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return a();
        }

        public Object next() {
            int i = this.c;
            if (i == 2) {
                throw new NoSuchElementException();
            }
            if (i == 0 && !a()) {
                throw new NoSuchElementException();
            }
            this.c = 0;
            Iterator it = this.b;
            kotlin.jvm.internal.t.d(it);
            return it.next();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(h sequence, Qa.l transformer, Qa.l iterator) {
        kotlin.jvm.internal.t.g(sequence, "sequence");
        kotlin.jvm.internal.t.g(transformer, "transformer");
        kotlin.jvm.internal.t.g(iterator, "iterator");
        this.a = sequence;
        this.b = transformer;
        this.c = iterator;
    }

    public static final /* synthetic */ Qa.l c(f fVar) {
        return fVar.c;
    }

    public static final /* synthetic */ h d(f fVar) {
        return fVar.a;
    }

    public static final /* synthetic */ Qa.l e(f fVar) {
        return fVar.b;
    }

    public Iterator iterator() {
        return new a();
    }
}
