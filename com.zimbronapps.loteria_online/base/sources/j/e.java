package J;

import androidx.compose.ui.layout.q;
import java.util.List;
import o0.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements f {
    public final int a;
    public final int b;
    public final List c;
    public final long d;
    public final Object e;
    public final e.b f;
    public final e.c g;
    public final n1.t h;
    public final boolean i;
    public final boolean j;
    public final int k;
    public final int[] l;
    public int m;
    public int n;

    public /* synthetic */ e(int i, int i2, List list, long j, Object obj, C.q qVar, e.b bVar, e.c cVar, n1.t tVar, boolean z, kotlin.jvm.internal.k kVar) {
        this(i, i2, list, j, obj, qVar, bVar, cVar, tVar, z);
    }

    public int a() {
        return this.m;
    }

    public final void b(int i) {
        this.m = a() + i;
        int length = this.l.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.j;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                int[] iArr = this.l;
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final int c() {
        return this.k;
    }

    public Object d() {
        return this.e;
    }

    public final int e(androidx.compose.ui.layout.q qVar) {
        return this.j ? qVar.P0() : qVar.W0();
    }

    public final long f(int i) {
        int[] iArr = this.l;
        int i2 = i * 2;
        return n1.o.a(iArr[i2], iArr[i2 + 1]);
    }

    public final int g() {
        return this.b;
    }

    public int getIndex() {
        return this.a;
    }

    public final void h(q.a aVar) {
        if (this.n == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.q qVar = (androidx.compose.ui.layout.q) this.c.get(i);
            long f = f(i);
            if (this.i) {
                f = n1.o.a(this.j ? n1.n.k(f) : (this.n - n1.n.k(f)) - e(qVar), this.j ? (this.n - n1.n.l(f)) - e(qVar) : n1.n.l(f));
            }
            long o = n1.n.o(f, this.d);
            if (this.j) {
                q.a.D0(aVar, qVar, o, 0.0f, null, 6, null);
            } else {
                q.a.v0(aVar, qVar, o, 0.0f, null, 6, null);
            }
        }
    }

    public final void i(int i, int i2, int i3) {
        int W0;
        this.m = i;
        this.n = this.j ? i3 : i2;
        List list = this.c;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.ui.layout.q qVar = (androidx.compose.ui.layout.q) list.get(i4);
            int i5 = i4 * 2;
            if (this.j) {
                int[] iArr = this.l;
                e.b bVar = this.f;
                if (bVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
                iArr[i5] = bVar.a(qVar.W0(), i2, this.h);
                this.l[i5 + 1] = i;
                W0 = qVar.P0();
            } else {
                int[] iArr2 = this.l;
                iArr2[i5] = i;
                int i6 = i5 + 1;
                e.c cVar = this.g;
                if (cVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
                iArr2[i6] = cVar.a(qVar.P0(), i3);
                W0 = qVar.W0();
            }
            i += W0;
        }
    }

    public e(int i, int i2, List list, long j, Object obj, C.q qVar, e.b bVar, e.c cVar, n1.t tVar, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = j;
        this.e = obj;
        this.f = bVar;
        this.g = cVar;
        this.h = tVar;
        this.i = z;
        this.j = qVar == C.q.Vertical;
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            androidx.compose.ui.layout.q qVar2 = (androidx.compose.ui.layout.q) list.get(i4);
            i3 = Math.max(i3, !this.j ? qVar2.P0() : qVar2.W0());
        }
        this.k = i3;
        this.l = new int[this.c.size() * 2];
        this.n = Integer.MIN_VALUE;
    }
}
