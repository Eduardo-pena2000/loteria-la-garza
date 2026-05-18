package k4;

import Ca.e;
import Ca.s;
import b0.H;
import b0.b1;
import j4.i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b {
    public static final b1 a;

    static {
        Object b;
        b1 b1Var;
        try {
            s.a aVar = s.b;
            ClassLoader classLoader = i.class.getClassLoader();
            t.d(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", (Class[]) null);
            Annotation[] annotations = method.getAnnotations();
            t.f(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object invoke = method.invoke((Object) null, (Object[]) null);
                    if (invoke instanceof b1) {
                        b1Var = (b1) invoke;
                    }
                } else if (annotations[i] instanceof e) {
                    break;
                } else {
                    i++;
                }
            }
            b1Var = null;
            b = s.b(b1Var);
        } catch (Throwable th) {
            s.a aVar2 = s.b;
            b = s.b(Ca.t.a(th));
        }
        b1 b1Var2 = (b1) (s.g(b) ? null : b);
        if (b1Var2 == null) {
            b1Var2 = H.j(new a());
        }
        a = b1Var2;
    }

    public static /* synthetic */ i a() {
        return b();
    }

    public static final i b() {
        throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
    }

    public static final b1 c() {
        return a;
    }
}
