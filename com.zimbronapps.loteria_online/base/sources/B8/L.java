package B8;

import android.app.Application;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class l {
    public static final b c = new b(null);
    public final B7.g a;
    public final E8.j b;

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ T c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T t, Ga.e eVar) {
            super(2, eVar);
            this.c = t;
        }

        public static /* synthetic */ void a(T t, String str, B7.p pVar) {
            i(t, str, pVar);
        }

        public static final void i(T t, String str, B7.p pVar) {
            Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
            t.a();
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return l.this.new a(this.c, eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0075  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = Ha.c.f()
                int r1 = r5.a
                java.lang.String r2 = "FirebaseSessions"
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L20
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                Ca.t.b(r6)
                goto L69
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                Ca.t.b(r6)
                goto L2e
            L20:
                Ca.t.b(r6)
                C8.b r6 = C8.b.a
                r5.a = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L2e
                return r0
            L2e:
                java.util.Map r6 = (java.util.Map) r6
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                boolean r1 = r6 instanceof java.util.Collection
                if (r1 == 0) goto L44
                r1 = r6
                java.util.Collection r1 = (java.util.Collection) r1
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L44
                goto L92
            L44:
                java.util.Iterator r6 = r6.iterator()
            L48:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L92
                java.lang.Object r1 = r6.next()
                C8.c r1 = (C8.c) r1
                boolean r1 = r1.b()
                if (r1 == 0) goto L48
                B8.l r6 = B8.l.this
                E8.j r6 = B8.l.b(r6)
                r5.a = r3
                java.lang.Object r6 = r6.f(r5)
                if (r6 != r0) goto L69
                return r0
            L69:
                B8.l r6 = B8.l.this
                E8.j r6 = B8.l.b(r6)
                boolean r6 = r6.c()
                if (r6 != 0) goto L7f
                java.lang.String r6 = "Sessions SDK disabled. Not listening to lifecycle events."
                int r6 = android.util.Log.d(r2, r6)
                Ia.b.d(r6)
                goto L9b
            L7f:
                B8.l r6 = B8.l.this
                B7.g r6 = B8.l.a(r6)
                B8.T r0 = r5.c
                B8.k r1 = new B8.k
                r1.<init>(r0)
                r6.h(r1)
                Ca.I r6 = Ca.I.a
                goto L9b
            L92:
                java.lang.String r6 = "No Sessions subscribers. Not listening to lifecycle events."
                int r6 = android.util.Log.d(r2, r6)
                Ia.b.d(r6)
            L9b:
                Ca.I r6 = Ca.I.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: B8.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public b() {
        }
    }

    public l(B7.g gVar, E8.j jVar, Ga.i iVar, T t) {
        kotlin.jvm.internal.t.g(gVar, "firebaseApp");
        kotlin.jvm.internal.t.g(jVar, "settings");
        kotlin.jvm.internal.t.g(iVar, "backgroundDispatcher");
        kotlin.jvm.internal.t.g(t, "sessionsActivityLifecycleCallbacks");
        this.a = gVar;
        this.b = jVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.4.");
        Application applicationContext = gVar.m().getApplicationContext();
        if (applicationContext instanceof Application) {
            applicationContext.registerActivityLifecycleCallbacks(t);
            cb.i.d(cb.P.a(iVar), (Ga.i) null, (cb.Q) null, new a(t, null), 3, (Object) null);
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }

    public static final /* synthetic */ B7.g a(l lVar) {
        return lVar.a;
    }

    public static final /* synthetic */ E8.j b(l lVar) {
        return lVar.b;
    }
}
