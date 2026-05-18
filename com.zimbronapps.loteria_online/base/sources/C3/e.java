package c3;

import P2.K;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import z.Y;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class e implements k {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public Handler c;
    public final AtomicReference d;
    public final P2.f e;
    public boolean f;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            e.e(e.this, message);
        }
    }

    public static class b {
        public int a;
        public int b;
        public int c;
        public final MediaCodec.CryptoInfo d = new MediaCodec.CryptoInfo();
        public long e;
        public int f;

        public void a(int i, int i2, int i3, long j, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.e = j;
            this.f = i4;
        }
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new P2.f());
    }

    public static /* synthetic */ void e(e eVar, Message message) {
        eVar.j(message);
    }

    public static void g(S2.c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f;
        cryptoInfo.numBytesOfClearData = i(cVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = i(cVar.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) P2.a.e(h(cVar.b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) P2.a.e(h(cVar.a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.c;
        if (K.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.g, cVar.h));
        }
    }

    public static byte[] h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int[] i(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static b o() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return (b) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void p(b bVar) {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void a(int i, int i2, int i3, long j, int i4) {
        d();
        b o = o();
        o.a(i, i2, i3, j, i4);
        ((Handler) K.i(this.c)).obtainMessage(1, o).sendToTarget();
    }

    public void b(int i, int i2, S2.c cVar, long j, int i3) {
        d();
        b o = o();
        o.a(i, i2, 0, j, i3);
        g(cVar, o.d);
        ((Handler) K.i(this.c)).obtainMessage(2, o).sendToTarget();
    }

    public void c(Bundle bundle) {
        d();
        ((Handler) K.i(this.c)).obtainMessage(4, bundle).sendToTarget();
    }

    public void d() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet((Object) null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void f() {
        this.e.c();
        ((Handler) P2.a.e(this.c)).obtainMessage(3).sendToTarget();
        this.e.a();
    }

    public void flush() {
        if (this.f) {
            try {
                n();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void j(Message message) {
        b bVar;
        int i = message.what;
        if (i == 1) {
            bVar = (b) message.obj;
            k(bVar.a, bVar.b, bVar.c, bVar.e, bVar.f);
        } else if (i != 2) {
            bVar = null;
            if (i == 3) {
                this.e.e();
            } else if (i != 4) {
                Y.a(this.d, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                m((Bundle) message.obj);
            }
        } else {
            bVar = (b) message.obj;
            l(bVar.a, bVar.b, bVar.d, bVar.e, bVar.f);
        }
        if (bVar != null) {
            p(bVar);
        }
    }

    public final void k(int i, int i2, int i3, long j, int i4) {
        try {
            this.a.queueInputBuffer(i, i2, i3, j, i4);
        } catch (RuntimeException e) {
            Y.a(this.d, null, e);
        }
    }

    public final void l(int i, int i2, MediaCodec.CryptoInfo cryptoInfo, long j, int i3) {
        try {
            synchronized (h) {
                this.a.queueSecureInputBuffer(i, i2, cryptoInfo, j, i3);
            }
        } catch (RuntimeException e) {
            Y.a(this.d, null, e);
        }
    }

    public final void m(Bundle bundle) {
        try {
            this.a.setParameters(bundle);
        } catch (RuntimeException e) {
            Y.a(this.d, null, e);
        }
    }

    public final void n() {
        ((Handler) P2.a.e(this.c)).removeCallbacksAndMessages((Object) null);
        f();
    }

    public void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    public void start() {
        if (this.f) {
            return;
        }
        this.b.start();
        this.c = new a(this.b.getLooper());
        this.f = true;
    }

    public e(MediaCodec mediaCodec, HandlerThread handlerThread, P2.f fVar) {
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = fVar;
        this.d = new AtomicReference();
    }
}
