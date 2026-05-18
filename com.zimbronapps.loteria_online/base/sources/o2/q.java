package o2;

import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class q extends n implements P {

    public static final class a extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return q.this.c(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(File file, E e) {
        super(file, e);
        kotlin.jvm.internal.t.g(file, "file");
        kotlin.jvm.internal.t.g(e, "serializer");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(java.lang.Object r6, Ga.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o2.q.a
            if (r0 == 0) goto L13
            r0 = r7
            o2.q$a r0 = (o2.q.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            o2.q$a r0 = new o2.q$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.b
            java.io.FileOutputStream r6 = (java.io.FileOutputStream) r6
            java.lang.Object r0 = r0.a
            java.io.Closeable r0 = (java.io.Closeable) r0
            Ca.t.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L62
        L31:
            r6 = move-exception
            goto L74
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            Ca.t.b(r7)
            r5.f()
            java.io.FileOutputStream r7 = new java.io.FileOutputStream
            java.io.File r2 = r5.g()
            r7.<init>(r2)
            o2.E r2 = r5.h()     // Catch: java.lang.Throwable -> L72
            o2.N r4 = new o2.N     // Catch: java.lang.Throwable -> L72
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L72
            r0.a = r7     // Catch: java.lang.Throwable -> L72
            r0.b = r7     // Catch: java.lang.Throwable -> L72
            r0.e = r3     // Catch: java.lang.Throwable -> L72
            java.lang.Object r6 = r2.writeTo(r6, r4, r0)     // Catch: java.lang.Throwable -> L72
            if (r6 != r1) goto L60
            return r1
        L60:
            r6 = r7
            r0 = r6
        L62:
            java.io.FileDescriptor r6 = r6.getFD()     // Catch: java.lang.Throwable -> L31
            r6.sync()     // Catch: java.lang.Throwable -> L31
            Ca.I r6 = Ca.I.a     // Catch: java.lang.Throwable -> L31
            r6 = 0
            Na.c.a(r0, r6)
            Ca.I r6 = Ca.I.a
            return r6
        L72:
            r6 = move-exception
            r0 = r7
        L74:
            throw r6     // Catch: java.lang.Throwable -> L75
        L75:
            r7 = move-exception
            Na.c.a(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.q.c(java.lang.Object, Ga.e):java.lang.Object");
    }
}
