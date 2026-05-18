package e2;

import Ca.I;
import Qa.l;
import Qa.p;
import Y1.g;
import Z1.f;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class b extends e2.a {
    public static final a f = new a(null);
    public final Context e;

    public static final class a {

        public static final class a extends u implements Qa.a {
            public final /* synthetic */ l a;
            public final /* synthetic */ O b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, O o) {
                super(0);
                this.a = lVar;
                this.b = o;
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                this.a.invoke(this.b.a);
            }
        }

        public /* synthetic */ a(k kVar) {
            this();
        }

        public final void a(CancellationSignal cancellationSignal, Qa.a aVar) {
            t.g(aVar, "onResultOrException");
            if (CredentialProviderPlayServicesImpl.Companion.a(cancellationSignal)) {
                return;
            }
            aVar.invoke();
        }

        public final String b() {
            return "activity is cancelled by the user.";
        }

        public final String c(int i) {
            return "activity with result code: " + i + " indicating not RESULT_OK";
        }

        public final boolean d(int i, p pVar, l lVar, CancellationSignal cancellationSignal) {
            t.g(pVar, "cancelOnError");
            t.g(lVar, "onError");
            if (i == -1) {
                return false;
            }
            O o = new O();
            o.a = new Z1.k(c(i));
            if (i == 0) {
                o.a = new f(b());
            }
            pVar.invoke(cancellationSignal, new a(lVar, o));
            return true;
        }

        public a() {
        }
    }

    public static final class b extends u implements Qa.a {
        public final /* synthetic */ Executor a;
        public final /* synthetic */ g b;
        public final /* synthetic */ Object c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Executor executor, g gVar, Object obj) {
            super(0);
            this.a = executor;
            this.b = gVar;
            this.c = obj;
        }

        public static /* synthetic */ void a(g gVar, Object obj) {
            b(gVar, obj);
        }

        public static final void b(g gVar, Object obj) {
            gVar.a(obj);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.a.execute(new c(this.b, this.c));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        t.g(context, "context");
        this.e = context;
    }

    public static final void e(CancellationSignal cancellationSignal, Qa.a aVar) {
        f.a(cancellationSignal, aVar);
    }

    public static final boolean g(int i, p pVar, l lVar, CancellationSignal cancellationSignal) {
        return f.d(i, pVar, lVar, cancellationSignal);
    }

    public final boolean f(Bundle bundle, p pVar, Executor executor, g gVar, CancellationSignal cancellationSignal) {
        t.g(bundle, "resultData");
        t.g(pVar, "conversionFn");
        t.g(executor, "executor");
        t.g(gVar, "callback");
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        e(cancellationSignal, new b(executor, gVar, pVar.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE"))));
        return true;
    }
}
