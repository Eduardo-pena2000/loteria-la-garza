package M5;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbyp;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ a c;
    public final /* synthetic */ d d;

    public /* synthetic */ g(Context context, String str, a aVar, d dVar) {
        this.a = context;
        this.b = str;
        this.c = aVar;
        this.d = dVar;
    }

    public final /* synthetic */ void run() {
        d dVar = this.d;
        a aVar = this.c;
        Context context = this.a;
        try {
            new zzbrc(context, this.b).zza(aVar.a(), dVar);
        } catch (IllegalStateException e) {
            zzbyp.zza(context).zzh(e, "AdManagerInterstitialAd.load");
        }
    }
}
