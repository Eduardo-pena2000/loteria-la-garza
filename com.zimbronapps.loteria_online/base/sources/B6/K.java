package b6;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class k implements Callable {
    public final /* synthetic */ w a;
    public final /* synthetic */ List b;
    public final /* synthetic */ N6.a c;

    public /* synthetic */ k(w wVar, List list, N6.a aVar) {
        this.a = wVar;
        this.b = list;
        this.c = aVar;
    }

    public final /* synthetic */ Object call() {
        return this.a.U1(this.b, this.c);
    }
}
