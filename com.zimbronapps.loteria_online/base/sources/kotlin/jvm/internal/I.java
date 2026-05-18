package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class i implements Xa.c, h {
    public static final a b = new a(null);
    public static final Map c;
    public static final HashMap d;
    public static final HashMap e;
    public static final HashMap f;
    public static final Map g;
    public final Class a;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final String a(Class jClass) {
            String str;
            t.g(jClass, "jClass");
            String str2 = null;
            if (jClass.isAnonymousClass() || jClass.isLocalClass()) {
                return null;
            }
            if (!jClass.isArray()) {
                String str3 = (String) i.d().get(jClass.getName());
                return str3 == null ? jClass.getCanonicalName() : str3;
            }
            Class componentType = jClass.getComponentType();
            if (componentType.isPrimitive() && (str = (String) i.d().get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
        
            if (r2 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String b(java.lang.Class r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.t.g(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto Le
                goto Lb3
            Le:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L6a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L41
                kotlin.jvm.internal.t.d(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = Za.E.V0(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L3e
                goto L41
            L3e:
                r1 = r2
                goto Lb3
            L41:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L62
                kotlin.jvm.internal.t.d(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = Za.E.V0(r0, r7, r1, r3, r1)
                goto Lb3
            L62:
                kotlin.jvm.internal.t.d(r0)
                java.lang.String r1 = Za.E.U0(r0, r4, r1, r3, r1)
                goto Lb3
            L6a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L9e
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L9b
                java.util.Map r0 = kotlin.jvm.internal.i.g()
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L9b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L9b:
                if (r1 != 0) goto Lb3
                goto L3e
            L9e:
                java.util.Map r0 = kotlin.jvm.internal.i.g()
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto Lb3
                java.lang.String r1 = r7.getSimpleName()
            Lb3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.i.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(Object obj, Class jClass) {
            t.g(jClass, "jClass");
            Map f = i.f();
            t.e(f, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) f.get(jClass);
            if (num != null) {
                return V.k(obj, num.intValue());
            }
            if (jClass.isPrimitive()) {
                jClass = Pa.a.b(Pa.a.c(jClass));
            }
            return jClass.isInstance(obj);
        }

        public a() {
        }
    }

    static {
        List q = Da.v.q(Qa.a.class, Qa.l.class, Qa.p.class, Qa.q.class, Qa.r.class, Qa.s.class, Qa.t.class, Qa.u.class, Qa.v.class, Qa.w.class, Qa.b.class, Qa.c.class, Qa.d.class, Qa.e.class, Qa.f.class, Qa.g.class, Qa.h.class, Qa.i.class, Qa.j.class, Qa.k.class, Qa.m.class, Qa.n.class, Qa.o.class);
        ArrayList arrayList = new ArrayList(Da.w.y(q, 10));
        int i = 0;
        for (Object obj : q) {
            int i2 = i + 1;
            if (i < 0) {
                Da.v.x();
            }
            arrayList.add(Ca.x.a((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        c = Da.S.x(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        d = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        e = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Iterable<String> values = hashMap.values();
        t.f(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            t.d(str);
            sb.append(Za.E.Y0(str, '.', null, 2, null));
            sb.append("CompanionObject");
            Ca.q a2 = Ca.x.a(sb.toString(), str + ".Companion");
            hashMap3.put(a2.c(), a2.d());
        }
        for (Map.Entry entry : c.entrySet()) {
            hashMap3.put(((Class) entry.getKey()).getName(), "kotlin.Function" + ((Number) entry.getValue()).intValue());
        }
        f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(Da.Q.e(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            t.d(str2);
            linkedHashMap.put(key, Za.E.Y0(str2, '.', null, 2, null));
        }
        g = linkedHashMap;
    }

    public i(Class jClass) {
        t.g(jClass, "jClass");
        this.a = jClass;
    }

    public static final /* synthetic */ HashMap d() {
        return f;
    }

    public static final /* synthetic */ Map f() {
        return c;
    }

    public static final /* synthetic */ Map g() {
        return g;
    }

    public boolean a(Object obj) {
        return b.c(obj, b());
    }

    public Class b() {
        return this.a;
    }

    public String c() {
        return b.a(b());
    }

    public String e() {
        return b.b(b());
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && t.c(Pa.a.b(this), Pa.a.b((Xa.c) obj));
    }

    public int hashCode() {
        return Pa.a.b(this).hashCode();
    }

    public String toString() {
        return b() + " (Kotlin reflection is not available)";
    }
}
