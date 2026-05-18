package androidx.credentials.playservices;

import Ca.I;
import Qa.l;
import Y1.J;
import Y1.N;
import Y1.i;
import Y1.j;
import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class CredentialProviderPlayServicesImpl implements j {
    public static final a Companion = new a(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private v6.g googleApiAvailability;

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final boolean a(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i("PlayServicesImpl", "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i("PlayServicesImpl", "the flow has been canceled");
            return true;
        }

        public final void b(CancellationSignal cancellationSignal, Qa.a aVar) {
            t.g(aVar, "callback");
            if (a(cancellationSignal)) {
                return;
            }
            aVar.invoke();
        }

        public final boolean c(J j) {
            t.g(j, "request");
            for (i iVar : j.a()) {
            }
            return false;
        }

        public final boolean d(J j) {
            t.g(j, "request");
            for (i iVar : j.a()) {
            }
            return false;
        }

        public final boolean e(J j) {
            t.g(j, "request");
            Iterator it = j.a().iterator();
            while (it.hasNext()) {
                if (((i) it.next()) instanceof q7.b) {
                    return true;
                }
            }
            return false;
        }

        public a() {
        }
    }

    public static final class b extends u implements Qa.a {
        public final /* synthetic */ Executor a;
        public final /* synthetic */ Y1.g b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Executor executor, Y1.g gVar) {
            super(0);
            this.a = executor;
            this.b = gVar;
        }

        public static /* synthetic */ void a(Y1.g gVar) {
            b(gVar);
        }

        public static final void b(Y1.g gVar) {
            gVar.a(new Z1.b("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.a.execute(new d2.e(this.b));
        }
    }

    public static final class c extends u implements l {
        public final /* synthetic */ CancellationSignal a;
        public final /* synthetic */ Executor b;
        public final /* synthetic */ Y1.g c;

        public static final class a extends u implements Qa.a {
            public final /* synthetic */ Executor a;
            public final /* synthetic */ Y1.g b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Executor executor, Y1.g gVar) {
                super(0);
                this.a = executor;
                this.b = gVar;
            }

            public static /* synthetic */ void a(Y1.g gVar) {
                b(gVar);
            }

            private static final void b(Y1.g gVar) {
                gVar.onResult(null);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                Log.i("PlayServicesImpl", "Cleared restore credential successfully!");
                this.a.execute(new d2.f(this.b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CancellationSignal cancellationSignal, Executor executor, Y1.g gVar) {
            super(1);
            this.a = cancellationSignal;
            this.b = executor;
            this.c = gVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return I.a;
        }

        public final void invoke(Boolean bool) {
            CredentialProviderPlayServicesImpl.Companion.b(this.a, new a(this.b, this.c));
        }
    }

    public static final class d extends u implements Qa.a {
        public final /* synthetic */ Executor a;
        public final /* synthetic */ Y1.g b;
        public final /* synthetic */ O c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Executor executor, Y1.g gVar, O o) {
            super(0);
            this.a = executor;
            this.b = gVar;
            this.c = o;
        }

        public static /* synthetic */ void a(Y1.g gVar, O o) {
            b(gVar, o);
        }

        public static final void b(Y1.g gVar, O o) {
            gVar.a(o.a);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.a.execute(new d2.g(this.b, this.c));
        }
    }

    public static final class e extends u implements l {
        public final /* synthetic */ CancellationSignal a;
        public final /* synthetic */ Executor b;
        public final /* synthetic */ Y1.g c;

        public static final class a extends u implements Qa.a {
            public final /* synthetic */ Executor a;
            public final /* synthetic */ Y1.g b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Executor executor, Y1.g gVar) {
                super(0);
                this.a = executor;
                this.b = gVar;
            }

            public static /* synthetic */ void a(Y1.g gVar) {
                b(gVar);
            }

            private static final void b(Y1.g gVar) {
                gVar.onResult(null);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                invoke();
                return I.a;
            }

            public final void invoke() {
                Log.i("PlayServicesImpl", "During clear credential, signed out successfully!");
                this.a.execute(new d2.h(this.b));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(CancellationSignal cancellationSignal, Executor executor, Y1.g gVar) {
            super(1);
            this.a = cancellationSignal;
            this.b = executor;
            this.c = gVar;
        }

        public final void a(Void r5) {
            CredentialProviderPlayServicesImpl.Companion.b(this.a, new a(this.b, this.c));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Void) obj);
            return I.a;
        }
    }

    public static final class f extends u implements Qa.a {
        public final /* synthetic */ Exception a;
        public final /* synthetic */ Executor b;
        public final /* synthetic */ Y1.g c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Exception exc, Executor executor, Y1.g gVar) {
            super(0);
            this.a = exc;
            this.b = executor;
            this.c = gVar;
        }

        public static /* synthetic */ void a(Y1.g gVar, Exception exc) {
            b(gVar, exc);
        }

        public static final void b(Y1.g gVar, Exception exc) {
            gVar.a(new Z1.c(exc.getMessage()));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            Log.w("PlayServicesImpl", "During clear credential sign out failed with " + this.a);
            this.b.execute(new d2.i(this.c, this.a));
        }
    }

    public static final class g extends u implements Qa.a {
        public final /* synthetic */ Executor a;
        public final /* synthetic */ Y1.g b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Executor executor, Y1.g gVar) {
            super(0);
            this.a = executor;
            this.b = gVar;
        }

        public static /* synthetic */ void a(Y1.g gVar) {
            b(gVar);
        }

        private static final void b(Y1.g gVar) {
            gVar.a(new Z1.j("this device requires a Google Play Services update for the given feature to be supported"));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.a.execute(new d2.j(this.b));
        }
    }

    public static final class h extends u implements Qa.a {
        public final /* synthetic */ Executor a;
        public final /* synthetic */ Y1.g b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Executor executor, Y1.g gVar) {
            super(0);
            this.a = executor;
            this.b = gVar;
        }

        public static /* synthetic */ void a(Y1.g gVar) {
            b(gVar);
        }

        private static final void b(Y1.g gVar) {
            gVar.a(new Z1.j("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            invoke();
            return I.a;
        }

        public final void invoke() {
            this.a.execute(new d2.k(this.b));
        }
    }

    public static /* synthetic */ void $r8$lambda$Cl2BKCsAmVhsKuatXKmGSWVFLNg(CancellationSignal cancellationSignal, Executor executor, Y1.g gVar, Exception exc) {
        onClearCredential$lambda$1(cancellationSignal, executor, gVar, exc);
    }

    public static /* synthetic */ void $r8$lambda$EEPRZu6PiJcReImfv141-6oqzqk(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, Y1.g gVar, Exception exc) {
        onClearCredential$lambda$4(credentialProviderPlayServicesImpl, cancellationSignal, executor, gVar, exc);
    }

    public static /* synthetic */ void $r8$lambda$KkkjfkO_ppPgKkxx-IfBnKmqAeg(l lVar, Object obj) {
        onClearCredential$lambda$0(lVar, obj);
    }

    public static /* synthetic */ void $r8$lambda$wBiSTxUbOhG0ep8ucfM6ivfiSz8(l lVar, Object obj) {
        onClearCredential$lambda$2(lVar, obj);
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        t.g(context, "context");
        this.context = context;
        v6.g o = v6.g.o();
        t.f(o, "getInstance(...)");
        this.googleApiAvailability = o;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int i) {
        return this.googleApiAvailability.h(context, i);
    }

    private static final void onClearCredential$lambda$0(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    private static final void onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, Y1.g gVar, Exception exc) {
        t.g(exc, "e");
        Log.w("PlayServicesImpl", "Clearing restore credential failed", exc);
        O o = new O();
        o.a = new Z1.c("Clear restore credential failed for unknown reason.");
        if ((exc instanceof com.google.android.gms.common.api.b) && ((com.google.android.gms.common.api.b) exc).getStatusCode() == 40201) {
            o.a = new Z1.c("The restore credential internal service had a failure.");
        }
        Companion.b(cancellationSignal, new d(executor, gVar, o));
    }

    private static final void onClearCredential$lambda$2(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    private static final void onClearCredential$lambda$4(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, Y1.g gVar, Exception exc) {
        t.g(exc, "e");
        Companion.b(cancellationSignal, new f(exc, executor, gVar));
    }

    public final v6.g getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(230815045);
    }

    public void onClearCredential(Y1.a aVar, CancellationSignal cancellationSignal, Executor executor, Y1.g gVar) {
        t.g(aVar, "request");
        t.g(executor, "executor");
        t.g(gVar, "callback");
        a aVar2 = Companion;
        if (aVar2.a(cancellationSignal)) {
            return;
        }
        if (!t.c(aVar.b(), "androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            l6.i.d(this.context).signOut().addOnSuccessListener(new d2.c(new e(cancellationSignal, executor, gVar))).addOnFailureListener(new d2.d(this, cancellationSignal, executor, gVar));
        } else if (isAvailableOnDevice(242200000)) {
            r6.g.a(this.context).c(new r6.a(aVar.a())).addOnSuccessListener(new d2.a(new c(cancellationSignal, executor, gVar))).addOnFailureListener(new d2.b(cancellationSignal, executor, gVar));
        } else {
            aVar2.b(cancellationSignal, new b(executor, gVar));
        }
    }

    public void onCreateCredential(Context context, Y1.b bVar, CancellationSignal cancellationSignal, Executor executor, Y1.g gVar) {
        t.g(context, "context");
        t.g(bVar, "request");
        t.g(executor, "executor");
        t.g(gVar, "callback");
        if (!Companion.a(cancellationSignal)) {
            throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
        }
    }

    public /* bridge */ /* synthetic */ void onGetCredential(Context context, N n, CancellationSignal cancellationSignal, Executor executor, Y1.g gVar) {
        super.onGetCredential(context, n, cancellationSignal, executor, gVar);
    }

    public /* bridge */ /* synthetic */ void onPrepareCredential(J j, CancellationSignal cancellationSignal, Executor executor, Y1.g gVar) {
        super.onPrepareCredential(j, cancellationSignal, executor, gVar);
    }

    public final void setGoogleApiAvailability(v6.g gVar) {
        t.g(gVar, "<set-?>");
        this.googleApiAvailability = gVar;
    }

    public final boolean isAvailableOnDevice(int i) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i);
        boolean z = isGooglePlayServicesAvailable == 0;
        if (!z) {
            Log.w("PlayServicesImpl", "Connection with Google Play Services was not successful. Connection result is: " + new v6.b(isGooglePlayServicesAvailable));
        }
        return z;
    }

    public void onGetCredential(Context context, J j, CancellationSignal cancellationSignal, Executor executor, Y1.g gVar) {
        t.g(context, "context");
        t.g(j, "request");
        t.g(executor, "executor");
        t.g(gVar, "callback");
        a aVar = Companion;
        if (aVar.a(cancellationSignal)) {
            return;
        }
        if (aVar.c(j)) {
            if (isAvailableOnDevice(243100000)) {
                new h2.c(context).t(j, gVar, executor, cancellationSignal);
                return;
            } else {
                aVar.b(cancellationSignal, new g(executor, gVar));
                return;
            }
        }
        if (aVar.d(j)) {
            if (isAvailableOnDevice(242200000)) {
                new h2.l(context).m(j, gVar, executor, cancellationSignal);
                return;
            } else {
                aVar.b(cancellationSignal, new h(executor, gVar));
                return;
            }
        }
        if (aVar.e(j)) {
            new i2.a(context).q(j, gVar, executor, cancellationSignal);
        } else {
            new f2.b(context).q(j, gVar, executor, cancellationSignal);
        }
    }
}
