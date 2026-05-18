package k7;

import android.os.Process;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class h3 extends Thread {
    public final Object a;
    public final BlockingQueue b;
    public boolean c;
    public final /* synthetic */ i3 d;

    public h3(i3 i3Var, String str, BlockingQueue blockingQueue) {
        Objects.requireNonNull(i3Var);
        this.d = i3Var;
        this.c = false;
        com.google.android.gms.common.internal.t.l(str);
        com.google.android.gms.common.internal.t.l(blockingQueue);
        this.a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    public final void a() {
        Object obj = this.a;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b() {
        i3 i3Var = this.d;
        synchronized (i3Var.B()) {
            try {
                if (!this.c) {
                    i3Var.C().release();
                    i3Var.B().notifyAll();
                    if (this == i3Var.x()) {
                        i3Var.y(null);
                    } else if (this == i3Var.z()) {
                        i3Var.A(null);
                    } else {
                        i3Var.a.a().o().a("Current scheduler thread is neither worker nor network");
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(InterruptedException interruptedException) {
        this.d.a.a().r().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.d.C().acquire();
                z = true;
            } catch (InterruptedException e) {
                c(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.b;
                g3 g3Var = (g3) blockingQueue.poll();
                if (g3Var != null) {
                    Process.setThreadPriority(true != g3Var.b ? 10 : threadPriority);
                    g3Var.run();
                } else {
                    Object obj = this.a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.d.D();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                c(e2);
                            }
                        }
                    }
                    synchronized (this.d.B()) {
                        if (this.b.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
