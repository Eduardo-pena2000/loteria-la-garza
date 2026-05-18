package W;

import Ca.I;
import E.o;
import cb.O;
import v0.r0;
import v0.t0;
import w.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c extends q {
    public final P l;

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public final /* synthetic */ h b;
        public final /* synthetic */ c c;
        public final /* synthetic */ o.b d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h hVar, c cVar, o.b bVar, Ga.e eVar) {
            super(2, eVar);
            this.b = hVar;
            this.c = cVar;
            this.d = bVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            return new a(this.b, this.c, this.d, eVar);
        }

        public final Object invoke(O o, Ga.e eVar) {
            return create(o, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            try {
                if (i == 0) {
                    Ca.t.b(obj);
                    h hVar = this.b;
                    this.a = 1;
                    if (hVar.d(this) == f) {
                        return f;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Ca.t.b(obj);
                }
                c.S1(this.c).u(this.d);
                O0.u.a(this.c);
                return I.a;
            } catch (Throwable th) {
                c.S1(this.c).u(this.d);
                O0.u.a(this.c);
                throw th;
            }
        }
    }

    public /* synthetic */ c(E.k kVar, boolean z, float f, t0 t0Var, Qa.a aVar, kotlin.jvm.internal.k kVar2) {
        this(kVar, z, f, t0Var, aVar);
    }

    public static final /* synthetic */ P S1(c cVar) {
        return cVar.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void J1(E.o.b r18, long r19, float r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            w.P r2 = r0.l
            java.lang.Object[] r3 = r2.b
            java.lang.Object[] r4 = r2.c
            long[] r2 = r2.a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L51
            r6 = 0
            r7 = r6
        L13:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L4c
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L2d:
            if (r12 >= r10) goto L4a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L46
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            W.h r13 = (W.h) r13
            E.o$b r14 = (E.o.b) r14
            r13.h()
        L46:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2d
        L4a:
            if (r10 != r11) goto L51
        L4c:
            if (r7 == r5) goto L51
            int r7 = r7 + 1
            goto L13
        L51:
            boolean r2 = r17.L1()
            r3 = 0
            if (r2 == 0) goto L61
            long r4 = r18.a()
            u0.f r2 = u0.f.d(r4)
            goto L62
        L61:
            r2 = r3
        L62:
            W.h r4 = new W.h
            boolean r5 = r17.L1()
            r6 = r21
            r4.<init>(r2, r6, r5, r3)
            w.P r2 = r0.l
            r2.x(r1, r4)
            cb.O r5 = r17.getCoroutineScope()
            W.c$a r8 = new W.c$a
            r8.<init>(r4, r0, r1, r3)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            cb.i.d(r5, r6, r7, r8, r9, r10)
            O0.u.a(r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: W.c.J1(E.o$b, long, float):void");
    }

    public void K1(x0.f fVar) {
        float f;
        float f2;
        int i;
        int i2;
        int i3;
        float d = ((g) M1().invoke()).d();
        if (d == 0.0f) {
            return;
        }
        P p = this.l;
        Object[] objArr = p.b;
        Object[] objArr2 = p.c;
        long[] jArr = p.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                long j2 = j;
                int i7 = 0;
                while (i7 < i6) {
                    if ((j2 & 255) < 128) {
                        int i8 = (i4 << 3) + i7;
                        float f3 = d;
                        i = i7;
                        i2 = i6;
                        f2 = d;
                        i3 = i5;
                        ((h) objArr2[i8]).e(fVar, r0.q(N1(), f3, 0.0f, 0.0f, 0.0f, 14, null));
                    } else {
                        f2 = d;
                        i = i7;
                        i2 = i6;
                        i3 = i5;
                    }
                    j2 >>= i3;
                    i7 = i + 1;
                    i5 = i3;
                    d = f2;
                    i6 = i2;
                }
                f = d;
                if (i6 != i5) {
                    return;
                }
            } else {
                f = d;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            d = f;
        }
    }

    public void Q1(o.b bVar) {
        h hVar = (h) this.l.e(bVar);
        if (hVar != null) {
            hVar.h();
        }
    }

    public void onDetach() {
        this.l.k();
    }

    public c(E.k kVar, boolean z, float f, t0 t0Var, Qa.a aVar) {
        super(kVar, z, f, t0Var, aVar, null);
        this.l = new P(0, 1, null);
    }
}
