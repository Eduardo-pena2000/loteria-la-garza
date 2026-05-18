package S5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbyp;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class r extends A {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zzbtt d;
    public final /* synthetic */ y e;

    public r(y yVar, Context context, String str, zzbtt zzbttVar) {
        this.b = context;
        this.c = str;
        this.d = zzbttVar;
        Objects.requireNonNull(yVar);
        this.e = yVar;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        y.l(this.b, "native_ad");
        return new M1();
    }

    public final /* bridge */ /* synthetic */ Object b() {
        Context context = this.b;
        zzbhe.zza(context);
        if (!((Boolean) D.c().zzd(zzbhe.zzmf)).booleanValue()) {
            return this.e.n().a(this.b, this.c, this.d);
        }
        try {
            IBinder zze = ((V) W5.t.a(context, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", q.a)).zze(N6.b.s1(context), this.c, this.d, 254715000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof U ? (U) queryLocalInterface : new S(zze);
        } catch (RemoteException e) {
            e = e;
            y yVar = this.e;
            yVar.s(zzbyp.zza(this.b));
            yVar.r().zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e2) {
            e = e2;
            y yVar2 = this.e;
            yVar2.s(zzbyp.zza(this.b));
            yVar2.r().zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (W5.s e3) {
            e = e3;
            y yVar22 = this.e;
            yVar22.s(zzbyp.zza(this.b));
            yVar22.r().zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ Object c(s0 s0Var) {
        return s0Var.l0(N6.b.s1(this.b), this.c, this.d, 254715000);
    }
}
