package u4;

import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class v extends t4.g {
    public WebResourceError a;
    public WebResourceErrorBoundaryInterface b;

    public v(InvocationHandler invocationHandler) {
        this.b = (WebResourceErrorBoundaryInterface) Lb.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    public CharSequence a() {
        return c().getDescription();
    }

    public int b() {
        return c().getErrorCode();
    }

    public final WebResourceError c() {
        if (this.a == null) {
            this.a = z.c().d(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    public v(WebResourceError webResourceError) {
        this.a = webResourceError;
    }
}
