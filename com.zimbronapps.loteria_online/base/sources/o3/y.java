package o3;

import M2.q;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class y {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    public final M2.x l;

    public static class a {
        public final long[] a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.a = jArr;
            this.b = jArr2;
        }
    }

    public y(byte[] bArr, int i) {
        P2.y yVar = new P2.y(bArr);
        yVar.p(i * 8);
        this.a = yVar.h(16);
        this.b = yVar.h(16);
        this.c = yVar.h(24);
        this.d = yVar.h(24);
        int h = yVar.h(20);
        this.e = h;
        this.f = j(h);
        this.g = yVar.h(3) + 1;
        int h2 = yVar.h(5) + 1;
        this.h = h2;
        this.i = e(h2);
        this.j = yVar.j(36);
        this.k = null;
        this.l = null;
    }

    public static int e(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int j(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public y a(List list) {
        return new y(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, h(new M2.x(list)));
    }

    public y b(a aVar) {
        return new y(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, aVar, this.l);
    }

    public y c(List list) {
        return new y(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, h(S.d(list)));
    }

    public long d() {
        long j;
        long j2;
        int i = this.d;
        if (i > 0) {
            j = (i + this.c) / 2;
            j2 = 1;
        } else {
            int i2 = this.a;
            j = ((((i2 != this.b || i2 <= 0) ? 4096L : i2) * this.g) * this.h) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public long f() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public M2.q g(byte[] bArr, M2.x xVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        return new q.b().o0("audio/flac").f0(i).N(this.g).p0(this.e).i0(P2.K.e0(this.h)).b0(Collections.singletonList(bArr)).h0(h(xVar)).K();
    }

    public M2.x h(M2.x xVar) {
        M2.x xVar2 = this.l;
        return xVar2 == null ? xVar : xVar2.c(xVar);
    }

    public long i(long j) {
        return P2.K.q((j * this.e) / 1000000, 0L, this.j - 1);
    }

    public y(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, a aVar, M2.x xVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = j(i5);
        this.g = i6;
        this.h = i7;
        this.i = e(i7);
        this.j = j;
        this.k = aVar;
        this.l = xVar;
    }
}
