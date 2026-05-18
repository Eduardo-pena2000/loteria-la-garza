package P2;

import android.os.Handler;
import android.os.Message;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class l implements Handler.Callback {
    public final /* synthetic */ n a;

    public /* synthetic */ l(n nVar) {
        this.a = nVar;
    }

    public final boolean handleMessage(Message message) {
        return n.b(this.a, message);
    }
}
