package l9;

import android.os.Handler;
import android.os.Looper;
import da.c;
import e9.f;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class e implements c.d {
    public c.b a;
    public f b = f.d;
    public final Handler c = new Handler(Looper.getMainLooper());

    public static /* synthetic */ void a(e eVar, Exception exc) {
        d(eVar, exc);
    }

    public static /* synthetic */ void b(e eVar, f fVar) {
        f(eVar, fVar);
    }

    public static final void d(e eVar, Exception exc) {
        c.b bVar = eVar.a;
        if (bVar != null) {
            bVar.b("-1", exc.getMessage(), exc);
        }
    }

    public static final void f(e eVar, f fVar) {
        c.b bVar = eVar.a;
        if (bVar != null) {
            bVar.a(Integer.valueOf(fVar.b()));
        }
    }

    public final void c(Exception exc) {
        t.g(exc, "ex");
        this.c.post(new d(this, exc));
    }

    public final void e(f fVar) {
        t.g(fVar, "state");
        if (this.b != fVar) {
            this.b = fVar;
            this.c.post(new c(this, fVar));
        }
    }

    public void i(Object obj) {
        this.a = null;
    }

    public void k(Object obj, c.b bVar) {
        this.a = bVar;
    }
}
