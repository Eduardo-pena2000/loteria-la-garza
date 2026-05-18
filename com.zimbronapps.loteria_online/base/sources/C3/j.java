package c3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public interface j {

    public static final class a {
        public final m a;
        public final MediaFormat b;
        public final M2.q c;
        public final Surface d;
        public final MediaCrypto e;
        public final int f;

        public a(m mVar, MediaFormat mediaFormat, M2.q qVar, Surface surface, MediaCrypto mediaCrypto, int i) {
            this.a = mVar;
            this.b = mediaFormat;
            this.c = qVar;
            this.d = surface;
            this.e = mediaCrypto;
            this.f = i;
        }

        public static a a(m mVar, MediaFormat mediaFormat, M2.q qVar, MediaCrypto mediaCrypto) {
            return new a(mVar, mediaFormat, qVar, null, mediaCrypto, 0);
        }

        public static a b(m mVar, MediaFormat mediaFormat, M2.q qVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(mVar, mediaFormat, qVar, surface, mediaCrypto, 0);
        }
    }

    public interface b {
        j a(a aVar);
    }

    public interface c {
        void a();

        void b();
    }

    public interface d {
        void a(j jVar, long j, long j2);
    }

    void a(int i, int i2, int i3, long j, int i4);

    void b(int i, int i2, S2.c cVar, long j, int i3);

    void c(Bundle bundle);

    MediaFormat d();

    void e(int i);

    ByteBuffer f(int i);

    void flush();

    void g(Surface surface);

    default boolean h(c cVar) {
        return false;
    }

    void i(d dVar, Handler handler);

    boolean j();

    void k(int i, long j);

    int l();

    int m(MediaCodec.BufferInfo bufferInfo);

    void n(int i, boolean z);

    ByteBuffer o(int i);

    void release();
}
