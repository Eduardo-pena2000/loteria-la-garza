package Ya;

import Ca.I;
import Da.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class r extends p {

    public static final class a implements Iterable, Ra.a {
        public final /* synthetic */ h a;

        public a(h hVar) {
            this.a = hVar;
        }

        public Iterator iterator() {
            return this.a.iterator();
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.q implements Qa.l {
        public static final b a = new b();

        public b() {
            super(1, h.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Iterator invoke(h p0) {
            kotlin.jvm.internal.t.g(p0, "p0");
            return p0.iterator();
        }
    }

    public static final class c extends Ia.k implements Qa.p {
        public Object a;
        public Object b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ h f;
        public final /* synthetic */ Qa.p g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, h hVar, Qa.p pVar, Ga.e eVar) {
            super(2, eVar);
            this.e = obj;
            this.f = hVar;
            this.g = pVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            c cVar = new c(this.e, this.f, this.g, eVar);
            cVar.d = obj;
            return cVar;
        }

        public final Object invoke(j jVar, Ga.e eVar) {
            return ((c) create(jVar, eVar)).invokeSuspend(I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0052  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0068 -> B:6:0x001b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = Ha.c.f()
                int r1 = r6.c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2d
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r6.b
                java.util.Iterator r1 = (java.util.Iterator) r1
                java.lang.Object r3 = r6.a
                java.lang.Object r4 = r6.d
                Ya.j r4 = (Ya.j) r4
                Ca.t.b(r7)
            L1b:
                r7 = r3
                goto L4c
            L1d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L25:
                java.lang.Object r1 = r6.d
                Ya.j r1 = (Ya.j) r1
                Ca.t.b(r7)
                goto L42
            L2d:
                Ca.t.b(r7)
                java.lang.Object r7 = r6.d
                r1 = r7
                Ya.j r1 = (Ya.j) r1
                java.lang.Object r7 = r6.e
                r6.d = r1
                r6.c = r3
                java.lang.Object r7 = r1.a(r7, r6)
                if (r7 != r0) goto L42
                return r0
            L42:
                java.lang.Object r7 = r6.e
                Ya.h r3 = r6.f
                java.util.Iterator r3 = r3.iterator()
                r4 = r1
                r1 = r3
            L4c:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L6b
                java.lang.Object r3 = r1.next()
                Qa.p r5 = r6.g
                java.lang.Object r3 = r5.invoke(r7, r3)
                r6.d = r4
                r6.a = r3
                r6.b = r1
                r6.c = r2
                java.lang.Object r7 = r4.a(r3, r6)
                if (r7 != r0) goto L1b
                return r0
            L6b:
                Ca.I r7 = Ca.I.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Ya.r.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d implements h {
        public final /* synthetic */ h a;
        public final /* synthetic */ Comparator b;

        public d(h hVar, Comparator comparator) {
            this.a = hVar;
            this.b = comparator;
        }

        public Iterator iterator() {
            List H = r.H(this.a);
            z.C(H, this.b);
            return H.iterator();
        }
    }

    public static h A(h hVar, Qa.l transform) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        kotlin.jvm.internal.t.g(transform, "transform");
        return t(new v(hVar, transform));
    }

    public static h B(h hVar, Object obj, Qa.p operation) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        kotlin.jvm.internal.t.g(operation, "operation");
        return k.b(new c(obj, hVar, operation, null));
    }

    public static h C(h hVar, Comparator comparator) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        kotlin.jvm.internal.t.g(comparator, "comparator");
        return new d(hVar, comparator);
    }

    public static h D(h hVar, int i) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        if (i >= 0) {
            return i == 0 ? o.g() : hVar instanceof Ya.c ? ((Ya.c) hVar).b(i) : new t(hVar, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static h E(h hVar, Qa.l predicate) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        kotlin.jvm.internal.t.g(predicate, "predicate");
        return new u(hVar, predicate);
    }

    public static final Collection F(h hVar, Collection destination) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        kotlin.jvm.internal.t.g(destination, "destination");
        Iterator it = hVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static List G(h hVar) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        Iterator it = hVar.iterator();
        if (!it.hasNext()) {
            return Da.v.n();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Da.u.e(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final List H(h hVar) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        return F(hVar, new ArrayList());
    }

    public static /* synthetic */ boolean n(Object obj) {
        return u(obj);
    }

    public static Iterable o(h hVar) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        return new a(hVar);
    }

    public static int p(h hVar) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        Iterator it = hVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                Da.v.w();
            }
        }
        return i;
    }

    public static h q(h hVar, int i) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        if (i >= 0) {
            return i == 0 ? hVar : hVar instanceof Ya.c ? ((Ya.c) hVar).a(i) : new Ya.b(hVar, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static h r(h hVar, Qa.l predicate) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        kotlin.jvm.internal.t.g(predicate, "predicate");
        return new e(hVar, true, predicate);
    }

    public static final h s(h hVar, Qa.l predicate) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        kotlin.jvm.internal.t.g(predicate, "predicate");
        return new e(hVar, false, predicate);
    }

    public static final h t(h hVar) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        h s = s(hVar, new q());
        kotlin.jvm.internal.t.e(s, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return s;
    }

    public static final boolean u(Object obj) {
        return obj == null;
    }

    public static h v(h hVar, Qa.l transform) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        kotlin.jvm.internal.t.g(transform, "transform");
        return new f(hVar, transform, b.a);
    }

    public static final Appendable w(h hVar, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        kotlin.jvm.internal.t.g(buffer, "buffer");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (Object obj : hVar) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            Za.r.a(buffer, obj, lVar);
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String x(h hVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Qa.l lVar) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        kotlin.jvm.internal.t.g(separator, "separator");
        kotlin.jvm.internal.t.g(prefix, "prefix");
        kotlin.jvm.internal.t.g(postfix, "postfix");
        kotlin.jvm.internal.t.g(truncated, "truncated");
        return w(hVar, new StringBuilder(), separator, prefix, postfix, i, truncated, lVar).toString();
    }

    public static /* synthetic */ String y(h hVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Qa.l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i2 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i2 & 4) == 0 ? charSequence3 : "";
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return x(hVar, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    public static h z(h hVar, Qa.l transform) {
        kotlin.jvm.internal.t.g(hVar, "<this>");
        kotlin.jvm.internal.t.g(transform, "transform");
        return new v(hVar, transform);
    }
}
