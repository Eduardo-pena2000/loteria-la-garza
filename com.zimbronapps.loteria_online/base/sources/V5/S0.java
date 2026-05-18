package V5;

import android.content.Context;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class s0 implements Runnable {
    public final /* synthetic */ t0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c = "admob";

    public /* synthetic */ s0(t0 t0Var, Context context, String str) {
        this.a = t0Var;
        this.b = context;
    }

    public final /* synthetic */ void run() {
        this.a.o(this.b, this.c);
    }
}
