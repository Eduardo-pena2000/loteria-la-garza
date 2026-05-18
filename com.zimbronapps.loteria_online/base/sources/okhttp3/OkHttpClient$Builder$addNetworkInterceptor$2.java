package okhttp3;

import Qa.l;
import kotlin.jvm.internal.t;
import okhttp3.Interceptor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class OkHttpClient$Builder$addNetworkInterceptor$2 implements Interceptor {
    public final /* synthetic */ l a;

    public final Response a(Interceptor.Chain chain) {
        t.g(chain, "chain");
        return (Response) this.a.invoke(chain);
    }
}
