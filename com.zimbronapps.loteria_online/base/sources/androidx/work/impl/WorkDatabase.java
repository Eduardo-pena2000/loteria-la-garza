package androidx.work.impl;

import H4.h;
import P4.k;
import P4.n;
import P4.q;
import P4.t;
import android.content.Context;
import androidx.work.impl.a;
import g4.d;
import g4.e;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class WorkDatabase extends e {
    public static final long l = TimeUnit.DAYS.toMillis(1);

    public class a implements c.c {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        public c a(c.b bVar) {
            c.b.a a = c.b.a(this.a);
            a.c(bVar.b).b(bVar.c).d(true);
            return new n4.c().a(a.a());
        }
    }

    public class b extends e.b {
        public void c(m4.b bVar) {
            super.c(bVar);
            bVar.i();
            try {
                bVar.p(WorkDatabase.w());
                bVar.I();
            } finally {
                bVar.U();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z) {
        e.a a2;
        if (z) {
            a2 = d.c(context, WorkDatabase.class).c();
        } else {
            a2 = d.a(context, WorkDatabase.class, h.d());
            a2.f(new a(context));
        }
        return (WorkDatabase) a2.g(executor).a(u()).b(androidx.work.impl.a.a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.b).b(androidx.work.impl.a.c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.d).b(androidx.work.impl.a.e).b(androidx.work.impl.a.f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.g).e().d();
    }

    public static e.b u() {
        return new b();
    }

    public static long v() {
        return System.currentTimeMillis() - l;
    }

    public static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract n A();

    public abstract q B();

    public abstract t C();

    public abstract P4.b t();

    public abstract P4.e x();

    public abstract P4.h y();

    public abstract k z();
}
