package i1;

import androidx.emoji2.text.c;
import b0.C0;
import b0.U1;
import b0.h2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o implements r {
    public h2 a;

    public static final class a extends c.f {
        public final /* synthetic */ C0 a;
        public final /* synthetic */ o b;

        public a(C0 c0, o oVar) {
            this.a = c0;
            this.b = oVar;
        }

        public void a(Throwable th) {
            o.b(this.b, s.a());
        }

        public void b() {
            this.a.setValue(Boolean.TRUE);
            o.b(this.b, new t(true));
        }
    }

    public o() {
        this.a = androidx.emoji2.text.c.k() ? c() : null;
    }

    public static final /* synthetic */ void b(o oVar, h2 h2Var) {
        oVar.a = h2Var;
    }

    public h2 a() {
        h2 h2Var = this.a;
        if (h2Var != null) {
            kotlin.jvm.internal.t.d(h2Var);
            return h2Var;
        }
        if (!androidx.emoji2.text.c.k()) {
            return s.a();
        }
        h2 c = c();
        this.a = c;
        kotlin.jvm.internal.t.d(c);
        return c;
    }

    public final h2 c() {
        androidx.emoji2.text.c c = androidx.emoji2.text.c.c();
        if (c.g() == 1) {
            return new t(true);
        }
        C0 i = U1.i(Boolean.FALSE, null, 2, null);
        c.v(new a(i, this));
        return i;
    }
}
