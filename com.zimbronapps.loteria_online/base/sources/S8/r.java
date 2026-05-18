package s8;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class r implements SuccessContinuation {
    public final /* synthetic */ String a;

    public /* synthetic */ r(String str) {
        this.a = str;
    }

    public final Task then(Object obj) {
        return FirebaseMessaging.d(this.a, (c0) obj);
    }
}
