package L3;

import L3.s;
import M2.y;
import P2.K;
import P2.z;
import java.io.EOFException;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w implements O {
    public final O a;
    public final s.a b;
    public s h;
    public M2.q i;
    public final d c = new d();
    public int e = 0;
    public int f = 0;
    public byte[] g = K.f;
    public final z d = new z();

    public w(O o, s.a aVar) {
        this.a = o;
        this.b = aVar;
    }

    public static /* synthetic */ void g(w wVar, long j, int i, e eVar) {
        wVar.i(j, i, eVar);
    }

    public void a(long j, int i, int i2, int i3, O.a aVar) {
        if (this.h == null) {
            this.a.a(j, i, i2, i3, aVar);
            return;
        }
        P2.a.b(aVar == null, "DRM on subtitles is not supported");
        int i4 = (this.f - i3) - i2;
        this.h.b(this.g, i4, i2, s.b.b(), new v(this, j, i));
        int i5 = i4 + i2;
        this.e = i5;
        if (i5 == this.f) {
            this.e = 0;
            this.f = 0;
        }
    }

    public void b(M2.q qVar) {
        P2.a.e(qVar.n);
        P2.a.a(y.k(qVar.n) == 3);
        if (!qVar.equals(this.i)) {
            this.i = qVar;
            this.h = this.b.a(qVar) ? this.b.b(qVar) : null;
        }
        if (this.h == null) {
            this.a.b(qVar);
        } else {
            this.a.b(qVar.a().o0("application/x-media3-cues").O(qVar.n).s0(Long.MAX_VALUE).S(this.b.c(qVar)).K());
        }
    }

    public void d(z zVar, int i, int i2) {
        if (this.h == null) {
            this.a.d(zVar, i, i2);
            return;
        }
        h(i);
        zVar.l(this.g, this.f, i);
        this.f += i;
    }

    public int e(M2.i iVar, int i, boolean z, int i2) {
        if (this.h == null) {
            return this.a.e(iVar, i, z, i2);
        }
        h(i);
        int read = iVar.read(this.g, this.f, i);
        if (read != -1) {
            this.f += read;
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void h(int i) {
        int length = this.g.length;
        int i2 = this.f;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.e;
        int max = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.g;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.e, bArr2, 0, i3);
        this.e = 0;
        this.f = i3;
        this.g = bArr2;
    }

    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void i(e eVar, long j, int i) {
        P2.a.h(this.i);
        byte[] a = this.c.a(eVar.a, eVar.c);
        this.d.Q(a);
        this.a.f(this.d, a.length);
        long j2 = eVar.b;
        if (j2 == -9223372036854775807L) {
            P2.a.f(this.i.s == Long.MAX_VALUE);
        } else {
            long j3 = this.i.s;
            j = j3 == Long.MAX_VALUE ? j + j2 : j2 + j3;
        }
        this.a.a(j, i, a.length, 0, null);
    }

    public void k() {
        s sVar = this.h;
        if (sVar != null) {
            sVar.reset();
        }
    }
}
