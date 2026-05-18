package b6;

import com.google.android.gms.ads.AdRequest;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class i0 implements Callable {
    public final /* synthetic */ k0 a;
    public final /* synthetic */ AdRequest b;
    public final /* synthetic */ l0 c;

    public /* synthetic */ i0(k0 k0Var, AdRequest adRequest, l0 l0Var) {
        this.a = k0Var;
        this.b = adRequest;
        this.c = l0Var;
    }

    public final /* synthetic */ Object call() {
        return this.a.g(this.b, this.c);
    }
}
