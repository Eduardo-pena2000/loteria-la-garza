package J3;

import P2.z;
import java.util.Arrays;
import o3.q;
import o3.s;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public final f a = new f();
    public final z b = new z(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            f fVar = this.a;
            if (i5 >= fVar.g) {
                break;
            }
            int[] iArr = fVar.j;
            this.d = i4 + 1;
            i2 = iArr[i4 + i];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public f b() {
        return this.a;
    }

    public z c() {
        return this.b;
    }

    public boolean d(q qVar) {
        int i;
        P2.a.f(qVar != null);
        if (this.e) {
            this.e = false;
            this.b.P(0);
        }
        while (!this.e) {
            if (this.c < 0) {
                if (!this.a.c(qVar) || !this.a.a(qVar, true)) {
                    return false;
                }
                f fVar = this.a;
                int i2 = fVar.h;
                if ((fVar.b & 1) == 1 && this.b.g() == 0) {
                    i2 += a(0);
                    i = this.d;
                } else {
                    i = 0;
                }
                if (!s.e(qVar, i2)) {
                    return false;
                }
                this.c = i;
            }
            int a = a(this.c);
            int i3 = this.c + this.d;
            if (a > 0) {
                z zVar = this.b;
                zVar.c(zVar.g() + a);
                if (!s.d(qVar, this.b.e(), this.b.g(), a)) {
                    return false;
                }
                z zVar2 = this.b;
                zVar2.S(zVar2.g() + a);
                this.e = this.a.j[i3 + (-1)] != 255;
            }
            if (i3 == this.a.g) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }

    public void e() {
        this.a.b();
        this.b.P(0);
        this.c = -1;
        this.e = false;
    }

    public void f() {
        if (this.b.e().length == 65025) {
            return;
        }
        z zVar = this.b;
        zVar.R(Arrays.copyOf(zVar.e(), Math.max(65025, this.b.g())), this.b.g());
    }
}
