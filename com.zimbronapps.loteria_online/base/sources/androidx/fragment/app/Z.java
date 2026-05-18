package androidx.fragment.app;

import androidx.fragment.app.p;
import w.i0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class z {
    public static final i0 a = new i0();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return p.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class c(ClassLoader classLoader, String str) {
        i0 i0Var = a;
        i0 i0Var2 = (i0) i0Var.get(classLoader);
        if (i0Var2 == null) {
            i0Var2 = new i0();
            i0Var.put(classLoader, i0Var2);
        }
        Class cls = (Class) i0Var2.get(str);
        if (cls != null) {
            return cls;
        }
        Class cls2 = Class.forName(str, false, classLoader);
        i0Var2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new p.l("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new p.l("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    public abstract p a(ClassLoader classLoader, String str);
}
