package e6;

import S5.n1;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.internal.ads.zzbyj;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ L5.c b;
    public final /* synthetic */ AdRequest c;
    public final /* synthetic */ String d;
    public final /* synthetic */ b e;

    public /* synthetic */ c(Context context, L5.c cVar, AdRequest adRequest, String str, b bVar) {
        this.a = context;
        this.b = cVar;
        this.c = adRequest;
        this.d = str;
        this.e = bVar;
    }

    public final /* synthetic */ void run() {
        AdRequest adRequest = this.c;
        n1 a = adRequest == null ? null : adRequest.a();
        new zzbyj(this.a, this.b, a, this.d).zzb(this.e);
    }
}
