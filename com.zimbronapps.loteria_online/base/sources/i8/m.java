package I8;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class m {
    public static final m a = c();

    public class a extends m {
        public final /* synthetic */ Method b;
        public final /* synthetic */ Object c;

        public a(Method method, Object obj) {
            this.b = method;
            this.c = obj;
        }

        public Object d(Class cls) {
            m.a(cls);
            return this.b.invoke(this.c, new Object[]{cls});
        }
    }

    public class b extends m {
        public final /* synthetic */ Method b;
        public final /* synthetic */ int c;

        public b(Method method, int i) {
            this.b = method;
            this.c = i;
        }

        public Object d(Class cls) {
            m.a(cls);
            return this.b.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.c)});
        }
    }

    public class c extends m {
        public final /* synthetic */ Method b;

        public c(Method method) {
            this.b = method;
        }

        public Object d(Class cls) {
            m.a(cls);
            return this.b.invoke((Object) null, new Object[]{cls, Object.class});
        }
    }

    public class d extends m {
        public Object d(Class cls) {
            throw new UnsupportedOperationException("Cannot allocate " + cls + ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        }
    }

    public static /* synthetic */ void a(Class cls) {
        b(cls);
    }

    public static void b(Class cls) {
        String a2 = I8.c.a(cls);
        if (a2 == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: " + a2);
    }

    public static m c() {
        try {
            try {
                try {
                    Class cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new a(cls.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
                } catch (Exception unused) {
                    return new d();
                }
            } catch (Exception unused2) {
                Method declaredMethod = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                declaredMethod.setAccessible(true);
                return new c(declaredMethod);
            }
        } catch (Exception unused3) {
            Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
            declaredMethod2.setAccessible(true);
            int intValue = ((Integer) declaredMethod2.invoke((Object) null, new Object[]{Object.class})).intValue();
            Method declaredMethod3 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
            declaredMethod3.setAccessible(true);
            return new b(declaredMethod3, intValue);
        }
    }

    public abstract Object d(Class cls);
}
