package io.flutter.view;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class p {
    public static p e;
    public static b f;
    public FlutterJNI b;
    public long a = -1;
    public c c = new c(0);
    public final FlutterJNI.b d = new a();

    public class a implements FlutterJNI.b {
        public a() {
        }

        public void a(long j) {
            Choreographer.getInstance().postFrameCallback(b(j));
        }

        public final Choreographer.FrameCallback b(long j) {
            if (p.d(p.this) == null) {
                return p.this.new c(j);
            }
            c.a(p.d(p.this), j);
            c d = p.d(p.this);
            p.e(p.this, null);
            return d;
        }
    }

    public class b implements DisplayManager.DisplayListener {
        public DisplayManager a;

        public b(DisplayManager displayManager) {
            this.a = displayManager;
        }

        public void a() {
            this.a.registerDisplayListener(this, (Handler) null);
        }

        public void onDisplayAdded(int i) {
        }

        public void onDisplayChanged(int i) {
            if (i == 0) {
                float refreshRate = this.a.getDisplay(0).getRefreshRate();
                p.b(p.this, (long) (1.0E9d / refreshRate));
                p.c(p.this).setRefreshRateFPS(refreshRate);
            }
        }

        public void onDisplayRemoved(int i) {
        }
    }

    public class c implements Choreographer.FrameCallback {
        public long a;

        public c(long j) {
            this.a = j;
        }

        public static /* synthetic */ long a(c cVar, long j) {
            cVar.a = j;
            return j;
        }

        public void doFrame(long j) {
            long nanoTime = System.nanoTime() - j;
            p.c(p.this).onVsync(nanoTime < 0 ? 0L : nanoTime, p.a(p.this), this.a);
            p.e(p.this, this);
        }
    }

    public p(FlutterJNI flutterJNI) {
        this.b = flutterJNI;
    }

    public static /* synthetic */ long a(p pVar) {
        return pVar.a;
    }

    public static /* synthetic */ long b(p pVar, long j) {
        pVar.a = j;
        return j;
    }

    public static /* synthetic */ FlutterJNI c(p pVar) {
        return pVar.b;
    }

    public static /* synthetic */ c d(p pVar) {
        return pVar.c;
    }

    public static /* synthetic */ c e(p pVar, c cVar) {
        pVar.c = cVar;
        return cVar;
    }

    public static p f(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (e == null) {
            e = new p(flutterJNI);
        }
        if (f == null) {
            p pVar = e;
            Objects.requireNonNull(pVar);
            b bVar = pVar.new b(displayManager);
            f = bVar;
            bVar.a();
        }
        if (e.a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            e.a = (long) (1.0E9d / refreshRate);
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return e;
    }

    public void g() {
        this.b.setAsyncWaitForVsyncDelegate(this.d);
    }
}
