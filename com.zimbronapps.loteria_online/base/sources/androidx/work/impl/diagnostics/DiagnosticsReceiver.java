package androidx.work.impl.diagnostics;

import G4.m;
import G4.o;
import G4.w;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = m.f("DiagnosticsRcvr");

    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        m.c().a(a, "Requesting diagnostics", new Throwable[0]);
        try {
            w.d(context).b(o.d(DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            m.c().b(a, "WorkManager is not initialized", e);
        }
    }
}
