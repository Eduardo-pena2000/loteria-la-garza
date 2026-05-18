package Q;

import b0.W0;
import b0.z0;
import cb.B0;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class o {
    public AtomicReference a = new AtomicReference((Object) null);
    public final z0 b = W0.a(0.0f);

    public static final class a extends Ia.l implements Qa.p {
        public int a;
        public /* synthetic */ Object b;

        public static final class a extends Ia.l implements Qa.p {
            public int a;
            public final /* synthetic */ B0 b;
            public final /* synthetic */ o c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(B0 b0, o oVar, Ga.e eVar) {
                super(2, eVar);
                this.b = b0;
                this.c = oVar;
            }

            public final Ga.e create(Object obj, Ga.e eVar) {
                return new a(this.b, this.c, eVar);
            }

            public final Object invoke(cb.O o, Ga.e eVar) {
                return create(o, eVar).invokeSuspend(Ca.I.a);
            }

            /*  JADX ERROR: iliLiI1iLLIL in pass: RegionMakerVisitor
                LI11I1ll1Ii11.iliLiI1iLLIL: Regions count limit reached
                	at LL11ILIl1lL1ii.LiiI1lLILii.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:52)
                	at LL11ILIl1lL1ii.LiiI1lLILii.L1IlILiL1l11Ll(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:9)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
                */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:8:0x003a). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = Ha.c.f()
                    int r1 = r8.a
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 3
                    r6 = 2
                    r7 = 1
                    if (r1 == 0) goto L2a
                    if (r1 == r7) goto L26
                    if (r1 == r6) goto L22
                    if (r1 != r5) goto L1a
                    Ca.t.b(r9)     // Catch: java.lang.Throwable -> L18
                    goto L3a
                L18:
                    r9 = move-exception
                    goto L58
                L1a:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L22:
                    Ca.t.b(r9)     // Catch: java.lang.Throwable -> L18
                    goto L4a
                L26:
                    Ca.t.b(r9)
                    goto L3a
                L2a:
                    Ca.t.b(r9)
                    cb.B0 r9 = r8.b
                    if (r9 == 0) goto L3a
                    r8.a = r7
                    java.lang.Object r9 = cb.E0.g(r9, r8)
                    if (r9 != r0) goto L3a
                    return r0
                L3a:
                    Q.o r9 = r8.c     // Catch: java.lang.Throwable -> L18
                    r1 = 1065353216(0x3f800000, float:1.0)
                    Q.o.b(r9, r1)     // Catch: java.lang.Throwable -> L18
                    r8.a = r6     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r9 = cb.Z.a(r3, r8)     // Catch: java.lang.Throwable -> L18
                    if (r9 != r0) goto L4a
                    return r0
                L4a:
                    Q.o r9 = r8.c     // Catch: java.lang.Throwable -> L18
                    Q.o.b(r9, r2)     // Catch: java.lang.Throwable -> L18
                    r8.a = r5     // Catch: java.lang.Throwable -> L18
                    java.lang.Object r9 = cb.Z.a(r3, r8)     // Catch: java.lang.Throwable -> L18
                    if (r9 != r0) goto L3a
                    return r0
                L58:
                    Q.o r0 = r8.c
                    Q.o.b(r0, r2)
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: Q.o.a.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            a aVar = o.this.new a(eVar);
            aVar.b = obj;
            return aVar;
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
            return Ia.b.a(z.Y.a(o.a(o.this), null, cb.i.d((cb.O) this.b, (Ga.i) null, (cb.Q) null, new a((B0) o.a(o.this).getAndSet((Object) null), o.this, null), 3, (Object) null)));
        }
    }

    public static final /* synthetic */ AtomicReference a(o oVar) {
        return oVar.a;
    }

    public static final /* synthetic */ void b(o oVar, float f) {
        oVar.d(f);
    }

    public final float c() {
        return this.b.b();
    }

    public final void d(float f) {
        this.b.q(f);
    }

    public final Object e(Ga.e eVar) {
        Object e = cb.P.e(new a(null), eVar);
        return e == Ha.c.f() ? e : Ca.I.a;
    }
}
