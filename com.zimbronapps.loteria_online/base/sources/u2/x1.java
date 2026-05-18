package U2;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x1 {
    public static final x1 d;
    public final String a;
    public final a b;
    public final Object c;

    public static final class a {
        public static final a b = new a(T2.f0.a());
        public final LogSessionId a;

        public a(LogSessionId logSessionId) {
            this.a = logSessionId;
        }
    }

    static {
        d = P2.K.a < 31 ? new x1("") : new x1(a.b, "");
    }

    public x1(String str) {
        P2.a.f(P2.K.a < 31);
        this.a = str;
        this.b = null;
        this.c = new Object();
    }

    public LogSessionId a() {
        return ((a) P2.a.e(this.b)).a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return Objects.equals(this.a, x1Var.a) && Objects.equals(this.b, x1Var.b) && Objects.equals(this.c, x1Var.c);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b, this.c});
    }

    public x1(LogSessionId logSessionId, String str) {
        this(new a(logSessionId), str);
    }

    public x1(a aVar, String str) {
        this.b = aVar;
        this.a = str;
        this.c = new Object();
    }
}
