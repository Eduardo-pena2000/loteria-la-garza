package u6;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class u implements Handler.Callback {
    public final /* synthetic */ x a;

    public /* synthetic */ u(x xVar) {
        this.a = xVar;
    }

    public final boolean handleMessage(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Received response to request: " + i);
        }
        x xVar = this.a;
        synchronized (xVar) {
            try {
                A a = (A) xVar.e.get(i);
                if (a == null) {
                    Log.w("MessengerIpcClient", "Received response for unknown request: " + i);
                    return true;
                }
                xVar.e.remove(i);
                xVar.f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    a.c(new B(4, "Not supported by GmsCore", null));
                    return true;
                }
                a.a(data);
                return true;
            } finally {
            }
        }
    }
}
