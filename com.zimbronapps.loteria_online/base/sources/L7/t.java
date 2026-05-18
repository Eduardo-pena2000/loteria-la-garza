package L7;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final /* synthetic */ class t implements Runnable {
    public final /* synthetic */ Map.Entry a;
    public final /* synthetic */ i8.a b;

    public /* synthetic */ t(Map.Entry entry, i8.a aVar) {
        this.a = entry;
        this.b = aVar;
    }

    public final void run() {
        u.e(this.a, this.b);
    }
}
