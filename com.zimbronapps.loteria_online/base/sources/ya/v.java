package Ya;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class v implements h {
    public final h a;
    public final Qa.l b;

    public static final class a implements Iterator, Ra.a {
        public final Iterator a;

        public a() {
            this.a = v.c(v.this).iterator();
        }

        public boolean hasNext() {
            return this.a.hasNext();
        }

        public Object next() {
            return v.d(v.this).invoke(this.a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public v(h sequence, Qa.l transformer) {
        kotlin.jvm.internal.t.g(sequence, "sequence");
        kotlin.jvm.internal.t.g(transformer, "transformer");
        this.a = sequence;
        this.b = transformer;
    }

    public static final /* synthetic */ h c(v vVar) {
        return vVar.a;
    }

    public static final /* synthetic */ Qa.l d(v vVar) {
        return vVar.b;
    }

    public Iterator iterator() {
        return new a();
    }
}
