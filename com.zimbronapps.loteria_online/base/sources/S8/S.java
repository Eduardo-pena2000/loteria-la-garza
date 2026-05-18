package s8;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ FirebaseMessaging a;
    public final /* synthetic */ TaskCompletionSource b;

    public /* synthetic */ s(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        this.a = firebaseMessaging;
        this.b = taskCompletionSource;
    }

    public final void run() {
        FirebaseMessaging.k(this.a, this.b);
    }
}
