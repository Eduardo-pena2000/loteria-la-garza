package c3;

import P2.K;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import c3.j;
import java.util.ArrayDeque;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public MediaCodec.CryptoException k;
    public long l;
    public boolean m;
    public IllegalStateException n;
    public j.c o;
    public final Object a = new Object();
    public final w.e d = new w.e();
    public final w.e e = new w.e();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public g(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public static /* synthetic */ void a(g gVar) {
        gVar.n();
    }

    public final void b(MediaFormat mediaFormat) {
        this.e.a(-2);
        this.g.add(mediaFormat);
    }

    public int c() {
        synchronized (this.a) {
            try {
                j();
                int i = -1;
                if (i()) {
                    return -1;
                }
                if (!this.d.d()) {
                    i = this.d.e();
                }
                return i;
            } finally {
            }
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                j();
                if (i()) {
                    return -1;
                }
                if (this.e.d()) {
                    return -1;
                }
                int e = this.e.e();
                if (e >= 0) {
                    P2.a.h(this.h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (e == -2) {
                    this.h = (MediaFormat) this.g.remove();
                }
                return e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e() {
        synchronized (this.a) {
            this.l++;
            ((Handler) K.i(this.c)).post(new f(this));
        }
    }

    public final void f() {
        if (!this.g.isEmpty()) {
            this.i = (MediaFormat) this.g.getLast();
        }
        this.d.b();
        this.e.b();
        this.f.clear();
        this.g.clear();
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.a) {
            try {
                mediaFormat = this.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        P2.a.f(this.c == null);
        this.b.start();
        Handler handler = new Handler(this.b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.c = handler;
    }

    public final boolean i() {
        return this.l > 0 || this.m;
    }

    public final void j() {
        k();
        m();
        l();
    }

    public final void k() {
        IllegalStateException illegalStateException = this.n;
        if (illegalStateException == null) {
            return;
        }
        this.n = null;
        throw illegalStateException;
    }

    public final void l() {
        MediaCodec.CryptoException cryptoException = this.k;
        if (cryptoException == null) {
            return;
        }
        this.k = null;
        throw cryptoException;
    }

    public final void m() {
        MediaCodec.CodecException codecException = this.j;
        if (codecException == null) {
            return;
        }
        this.j = null;
        throw codecException;
    }

    public final void n() {
        synchronized (this.a) {
            try {
                if (this.m) {
                    return;
                }
                long j = this.l - 1;
                this.l = j;
                if (j > 0) {
                    return;
                }
                if (j < 0) {
                    o(new IllegalStateException());
                } else {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void o(IllegalStateException illegalStateException) {
        synchronized (this.a) {
            this.n = illegalStateException;
        }
    }

    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.k = cryptoException;
        }
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.j = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            try {
                this.d.a(i);
                j.c cVar = this.o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.i = null;
                }
                this.e.a(i);
                this.f.add(bufferInfo);
                j.c cVar = this.o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            b(mediaFormat);
            this.i = null;
        }
    }

    public void p(j.c cVar) {
        synchronized (this.a) {
            this.o = cVar;
        }
    }

    public void q() {
        synchronized (this.a) {
            this.m = true;
            this.b.quit();
            f();
        }
    }
}
