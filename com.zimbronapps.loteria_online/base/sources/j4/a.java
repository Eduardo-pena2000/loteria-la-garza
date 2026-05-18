package J4;

import G4.m;
import H4.i;
import P4.g;
import P4.h;
import Q4.f;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class a {
    public static final String a = m.f("Alarms");

    public static void a(Context context, i iVar, String str) {
        h y = iVar.o().y();
        g a2 = y.a(str);
        if (a2 != null) {
            b(context, str, a2.b);
            m.c().a(a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            y.d(str);
        }
    }

    public static void b(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.a.b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        m.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, i iVar, String str, long j) {
        WorkDatabase o = iVar.o();
        h y = o.y();
        g a2 = y.a(str);
        if (a2 != null) {
            b(context, str, a2.b);
            d(context, str, a2.b, j);
        } else {
            int b = new f(o).b();
            y.b(new g(str, b));
            d(context, str, b, j);
        }
    }

    public static void d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.a.b(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
