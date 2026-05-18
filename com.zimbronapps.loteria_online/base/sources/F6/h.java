package f6;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzcbi;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AdRequest c;
    public final /* synthetic */ d d;

    public /* synthetic */ h(Context context, String str, AdRequest adRequest, d dVar) {
        this.a = context;
        this.b = str;
        this.c = adRequest;
        this.d = dVar;
    }

    public final /* synthetic */ void run() {
        d dVar = this.d;
        AdRequest adRequest = this.c;
        Context context = this.a;
        try {
            new zzcbi(context, this.b).zza(adRequest.a(), dVar);
        } catch (IllegalStateException e) {
            zzbyp.zza(context).zzh(e, "RewardedAd.load");
        }
    }
}
