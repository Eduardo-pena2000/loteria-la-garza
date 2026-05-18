package C9;

import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a {
    public u9.a a;

    public a(u9.a aVar) {
        this.a = aVar;
    }

    public AdRequest a() {
        return c().o();
    }

    public AdRequest b(String str) {
        return str.isEmpty() ? a() : c().f(str).o();
    }

    public AdRequest.Builder c() {
        return new AdRequest.Builder().j(this.a.b()).d(AdMobAdapter.class, this.a.a());
    }
}
