package s8;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class v implements OnSuccessListener {
    public final /* synthetic */ FirebaseMessaging a;

    public /* synthetic */ v(FirebaseMessaging firebaseMessaging) {
        this.a = firebaseMessaging;
    }

    public final void onSuccess(Object obj) {
        FirebaseMessaging.i(this.a, (c0) obj);
    }
}
