package okhttp3.internal.http2;

import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import xb.h;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Header {
    public static final Companion d = new Companion(null);
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    public static final h i;
    public static final h j;
    public final h a;
    public final h b;
    public final int c;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    static {
        h.a aVar = h.d;
        e = aVar.d(":");
        f = aVar.d(":status");
        g = aVar.d(":method");
        h = aVar.d(":path");
        i = aVar.d(":scheme");
        j = aVar.d(":authority");
    }

    public Header(h name, h value) {
        t.g(name, "name");
        t.g(value, "value");
        this.a = name;
        this.b = value;
        this.c = name.size() + 32 + value.size();
    }

    public final h a() {
        return this.a;
    }

    public final h b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return t.c(this.a, header.a) && t.c(this.b, header.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return this.a.H() + ": " + this.b.H();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Header(String name, String value) {
        t.g(name, "name");
        t.g(value, "value");
        h.a aVar = h.d;
        this(aVar.d(name), aVar.d(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Header(h name, String value) {
        this(name, h.d.d(value));
        t.g(name, "name");
        t.g(value, "value");
    }
}
