package m3;

import P2.j;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final b b;
    public boolean c;

    public static class b extends HandlerThread implements Handler.Callback {
        public P2.i a;
        public Handler b;
        public Error c;
        public RuntimeException d;
        public m e;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public m a(int i) {
            boolean z;
            start();
            this.b = new Handler(getLooper(), this);
            this.a = new P2.i(this.b);
            synchronized (this) {
                z = false;
                this.b.obtainMessage(1, i, 0).sendToTarget();
                while (this.e == null && this.d == null && this.c == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.d;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.c;
            if (error == null) {
                return (m) P2.a.e(this.e);
            }
            throw error;
        }

        public final void b(int i) {
            P2.a.e(this.a);
            this.a.h(i);
            this.e = new m(this, this.a.g(), i != 0, null);
        }

        public void c() {
            P2.a.e(this.b);
            this.b.sendEmptyMessage(2);
        }

        public final void d() {
            P2.a.e(this.a);
            this.a.i();
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            try {
                if (i != 1) {
                    if (i != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    P2.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.d = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    P2.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (j.a e3) {
                    P2.o.d("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.d = new IllegalStateException(e3);
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    public /* synthetic */ m(b bVar, SurfaceTexture surfaceTexture, boolean z, a aVar) {
        this(bVar, surfaceTexture, z);
    }

    public static int b(Context context) {
        if (P2.j.d(context)) {
            return P2.j.e() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        boolean z;
        synchronized (m.class) {
            try {
                if (!e) {
                    d = b(context);
                    e = true;
                }
                z = d != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public static m d(Context context, boolean z) {
        P2.a.f(!z || c(context));
        return new b().a(z ? d : 0);
    }

    public void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    this.b.c();
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public m(b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = bVar;
        this.a = z;
    }
}
