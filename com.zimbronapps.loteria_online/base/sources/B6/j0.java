package b6;

import android.util.Pair;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ k0 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ j0(k0 k0Var, Object obj, Pair pair) {
        this.a = k0Var;
        this.b = obj;
        this.c = pair;
    }

    public final /* synthetic */ void run() {
        this.a.d(this.b, this.c);
    }
}
