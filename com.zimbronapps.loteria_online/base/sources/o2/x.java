package o2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import o2.F;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x implements t {
    public static final a j = new a(null);
    public static final String k = "Resource deadlock would occur";
    public static final long l = 10;
    public static final long m = 60000;
    public final Ga.i a;
    public final File b;
    public final fb.e c;
    public final String d;
    public final String e;
    public final String f;
    public final lb.a g;
    public final Ca.l h;
    public final Ca.l i;

    public static final class a {

        public static final class a extends Ia.d {
            public Object a;
            public long b;
            public /* synthetic */ Object c;
            public int e;

            public a(Ga.e eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return a.a(a.this, null, this);
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public static final /* synthetic */ Object a(a aVar, FileOutputStream fileOutputStream, Ga.e eVar) {
            return aVar.b(fileOutputStream, eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007a -> B:10:0x007d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object b(java.io.FileOutputStream r14, Ga.e r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof o2.x.a.a
                if (r0 == 0) goto L13
                r0 = r15
                o2.x$a$a r0 = (o2.x.a.a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                o2.x$a$a r0 = new o2.x$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.c
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 != r4) goto L30
                long r5 = r0.b
                java.lang.Object r14 = r0.a
                java.io.FileOutputStream r14 = (java.io.FileOutputStream) r14
                Ca.t.b(r15)
                goto L7d
            L30:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L38:
                Ca.t.b(r15)
                long r5 = o2.x.h()
            L3f:
                long r7 = o2.x.j()
                int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            */
            //  java.lang.String r2 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
            /*
                if (r15 > 0) goto L81
                java.nio.channels.FileChannel r7 = r14.getChannel()     // Catch: java.io.IOException -> L5d
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                r8 = 0
                java.nio.channels.FileLock r15 = r7.lock(r8, r10, r12)     // Catch: java.io.IOException -> L5d
                kotlin.jvm.internal.t.f(r15, r2)     // Catch: java.io.IOException -> L5d
                return r15
            L5d:
                r15 = move-exception
                java.lang.String r2 = r15.getMessage()
                if (r2 == 0) goto L80
                java.lang.String r7 = o2.x.g()
                r8 = 0
                r9 = 0
                boolean r2 = Za.E.T(r2, r7, r8, r3, r9)
                if (r2 != r4) goto L80
                r0.a = r14
                r0.b = r5
                r0.e = r4
                java.lang.Object r15 = cb.Z.a(r5, r0)
                if (r15 != r1) goto L7d
                return r1
            L7d:
                long r7 = (long) r3
                long r5 = r5 * r7
                goto L3f
            L80:
                throw r15
            L81:
                java.nio.channels.FileChannel r7 = r14.getChannel()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                r8 = 0
                java.nio.channels.FileLock r14 = r7.lock(r8, r10, r12)
                kotlin.jvm.internal.t.f(r14, r2)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.x.a.b(java.io.FileOutputStream, Ga.e):java.lang.Object");
        }

        public a() {
        }
    }

    public static final class b extends Ia.l implements Qa.p {
        public int a;

        public b(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return x.this.new b(eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            return Ia.b.d(x.k(x.this).b());
        }
    }

    public static final class c extends Ia.l implements Qa.p {
        public int a;

        public c(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return x.this.new c(eVar);
        }

        public final Object invoke(cb.O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(Ca.I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Ha.c.f();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ca.t.b(obj);
            return Ia.b.d(x.k(x.this).c());
        }
    }

    public static final class d extends kotlin.jvm.internal.u implements Qa.a {

        public static final class a extends kotlin.jvm.internal.u implements Qa.a {
            public final /* synthetic */ x a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(x xVar) {
                super(0);
                this.a = xVar;
            }

            public final File invoke() {
                x xVar = this.a;
                File f = x.f(xVar, x.l(xVar));
                x.e(this.a, f);
                return f;
            }
        }

        public d() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F invoke() {
            F.a aVar = F.b;
            aVar.d();
            return aVar.a(new a(x.this));
        }
    }

    public static final class e extends Ia.d {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public e(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return x.this.d(null, this);
        }
    }

    public static final class f extends kotlin.jvm.internal.u implements Qa.a {
        public f() {
            super(0);
        }

        public final File invoke() {
            x xVar = x.this;
            File f = x.f(xVar, x.i(xVar));
            x.e(x.this, f);
            return f;
        }
    }

    public static final class g extends Ia.d {
        public Object a;
        public Object b;
        public Object c;
        public boolean d;
        public /* synthetic */ Object e;
        public int g;

        public g(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return x.this.a(null, this);
        }
    }

    public x(Ga.i iVar, File file) {
        kotlin.jvm.internal.t.g(iVar, "context");
        kotlin.jvm.internal.t.g(file, "file");
        this.a = iVar;
        this.b = file;
        this.c = A.c.e(file);
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = lb.g.b(false, 1, (Object) null);
        this.h = Ca.m.b(new f());
        this.i = Ca.m.b(new d());
    }

    public static final /* synthetic */ void e(x xVar, File file) {
        xVar.m(file);
    }

    public static final /* synthetic */ File f(x xVar, String str) {
        return xVar.o(str);
    }

    public static final /* synthetic */ String g() {
        return k;
    }

    public static final /* synthetic */ long h() {
        return l;
    }

    public static final /* synthetic */ String i(x xVar) {
        return xVar.d;
    }

    public static final /* synthetic */ long j() {
        return m;
    }

    public static final /* synthetic */ F k(x xVar) {
        return xVar.q();
    }

    public static final /* synthetic */ String l(x xVar) {
        return xVar.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e5 A[Catch: all -> 0x00e9, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00e9, blocks: (B:15:0x00e5, B:24:0x00fe, B:25:0x0101), top: B:7:0x0029, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fe A[Catch: all -> 0x00e9, TRY_ENTER, TryCatch #6 {all -> 0x00e9, blocks: (B:15:0x00e5, B:24:0x00fe, B:25:0x0101), top: B:7:0x0029, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0019  */
    /* JADX WARN: Type inference failed for: r5v0, types: [int, java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(Qa.p r19, Ga.e r20) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.x.a(Qa.p, Ga.e):java.lang.Object");
    }

    public Object b(Ga.e eVar) {
        return this.i.isInitialized() ? Ia.b.d(q().c()) : cb.i.g(this.a, new c(null), eVar);
    }

    public fb.e c() {
        return this.c;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:16:0x00bb, B:30:0x00d9, B:31:0x00dc), top: B:7:0x0024, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:16:0x00bb, B:30:0x00d9, B:31:0x00dc), top: B:7:0x0024, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0013  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(Qa.l r9, Ga.e r10) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.x.d(Qa.l, Ga.e):java.lang.Object");
    }

    public Object getVersion(Ga.e eVar) {
        return this.i.isInitialized() ? Ia.b.d(q().b()) : cb.i.g(this.a, new b(null), eVar);
    }

    public final void m(File file) {
        n(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    public final void n(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    public final File o(String str) {
        return new File(this.b.getAbsolutePath() + str);
    }

    public final File p() {
        return (File) this.h.getValue();
    }

    public final F q() {
        return (F) this.i.getValue();
    }
}
