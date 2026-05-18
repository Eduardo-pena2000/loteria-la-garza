package Ya;

import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class o extends l {

    public static final class a implements h {
        public final /* synthetic */ Iterator a;

        public a(Iterator it) {
            this.a = it;
        }

        public Iterator iterator() {
            return this.a;
        }
    }

    public static /* synthetic */ Object c(Object obj) {
        return l(obj);
    }

    public static /* synthetic */ Object d(Qa.a aVar, Object obj) {
        return k(aVar, obj);
    }

    public static h e(Iterator it) {
        kotlin.jvm.internal.t.g(it, "<this>");
        return f(new a(it));
    }

    public static h f(h hVar) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        return hVar instanceof Ya.a ? hVar : new Ya.a(hVar);
    }

    public static h g() {
        return d.a;
    }

    public static h h(Qa.a nextFunction) {
        kotlin.jvm.internal.t.g(nextFunction, "nextFunction");
        return f(new g(nextFunction, new m(nextFunction)));
    }

    public static h i(Qa.a seedFunction, Qa.l nextFunction) {
        kotlin.jvm.internal.t.g(seedFunction, "seedFunction");
        kotlin.jvm.internal.t.g(nextFunction, "nextFunction");
        return new g(seedFunction, nextFunction);
    }

    public static h j(Object obj, Qa.l nextFunction) {
        kotlin.jvm.internal.t.g(nextFunction, "nextFunction");
        return obj == null ? d.a : new g(new n(obj), nextFunction);
    }

    public static final Object k(Qa.a aVar, Object it) {
        kotlin.jvm.internal.t.g(it, "it");
        return aVar.invoke();
    }

    public static h m(Object... elements) {
        kotlin.jvm.internal.t.g(elements, "elements");
        return Da.r.J(elements);
    }

    public static final Object l(Object obj) {
        return obj;
    }
}
