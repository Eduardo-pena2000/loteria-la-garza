package R5;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class j implements Callable {
    public final /* synthetic */ k a;
    public final /* synthetic */ Context b;

    public /* synthetic */ j(k kVar, Context context) {
        this.a = kVar;
        this.b = context;
    }

    public final /* synthetic */ Object call() {
        return this.a.b(this.b, null);
    }
}
