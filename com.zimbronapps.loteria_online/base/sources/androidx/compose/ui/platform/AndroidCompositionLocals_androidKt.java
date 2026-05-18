package androidx.compose.ui.platform;

import Ca.I;
import P0.G0;
import P0.N;
import P0.W0;
import P0.p0;
import P0.r0;
import P0.t0;
import P0.v0;
import Qa.p;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import b0.B1;
import b0.C0;
import b0.E;
import b0.H;
import b0.U1;
import b0.X;
import b0.Y;
import b0.b0;
import b0.b1;
import b0.c1;
import b0.g1;
import b0.m;
import b0.w;
import k0.s;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class AndroidCompositionLocals_androidKt {
    public static final b1 a = H.h(null, a.a, 1, null);
    public static final b1 b = H.j(b.a);
    public static final b1 c = H.i(e.a);
    public static final b1 d = H.j(c.a);
    public static final b1 e = H.j(d.a);
    public static final b1 f = H.j(f.a);

    public static final class a extends u implements Qa.a {
        public static final a a = new a();

        public a() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.e("LocalConfiguration");
            throw new Ca.i();
        }
    }

    public static final class b extends u implements Qa.a {
        public static final b a = new b();

        public b() {
            super(0);
        }

        public final Context invoke() {
            AndroidCompositionLocals_androidKt.e("LocalContext");
            throw new Ca.i();
        }
    }

    public static final class c extends u implements Qa.a {
        public static final c a = new c();

        public c() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U0.b invoke() {
            AndroidCompositionLocals_androidKt.e("LocalImageVectorCache");
            throw new Ca.i();
        }
    }

    public static final class d extends u implements Qa.a {
        public static final d a = new d();

        public d() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final U0.d invoke() {
            AndroidCompositionLocals_androidKt.e("LocalResourceIdCache");
            throw new Ca.i();
        }
    }

    public static final class e extends u implements Qa.l {
        public static final e a = new e();

        public e() {
            super(1);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Resources invoke(E e) {
            e.c(AndroidCompositionLocals_androidKt.f());
            return ((Context) e.c(AndroidCompositionLocals_androidKt.g())).getResources();
        }
    }

    public static final class f extends u implements Qa.a {
        public static final f a = new f();

        public f() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            AndroidCompositionLocals_androidKt.e("LocalView");
            throw new Ca.i();
        }
    }

    public static final class g extends u implements Qa.l {
        public final /* synthetic */ C0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(C0 c0) {
            super(1);
            this.a = c0;
        }

        public final void a(Configuration configuration) {
            AndroidCompositionLocals_androidKt.d(this.a, new Configuration(configuration));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Configuration) obj);
            return I.a;
        }
    }

    public static final class h extends u implements Qa.l {
        public final /* synthetic */ t0 a;

        public static final class a implements X {
            public final /* synthetic */ t0 a;

            public a(t0 t0Var) {
                this.a = t0Var;
            }

            public void dispose() {
                this.a.c();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(t0 t0Var) {
            super(1);
            this.a = t0Var;
        }

        public final X invoke(Y y) {
            return new a(this.a);
        }
    }

    public static final class i extends u implements p {
        public final /* synthetic */ AndroidComposeView a;
        public final /* synthetic */ N b;
        public final /* synthetic */ p c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(AndroidComposeView androidComposeView, N n, p pVar) {
            super(2);
            this.a = androidComposeView;
            this.b = n;
            this.c = pVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            if (!mVar.o((i & 3) != 2, i & 1)) {
                mVar.M();
                return;
            }
            if (w.L()) {
                w.U(1059770793, i, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:144)");
            }
            p0.a(this.a, this.b, this.c, mVar, 0);
            if (w.L()) {
                w.T();
            }
        }
    }

    public static final class j extends u implements p {
        public final /* synthetic */ AndroidComposeView a;
        public final /* synthetic */ p b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(AndroidComposeView androidComposeView, p pVar, int i) {
            super(2);
            this.a = androidComposeView;
            this.b = pVar;
            this.c = i;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((b0.m) obj, ((Number) obj2).intValue());
            return I.a;
        }

        public final void invoke(b0.m mVar, int i) {
            AndroidCompositionLocals_androidKt.a(this.a, this.b, mVar, g1.a(this.c | 1));
        }
    }

    public static final class k extends u implements Qa.l {
        public final /* synthetic */ Context a;
        public final /* synthetic */ l b;

        public static final class a implements X {
            public final /* synthetic */ Context a;
            public final /* synthetic */ l b;

            public a(Context context, l lVar) {
                this.a = context;
                this.b = lVar;
            }

            public void dispose() {
                this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Context context, l lVar) {
            super(1);
            this.a = context;
            this.b = lVar;
        }

        public final X invoke(Y y) {
            this.a.getApplicationContext().registerComponentCallbacks(this.b);
            return new a(this.a, this.b);
        }
    }

    public static final class l implements ComponentCallbacks2 {
        public final /* synthetic */ Configuration a;
        public final /* synthetic */ U0.b b;

        public l(Configuration configuration, U0.b bVar) {
            this.a = configuration;
            this.b = bVar;
        }

        public void onConfigurationChanged(Configuration configuration) {
            this.b.c(this.a.updateFrom(configuration));
            this.a.setTo(configuration);
        }

        public void onLowMemory() {
            this.b.a();
        }

        public void onTrimMemory(int i) {
            this.b.a();
        }
    }

    public static final class m extends u implements Qa.l {
        public final /* synthetic */ Context a;
        public final /* synthetic */ n b;

        public static final class a implements X {
            public final /* synthetic */ Context a;
            public final /* synthetic */ n b;

            public a(Context context, n nVar) {
                this.a = context;
                this.b = nVar;
            }

            public void dispose() {
                this.a.getApplicationContext().unregisterComponentCallbacks(this.b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Context context, n nVar) {
            super(1);
            this.a = context;
            this.b = nVar;
        }

        public final X invoke(Y y) {
            this.a.getApplicationContext().registerComponentCallbacks(this.b);
            return new a(this.a, this.b);
        }
    }

    public static final class n implements ComponentCallbacks2 {
        public final /* synthetic */ U0.d a;

        public n(U0.d dVar) {
            this.a = dVar;
        }

        public void onConfigurationChanged(Configuration configuration) {
            this.a.a();
        }

        public void onLowMemory() {
            this.a.a();
        }

        public void onTrimMemory(int i) {
            this.a.a();
        }
    }

    public static final void a(AndroidComposeView androidComposeView, p pVar, b0.m mVar, int i2) {
        int i3;
        b0.m i4 = mVar.i(-520299287);
        if ((i2 & 6) == 0) {
            i3 = (i4.E(androidComposeView) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= i4.E(pVar) ? 32 : 16;
        }
        if (i4.o((i3 & 19) != 18, i3 & 1)) {
            if (w.L()) {
                w.U(-520299287, i3, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:99)");
            }
            Context context = androidComposeView.getContext();
            Object C = i4.C();
            m.a aVar = b0.m.a;
            if (C == aVar.a()) {
                C = U1.i(new Configuration(context.getResources().getConfiguration()), null, 2, null);
                i4.t(C);
            }
            C0 c0 = (C0) C;
            Object C2 = i4.C();
            if (C2 == aVar.a()) {
                C2 = new g(c0);
                i4.t(C2);
            }
            androidComposeView.setConfigurationChangeObserver((Qa.l) C2);
            Object C3 = i4.C();
            if (C3 == aVar.a()) {
                C3 = new N(context);
                i4.t(C3);
            }
            N n2 = (N) C3;
            AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object C4 = i4.C();
            if (C4 == aVar.a()) {
                C4 = v0.b(androidComposeView, viewTreeOwners.b());
                i4.t(C4);
            }
            t0 t0Var = (t0) C4;
            I i5 = I.a;
            boolean E = i4.E(t0Var);
            Object C5 = i4.C();
            if (E || C5 == aVar.a()) {
                C5 = new h(t0Var);
                i4.t(C5);
            }
            b0.a(i5, (Qa.l) C5, i4, 6);
            Object C6 = i4.C();
            if (C6 == aVar.a()) {
                C6 = G0.a.a(context) ? new r0(androidComposeView.getView()) : new W0();
                i4.t(C6);
            }
            H.d(new c1[]{a.d(b(c0)), b.d(context), C2.c.c().d(viewTreeOwners.a()), k4.b.c().d(viewTreeOwners.b()), s.g().d(t0Var), f.d(androidComposeView.getView()), d.d(m(context, b(c0), i4, 0)), e.d(n(context, i4, 0)), p0.m().d(Boolean.valueOf(((Boolean) i4.x(p0.n())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), p0.i().d((D0.a) C6)}, j0.i.d(1059770793, true, new i(androidComposeView, n2, pVar), i4, 54), i4, c1.i | 48);
            if (w.L()) {
                w.T();
            }
        } else {
            i4.M();
        }
        B1 l2 = i4.l();
        if (l2 != null) {
            l2.a(new j(androidComposeView, pVar, i2));
        }
    }

    public static final Configuration b(C0 c0) {
        return (Configuration) c0.getValue();
    }

    public static final void c(C0 c0, Configuration configuration) {
        c0.setValue(configuration);
    }

    public static final /* synthetic */ void d(C0 c0, Configuration configuration) {
        c(c0, configuration);
    }

    public static final /* synthetic */ Void e(String str) {
        return l(str);
    }

    public static final b1 f() {
        return a;
    }

    public static final b1 g() {
        return b;
    }

    public static final b1 getLocalLifecycleOwner() {
        return C2.c.c();
    }

    public static final b1 h() {
        return d;
    }

    public static final b1 i() {
        return e;
    }

    public static final b1 j() {
        return c;
    }

    public static final b1 k() {
        return f;
    }

    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final U0.b m(Context context, Configuration configuration, b0.m mVar, int i2) {
        if (w.L()) {
            w.U(-485908294, i2, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:180)");
        }
        Object C = mVar.C();
        m.a aVar = b0.m.a;
        if (C == aVar.a()) {
            C = new U0.b();
            mVar.t(C);
        }
        U0.b bVar = (U0.b) C;
        Object C2 = mVar.C();
        Object obj = C2;
        if (C2 == aVar.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            mVar.t(configuration2);
            obj = configuration2;
        }
        Configuration configuration3 = (Configuration) obj;
        Object C3 = mVar.C();
        if (C3 == aVar.a()) {
            C3 = new l(configuration3, bVar);
            mVar.t(C3);
        }
        l lVar = (l) C3;
        boolean E = mVar.E(context);
        Object C4 = mVar.C();
        if (E || C4 == aVar.a()) {
            C4 = new k(context, lVar);
            mVar.t(C4);
        }
        b0.a(bVar, (Qa.l) C4, mVar, 0);
        if (w.L()) {
            w.T();
        }
        return bVar;
    }

    public static final U0.d n(Context context, b0.m mVar, int i2) {
        if (w.L()) {
            w.U(-1348507246, i2, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:150)");
        }
        Object C = mVar.C();
        m.a aVar = b0.m.a;
        if (C == aVar.a()) {
            C = new U0.d();
            mVar.t(C);
        }
        U0.d dVar = (U0.d) C;
        Object C2 = mVar.C();
        if (C2 == aVar.a()) {
            C2 = new n(dVar);
            mVar.t(C2);
        }
        n nVar = (n) C2;
        boolean E = mVar.E(context);
        Object C3 = mVar.C();
        if (E || C3 == aVar.a()) {
            C3 = new m(context, nVar);
            mVar.t(C3);
        }
        b0.a(dVar, (Qa.l) C3, mVar, 0);
        if (w.L()) {
            w.T();
        }
        return dVar;
    }
}
