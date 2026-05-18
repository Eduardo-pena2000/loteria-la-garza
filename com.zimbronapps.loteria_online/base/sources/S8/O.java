package s8;

import android.content.Intent;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class o implements Runnable {
    public final /* synthetic */ p a;
    public final /* synthetic */ Intent b;

    public /* synthetic */ o(p pVar, Intent intent) {
        this.a = pVar;
        this.b = intent;
    }

    public final void run() {
        p.a(this.a, this.b);
    }
}
