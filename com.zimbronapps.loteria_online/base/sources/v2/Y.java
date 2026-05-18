package V2;

import U2.x1;
import android.media.AudioDeviceInfo;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface y {

    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final boolean d;
        public final boolean e;
        public final int f;

        public a(int i, int i2, int i3, boolean z, boolean z2, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = z;
            this.e = z2;
            this.f = i4;
        }
    }

    public static final class c extends Exception {
        public final int a;
        public final boolean b;
        public final M2.q c;

        public c(int i, int i2, int i3, int i4, M2.q qVar, boolean z, Exception exc) {
            StringBuilder sb = new StringBuilder();
            sb.append("AudioTrack init failed ");
            sb.append(i);
            sb.append(" ");
            sb.append("Config(");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(i4);
            sb.append(")");
            sb.append(" ");
            sb.append(qVar);
            sb.append(z ? " (recoverable)" : "");
            super(sb.toString(), exc);
            this.a = i;
            this.b = z;
            this.c = qVar;
        }
    }

    public interface d {
        void a(boolean z);

        void b(Exception exc);

        void c(long j);

        void d(a aVar);

        void e(a aVar);

        void f();

        void g();

        void h(int i, long j, long j2);

        void i();

        void j();

        void k();
    }

    public static final class e extends Exception {
        public final long a;
        public final long b;

        public e(long j, long j2) {
            super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
            this.a = j;
            this.b = j2;
        }
    }

    public static final class f extends Exception {
        public final int a;
        public final boolean b;
        public final M2.q c;

        public f(int i, M2.q qVar, boolean z) {
            super("AudioTrack write failed: " + i);
            this.b = z;
            this.a = i;
            this.c = qVar;
        }
    }

    k A(M2.q qVar);

    boolean a(M2.q qVar);

    boolean b();

    M2.B c();

    void d(M2.B b2);

    void e(AudioDeviceInfo audioDeviceInfo);

    void f(float f2);

    void flush();

    void g(boolean z);

    boolean h();

    void i(x1 x1Var);

    void j(int i);

    void k(M2.q qVar, int i, int[] iArr);

    void l(int i);

    void m();

    void n(P2.c cVar);

    int o(M2.q qVar);

    boolean p(ByteBuffer byteBuffer, long j, int i);

    void pause();

    void q();

    void r(M2.b bVar);

    void release();

    void reset();

    void s(int i, int i2);

    long t(boolean z);

    void v();

    void w();

    void x(d dVar);

    void y(M2.e eVar);

    void z();

    public static final class b extends Exception {
        public final M2.q a;

        public b(Throwable th, M2.q qVar) {
            super(th);
            this.a = qVar;
        }

        public b(String str, M2.q qVar) {
            super(str);
            this.a = qVar;
        }
    }

    default void u(long j) {
    }
}
