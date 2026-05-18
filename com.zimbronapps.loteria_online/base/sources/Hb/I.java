package hb;

import cb.Y0;
import cb.k0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class i {
    public static final D a = new D("UNDEFINED");
    public static final D b = new D("REUSABLE_CLAIMED");

    public static final /* synthetic */ D a() {
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #0 {all -> 0x0067, blocks: (B:14:0x003e, B:16:0x004c, B:18:0x0052, B:20:0x0091, B:26:0x0069, B:28:0x0079, B:32:0x0088, B:34:0x008e, B:38:0x009e, B:40:0x00a7, B:41:0x00a4, B:30:0x007f), top: B:13:0x003e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(Ga.e r6, java.lang.Object r7) {
        /*
            boolean r0 = r6 instanceof hb.h
            if (r0 == 0) goto Lb1
            hb.h r6 = (hb.h) r6
            java.lang.Object r0 = cb.E.b(r7)
            cb.K r1 = r6.d
            Ga.i r2 = r6.getContext()
            boolean r1 = r1.z(r2)
            r2 = 1
            if (r1 == 0) goto L26
            r6.f = r0
            r6.c = r2
            cb.K r7 = r6.d
            Ga.i r0 = r6.getContext()
            r7.x(r0, r6)
            goto Lb4
        L26:
            cb.Y0 r1 = cb.Y0.a
            cb.k0 r1 = r1.b()
            boolean r3 = r1.P()
            if (r3 == 0) goto L3b
            r6.f = r0
            r6.c = r2
            r1.L(r6)
            goto Lb4
        L3b:
            r1.N(r2)
            Ga.i r3 = r6.getContext()     // Catch: java.lang.Throwable -> L67
            cb.B0$b r4 = cb.B0.P8     // Catch: java.lang.Throwable -> L67
            Ga.i$b r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L67
            cb.B0 r3 = (cb.B0) r3     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L69
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L67
            if (r4 != 0) goto L69
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch: java.lang.Throwable -> L67
            r6.b(r0, r7)     // Catch: java.lang.Throwable -> L67
            Ca.s$a r0 = Ca.s.b     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = Ca.t.a(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = Ca.s.b(r7)     // Catch: java.lang.Throwable -> L67
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L67
            goto L91
        L67:
            r7 = move-exception
            goto La8
        L69:
            Ga.e r0 = r6.e     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = r6.g     // Catch: java.lang.Throwable -> L67
            Ga.i r4 = r0.getContext()     // Catch: java.lang.Throwable -> L67
            java.lang.Object r3 = hb.K.i(r4, r3)     // Catch: java.lang.Throwable -> L67
            hb.D r5 = hb.K.a     // Catch: java.lang.Throwable -> L67
            if (r3 == r5) goto L7e
            cb.e1 r0 = cb.I.m(r0, r4, r3)     // Catch: java.lang.Throwable -> L67
            goto L7f
        L7e:
            r0 = 0
        L7f:
            Ga.e r5 = r6.e     // Catch: java.lang.Throwable -> L9b
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L9b
            Ca.I r7 = Ca.I.a     // Catch: java.lang.Throwable -> L9b
            if (r0 == 0) goto L8e
            boolean r7 = r0.R0()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L91
        L8e:
            hb.K.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        L91:
            boolean r7 = r1.V()     // Catch: java.lang.Throwable -> L67
            if (r7 != 0) goto L91
        L97:
            r1.E(r2)
            goto Lb4
        L9b:
            r7 = move-exception
            if (r0 == 0) goto La4
            boolean r0 = r0.R0()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto La7
        La4:
            hb.K.f(r4, r3)     // Catch: java.lang.Throwable -> L67
        La7:
            throw r7     // Catch: java.lang.Throwable -> L67
        La8:
            r6.f(r7)     // Catch: java.lang.Throwable -> Lac
            goto L97
        Lac:
            r6 = move-exception
            r1.E(r2)
            throw r6
        Lb1:
            r6.resumeWith(r7)
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.i.b(Ga.e, java.lang.Object):void");
    }

    public static final boolean c(h hVar) {
        Ca.I i = Ca.I.a;
        k0 b2 = Y0.a.b();
        if (b2.R()) {
            return false;
        }
        if (b2.P()) {
            hVar.f = i;
            hVar.c = 1;
            b2.L(hVar);
            return true;
        }
        b2.N(true);
        try {
            hVar.run();
            do {
            } while (b2.V());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
