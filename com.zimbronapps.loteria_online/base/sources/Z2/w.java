package Z2;

import L3.s;
import M2.q;
import P2.E;
import P2.z;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o3.I;
import o3.J;
import o3.O;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class w implements o3.p {
    public static final Pattern i = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern j = Pattern.compile("MPEGTS:(-?\\d+)");
    public final String a;
    public final E b;
    public final s.a d;
    public final boolean e;
    public o3.r f;
    public int h;
    public final z c = new z();
    public byte[] g = new byte[1024];

    public w(String str, E e, s.a aVar, boolean z) {
        this.a = str;
        this.b = e;
        this.d = aVar;
        this.e = z;
    }

    public void a(long j2, long j3) {
        throw new IllegalStateException();
    }

    public void b(o3.r rVar) {
        this.f = this.e ? new L3.u(rVar, this.d) : rVar;
        rVar.n(new J.b(-9223372036854775807L));
    }

    public final O c(long j2) {
        O e = this.f.e(0, 3);
        e.b(new q.b().o0("text/vtt").e0(this.a).s0(j2).K());
        this.f.s();
        return e;
    }

    public boolean d(o3.q qVar) {
        qVar.d(this.g, 0, 6, false);
        this.c.R(this.g, 6);
        if (T3.h.b(this.c)) {
            return true;
        }
        qVar.d(this.g, 6, 3, false);
        this.c.R(this.g, 9);
        return T3.h.b(this.c);
    }

    public int e(o3.q qVar, I i2) {
        P2.a.e(this.f);
        int a = (int) qVar.a();
        int i3 = this.h;
        byte[] bArr = this.g;
        if (i3 == bArr.length) {
            this.g = Arrays.copyOf(bArr, ((a != -1 ? a : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.g;
        int i4 = this.h;
        int read = qVar.read(bArr2, i4, bArr2.length - i4);
        if (read != -1) {
            int i5 = this.h + read;
            this.h = i5;
            if (a == -1 || i5 != a) {
                return 0;
            }
        }
        f();
        return -1;
    }

    public final void f() {
        z zVar = new z(this.g);
        T3.h.e(zVar);
        long j2 = 0;
        long j3 = 0;
        for (String r = zVar.r(); !TextUtils.isEmpty(r); r = zVar.r()) {
            if (r.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = i.matcher(r);
                if (!matcher.find()) {
                    throw M2.z.a("X-TIMESTAMP-MAP doesn't contain local timestamp: " + r, null);
                }
                Matcher matcher2 = j.matcher(r);
                if (!matcher2.find()) {
                    throw M2.z.a("X-TIMESTAMP-MAP doesn't contain media timestamp: " + r, null);
                }
                j3 = T3.h.d((String) P2.a.e(matcher.group(1)));
                j2 = E.h(Long.parseLong((String) P2.a.e(matcher2.group(1))));
            }
        }
        Matcher a = T3.h.a(zVar);
        if (a == null) {
            c(0L);
            return;
        }
        long d = T3.h.d((String) P2.a.e(a.group(1)));
        long b = this.b.b(E.l((j2 + d) - j3));
        O c = c(b - d);
        this.c.R(this.g, this.h);
        c.f(this.c, this.h);
        c.a(b, 1, this.h, 0, null);
    }

    public void release() {
    }
}
