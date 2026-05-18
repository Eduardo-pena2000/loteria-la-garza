package Wb;

import Yb.i;
import Yb.l;
import Yb.m;
import Yb.o;
import Yb.q;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class e {
    public static volatile int a;
    public static volatile Zb.b e;
    public static final o b = new o();
    public static final i c = new i();
    public static boolean d = q.d("slf4j.detectLoggerNameMismatch");
    public static final String[] f = {"2.0"};

    public static void A(List list, Iterator it) {
        try {
            list.add((Zb.b) it.next());
        } catch (ServiceConfigurationError e2) {
            l.b("A service provider failed to instantiate:\n" + e2.getMessage());
        }
    }

    public static final void B() {
        try {
            String b2 = e.b();
            boolean z = false;
            for (String str : f) {
                if (b2.startsWith(str)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            l.i("The requested version " + b2 + " by your slf4j provider is not compatible with " + Arrays.asList(f).toString());
            l.i("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (Throwable th) {
            l.c("Unexpected problem occurred during version sanity check", th);
        }
    }

    public static /* synthetic */ ServiceLoader a(ClassLoader classLoader) {
        return q(classLoader);
    }

    public static final void b() {
        try {
            List i = i();
            z(i);
            if (i == null || i.isEmpty()) {
                a = 4;
                l.i("No SLF4J providers were found.");
                l.i("Defaulting to no-operation (NOP) logger implementation");
                l.i("See https://www.slf4j.org/codes.html#noProviders for further details.");
                y(h());
            } else {
                e = (Zb.b) i.get(0);
                c();
                e.initialize();
                a = 3;
                x(i);
            }
            u();
        } catch (Exception e2) {
            g(e2);
            throw new IllegalStateException("Unexpected initialization failure", e2);
        }
    }

    public static void c() {
        Zb.a c2 = e.c();
        if (c2 != null) {
            f.a(c2);
        }
    }

    public static void d(Xb.d dVar, int i) {
        if (dVar.c().z()) {
            e(i);
        } else {
            if (dVar.c().A()) {
                return;
            }
            f();
        }
    }

    public static void e(int i) {
        l.i("A number (" + i + ") of logging calls during the initialization phase have been intercepted and are");
        l.i("now being replayed. These are subject to the filtering rules of the underlying logging system.");
        l.i("See also https://www.slf4j.org/codes.html#replay");
    }

    public static void f() {
        l.i("The following set of substitute loggers may have been accessed");
        l.i("during the initialization phase. Logging calls during this");
        l.i("phase were not honored. However, subsequent logging calls to these");
        l.i("loggers will work as normally expected.");
        l.i("See also https://www.slf4j.org/codes.html#substituteLogger");
    }

    public static void g(Throwable th) {
        a = 2;
        l.c("Failed to instantiate SLF4J LoggerFactory", th);
    }

    public static Set h() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = e.class.getClassLoader();
            Enumeration systemResources = classLoader == null ? ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class") : classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add((URL) systemResources.nextElement());
            }
        } catch (IOException e2) {
            l.c("Error getting resources from path", e2);
        }
        return linkedHashSet;
    }

    public static List i() {
        ArrayList arrayList = new ArrayList();
        ClassLoader classLoader = e.class.getClassLoader();
        Zb.b r = r(classLoader);
        if (r != null) {
            arrayList.add(r);
            return arrayList;
        }
        Iterator it = o(classLoader).iterator();
        while (it.hasNext()) {
            A(arrayList, it);
        }
        return arrayList;
    }

    public static void j() {
        o oVar = b;
        synchronized (oVar) {
            try {
                oVar.d().e();
                for (m mVar : oVar.d().d()) {
                    mVar.D(m(mVar.getName()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static a k() {
        return n().a();
    }

    public static c l(Class cls) {
        Class a2;
        c m = m(cls.getName());
        if (d && (a2 = q.a()) != null && s(cls, a2)) {
            l.i(String.format("Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\".", new Object[]{m.getName(), a2.getName()}));
            l.i("See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation");
        }
        return m;
    }

    public static c m(String str) {
        return k().a(str);
    }

    public static Zb.b n() {
        if (a == 0) {
            synchronized (e.class) {
                try {
                    if (a == 0) {
                        a = 1;
                        t();
                    }
                } finally {
                }
            }
        }
        int i = a;
        if (i == 1) {
            return b;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return e;
        }
        if (i == 4) {
            return c;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static ServiceLoader o(ClassLoader classLoader) {
        return System.getSecurityManager() == null ? ServiceLoader.load(Zb.b.class, classLoader) : (ServiceLoader) AccessController.doPrivileged(new d(classLoader));
    }

    public static boolean p(List list) {
        return list.size() > 1;
    }

    public static /* synthetic */ ServiceLoader q(ClassLoader classLoader) {
        return ServiceLoader.load(Zb.b.class, classLoader);
    }

    public static Zb.b r(ClassLoader classLoader) {
        String property = System.getProperty("slf4j.provider");
        if (property != null && !property.isEmpty()) {
            try {
                l.f(String.format("Attempting to load provider \"%s\" specified via \"%s\" system property", new Object[]{property, "slf4j.provider"}));
                return (Zb.b) classLoader.loadClass(property).getConstructor((Class[]) null).newInstance((Object[]) null);
            } catch (InvocationTargetException e2) {
                e = e2;
                l.c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", new Object[]{property}), e);
                return null;
            } catch (NoSuchMethodException e3) {
                e = e3;
                l.c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", new Object[]{property}), e);
                return null;
            } catch (ClassNotFoundException e4) {
                e = e4;
                l.c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", new Object[]{property}), e);
                return null;
            } catch (IllegalAccessException e5) {
                e = e5;
                l.c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", new Object[]{property}), e);
                return null;
            } catch (InstantiationException e6) {
                e = e6;
                l.c(String.format("Failed to instantiate the specified SLF4JServiceProvider (%s)", new Object[]{property}), e);
                return null;
            } catch (ClassCastException e7) {
                l.c(String.format("Specified SLF4JServiceProvider (%s) does not implement SLF4JServiceProvider interface", new Object[]{property}), e7);
                return null;
            }
        }
        return null;
    }

    public static boolean s(Class cls, Class cls2) {
        return !cls2.isAssignableFrom(cls);
    }

    public static final void t() {
        b();
        if (a == 3) {
            B();
        }
    }

    public static void u() {
        j();
        v();
        b.d().b();
    }

    public static void v() {
        LinkedBlockingQueue c2 = b.d().c();
        int size = c2.size();
        ArrayList<Xb.d> arrayList = new ArrayList(128);
        int i = 0;
        while (c2.drainTo(arrayList, 128) != 0) {
            for (Xb.d dVar : arrayList) {
                w(dVar);
                int i2 = i + 1;
                if (i == 0) {
                    d(dVar, size);
                }
                i = i2;
            }
            arrayList.clear();
        }
    }

    public static void w(Xb.d dVar) {
        if (dVar == null) {
            return;
        }
        m c2 = dVar.c();
        String name = c2.getName();
        if (c2.B()) {
            throw new IllegalStateException("Delegate logger cannot be null at this state.");
        }
        if (c2.A()) {
            return;
        }
        if (!c2.z()) {
            l.i(name);
        } else if (c2.l(dVar.b())) {
            c2.C(dVar);
        }
    }

    public static void x(List list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("No providers were found which is impossible after successful initialization.");
        }
        if (p(list)) {
            l.f("Actual provider is of type [" + list.get(0) + "]");
            return;
        }
        l.a("Connected with provider of type [" + ((Zb.b) list.get(0)).getClass().getName() + "]");
    }

    public static void y(Set set) {
        if (set.isEmpty()) {
            return;
        }
        l.i("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            l.i("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        l.i("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void z(List list) {
        if (p(list)) {
            l.i("Class path contains multiple SLF4J providers.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                l.i("Found provider [" + ((Zb.b) it.next()) + "]");
            }
            l.i("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
