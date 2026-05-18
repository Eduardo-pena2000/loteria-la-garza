package ca;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class g {
    public a a;
    public a b;
    public boolean c;
    public final da.a d;

    public enum a {
        DETACHED,
        RESUMED,
        INACTIVE,
        HIDDEN,
        PAUSED
    }

    public g(T9.a aVar) {
        this(new da.a(aVar, "flutter/lifecycle", da.q.b));
    }

    public void a() {
        g(this.a, true);
    }

    public void b() {
        g(a.DETACHED, this.c);
    }

    public void c() {
        g(a.INACTIVE, this.c);
    }

    public void d() {
        g(a.PAUSED, this.c);
    }

    public void e() {
        g(a.RESUMED, this.c);
    }

    public void f() {
        g(this.a, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(ca.g.a r3, boolean r4) {
        /*
            r2 = this;
            ca.g$a r0 = r2.a
            if (r0 != r3) goto L9
            boolean r1 = r2.c
            if (r4 != r1) goto L9
            return
        L9:
            if (r3 != 0) goto L10
            if (r0 != 0) goto L10
            r2.c = r4
            return
        L10:
            int r0 = r3.ordinal()
            if (r0 == 0) goto L2c
            r1 = 1
            if (r0 == r1) goto L24
            r1 = 2
            if (r0 == r1) goto L2c
            r1 = 3
            if (r0 == r1) goto L2c
            r1 = 4
            if (r0 == r1) goto L2c
            r0 = 0
            goto L2d
        L24:
            if (r4 == 0) goto L29
            ca.g$a r0 = ca.g.a.RESUMED
            goto L2d
        L29:
            ca.g$a r0 = ca.g.a.INACTIVE
            goto L2d
        L2c:
            r0 = r3
        L2d:
            r2.a = r3
            r2.c = r4
            ca.g$a r3 = r2.b
            if (r0 != r3) goto L36
            return
        L36:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "AppLifecycleState."
            r3.append(r4)
            java.lang.String r4 = r0.name()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Sending "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = " message."
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = "LifecycleChannel"
            Q9.b.f(r1, r4)
            da.a r4 = r2.d
            r4.c(r3)
            r2.b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.g.g(ca.g$a, boolean):void");
    }

    public g(da.a aVar) {
        this.a = null;
        this.b = null;
        this.c = true;
        this.d = aVar;
    }
}
