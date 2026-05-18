package P2;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class f {
    public final c a;
    public boolean b;

    public f() {
        this(c.a);
    }

    public synchronized void a() {
        while (!this.b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z = false;
        while (!this.b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z;
        z = this.b;
        this.b = false;
        return z;
    }

    public synchronized boolean d() {
        return this.b;
    }

    public synchronized boolean e() {
        if (this.b) {
            return false;
        }
        this.b = true;
        notifyAll();
        return true;
    }

    public f(c cVar) {
        this.a = cVar;
    }
}
