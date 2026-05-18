package I8;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class c {
    public final Map a;
    public final boolean b;
    public final List c;

    public class a implements I8.h {
        public Object a() {
            return new TreeSet();
        }
    }

    public class b implements I8.h {
        public Object a() {
            return new LinkedHashSet();
        }
    }

    public class c implements I8.h {
        public Object a() {
            return new ArrayDeque();
        }
    }

    public class d implements I8.h {
        public Object a() {
            return new ArrayList();
        }
    }

    public class e implements I8.h {
        public Object a() {
            return new ConcurrentSkipListMap();
        }
    }

    public class f implements I8.h {
        public Object a() {
            return new ConcurrentHashMap();
        }
    }

    public class g implements I8.h {
        public Object a() {
            return new TreeMap();
        }
    }

    public class h implements I8.h {
        public Object a() {
            return new LinkedHashMap();
        }
    }

    public class i implements I8.h {
        public Object a() {
            return new I8.g();
        }
    }

    public class j implements I8.h {
        public final /* synthetic */ Class a;

        public j(Class cls) {
            this.a = cls;
        }

        public Object a() {
            try {
                return I8.m.a.d(this.a);
            } catch (Exception e) {
                throw new RuntimeException("Unable to create instance of " + this.a + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
            }
        }
    }

    public class k implements I8.h {
        public final /* synthetic */ String a;

        public k(String str) {
            this.a = str;
        }

        public Object a() {
            throw new G8.g(this.a);
        }
    }

    public class l implements I8.h {
        public final /* synthetic */ String a;

        public l(String str) {
            this.a = str;
        }

        public Object a() {
            throw new G8.g(this.a);
        }
    }

    public class m implements I8.h {
        public final /* synthetic */ String a;

        public m(String str) {
            this.a = str;
        }

        public Object a() {
            throw new G8.g(this.a);
        }
    }

    public class n implements I8.h {
        public final /* synthetic */ Type a;

        public n(Type type) {
            this.a = type;
        }

        public Object a() {
            ParameterizedType parameterizedType = this.a;
            if (!(parameterizedType instanceof ParameterizedType)) {
                throw new G8.g("Invalid EnumSet type: " + this.a.toString());
            }
            Class cls = parameterizedType.getActualTypeArguments()[0];
            if (cls instanceof Class) {
                return EnumSet.noneOf(cls);
            }
            throw new G8.g("Invalid EnumSet type: " + this.a.toString());
        }
    }

    public class o implements I8.h {
        public final /* synthetic */ Type a;

        public o(Type type) {
            this.a = type;
        }

        public Object a() {
            ParameterizedType parameterizedType = this.a;
            if (!(parameterizedType instanceof ParameterizedType)) {
                throw new G8.g("Invalid EnumMap type: " + this.a.toString());
            }
            Class cls = parameterizedType.getActualTypeArguments()[0];
            if (cls instanceof Class) {
                return new EnumMap(cls);
            }
            throw new G8.g("Invalid EnumMap type: " + this.a.toString());
        }
    }

    public class p implements I8.h {
        public final /* synthetic */ String a;

        public p(String str) {
            this.a = str;
        }

        public Object a() {
            throw new G8.g(this.a);
        }
    }

    public class q implements I8.h {
        public final /* synthetic */ String a;

        public q(String str) {
            this.a = str;
        }

        public Object a() {
            throw new G8.g(this.a);
        }
    }

    public class r implements I8.h {
        public final /* synthetic */ Constructor a;

        public r(Constructor constructor) {
            this.a = constructor;
        }

        public Object a() {
            try {
                return this.a.newInstance((Object[]) null);
            } catch (InvocationTargetException e) {
                throw new RuntimeException("Failed to invoke constructor '" + L8.a.c(this.a) + "' with no args", e.getCause());
            } catch (InstantiationException e2) {
                throw new RuntimeException("Failed to invoke constructor '" + L8.a.c(this.a) + "' with no args", e2);
            } catch (IllegalAccessException e3) {
                throw L8.a.e(e3);
            }
        }
    }

    public c(Map map, boolean z, List list) {
        this.a = map;
        this.b = z;
        this.c = list;
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName();
    }

    public static I8.h c(Class cls, G8.m mVar) {
        String m2;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor((Class[]) null);
            G8.m mVar2 = G8.m.ALLOW;
            if (mVar == mVar2 || (I8.k.a(declaredConstructor, null) && (mVar != G8.m.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (mVar != mVar2 || (m2 = L8.a.m(declaredConstructor)) == null) ? new r(declaredConstructor) : new q(m2);
            }
            return new p("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.");
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static I8.h d(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return SortedSet.class.isAssignableFrom(cls) ? new a() : Set.class.isAssignableFrom(cls) ? new b() : Queue.class.isAssignableFrom(cls) ? new c() : new d();
        }
        if (Map.class.isAssignableFrom(cls)) {
            return ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new e() : ConcurrentMap.class.isAssignableFrom(cls) ? new f() : SortedMap.class.isAssignableFrom(cls) ? new g() : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(N8.a.b(((ParameterizedType) type).getActualTypeArguments()[0]).c())) ? new i() : new h();
        }
        return null;
    }

    public static I8.h e(Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new n(type);
        }
        if (cls == EnumMap.class) {
            return new o(type);
        }
        return null;
    }

    public I8.h b(N8.a aVar) {
        Type d2 = aVar.d();
        Class c2 = aVar.c();
        android.support.v4.media.session.b.a(this.a.get(d2));
        android.support.v4.media.session.b.a(this.a.get(c2));
        I8.h e2 = e(d2, c2);
        if (e2 != null) {
            return e2;
        }
        G8.m b2 = I8.k.b(this.c, c2);
        I8.h c3 = c(c2, b2);
        if (c3 != null) {
            return c3;
        }
        I8.h d3 = d(d2, c2);
        if (d3 != null) {
            return d3;
        }
        String a2 = a(c2);
        if (a2 != null) {
            return new l(a2);
        }
        if (b2 == G8.m.ALLOW) {
            return f(c2);
        }
        return new m("Unable to create instance of " + c2 + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.");
    }

    public final I8.h f(Class cls) {
        if (this.b) {
            return new j(cls);
        }
        return new k("Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.");
    }

    public String toString() {
        return this.a.toString();
    }
}
