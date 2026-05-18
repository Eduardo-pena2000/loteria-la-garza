package g6;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzcbt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ M5.a c;
    public final /* synthetic */ b d;

    public /* synthetic */ c(Context context, String str, M5.a aVar, b bVar) {
        this.a = context;
        this.b = str;
        this.c = aVar;
        this.d = bVar;
    }

    public final /* synthetic */ void run() {
        b bVar = this.d;
        M5.a aVar = this.c;
        Context context = this.a;
        try {
            new zzcbt(context, this.b).zza(aVar.a(), bVar);
        } catch (IllegalStateException e) {
            zzbyp.zza(context).zzh(e, "RewardedInterstitialAdManager.load");
        }
    }
}
