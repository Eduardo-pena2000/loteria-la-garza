package pa;

import com.google.android.gms.ads.nativead.NativeAd;
import java.lang.ref.WeakReference;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class z implements NativeAd.c {
    public final WeakReference a;

    public z(x xVar) {
        this.a = new WeakReference(xVar);
    }

    public void onNativeAdLoaded(NativeAd nativeAd) {
        if (this.a.get() != null) {
            ((x) this.a.get()).d(nativeAd);
        }
    }
}
