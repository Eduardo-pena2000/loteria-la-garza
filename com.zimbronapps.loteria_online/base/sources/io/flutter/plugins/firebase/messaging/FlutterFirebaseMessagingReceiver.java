package io.flutter.plugins.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.util.Log;
import com.google.firebase.messaging.d;
import java.util.HashMap;
import na.B;
import na.y;
import na.z;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class FlutterFirebaseMessagingReceiver extends BroadcastReceiver {
    public static HashMap a = new HashMap();

    public void onReceive(Context context, Intent intent) {
        Log.d("FLTFireMsgReceiver", "broadcast received for message");
        if (na.a.a() == null) {
            na.a.b(context.getApplicationContext() != null ? context.getApplicationContext() : context);
        }
        if (intent.getExtras() == null) {
            Log.d("FLTFireMsgReceiver", "broadcast received but intent contained no extras to process RemoteMessage. Operation cancelled.");
            return;
        }
        d dVar = new d(intent.getExtras());
        if (dVar.S1() != null) {
            a.put(dVar.P1(), dVar);
            y.b().i(dVar);
        }
        if (z.d(context)) {
            B.o().p(dVar);
            return;
        }
        Intent intent2 = new Intent(context, FlutterFirebaseMessagingBackgroundService.class);
        Parcel obtain = Parcel.obtain();
        dVar.writeToParcel(obtain, 0);
        intent2.putExtra("notification", obtain.marshall());
        FlutterFirebaseMessagingBackgroundService.k(context, intent2, dVar.T1() == 1);
    }
}
