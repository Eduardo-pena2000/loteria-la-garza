package J3;

import J3.i;
import M2.q;
import M2.x;
import P2.z;
import java.util.Arrays;
import java.util.List;
import o3.H;
import o3.S;
import t7.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h extends i {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean n;

    public static boolean n(z zVar, byte[] bArr) {
        if (zVar.a() < bArr.length) {
            return false;
        }
        int f = zVar.f();
        byte[] bArr2 = new byte[bArr.length];
        zVar.l(bArr2, 0, bArr.length);
        zVar.T(f);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(z zVar) {
        return n(zVar, o);
    }

    public long f(z zVar) {
        return c(H.e(zVar.e()));
    }

    public boolean h(z zVar, long j, i.b bVar) {
        if (n(zVar, o)) {
            byte[] copyOf = Arrays.copyOf(zVar.e(), zVar.g());
            int c = H.c(copyOf);
            List a = H.a(copyOf);
            if (bVar.a != null) {
                return true;
            }
            bVar.a = new q.b().o0("audio/opus").N(c).p0(48000).b0(a).K();
            return true;
        }
        byte[] bArr = p;
        if (!n(zVar, bArr)) {
            P2.a.h(bVar.a);
            return false;
        }
        P2.a.h(bVar.a);
        if (this.n) {
            return true;
        }
        this.n = true;
        zVar.U(bArr.length);
        x d = S.d(r.o(S.k(zVar, false, false).b));
        if (d == null) {
            return true;
        }
        bVar.a = bVar.a.a().h0(d.c(bVar.a.k)).K();
        return true;
    }

    public void l(boolean z) {
        super.l(z);
        if (z) {
            this.n = false;
        }
    }
}
