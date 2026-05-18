package f6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzcbi;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ M5.a c;
    public final /* synthetic */ d d;

    public /* synthetic */ g(Context context, String str, M5.a aVar, d dVar) {
        this.a = context;
        this.b = str;
        this.c = aVar;
        this.d = dVar;
    }

    public final /* synthetic */ void run() {
        d dVar = this.d;
        M5.a aVar = this.c;
        Context context = this.a;
        try {
            new zzcbi(context, this.b).zza(aVar.a(), dVar);
        } catch (IllegalStateException e) {
            zzbyp.zza(context).zzh(e, "RewardedAd.loadAdManager");
        }
    }
}
