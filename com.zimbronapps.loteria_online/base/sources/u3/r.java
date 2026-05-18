package U3;

import M2.q;
import U3.K;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class r implements m {
    public O b;
    public boolean c;
    public int e;
    public int f;
    public final P2.z a = new P2.z(10);
    public long d = -9223372036854775807L;

    public void a() {
        this.c = false;
        this.d = -9223372036854775807L;
    }

    public void c(P2.z zVar) {
        P2.a.h(this.b);
        if (this.c) {
            int a = zVar.a();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(zVar.e(), zVar.f(), this.a.e(), this.f, min);
                if (this.f + min == 10) {
                    this.a.T(0);
                    if (73 != this.a.G() || 68 != this.a.G() || 51 != this.a.G()) {
                        P2.o.h("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        this.a.U(3);
                        this.e = this.a.F() + 10;
                    }
                }
            }
            int min2 = Math.min(a, this.e - this.f);
            this.b.f(zVar, min2);
            this.f += min2;
        }
    }

    public void d(o3.r rVar, K.d dVar) {
        dVar.a();
        O e = rVar.e(dVar.c(), 5);
        this.b = e;
        e.b(new q.b().a0(dVar.b()).o0("application/id3").K());
    }

    public void e(boolean z) {
        int i;
        P2.a.h(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            P2.a.f(this.d != -9223372036854775807L);
            this.b.a(this.d, 1, this.e, 0, null);
            this.c = false;
        }
    }

    public void f(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = j;
        this.e = 0;
        this.f = 0;
    }
}
