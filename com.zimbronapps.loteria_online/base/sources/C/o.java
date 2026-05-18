package C;

import Ca.I;
import I0.L;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class o {

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
            return o.b(null, this);
        }
    }

    public static final class b extends Ia.k implements Qa.p {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Ga.i c;
        public final /* synthetic */ Qa.p d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ga.i iVar, Qa.p pVar, Ga.e eVar) {
            super(2, eVar);
            this.c = iVar;
            this.d = pVar;
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            b bVar = new b(this.c, this.d, eVar);
            bVar.b = obj;
            return bVar;
        }

        public final Object invoke(I0.b bVar, Ga.e eVar) {
            return create(bVar, eVar).invokeSuspend(I.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v2, types: [I0.b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [I0.b, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0059 -> B:8:0x0028). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0070 -> B:8:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = Ha.c.f()
                int r1 = r7.a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L34
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                java.lang.Object r1 = r7.b
                I0.b r1 = (I0.b) r1
                Ca.t.b(r8)
                goto L28
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.b
                I0.b r1 = (I0.b) r1
                Ca.t.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            L28:
                r8 = r1
                goto L3b
            L2a:
                r8 = move-exception
                goto L60
            L2c:
                java.lang.Object r1 = r7.b
                I0.b r1 = (I0.b) r1
                Ca.t.b(r8)     // Catch: java.util.concurrent.CancellationException -> L2a
                goto L51
            L34:
                Ca.t.b(r8)
                java.lang.Object r8 = r7.b
                I0.b r8 = (I0.b) r8
            L3b:
                Ga.i r1 = r7.c
                boolean r1 = cb.E0.p(r1)
                if (r1 == 0) goto L74
                Qa.p r1 = r7.d     // Catch: java.util.concurrent.CancellationException -> L5c
                r7.b = r8     // Catch: java.util.concurrent.CancellationException -> L5c
                r7.a = r4     // Catch: java.util.concurrent.CancellationException -> L5c
                java.lang.Object r1 = r1.invoke(r8, r7)     // Catch: java.util.concurrent.CancellationException -> L5c
                if (r1 != r0) goto L50
                return r0
            L50:
                r1 = r8
            L51:
                r7.b = r1     // Catch: java.util.concurrent.CancellationException -> L2a
                r7.a = r3     // Catch: java.util.concurrent.CancellationException -> L2a
                java.lang.Object r8 = C.o.b(r1, r7)     // Catch: java.util.concurrent.CancellationException -> L2a
                if (r8 != r0) goto L28
                return r0
            L5c:
                r1 = move-exception
                r6 = r1
                r1 = r8
                r8 = r6
            L60:
                Ga.i r5 = r7.c
                boolean r5 = cb.E0.p(r5)
                if (r5 == 0) goto L73
                r7.b = r1
                r7.a = r2
                java.lang.Object r8 = C.o.b(r1, r7)
                if (r8 != r0) goto L28
                return r0
            L73:
                throw r8
            L74:
                Ca.I r8 = Ca.I.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: C.o.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final boolean a(I0.b bVar) {
        List c = bVar.H0().c();
        int size = c.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((I0.C) c.get(i)).i()) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        if (a(r6) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:10:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(I0.b r6, Ga.e r7) {
        /*
            boolean r0 = r7 instanceof C.o.a
            if (r0 == 0) goto L13
            r0 = r7
            C.o$a r0 = (C.o.a) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            C.o$a r0 = new C.o$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            java.lang.Object r1 = Ha.c.f()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.a
            I0.b r6 = (I0.b) r6
            Ca.t.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            Ca.t.b(r7)
            boolean r7 = a(r6)
            if (r7 != 0) goto L68
        L3e:
            I0.s r7 = I0.s.c
            r0.a = r6
            r0.c = r3
            java.lang.Object r7 = r6.n0(r7, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            I0.q r7 = (I0.q) r7
            java.util.List r7 = r7.c()
            int r2 = r7.size()
            r4 = 0
        L56:
            if (r4 >= r2) goto L68
            java.lang.Object r5 = r7.get(r4)
            I0.C r5 = (I0.C) r5
            boolean r5 = r5.i()
            if (r5 == 0) goto L65
            goto L3e
        L65:
            int r4 = r4 + 1
            goto L56
        L68:
            Ca.I r6 = Ca.I.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: C.o.b(I0.b, Ga.e):java.lang.Object");
    }

    public static final Object c(L l, Qa.p pVar, Ga.e eVar) {
        Object S0 = l.S0(new b(eVar.getContext(), pVar, null), eVar);
        return S0 == Ha.c.f() ? S0 : I.a;
    }
}
