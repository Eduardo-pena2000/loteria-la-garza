package j5;

import Ca.I;
import Ca.s;
import androidx.lifecycle.DefaultLifecycleObserver;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class g {

    public static final class a extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int d;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.d |= Integer.MIN_VALUE;
            return g.a(null, this);
        }
    }

    public static final class b implements DefaultLifecycleObserver {
        public final /* synthetic */ cb.n a;

        public b(cb.n nVar) {
            this.a = nVar;
        }

        public void onStart(androidx.lifecycle.r rVar) {
            cb.n nVar = this.a;
            s.a aVar = Ca.s.b;
            nVar.resumeWith(Ca.s.b(I.a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(androidx.lifecycle.k r6, Ga.e r7) {
        /*
            boolean r0 = r7 instanceof j5.g.a
            if (r0 == 0) goto L13
            r0 = r7
            j5.g$a r0 = (j5.g.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            j5.g$a r0 = new j5.g$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.b
            kotlin.jvm.internal.O r6 = (kotlin.jvm.internal.O) r6
            java.lang.Object r0 = r0.a
            androidx.lifecycle.k r0 = (androidx.lifecycle.k) r0
            Ca.t.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L8c
        L31:
            r7 = move-exception
            goto L98
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            Ca.t.b(r7)
            androidx.lifecycle.k$b r7 = r6.getCurrentState()
            androidx.lifecycle.k$b r2 = androidx.lifecycle.k.b.d
            boolean r7 = r7.b(r2)
            if (r7 == 0) goto L4d
            Ca.I r6 = Ca.I.a
            return r6
        L4d:
            kotlin.jvm.internal.O r7 = new kotlin.jvm.internal.O
            r7.<init>()
            r0.a = r6     // Catch: java.lang.Throwable -> L81
            r0.b = r7     // Catch: java.lang.Throwable -> L81
            r0.d = r3     // Catch: java.lang.Throwable -> L81
            cb.p r2 = new cb.p     // Catch: java.lang.Throwable -> L81
            Ga.e r4 = Ha.b.c(r0)     // Catch: java.lang.Throwable -> L81
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L81
            r2.E()     // Catch: java.lang.Throwable -> L81
            j5.g$b r3 = new j5.g$b     // Catch: java.lang.Throwable -> L81
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L81
            r7.a = r3     // Catch: java.lang.Throwable -> L81
            kotlin.jvm.internal.t.d(r3)     // Catch: java.lang.Throwable -> L81
            androidx.lifecycle.q r3 = (androidx.lifecycle.q) r3     // Catch: java.lang.Throwable -> L81
            r6.addObserver(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = r2.w()     // Catch: java.lang.Throwable -> L81
            java.lang.Object r3 = Ha.c.f()     // Catch: java.lang.Throwable -> L81
            if (r2 != r3) goto L87
            Ia.h.c(r0)     // Catch: java.lang.Throwable -> L81
            goto L87
        L81:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L98
        L87:
            if (r2 != r1) goto L8a
            return r1
        L8a:
            r0 = r6
            r6 = r7
        L8c:
            java.lang.Object r6 = r6.a
            androidx.lifecycle.q r6 = (androidx.lifecycle.q) r6
            if (r6 == 0) goto L95
            r0.removeObserver(r6)
        L95:
            Ca.I r6 = Ca.I.a
            return r6
        L98:
            java.lang.Object r6 = r6.a
            androidx.lifecycle.q r6 = (androidx.lifecycle.q) r6
            if (r6 == 0) goto La1
            r0.removeObserver(r6)
        La1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.g.a(androidx.lifecycle.k, Ga.e):java.lang.Object");
    }
}
