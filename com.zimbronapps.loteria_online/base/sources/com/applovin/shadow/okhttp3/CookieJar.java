package com.applovin.shadow.okhttp3;

import Da.v;
import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface CookieJar {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public static final class NoCookies implements CookieJar {
            public List loadForRequest(HttpUrl httpUrl) {
                t.g(httpUrl, "url");
                return v.n();
            }

            public void saveFromResponse(HttpUrl httpUrl, List list) {
                t.g(httpUrl, "url");
                t.g(list, "cookies");
            }
        }

        private Companion() {
        }
    }

    List loadForRequest(HttpUrl httpUrl);

    void saveFromResponse(HttpUrl httpUrl, List list);
}
