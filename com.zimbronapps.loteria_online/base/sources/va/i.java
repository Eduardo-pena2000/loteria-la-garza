package va;

import android.content.Intent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ m a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ i(m mVar, int i, Intent intent) {
        this.a = mVar;
        this.b = i;
        this.c = intent;
    }

    public final void run() {
        m.e(this.a, this.b, this.c);
    }
}
