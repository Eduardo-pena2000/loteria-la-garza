package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import s8.m;
import u6.a;
import u6.b;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class FirebaseInstanceIdReceiver extends b {
    public static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    public int b(Context context, a aVar) {
        try {
            return ((Integer) Tasks.await(new m(context).k(aVar.M1()))).intValue();
        } catch (ExecutionException | InterruptedException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    public void c(Context context, Bundle bundle) {
        Intent f = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (com.google.firebase.messaging.b.E(f)) {
            com.google.firebase.messaging.b.v(f);
        }
    }
}
