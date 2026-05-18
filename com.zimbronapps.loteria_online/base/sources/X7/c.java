package x7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import s7.i;
import s7.m;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class c extends d {

    public static final class a implements Runnable {
        public final Future a;
        public final b b;

        public a(Future future, b bVar) {
            this.a = future;
            this.b = bVar;
        }

        public void run() {
            try {
                this.b.onSuccess(c.b(this.a));
            } catch (ExecutionException e) {
                this.b.a(e.getCause());
            } catch (Throwable th) {
                this.b.a(th);
            }
        }

        public String toString() {
            return i.a(this).c(this.b).toString();
        }
    }

    public static void a(e eVar, b bVar, Executor executor) {
        m.j(bVar);
        eVar.addListener(new a(eVar, bVar), executor);
    }

    public static Object b(Future future) {
        m.q(future.isDone(), "Future was expected to be done: %s", future);
        return g.a(future);
    }
}
