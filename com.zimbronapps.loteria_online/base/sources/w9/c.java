package W9;

import android.content.Context;
import android.os.Handler;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ f a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String[] c;
    public final /* synthetic */ Handler d;
    public final /* synthetic */ Runnable e;

    public /* synthetic */ c(f fVar, Context context, String[] strArr, Handler handler, Runnable runnable) {
        this.a = fVar;
        this.b = context;
        this.c = strArr;
        this.d = handler;
        this.e = runnable;
    }

    public final void run() {
        f.b(this.a, this.b, this.c, this.d, this.e);
    }
}
