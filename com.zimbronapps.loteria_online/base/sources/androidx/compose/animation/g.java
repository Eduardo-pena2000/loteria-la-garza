package androidx.compose.animation;

import Da.S;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import y.C;
import y.G;
import y.i;
import y.q;
import y.r;
import y.y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {
    public static final a a = new a(null);
    public static final g b = new q(new G(null, null, null, null, false, null, 63, null));
    public static final g c = new q(new G(null, null, null, null, true, null, 47, null));

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final g a() {
            return g.a();
        }

        public a() {
        }
    }

    public /* synthetic */ g(k kVar) {
        this();
    }

    public static final /* synthetic */ g a() {
        return b;
    }

    public abstract G b();

    public final g c(g gVar) {
        r c2 = gVar.b().c();
        if (c2 == null) {
            c2 = b().c();
        }
        r rVar = c2;
        C f = gVar.b().f();
        if (f == null) {
            f = b().f();
        }
        C c3 = f;
        i a2 = gVar.b().a();
        if (a2 == null) {
            a2 = b().a();
        }
        i iVar = a2;
        y e = gVar.b().e();
        if (e == null) {
            e = b().e();
        }
        return new q(new G(rVar, c3, iVar, e, gVar.b().d() || b().d(), S.r(b().b(), gVar.b().b())));
    }

    public boolean equals(Object obj) {
        return (obj instanceof g) && t.c(((g) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (t.c(this, b)) {
            return "ExitTransition.None";
        }
        if (t.c(this, c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        G b2 = b();
        StringBuilder sb = new StringBuilder();
        sb.append("ExitTransition: \nFade - ");
        r c2 = b2.c();
        sb.append(c2 != null ? c2.toString() : null);
        sb.append(",\nSlide - ");
        C f = b2.f();
        sb.append(f != null ? f.toString() : null);
        sb.append(",\nShrink - ");
        i a2 = b2.a();
        sb.append(a2 != null ? a2.toString() : null);
        sb.append(",\nScale - ");
        y e = b2.e();
        sb.append(e != null ? e.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(b2.d());
        return sb.toString();
    }

    public g() {
    }
}
