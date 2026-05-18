package V5;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzfyn;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class x0 implements Callable {
    public final /* synthetic */ WebSettings a;
    public final /* synthetic */ Context b;

    public /* synthetic */ x0(WebSettings webSettings, Context context) {
        this.a = webSettings;
        this.b = context;
    }

    public final /* synthetic */ Object call() {
        zzfyn zzfynVar = F0.l;
        String absolutePath = this.b.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
        WebSettings webSettings = this.a;
        webSettings.setDatabasePath(absolutePath);
        webSettings.setDatabaseEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setSupportZoom(true);
        if (((Boolean) S5.D.c().zzd(zzbhe.zzbr)).booleanValue()) {
            webSettings.setTextZoom(100);
        }
        webSettings.setAllowContentAccess(false);
        return Boolean.TRUE;
    }
}
