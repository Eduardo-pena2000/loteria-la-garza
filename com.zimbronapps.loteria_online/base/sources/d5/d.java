package d5;

import okhttp3.Response;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d extends RuntimeException {
    public final Response a;

    public d(Response response) {
        super("HTTP " + response.f() + ": " + response.t());
        this.a = response;
    }
}
