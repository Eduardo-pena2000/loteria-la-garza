package W0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class u {
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075 A[LOOP:0: B:4:0x0016->B:46:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007a A[EDGE_INSN: B:47:0x007a->B:49:0x007a BREAK  A[LOOP:0: B:4:0x0016->B:46:0x0075], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final W0.t a(O0.J r10, boolean r11) {
        /*
            O0.c0 r0 = r10.s0()
            r1 = 8
            int r1 = O0.g0.a(r1)
            int r2 = O0.c0.c(r0)
            r2 = r2 & r1
            r3 = 0
            if (r2 == 0) goto L7a
            androidx.compose.ui.e$c r0 = r0.k()
        L16:
            if (r0 == 0) goto L7a
            int r2 = r0.getKindSet$ui_release()
            r2 = r2 & r1
            if (r2 == 0) goto L6e
            r2 = r0
            r4 = r3
        L21:
            if (r2 == 0) goto L6e
            boolean r5 = r2 instanceof O0.A0
            if (r5 == 0) goto L29
            r3 = r2
            goto L7a
        L29:
            int r5 = r2.getKindSet$ui_release()
            r5 = r5 & r1
            if (r5 == 0) goto L69
            boolean r5 = r2 instanceof O0.m
            if (r5 == 0) goto L69
            r5 = r2
            O0.m r5 = (O0.m) r5
            androidx.compose.ui.e$c r5 = r5.F1()
            r6 = 0
            r7 = r6
        L3d:
            r8 = 1
            if (r5 == 0) goto L66
            int r9 = r5.getKindSet$ui_release()
            r9 = r9 & r1
            if (r9 == 0) goto L61
            int r7 = r7 + 1
            if (r7 != r8) goto L4d
            r2 = r5
            goto L61
        L4d:
            if (r4 != 0) goto L58
            d0.c r4 = new d0.c
            r8 = 16
            androidx.compose.ui.e$c[] r8 = new androidx.compose.ui.e.c[r8]
            r4.<init>(r8, r6)
        L58:
            if (r2 == 0) goto L5e
            r4.b(r2)
            r2 = r3
        L5e:
            r4.b(r5)
        L61:
            androidx.compose.ui.e$c r5 = r5.getChild$ui_release()
            goto L3d
        L66:
            if (r7 != r8) goto L69
            goto L21
        L69:
            androidx.compose.ui.e$c r2 = O0.k.b(r4)
            goto L21
        L6e:
            int r2 = r0.getAggregateChildKindSet$ui_release()
            r2 = r2 & r1
            if (r2 == 0) goto L7a
            androidx.compose.ui.e$c r0 = r0.getChild$ui_release()
            goto L16
        L7a:
            kotlin.jvm.internal.t.d(r3)
            O0.A0 r3 = (O0.A0) r3
            androidx.compose.ui.e$c r0 = r3.getNode()
            W0.m r1 = r10.c()
            if (r1 != 0) goto L8e
            W0.m r1 = new W0.m
            r1.<init>()
        L8e:
            W0.t r2 = new W0.t
            r2.<init>(r0, r11, r10, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: W0.u.a(O0.J, boolean):W0.t");
    }

    public static final /* synthetic */ int b(t tVar) {
        return e(tVar);
    }

    public static final /* synthetic */ h c(t tVar) {
        return f(tVar);
    }

    public static final /* synthetic */ int d(t tVar) {
        return g(tVar);
    }

    public static final int e(t tVar) {
        return tVar.q() + 2000000000;
    }

    public static final h f(t tVar) {
        return (h) n.a(tVar.y(), y.a.D());
    }

    public static final int g(t tVar) {
        return tVar.q() + 1000000000;
    }
}
