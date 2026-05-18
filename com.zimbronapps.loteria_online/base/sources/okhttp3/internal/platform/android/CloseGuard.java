package okhttp3.internal.platform.android;

import java.lang.reflect.Method;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CloseGuard {
    public static final Companion d = new Companion(null);
    public final Method a;
    public final Method b;
    public final Method c;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final CloseGuard a() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", (Class[]) null);
                method2 = cls.getMethod("open", new Class[]{String.class});
                method = cls.getMethod("warnIfOpen", (Class[]) null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new CloseGuard(method3, method2, method);
        }

        private Companion() {
        }
    }

    public CloseGuard(Method method, Method method2, Method method3) {
        this.a = method;
        this.b = method2;
        this.c = method3;
    }

    public final Object a(String closer) {
        t.g(closer, "closer");
        Method method = this.a;
        if (method != null) {
            try {
                Object invoke = method.invoke((Object) null, (Object[]) null);
                Method method2 = this.b;
                t.d(method2);
                method2.invoke(invoke, new Object[]{closer});
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj != null) {
            try {
                Method method = this.c;
                t.d(method);
                method.invoke(obj, (Object[]) null);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
