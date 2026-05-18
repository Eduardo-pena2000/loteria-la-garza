package Z0;

import Z0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b1 implements e.a {
    public final String a;

    public b1(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && kotlin.jvm.internal.t.c(this.a, ((b1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "UrlAnnotation(url=" + this.a + ')';
    }
}
