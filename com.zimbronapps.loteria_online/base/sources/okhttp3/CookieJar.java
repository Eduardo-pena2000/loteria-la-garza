package okhttp3;

import Da.v;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface CookieJar {
    public static final Companion a = Companion.a;
    public static final CookieJar b = new Companion.NoCookies();

    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public static final class NoCookies implements CookieJar {
            public List a(HttpUrl url) {
                t.g(url, "url");
                return v.n();
            }

            public void b(HttpUrl url, List cookies) {
                t.g(url, "url");
                t.g(cookies, "cookies");
            }
        }

        private Companion() {
        }
    }

    List a(HttpUrl httpUrl);

    void b(HttpUrl httpUrl, List list);
}
