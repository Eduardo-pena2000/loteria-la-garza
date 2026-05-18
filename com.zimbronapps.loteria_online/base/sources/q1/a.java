package Q1;

import Q1.i;
import Q1.l;
import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a {
    public final l.c a;
    public final Executor b;

    public class a implements Runnable {
        public final /* synthetic */ l.c a;
        public final /* synthetic */ Typeface b;

        public a(l.c cVar, Typeface typeface) {
            this.a = cVar;
            this.b = typeface;
        }

        public void run() {
            this.a.b(this.b);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ l.c a;
        public final /* synthetic */ int b;

        public b(l.c cVar, int i) {
            this.a = cVar;
            this.b = i;
        }

        public void run() {
            this.a.a(this.b);
        }
    }

    public a(l.c cVar, Executor executor) {
        this.a = cVar;
        this.b = executor;
    }

    public final void a(int i) {
        this.b.execute(new b(this.a, i));
    }

    public void b(i.e eVar) {
        if (eVar.a()) {
            c(eVar.a);
        } else {
            a(eVar.b);
        }
    }

    public final void c(Typeface typeface) {
        this.b.execute(new a(this.a, typeface));
    }
}
