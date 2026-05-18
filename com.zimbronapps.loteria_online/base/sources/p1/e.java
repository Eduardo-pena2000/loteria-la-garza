package P1;

import android.os.CancellationSignal;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class e {
    public boolean a;
    public a b;
    public Object c;
    public boolean d;

    public interface a {
        void onCancel();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.d = true;
                a aVar = this.b;
                Object obj = this.c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.b == aVar) {
                    return;
                }
                this.b = aVar;
                if (this.a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }

    public final void c() {
        while (this.d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
