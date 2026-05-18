package s6;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.auth_blockstore.zzab;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import r6.h;
import s6.a;
import s6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class f extends com.google.android.gms.common.api.g implements h {
    public static final b a = new b(null);
    public static final a.g b;
    public static final a c;
    public static final com.google.android.gms.common.api.a d;

    public static final class a extends a.a {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g buildClient(Context context, Looper looper, com.google.android.gms.common.internal.f fVar, a.d.b bVar, com.google.android.gms.common.api.internal.f fVar2, o oVar) {
            t.g(context, "context");
            t.g(looper, "looper");
            t.g(fVar, "commonSettings");
            t.g(bVar, "apiOptions");
            t.g(fVar2, "connectedListener");
            t.g(oVar, "connectionFailedListener");
            return new g(context, looper, fVar, fVar2, oVar);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(k kVar) {
            this();
        }
    }

    public static final class c extends a.a {
        public final /* synthetic */ TaskCompletionSource a;

        public c(TaskCompletionSource taskCompletionSource) {
            this.a = taskCompletionSource;
        }

        public void i1(Status status, boolean z) {
            t.g(status, "status");
            x.b(status, Boolean.valueOf(z), this.a);
        }
    }

    public static final class d extends b.a {
        public final /* synthetic */ TaskCompletionSource a;

        public d(TaskCompletionSource taskCompletionSource) {
            this.a = taskCompletionSource;
        }

        public void U0(Status status, r6.e eVar) {
            t.g(status, "status");
            t.g(eVar, "response");
            x.b(status, eVar, this.a);
        }
    }

    static {
        a.g gVar = new a.g();
        b = gVar;
        a aVar = new a();
        c = aVar;
        d = new com.google.android.gms.common.api.a("RestoreCredential.API", aVar, gVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context, d, a.d.Q8, g.a.c);
        t.g(context, "context");
    }

    public static /* synthetic */ void g(r6.c cVar, g gVar, TaskCompletionSource taskCompletionSource) {
        j(cVar, gVar, taskCompletionSource);
    }

    public static /* synthetic */ void h(r6.a aVar, g gVar, TaskCompletionSource taskCompletionSource) {
        i(aVar, gVar, taskCompletionSource);
    }

    public static final void i(r6.a aVar, g gVar, TaskCompletionSource taskCompletionSource) {
        t.g(aVar, "$request");
        ((s6.c) gVar.getService()).Z(aVar, new c(taskCompletionSource));
    }

    public static final void j(r6.c cVar, g gVar, TaskCompletionSource taskCompletionSource) {
        t.g(cVar, "$request");
        ((s6.c) gVar.getService()).x0(cVar, new d(taskCompletionSource));
    }

    public Task c(r6.a aVar) {
        t.g(aVar, "request");
        Task doRead = doRead(w.builder().d(zzab.zzi).b(new s6.d(aVar)).e(1694).a());
        t.f(doRead, "doRead(...)");
        return doRead;
    }

    public Task d(r6.c cVar) {
        t.g(cVar, "request");
        Task doRead = doRead(w.builder().d(zzab.zzk).b(new e(cVar)).e(1695).a());
        t.f(doRead, "doRead(...)");
        return doRead;
    }
}
