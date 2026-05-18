package u6;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class n implements OnCompleteListener {
    public final /* synthetic */ CountDownLatch a;

    public /* synthetic */ n(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final void onComplete(Task task) {
        this.a.countDown();
    }
}
