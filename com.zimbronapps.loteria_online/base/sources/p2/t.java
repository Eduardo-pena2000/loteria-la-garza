package P2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t {
    public static t e;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final Object c = new Object();
    public int d = 0;

    public static final class b {

        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
            public final t a;

            public a(t tVar) {
                this.a = tVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int a = x.a(telephonyDisplayInfo);
                t.c(this.a, a == 3 || a == 4 || a == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, t tVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) P2.a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(tVar);
                v.a(telephonyManager, u.a(context), aVar);
                w.a(telephonyManager, aVar);
            } catch (RuntimeException unused) {
                t.c(tVar, 5);
            }
        }
    }

    public interface c {
        void a(int i);
    }

    public final class d extends BroadcastReceiver {
        public d() {
        }

        public void onReceive(Context context, Intent intent) {
            int b = t.b(context);
            if (K.a < 31 || b != 5) {
                t.c(t.this, b);
            } else {
                b.a(context, t.this);
            }
        }

        public /* synthetic */ d(t tVar, a aVar) {
            this();
        }
    }

    public t(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(this, null), intentFilter);
    }

    public static /* synthetic */ void a(t tVar, c cVar) {
        tVar.h(cVar);
    }

    public static /* synthetic */ int b(Context context) {
        return g(context);
    }

    public static /* synthetic */ void c(t tVar, int i) {
        tVar.k(i);
    }

    public static synchronized t d(Context context) {
        t tVar;
        synchronized (t.class) {
            try {
                if (e == null) {
                    e = new t(context);
                }
                tVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    public static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return K.a >= 29 ? 9 : 0;
        }
    }

    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i;
    }

    public int f() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final /* synthetic */ void h(c cVar) {
        cVar.a(f());
    }

    public void i(c cVar) {
        j();
        this.b.add(new WeakReference(cVar));
        this.a.post(new s(this, cVar));
    }

    public final void j() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.b.remove(weakReference);
            }
        }
    }

    public final void k(int i) {
        synchronized (this.c) {
            try {
                if (this.d == i) {
                    return;
                }
                this.d = i;
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    c cVar = (c) weakReference.get();
                    if (cVar != null) {
                        cVar.a(i);
                    } else {
                        this.b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
