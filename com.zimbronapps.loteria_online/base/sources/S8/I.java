package s8;

import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class i implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ i(Context context, Intent intent) {
        this.a = context;
        this.b = intent;
    }

    public final Object call() {
        return m.b(this.a, this.b);
    }
}
