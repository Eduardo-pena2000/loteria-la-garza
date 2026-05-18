package s8;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class x implements OnSuccessListener {
    public final /* synthetic */ FirebaseMessaging a;

    public /* synthetic */ x(FirebaseMessaging firebaseMessaging) {
        this.a = firebaseMessaging;
    }

    public final void onSuccess(Object obj) {
        FirebaseMessaging.g(this.a, (u6.a) obj);
    }
}
