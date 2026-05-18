package mb;

import Ca.I;
import Ca.s;
import Ca.t;
import Ga.e;
import Ha.c;
import Ia.h;
import Qa.l;
import cb.n;
import cb.p;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class b {

    public static final class a implements OnCompleteListener {
        public final /* synthetic */ n a;

        public a(n nVar) {
            this.a = nVar;
        }

        public final void onComplete(Task task) {
            Exception exception = task.getException();
            if (exception != null) {
                n nVar = this.a;
                s.a aVar = s.b;
                nVar.resumeWith(s.b(t.a(exception)));
            } else {
                if (task.isCanceled()) {
                    n.a.a(this.a, null, 1, null);
                    return;
                }
                n nVar2 = this.a;
                s.a aVar2 = s.b;
                nVar2.resumeWith(s.b(task.getResult()));
            }
        }
    }

    public static final class b implements l {
        public final /* synthetic */ CancellationTokenSource a;

        public b(CancellationTokenSource cancellationTokenSource) {
            this.a = cancellationTokenSource;
        }

        public final void a(Throwable th) {
            this.a.cancel();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return I.a;
        }
    }

    public static final Object a(Task task, e eVar) {
        return b(task, null, eVar);
    }

    public static final Object b(Task task, CancellationTokenSource cancellationTokenSource, e eVar) {
        if (!task.isComplete()) {
            p pVar = new p(Ha.b.c(eVar), 1);
            pVar.E();
            task.addOnCompleteListener(mb.a.a, new a(pVar));
            if (cancellationTokenSource != null) {
                pVar.z(new b(cancellationTokenSource));
            }
            Object w = pVar.w();
            if (w == c.f()) {
                h.c(eVar);
            }
            return w;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }
}
