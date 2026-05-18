package L3;

import L3.s;
import P2.K;
import P2.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o3.E;
import o3.I;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class o implements o3.p {
    public final s a;
    public final M2.q c;
    public O g;
    public int h;
    public final d b = new d();
    public byte[] f = K.f;
    public final z e = new z();
    public final List d = new ArrayList();
    public int i = 0;
    public long[] j = K.g;
    public long k = -9223372036854775807L;

    public static class b implements Comparable {
        public final long a;
        public final byte[] b;

        public /* synthetic */ b(long j, byte[] bArr, a aVar) {
            this(j, bArr);
        }

        public static /* synthetic */ long a(b bVar) {
            return bVar.a;
        }

        public static /* synthetic */ byte[] b(b bVar) {
            return bVar.b;
        }

        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return Long.compare(this.a, bVar.a);
        }

        public b(long j, byte[] bArr) {
            this.a = j;
            this.b = bArr;
        }
    }

    public o(s sVar, M2.q qVar) {
        this.a = sVar;
        this.c = qVar.a().o0("application/x-media3-cues").O(qVar.n).S(sVar.c()).K();
    }

    public static /* synthetic */ void c(o oVar, e eVar) {
        oVar.f(eVar);
    }

    public void a(long j, long j2) {
        int i = this.i;
        P2.a.f((i == 0 || i == 5) ? false : true);
        this.k = j2;
        if (this.i == 2) {
            this.i = 1;
        }
        if (this.i == 4) {
            this.i = 3;
        }
    }

    public void b(o3.r rVar) {
        P2.a.f(this.i == 0);
        O e = rVar.e(0, 3);
        this.g = e;
        e.b(this.c);
        rVar.s();
        rVar.n(new E(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.i = 1;
    }

    public boolean d(o3.q qVar) {
        return true;
    }

    public int e(o3.q qVar, I i) {
        int i2 = this.i;
        P2.a.f((i2 == 0 || i2 == 5) ? false : true);
        if (this.i == 1) {
            int d = qVar.a() != -1 ? w7.f.d(qVar.a()) : 1024;
            if (d > this.f.length) {
                this.f = new byte[d];
            }
            this.h = 0;
            this.i = 2;
        }
        if (this.i == 2 && i(qVar)) {
            h();
            this.i = 4;
        }
        if (this.i == 3 && k(qVar)) {
            l();
            this.i = 4;
        }
        return this.i == 4 ? -1 : 0;
    }

    public final /* synthetic */ void f(e eVar) {
        b bVar = new b(eVar.b, this.b.a(eVar.a, eVar.c), null);
        this.d.add(bVar);
        long j = this.k;
        if (j == -9223372036854775807L || eVar.b >= j) {
            m(bVar);
        }
    }

    public final void h() {
        try {
            long j = this.k;
            this.a.b(this.f, 0, this.h, j != -9223372036854775807L ? s.b.c(j) : s.b.b(), new n(this));
            Collections.sort(this.d);
            this.j = new long[this.d.size()];
            for (int i = 0; i < this.d.size(); i++) {
                this.j[i] = b.a((b) this.d.get(i));
            }
            this.f = K.f;
        } catch (RuntimeException e) {
            throw M2.z.a("SubtitleParser failed.", e);
        }
    }

    public final boolean i(o3.q qVar) {
        byte[] bArr = this.f;
        if (bArr.length == this.h) {
            this.f = Arrays.copyOf(bArr, bArr.length + 1024);
        }
        byte[] bArr2 = this.f;
        int i = this.h;
        int read = qVar.read(bArr2, i, bArr2.length - i);
        if (read != -1) {
            this.h += read;
        }
        long a2 = qVar.a();
        return (a2 != -1 && ((long) this.h) == a2) || read == -1;
    }

    public final boolean k(o3.q qVar) {
        return qVar.c((qVar.a() > (-1L) ? 1 : (qVar.a() == (-1L) ? 0 : -1)) != 0 ? w7.f.d(qVar.a()) : 1024) == -1;
    }

    public final void l() {
        long j = this.k;
        for (int h = j == -9223372036854775807L ? 0 : K.h(this.j, j, true, true); h < this.d.size(); h++) {
            m((b) this.d.get(h));
        }
    }

    public final void m(b bVar) {
        P2.a.h(this.g);
        int length = b.b(bVar).length;
        this.e.Q(b.b(bVar));
        this.g.f(this.e, length);
        this.g.a(b.a(bVar), 1, length, 0, null);
    }

    public void release() {
        if (this.i == 5) {
            return;
        }
        this.a.reset();
        this.i = 5;
    }
}
