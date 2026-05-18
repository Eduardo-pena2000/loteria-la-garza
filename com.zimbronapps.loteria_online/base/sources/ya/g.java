package Ya;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class g implements h {
    public final Qa.a a;
    public final Qa.l b;

    public static final class a implements Iterator, Ra.a {
        public Object a;
        public int b = -2;

        public a() {
        }

        private final void a() {
            Object invoke;
            if (this.b == -2) {
                invoke = g.c(g.this).invoke();
            } else {
                Qa.l d = g.d(g.this);
                Object obj = this.a;
                kotlin.jvm.internal.t.d(obj);
                invoke = d.invoke(obj);
            }
            this.a = invoke;
            this.b = invoke == null ? 0 : 1;
        }

        public boolean hasNext() {
            if (this.b < 0) {
                a();
            }
            return this.b == 1;
        }

        public Object next() {
            if (this.b < 0) {
                a();
            }
            if (this.b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.a;
            kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.b = -1;
            return obj;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public g(Qa.a getInitialValue, Qa.l getNextValue) {
        kotlin.jvm.internal.t.g(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.t.g(getNextValue, "getNextValue");
        this.a = getInitialValue;
        this.b = getNextValue;
    }

    public static final /* synthetic */ Qa.a c(g gVar) {
        return gVar.a;
    }

    public static final /* synthetic */ Qa.l d(g gVar) {
        return gVar.b;
    }

    public Iterator iterator() {
        return new a();
    }
}
