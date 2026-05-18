package r7;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class f {
    public static final Map o = new HashMap();
    public final Context a;
    public final G b;
    public final String c;
    public boolean g;
    public final Intent h;
    public final N i;
    public ServiceConnection m;
    public IInterface n;
    public final List d = new ArrayList();
    public final Set e = new HashSet();
    public final Object f = new Object();
    public final IBinder.DeathRecipient k = new I(this);
    public final AtomicInteger l = new AtomicInteger(0);
    public final WeakReference j = new WeakReference((Object) null);

    public f(Context context, G g, String str, Intent intent, N n, M m) {
        this.a = context;
        this.b = g;
        this.c = str;
        this.h = intent;
        this.i = n;
    }

    public static /* bridge */ /* synthetic */ Context a(f fVar) {
        return fVar.a;
    }

    public static /* bridge */ /* synthetic */ ServiceConnection b(f fVar) {
        return fVar.m;
    }

    public static /* bridge */ /* synthetic */ IInterface d(f fVar) {
        return fVar.n;
    }

    public static /* bridge */ /* synthetic */ G f(f fVar) {
        return fVar.b;
    }

    public static /* bridge */ /* synthetic */ N g(f fVar) {
        return fVar.i;
    }

    public static /* bridge */ /* synthetic */ Object h(f fVar) {
        return fVar.f;
    }

    public static /* bridge */ /* synthetic */ List i(f fVar) {
        return fVar.d;
    }

    public static /* bridge */ /* synthetic */ AtomicInteger j(f fVar) {
        return fVar.l;
    }

    public static /* synthetic */ void k(f fVar) {
        fVar.b.d("reportBinderDeath", new Object[0]);
        android.support.v4.media.session.b.a(fVar.j.get());
        fVar.b.d("%s : Binder has died.", fVar.c);
        Iterator it = fVar.d.iterator();
        while (it.hasNext()) {
            ((H) it.next()).a(fVar.w());
        }
        fVar.d.clear();
        synchronized (fVar.f) {
            fVar.x();
        }
    }

    public static /* bridge */ /* synthetic */ void l(f fVar, ServiceConnection serviceConnection) {
        fVar.m = null;
    }

    public static /* bridge */ /* synthetic */ void m(f fVar, boolean z) {
        fVar.g = false;
    }

    public static /* bridge */ /* synthetic */ void n(f fVar, IInterface iInterface) {
        fVar.n = iInterface;
    }

    public static /* bridge */ /* synthetic */ void o(f fVar, TaskCompletionSource taskCompletionSource) {
        fVar.e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new J(fVar, taskCompletionSource));
    }

    public static /* bridge */ /* synthetic */ void p(f fVar) {
        fVar.x();
    }

    public static /* bridge */ /* synthetic */ void q(f fVar, H h) {
        if (fVar.n != null || fVar.g) {
            if (!fVar.g) {
                h.run();
                return;
            } else {
                fVar.b.d("Waiting to bind to the service.", new Object[0]);
                fVar.d.add(h);
                return;
            }
        }
        fVar.b.d("Initiate binding to the service.", new Object[0]);
        fVar.d.add(h);
        e eVar = new e(fVar, null);
        fVar.m = eVar;
        fVar.g = true;
        if (fVar.a.bindService(fVar.h, eVar, 1)) {
            return;
        }
        fVar.b.d("Failed to bind to the service.", new Object[0]);
        fVar.g = false;
        Iterator it = fVar.d.iterator();
        while (it.hasNext()) {
            ((H) it.next()).a(new g());
        }
        fVar.d.clear();
    }

    public static /* bridge */ /* synthetic */ void r(f fVar) {
        fVar.b.d("linkToDeath", new Object[0]);
        try {
            fVar.n.asBinder().linkToDeath(fVar.k, 0);
        } catch (RemoteException e) {
            fVar.b.c(e, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void s(f fVar) {
        fVar.b.d("unlinkToDeath", new Object[0]);
        fVar.n.asBinder().unlinkToDeath(fVar.k, 0);
    }

    public final Handler c() {
        Handler handler;
        Map map = o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.c)) {
                    HandlerThread handlerThread = new HandlerThread(this.c, 10);
                    handlerThread.start();
                    map.put(this.c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.n;
    }

    public final void t(H h, TaskCompletionSource taskCompletionSource) {
        c().post(new K(this, h.c(), taskCompletionSource, h));
    }

    public final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f) {
            this.e.remove(taskCompletionSource);
        }
        c().post(new L(this));
    }

    public final RemoteException w() {
        return new RemoteException(String.valueOf(this.c).concat(" : Binder has died."));
    }

    public final void x() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        this.e.clear();
    }
}
