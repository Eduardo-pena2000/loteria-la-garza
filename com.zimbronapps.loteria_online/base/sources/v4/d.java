package V4;

import V4.i;
import V4.p;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import v0.M;
import v0.N;
import xb.L;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements i {
    public static final a e = new a(null);
    public final p a;
    public final e5.m b;
    public final lb.h c;
    public final l d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends xb.o {
        public Exception b;

        public b(L l) {
            super(l);
        }

        public long F(xb.e eVar, long j) {
            try {
                return super.F(eVar, j);
            } catch (Exception e) {
                this.b = e;
                throw e;
            }
        }

        public final Exception b() {
            return this.b;
        }
    }

    public static final class c implements i.a {
        public final l a;
        public final lb.h b;

        public c(int i, l lVar) {
            this.a = lVar;
            this.b = lb.l.b(i, 0, 2, (Object) null);
        }

        public i a(Y4.m mVar, e5.m mVar2, T4.d dVar) {
            return new d(mVar.b(), mVar2, this.b, this.a);
        }

        public boolean equals(Object obj) {
            return obj instanceof c;
        }

        public int hashCode() {
            return c.class.hashCode();
        }
    }

    public static final class d extends Ia.d {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public d(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return d.this.a(this);
        }
    }

    public static final class e extends u implements Qa.a {
        public e() {
            super(0);
        }

        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return d.b(d.this, new BitmapFactory.Options());
        }
    }

    public d(p pVar, e5.m mVar, lb.h hVar, l lVar) {
        this.a = pVar;
        this.b = mVar;
        this.c = hVar;
        this.d = lVar;
    }

    public static final /* synthetic */ g b(d dVar, BitmapFactory.Options options) {
        return dVar.e(options);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(Ga.e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof V4.d.d
            if (r0 == 0) goto L13
            r0 = r8
            V4.d$d r0 = (V4.d.d) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            V4.d$d r0 = new V4.d$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r0 = r0.a
            lb.h r0 = (lb.h) r0
            Ca.t.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L70
        L30:
            r8 = move-exception
            goto L7a
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            java.lang.Object r2 = r0.b
            lb.h r2 = (lb.h) r2
            java.lang.Object r5 = r0.a
            V4.d r5 = (V4.d) r5
            Ca.t.b(r8)
            r8 = r2
            goto L5a
        L47:
            Ca.t.b(r8)
            lb.h r8 = r7.c
            r0.a = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r2 = r8.a(r0)
            if (r2 != r1) goto L59
            return r1
        L59:
            r5 = r7
        L5a:
            V4.d$e r2 = new V4.d$e     // Catch: java.lang.Throwable -> L76
            r2.<init>()     // Catch: java.lang.Throwable -> L76
            r0.a = r8     // Catch: java.lang.Throwable -> L76
            r5 = 0
            r0.b = r5     // Catch: java.lang.Throwable -> L76
            r0.e = r3     // Catch: java.lang.Throwable -> L76
            java.lang.Object r0 = cb.y0.c(r5, r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L76
            if (r0 != r1) goto L6d
            return r1
        L6d:
            r6 = r0
            r0 = r8
            r8 = r6
        L70:
            V4.g r8 = (V4.g) r8     // Catch: java.lang.Throwable -> L30
            r0.release()
            return r8
        L76:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L7a:
            r0.release()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V4.d.a(Ga.e):java.lang.Object");
    }

    public final void c(BitmapFactory.Options options, j jVar) {
        Bitmap.Config f = this.b.f();
        if (jVar.b() || n.a(jVar)) {
            f = j5.a.e(f);
        }
        if (this.b.d() && f == Bitmap.Config.ARGB_8888 && t.c(options.outMimeType, "image/jpeg")) {
            f = Bitmap.Config.RGB_565;
        }
        if (Build.VERSION.SDK_INT >= 26 && V4.c.a(options) == M.a() && f != N.a()) {
            f = M.a();
        }
        options.inPreferredConfig = f;
    }

    public final void d(BitmapFactory.Options options, j jVar) {
        p.a a2 = this.a.a();
        if ((a2 instanceof r) && f5.b.a(this.b.n())) {
            options.inSampleSize = 1;
            options.inScaled = true;
            options.inDensity = ((r) a2).a();
            options.inTargetDensity = this.b.g().getResources().getDisplayMetrics().densityDpi;
            return;
        }
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            options.inSampleSize = 1;
            options.inScaled = false;
            return;
        }
        int i = n.b(jVar) ? options.outHeight : options.outWidth;
        int i2 = n.b(jVar) ? options.outWidth : options.outHeight;
        f5.h n = this.b.n();
        int z = f5.b.a(n) ? i : j5.j.z(n.b(), this.b.m());
        f5.h n2 = this.b.n();
        int z2 = f5.b.a(n2) ? i2 : j5.j.z(n2.a(), this.b.m());
        int a3 = h.a(i, i2, z, z2, this.b.m());
        options.inSampleSize = a3;
        double b2 = h.b(i / a3, i2 / a3, z, z2, this.b.m());
        if (this.b.c()) {
            b2 = Wa.n.g(b2, 1.0d);
        }
        boolean z3 = b2 == 1.0d;
        options.inScaled = !z3;
        if (z3) {
            return;
        }
        if (b2 > 1.0d) {
            options.inDensity = Sa.c.c(Integer.MAX_VALUE / b2);
            options.inTargetDensity = Integer.MAX_VALUE;
        } else {
            options.inDensity = Integer.MAX_VALUE;
            options.inTargetDensity = Sa.c.c(Integer.MAX_VALUE * b2);
        }
    }

    public final g e(BitmapFactory.Options options) {
        b bVar = new b(this.a.b());
        xb.g d2 = x.d(bVar);
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(d2.peek().inputStream(), (Rect) null, options);
        Exception b2 = bVar.b();
        if (b2 != null) {
            throw b2;
        }
        options.inJustDecodeBounds = false;
        m mVar = m.a;
        j a2 = mVar.a(options.outMimeType, d2, this.d);
        Exception b3 = bVar.b();
        if (b3 != null) {
            throw b3;
        }
        options.inMutable = false;
        if (Build.VERSION.SDK_INT >= 26 && this.b.e() != null) {
            V4.b.a(options, this.b.e());
        }
        options.inPremultiplied = this.b.l();
        c(options, a2);
        d(options, a2);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(d2.inputStream(), (Rect) null, options);
            Na.c.a(d2, (Throwable) null);
            Exception b4 = bVar.b();
            if (b4 != null) {
                throw b4;
            }
            if (decodeStream == null) {
                throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
            }
            decodeStream.setDensity(this.b.g().getResources().getDisplayMetrics().densityDpi);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.b.g().getResources(), mVar.b(decodeStream, a2));
            if (options.inSampleSize <= 1 && !options.inScaled) {
                z = false;
            }
            return new g(bitmapDrawable, z);
        } finally {
        }
    }
}
