package ob;

import Ca.n;
import Da.I;
import Da.Q;
import Da.S;
import Da.p;
import Da.r;
import Da.v;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.t;
import qb.c;
import qb.l;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class h extends sb.b {
    public final Xa.c a;
    public List b;
    public final Ca.l c;
    public final Map d;
    public final Map e;

    public static final class a implements I {
        public final /* synthetic */ Iterable a;

        public a(Iterable iterable) {
            this.a = iterable;
        }

        public Object a(Object obj) {
            return ((b) ((Map.Entry) obj).getValue()).getDescriptor().h();
        }

        public Iterator b() {
            return this.a.iterator();
        }
    }

    public h(String serialName, Xa.c baseClass, Xa.c[] subclasses, b[] subclassSerializers) {
        t.g(serialName, "serialName");
        t.g(baseClass, "baseClass");
        t.g(subclasses, "subclasses");
        t.g(subclassSerializers, "subclassSerializers");
        this.a = baseClass;
        this.b = v.n();
        this.c = Ca.m.a(n.b, new e(serialName, this));
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + e().e() + " should be marked @Serializable");
        }
        Map x = S.x(r.e1(subclasses, subclassSerializers));
        this.d = x;
        a aVar = new a(x.entrySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator b = aVar.b();
        while (b.hasNext()) {
            Object next = b.next();
            Object a2 = aVar.a(next);
            Object obj = linkedHashMap.get(a2);
            if (obj == null) {
                linkedHashMap.containsKey(a2);
            }
            Map.Entry entry = (Map.Entry) next;
            Map.Entry entry2 = (Map.Entry) obj;
            String str = (String) a2;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + e() + "' have the same serial name '" + str + "': '" + entry2.getKey() + "', '" + entry.getKey() + '\'').toString());
            }
            linkedHashMap.put(a2, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Q.e(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (b) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
    }

    public static /* synthetic */ Ca.I f(h hVar, qb.a aVar) {
        return j(hVar, aVar);
    }

    public static /* synthetic */ Ca.I g(h hVar, qb.a aVar) {
        return k(hVar, aVar);
    }

    public static /* synthetic */ qb.e h(String str, h hVar) {
        return i(str, hVar);
    }

    public static final qb.e i(String str, h hVar) {
        return qb.k.d(str, c.a.a, new qb.e[0], new f(hVar));
    }

    public static final Ca.I j(h hVar, qb.a buildSerialDescriptor) {
        t.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
        qb.a.b(buildSerialDescriptor, "type", pb.a.F(U.a).getDescriptor(), null, false, 12, null);
        qb.a.b(buildSerialDescriptor, "value", qb.k.d("kotlinx.serialization.Sealed<" + hVar.e().e() + '>', l.a.a, new qb.e[0], new g(hVar)), null, false, 12, null);
        buildSerialDescriptor.h(hVar.b);
        return Ca.I.a;
    }

    public static final Ca.I k(h hVar, qb.a buildSerialDescriptor) {
        t.g(buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (Map.Entry entry : hVar.e.entrySet()) {
            qb.a.b(buildSerialDescriptor, (String) entry.getKey(), ((b) entry.getValue()).getDescriptor(), null, false, 12, null);
        }
        return Ca.I.a;
    }

    public ob.a c(rb.c decoder, String str) {
        t.g(decoder, "decoder");
        b bVar = (b) this.e.get(str);
        return bVar != null ? bVar : super.c(decoder, str);
    }

    public k d(rb.f encoder, Object value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        k kVar = (b) this.d.get(P.b(value.getClass()));
        if (kVar == null) {
            kVar = super.d(encoder, value);
        }
        if (kVar != null) {
            return kVar;
        }
        return null;
    }

    public Xa.c e() {
        return this.a;
    }

    public qb.e getDescriptor() {
        return (qb.e) this.c.getValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(String serialName, Xa.c baseClass, Xa.c[] subclasses, b[] subclassSerializers, Annotation[] classAnnotations) {
        this(serialName, baseClass, subclasses, subclassSerializers);
        t.g(serialName, "serialName");
        t.g(baseClass, "baseClass");
        t.g(subclasses, "subclasses");
        t.g(subclassSerializers, "subclassSerializers");
        t.g(classAnnotations, "classAnnotations");
        this.b = p.c(classAnnotations);
    }
}
