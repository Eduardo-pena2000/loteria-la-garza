package t4;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import u4.A;
import u4.B;
import u4.a;
import u4.y;
import u4.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class i {
    public static final Uri a = Uri.parse("*");
    public static final Uri b = Uri.parse("");
    public static final WeakHashMap c = new WeakHashMap();

    public interface a {
        void onPostMessage(WebView webView, e eVar, Uri uri, boolean z, t4.a aVar);
    }

    public static d a(WebView webView, String str, Set set) {
        if (y.W.c()) {
            return h(webView).a(str, (String[]) set.toArray(new String[0]));
        }
        throw y.a();
    }

    public static void b(WebView webView, String str, Set set, a aVar) {
        if (!y.V.c()) {
            throw y.a();
        }
        h(webView).b(str, (String[]) set.toArray(new String[0]), aVar);
    }

    public static void c(WebView webView) {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("checkThread", (Class[]) null);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(webView, (Object[]) null);
                return;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        Looper b2 = u4.i.b(webView);
        if (b2 == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException("A WebView method was called on thread '" + Thread.currentThread().getName() + "'. All WebView methods must be called on the same thread. (Expected Looper " + b2 + " called on " + Looper.myLooper() + ", FYI main Looper is " + Looper.getMainLooper() + ")");
    }

    public static WebViewProviderBoundaryInterface d(WebView webView) {
        return f().createWebView(webView);
    }

    public static PackageInfo e() {
        if (Build.VERSION.SDK_INT >= 26) {
            return u4.d.a();
        }
        try {
            return g();
        } catch (ClassNotFoundException | IllegalAccessException | InvocationTargetException | NoSuchMethodException unused) {
            return null;
        }
    }

    public static B f() {
        return z.d();
    }

    public static PackageInfo g() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", (Class[]) null).invoke((Object) null, (Object[]) null);
    }

    public static A h(WebView webView) {
        if (!y.w0.c()) {
            return new A(d(webView));
        }
        WeakHashMap weakHashMap = c;
        A a2 = (A) weakHashMap.get(webView);
        if (a2 != null) {
            return a2;
        }
        A a3 = new A(d(webView));
        weakHashMap.put(webView, a3);
        return a3;
    }

    public static String i() {
        if (y.Y.c()) {
            return f().getStatics().getVariationsHeader();
        }
        throw y.a();
    }

    public static WebViewClient j(WebView webView) {
        a.e eVar = y.H;
        if (eVar.b()) {
            return u4.d.b(webView);
        }
        if (!eVar.c()) {
            throw y.a();
        }
        c(webView);
        return h(webView).c();
    }

    public static boolean k() {
        if (y.S.c()) {
            return f().getStatics().isMultiProcessEnabled();
        }
        throw y.a();
    }

    public static void l(WebView webView, String str) {
        if (!y.V.c()) {
            throw y.a();
        }
        h(webView).d(str);
    }

    public static void m(WebView webView, boolean z) {
        if (!y.h0.c()) {
            throw y.a();
        }
        h(webView).e(z);
    }

    public static void n(WebView webView, String str) {
        if (!y.e0.c()) {
            throw y.a();
        }
        h(webView).f(str);
    }
}
