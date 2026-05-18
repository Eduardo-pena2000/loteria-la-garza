package J3;

import J3.i;
import M2.q;
import P2.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o3.S;
import t7.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class j extends i {
    public a n;
    public int o;
    public boolean p;
    public S.c q;
    public S.a r;

    public static final class a {
        public final S.c a;
        public final S.a b;
        public final byte[] c;
        public final S.b[] d;
        public final int e;

        public a(S.c cVar, S.a aVar, byte[] bArr, S.b[] bVarArr, int i) {
            this.a = cVar;
            this.b = aVar;
            this.c = bArr;
            this.d = bVarArr;
            this.e = i;
        }
    }

    public static void n(z zVar, long j) {
        if (zVar.b() < zVar.g() + 4) {
            zVar.Q(Arrays.copyOf(zVar.e(), zVar.g() + 4));
        } else {
            zVar.S(zVar.g() + 4);
        }
        byte[] e = zVar.e();
        e[zVar.g() - 4] = (byte) (j & 255);
        e[zVar.g() - 3] = (byte) ((j >>> 8) & 255);
        e[zVar.g() - 2] = (byte) ((j >>> 16) & 255);
        e[zVar.g() - 1] = (byte) ((j >>> 24) & 255);
    }

    public static int o(byte b, a aVar) {
        return !aVar.d[p(b, aVar.e, 1)].a ? aVar.a.g : aVar.a.h;
    }

    public static int p(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static boolean r(z zVar) {
        try {
            return S.o(1, zVar, true);
        } catch (M2.z unused) {
            return false;
        }
    }

    public void e(long j) {
        super.e(j);
        this.p = j != 0;
        S.c cVar = this.q;
        this.o = cVar != null ? cVar.g : 0;
    }

    public long f(z zVar) {
        if ((zVar.e()[0] & 1) == 1) {
            return -1L;
        }
        int o = o(zVar.e()[0], (a) P2.a.h(this.n));
        long j = this.p ? (this.o + o) / 4 : 0;
        n(zVar, j);
        this.p = true;
        this.o = o;
        return j;
    }

    public boolean h(z zVar, long j, i.b bVar) {
        if (this.n != null) {
            P2.a.e(bVar.a);
            return false;
        }
        a q = q(zVar);
        this.n = q;
        if (q == null) {
            return true;
        }
        S.c cVar = q.a;
        List arrayList = new ArrayList();
        arrayList.add(cVar.j);
        arrayList.add(q.c);
        bVar.a = new q.b().o0("audio/vorbis").M(cVar.e).j0(cVar.d).N(cVar.b).p0(cVar.c).b0(arrayList).h0(S.d(r.o(q.b.b))).K();
        return true;
    }

    public void l(boolean z) {
        super.l(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }

    public a q(z zVar) {
        S.c cVar = this.q;
        if (cVar == null) {
            this.q = S.l(zVar);
            return null;
        }
        S.a aVar = this.r;
        if (aVar == null) {
            this.r = S.j(zVar);
            return null;
        }
        byte[] bArr = new byte[zVar.g()];
        System.arraycopy(zVar.e(), 0, bArr, 0, zVar.g());
        return new a(cVar, aVar, bArr, S.m(zVar, cVar.b), S.b(r4.length - 1));
    }
}
