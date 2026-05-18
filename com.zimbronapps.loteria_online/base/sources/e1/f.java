package e1;

import Ca.s;
import Q1.l;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import cb.n;
import cb.p;
import d1.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class f implements c.a {
    public static final f a = new f();

    public static final class a extends l.c {
        public final /* synthetic */ n a;
        public final /* synthetic */ d1.c b;

        public a(n nVar, d1.c cVar) {
            this.a = nVar;
            this.b = cVar;
        }

        public void a(int i) {
            this.a.cancel(new IllegalStateException("Failed to load " + this.b + " (reason=" + i + ", " + e.b(i) + ')'));
        }

        public void b(Typeface typeface) {
            this.a.resumeWith(s.b(typeface));
        }
    }

    public static final /* synthetic */ Handler c(f fVar) {
        return fVar.d();
    }

    public Object a(Context context, d1.c cVar, Ga.e eVar) {
        return e(context, cVar, e1.a.a, eVar);
    }

    public Typeface b(Context context, d1.c cVar) {
        throw new IllegalStateException(("GoogleFont only support async loading: " + cVar).toString());
    }

    public final Handler d() {
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        return h.a.a(myLooper);
    }

    public final Object e(Context context, d1.c cVar, b bVar, Ga.e eVar) {
        if (!(cVar instanceof d)) {
            throw new IllegalArgumentException(("Only GoogleFontImpl supported (actual " + cVar + ')').toString());
        }
        d dVar = (d) cVar;
        Q1.e g = dVar.g();
        int i = dVar.i();
        p pVar = new p(Ha.b.c(eVar), 1);
        pVar.E();
        bVar.a(context, g, i, c(a), new a(pVar, cVar));
        Object w = pVar.w();
        if (w == Ha.c.f()) {
            Ia.h.c(eVar);
        }
        return w;
    }
}
