package okhttp3.internal.platform.android;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.platform.Platform;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class StandardAndroidSocketAdapter extends AndroidSocketAdapter {
    public static final Companion j = new Companion(null);
    public final Class h;
    public final Class i;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ SocketAdapter b(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return companion.a(str);
        }

        public final SocketAdapter a(String packageName) {
            t.g(packageName, "packageName");
            try {
                Class cls = Class.forName(t.o(packageName, ".OpenSSLSocketImpl"));
                Class cls2 = Class.forName(t.o(packageName, ".OpenSSLSocketFactoryImpl"));
                Class paramsClass = Class.forName(t.o(packageName, ".SSLParametersImpl"));
                t.f(paramsClass, "paramsClass");
                return new StandardAndroidSocketAdapter(cls, cls2, paramsClass);
            } catch (Exception e) {
                Platform.a.g().k("unable to load android socket classes", 5, e);
                return null;
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandardAndroidSocketAdapter(Class sslSocketClass, Class sslSocketFactoryClass, Class paramClass) {
        super(sslSocketClass);
        t.g(sslSocketClass, "sslSocketClass");
        t.g(sslSocketFactoryClass, "sslSocketFactoryClass");
        t.g(paramClass, "paramClass");
        this.h = sslSocketFactoryClass;
        this.i = paramClass;
    }
}
