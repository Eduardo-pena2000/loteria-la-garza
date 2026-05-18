package F4;

import Xa.c;
import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a {
    public static final a a = new a();

    public static final boolean e(String str, Qa.a aVar) {
        t.g(aVar, "block");
        try {
            boolean booleanValue = ((Boolean) aVar.invoke()).booleanValue();
            if (!booleanValue && str != null) {
                Log.e("ReflectionGuard", str);
            }
            return booleanValue;
        } catch (NoSuchMethodException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("NoSuchMethod: ");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            Log.e("ReflectionGuard", sb.toString());
            return false;
        } catch (ClassNotFoundException unused2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ClassNotFound: ");
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            Log.e("ReflectionGuard", sb2.toString());
            return false;
        }
    }

    public final boolean a(Qa.a aVar) {
        t.g(aVar, "classLoader");
        try {
            aVar.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean b(Method method, c cVar) {
        t.g(method, "<this>");
        t.g(cVar, "clazz");
        return c(method, Pa.a.a(cVar));
    }

    public final boolean c(Method method, Class cls) {
        t.g(method, "<this>");
        t.g(cls, "clazz");
        return method.getReturnType().equals(cls);
    }

    public final boolean d(Method method) {
        t.g(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }
}
