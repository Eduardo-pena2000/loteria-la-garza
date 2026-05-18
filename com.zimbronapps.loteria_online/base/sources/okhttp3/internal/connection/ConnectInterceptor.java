package okhttp3.internal.connection;

import kotlin.jvm.internal.t;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class ConnectInterceptor implements Interceptor {
    public static final ConnectInterceptor a = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    public Response a(Interceptor.Chain chain) {
        t.g(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        return RealInterceptorChain.c(realInterceptorChain, 0, realInterceptorChain.d().q(realInterceptorChain), null, 0, 0, 0, 61, null).a(realInterceptorChain.h());
    }
}
