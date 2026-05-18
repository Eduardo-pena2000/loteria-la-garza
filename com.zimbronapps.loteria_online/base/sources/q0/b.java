package q0;

import Ca.I;
import Da.D;
import O0.p0;
import P0.d1;
import P0.e1;
import W0.C;
import W0.t;
import W0.v;
import W0.x;
import W0.y;
import Z0.S0;
import Z0.T0;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.r;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.internal.u;
import w.F;
import w.P;
import w.p;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements o, DefaultLifecycleObserver, View.OnAttachStateChangeListener {
    public static final a p = new a(null);
    public static final int q = 8;
    public final AndroidComposeView a;
    public Qa.a b;
    public S0.d c;
    public long k;
    public d1 m;
    public boolean n;
    public final List d = new ArrayList();
    public long e = 100;
    public b f = b.a;
    public boolean g = true;
    public final eb.g h = eb.j.b(1, (eb.a) null, (Qa.l) null, 6, (Object) null);
    public final Handler i = new Handler(Looper.getMainLooper());
    public w.o j = p.b();
    public F l = p.c();
    public final Runnable o = new q0.a(this);

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b a = new b("SHOW_ORIGINAL", 0);
        public static final b b = new b("SHOW_TRANSLATED", 1);
        public static final /* synthetic */ b[] c;
        public static final /* synthetic */ Ja.a d;

        static {
            b[] a2 = a();
            c = a2;
            d = Ja.b.a(a2);
        }

        public b(String str, int i) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{a, b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) c.clone();
        }
    }

    public static final class c {
        public static final c a = new c();

        public static /* synthetic */ void a(b bVar, LongSparseArray longSparseArray) {
            e(bVar, longSparseArray);
        }

        public static final void e(b bVar, LongSparseArray longSparseArray) {
            a.b(bVar, longSparseArray);
        }

        public final void b(b bVar, LongSparseArray longSparseArray) {
            TranslationResponseValue a2;
            CharSequence a3;
            v vVar;
            t b;
            W0.a aVar;
            Qa.l a4;
            int size = longSparseArray.size();
            for (int i = 0; i < size; i++) {
                long keyAt = longSparseArray.keyAt(i);
                ViewTranslationResponse a5 = i.a(longSparseArray.get(keyAt));
                if (a5 != null && (a2 = j.a(a5, "android:text")) != null && (a3 = k.a(a2)) != null && (vVar = (v) bVar.l().c((int) keyAt)) != null && (b = vVar.b()) != null && (aVar = (W0.a) W0.n.a(b.y(), W0.l.a.A())) != null && (a4 = aVar.a()) != null) {
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(q0.b r15, long[] r16, int[] r17, java.util.function.Consumer r18) {
            /*
                r14 = this;
                r0 = r16
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L72
                r3 = r0[r2]
                w.o r5 = r15.l()
                int r3 = (int) r3
                java.lang.Object r3 = r5.c(r3)
                W0.v r3 = (W0.v) r3
                if (r3 == 0) goto L6d
                W0.t r3 = r3.b()
                if (r3 != 0) goto L1c
                goto L6d
            L1c:
                q0.d.a()
                androidx.compose.ui.platform.AndroidComposeView r4 = r15.m()
                android.view.autofill.AutofillId r4 = q0.e.a(r4)
                int r5 = r3.q()
                long r5 = (long) r5
                android.view.translation.ViewTranslationRequest$Builder r4 = q0.c.a(r4, r5)
                W0.m r3 = r3.y()
                W0.y r5 = W0.y.a
                W0.C r5 = r5.J()
                java.lang.Object r3 = W0.n.a(r3, r5)
                r5 = r3
                java.util.List r5 = (java.util.List) r5
                if (r5 == 0) goto L6d
                r12 = 62
                r13 = 0
                java.lang.String r6 = "\n"
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                java.lang.String r3 = p1.a.e(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r3 == 0) goto L6d
                Z0.e r5 = new Z0.e
                r6 = 0
                r7 = 2
                r5.<init>(r3, r6, r7, r6)
                java.lang.String r3 = "android:text"
                android.view.translation.TranslationRequestValue r5 = q0.f.a(r5)
                q0.g.a(r4, r3, r5)
                android.view.translation.ViewTranslationRequest r3 = q0.h.a(r4)
                r4 = r18
                r4.accept(r3)
                goto L6f
            L6d:
                r4 = r18
            L6f:
                int r2 = r2 + 1
                goto L4
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.b.c.c(q0.b, long[], int[], java.util.function.Consumer):void");
        }

        public final void d(b bVar, LongSparseArray longSparseArray) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (kotlin.jvm.internal.t.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                b(bVar, longSparseArray);
            } else {
                bVar.m().post(new l(bVar, longSparseArray));
            }
        }
    }

    public /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public static final class e extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public e(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return b.this.e(this);
        }
    }

    public static final class f extends u implements Qa.p {
        public final /* synthetic */ d1 a;
        public final /* synthetic */ b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(d1 d1Var, b bVar) {
            super(2);
            this.a = d1Var;
            this.b = bVar;
        }

        public final void a(int i, t tVar) {
            if (this.a.a().a(tVar.q())) {
                return;
            }
            b.d(this.b, i, tVar);
            b.c(this.b);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), (t) obj2);
            return I.a;
        }
    }

    public static final class g extends u implements Qa.p {
        public g() {
            super(2);
        }

        public final void a(int i, t tVar) {
            b.d(b.this, i, tVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), (t) obj2);
            return I.a;
        }
    }

    public b(AndroidComposeView androidComposeView, Qa.a aVar) {
        this.a = androidComposeView;
        this.b = aVar;
        this.m = new d1(androidComposeView.getSemanticsOwner().d(), p.b());
    }

    public static /* synthetic */ void b(b bVar) {
        j(bVar);
    }

    public static final /* synthetic */ void c(b bVar) {
        bVar.q();
    }

    public static final /* synthetic */ void d(b bVar, int i, t tVar) {
        bVar.E(i, tVar);
    }

    public static final void j(b bVar) {
        if (bVar.o()) {
            Trace.beginSection("ContentCapture:changeChecker");
            try {
                p0.p(bVar.a, false, 1, null);
                bVar.A();
                Trace.beginSection("ContentCapture:sendAppearEvents");
                bVar.z(bVar.a.getSemanticsOwner().d(), bVar.m);
                I i = I.a;
                Trace.endSection();
                bVar.h(bVar.l());
                bVar.G();
                bVar.n = false;
            } catch (Throwable th) {
                throw th;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void A() {
        F f2 = this.l;
        int[] iArr = f2.b;
        long[] jArr = f2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = iArr[(i << 3) + i3];
                        if (!l().b(i4)) {
                            g(i4);
                            q();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void B(int i, String str) {
        S0.d dVar;
        if (Build.VERSION.SDK_INT >= 29 && (dVar = this.c) != null) {
            AutofillId b2 = dVar.b(i);
            if (b2 != null) {
                dVar.f(b2, str);
            } else {
                L0.a.c("Invalid content capture ID");
                throw new Ca.i();
            }
        }
    }

    public final void C() {
        W0.a aVar;
        Qa.l a2;
        w.o l = l();
        Object[] objArr = l.c;
        long[] jArr = l.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        W0.m y = ((v) objArr[(i << 3) + i3]).b().y();
                        if (kotlin.jvm.internal.t.c(W0.n.a(y, y.a.v()), Boolean.FALSE) && (aVar = (W0.a) W0.n.a(y, W0.l.a.B())) != null && (a2 = aVar.a()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final S0.f D(t tVar, int i) {
        S0.b a2;
        AutofillId a3;
        String e2;
        S0.d dVar = this.c;
        if (dVar == null || Build.VERSION.SDK_INT < 29 || (a2 = S0.e.a(this.a)) == null) {
            return null;
        }
        if (tVar.t() != null) {
            a3 = dVar.b(r3.q());
            if (a3 == null) {
                return null;
            }
        } else {
            a3 = a2.a();
        }
        S0.f c2 = dVar.c(a3, tVar.q());
        if (c2 == null) {
            return null;
        }
        W0.m y = tVar.y();
        y yVar = y.a;
        if (y.e(yVar.B())) {
            return null;
        }
        Bundle a4 = c2.a();
        if (a4 != null) {
            a4.putLong("android.view.contentcapture.EventTimestamp", this.k);
            a4.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
        }
        String str = (String) W0.n.a(y, yVar.I());
        if (str != null) {
            c2.e(tVar.q(), null, null, str);
        }
        if (((Boolean) W0.n.a(y, yVar.w())) != null) {
            c2.b("android.widget.ViewGroup");
        }
        List list = (List) W0.n.a(y, yVar.J());
        if (list != null) {
            c2.b("android.widget.TextView");
            c2.f(p1.a.e(list, "\n", null, null, 0, null, null, 62, null));
        }
        Z0.e eVar = (Z0.e) W0.n.a(y, yVar.g());
        if (eVar != null) {
            c2.b("android.widget.EditText");
            c2.f(eVar);
        }
        List list2 = (List) W0.n.a(y, yVar.d());
        if (list2 != null) {
            c2.c(p1.a.e(list2, "\n", null, null, 0, null, null, 62, null));
        }
        W0.h hVar = (W0.h) W0.n.a(y, yVar.D());
        if (hVar != null && (e2 = e1.e(hVar.p())) != null) {
            c2.b(e2);
        }
        T0 c3 = e1.c(y);
        if (c3 != null) {
            S0 l = c3.l();
            c2.g(n1.v.h(l.i().n()) * l.b().getDensity() * l.b().e1(), 0, 0, 0);
        }
        u0.h j = tVar.j();
        c2.d((int) j.i(), (int) j.l(), 0, 0, (int) (j.j() - j.i()), (int) (j.e() - j.l()));
        return c2;
    }

    public final void E(int i, t tVar) {
        if (o()) {
            H(tVar);
            f(tVar.q(), D(tVar, i));
            k(tVar, new g());
        }
    }

    public final void F(t tVar) {
        if (o()) {
            g(tVar.q());
            List v = tVar.v();
            int size = v.size();
            for (int i = 0; i < size; i++) {
                F((t) v.get(i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G() {
        /*
            r16 = this;
            r0 = r16
            w.F r1 = r0.l
            r1.h()
            w.o r1 = r16.l()
            int[] r2 = r1.b
            java.lang.Object[] r3 = r1.c
            long[] r1 = r1.a
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r6 = 0
        L17:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L31:
            if (r11 >= r9) goto L5b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            W0.v r12 = (W0.v) r12
            w.F r14 = r0.l
            P0.d1 r15 = new P0.d1
            W0.t r12 = r12.b()
            w.o r5 = r16.l()
            r15.<init>(r12, r5)
            r14.s(r13, r15)
        L57:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L31
        L5b:
            if (r9 != r10) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L17
        L62:
            P0.d1 r1 = new P0.d1
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.a
            W0.w r2 = r2.getSemanticsOwner()
            W0.t r2 = r2.d()
            w.o r3 = r16.l()
            r1.<init>(r2, r3)
            r0.m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.b.G():void");
    }

    public final void H(t tVar) {
        W0.a aVar;
        Qa.l a2;
        Qa.l a3;
        W0.m y = tVar.y();
        Boolean bool = (Boolean) W0.n.a(y, y.a.v());
        if (this.f == b.a && kotlin.jvm.internal.t.c(bool, Boolean.TRUE)) {
            W0.a aVar2 = (W0.a) W0.n.a(y, W0.l.a.B());
            if (aVar2 == null || (a3 = aVar2.a()) == null) {
                return;
            }
            return;
        }
        if (this.f != b.b || !kotlin.jvm.internal.t.c(bool, Boolean.FALSE) || (aVar = (W0.a) W0.n.a(y, W0.l.a.B())) == null || (a2 = aVar.a()) == null) {
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0083 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(Ga.e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof q0.b.e
            if (r0 == 0) goto L13
            r0 = r9
            q0.b$e r0 = (q0.b.e) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            q0.b$e r0 = new q0.b$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.a
            eb.i r2 = (eb.i) r2
            Ca.t.b(r9)
        L2f:
            r9 = r2
            goto L4a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            java.lang.Object r2 = r0.a
            eb.i r2 = (eb.i) r2
            Ca.t.b(r9)
            goto L58
        L41:
            Ca.t.b(r9)
            eb.g r9 = r8.h
            eb.i r9 = r9.iterator()
        L4a:
            r0.a = r9
            r0.d = r4
            java.lang.Object r2 = r9.b(r0)
            if (r2 != r1) goto L55
            return r1
        L55:
            r7 = r2
            r2 = r9
            r9 = r7
        L58:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L86
            r2.next()
            boolean r9 = r8.o()
            if (r9 == 0) goto L6c
            r8.p()
        L6c:
            boolean r9 = r8.n
            if (r9 != 0) goto L79
            r8.n = r4
            android.os.Handler r9 = r8.i
            java.lang.Runnable r5 = r8.o
            r9.post(r5)
        L79:
            long r5 = r8.e
            r0.a = r2
            r0.d = r3
            java.lang.Object r9 = cb.Z.a(r5, r0)
            if (r9 != r1) goto L2f
            return r1
        L86:
            Ca.I r9 = Ca.I.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.b.e(Ga.e):java.lang.Object");
    }

    public final void f(int i, S0.f fVar) {
        if (fVar == null) {
            return;
        }
        this.d.add(new m(i, this.k, n.a, fVar));
    }

    public final void g(int i) {
        this.d.add(new m(i, this.k, n.b, null));
    }

    public final void h(w.o oVar) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        int i;
        char c2;
        long j;
        int i2;
        long[] jArr3;
        Object[] objArr;
        d1 d1Var;
        long[] jArr4;
        Object[] objArr2;
        d1 d1Var2;
        Object[] objArr3;
        Object[] objArr4;
        w.o oVar2 = oVar;
        int[] iArr3 = oVar2.b;
        long[] jArr5 = oVar2.a;
        int length = jArr5.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j2 = jArr5[i3];
            char c3 = 7;
            long j3 = -9187201950435737472L;
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j2 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        d1 d1Var3 = (d1) this.l.c(i7);
                        v vVar = (v) oVar2.c(i7);
                        t b2 = vVar != null ? vVar.b() : null;
                        if (b2 == null) {
                            L0.a.c("no value for specified key");
                            throw new Ca.i();
                        }
                        if (d1Var3 == null) {
                            P n = b2.y().n();
                            Object[] objArr5 = n.b;
                            long[] jArr6 = n.a;
                            int length2 = jArr6.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i8 = 0;
                                while (true) {
                                    long j4 = jArr6[i8];
                                    jArr2 = jArr5;
                                    i = length;
                                    if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        int i10 = 0;
                                        while (i10 < i9) {
                                            if ((j4 & 255) < 128) {
                                                C c4 = (C) objArr5[(i8 << 3) + i10];
                                                y yVar = y.a;
                                                objArr4 = objArr5;
                                                if (kotlin.jvm.internal.t.c(c4, yVar.J())) {
                                                    List list = (List) W0.n.a(b2.y(), yVar.J());
                                                    B(b2.q(), String.valueOf(list != null ? (Z0.e) D.h0(list) : null));
                                                }
                                            } else {
                                                objArr4 = objArr5;
                                            }
                                            j4 >>= 8;
                                            i10++;
                                            objArr5 = objArr4;
                                        }
                                        objArr3 = objArr5;
                                        if (i9 != 8) {
                                            break;
                                        }
                                    } else {
                                        objArr3 = objArr5;
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    jArr5 = jArr2;
                                    length = i;
                                    objArr5 = objArr3;
                                    c3 = 7;
                                }
                            } else {
                                jArr2 = jArr5;
                                i = length;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            i = length;
                            P n2 = b2.y().n();
                            Object[] objArr6 = n2.b;
                            long[] jArr7 = n2.a;
                            int length3 = jArr7.length - 2;
                            if (length3 >= 0) {
                                int i11 = 0;
                                while (true) {
                                    long j5 = jArr7[i11];
                                    c2 = 7;
                                    j = -9187201950435737472L;
                                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i12 = 8 - ((~(i11 - length3)) >>> 31);
                                        int i13 = 0;
                                        while (i13 < i12) {
                                            if ((j5 & 255) < 128) {
                                                jArr4 = jArr7;
                                                C c5 = (C) objArr6[(i11 << 3) + i13];
                                                y yVar2 = y.a;
                                                objArr2 = objArr6;
                                                if (kotlin.jvm.internal.t.c(c5, yVar2.J())) {
                                                    List list2 = (List) W0.n.a(d1Var3.b(), yVar2.J());
                                                    Z0.e eVar = list2 != null ? (Z0.e) D.h0(list2) : null;
                                                    d1Var2 = d1Var3;
                                                    List list3 = (List) W0.n.a(b2.y(), yVar2.J());
                                                    Z0.e eVar2 = list3 != null ? (Z0.e) D.h0(list3) : null;
                                                    if (!kotlin.jvm.internal.t.c(eVar, eVar2)) {
                                                        B(b2.q(), String.valueOf(eVar2));
                                                    }
                                                }
                                                j5 >>= 8;
                                                i13++;
                                                jArr7 = jArr4;
                                                objArr6 = objArr2;
                                                d1Var3 = d1Var2;
                                            } else {
                                                jArr4 = jArr7;
                                                objArr2 = objArr6;
                                            }
                                            d1Var2 = d1Var3;
                                            j5 >>= 8;
                                            i13++;
                                            jArr7 = jArr4;
                                            objArr6 = objArr2;
                                            d1Var3 = d1Var2;
                                        }
                                        jArr3 = jArr7;
                                        objArr = objArr6;
                                        d1Var = d1Var3;
                                        if (i12 != 8) {
                                            break;
                                        }
                                    } else {
                                        jArr3 = jArr7;
                                        objArr = objArr6;
                                        d1Var = d1Var3;
                                    }
                                    if (i11 == length3) {
                                        break;
                                    }
                                    i11++;
                                    jArr7 = jArr3;
                                    objArr6 = objArr;
                                    d1Var3 = d1Var;
                                }
                            }
                            i2 = 8;
                        }
                        j = -9187201950435737472L;
                        c2 = 7;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr5;
                        i = length;
                        c2 = c3;
                        j = j3;
                        i2 = i4;
                    }
                    j2 >>= i2;
                    i6++;
                    i4 = i2;
                    j3 = j;
                    iArr3 = iArr2;
                    jArr5 = jArr2;
                    length = i;
                    c3 = c2;
                    oVar2 = oVar;
                }
                iArr = iArr3;
                jArr = jArr5;
                int i14 = length;
                if (i5 != i4) {
                    return;
                } else {
                    length = i14;
                }
            } else {
                iArr = iArr3;
                jArr = jArr5;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            oVar2 = oVar;
            iArr3 = iArr;
            jArr5 = jArr;
        }
    }

    public final void i() {
        W0.a aVar;
        Qa.a a2;
        w.o l = l();
        Object[] objArr = l.c;
        long[] jArr = l.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        W0.m y = ((v) objArr[(i << 3) + i3]).b().y();
                        if (W0.n.a(y, y.a.v()) != null && (aVar = (W0.a) W0.n.a(y, W0.l.a.a())) != null && (a2 = aVar.a()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void k(t tVar, Qa.p pVar) {
        List v = tVar.v();
        int size = v.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = v.get(i2);
            if (l().b(((t) obj).q())) {
                pVar.invoke(Integer.valueOf(i), obj);
                i++;
            }
        }
    }

    public final w.o l() {
        if (this.g) {
            this.g = false;
            this.j = x.a(this.a.getSemanticsOwner(), -1);
            this.k = System.currentTimeMillis();
        }
        return this.j;
    }

    public final AndroidComposeView m() {
        return this.a;
    }

    public final void n() {
        W0.a aVar;
        Qa.l a2;
        w.o l = l();
        Object[] objArr = l.c;
        long[] jArr = l.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        W0.m y = ((v) objArr[(i << 3) + i3]).b().y();
                        if (kotlin.jvm.internal.t.c(W0.n.a(y, y.a.v()), Boolean.TRUE) && (aVar = (W0.a) W0.n.a(y, W0.l.a.B())) != null && (a2 = aVar.a()) != null) {
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final boolean o() {
        return o.W8.a() && this.c != null;
    }

    public void onStart(r rVar) {
        this.c = (S0.d) this.b.invoke();
        E(-1, this.a.getSemanticsOwner().d());
        p();
    }

    public void onStop(r rVar) {
        F(this.a.getSemanticsOwner().d());
        p();
        this.c = null;
    }

    public void onViewDetachedFromWindow(View view) {
        this.i.removeCallbacks(this.o);
        this.c = null;
    }

    public final void p() {
        S0.d dVar = this.c;
        if (dVar == null || Build.VERSION.SDK_INT < 29 || this.d.isEmpty()) {
            return;
        }
        List list = this.d;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m mVar = (m) list.get(i);
            int i2 = d.a[mVar.c().ordinal()];
            if (i2 == 1) {
                S0.f b2 = mVar.b();
                if (b2 != null) {
                    dVar.d(b2.h());
                }
            } else {
                if (i2 != 2) {
                    throw new Ca.o();
                }
                AutofillId b3 = dVar.b(mVar.a());
                if (b3 != null) {
                    dVar.e(b3);
                }
            }
        }
        dVar.a();
        this.d.clear();
    }

    public final void q() {
        this.h.i(I.a);
    }

    public final void r() {
        this.f = b.a;
        i();
    }

    public final void s(long[] jArr, int[] iArr, Consumer consumer) {
        c.a.c(this, jArr, iArr, consumer);
    }

    public final void t() {
        this.f = b.a;
        n();
    }

    public final void u() {
        this.g = true;
        if (o()) {
            q();
        }
    }

    public final void v() {
        this.g = true;
        if (!o() || this.n) {
            return;
        }
        this.n = true;
        this.i.post(this.o);
    }

    public final void w() {
        this.f = b.b;
        C();
    }

    public final void y(b bVar, LongSparseArray longSparseArray) {
        c.a.d(bVar, longSparseArray);
    }

    public final void z(t tVar, d1 d1Var) {
        k(tVar, new f(d1Var, this));
        List v = tVar.v();
        int size = v.size();
        for (int i = 0; i < size; i++) {
            t tVar2 = (t) v.get(i);
            if (l().b(tVar2.q()) && this.l.b(tVar2.q())) {
                Object c2 = this.l.c(tVar2.q());
                if (c2 == null) {
                    L0.a.c("node not present in pruned tree before this change");
                    throw new Ca.i();
                }
                z(tVar2, (d1) c2);
            }
        }
    }

    public void onViewAttachedToWindow(View view) {
    }
}
