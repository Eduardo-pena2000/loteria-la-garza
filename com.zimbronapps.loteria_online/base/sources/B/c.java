package B;

import B.i;
import C.o;
import Ca.I;
import Ca.t;
import I0.L;
import I0.V;
import Ia.l;
import Qa.p;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {

    public static final class a extends Ia.d {
        public Object a;
        public /* synthetic */ Object b;
        public int c;

        public a(Ga.e eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.c |= Integer.MIN_VALUE;
            return c.a(null, this);
        }
    }

    public static final class b extends l implements p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ i c;

        public static final class a extends u implements Qa.l {
            public final /* synthetic */ i a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar) {
                super(1);
                this.a = iVar;
            }

            public final void a(long j) {
                this.a.b(new i.a.b(j, null));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((u0.f) obj).u());
                return I.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, Ga.e eVar) {
            super(2, eVar);
            this.c = iVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            b bVar = new b(this.c, eVar);
            bVar.b = obj;
            return bVar;
        }

        public final Object invoke(L l, Ga.e eVar) {
            return create(l, eVar).invokeSuspend(I.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f = Ha.c.f();
            int i = this.a;
            if (i == 0) {
                t.b(obj);
                L l = (L) this.b;
                a aVar = new a(this.c);
                this.a = 1;
                if (c.d(l, aVar, this) == f) {
                    return f;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return I.a;
        }
    }

    public static final class c extends Ia.k implements p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Qa.l c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Qa.l lVar, Ga.e eVar) {
            super(2, eVar);
            this.c = lVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            c cVar = new c(this.c, eVar);
            cVar.b = obj;
            return cVar;
        }

        public final Object invoke(I0.b bVar, Ga.e eVar) {
            return create(bVar, eVar).invokeSuspend(I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = Ha.c.f()
                int r1 = r7.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                Ca.t.b(r8)
                goto L53
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                java.lang.Object r1 = r7.b
                I0.b r1 = (I0.b) r1
                Ca.t.b(r8)
                goto L35
            L22:
                Ca.t.b(r8)
                java.lang.Object r8 = r7.b
                r1 = r8
                I0.b r1 = (I0.b) r1
                r7.b = r1
                r7.a = r3
                java.lang.Object r8 = B.c.a(r1, r7)
                if (r8 != r0) goto L35
                return r0
            L35:
                I0.C r8 = (I0.C) r8
                r8.a()
                Qa.l r4 = r7.c
                long r5 = r8.h()
                u0.f r8 = u0.f.d(r5)
                r4.invoke(r8)
                r8 = 0
                r7.b = r8
                r7.a = r2
                java.lang.Object r8 = C.B.l(r1, r8, r7, r3, r8)
                if (r8 != r0) goto L53
                return r0
            L53:
                I0.C r8 = (I0.C) r8
                if (r8 == 0) goto L5a
                r8.a()
            L5a:
                Ca.I r8 = Ca.I.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: B.c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final /* synthetic */ Object a(I0.b bVar, Ga.e eVar) {
        return b(bVar, eVar);
    }

    /*  JADX ERROR: iliLiI1iLLIL in pass: RegionMakerVisitor
        LI11I1ll1Ii11.iliLiI1iLLIL: Regions count limit reached
        	at LL11ILIl1lL1ii.LiiI1lLILii.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:52)
        	at LL11ILIl1lL1ii.LiiI1lLILii.L1IlILiL1l11Ll(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:9)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0041 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(I0.b r8, Ga.e r9) {
        /*
            boolean r0 = r9 instanceof B.c.a
            if (r0 == 0) goto L13
            r0 = r9
            B.c$a r0 = (B.c.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            B.c$a r0 = new B.c$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.a
            I0.b r8 = (I0.b) r8
            Ca.t.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            Ca.t.b(r9)
        L38:
            r0.a = r8
            r0.c = r3
            r9 = 0
            java.lang.Object r9 = I0.b.m0(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            I0.q r9 = (I0.q) r9
            int r2 = r9.b()
            boolean r2 = I0.v.c(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L5a:
            if (r6 >= r4) goto L6c
            java.lang.Object r7 = r2.get(r6)
            I0.C r7 = (I0.C) r7
            boolean r7 = I0.r.a(r7)
            if (r7 != 0) goto L69
            goto L38
        L69:
            int r6 = r6 + 1
            goto L5a
        L6c:
            java.util.List r8 = r9.c()
            java.lang.Object r8 = r8.get(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: B.c.b(I0.b, Ga.e):java.lang.Object");
    }

    public static final androidx.compose.ui.e c(androidx.compose.ui.e eVar, i iVar) {
        return V.c(eVar, d.a, new b(iVar, null));
    }

    public static final Object d(L l, Qa.l lVar, Ga.e eVar) {
        Object c2 = o.c(l, new c(lVar, null), eVar);
        return c2 == Ha.c.f() ? c2 : I.a;
    }
}
