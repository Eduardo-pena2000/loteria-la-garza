package okhttp3.internal.tls;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import okhttp3.internal.platform.Platform;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class CertificateChainCleaner {
    public static final Companion a = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final CertificateChainCleaner a(X509TrustManager trustManager) {
            t.g(trustManager, "trustManager");
            return Platform.a.g().c(trustManager);
        }

        private Companion() {
        }
    }

    public abstract List a(List list, String str);
}
