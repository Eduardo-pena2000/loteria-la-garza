package com.google.firebase.auth;

import J7.L;
import J7.S;
import J7.s0;
import K7.o;
import android.app.Activity;
import com.google.android.gms.common.internal.t;
import com.google.firebase.auth.b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class a {
    public final FirebaseAuth a;
    public Long b;
    public b.b c;
    public Executor d;
    public String e;
    public Activity f;
    public b.a g;
    public L h;
    public S i;
    public boolean j;
    public boolean k;
    public boolean l;

    public static final class a {
        public final FirebaseAuth a;
        public String b;
        public Long c;
        public b.b d;
        public Executor e;
        public Activity f;
        public b.a g;
        public L h;
        public S i;
        public boolean j;

        public a(FirebaseAuth firebaseAuth) {
            this.a = (FirebaseAuth) t.l(firebaseAuth);
        }

        public final a a() {
            t.m(this.a, "FirebaseAuth instance cannot be null");
            t.m(this.c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            t.m(this.d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            this.e = this.a.A;
            if (this.c.longValue() < 0 || this.c.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            L l = this.h;
            if (l == null) {
                t.g(this.b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                t.b(!this.j, "You cannot require sms validation without setting a multi-factor session.");
                t.b(this.i == null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else if (l == null || !((o) l).zzd()) {
                t.b(this.i != null, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                t.b(this.b == null, "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.");
            } else {
                t.f(this.b);
                t.b(this.i == null, "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.");
            }
            return new a(this.a, this.c, this.d, this.e, this.b, this.f, this.g, this.h, this.i, this.j, null);
        }

        public final a b(Activity activity) {
            this.f = activity;
            return this;
        }

        public final a c(b.b bVar) {
            this.d = bVar;
            return this;
        }

        public final a d(b.a aVar) {
            this.g = aVar;
            return this;
        }

        public final a e(S s) {
            this.i = s;
            return this;
        }

        public final a f(L l) {
            this.h = l;
            return this;
        }

        public final a g(String str) {
            this.b = str;
            return this;
        }

        public final a h(Long l, TimeUnit timeUnit) {
            this.c = Long.valueOf(TimeUnit.SECONDS.convert(l.longValue(), timeUnit));
            return this;
        }
    }

    public /* synthetic */ a(FirebaseAuth firebaseAuth, Long l, b.b bVar, Executor executor, String str, Activity activity, b.a aVar, L l2, S s, boolean z, s0 s0Var) {
        this(firebaseAuth, l, bVar, executor, str, activity, aVar, l2, s, z);
    }

    public final Activity a() {
        return this.f;
    }

    public final void b(boolean z) {
        this.k = true;
    }

    public final FirebaseAuth c() {
        return this.a;
    }

    public final void d(boolean z) {
        this.l = true;
    }

    public final L e() {
        return this.h;
    }

    public final b.a f() {
        return this.g;
    }

    public final b.b g() {
        return this.c;
    }

    public final S h() {
        return this.i;
    }

    public final Long i() {
        return this.b;
    }

    public final String j() {
        return this.e;
    }

    public final Executor k() {
        return this.d;
    }

    public final boolean l() {
        return this.k;
    }

    public final boolean m() {
        return this.j;
    }

    public final boolean n() {
        return this.l;
    }

    public final boolean o() {
        return this.h != null;
    }

    public a(FirebaseAuth firebaseAuth, Long l, b.b bVar, Executor executor, String str, Activity activity, b.a aVar, L l2, S s, boolean z) {
        this.a = firebaseAuth;
        this.e = str;
        this.b = l;
        this.c = bVar;
        this.f = activity;
        this.d = executor;
        this.g = aVar;
        this.h = l2;
        this.i = s;
        this.j = z;
    }
}
