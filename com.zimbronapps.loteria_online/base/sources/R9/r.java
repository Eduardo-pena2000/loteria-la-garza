package r9;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class r implements n {
    public final String a;
    public final int b;
    public HandlerThread c;
    public Handler d;

    public r(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public void c() {
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.c = null;
            this.d = null;
        }
    }

    public void d(k kVar) {
        this.d.post(kVar.b);
    }

    public void start() {
        HandlerThread handlerThread = new HandlerThread(this.a, this.b);
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(this.c.getLooper());
    }
}
