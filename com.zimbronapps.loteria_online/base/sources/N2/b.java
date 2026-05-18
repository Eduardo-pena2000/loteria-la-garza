package N2;

import M2.q;
import P2.K;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import s7.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface b {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {
        public static final a e = new a(-1, -1, -1);
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(q qVar) {
            this(qVar.C, qVar.B, qVar.D);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public int hashCode() {
            return k.b(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
        }

        public String toString() {
            return "AudioFormat[sampleRate=" + this.a + ", channelCount=" + this.b + ", encoding=" + this.c + ']';
        }

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = K.A0(i3) ? K.g0(i3, i2) : -1;
        }
    }

    public static final class b extends Exception {
        public final a a;

        public b(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public b(String str, a aVar) {
            super(str + " " + aVar);
            this.a = aVar;
        }
    }

    boolean b();

    ByteBuffer c();

    a d(a aVar);

    void e(ByteBuffer byteBuffer);

    void f();

    void flush();

    boolean isActive();

    void reset();
}
