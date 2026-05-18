package b6;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzgzl;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class i implements zzgzl {
    public final /* synthetic */ w a;

    public i(w wVar) {
        Objects.requireNonNull(wVar);
        this.a = wVar;
    }

    public final void zza(Throwable th) {
        R5.t.l().zzg(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        Pair pair = new Pair("sgf_reason", th.getMessage());
        Pair pair2 = new Pair("se", "query_g");
        Pair pair3 = new Pair("ad_format", L5.c.BANNER.name());
        Pair pair4 = new Pair("rtype", Integer.toString(6));
        Pair pair5 = new Pair("scar", "true");
        w wVar = this.a;
        c.e(wVar.q1(), null, "sgf", pair, pair2, pair3, pair4, pair5, new Pair("sgi_rn", Integer.toString(wVar.E1().get())));
        int i = V5.o0.b;
        W5.p.d("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) S5.D.c().zzd(zzbhe.zzlg)).booleanValue() || wVar.D1().get()) {
            return;
        }
        if (wVar.E1().getAndIncrement() < ((Integer) S5.D.c().zzd(zzbhe.zzlh)).intValue()) {
            wVar.zzx();
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        int i = V5.o0.b;
        W5.p.a("Initialized webview successfully for SDKCore.");
        if (((Boolean) S5.D.c().zzd(zzbhe.zzlg)).booleanValue()) {
            w wVar = this.a;
            c.e(wVar.q1(), null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", L5.c.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(wVar.E1().get())));
            wVar.D1().set(true);
        }
    }
}
