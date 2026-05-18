package c3;

import P2.K;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import c3.j;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements j {
    public final MediaCodec a;
    public final g b;
    public final k c;
    public boolean d;
    public int e;

    public static final class b implements j.b {
        public final s7.s a;
        public final s7.s b;
        public boolean c;

        public b(int i) {
            this(new c(i), new d(i));
        }

        public static /* synthetic */ HandlerThread b(int i) {
            return g(i);
        }

        public static /* synthetic */ HandlerThread c(int i) {
            return f(i);
        }

        public static /* synthetic */ HandlerThread f(int i) {
            return new HandlerThread(b.s(i));
        }

        public static /* synthetic */ HandlerThread g(int i) {
            return new HandlerThread(b.r(i));
        }

        public static boolean h(M2.q qVar) {
            int i = K.a;
            if (i < 34) {
                return false;
            }
            return i >= 35 || M2.y.s(qVar.n);
        }

        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(j.a aVar) {
            MediaCodec mediaCodec;
            k eVar;
            String str = aVar.a.a;
            b bVar = null;
            try {
                P2.F.a("createCodec:" + str);
                mediaCodec = MediaCodec.createByCodecName(str);
                try {
                    int i = aVar.f;
                    if (this.c && h(aVar.c)) {
                        eVar = new I(mediaCodec);
                        i |= 4;
                    } else {
                        eVar = new e(mediaCodec, (HandlerThread) this.b.get());
                    }
                    b bVar2 = new b(mediaCodec, (HandlerThread) this.a.get(), eVar, null);
                    try {
                        P2.F.b();
                        b.q(bVar2, aVar.b, aVar.d, aVar.e, i);
                        return bVar2;
                    } catch (Exception e) {
                        e = e;
                        bVar = bVar2;
                        if (bVar != null) {
                            bVar.release();
                        } else if (mediaCodec != null) {
                            mediaCodec.release();
                        }
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                mediaCodec = null;
            }
        }

        public void e(boolean z) {
            this.c = z;
        }

        public b(s7.s sVar, s7.s sVar2) {
            this.a = sVar;
            this.b = sVar2;
            this.c = true;
        }
    }

    public /* synthetic */ b(MediaCodec mediaCodec, HandlerThread handlerThread, k kVar, a aVar) {
        this(mediaCodec, handlerThread, kVar);
    }

    public static /* synthetic */ void p(b bVar, j.d dVar, MediaCodec mediaCodec, long j, long j2) {
        bVar.x(dVar, mediaCodec, j, j2);
    }

    public static /* synthetic */ void q(b bVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        bVar.w(mediaFormat, surface, mediaCrypto, i);
    }

    public static /* synthetic */ String r(int i) {
        return u(i);
    }

    public static /* synthetic */ String s(int i) {
        return t(i);
    }

    public static String t(int i) {
        return v(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String u(int i) {
        return v(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static String v(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(int i, int i2, int i3, long j, int i4) {
        this.c.a(i, i2, i3, j, i4);
    }

    public void b(int i, int i2, S2.c cVar, long j, int i3) {
        this.c.b(i, i2, cVar, j, i3);
    }

    public void c(Bundle bundle) {
        this.c.c(bundle);
    }

    public MediaFormat d() {
        return this.b.g();
    }

    public void e(int i) {
        this.a.setVideoScalingMode(i);
    }

    public ByteBuffer f(int i) {
        return this.a.getInputBuffer(i);
    }

    public void flush() {
        this.c.flush();
        this.a.flush();
        this.b.e();
        this.a.start();
    }

    public void g(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    public boolean h(j.c cVar) {
        this.b.p(cVar);
        return true;
    }

    public void i(j.d dVar, Handler handler) {
        this.a.setOnFrameRenderedListener(new c3.a(this, dVar), handler);
    }

    public boolean j() {
        return false;
    }

    public void k(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    public int l() {
        this.c.d();
        return this.b.c();
    }

    public int m(MediaCodec.BufferInfo bufferInfo) {
        this.c.d();
        return this.b.d(bufferInfo);
    }

    public void n(int i, boolean z) {
        this.a.releaseOutputBuffer(i, z);
    }

    public ByteBuffer o(int i) {
        return this.a.getOutputBuffer(i);
    }

    public void release() {
        try {
            if (this.e == 1) {
                this.c.shutdown();
                this.b.q();
            }
            this.e = 2;
            if (this.d) {
                return;
            }
            try {
                int i = K.a;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
            } finally {
            }
        } catch (Throwable th) {
            if (!this.d) {
                try {
                    int i2 = K.a;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                } finally {
                }
            }
            throw th;
        }
    }

    public final void w(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.b.h(this.a);
        P2.F.a("configureCodec");
        this.a.configure(mediaFormat, surface, mediaCrypto, i);
        P2.F.b();
        this.c.start();
        P2.F.a("startCodec");
        this.a.start();
        P2.F.b();
        this.e = 1;
    }

    public final /* synthetic */ void x(j.d dVar, MediaCodec mediaCodec, long j, long j2) {
        dVar.a(this, j, j2);
    }

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, k kVar) {
        this.a = mediaCodec;
        this.b = new g(handlerThread);
        this.c = kVar;
        this.e = 0;
    }
}
