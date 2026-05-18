package na;

import android.content.Intent;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.concurrent.CountDownLatch;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ Intent a;
    public final /* synthetic */ CountDownLatch b;

    public /* synthetic */ f(Intent intent, CountDownLatch countDownLatch) {
        this.a = intent;
        this.b = countDownLatch;
    }

    public final void run() {
        FlutterFirebaseMessagingBackgroundService.j(this.a, this.b);
    }
}
