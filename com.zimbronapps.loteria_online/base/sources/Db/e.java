package db;

import Ca.I;
import Ga.i;
import android.os.Handler;
import android.os.Looper;
import cb.E0;
import cb.O0;
import cb.Y;
import cb.e0;
import cb.g0;
import cb.n;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class e extends f implements Y {
    public final Handler b;
    public final String c;
    public final boolean d;
    public final e e;

    public static final class a implements Runnable {
        public final /* synthetic */ n a;
        public final /* synthetic */ e b;

        public a(n nVar, e eVar) {
            this.a = nVar;
            this.b = eVar;
        }

        public final void run() {
            this.a.p(this.b, I.a);
        }
    }

    public e(Handler handler, String str, boolean z) {
        super(null);
        this.b = handler;
        this.c = str;
        this.d = z;
        this.e = z ? this : new e(handler, str, true);
    }

    public static /* synthetic */ void L(e eVar, Runnable runnable) {
        P(eVar, runnable);
    }

    public static /* synthetic */ I M(e eVar, Runnable runnable, Throwable th) {
        return R(eVar, runnable, th);
    }

    public static final void P(e eVar, Runnable runnable) {
        eVar.b.removeCallbacks(runnable);
    }

    public static final I R(e eVar, Runnable runnable, Throwable th) {
        eVar.b.removeCallbacks(runnable);
        return I.a;
    }

    public final void N(i iVar, Runnable runnable) {
        E0.c(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        e0.b().x(iVar, runnable);
    }

    /* renamed from: O, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public e J() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (eVar.b == this.b && eVar.d == this.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.b) ^ (this.d ? 1231 : 1237);
    }

    public void m(long j, n nVar) {
        a aVar = new a(nVar, this);
        if (this.b.postDelayed(aVar, Wa.n.j(j, 4611686018427387903L))) {
            nVar.z(new d(this, aVar));
        } else {
            N(nVar.getContext(), aVar);
        }
    }

    public String toString() {
        String G = G();
        if (G != null) {
            return G;
        }
        String str = this.c;
        if (str == null) {
            str = this.b.toString();
        }
        if (!this.d) {
            return str;
        }
        return str + ".immediate";
    }

    public g0 v(long j, Runnable runnable, i iVar) {
        if (this.b.postDelayed(runnable, Wa.n.j(j, 4611686018427387903L))) {
            return new c(this, runnable);
        }
        N(iVar, runnable);
        return O0.a;
    }

    public void x(i iVar, Runnable runnable) {
        if (this.b.post(runnable)) {
            return;
        }
        N(iVar, runnable);
    }

    public boolean z(i iVar) {
        return (this.d && t.c(Looper.myLooper(), this.b.getLooper())) ? false : true;
    }

    public /* synthetic */ e(Handler handler, String str, int i, k kVar) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public e(Handler handler, String str) {
        this(handler, str, false);
    }
}
