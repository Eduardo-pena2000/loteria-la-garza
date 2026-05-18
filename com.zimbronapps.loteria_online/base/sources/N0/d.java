package n0;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0034 A[PHI: r9
      0x0034: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v14 java.lang.String) binds: [B:4:0x0021, B:8:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(java.lang.StringBuilder r12, java.util.List r13) {
        /*
            java.util.List r0 = Da.u.c()
            java.util.List r13 = Da.B.R(r13)
            int r1 = r13.size()
            r2 = 0
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L11:
            if (r4 >= r1) goto Lc4
            java.lang.Object r7 = r13.get(r4)
            n0.c r7 = (n0.c) r7
            n0.w r8 = r7.d()
            java.lang.String r9 = r8.a()
            if (r9 != 0) goto L34
            boolean r9 = r8.e()
            if (r9 == 0) goto L2c
            java.lang.String r9 = "<lambda>"
            goto L2d
        L2c:
            r9 = r2
        L2d:
            if (r9 != 0) goto L34
            if (r5 != 0) goto L35
            java.lang.String r5 = "<unknown function>"
            goto L35
        L34:
            r5 = r9
        L35:
            java.lang.String r9 = r8.d()
            if (r9 != 0) goto L40
            if (r6 != 0) goto L41
            java.lang.String r6 = "<unknown file>"
            goto L41
        L40:
            r6 = r9
        L41:
            java.util.List r9 = r8.b()
            java.lang.Integer r10 = r7.c()
            if (r10 == 0) goto L70
            java.lang.Integer r10 = r7.c()
            int r10 = r10.intValue()
            int r11 = r9.size()
            if (r10 >= r11) goto L70
            java.lang.Integer r7 = r7.c()
            int r7 = r7.intValue()
            java.lang.Object r7 = r9.get(r7)
            n0.p r7 = (n0.p) r7
            int r7 = r7.a()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            goto L72
        L70:
            java.lang.String r7 = "<unknown line>"
        L72:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r10 = 40
            r9.append(r10)
            r9.append(r6)
            r10 = 58
            r9.append(r10)
            r9.append(r7)
            r7 = 41
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            java.lang.String r9 = "toString(...)"
            kotlin.jvm.internal.t.f(r7, r9)
            boolean r9 = r8.e()
            if (r9 != 0) goto La4
            java.lang.Object r9 = Da.A.M(r0)
            java.lang.String r9 = (java.lang.String) r9
        La4:
            java.lang.String r9 = r8.a()
            java.lang.String r10 = "rememberCompositionContext"
            boolean r9 = kotlin.jvm.internal.t.c(r9, r10)
            if (r9 == 0) goto Lbd
            java.lang.String r8 = r8.c()
            java.lang.String r9 = "9igjgp"
            boolean r8 = kotlin.jvm.internal.t.c(r8, r9)
            if (r8 == 0) goto Lbd
            goto Lc0
        Lbd:
            r0.add(r7)
        Lc0:
            int r4 = r4 + 1
            goto L11
        Lc4:
            java.util.List r13 = Da.u.a(r0)
            java.util.List r13 = Da.B.R(r13)
            int r0 = r13.size()
        Ld0:
            if (r3 >= r0) goto Lfc
            java.lang.Object r1 = r13.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "\tat "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r12.append(r1)
            java.lang.String r1 = "append(...)"
            kotlin.jvm.internal.t.f(r12, r1)
            r2 = 10
            r12.append(r2)
            kotlin.jvm.internal.t.f(r12, r1)
            int r3 = r3 + 1
            goto Ld0
        Lfc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.d.a(java.lang.StringBuilder, java.util.List):void");
    }

    public static final Throwable b(Throwable th, Qa.a aVar) {
        c(th, aVar);
        return th;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean c(java.lang.Throwable r3, Qa.a r4) {
        /*
            java.util.List r0 = Ca.g.b(r3)
            r1 = 0
            if (r0 == 0) goto Le
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto Le
            goto L23
        Le:
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r0.next()
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            boolean r2 = r2 instanceof n0.m
            if (r2 == 0) goto L12
            goto L41
        L23:
            java.lang.Object r4 = r4.invoke()     // Catch: java.lang.Throwable -> L37
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L37
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Throwable -> L37
            r1 = r0 ^ 1
            if (r0 != 0) goto L39
            n0.m r0 = new n0.m     // Catch: java.lang.Throwable -> L37
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L37
            goto L3c
        L37:
            r4 = move-exception
            goto L3b
        L39:
            r0 = 0
            goto L3c
        L3b:
            r0 = r4
        L3c:
            if (r0 == 0) goto L41
            Ca.g.a(r3, r0)
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.d.c(java.lang.Throwable, Qa.a):boolean");
    }
}
