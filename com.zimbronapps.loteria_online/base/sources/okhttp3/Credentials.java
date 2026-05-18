package okhttp3;

import java.nio.charset.Charset;
import kotlin.jvm.internal.t;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Credentials {
    public static final Credentials a = new Credentials();

    private Credentials() {
    }

    public static final String a(String username, String password, Charset charset) {
        t.g(username, "username");
        t.g(password, "password");
        t.g(charset, "charset");
        return t.o("Basic ", h.d.c(username + ':' + password, charset).a());
    }
}
