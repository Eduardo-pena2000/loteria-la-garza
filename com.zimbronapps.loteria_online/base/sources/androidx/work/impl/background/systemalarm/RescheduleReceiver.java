package androidx.work.impl.background.systemalarm;

import G4.m;
import H4.i;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = m.f("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        m.c().a(a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        try {
            i.k(context).t(goAsync());
        } catch (IllegalStateException e) {
            m.c().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
