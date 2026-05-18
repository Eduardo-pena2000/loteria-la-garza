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
public final class t extends A {
    public final /* synthetic */ Context b;
    public final /* synthetic */ zzbtt c;
    public final /* synthetic */ y d;

    public t(y yVar, Context context, zzbtt zzbttVar) {
        this.b = context;
        this.c = zzbttVar;
        Objects.requireNonNull(yVar);
        this.d = yVar;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        y.l(this.b, "ads_preloader");
        return null;
    }

    public final /* bridge */ /* synthetic */ Object b() {
        l0 j0Var;
        Context context = this.b;
        N6.a s1 = N6.b.s1(context);
        zzbhe.zza(context);
        if (!((Boolean) D.c().zzd(zzbhe.zzmf)).booleanValue()) {
            return this.d.t().a(this.b, this.c);
        }
        try {
            m0 m0Var = (m0) W5.t.a(context, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", s.a);
            zzbtt zzbttVar = this.c;
            IBinder q1 = m0Var.q1(s1, zzbttVar, 254715000);
            if (q1 == null) {
                j0Var = null;
            } else {
                IInterface queryLocalInterface = q1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                j0Var = queryLocalInterface instanceof l0 ? (l0) queryLocalInterface : new j0(q1);
            }
            j0Var.zzl(zzbttVar);
            return j0Var;
        } catch (NullPointerException e) {
            e = e;
            y yVar = this.d;
            yVar.s(zzbyp.zza(this.b));
            yVar.r().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (W5.s e2) {
            e = e2;
            y yVar2 = this.d;
            yVar2.s(zzbyp.zza(this.b));
            yVar2.r().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (RemoteException e3) {
            e = e3;
            y yVar22 = this.d;
            yVar22.s(zzbyp.zza(this.b));
            yVar22.r().zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ Object c(s0 s0Var) {
        return s0Var.B(N6.b.s1(this.b), this.c, 254715000);
    }
}
