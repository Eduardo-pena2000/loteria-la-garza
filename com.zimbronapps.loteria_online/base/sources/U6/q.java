package u6;

import android.os.IBinder;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ x a;
    public final /* synthetic */ IBinder b;

    public /* synthetic */ q(x xVar, IBinder iBinder) {
        this.a = xVar;
        this.b = iBinder;
    }

    public final void run() {
        x xVar = this.a;
        IBinder iBinder = this.b;
        synchronized (xVar) {
            if (iBinder == null) {
                xVar.a(0, "Null service connection");
                return;
            }
            try {
                xVar.c = new y(iBinder);
                xVar.a = 2;
                xVar.c();
            } catch (RemoteException e) {
                xVar.a(0, e.getMessage());
            }
        }
    }
}
