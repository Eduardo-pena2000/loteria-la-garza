package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x {
    public static final x a = new x();
    public static final Map b = new HashMap();
    public static final Map c = new HashMap();

    public static final String c(String str) {
        kotlin.jvm.internal.t.g(str, "className");
        return Za.B.H(str, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    public static final o f(Object obj) {
        kotlin.jvm.internal.t.g(obj, "object");
        boolean z = obj instanceof o;
        boolean z2 = obj instanceof DefaultLifecycleObserver;
        if (z && z2) {
            return new e((DefaultLifecycleObserver) obj, (o) obj);
        }
        if (z2) {
            return new e((DefaultLifecycleObserver) obj, null);
        }
        if (z) {
            return (o) obj;
        }
        Class cls = obj.getClass();
        x xVar = a;
        if (xVar.d(cls) != 2) {
            return new F(obj);
        }
        Object obj2 = c.get(cls);
        kotlin.jvm.internal.t.d(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            xVar.a((Constructor) list.get(0), obj);
            return new U(null);
        }
        int size = list.size();
        g[] gVarArr = new g[size];
        for (int i = 0; i < size; i++) {
            a.a((Constructor) list.get(i), obj);
            gVarArr[i] = null;
        }
        return new d(gVarArr);
    }

    public final g a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(new Object[]{obj});
            kotlin.jvm.internal.t.d(newInstance);
            android.support.v4.media.session.b.a(newInstance);
            return null;
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public final Constructor b(Class cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            kotlin.jvm.internal.t.d(name);
            if (name.length() != 0) {
                kotlin.jvm.internal.t.d(canonicalName);
                canonicalName = canonicalName.substring(name.length() + 1);
                kotlin.jvm.internal.t.f(canonicalName, "substring(...)");
            }
            kotlin.jvm.internal.t.d(canonicalName);
            String c2 = c(canonicalName);
            if (name.length() != 0) {
                c2 = name + '.' + c2;
            }
            Class cls2 = Class.forName(c2);
            kotlin.jvm.internal.t.e(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls});
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public final int d(Class cls) {
        Map map = b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g = g(cls);
        map.put(cls, Integer.valueOf(g));
        return g;
    }

    public final boolean e(Class cls) {
        return cls != null && q.class.isAssignableFrom(cls);
    }

    public final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b2 = b(cls);
        if (b2 != null) {
            c.put(cls, Da.u.e(b2));
            return 2;
        }
        if (c.c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            kotlin.jvm.internal.t.d(superclass);
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = c.get(superclass);
            kotlin.jvm.internal.t.d(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class[] interfaces = cls.getInterfaces();
        kotlin.jvm.internal.t.f(interfaces, "getInterfaces(...)");
        for (Class cls2 : interfaces) {
            if (e(cls2)) {
                kotlin.jvm.internal.t.d(cls2);
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = c.get(cls2);
                kotlin.jvm.internal.t.d(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        c.put(cls, arrayList);
        return 2;
    }
}
