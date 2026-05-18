package com.google.firebase.auth;

import J7.A;
import J7.D0;
import J7.E0;
import J7.F0;
import J7.G0;
import J7.I;
import J7.I0;
import J7.J0;
import J7.K0;
import J7.O;
import J7.P;
import J7.S;
import J7.W;
import J7.f0;
import K7.C;
import K7.K;
import K7.N;
import K7.Z;
import K7.d0;
import K7.e0;
import K7.i0;
import K7.j0;
import K7.o;
import K7.q0;
import K7.s0;
import K7.w;
import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.firebase-auth-api.zzac;
import com.google.android.gms.internal.firebase-auth-api.zzacq;
import com.google.android.gms.internal.firebase-auth-api.zzaen;
import com.google.android.gms.internal.firebase-auth-api.zzaeu;
import com.google.android.gms.internal.firebase-auth-api.zzafd;
import com.google.android.gms.internal.firebase-auth-api.zzagb;
import com.google.android.gms.internal.firebase-auth-api.zzagl;
import com.google.android.gms.internal.firebase-auth-api.zzahv;
import com.google.android.gms.internal.firebase-auth-api.zzaij;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.b;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class FirebaseAuth implements K7.a {
    public final Executor A;
    public String B;
    public final B7.g a;
    public final List b;
    public final List c;
    public final List d;
    public final zzacq e;
    public A f;
    public final K7.e g;
    public final Object h;
    public String i;
    public final Object j;
    public String k;
    public Z l;
    public final RecaptchaAction m;
    public final RecaptchaAction n;
    public final RecaptchaAction o;
    public final RecaptchaAction p;
    public final RecaptchaAction q;
    public final RecaptchaAction r;
    public final e0 s;
    public final j0 t;
    public final C u;
    public final l8.b v;
    public final l8.b w;
    public d0 x;
    public final Executor y;
    public final Executor z;

    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    public interface b {
        void a(FirebaseAuth firebaseAuth);
    }

    public class c implements s0 {
        public final /* synthetic */ FirebaseAuth a;

        public c(FirebaseAuth firebaseAuth) {
            Objects.requireNonNull(firebaseAuth);
            this.a = firebaseAuth;
        }

        public final void a(zzahv zzahvVar, A a) {
            t.l(zzahvVar);
            t.l(a);
            a.j2(zzahvVar);
            this.a.e0(a, zzahvVar, true);
        }
    }

    public class d implements w, s0 {
        public final /* synthetic */ FirebaseAuth a;

        public d(FirebaseAuth firebaseAuth) {
            Objects.requireNonNull(firebaseAuth);
            this.a = firebaseAuth;
        }

        public final void a(zzahv zzahvVar, A a) {
            t.l(zzahvVar);
            t.l(a);
            a.j2(zzahvVar);
            this.a.f0(a, zzahvVar, true, true);
        }

        public final void zza(Status status) {
            if (status.O1() == 17011 || status.O1() == 17021 || status.O1() == 17005 || status.O1() == 17091) {
                this.a.D();
            }
        }
    }

    public FirebaseAuth(B7.g gVar, l8.b bVar, l8.b bVar2, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService, Executor executor4) {
        this(gVar, new zzacq(gVar, executor2, scheduledExecutorService), new e0(gVar.m(), gVar.s()), j0.f(), C.a(), bVar, bVar2, executor, executor2, executor3, executor4);
    }

    public static d0 A0(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.x == null) {
            firebaseAuth.x = new d0((B7.g) t.l(firebaseAuth.a));
        }
        return firebaseAuth.x;
    }

    public static /* bridge */ /* synthetic */ B7.g I(FirebaseAuth firebaseAuth) {
        return firebaseAuth.a;
    }

    public static /* bridge */ /* synthetic */ b.b a0(FirebaseAuth firebaseAuth, String str, b.b bVar) {
        return firebaseAuth.c0(str, bVar);
    }

    public static void d0(B7.m mVar, com.google.firebase.auth.a aVar, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        aVar.k().execute(new D0(zzagb.zza(str, aVar.g(), null), mVar));
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) B7.g.o().k(FirebaseAuth.class);
    }

    public static void h0(FirebaseAuth firebaseAuth, A a2) {
        if (a2 != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + a2.b() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.A.execute(new m(firebaseAuth));
    }

    public static void i0(FirebaseAuth firebaseAuth, A a2, zzahv zzahvVar, boolean z, boolean z2) {
        boolean z3;
        t.l(a2);
        t.l(zzahvVar);
        boolean z4 = true;
        boolean z5 = firebaseAuth.f != null && a2.b().equals(firebaseAuth.f.b());
        if (z5 || !z2) {
            A a3 = firebaseAuth.f;
            if (a3 == null) {
                z3 = true;
            } else {
                boolean z6 = (z5 && a3.m2().zzc().equals(zzahvVar.zzc())) ? false : true;
                z3 = z5 ? false : true;
                z4 = z6;
            }
            t.l(a2);
            if (firebaseAuth.f == null || !a2.b().equals(firebaseAuth.o())) {
                firebaseAuth.f = a2;
            } else {
                firebaseAuth.f.i2(a2.Q1());
                if (!a2.S1()) {
                    firebaseAuth.f.k2();
                }
                List b2 = a2.P1().b();
                List o2 = a2.o2();
                firebaseAuth.f.n2(b2);
                firebaseAuth.f.l2(o2);
            }
            if (z) {
                firebaseAuth.s.j(firebaseAuth.f);
            }
            if (z4) {
                A a4 = firebaseAuth.f;
                if (a4 != null) {
                    a4.j2(zzahvVar);
                }
                p0(firebaseAuth, firebaseAuth.f);
            }
            if (z3) {
                h0(firebaseAuth, firebaseAuth.f);
            }
            if (z) {
                firebaseAuth.s.e(a2, zzahvVar);
            }
            A a5 = firebaseAuth.f;
            if (a5 != null) {
                A0(firebaseAuth).d(a5.m2());
            }
        }
    }

    public static void j0(com.google.firebase.auth.a aVar) {
        String f;
        String z;
        if (!aVar.o()) {
            FirebaseAuth c2 = aVar.c();
            String f2 = t.f(aVar.j());
            if (aVar.f() == null && zzagb.zza(f2, aVar.g(), aVar.a(), aVar.k())) {
                return;
            }
            c2.u.b(c2, f2, aVar.a(), c2.D0(), aVar.l(), aVar.n(), c2.p).addOnCompleteListener(new E0(c2, aVar, f2));
            return;
        }
        FirebaseAuth c3 = aVar.c();
        o oVar = (o) t.l(aVar.e());
        if (oVar.zzd()) {
            z = t.f(aVar.j());
            f = z;
        } else {
            S s = (S) t.l(aVar.h());
            f = t.f(s.b());
            z = s.z();
        }
        if (aVar.f() == null || !zzagb.zza(f, aVar.g(), aVar.a(), aVar.k())) {
            c3.u.b(c3, z, aVar.a(), c3.D0(), aVar.l(), aVar.n(), oVar.zzd() ? c3.q : c3.r).addOnCompleteListener(new f(c3, aVar, f));
        }
    }

    public static /* bridge */ /* synthetic */ A l0(FirebaseAuth firebaseAuth) {
        return firebaseAuth.f;
    }

    public static void p0(FirebaseAuth firebaseAuth, A a2) {
        if (a2 != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + a2.b() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.A.execute(new l(firebaseAuth, new q8.b(a2 != null ? a2.zzd() : null)));
    }

    public static /* bridge */ /* synthetic */ K7.e r0(FirebaseAuth firebaseAuth) {
        return firebaseAuth.g;
    }

    public static /* bridge */ /* synthetic */ String w0(FirebaseAuth firebaseAuth) {
        return firebaseAuth.i;
    }

    public static /* bridge */ /* synthetic */ String y0(FirebaseAuth firebaseAuth) {
        return firebaseAuth.k;
    }

    public Task A(String str) {
        t.f(str);
        return this.e.zza(this.a, str, this.k, new c(this));
    }

    public Task B(String str, String str2) {
        t.f(str);
        t.f(str2);
        return Z(str, str2, this.k, null, false);
    }

    public final Executor B0() {
        return this.z;
    }

    public Task C(String str, String str2) {
        return z(J7.k.b(str, str2));
    }

    public final void C0() {
        t.l(this.s);
        A a2 = this.f;
        if (a2 != null) {
            this.s.h(a2);
            this.f = null;
        }
        this.s.g();
        p0(this, null);
        h0(this, null);
    }

    public void D() {
        C0();
        d0 d0Var = this.x;
        if (d0Var != null) {
            d0Var.b();
        }
    }

    public final boolean D0() {
        return zzaeu.zza(i().m());
    }

    public Task E(Activity activity, J7.n nVar) {
        t.l(nVar);
        t.l(activity);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.t.c(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzaen.zza(new Status(17057)));
        }
        N.d(activity.getApplicationContext(), this);
        nVar.c(activity);
        return taskCompletionSource.getTask();
    }

    public void F() {
        synchronized (this.h) {
            this.i = zzafd.zza();
        }
    }

    public void G(String str, int i) {
        t.f(str);
        t.b(i >= 0 && i <= 65535, "Port number must be in the range 0-65535");
        zzagl.zza(this.a, str, i);
    }

    public Task H(String str) {
        t.f(str);
        return this.e.zzd(this.a, str, this.k);
    }

    public final Task J() {
        return this.e.zza();
    }

    public final Task K(J7.e eVar, String str) {
        t.f(str);
        if (this.i != null) {
            if (eVar == null) {
                eVar = J7.e.W1();
            }
            eVar.V1(this.i);
        }
        return this.e.zza(this.a, eVar, str);
    }

    public final Task L(J7.j jVar, A a2, boolean z) {
        return new com.google.firebase.auth.c(this, z, a2, jVar).c(this, this.k, this.m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [K7.i0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task M(A a2) {
        return R(a2, new d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [K7.i0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task N(A a2, J7.h hVar) {
        t.l(hVar);
        t.l(a2);
        return hVar instanceof J7.j ? new j(this, a2, (J7.j) hVar.O1()).c(this, a2.R1(), this.o, "EMAIL_PASSWORD_PROVIDER") : this.e.zza(this.a, a2, hVar.O1(), (String) null, (i0) new d(this));
    }

    public final Task O(A a2, I i, String str) {
        t.l(a2);
        t.l(i);
        return i instanceof P ? this.e.zza(this.a, (P) i, a2, str, new c(this)) : i instanceof W ? this.e.zza(this.a, (W) i, a2, str, this.k, new c(this)) : Tasks.forException(zzaen.zza(new Status(17499)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [K7.i0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task P(A a2, O o) {
        t.l(a2);
        t.l(o);
        return this.e.zza(this.a, a2, (O) o.O1(), (i0) new d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [K7.i0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task Q(A a2, J7.d0 d0Var) {
        t.l(a2);
        t.l(d0Var);
        return this.e.zza(this.a, a2, d0Var, (i0) new d(this));
    }

    public final Task R(A a2, i0 i0Var) {
        t.l(a2);
        return this.e.zza(this.a, a2, i0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [K7.i0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task S(A a2, String str) {
        t.l(a2);
        t.f(str);
        return this.e.zza(this.a, a2, str, this.k, (i0) new d(this)).continueWithTask(new I0(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [J7.K0, K7.i0] */
    public final Task T(A a2, boolean z) {
        if (a2 == null) {
            return Tasks.forException(zzaen.zza(new Status(17495)));
        }
        zzahv m2 = a2.m2();
        return (!m2.zzg() || z) ? this.e.zza(this.a, a2, m2.zzd(), (i0) new K0(this)) : Tasks.forResult(K.a(m2.zzc()));
    }

    public final Task U(I i, o oVar, A a2) {
        t.l(i);
        t.l(oVar);
        if (i instanceof P) {
            return this.e.zza(this.a, a2, (P) i, t.f(oVar.zzc()), new c(this));
        }
        if (i instanceof W) {
            return this.e.zza(this.a, a2, (W) i, t.f(oVar.zzc()), this.k, new c(this));
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    public final Task V(o oVar) {
        t.l(oVar);
        return this.e.zza(oVar, this.k).continueWithTask(new J0(this));
    }

    public final Task W(Activity activity, J7.n nVar, A a2) {
        t.l(activity);
        t.l(nVar);
        t.l(a2);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.t.d(activity, taskCompletionSource, this, a2)) {
            return Tasks.forException(zzaen.zza(new Status(17057)));
        }
        N.e(activity.getApplicationContext(), this, a2);
        nVar.a(activity);
        return taskCompletionSource.getTask();
    }

    public final Task X(String str) {
        return this.e.zza(this.k, str);
    }

    public final Task Y(String str, String str2, J7.e eVar) {
        t.f(str);
        t.f(str2);
        if (eVar == null) {
            eVar = J7.e.W1();
        }
        String str3 = this.i;
        if (str3 != null) {
            eVar.V1(str3);
        }
        return this.e.zza(str, str2, eVar);
    }

    public final Task Z(String str, String str2, String str3, A a2, boolean z) {
        return new n(this, str, z, a2, str2, str3).c(this, str3, this.n, "EMAIL_PASSWORD_PROVIDER");
    }

    public void a(a aVar) {
        this.c.add(aVar);
        this.A.execute(new k(this, aVar));
    }

    public void b(b bVar) {
        this.b.add(bVar);
        this.A.execute(new e(this, bVar));
    }

    public final b.b b0(com.google.firebase.auth.a aVar, b.b bVar, q0 q0Var) {
        return aVar.l() ? bVar : new g(this, aVar, q0Var, bVar);
    }

    public Task c(String str) {
        t.f(str);
        return this.e.zza(this.a, str, this.k);
    }

    public final b.b c0(String str, b.b bVar) {
        return (this.g.g() && str != null && str.equals(this.g.d())) ? new h(this, bVar) : bVar;
    }

    public Task d(String str) {
        t.f(str);
        return this.e.zzb(this.a, str, this.k);
    }

    public Task e(String str, String str2) {
        t.f(str);
        t.f(str2);
        return this.e.zza(this.a, str, str2, this.k);
    }

    public final void e0(A a2, zzahv zzahvVar, boolean z) {
        f0(a2, zzahvVar, true, false);
    }

    public Task f(String str, String str2) {
        t.f(str);
        t.f(str2);
        return new i(this, str, str2).c(this, this.k, this.o, "EMAIL_PASSWORD_PROVIDER");
    }

    public final void f0(A a2, zzahv zzahvVar, boolean z, boolean z2) {
        i0(this, a2, zzahvVar, true, z2);
    }

    public Task g(String str) {
        t.f(str);
        return this.e.zzc(this.a, str, this.k);
    }

    public final synchronized void g0(Z z) {
        this.l = z;
    }

    public Task h(boolean z) {
        return T(this.f, z);
    }

    public B7.g i() {
        return this.a;
    }

    public A j() {
        return this.f;
    }

    public String k() {
        return this.B;
    }

    public final void k0(com.google.firebase.auth.a aVar, q0 q0Var) {
        long longValue = aVar.i().longValue();
        if (longValue < 0 || longValue > 120) {
            throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
        }
        String f = t.f(aVar.j());
        String c2 = q0Var.c();
        String b2 = q0Var.b();
        String d2 = q0Var.d();
        if (zzac.zzc(c2) && m0() != null && m0().d("PHONE_PROVIDER")) {
            c2 = "NO_RECAPTCHA";
        }
        String str = c2;
        zzaij zzaijVar = new zzaij(f, longValue, aVar.f() != null, this.i, this.k, d2, b2, str, D0());
        b.b c0 = c0(f, aVar.g());
        if (TextUtils.isEmpty(q0Var.d())) {
            c0 = b0(aVar, c0, q0.a().d(d2).c(str).a(b2).b());
        }
        this.e.zza(this.a, zzaijVar, c0, aVar.a(), aVar.k());
    }

    public J7.w l() {
        return this.g;
    }

    public String m() {
        String str;
        synchronized (this.h) {
            str = this.i;
        }
        return str;
    }

    public final synchronized Z m0() {
        return this.l;
    }

    public String n() {
        String str;
        synchronized (this.j) {
            str = this.k;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [K7.i0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task n0(A a2, String str) {
        t.f(str);
        t.l(a2);
        return this.e.zzb(this.a, a2, str, new d(this));
    }

    public String o() {
        A a2 = this.f;
        if (a2 == null) {
            return null;
        }
        return a2.b();
    }

    public final Task o0(Activity activity, J7.n nVar, A a2) {
        t.l(activity);
        t.l(nVar);
        t.l(a2);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!this.t.d(activity, taskCompletionSource, this, a2)) {
            return Tasks.forException(zzaen.zza(new Status(17057)));
        }
        N.e(activity.getApplicationContext(), this, a2);
        nVar.b(activity);
        return taskCompletionSource.getTask();
    }

    public Task p() {
        if (this.l == null) {
            this.l = new Z(this.a, this);
        }
        return this.l.a(this.k, Boolean.FALSE).continueWithTask(new f0(this));
    }

    public void q(a aVar) {
        this.c.remove(aVar);
    }

    public final boolean q0(String str) {
        J7.f c2 = J7.f.c(str);
        return (c2 == null || TextUtils.equals(this.k, c2.d())) ? false : true;
    }

    public void r(b bVar) {
        this.b.remove(bVar);
    }

    public Task s(String str) {
        t.f(str);
        return t(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [K7.i0, com.google.firebase.auth.FirebaseAuth$d] */
    /* JADX WARN: Type inference failed for: r9v0, types: [K7.i0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task s0(A a2, J7.h hVar) {
        t.l(a2);
        t.l(hVar);
        J7.h O1 = hVar.O1();
        if (!(O1 instanceof J7.j)) {
            return O1 instanceof O ? this.e.zzb(this.a, a2, (O) O1, this.k, (i0) new d(this)) : this.e.zzc(this.a, a2, O1, a2.R1(), new d(this));
        }
        J7.j jVar = (J7.j) O1;
        return "password".equals(jVar.N1()) ? Z(jVar.zzc(), t.f(jVar.zzd()), a2.R1(), a2, true) : q0(t.f(jVar.zze())) ? Tasks.forException(zzaen.zza(new Status(17072))) : L(jVar, a2, true);
    }

    public Task t(String str, J7.e eVar) {
        t.f(str);
        if (eVar == null) {
            eVar = J7.e.W1();
        }
        String str2 = this.i;
        if (str2 != null) {
            eVar.V1(str2);
        }
        eVar.U1(1);
        return new G0(this, str, eVar).c(this, this.k, this.m, "EMAIL_PASSWORD_PROVIDER");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [K7.i0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task t0(A a2, String str) {
        t.l(a2);
        t.f(str);
        return this.e.zzc(this.a, a2, str, new d(this));
    }

    public Task u(String str, J7.e eVar) {
        t.f(str);
        t.l(eVar);
        if (!eVar.M1()) {
            throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
        }
        String str2 = this.i;
        if (str2 != null) {
            eVar.V1(str2);
        }
        return new F0(this, str, eVar).c(this, this.k, this.m, "EMAIL_PASSWORD_PROVIDER");
    }

    public final l8.b u0() {
        return this.v;
    }

    public void v(String str) {
        String str2;
        t.f(str);
        if (str.startsWith("chrome-extension://")) {
            this.B = str;
            return;
        }
        if (str.contains("://")) {
            str2 = str;
        } else {
            str2 = "http://" + str;
        }
        try {
            this.B = (String) t.l(new URI(str2).getHost());
        } catch (URISyntaxException e) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e.getMessage());
            }
            this.B = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [K7.i0, com.google.firebase.auth.FirebaseAuth$d] */
    public final Task v0(A a2, String str) {
        t.l(a2);
        t.f(str);
        return this.e.zzd(this.a, a2, str, new d(this));
    }

    public void w(String str) {
        t.f(str);
        synchronized (this.h) {
            this.i = str;
        }
    }

    public void x(String str) {
        t.f(str);
        synchronized (this.j) {
            this.k = str;
        }
    }

    public final l8.b x0() {
        return this.w;
    }

    public Task y() {
        A a2 = this.f;
        if (a2 == null || !a2.S1()) {
            return this.e.zza(this.a, new c(this), this.k);
        }
        K7.h hVar = (K7.h) this.f;
        hVar.s2(false);
        return Tasks.forResult(new K7.G0(hVar));
    }

    public Task z(J7.h hVar) {
        t.l(hVar);
        J7.h O1 = hVar.O1();
        if (O1 instanceof J7.j) {
            J7.j jVar = (J7.j) O1;
            return !jVar.zzf() ? Z(jVar.zzc(), (String) t.l(jVar.zzd()), this.k, null, false) : q0(t.f(jVar.zze())) ? Tasks.forException(zzaen.zza(new Status(17072))) : L(jVar, null, false);
        }
        if (O1 instanceof O) {
            return this.e.zza(this.a, (O) O1, this.k, (s0) new c(this));
        }
        return this.e.zza(this.a, O1, this.k, new c(this));
    }

    public final Executor z0() {
        return this.y;
    }

    @Keep
    public static FirebaseAuth getInstance(B7.g gVar) {
        return (FirebaseAuth) gVar.k(FirebaseAuth.class);
    }

    public FirebaseAuth(B7.g gVar, zzacq zzacqVar, e0 e0Var, j0 j0Var, C c2, l8.b bVar, l8.b bVar2, Executor executor, Executor executor2, Executor executor3, Executor executor4) {
        zzahv c3;
        this.b = new CopyOnWriteArrayList();
        this.c = new CopyOnWriteArrayList();
        this.d = new CopyOnWriteArrayList();
        this.h = new Object();
        this.j = new Object();
        this.m = RecaptchaAction.custom("getOobCode");
        this.n = RecaptchaAction.custom("signInWithPassword");
        this.o = RecaptchaAction.custom("signUpPassword");
        this.p = RecaptchaAction.custom("sendVerificationCode");
        this.q = RecaptchaAction.custom("mfaSmsEnrollment");
        this.r = RecaptchaAction.custom("mfaSmsSignIn");
        this.a = (B7.g) t.l(gVar);
        this.e = (zzacq) t.l(zzacqVar);
        e0 e0Var2 = (e0) t.l(e0Var);
        this.s = e0Var2;
        this.g = new K7.e();
        j0 j0Var2 = (j0) t.l(j0Var);
        this.t = j0Var2;
        this.u = (C) t.l(c2);
        this.v = bVar;
        this.w = bVar2;
        this.y = executor2;
        this.z = executor3;
        this.A = executor4;
        A a2 = e0Var2.a();
        this.f = a2;
        if (a2 != null && (c3 = e0Var2.c(a2)) != null) {
            i0(this, this.f, c3, false, false);
        }
        j0Var2.b(this);
    }
}
