package o2;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class n implements C {
    public final File a;
    public final E b;
    public final AtomicBoolean c;

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
            return n.i(n.this, this);
        }
    }

    public n(File file, E e) {
        kotlin.jvm.internal.t.g(file, "file");
        kotlin.jvm.internal.t.g(e, "serializer");
        this.a = file;
        this.b = e;
        this.c = new AtomicBoolean(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [o2.n] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object i(o2.n r7, Ga.e r8) {
        /*
            boolean r0 = r8 instanceof o2.n.a
            if (r0 == 0) goto L13
            r0 = r8
            o2.n$a r0 = (o2.n.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            o2.n$a r0 = new o2.n$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.a
            java.io.Closeable r7 = (java.io.Closeable) r7
            Ca.t.b(r8)     // Catch: java.lang.Throwable -> L32
            goto L9d
        L32:
            r8 = move-exception
            goto La5
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r0.b
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r2 = r0.a
            o2.n r2 = (o2.n) r2
            Ca.t.b(r8)     // Catch: java.lang.Throwable -> L49
            goto L6b
        L49:
            r8 = move-exception
            goto L76
        L4b:
            Ca.t.b(r8)
            r7.f()
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L7c
            java.io.File r2 = r7.a     // Catch: java.io.FileNotFoundException -> L7c
            r8.<init>(r2)     // Catch: java.io.FileNotFoundException -> L7c
            o2.E r2 = r7.b     // Catch: java.lang.Throwable -> L71
            r0.a = r7     // Catch: java.lang.Throwable -> L71
            r0.b = r8     // Catch: java.lang.Throwable -> L71
            r0.e = r4     // Catch: java.lang.Throwable -> L71
            java.lang.Object r2 = r2.readFrom(r8, r0)     // Catch: java.lang.Throwable -> L71
            if (r2 != r1) goto L67
            return r1
        L67:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L6b:
            Na.c.a(r7, r5)     // Catch: java.io.FileNotFoundException -> L6f
            goto Lb1
        L6f:
            r7 = r2
            goto L7c
        L71:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L76:
            throw r8     // Catch: java.lang.Throwable -> L77
        L77:
            r4 = move-exception
            Na.c.a(r7, r8)     // Catch: java.io.FileNotFoundException -> L6f
            throw r4     // Catch: java.io.FileNotFoundException -> L6f
        L7c:
            java.io.File r8 = r7.a
            boolean r8 = r8.exists()
            if (r8 == 0) goto Lab
            java.io.FileInputStream r8 = new java.io.FileInputStream
            java.io.File r2 = r7.a
            r8.<init>(r2)
            o2.E r7 = r7.b     // Catch: java.lang.Throwable -> La1
            r0.a = r8     // Catch: java.lang.Throwable -> La1
            r0.b = r5     // Catch: java.lang.Throwable -> La1
            r0.e = r3     // Catch: java.lang.Throwable -> La1
            java.lang.Object r7 = r7.readFrom(r8, r0)     // Catch: java.lang.Throwable -> La1
            if (r7 != r1) goto L9a
            return r1
        L9a:
            r6 = r8
            r8 = r7
            r7 = r6
        L9d:
            Na.c.a(r7, r5)
            return r8
        La1:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La5:
            throw r8     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            Na.c.a(r7, r8)
            throw r0
        Lab:
            o2.E r7 = r7.b
            java.lang.Object r8 = r7.getDefaultValue()
        Lb1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.n.i(o2.n, Ga.e):java.lang.Object");
    }

    public Object a(Ga.e eVar) {
        return i(this, eVar);
    }

    public void close() {
        this.c.set(true);
    }

    public final void f() {
        if (this.c.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    public final File g() {
        return this.a;
    }

    public final E h() {
        return this.b;
    }
}
