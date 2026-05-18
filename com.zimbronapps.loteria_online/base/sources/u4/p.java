package u4;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import u4.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class p extends t4.c {
    public SafeBrowsingResponse a;
    public SafeBrowsingResponseBoundaryInterface b;

    public p(InvocationHandler invocationHandler) {
        this.b = (SafeBrowsingResponseBoundaryInterface) Lb.a.a(SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    public void a(boolean z) {
        a.f fVar = y.z;
        if (fVar.b()) {
            f.a(c(), z);
        } else {
            if (!fVar.c()) {
                throw y.a();
            }
            b().showInterstitial(z);
        }
    }

    public final SafeBrowsingResponseBoundaryInterface b() {
        if (this.b == null) {
            this.b = (SafeBrowsingResponseBoundaryInterface) Lb.a.a(SafeBrowsingResponseBoundaryInterface.class, z.c().b(this.a));
        }
        return this.b;
    }

    public final SafeBrowsingResponse c() {
        if (this.a == null) {
            this.a = z.c().a(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    public p(SafeBrowsingResponse safeBrowsingResponse) {
        this.a = safeBrowsingResponse;
    }
}
