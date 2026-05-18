package S5;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbkv;
import com.google.android.gms.internal.ads.zzbkz;
import com.google.android.gms.internal.ads.zzbyp;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class x extends A {
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ y e;

    public x(y yVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = context;
        Objects.requireNonNull(yVar);
        this.e = yVar;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        y.l(this.d, "native_ad_view_delegate");
        return new R1();
    }

    public final /* bridge */ /* synthetic */ Object b() {
        Context context = this.d;
        zzbhe.zza(context);
        if (!((Boolean) D.c().zzd(zzbhe.zzmf)).booleanValue()) {
            y yVar = this.e;
            return yVar.p().zza(this.d, this.b, this.c);
        }
        try {
            return zzbkv.zzdF(((zzbkz) W5.t.a(context, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", w.a)).zze(N6.b.s1(context), N6.b.s1(this.b), N6.b.s1(this.c), 254715000));
        } catch (RemoteException | NullPointerException | W5.s e) {
            y yVar2 = this.e;
            yVar2.s(zzbyp.zza(this.d));
            yVar2.r().zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ Object c(s0 s0Var) {
        return s0Var.G(N6.b.s1(this.b), N6.b.s1(this.c));
    }
}
