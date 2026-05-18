package androidx.work.impl.background.systemalarm;

import G4.m;
import Q4.n;
import android.content.Intent;
import androidx.lifecycle.w;
import androidx.work.impl.background.systemalarm.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class SystemAlarmService extends w implements d.c {
    public static final String d = m.f("SystemAlarmService");
    public d b;
    public boolean c;

    public void b() {
        this.c = true;
        m.c().a(d, "All commands completed in dispatcher", new Throwable[0]);
        n.a();
        stopSelf();
    }

    public final void e() {
        d dVar = new d(this);
        this.b = dVar;
        dVar.m(this);
    }

    public void onCreate() {
        super.onCreate();
        e();
        this.c = false;
    }

    public void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.j();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            m.c().d(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.b.j();
            e();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.a(intent, i2);
        return 3;
    }
}
