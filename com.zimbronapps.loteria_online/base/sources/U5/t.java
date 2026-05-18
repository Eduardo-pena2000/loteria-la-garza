package U5;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.zzcjl;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class t {
    public final int a;
    public final ViewGroup.LayoutParams b;
    public final ViewGroup c;
    public final Context d;

    public t(zzcjl zzcjlVar) {
        this.b = zzcjlVar.getLayoutParams();
        ViewGroup parent = zzcjlVar.getParent();
        this.d = zzcjlVar.zzK();
        if (!(parent instanceof ViewGroup)) {
            throw new r("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = parent;
        this.c = viewGroup;
        this.a = viewGroup.indexOfChild(zzcjlVar.zzE());
        viewGroup.removeView(zzcjlVar.zzE());
        zzcjlVar.zzag(true);
    }
}
