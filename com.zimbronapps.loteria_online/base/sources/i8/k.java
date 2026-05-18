package I8;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class k {

    public static abstract class b {
        public static final b a;

        public class a extends b {
            public final /* synthetic */ Method b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Method method) {
                super(null);
                this.b = method;
            }

            public boolean a(AccessibleObject accessibleObject, Object obj) {
                try {
                    return ((Boolean) this.b.invoke(accessibleObject, new Object[]{obj})).booleanValue();
                } catch (Exception e) {
                    throw new RuntimeException("Failed invoking canAccess", e);
                }
            }
        }

        public class b extends b {
            public b() {
                super(null);
            }

            public boolean a(AccessibleObject accessibleObject, Object obj) {
                return true;
            }
        }

        static {
            b aVar;
            if (e.d()) {
                try {
                    aVar = new a(AccessibleObject.class.getDeclaredMethod("canAccess", new Class[]{Object.class}));
                } catch (NoSuchMethodException unused) {
                }
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new b();
            }
            a = aVar;
        }

        public b() {
        }

        public abstract boolean a(AccessibleObject accessibleObject, Object obj);

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static boolean a(AccessibleObject accessibleObject, Object obj) {
        return b.a.a(accessibleObject, obj);
    }

    public static G8.m b(List list, Class cls) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return G8.m.ALLOW;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }
}
