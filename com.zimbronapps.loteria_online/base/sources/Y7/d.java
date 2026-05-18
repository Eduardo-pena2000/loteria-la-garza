package Y7;

import java.util.concurrent.CountDownLatch;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ e a;
    public final /* synthetic */ CountDownLatch b;

    public /* synthetic */ d(e eVar, CountDownLatch countDownLatch) {
        this.a = eVar;
        this.b = countDownLatch;
    }

    public final void run() {
        e.b(this.a, this.b);
    }
}
