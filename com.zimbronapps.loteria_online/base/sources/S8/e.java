package s8;

import G1.m;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s8.d;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class e {
    public final ExecutorService a;
    public final Context b;
    public final com.google.firebase.messaging.c c;

    public e(Context context, com.google.firebase.messaging.c cVar, ExecutorService executorService) {
        this.a = executorService;
        this.b = context;
        this.c = cVar;
    }

    public boolean a() {
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        H d = d();
        d.a e = d.e(this.b, this.c);
        e(e.a, d);
        c(e);
        return true;
    }

    public final boolean b() {
        if (((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!E6.q.e()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.importance == 100;
            }
        }
        return false;
    }

    public final void c(d.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.b.getSystemService("notification")).notify(aVar.b, aVar.c, aVar.a.b());
    }

    public final H d() {
        H d = H.d(this.c.p("gcm.n.image"));
        if (d != null) {
            d.h(this.a);
        }
        return d;
    }

    public final void e(m.e eVar, H h) {
        if (h == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(h.f(), 5L, TimeUnit.SECONDS);
            eVar.n(bitmap);
            eVar.v(new m.b().i(bitmap).h((Bitmap) null));
        } catch (ExecutionException e) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
        } catch (TimeoutException unused) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            h.close();
        } catch (InterruptedException unused2) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            h.close();
            Thread.currentThread().interrupt();
        }
    }
}
