package androidx.compose.animation;

import Da.S;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import y.C;
import y.G;
import y.i;
import y.p;
import y.r;
import y.y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class f {
    public static final a a = new a(null);
    public static final f b = new p(new G(null, null, null, null, false, null, 63, null));

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final f a() {
            return f.a();
        }

        public a() {
        }
    }

    public /* synthetic */ f(k kVar) {
        this();
    }

    public static final /* synthetic */ f a() {
        return b;
    }

    public abstract G b();

    public final f c(f fVar) {
        r c = fVar.b().c();
        if (c == null) {
            c = b().c();
        }
        r rVar = c;
        C f = fVar.b().f();
        if (f == null) {
            f = b().f();
        }
        C c2 = f;
        i a2 = fVar.b().a();
        if (a2 == null) {
            a2 = b().a();
        }
        i iVar = a2;
        y e = fVar.b().e();
        if (e == null) {
            e = b().e();
        }
        return new p(new G(rVar, c2, iVar, e, false, S.r(b().b(), fVar.b().b()), 16, null));
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && t.c(((f) obj).b(), b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        if (t.c(this, b)) {
            return "EnterTransition.None";
        }
        G b2 = b();
        StringBuilder sb = new StringBuilder();
        sb.append("EnterTransition: \nFade - ");
        r c = b2.c();
        sb.append(c != null ? c.toString() : null);
        sb.append(",\nSlide - ");
        C f = b2.f();
        sb.append(f != null ? f.toString() : null);
        sb.append(",\nShrink - ");
        i a2 = b2.a();
        sb.append(a2 != null ? a2.toString() : null);
        sb.append(",\nScale - ");
        y e = b2.e();
        sb.append(e != null ? e.toString() : null);
        return sb.toString();
    }

    public f() {
    }
}
