package J2;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.SystemClock;
import android.text.format.DateUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a extends b {
    public Executor i;
    public volatile a j;
    public volatile a k;
    public long l;
    public long m;
    public Handler n;

    public final class a extends c implements Runnable {
        public boolean f;

        public a() {
        }

        public Object b() {
            return a.this.E();
        }

        public void g(Object obj) {
            a.this.y(this, obj);
        }

        public void h(Object obj) {
            a.this.z(this, obj);
        }

        public void run() {
            this.f = false;
            a.this.A();
        }
    }

    public a(Context context) {
        super(context);
        this.m = -10000L;
    }

    public void A() {
        if (this.k != null || this.j == null) {
            return;
        }
        if (this.j.f) {
            this.j.f = false;
            this.n.removeCallbacks(this.j);
        }
        if (this.l > 0 && SystemClock.uptimeMillis() < this.m + this.l) {
            this.j.f = true;
            this.n.postAtTime(this.j, this.m + this.l);
        } else {
            if (this.i == null) {
                this.i = B();
            }
            this.j.c(this.i);
        }
    }

    public Executor B() {
        return AsyncTask.THREAD_POOL_EXECUTOR;
    }

    public abstract Object C();

    public Object E() {
        return C();
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            printWriter.println(this.j.f);
        }
        if (this.k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.k);
            printWriter.print(" waiting=");
            printWriter.println(this.k.f);
        }
        if (this.l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            printWriter.print(DateUtils.formatElapsedTime(timeUnit.toSeconds(this.l)));
            printWriter.print(" mLastLoadCompleteTime=");
            if (this.m == -10000) {
                str2 = "--";
            } else {
                str2 = "-" + DateUtils.formatElapsedTime(timeUnit.toSeconds(SystemClock.uptimeMillis() - this.m));
            }
            printWriter.print(str2);
            printWriter.println();
        }
    }

    public boolean l() {
        if (this.j == null) {
            return false;
        }
        if (!j()) {
            m();
        }
        if (this.k != null) {
            if (this.j.f) {
                this.j.f = false;
                this.n.removeCallbacks(this.j);
            }
            this.j = null;
            return false;
        }
        if (this.j.f) {
            this.j.f = false;
            this.n.removeCallbacks(this.j);
            this.j = null;
            return false;
        }
        boolean a2 = this.j.a(false);
        if (a2) {
            this.k = this.j;
            x();
        }
        this.j = null;
        return a2;
    }

    public void n() {
        super.n();
        b();
        this.j = new a();
        A();
    }

    public void y(a aVar, Object obj) {
        D(obj);
        if (this.k == aVar) {
            t();
            this.m = SystemClock.uptimeMillis();
            this.k = null;
            e();
            A();
        }
    }

    public void z(a aVar, Object obj) {
        if (this.j != aVar) {
            y(aVar, obj);
            return;
        }
        if (i()) {
            D(obj);
            return;
        }
        c();
        this.m = SystemClock.uptimeMillis();
        this.j = null;
        f(obj);
    }

    public void x() {
    }

    public void D(Object obj) {
    }
}
