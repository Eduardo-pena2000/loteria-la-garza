package a3;

import a3.c;
import android.net.Uri;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ c.c a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ d(c.c cVar, Uri uri) {
        this.a = cVar;
        this.b = uri;
    }

    public final void run() {
        c.c.a(this.a, this.b);
    }
}
