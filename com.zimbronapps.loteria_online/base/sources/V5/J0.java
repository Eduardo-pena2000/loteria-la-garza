package V5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j0 extends BroadcastReceiver {
    public final /* synthetic */ k0 a;

    public j0(k0 k0Var) {
        Objects.requireNonNull(k0Var);
        this.a = k0Var;
    }

    public final void onReceive(Context context, Intent intent) {
        this.a.d(context, intent);
    }
}
