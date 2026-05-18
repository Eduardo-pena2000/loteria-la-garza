package F9;

import com.unity3d.services.store.core.api.Store;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(Integer num, String str) {
        this.a = num;
        this.b = str;
    }

    public final void run() {
        Store.a(this.a, this.b);
    }
}
