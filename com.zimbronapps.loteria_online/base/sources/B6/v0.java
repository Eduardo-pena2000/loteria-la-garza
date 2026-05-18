package b6;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzdxt;
import com.google.android.gms.internal.ads.zzdye;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class v0 implements Runnable {
    public final /* synthetic */ zzdye a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Pair[] c;

    public /* synthetic */ v0(zzdye zzdyeVar, zzdxt zzdxtVar, String str, Pair[] pairArr) {
        this.a = zzdyeVar;
        this.b = str;
        this.c = pairArr;
    }

    public final /* synthetic */ void run() {
        c.f(this.a, null, this.b, this.c);
    }
}
