package u6;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class x implements ServiceConnection {
    public y c;
    public final /* synthetic */ D f;
    public int a = 0;
    public final Messenger b = new Messenger(new zzf(Looper.getMainLooper(), new u(this)));
    public final Queue d = new ArrayDeque();
    public final SparseArray e = new SparseArray();

    public /* synthetic */ x(D d, w wVar) {
        this.f = d;
    }

    public final synchronized void a(int i, String str) {
        b(i, str, null);
    }

    public final synchronized void b(int i, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i2 = this.a;
            if (i2 == 0) {
                throw new IllegalStateException();
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            D6.a.b().c(D.a(this.f), this);
            B b = new B(i, str, th);
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((A) it.next()).c(b);
            }
            this.d.clear();
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                ((A) this.e.valueAt(i3)).c(b);
            }
            this.e.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        D.e(this.f).execute(new r(this));
    }

    public final synchronized void d() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void e(int i) {
        A a = (A) this.e.get(i);
        if (a != null) {
            Log.w("MessengerIpcClient", "Timing out request: " + i);
            this.e.remove(i);
            a.c(new B(3, "Timed out waiting for response", null));
            f();
        }
    }

    public final synchronized void f() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                D6.a.b().c(D.a(this.f), this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(A a) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.d.add(a);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(a);
            c();
            return true;
        }
        this.d.add(a);
        com.google.android.gms.common.internal.t.o(this.a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (D6.a.b().a(D.a(this.f), intent, this, 1)) {
                D.e(this.f).schedule(new s(this), 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            b(0, "Unable to bind to service", e);
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        D.e(this.f).execute(new q(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        D.e(this.f).execute(new t(this));
    }
}
