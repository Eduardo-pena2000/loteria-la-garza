package g3;

import android.os.Handler;
import android.os.Message;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class k implements Handler.Callback {
    public final /* synthetic */ l a;

    public /* synthetic */ k(l lVar) {
        this.a = lVar;
    }

    public final boolean handleMessage(Message message) {
        return l.M(this.a, message);
    }
}
