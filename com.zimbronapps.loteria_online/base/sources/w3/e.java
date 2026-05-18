package w3;

import o3.A;
import o3.J;
import o3.K;
import o3.O;
import o3.r;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e implements r {
    public final long a;
    public final r b;

    public class a extends A {
        public final /* synthetic */ J b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J j, J j2) {
            super(j);
            this.b = j2;
        }

        public J.a f(long j) {
            J.a f = this.b.f(j);
            K k = f.a;
            K k2 = new K(k.a, k.b + e.a(e.this));
            K k3 = f.b;
            return new J.a(k2, new K(k3.a, k3.b + e.a(e.this)));
        }
    }

    public e(long j, r rVar) {
        this.a = j;
        this.b = rVar;
    }

    public static /* synthetic */ long a(e eVar) {
        return eVar.a;
    }

    public O e(int i, int i2) {
        return this.b.e(i, i2);
    }

    public void n(J j) {
        this.b.n(new a(j, j));
    }

    public void s() {
        this.b.s();
    }
}
