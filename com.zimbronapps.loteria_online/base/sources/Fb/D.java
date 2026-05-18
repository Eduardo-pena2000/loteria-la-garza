package fb;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class d implements e {
    public final e a;
    public final Qa.l b;
    public final Qa.p c;

    public static final class a implements f {
        public final /* synthetic */ kotlin.jvm.internal.O b;
        public final /* synthetic */ f c;

        public static final class a extends Ia.d {
            public /* synthetic */ Object a;
            public int c;

            public a(Ga.e eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(kotlin.jvm.internal.O o, f fVar) {
            this.b = o;
            this.c = fVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, Ga.e r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof fb.d.a.a
                if (r0 == 0) goto L13
                r0 = r7
                fb.d$a$a r0 = (fb.d.a.a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                fb.d$a$a r0 = new fb.d$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.a
                java.lang.Object r1 = Ha.c.f()
                int r2 = r0.c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                Ca.t.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                Ca.t.b(r7)
                fb.d r7 = fb.d.this
                Qa.l r7 = r7.b
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.O r2 = r5.b
                java.lang.Object r2 = r2.a
                hb.D r4 = gb.s.a
                if (r2 == r4) goto L58
                fb.d r4 = fb.d.this
                Qa.p r4 = r4.c
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                Ca.I r6 = Ca.I.a
                return r6
            L58:
                kotlin.jvm.internal.O r2 = r5.b
                r2.a = r7
                fb.f r7 = r5.c
                r0.c = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                Ca.I r6 = Ca.I.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: fb.d.a.emit(java.lang.Object, Ga.e):java.lang.Object");
        }
    }

    public d(e eVar, Qa.l lVar, Qa.p pVar) {
        this.a = eVar;
        this.b = lVar;
        this.c = pVar;
    }

    public Object collect(f fVar, Ga.e eVar) {
        kotlin.jvm.internal.O o = new kotlin.jvm.internal.O();
        o.a = gb.s.a;
        Object collect = this.a.collect(new a(o, fVar), eVar);
        return collect == Ha.c.f() ? collect : Ca.I.a;
    }
}
