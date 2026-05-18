package g6;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzcbt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AdRequest c;
    public final /* synthetic */ b d;

    public /* synthetic */ d(Context context, String str, AdRequest adRequest, b bVar) {
        this.a = context;
        this.b = str;
        this.c = adRequest;
        this.d = bVar;
    }

    public final /* synthetic */ void run() {
        b bVar = this.d;
        AdRequest adRequest = this.c;
        Context context = this.a;
        try {
            new zzcbt(context, this.b).zza(adRequest.a(), bVar);
        } catch (IllegalStateException e) {
            zzbyp.zza(context).zzh(e, "RewardedInterstitialAd.load");
        }
    }
}
