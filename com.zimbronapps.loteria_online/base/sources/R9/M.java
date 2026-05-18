package r9;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class m {
    public final String a;
    public final int b;
    public HandlerThread c;
    public Handler d;
    public Runnable e;
    public k f;

    public m(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public static /* synthetic */ void a(m mVar, k kVar) {
        mVar.c(kVar);
    }

    public boolean b() {
        k kVar = this.f;
        return kVar != null && kVar.b();
    }

    public Integer d() {
        k kVar = this.f;
        if (kVar != null) {
            return kVar.a();
        }
        return null;
    }

    public void e(k kVar) {
        this.d.post(new l(this, kVar));
    }

    public synchronized void f() {
        HandlerThread handlerThread = this.c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.c = null;
            this.d = null;
        }
    }

    public synchronized void g(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.a, this.b);
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(this.c.getLooper());
        this.e = runnable;
    }

    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void c(k kVar) {
        kVar.b.run();
        this.f = kVar;
        this.e.run();
    }
}
