package T2;

import T2.w0;
import U2.x1;
import g3.w;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class r implements w0 {
    public final k3.g a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final HashMap j;
    public long k;

    public static final class b {
        public k3.g a;
        public int b = 50000;
        public int c = 50000;
        public int d = 2500;
        public int e = 5000;
        public int f = -1;
        public boolean g = false;
        public int h = 0;
        public boolean i = false;
        public boolean j;

        public r a() {
            P2.a.f(!this.j);
            this.j = true;
            if (this.a == null) {
                this.a = new k3.g(true, 65536);
            }
            return new r(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public b b(int i, boolean z) {
            P2.a.f(!this.j);
            r.j(i, 0, "backBufferDurationMs", "0");
            this.h = i;
            this.i = z;
            return this;
        }

        public b c(int i, int i2, int i3, int i4) {
            P2.a.f(!this.j);
            r.j(i3, 0, "bufferForPlaybackMs", "0");
            r.j(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
            r.j(i, i3, "minBufferMs", "bufferForPlaybackMs");
            r.j(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
            r.j(i2, i, "maxBufferMs", "minBufferMs");
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            return this;
        }

        public b d(boolean z) {
            P2.a.f(!this.j);
            this.g = z;
            return this;
        }

        public b e(int i) {
            P2.a.f(!this.j);
            this.f = i;
            return this;
        }
    }

    public static class c {
        public boolean a;
        public int b;

        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    public r() {
        this(new k3.g(true, 65536), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public static /* synthetic */ void j(int i, int i2, String str, String str2) {
        k(i, i2, str, str2);
    }

    public static void k(int i, int i2, String str, String str2) {
        P2.a.b(i >= i2, str + " cannot be less than " + str2);
    }

    public static int n(int i) {
        switch (i) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    public void a(x1 x1Var, M2.G g, w.b bVar, W0[] w0Arr, g3.Y y, j3.x[] xVarArr) {
        c cVar = (c) P2.a.e((c) this.j.get(x1Var));
        int i = this.f;
        if (i == -1) {
            i = l(w0Arr, xVarArr);
        }
        cVar.b = i;
        q();
    }

    public void b(x1 x1Var) {
        long id = Thread.currentThread().getId();
        long j = this.k;
        P2.a.g(j == -1 || j == id, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.k = id;
        if (!this.j.containsKey(x1Var)) {
            this.j.put(x1Var, new c(null));
        }
        p(x1Var);
    }

    public boolean c(x1 x1Var) {
        return this.i;
    }

    public boolean d(w0.a aVar) {
        long h0 = P2.K.h0(aVar.e, aVar.f);
        long j = aVar.h ? this.e : this.d;
        long j2 = aVar.i;
        if (j2 != -9223372036854775807L) {
            j = Math.min(j2 / 2, j);
        }
        return j <= 0 || h0 >= j || (!this.g && this.a.f() >= m());
    }

    public boolean e(w0.a aVar) {
        c cVar = (c) P2.a.e((c) this.j.get(aVar.a));
        boolean z = true;
        boolean z2 = this.a.f() >= m();
        long j = this.b;
        float f = aVar.f;
        if (f > 1.0f) {
            j = Math.min(P2.K.c0(j, f), this.c);
        }
        long max = Math.max(j, 500000L);
        long j2 = aVar.e;
        if (j2 < max) {
            if (!this.g && z2) {
                z = false;
            }
            cVar.a = z;
            if (!z && j2 < 500000) {
                P2.o.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.c || z2) {
            cVar.a = false;
        }
        return cVar.a;
    }

    public k3.b f() {
        return this.a;
    }

    public void g(x1 x1Var) {
        o(x1Var);
    }

    public long h(x1 x1Var) {
        return this.h;
    }

    public void i(x1 x1Var) {
        o(x1Var);
        if (this.j.isEmpty()) {
            this.k = -1L;
        }
    }

    public int l(W0[] w0Arr, j3.x[] xVarArr) {
        int i = 0;
        for (int i2 = 0; i2 < w0Arr.length; i2++) {
            if (xVarArr[i2] != null) {
                i += n(w0Arr[i2].g());
            }
        }
        return Math.max(13107200, i);
    }

    public int m() {
        Iterator it = this.j.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((c) it.next()).b;
        }
        return i;
    }

    public final void o(x1 x1Var) {
        if (this.j.remove(x1Var) != null) {
            q();
        }
    }

    public final void p(x1 x1Var) {
        c cVar = (c) P2.a.e((c) this.j.get(x1Var));
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        cVar.b = i;
        cVar.a = false;
    }

    public final void q() {
        if (this.j.isEmpty()) {
            this.a.g();
        } else {
            this.a.h(m());
        }
    }

    public r(k3.g gVar, int i, int i2, int i3, int i4, int i5, boolean z, int i6, boolean z2) {
        k(i3, 0, "bufferForPlaybackMs", "0");
        k(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(i, i3, "minBufferMs", "bufferForPlaybackMs");
        k(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(i2, i, "maxBufferMs", "minBufferMs");
        k(i6, 0, "backBufferDurationMs", "0");
        this.a = gVar;
        this.b = P2.K.K0(i);
        this.c = P2.K.K0(i2);
        this.d = P2.K.K0(i3);
        this.e = P2.K.K0(i4);
        this.f = i5;
        this.g = z;
        this.h = P2.K.K0(i6);
        this.i = z2;
        this.j = new HashMap();
        this.k = -1L;
    }
}
