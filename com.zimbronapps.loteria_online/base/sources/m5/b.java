package M5;

import L5.B;
import L5.C;
import L5.h;
import L5.l;
import S5.D;
import S5.Y;
import android.content.Context;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbyp;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b extends l {
    public b(Context context) {
        super(context, 0);
        t.m(context, "Context cannot be null");
    }

    public void e(a aVar) {
        t.e("#008 Must be called on the main UI thread.");
        zzbhe.zza(getContext());
        if (((Boolean) zzbjc.zzf.zze()).booleanValue()) {
            if (((Boolean) D.c().zzd(zzbhe.zzmF)).booleanValue()) {
                W5.c.b.execute(new f(this, aVar));
                return;
            }
        }
        this.a.n(aVar.a());
    }

    public final boolean f(Y y) {
        return this.a.c(y);
    }

    public final /* synthetic */ void g(a aVar) {
        try {
            this.a.n(aVar.a());
        } catch (IllegalStateException e) {
            zzbyp.zza(getContext()).zzh(e, "AdManagerAdView.loadAd");
        }
    }

    public h[] getAdSizes() {
        return this.a.k();
    }

    public e getAppEventListener() {
        return this.a.m();
    }

    public B getVideoController() {
        return this.a.C();
    }

    public C getVideoOptions() {
        return this.a.b();
    }

    public void setAdSizes(h... hVarArr) {
        if (hVarArr == null || hVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.a.t(hVarArr);
    }

    public void setAppEventListener(e eVar) {
        this.a.v(eVar);
    }

    public void setManualImpressionsEnabled(boolean z) {
        this.a.w(z);
    }

    public void setVideoOptions(C c) {
        this.a.a(c);
    }
}
