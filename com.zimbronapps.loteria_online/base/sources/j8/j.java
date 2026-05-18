package J8;

import G8.p;
import G8.q;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class j implements q {
    public final I8.c a;
    public final G8.c b;
    public final I8.d c;
    public final J8.e d;
    public final List e;

    public class a extends c {
        public final /* synthetic */ boolean f;
        public final /* synthetic */ Method g;
        public final /* synthetic */ boolean h;
        public final /* synthetic */ p i;
        public final /* synthetic */ G8.d j;
        public final /* synthetic */ N8.a k;
        public final /* synthetic */ boolean l;
        public final /* synthetic */ boolean m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Field field, boolean z, boolean z2, boolean z3, Method method, boolean z4, p pVar, G8.d dVar, N8.a aVar, boolean z5, boolean z6) {
            super(str, field, z, z2);
            this.f = z3;
            this.g = method;
            this.h = z4;
            this.i = pVar;
            this.j = dVar;
            this.k = aVar;
            this.l = z5;
            this.m = z6;
        }

        public void a(O8.a aVar, Object obj) {
            Object obj2;
            if (this.d) {
                if (this.f) {
                    Method method = this.g;
                    if (method == null) {
                        j.b(obj, this.b);
                    } else {
                        j.b(obj, method);
                    }
                }
                Method method2 = this.g;
                if (method2 != null) {
                    try {
                        obj2 = method2.invoke(obj, (Object[]) null);
                    } catch (InvocationTargetException e) {
                        throw new G8.g("Accessor " + L8.a.g(this.g, false) + " threw exception", e.getCause());
                    }
                } else {
                    obj2 = this.b.get(obj);
                }
                if (obj2 == obj) {
                    return;
                }
                aVar.s(this.a);
                (this.h ? this.i : new l(this.j, this.i, this.k.d())).c(aVar, obj2);
            }
        }
    }

    public static abstract class b extends p {
        public final Map a;

        public b(Map map) {
            this.a = map;
        }

        public void c(O8.a aVar, Object obj) {
            if (obj == null) {
                aVar.u();
                return;
            }
            aVar.d();
            try {
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((c) it.next()).a(aVar, obj);
                }
                aVar.h();
            } catch (IllegalAccessException e) {
                throw L8.a.e(e);
            }
        }
    }

    public static abstract class c {
        public final String a;
        public final Field b;
        public final String c;
        public final boolean d;
        public final boolean e;

        public c(String str, Field field, boolean z, boolean z2) {
            this.a = str;
            this.b = field;
            this.c = field.getName();
            this.d = z;
            this.e = z2;
        }

        public abstract void a(O8.a aVar, Object obj);
    }

    public static final class d extends b {
        public final I8.h b;

        public d(I8.h hVar, Map map) {
            super(map);
            this.b = hVar;
        }
    }

    public static final class e extends b {
        public static final Map e = d();
        public final Constructor b;
        public final Object[] c;
        public final Map d;

        public e(Class cls, Map map, boolean z) {
            super(map);
            this.d = new HashMap();
            Constructor i = L8.a.i(cls);
            this.b = i;
            if (z) {
                j.b(null, i);
            } else {
                L8.a.l(i);
            }
            String[] j = L8.a.j(cls);
            for (int i2 = 0; i2 < j.length; i2++) {
                this.d.put(j[i2], Integer.valueOf(i2));
            }
            Class[] parameterTypes = this.b.getParameterTypes();
            this.c = new Object[parameterTypes.length];
            for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                this.c[i3] = e.get(parameterTypes[i3]);
            }
        }

        public static Map d() {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            return hashMap;
        }
    }

    public j(I8.c cVar, G8.c cVar2, I8.d dVar, J8.e eVar, List list) {
        this.a = cVar;
        this.b = cVar2;
        this.c = dVar;
        this.d = eVar;
        this.e = list;
    }

    public static /* synthetic */ void b(Object obj, AccessibleObject accessibleObject) {
        c(obj, accessibleObject);
    }

    public static void c(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (I8.k.a(accessibleObject, obj)) {
            return;
        }
        throw new G8.g(L8.a.g(accessibleObject, true) + " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type.");
    }

    public p a(G8.d dVar, N8.a aVar) {
        Class c2 = aVar.c();
        if (!Object.class.isAssignableFrom(c2)) {
            return null;
        }
        G8.m b2 = I8.k.b(this.e, c2);
        if (b2 != G8.m.BLOCK_ALL) {
            boolean z = b2 == G8.m.BLOCK_INACCESSIBLE;
            return L8.a.k(c2) ? new e(c2, e(dVar, aVar, c2, z, true), z) : new d(this.a.b(aVar), e(dVar, aVar, c2, z, false));
        }
        throw new G8.g("ReflectionAccessFilter does not permit using reflection for " + c2 + ". Register a TypeAdapter for this type or adjust the access filter.");
    }

    public final c d(G8.d dVar, Field field, Method method, String str, N8.a aVar, boolean z, boolean z2, boolean z3) {
        boolean a2 = I8.j.a(aVar.c());
        int modifiers = field.getModifiers();
        boolean z4 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
        H8.b bVar = (H8.b) field.getAnnotation(H8.b.class);
        p b2 = bVar != null ? this.d.b(this.a, dVar, aVar, bVar) : null;
        boolean z5 = b2 != null;
        if (b2 == null) {
            b2 = dVar.f(aVar);
        }
        return new a(str, field, z, z2, z3, method, z5, b2, dVar, aVar, a2, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    public final Map e(G8.d dVar, N8.a aVar, Class cls, boolean z, boolean z2) {
        boolean z3;
        Method method;
        int i;
        int i2;
        boolean z4;
        j jVar = this;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        N8.a aVar2 = aVar;
        boolean z5 = z;
        Class cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            boolean z6 = true;
            boolean z7 = false;
            if (cls2 != cls && declaredFields.length > 0) {
                G8.m b2 = I8.k.b(jVar.e, cls2);
                if (b2 == G8.m.BLOCK_ALL) {
                    throw new G8.g("ReflectionAccessFilter does not permit using reflection for " + cls2 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z5 = b2 == G8.m.BLOCK_INACCESSIBLE;
            }
            boolean z8 = z5;
            int length = declaredFields.length;
            int i3 = 0;
            while (i3 < length) {
                Field field = declaredFields[i3];
                boolean g = jVar.g(field, z6);
                boolean g2 = jVar.g(field, z7);
                if (g || g2) {
                    c cVar = null;
                    if (!z2) {
                        z3 = g2;
                        method = null;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        method = null;
                        z3 = z7;
                    } else {
                        Method h = L8.a.h(cls2, field);
                        if (!z8) {
                            L8.a.l(h);
                        }
                        if (h.getAnnotation(H8.c.class) != null && field.getAnnotation(H8.c.class) == null) {
                            throw new G8.g("@SerializedName on " + L8.a.g(h, z7) + " is not supported");
                        }
                        z3 = g2;
                        method = h;
                    }
                    if (!z8 && method == null) {
                        L8.a.l(field);
                    }
                    Type o = I8.b.o(aVar2.d(), cls2, field.getGenericType());
                    List f = jVar.f(field);
                    int size = f.size();
                    ?? r1 = z7;
                    while (r1 < size) {
                        String str = (String) f.get((int) r1);
                        boolean z9 = r1 != 0 ? z7 : g;
                        int i4 = r1;
                        c cVar2 = cVar;
                        int i5 = size;
                        List list = f;
                        Field field2 = field;
                        int i6 = i3;
                        int i7 = length;
                        boolean z10 = z7;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str, d(dVar, field, method, str, N8.a.b(o), z9, z3, z8)) : cVar2;
                        g = z9;
                        i3 = i6;
                        size = i5;
                        f = list;
                        field = field2;
                        length = i7;
                        z7 = z10;
                        r1 = i4 + 1;
                    }
                    c cVar3 = cVar;
                    Field field3 = field;
                    i = i3;
                    i2 = length;
                    z4 = z7;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + cVar3.a + "'; conflict is caused by fields " + L8.a.f(cVar3.b) + " and " + L8.a.f(field3));
                    }
                } else {
                    i = i3;
                    i2 = length;
                    z4 = z7;
                }
                i3 = i + 1;
                z6 = true;
                jVar = this;
                length = i2;
                z7 = z4;
            }
            aVar2 = N8.a.b(I8.b.o(aVar2.d(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.c();
            jVar = this;
            z5 = z8;
        }
        return linkedHashMap;
    }

    public final List f(Field field) {
        H8.c cVar = (H8.c) field.getAnnotation(H8.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.b.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        Collections.addAll(arrayList, alternate);
        return arrayList;
    }

    public final boolean g(Field field, boolean z) {
        return (this.c.c(field.getType(), z) || this.c.f(field, z)) ? false : true;
    }
}
