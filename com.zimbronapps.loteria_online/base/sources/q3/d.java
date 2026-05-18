package q3;

import P2.K;
import P2.o;
import P2.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d implements a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public d(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public static d c(z zVar) {
        int t = zVar.t();
        zVar.U(12);
        int t2 = zVar.t();
        int t3 = zVar.t();
        int t4 = zVar.t();
        zVar.U(4);
        int t5 = zVar.t();
        int t6 = zVar.t();
        zVar.U(8);
        return new d(t, t2, t3, t4, t5, t6);
    }

    public long a() {
        return K.X0(this.e, this.c * 1000000, this.d);
    }

    public int b() {
        int i = this.a;
        if (i == 1935960438) {
            return 2;
        }
        if (i == 1935963489) {
            return 1;
        }
        if (i == 1937012852) {
            return 3;
        }
        o.h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.a));
        return -1;
    }

    public int getType() {
        return 1752331379;
    }
}
