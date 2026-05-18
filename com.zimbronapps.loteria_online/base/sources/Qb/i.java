package qb;

import java.util.Iterator;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class i {

    public static final class a implements Iterator, Ra.a {
        public int a;
        public final /* synthetic */ e b;

        public a(e eVar) {
            this.b = eVar;
            this.a = eVar.d();
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e next() {
            e eVar = this.b;
            int d = eVar.d();
            int i = this.a;
            this.a = i - 1;
            return eVar.g(d - i);
        }

        public boolean hasNext() {
            return this.a > 0;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class b implements Iterator, Ra.a {
        public int a;
        public final /* synthetic */ e b;

        public b(e eVar) {
            this.b = eVar;
            this.a = eVar.d();
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            e eVar = this.b;
            int d = eVar.d();
            int i = this.a;
            this.a = i - 1;
            return eVar.e(d - i);
        }

        public boolean hasNext() {
            return this.a > 0;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final class c implements Iterable, Ra.a {
        public final /* synthetic */ e a;

        public c(e eVar) {
            this.a = eVar;
        }

        public Iterator iterator() {
            return new a(this.a);
        }
    }

    public static final class d implements Iterable, Ra.a {
        public final /* synthetic */ e a;

        public d(e eVar) {
            this.a = eVar;
        }

        public Iterator iterator() {
            return new b(this.a);
        }
    }

    public static final Iterable a(e eVar) {
        t.g(eVar, "<this>");
        return new c(eVar);
    }

    public static final Iterable b(e eVar) {
        t.g(eVar, "<this>");
        return new d(eVar);
    }
}
