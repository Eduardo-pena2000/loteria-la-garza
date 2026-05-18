package pa;

import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class s extends g {
    public final WeakReference c;

    public s(int i, a aVar, h hVar) {
        super(i, aVar);
        this.c = new WeakReference(hVar);
    }

    public void onAdLoaded() {
        if (this.c.get() != null) {
            ((h) this.c.get()).onAdLoaded();
        }
    }
}
