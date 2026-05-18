package o2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p implements K {
    public final File a;
    public final E b;
    public final t c;
    public final Qa.a d;
    public final AtomicBoolean e;
    public final lb.a f;

    public static final class a extends Ia.d {
        public Object a;
        public Object b;
        public boolean c;
        public /* synthetic */ Object d;
        public int f;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return p.this.b(null, this);
        }
    }

    public static final class b extends Ia.d {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public /* synthetic */ Object e;
        public int g;

        public b(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return p.this.d(null, this);
        }
    }

    public p(File file, E e, t tVar, Qa.a aVar) {
        kotlin.jvm.internal.t.g(file, "file");
        kotlin.jvm.internal.t.g(e, "serializer");
        kotlin.jvm.internal.t.g(tVar, "coordinator");
        kotlin.jvm.internal.t.g(aVar, "onClose");
        this.a = file;
        this.b = e;
        this.c = tVar;
        this.d = aVar;
        this.e = new AtomicBoolean(false);
        this.f = lb.g.b(false, 1, (Object) null);
    }

    private final void f() {
        if (this.e.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007c, blocks: (B:21:0x007b, B:28:0x008c, B:31:0x0089, B:27:0x0084), top: B:7:0x0022, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [o2.p] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, o2.p$a] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [o2.p] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Qa.q] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(Qa.q r9, Ga.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof o2.p.a
            if (r0 == 0) goto L13
            r0 = r10
            o2.p$a r0 = (o2.p.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            o2.p$a r0 = new o2.p$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.d
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r9 = r0.c
            java.lang.Object r1 = r0.b
            o2.c r1 = (o2.c) r1
            java.lang.Object r0 = r0.a
            o2.p r0 = (o2.p) r0
            Ca.t.b(r10)     // Catch: java.lang.Throwable -> L34
            goto L6b
        L34:
            r10 = move-exception
            goto L84
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            Ca.t.b(r10)
            r8.f()
            lb.a r10 = r8.f
            boolean r10 = lb.a.a.b(r10, r4, r3, r4)
            o2.n r2 = new o2.n     // Catch: java.lang.Throwable -> L8d
            java.io.File r5 = r8.a     // Catch: java.lang.Throwable -> L8d
            o2.E r6 = r8.b     // Catch: java.lang.Throwable -> L8d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L8d
            java.lang.Boolean r5 = Ia.b.a(r10)     // Catch: java.lang.Throwable -> L7e
            r0.a = r8     // Catch: java.lang.Throwable -> L7e
            r0.b = r2     // Catch: java.lang.Throwable -> L7e
            r0.c = r10     // Catch: java.lang.Throwable -> L7e
            r0.f = r3     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r9 = r9.invoke(r2, r5, r0)     // Catch: java.lang.Throwable -> L7e
            if (r9 != r1) goto L66
            return r1
        L66:
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L6b:
            r1.close()     // Catch: java.lang.Throwable -> L70
            r1 = r4
            goto L71
        L70:
            r1 = move-exception
        L71:
            if (r1 != 0) goto L7b
            if (r9 == 0) goto L7a
            lb.a r9 = r0.f
            lb.a.a.c(r9, r4, r3, r4)
        L7a:
            return r10
        L7b:
            throw r1     // Catch: java.lang.Throwable -> L7c
        L7c:
            r10 = move-exception
            goto L92
        L7e:
            r9 = move-exception
            r0 = r8
            r1 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L84:
            r1.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r1 = move-exception
            Ca.g.a(r10, r1)     // Catch: java.lang.Throwable -> L7c
        L8c:
            throw r10     // Catch: java.lang.Throwable -> L7c
        L8d:
            r9 = move-exception
            r0 = r8
            r7 = r10
            r10 = r9
            r9 = r7
        L92:
            if (r9 == 0) goto L99
            lb.a r9 = r0.f
            lb.a.a.c(r9, r4, r3, r4)
        L99:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.p.b(Qa.q, Ga.e):java.lang.Object");
    }

    public void close() {
        this.e.set(true);
        this.d.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bb A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f0, blocks: (B:19:0x00bb, B:21:0x00c1, B:24:0x00ca, B:25:0x00ef, B:27:0x00f5, B:30:0x00fd, B:57:0x010c, B:59:0x0112, B:60:0x0115, B:37:0x010a, B:40:0x0107, B:44:0x007a, B:46:0x0096), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd A[Catch: all -> 0x00f0, IOException -> 0x00f2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00f0, blocks: (B:19:0x00bb, B:21:0x00c1, B:24:0x00ca, B:25:0x00ef, B:27:0x00f5, B:30:0x00fd, B:57:0x010c, B:59:0x0112, B:60:0x0115, B:37:0x010a, B:40:0x0107, B:44:0x007a, B:46:0x0096), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, lb.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(Qa.p r10, Ga.e r11) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.p.d(Qa.p, Ga.e):java.lang.Object");
    }

    public t e() {
        return this.c;
    }

    public final void g(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }
}
