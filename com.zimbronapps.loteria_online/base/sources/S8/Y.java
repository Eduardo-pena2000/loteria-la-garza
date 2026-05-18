package s8;

import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.e;
import com.google.firebase.messaging.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class y implements e.a {
    public final /* synthetic */ FirebaseMessaging a;
    public final /* synthetic */ String b;
    public final /* synthetic */ f.a c;

    public /* synthetic */ y(FirebaseMessaging firebaseMessaging, String str, f.a aVar) {
        this.a = firebaseMessaging;
        this.b = str;
        this.c = aVar;
    }

    public final Task start() {
        return FirebaseMessaging.h(this.a, this.b, this.c);
    }
}
