package androidx.work.impl.utils;

import G4.m;
import G4.v;
import H4.f;
import H4.h;
import H4.i;
import K4.g;
import P1.a;
import P4.n;
import P4.p;
import P4.q;
import Q4.c;
import Q4.d;
import Q4.e;
import Q4.j;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class ForceStopRunnable implements Runnable {
    public static final String d = m.f("ForceStopRunnable");
    public static final long e = TimeUnit.DAYS.toMillis(3650);
    public final Context a;
    public final i b;
    public int c = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        public static final String a = m.f("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            m.c().g(a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, i iVar) {
        this.a = context.getApplicationContext();
        this.b = iVar;
    }

    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static PendingIntent d(Context context, int i) {
        return PendingIntent.getBroadcast(context, -1, c(context), i);
    }

    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent d2 = d(context, a.b() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d2);
        }
    }

    public boolean a() {
        boolean i = g.i(this.a, this.b);
        WorkDatabase o = this.b.o();
        q B = o.B();
        n A = o.A();
        o.c();
        try {
            List<p> q = B.q();
            boolean z = (q == null || q.isEmpty()) ? false : true;
            if (z) {
                for (p pVar : q) {
                    B.f(v.ENQUEUED, pVar.a);
                    B.m(pVar.a, -1L);
                }
            }
            A.c();
            o.r();
            o.g();
            return z || i;
        } catch (Throwable th) {
            o.g();
            throw th;
        }
    }

    public void b() {
        boolean a = a();
        if (h()) {
            m.c().a(d, "Rescheduling Workers.", new Throwable[0]);
            this.b.s();
            this.b.l().c(false);
        } else if (e()) {
            m.c().a(d, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.b.s();
        } else if (a) {
            m.c().a(d, "Found unfinished work, scheduling it.", new Throwable[0]);
            f.b(this.b.i(), this.b.o(), this.b.n());
        }
    }

    public boolean e() {
        try {
            PendingIntent d2 = d(this.a, a.b() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d2 != null) {
                    d2.cancel();
                }
                List a = c.a((ActivityManager) this.a.getSystemService("activity"), null, 0, 0);
                if (a != null && !a.isEmpty()) {
                    for (int i = 0; i < a.size(); i++) {
                        if (e.a(d.a(a.get(i))) == 10) {
                            return true;
                        }
                    }
                }
            } else if (d2 == null) {
                g(this.a);
                return true;
            }
            return false;
        } catch (SecurityException e2) {
            e = e2;
            m.c().h(d, "Ignoring exception", e);
            return true;
        } catch (IllegalArgumentException e3) {
            e = e3;
            m.c().h(d, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        androidx.work.a i = this.b.i();
        if (TextUtils.isEmpty(i.c())) {
            m.c().a(d, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b = j.b(this.a, i);
        m.c().a(d, String.format("Is default app process = %s", new Object[]{Boolean.valueOf(b)}), new Throwable[0]);
        return b;
    }

    public boolean h() {
        return this.b.l().a();
    }

    public void i(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    public void run() {
        int i;
        try {
            if (!f()) {
                return;
            }
            while (true) {
                h.e(this.a);
                m.c().a(d, "Performing cleanup operations.", new Throwable[0]);
                try {
                    b();
                    return;
                } catch (SQLiteDatabaseCorruptException | SQLiteTableLockedException | SQLiteCantOpenDatabaseException | SQLiteAccessPermException | SQLiteDatabaseLockedException | SQLiteConstraintException e2) {
                    i = this.c + 1;
                    this.c = i;
                    if (i >= 3) {
                        m.c().b(d, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e2);
                        this.b.i().d();
                        throw illegalStateException;
                    }
                    m.c().a(d, String.format("Retrying after %s", new Object[]{Long.valueOf(i * 300)}), e2);
                    i(this.c * 300);
                }
                m.c().a(d, String.format("Retrying after %s", new Object[]{Long.valueOf(i * 300)}), e2);
                i(this.c * 300);
            }
        } finally {
            this.b.r();
        }
    }
}
