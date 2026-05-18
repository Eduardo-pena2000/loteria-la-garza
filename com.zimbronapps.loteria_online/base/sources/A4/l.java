package A4;

import T1.A0;
import android.graphics.Rect;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l {
    public final w4.b a;
    public final A0 b;

    public l(w4.b bVar, A0 a0) {
        t.g(bVar, "_bounds");
        t.g(a0, "_windowInsetsCompat");
        this.a = bVar;
        this.b = a0;
    }

    public final Rect a() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        l lVar = (l) obj;
        return t.c(this.a, lVar.a) && t.c(this.b, lVar.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "WindowMetrics( bounds=" + this.a + ", windowInsetsCompat=" + this.b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ l(Rect rect, A0 a0, int i, kotlin.jvm.internal.k kVar) {
        if ((i & 2) != 0) {
            a0 = new A0.a().a();
            t.f(a0, "Builder().build()");
        }
        this(rect, a0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(Rect rect, A0 a0) {
        this(new w4.b(rect), a0);
        t.g(rect, "bounds");
        t.g(a0, "insets");
    }
}
