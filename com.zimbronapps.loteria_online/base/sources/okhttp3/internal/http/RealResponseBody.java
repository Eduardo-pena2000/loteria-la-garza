package okhttp3.internal.http;

import kotlin.jvm.internal.t;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import xb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class RealResponseBody extends ResponseBody {
    public final String b;
    public final long c;
    public final g d;

    public RealResponseBody(String str, long j, g source) {
        t.g(source, "source");
        this.b = str;
        this.c = j;
        this.d = source;
    }

    public long b() {
        return this.c;
    }

    public MediaType c() {
        String str = this.b;
        if (str == null) {
            return null;
        }
        return MediaType.e.b(str);
    }

    public g d() {
        return this.d;
    }
}
