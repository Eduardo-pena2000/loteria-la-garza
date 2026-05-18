package okhttp3;

import kotlin.jvm.internal.t;
import okhttp3.internal.authenticator.JavaNetAuthenticator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Authenticator {
    public static final Companion a = Companion.a;
    public static final Authenticator b = new Companion.AuthenticatorNone();
    public static final Authenticator c = new JavaNetAuthenticator(null, 1, null);

    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public static final class AuthenticatorNone implements Authenticator {
            public Request a(Route route, Response response) {
                t.g(response, "response");
                return null;
            }
        }

        private Companion() {
        }
    }

    Request a(Route route, Response response);
}
