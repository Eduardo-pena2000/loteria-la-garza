package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.C;
import com.google.android.gms.common.api.internal.L;
import com.google.android.gms.common.api.internal.Q;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class g {
    protected final com.google.android.gms.common.api.internal.g zaa;
    private final Context zab;
    private final String zac;
    private final com.google.android.gms.common.api.a zad;
    private final a.d zae;
    private final com.google.android.gms.common.api.internal.b zaf;
    private final Looper zag;
    private final int zah;
    private final h zai;
    private final com.google.android.gms.common.api.internal.u zaj;

    public static class a {
        public static final a c = new a().a();
        public final com.google.android.gms.common.api.internal.u a;
        public final Looper b;

        public static class a {
            public com.google.android.gms.common.api.internal.u a;
            public Looper b;

            public a a() {
                if (this.a == null) {
                    this.a = new com.google.android.gms.common.api.internal.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new a(this.a, null, this.b, null);
            }

            public a b(Looper looper) {
                com.google.android.gms.common.internal.t.m(looper, "Looper must not be null.");
                this.b = looper;
                return this;
            }

            public a c(com.google.android.gms.common.api.internal.u uVar) {
                com.google.android.gms.common.internal.t.m(uVar, "StatusExceptionMapper must not be null.");
                this.a = uVar;
                return this;
            }
        }

        public a(com.google.android.gms.common.api.internal.u uVar, Account account, Looper looper) {
            this.a = uVar;
            this.b = looper;
        }

        public /* synthetic */ a(com.google.android.gms.common.api.internal.u uVar, Account account, Looper looper, t tVar) {
            this(uVar, null, looper);
        }
    }

    public g(Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        this(activity, activity, aVar, dVar, aVar2);
    }

    public h asGoogleApiClient() {
        return this.zai;
    }

    public f.a createClientSettingsBuilder() {
        Set emptySet;
        GoogleSignInAccount g1;
        f.a aVar = new f.a();
        a.d dVar = this.zae;
        aVar.d((!(dVar instanceof a.d.a) || (g1 = ((a.d.a) dVar).g1()) == null) ? null : g1.N1());
        a.d dVar2 = this.zae;
        if (dVar2 instanceof a.d.a) {
            GoogleSignInAccount g12 = ((a.d.a) dVar2).g1();
            emptySet = g12 == null ? Collections.emptySet() : g12.S1();
        } else {
            emptySet = Collections.emptySet();
        }
        aVar.c(emptySet);
        aVar.e(this.zab.getClass().getName());
        aVar.b(this.zab.getPackageName());
        return aVar;
    }

    public Task disconnectService() {
        return this.zaa.w(this);
    }

    public com.google.android.gms.common.api.internal.d doBestEffortWrite(com.google.android.gms.common.api.internal.d dVar) {
        e(2, dVar);
        return dVar;
    }

    public com.google.android.gms.common.api.internal.d doRead(com.google.android.gms.common.api.internal.d dVar) {
        e(0, dVar);
        return dVar;
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public Task doRegisterEventListener(com.google.android.gms.common.api.internal.p pVar, com.google.android.gms.common.api.internal.y yVar) {
        com.google.android.gms.common.internal.t.l(pVar);
        com.google.android.gms.common.internal.t.l(yVar);
        com.google.android.gms.common.internal.t.m(pVar.getListenerKey(), "Listener has already been released.");
        com.google.android.gms.common.internal.t.m(yVar.getListenerKey(), "Listener has already been released.");
        com.google.android.gms.common.internal.t.b(com.google.android.gms.common.internal.r.b(pVar.getListenerKey(), yVar.getListenerKey()), "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
        return this.zaa.x(this, pVar, yVar, s.a);
    }

    @ResultIgnorabilityUnspecified
    public Task doUnregisterEventListener(l.a aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public com.google.android.gms.common.api.internal.d doWrite(com.google.android.gms.common.api.internal.d dVar) {
        e(1, dVar);
        return dVar;
    }

    public final com.google.android.gms.common.api.internal.d e(int i, com.google.android.gms.common.api.internal.d dVar) {
        dVar.zak();
        this.zaa.D(this, i, dVar);
        return dVar;
    }

    public final Task f(int i, com.google.android.gms.common.api.internal.w wVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.E(this, i, wVar, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final com.google.android.gms.common.api.internal.b getApiKey() {
        return this.zaf;
    }

    public a.d getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public com.google.android.gms.common.api.internal.l registerListener(Object obj, String str) {
        return com.google.android.gms.common.api.internal.m.a(obj, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f zab(Looper looper, L l) {
        com.google.android.gms.common.internal.f a2 = createClientSettingsBuilder().a();
        a.f buildClient = ((a.a) com.google.android.gms.common.internal.t.l(this.zad.a())).buildClient(this.zab, looper, a2, (Object) this.zae, (h.b) l, (h.c) l);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof com.google.android.gms.common.internal.d)) {
            ((com.google.android.gms.common.internal.d) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(buildClient instanceof com.google.android.gms.common.api.internal.n)) {
            return buildClient;
        }
        android.support.v4.media.session.b.a(buildClient);
        throw null;
    }

    public final e0 zac(Context context, Handler handler) {
        return new e0(context, handler, createClientSettingsBuilder().a());
    }

    public g(Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, com.google.android.gms.common.api.internal.u uVar) {
        a.a aVar2 = new a.a();
        aVar2.c(uVar);
        aVar2.b(activity.getMainLooper());
        this(activity, aVar, dVar, aVar2.a());
    }

    @ResultIgnorabilityUnspecified
    public Task doBestEffortWrite(com.google.android.gms.common.api.internal.w wVar) {
        return f(2, wVar);
    }

    @ResultIgnorabilityUnspecified
    public Task doRead(com.google.android.gms.common.api.internal.w wVar) {
        return f(0, wVar);
    }

    @ResultIgnorabilityUnspecified
    public Task doUnregisterEventListener(l.a aVar, int i) {
        com.google.android.gms.common.internal.t.m(aVar, "Listener key cannot be null.");
        return this.zaa.y(this, aVar, i);
    }

    @ResultIgnorabilityUnspecified
    public Task doWrite(com.google.android.gms.common.api.internal.w wVar) {
        return f(1, wVar);
    }

    public g(Context context, Activity activity, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        String apiFallbackAttributionTag;
        com.google.android.gms.common.internal.t.m(context, "Null context is not permitted.");
        com.google.android.gms.common.internal.t.m(aVar, "Api must not be null.");
        com.google.android.gms.common.internal.t.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) com.google.android.gms.common.internal.t.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            apiFallbackAttributionTag = f.a(context);
        } else {
            apiFallbackAttributionTag = getApiFallbackAttributionTag(context);
        }
        this.zac = apiFallbackAttributionTag;
        this.zad = aVar;
        this.zae = dVar;
        this.zag = aVar2.b;
        com.google.android.gms.common.api.internal.b a2 = com.google.android.gms.common.api.internal.b.a(aVar, dVar, apiFallbackAttributionTag);
        this.zaf = a2;
        this.zai = new Q(this);
        com.google.android.gms.common.api.internal.g u = com.google.android.gms.common.api.internal.g.u(context2);
        this.zaa = u;
        this.zah = u.l();
        this.zaj = aVar2.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C.j(activity, u, a2);
        }
        u.I(this);
    }

    @ResultIgnorabilityUnspecified
    public Task doRegisterEventListener(com.google.android.gms.common.api.internal.q qVar) {
        com.google.android.gms.common.internal.t.l(qVar);
        throw null;
    }

    public g(Context context, com.google.android.gms.common.api.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }
}
