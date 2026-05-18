package s8;

import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ FirebaseMessaging a;

    public /* synthetic */ w(FirebaseMessaging firebaseMessaging) {
        this.a = firebaseMessaging;
    }

    public final void run() {
        FirebaseMessaging.f(this.a);
    }
}
