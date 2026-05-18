package v6;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class q extends zau {
    public final Context a;
    public final /* synthetic */ g b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(g gVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = gVar;
        this.a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        g gVar = this.b;
        int g = gVar.g(this.a);
        if (gVar.j(g)) {
            this.b.q(this.a, g);
        }
    }
}
