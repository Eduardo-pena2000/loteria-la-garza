package u4;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class z {

    public static class a {
        public static final E a = new E(z.d().getWebkitToCompatConverter());
    }

    public static class b {
        public static final B a = z.a();
    }

    public static B a() {
        try {
            return new C((WebViewProviderFactoryBoundaryInterface) Lb.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (NoSuchMethodException e) {
            e = e;
            throw new RuntimeException(e);
        } catch (ClassNotFoundException unused) {
            return new k();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    public static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", (Class[]) null).invoke((Object) null, (Object[]) null);
    }

    public static E c() {
        return a.a;
    }

    public static B d() {
        return b.a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? i.a() : f().getClass().getClassLoader();
    }

    public static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", (Class[]) null);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke((Object) null, (Object[]) null);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
