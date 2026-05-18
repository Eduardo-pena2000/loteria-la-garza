package l0;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class p implements Iterable, Ra.a {
    public static final a e = new a(null);
    public static final p f = new p(0, 0, 0, null);
    public final long a;
    public final long b;
    public final long c;
    public final long[] d;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.k kVar) {
            this();
        }

        public final p a() {
            return p.b();
        }

        public a() {
        }
    }

    public static final class b extends Ia.k implements Qa.p {
        public Object a;
        public int b;
        public int c;
        public int d;
        public /* synthetic */ Object e;

        public b(Ga.e eVar) {
            super(2, eVar);
        }

        public final Ga.e create(Object obj, Ga.e eVar) {
            b bVar = p.this.new b(eVar);
            bVar.e = obj;
            return bVar;
        }

        public final Object invoke(Ya.j jVar, Ga.e eVar) {
            return create(jVar, eVar).invokeSuspend(Ca.I.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x00c3  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00d0 -> B:8:0x00f1). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00ef -> B:7:0x00f0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0093 -> B:22:0x00b0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ad -> B:22:0x00b0). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0073 -> B:34:0x0076). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: l0.p.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public p(long j, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = jArr;
    }

    public static final /* synthetic */ long[] a(p pVar) {
        return pVar.d;
    }

    public static final /* synthetic */ p b() {
        return f;
    }

    public static final /* synthetic */ long e(p pVar) {
        return pVar.c;
    }

    public static final /* synthetic */ long f(p pVar) {
        return pVar.b;
    }

    public static final /* synthetic */ long g(p pVar) {
        return pVar.a;
    }

    public final p h(p pVar) {
        p pVar2;
        p pVar3 = f;
        if (pVar == pVar3) {
            return this;
        }
        if (this == pVar3) {
            return pVar3;
        }
        long j = pVar.c;
        long j2 = this.c;
        if (j == j2) {
            long[] jArr = pVar.d;
            long[] jArr2 = this.d;
            if (jArr == jArr2) {
                return new p((~pVar.a) & this.a, (~pVar.b) & this.b, j2, jArr2);
            }
        }
        long[] a2 = a(pVar);
        if (a2 != null) {
            pVar2 = this;
            for (long j3 : a2) {
                pVar2 = pVar2.j(j3);
            }
        } else {
            pVar2 = this;
        }
        if (f(pVar) != 0) {
            for (int i = 0; i < 64; i++) {
                if ((f(pVar) & (1 << i)) != 0) {
                    pVar2 = pVar2.j(e(pVar) + i);
                }
            }
        }
        if (g(pVar) != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if ((g(pVar) & (1 << i2)) != 0) {
                    pVar2 = pVar2.j(e(pVar) + i2 + 64);
                }
            }
        }
        return pVar2;
    }

    public Iterator iterator() {
        return Ya.k.b(new b(null)).iterator();
    }

    public final p j(long j) {
        long[] jArr;
        int a2;
        long j2 = j - this.c;
        long j3 = 0;
        if (kotlin.jvm.internal.t.i(j2, j3) >= 0 && kotlin.jvm.internal.t.i(j2, 64) < 0) {
            long j4 = 1 << ((int) j2);
            long j5 = this.b;
            if ((j5 & j4) != 0) {
                return new p(this.a, j5 & (~j4), this.c, this.d);
            }
        } else if (kotlin.jvm.internal.t.i(j2, 64) >= 0 && kotlin.jvm.internal.t.i(j2, 128) < 0) {
            long j6 = 1 << (((int) j2) - 64);
            long j7 = this.a;
            if ((j7 & j6) != 0) {
                return new p(j7 & (~j6), this.b, this.c, this.d);
            }
        } else if (kotlin.jvm.internal.t.i(j2, j3) < 0 && (jArr = this.d) != null && (a2 = q.a(jArr, j)) >= 0) {
            return new p(this.a, this.b, this.c, q.e(jArr, a2));
        }
        return this;
    }

    public final boolean k(long j) {
        long[] jArr;
        long j2 = j - this.c;
        long j3 = 0;
        return kotlin.jvm.internal.t.i(j2, j3) < 0 || kotlin.jvm.internal.t.i(j2, (long) 64) >= 0 ? kotlin.jvm.internal.t.i(j2, (long) 64) < 0 || kotlin.jvm.internal.t.i(j2, (long) 128) >= 0 ? kotlin.jvm.internal.t.i(j2, j3) <= 0 && (jArr = this.d) != null && q.a(jArr, j) >= 0 : ((1 << (((int) j2) - 64)) & this.a) != 0 : ((1 << ((int) j2)) & this.b) != 0;
    }

    public final long m(long j) {
        long[] jArr = this.d;
        if (jArr != null) {
            return jArr[0];
        }
        if (this.b != 0) {
            return this.c + Long.numberOfTrailingZeros(r0);
        }
        return this.a != 0 ? this.c + 64 + Long.numberOfTrailingZeros(r0) : j;
    }

    public final p n(p pVar) {
        p pVar2;
        p pVar3 = f;
        if (pVar == pVar3) {
            return this;
        }
        if (this == pVar3) {
            return pVar;
        }
        long j = pVar.c;
        long j2 = this.c;
        if (j == j2) {
            long[] jArr = pVar.d;
            long[] jArr2 = this.d;
            if (jArr == jArr2) {
                return new p(pVar.a | this.a, pVar.b | this.b, j2, jArr2);
            }
        }
        int i = 0;
        if (this.d == null) {
            long[] a2 = a(this);
            if (a2 != null) {
                for (long j3 : a2) {
                    pVar = pVar.o(j3);
                }
            }
            if (f(this) != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if ((f(this) & (1 << i2)) != 0) {
                        pVar = pVar.o(e(this) + i2);
                    }
                }
            }
            if (g(this) != 0) {
                while (i < 64) {
                    if ((g(this) & (1 << i)) != 0) {
                        pVar = pVar.o(e(this) + i + 64);
                    }
                    i++;
                }
            }
            return pVar;
        }
        long[] a3 = a(pVar);
        if (a3 != null) {
            pVar2 = this;
            for (long j4 : a3) {
                pVar2 = pVar2.o(j4);
            }
        } else {
            pVar2 = this;
        }
        if (f(pVar) != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if ((f(pVar) & (1 << i3)) != 0) {
                    pVar2 = pVar2.o(e(pVar) + i3);
                }
            }
        }
        if (g(pVar) != 0) {
            while (i < 64) {
                if ((g(pVar) & (1 << i)) != 0) {
                    pVar2 = pVar2.o(e(pVar) + i + 64);
                }
                i++;
            }
        }
        return pVar2;
    }

    public final p o(long j) {
        long j2;
        long j3;
        long[] jArr;
        long j4 = j - this.c;
        long j5 = 0;
        if (kotlin.jvm.internal.t.i(j4, j5) < 0 || kotlin.jvm.internal.t.i(j4, 64) >= 0) {
            long j6 = 64;
            if (kotlin.jvm.internal.t.i(j4, j6) < 0 || kotlin.jvm.internal.t.i(j4, 128) >= 0) {
                long j7 = 128;
                if (kotlin.jvm.internal.t.i(j4, j7) < 0) {
                    long[] jArr2 = this.d;
                    if (jArr2 == null) {
                        return new p(this.a, this.b, this.c, new long[]{j});
                    }
                    int a2 = q.a(jArr2, j);
                    if (a2 < 0) {
                        return new p(this.a, this.b, this.c, q.d(jArr2, -(a2 + 1), j));
                    }
                } else if (!k(j)) {
                    long j8 = this.a;
                    long j9 = this.b;
                    long j10 = this.c;
                    long j11 = j9;
                    long j12 = 1;
                    long j13 = ((j + j12) / j6) * j6;
                    if (kotlin.jvm.internal.t.i(j13, j5) < 0) {
                        j13 = (Long.MAX_VALUE - j7) + j12;
                    }
                    o oVar = null;
                    long j14 = j8;
                    while (true) {
                        if (kotlin.jvm.internal.t.i(j10, j13) >= 0) {
                            j2 = j10;
                            j3 = j11;
                            break;
                        }
                        if (j11 != 0) {
                            if (oVar == null) {
                                oVar = new o(this.d);
                            }
                            for (int i = 0; i < 64; i++) {
                                if ((j11 & (1 << i)) != 0) {
                                    oVar.a(i + j10);
                                }
                            }
                        }
                        if (j14 == 0) {
                            j2 = j13;
                            j3 = 0;
                            break;
                        }
                        j10 += j6;
                        j11 = j14;
                        j14 = 0;
                    }
                    if (oVar == null || (jArr = oVar.b()) == null) {
                        jArr = this.d;
                    }
                    return new p(j14, j3, j2, jArr).o(j);
                }
            } else {
                long j15 = 1 << (((int) j4) - 64);
                long j16 = this.a;
                if ((j16 & j15) == 0) {
                    return new p(j16 | j15, this.b, this.c, this.d);
                }
            }
        } else {
            long j17 = 1 << ((int) j4);
            long j18 = this.b;
            if ((j18 & j17) == 0) {
                return new p(this.a, j18 | j17, this.c, this.d);
            }
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(Da.w.y(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        sb.append(c.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb.append(']');
        return sb.toString();
    }
}
