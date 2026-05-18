package h2;

import Ca.I;
import Y1.J;
import Y1.K;
import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import e2.b;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class l extends e2.b {
    public final Context g;

    public static final class a extends u implements Qa.l {
        public final /* synthetic */ CancellationSignal b;
        public final /* synthetic */ Executor c;
        public final /* synthetic */ Y1.g d;

        public static final class a extends u implements Qa.a {
            public final /* synthetic */ Executor a;
            public final /* synthetic */ Y1.g b;
            public final /* synthetic */ K c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Executor executor, Y1.g gVar, K k) {
                super(0);
                this.a = executor;
                this.b = gVar;
                this.c = k;
            }

            public static /* synthetic */ void a(Y1.g gVar, K k) {
                b(gVar, k);
            }

            public static final void b(Y1.g gVar, K k) {
                gVar.onResult(k);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                this.a.execute(new k(this.b, this.c));
            }
        }

        public static final class b extends u implements Qa.a {
            public final /* synthetic */ Executor a;
            public final /* synthetic */ Y1.g b;
            public final /* synthetic */ Exception c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Executor executor, Y1.g gVar, Exception exc) {
                super(0);
                this.a = executor;
                this.b = gVar;
                this.c = exc;
            }

            public static /* synthetic */ void a(Y1.g gVar, Exception exc) {
                b(gVar, exc);
            }

            private static final void b(Y1.g gVar, Exception exc) {
                gVar.a(exc instanceof Z1.m ? (Z1.h) exc : new Z1.k(exc.getMessage()));
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                this.a.execute(new m(this.b, this.c));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CancellationSignal cancellationSignal, Executor executor, Y1.g gVar) {
            super(1);
            this.b = cancellationSignal;
            this.c = executor;
            this.d = gVar;
        }

        public final void a(r6.e eVar) {
            try {
                l lVar = l.this;
                t.d(eVar);
                K l = lVar.l(eVar);
                b.a aVar = e2.b.f;
                l.j(this.b, new a(this.c, this.d, l));
            } catch (Exception e) {
                b.a aVar2 = e2.b.f;
                l.j(this.b, new b(this.c, this.d, e));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r6.e) obj);
            return I.a;
        }
    }

    public static final class b extends u implements Qa.a {
        public final /* synthetic */ Executor a;
        public final /* synthetic */ Y1.g b;
        public final /* synthetic */ O c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Executor executor, Y1.g gVar, O o) {
            super(0);
            this.a = executor;
            this.b = gVar;
            this.c = o;
        }

        public static /* synthetic */ void a(Y1.g gVar, O o) {
            b(gVar, o);
        }

        private static final void b(Y1.g gVar, O o) {
            gVar.a(o.a);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.a.execute(new n(this.b, this.c));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        t.g(context, "context");
        this.g = context;
    }

    public static /* synthetic */ void h(CancellationSignal cancellationSignal, Executor executor, Y1.g gVar, Exception exc) {
        o(cancellationSignal, executor, gVar, exc);
    }

    public static /* synthetic */ void i(Qa.l lVar, Object obj) {
        n(lVar, obj);
    }

    public static final /* synthetic */ void j(CancellationSignal cancellationSignal, Qa.a aVar) {
        e2.b.e(cancellationSignal, aVar);
    }

    private static final void n(Qa.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    private static final void o(CancellationSignal cancellationSignal, Executor executor, Y1.g gVar, Exception exc) {
        t.g(exc, "e");
        O o = new O();
        o.a = new Z1.k("Get restore credential failed for unknown reason, failure: " + exc.getMessage());
        if (exc instanceof com.google.android.gms.common.api.b) {
            com.google.android.gms.common.api.b bVar = (com.google.android.gms.common.api.b) exc;
            if (bVar.getStatusCode() == 40201) {
                o.a = new Z1.k("The restore credential internal service had a failure, failure: " + exc.getMessage());
            } else {
                o.a = new Z1.k("The restore credential service failed with unsupported status code, failure: " + exc.getMessage() + ", status code: " + bVar.getStatusCode());
            }
        }
        e2.b.e(cancellationSignal, new b(executor, gVar, o));
    }

    public r6.c k(J j) {
        t.g(j, "request");
        for (Y1.i iVar : j.a()) {
        }
        t.v("credentialOption");
        throw null;
    }

    public K l(r6.e eVar) {
        t.g(eVar, "response");
        return new K(Y1.e.c.b("androidx.credentials.TYPE_RESTORE_CREDENTIAL", eVar.M1()));
    }

    public void m(J j, Y1.g gVar, Executor executor, CancellationSignal cancellationSignal) {
        t.g(j, "request");
        t.g(gVar, "callback");
        t.g(executor, "executor");
        if (CredentialProviderPlayServicesImpl.Companion.a(cancellationSignal)) {
            return;
        }
        r6.g.a(this.g).d(k(j)).addOnSuccessListener(new i(new a(cancellationSignal, executor, gVar))).addOnFailureListener(new j(cancellationSignal, executor, gVar));
    }
}
