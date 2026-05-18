package k5;

import android.app.Activity;
import android.content.Intent;
import cb.L;
import da.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m {
    public Z9.c a;
    public final m5.a b;

    public static final class a extends Ia.l implements Qa.p {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public int e;
        public final /* synthetic */ U6.b f;
        public final /* synthetic */ j.d g;
        public final /* synthetic */ m h;
        public final /* synthetic */ Activity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U6.b bVar, j.d dVar, m mVar, Activity activity, Ga.e eVar) {
            super(2, eVar);
            this.f = bVar;
            this.g = dVar;
            this.h = mVar;
            this.i = activity;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new a(this.f, this.g, this.h, this.i, eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00d9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ab -> B:6:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b3 -> B:7:0x00b5). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 289
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k5.m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends Ga.a implements cb.L {
        public final /* synthetic */ j.d a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L.b bVar, j.d dVar) {
            super(bVar);
            this.a = dVar;
        }

        public void handleException(Ga.i iVar, Throwable th) {
            this.a.b(m5.d.a(m5.c.g), th.getLocalizedMessage(), (Object) null);
        }
    }

    public m(Z9.c cVar) {
        kotlin.jvm.internal.t.g(cVar, "activityPluginBinding");
        this.a = cVar;
        this.b = new m5.a();
    }

    public static final Ca.I B(j.d dVar, Void r1) {
        dVar.a((Object) null);
        return Ca.I.a;
    }

    public static final void C(Qa.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void D(j.d dVar, Exception exc) {
        kotlin.jvm.internal.t.g(exc, "it");
        dVar.b(m5.d.a(m5.c.d), exc.getLocalizedMessage(), (Object) null);
    }

    public static /* synthetic */ void a(Qa.l lVar, Object obj) {
        y(lVar, obj);
    }

    public static /* synthetic */ void b(Qa.l lVar, Object obj) {
        q(lVar, obj);
    }

    public static /* synthetic */ void c(Qa.l lVar, Object obj) {
        C(lVar, obj);
    }

    public static /* synthetic */ Ca.I d(j.d dVar, Void r1) {
        return B(dVar, r1);
    }

    public static /* synthetic */ Ca.I e(j.d dVar, m mVar, Activity activity, T6.b bVar) {
        return t(dVar, mVar, activity, bVar);
    }

    public static /* synthetic */ Ca.I f(Activity activity, j.d dVar, Intent intent) {
        return x(activity, dVar, intent);
    }

    public static /* synthetic */ void g(j.d dVar, Exception exc) {
        D(dVar, exc);
    }

    public static /* synthetic */ void h(j.d dVar, Exception exc) {
        v(dVar, exc);
    }

    public static /* synthetic */ void i(j.d dVar, Exception exc) {
        r(dVar, exc);
    }

    public static /* synthetic */ void j(Qa.l lVar, Object obj) {
        u(lVar, obj);
    }

    public static /* synthetic */ void k(j.d dVar, Exception exc) {
        z(dVar, exc);
    }

    public static /* synthetic */ Ca.I l(j.d dVar, Boolean bool) {
        return p(dVar, bool);
    }

    public static final /* synthetic */ m5.a m(m mVar) {
        return mVar.b;
    }

    public static final Ca.I p(j.d dVar, Boolean bool) {
        dVar.a((Object) null);
        return Ca.I.a;
    }

    public static final void q(Qa.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void r(j.d dVar, Exception exc) {
        kotlin.jvm.internal.t.g(exc, "it");
        dVar.b(m5.d.a(m5.c.f), exc.getLocalizedMessage(), (Object) null);
    }

    public static final Ca.I t(j.d dVar, m mVar, Activity activity, T6.b bVar) {
        U6.b bVar2 = (U6.b) bVar.a();
        if (bVar2 == null) {
            m5.c cVar = m5.c.g;
            dVar.b(m5.d.a(cVar), m5.d.b(cVar), (Object) null);
            return Ca.I.a;
        }
        cb.i.d(cb.P.a(cb.e0.c().plus(new b(cb.L.O8, dVar))), (Ga.i) null, (cb.Q) null, new a(bVar2, dVar, mVar, activity, null), 3, (Object) null);
        return Ca.I.a;
    }

    public static final void u(Qa.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void v(j.d dVar, Exception exc) {
        kotlin.jvm.internal.t.g(exc, "it");
        dVar.b(m5.d.a(m5.c.g), exc.getLocalizedMessage(), (Object) null);
    }

    public static final Ca.I x(Activity activity, j.d dVar, Intent intent) {
        if (activity != null) {
            activity.startActivityForResult(intent, 0);
        }
        dVar.a((Object) null);
        return Ca.I.a;
    }

    public static final void y(Qa.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void z(j.d dVar, Exception exc) {
        kotlin.jvm.internal.t.g(exc, "it");
        dVar.b(m5.d.a(m5.c.e), exc.getLocalizedMessage(), (Object) null);
    }

    public final void A(String str, j.d dVar) {
        kotlin.jvm.internal.t.g(str, "achievementID");
        kotlin.jvm.internal.t.g(dVar, "result");
        n().unlockImmediate(str).addOnSuccessListener(new d(new k5.a(dVar))).addOnFailureListener(new e(dVar));
    }

    public final T6.a n() {
        T6.a a2 = T6.m.a(this.a.getActivity());
        kotlin.jvm.internal.t.f(a2, "getAchievementsClient(...)");
        return a2;
    }

    public final void o(String str, int i, j.d dVar) {
        kotlin.jvm.internal.t.g(str, "achievementID");
        kotlin.jvm.internal.t.g(dVar, "result");
        n().incrementImmediate(str, i).addOnSuccessListener(new k5.b(new l(dVar))).addOnFailureListener(new c(dVar));
    }

    public final void s(Activity activity, boolean z, j.d dVar) {
        kotlin.jvm.internal.t.g(dVar, "result");
        if (activity == null) {
            return;
        }
        n().load(z).addOnSuccessListener(new j(new i(dVar, this, activity))).addOnFailureListener(new k(dVar));
    }

    public final void w(Activity activity, j.d dVar) {
        kotlin.jvm.internal.t.g(dVar, "result");
        n().getAchievementsIntent().addOnSuccessListener(new g(new f(activity, dVar))).addOnFailureListener(new h(dVar));
    }
}
