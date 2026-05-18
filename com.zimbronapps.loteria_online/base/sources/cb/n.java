package cb;

import Ga.i;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class N extends Ga.a {
    public static final a b = new a(null);
    public final String a;

    public static final class a implements i.c {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public N(String str) {
        super(b);
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof N) && kotlin.jvm.internal.t.c(this.a, ((N) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.a + ')';
    }

    public final String x() {
        return this.a;
    }
}
