package androidx.work.impl.foreground;

import G4.m;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.w;
import androidx.work.impl.foreground.a;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class SystemForegroundService extends w implements a.b {
    public static final String f = m.f("SystemFgService");
    public static SystemForegroundService g = null;
    public Handler b;
    public boolean c;
    public androidx.work.impl.foreground.a d;
    public NotificationManager e;

    public class a implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ Notification b;
        public final /* synthetic */ int c;

        public a(int i, Notification notification, int i2) {
            this.a = i;
            this.b = notification;
            this.c = i2;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                O4.b.a(SystemForegroundService.this, this.a, this.b, this.c);
            } else {
                SystemForegroundService.this.startForeground(this.a, this.b);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int a;
        public final /* synthetic */ Notification b;

        public b(int i, Notification notification) {
            this.a = i;
            this.b = notification;
        }

        public void run() {
            SystemForegroundService.this.e.notify(this.a, this.b);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ int a;

        public c(int i) {
            this.a = i;
        }

        public void run() {
            SystemForegroundService.this.e.cancel(this.a);
        }
    }

    private void e() {
        this.b = new Handler(Looper.getMainLooper());
        this.e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.d = aVar;
        aVar.m(this);
    }

    public void a(int i, Notification notification) {
        this.b.post(new b(i, notification));
    }

    public void c(int i, int i2, Notification notification) {
        this.b.post(new a(i, notification, i2));
    }

    public void d(int i) {
        this.b.post(new c(i));
    }

    public void onCreate() {
        super.onCreate();
        g = this;
        e();
    }

    public void onDestroy() {
        super.onDestroy();
        this.d.k();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            m.c().d(f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.d.k();
            e();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.d.l(intent);
        return 3;
    }

    public void stop() {
        this.c = true;
        m.c().a(f, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        g = null;
        stopSelf();
    }
}
