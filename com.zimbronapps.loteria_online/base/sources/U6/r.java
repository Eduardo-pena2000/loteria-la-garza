package u6;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ x a;

    public /* synthetic */ r(x xVar) {
        this.a = xVar;
    }

    public final void run() {
        A a;
        while (true) {
            x xVar = this.a;
            synchronized (xVar) {
                try {
                    if (xVar.a != 2) {
                        return;
                    }
                    if (xVar.d.isEmpty()) {
                        xVar.f();
                        return;
                    } else {
                        a = (A) xVar.d.poll();
                        xVar.e.put(a.a, a);
                        D.e(xVar.f).schedule(new v(xVar, a), 30L, TimeUnit.SECONDS);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(a)));
            }
            D d = xVar.f;
            Messenger messenger = xVar.b;
            int i = a.c;
            Context a2 = D.a(d);
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = a.a;
            obtain.replyTo = messenger;
            Bundle bundle = new Bundle();
            bundle.putBoolean("oneWay", a.b());
            bundle.putString("pkg", a2.getPackageName());
            bundle.putBundle("data", a.d);
            obtain.setData(bundle);
            try {
                xVar.c.a(obtain);
            } catch (RemoteException e) {
                xVar.a(2, e.getMessage());
            }
        }
    }
}
