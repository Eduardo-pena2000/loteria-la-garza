package androidx.work.impl.background.systemalarm;

import G4.m;
import P4.p;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a implements H4.b {
    public static final String d = m.f("CommandHandler");
    public final Context a;
    public final Map b = new HashMap();
    public final Object c = new Object();

    public a(Context context) {
        this.a = context;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    public static Intent d(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    public void e(String str, boolean z) {
        synchronized (this.c) {
            try {
                H4.b bVar = (H4.b) this.b.remove(str);
                if (bVar != null) {
                    bVar.e(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(Intent intent, int i, d dVar) {
        m.c().a(d, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new b(this.a, i, dVar).a();
    }

    public final void h(Intent intent, int i, d dVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.c) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                m c = m.c();
                String str = d;
                c.a(str, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
                if (this.b.containsKey(string)) {
                    m.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
                } else {
                    c cVar = new c(this.a, i, string, dVar);
                    this.b.put(string, cVar);
                    cVar.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(Intent intent, int i) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        m.c().a(d, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        e(string, z);
    }

    public final void j(Intent intent, int i, d dVar) {
        m.c().a(d, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        dVar.g().s();
    }

    public final void k(Intent intent, int i, d dVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        m c = m.c();
        String str = d;
        c.a(str, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase o = dVar.g().o();
        o.c();
        try {
            p h = o.B().h(string);
            if (h == null) {
                m.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (h.b.a()) {
                m.c().h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long a = h.a();
            if (h.b()) {
                m.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                J4.a.c(this.a, dVar.g(), string, a);
                dVar.k(new d.b(dVar, a(this.a), i));
            } else {
                m.c().a(str, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                J4.a.c(this.a, dVar.g(), string, a);
            }
            o.r();
        } finally {
            o.g();
        }
    }

    public final void l(Intent intent, d dVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        m.c().a(d, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        dVar.g().x(string);
        J4.a.a(this.a, dVar.g(), string);
        dVar.e(string, false);
    }

    public boolean n() {
        boolean z;
        synchronized (this.c) {
            z = !this.b.isEmpty();
        }
        return z;
    }

    public void o(Intent intent, int i, d dVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i, dVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i, dVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            m.c().b(d, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i, dVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i, dVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, dVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i);
        } else {
            m.c().h(d, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
        }
    }
}
