package h3;

import M2.q;
import P2.K;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class k extends e {
    public byte[] j;
    public volatile boolean k;

    public k(R2.f fVar, R2.j jVar, int i, q qVar, int i2, Object obj, byte[] bArr) {
        k kVar;
        byte[] bArr2;
        super(fVar, jVar, i, qVar, i2, obj, -9223372036854775807L, -9223372036854775807L);
        if (bArr == null) {
            bArr2 = K.f;
            kVar = this;
        } else {
            kVar = this;
            bArr2 = bArr;
        }
        kVar.j = bArr2;
    }

    public final void b() {
        try {
            this.i.g(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.k) {
                i(i2);
                i = this.i.read(this.j, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.k) {
                g(this.j, i2);
            }
            R2.i.a(this.i);
        } catch (Throwable th) {
            R2.i.a(this.i);
            throw th;
        }
    }

    public final void c() {
        this.k = true;
    }

    public abstract void g(byte[] bArr, int i);

    public byte[] h() {
        return this.j;
    }

    public final void i(int i) {
        byte[] bArr = this.j;
        if (bArr.length < i + 16384) {
            this.j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
