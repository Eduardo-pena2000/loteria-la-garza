package s8;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class b0 implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ScheduledExecutorService b;
    public final /* synthetic */ FirebaseMessaging c;
    public final /* synthetic */ J d;
    public final /* synthetic */ F e;

    public /* synthetic */ b0(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, J j, F f) {
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = firebaseMessaging;
        this.d = j;
        this.e = f;
    }

    public final Object call() {
        return c0.a(this.a, this.b, this.c, this.d, this.e);
    }
}
