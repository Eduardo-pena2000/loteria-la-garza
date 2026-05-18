package N5;

import N5.a;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbyp;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AdRequest c;
    public final /* synthetic */ a.a d;

    public /* synthetic */ b(Context context, String str, AdRequest adRequest, a.a aVar) {
        this.a = context;
        this.b = str;
        this.c = adRequest;
        this.d = aVar;
    }

    public final /* synthetic */ void run() {
        a.a aVar = this.d;
        AdRequest adRequest = this.c;
        Context context = this.a;
        try {
            new zzbff(context, this.b, adRequest.a(), aVar).zza();
        } catch (IllegalStateException e) {
            zzbyp.zza(context).zzh(e, "AppOpenAd.load");
        }
    }
}
