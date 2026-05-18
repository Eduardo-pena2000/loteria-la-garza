package k7;

import android.content.Intent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class l6 implements Runnable {
    public final /* synthetic */ m6 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ C2 c;
    public final /* synthetic */ Intent d;

    public /* synthetic */ l6(m6 m6Var, int i, C2 c2, Intent intent) {
        this.a = m6Var;
        this.b = i;
        this.c = c2;
        this.d = intent;
    }

    public final /* synthetic */ void run() {
        this.a.f(this.b, this.c, this.d);
    }
}
