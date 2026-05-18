package s8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public class d0 implements Runnable {
    public static final Object f = new Object();
    public static Boolean g;
    public static Boolean h;
    public final Context a;
    public final J b;
    public final PowerManager.WakeLock c;
    public final c0 d;
    public final long e;

    public class a extends BroadcastReceiver {
        public d0 a;

        public a(d0 d0Var) {
            this.a = d0Var;
        }

        public void a() {
            if (d0.b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            d0.d(d0.this).registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        public synchronized void onReceive(Context context, Intent intent) {
            try {
                d0 d0Var = this.a;
                if (d0Var == null) {
                    return;
                }
                if (d0.a(d0Var)) {
                    if (d0.b()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    d0.c(this.a).m(this.a, 0L);
                    context.unregisterReceiver(this);
                    this.a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public d0(c0 c0Var, Context context, J j, long j2) {
        this.d = c0Var;
        this.a = context;
        this.e = j2;
        this.b = j;
        this.c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static /* synthetic */ boolean a(d0 d0Var) {
        return d0Var.i();
    }

    public static /* synthetic */ boolean b() {
        return j();
    }

    public static /* synthetic */ c0 c(d0 d0Var) {
        return d0Var.d;
    }

    public static /* synthetic */ Context d(d0 d0Var) {
        return d0Var.a;
    }

    public static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    public static boolean f(Context context) {
        boolean booleanValue;
        synchronized (f) {
            try {
                Boolean bool = h;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                h = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z;
    }

    public static boolean h(Context context) {
        boolean booleanValue;
        synchronized (f) {
            try {
                Boolean bool = g;
                Boolean valueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                g = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean i() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.a     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L12
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L12
            goto L15
        L12:
            r0 = move-exception
            goto L22
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L1f
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            return r0
        L22:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.d0.i():boolean");
    }

    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.a)) {
            this.c.acquire(com.google.firebase.messaging.a.a);
        }
        try {
            try {
                try {
                    this.d.o(true);
                } catch (Throwable th) {
                    if (h(this.a)) {
                        try {
                            this.c.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                this.d.o(false);
                if (!h(this.a)) {
                    return;
                } else {
                    wakeLock = this.c;
                }
            }
            if (!this.b.g()) {
                this.d.o(false);
                if (h(this.a)) {
                    try {
                        this.c.release();
                        return;
                    } catch (RuntimeException unused2) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (f(this.a) && !i()) {
                new a(this).a();
                if (h(this.a)) {
                    try {
                        this.c.release();
                        return;
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        return;
                    }
                }
                return;
            }
            if (this.d.s()) {
                this.d.o(false);
            } else {
                this.d.t(this.e);
            }
            if (h(this.a)) {
                wakeLock = this.c;
                wakeLock.release();
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
