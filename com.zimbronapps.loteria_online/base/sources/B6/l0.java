package b6;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzdye;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class l0 extends e6.b {
    public final k0 a;
    public final zzdye b;
    public final boolean c;
    public final int d;
    public final long e = R5.t.o().a();
    public final Boolean f;

    public l0(k0 k0Var, boolean z, int i, Boolean bool, zzdye zzdyeVar) {
        this.a = k0Var;
        this.c = z;
        this.d = i;
        this.f = bool;
        this.b = zzdyeVar;
    }

    public static long a() {
        return R5.t.o().a() + ((Long) zzbjj.zzh.zze()).longValue();
    }

    public final long b() {
        return R5.t.o().a() - this.e;
    }

    public final void onFailure(String str) {
        Pair pair = new Pair("sgf_reason", str);
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", L5.c.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        Pair pair6 = new Pair("lat_ms", Long.toString(b()));
        int i = this.d;
        Pair pair7 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair8 = new Pair("sgpc_lsu", String.valueOf(this.f));
        boolean z = this.c;
        c.e(this.b, null, "sgpcf", pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair("tpc", true != z ? "0" : "1"));
        this.a.c(z, new m0(null, str, a(), i));
    }

    public final void onSuccess(e6.a aVar) {
        Pair pair = new Pair("se", "query_g");
        Pair pair2 = new Pair("ad_format", L5.c.BANNER.name());
        Pair pair3 = new Pair("rtype", Integer.toString(6));
        Pair pair4 = new Pair("scar", "true");
        Pair pair5 = new Pair("lat_ms", Long.toString(b()));
        int i = this.d;
        Pair pair6 = new Pair("sgpc_rn", Integer.toString(i));
        Pair pair7 = new Pair("sgpc_lsu", String.valueOf(this.f));
        boolean z = this.c;
        c.e(this.b, null, "sgpcs", pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair("tpc", true != z ? "0" : "1"));
        this.a.c(z, new m0(aVar, "", a(), i));
    }
}
