package k7;

import com.google.android.gms.internal.measurement.zzn;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class c3 implements Callable {
    public final /* synthetic */ d3 a;
    public final /* synthetic */ String b;

    public /* synthetic */ c3(d3 d3Var, String str) {
        this.a = d3Var;
        this.b = str;
    }

    public final /* synthetic */ Object call() {
        return new zzn("internal.remoteConfig", new Y2(this.a, this.b));
    }
}
