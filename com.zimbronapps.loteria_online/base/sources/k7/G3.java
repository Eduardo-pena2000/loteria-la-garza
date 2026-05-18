package k7;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class g3 extends FutureTask implements Comparable {
    public final long a;
    public final boolean b;
    public final String c;
    public final /* synthetic */ i3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(i3 i3Var, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        Objects.requireNonNull(i3Var);
        this.d = i3Var;
        com.google.android.gms.common.internal.t.l(str);
        long andIncrement = i3.E().getAndIncrement();
        this.a = andIncrement;
        this.c = str;
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            i3Var.a.a().o().a("Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        g3 g3Var = (g3) obj;
        boolean z = g3Var.b;
        boolean z2 = this.b;
        if (z2 == z) {
            long j = this.a;
            long j2 = g3Var.a;
            if (j < j2) {
                return -1;
            }
            if (j <= j2) {
                this.d.a.a().p().b("Two tasks share the same index. index", Long.valueOf(j));
                return 0;
            }
        } else if (z2) {
            return -1;
        }
        return 1;
    }

    public final void setException(Throwable th) {
        this.d.a.a().o().b(this.c, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(i3 i3Var, Callable callable, boolean z, String str) {
        super(callable);
        Objects.requireNonNull(i3Var);
        this.d = i3Var;
        com.google.android.gms.common.internal.t.l("Task exception on worker thread");
        long andIncrement = i3.E().getAndIncrement();
        this.a = andIncrement;
        this.c = "Task exception on worker thread";
        this.b = z;
        if (andIncrement == Long.MAX_VALUE) {
            i3Var.a.a().o().a("Tasks index overflow");
        }
    }
}
