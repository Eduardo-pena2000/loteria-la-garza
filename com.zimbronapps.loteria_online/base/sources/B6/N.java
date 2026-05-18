package b6;

import android.net.Uri;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class n implements Callable {
    public final /* synthetic */ w a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ N6.a c;

    public /* synthetic */ n(w wVar, Uri uri, N6.a aVar) {
        this.a = wVar;
        this.b = uri;
        this.c = aVar;
    }

    public final /* synthetic */ Object call() {
        return this.a.W1(this.b, this.c);
    }
}
