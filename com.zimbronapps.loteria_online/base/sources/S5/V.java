package S5;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbyp;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class v extends A {
    public final /* synthetic */ Context b;
    public final /* synthetic */ y c;

    public v(y yVar, Context context) {
        this.b = context;
        Objects.requireNonNull(yVar);
        this.c = yVar;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        y.l(this.b, "mobile_ads_settings");
        return new Q1();
    }

    public final /* bridge */ /* synthetic */ Object b() {
        Context context = this.b;
        zzbhe.zza(context);
        if (!((Boolean) D.c().zzd(zzbhe.zzmf)).booleanValue()) {
            return this.c.o().a(this.b);
        }
        try {
            IBinder q1 = ((E0) W5.t.a(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", u.a)).q1(N6.b.s1(context), 254715000);
            if (q1 == null) {
                return null;
            }
            IInterface queryLocalInterface = q1.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof D0 ? (D0) queryLocalInterface : new A0(q1);
        } catch (W5.s e) {
            e = e;
            y yVar = this.c;
            yVar.s(zzbyp.zza(this.b));
            yVar.r().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e2) {
            e = e2;
            y yVar2 = this.c;
            yVar2.s(zzbyp.zza(this.b));
            yVar2.r().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (RemoteException e3) {
            e = e3;
            y yVar22 = this.c;
            yVar22.s(zzbyp.zza(this.b));
            yVar22.r().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ Object c(s0 s0Var) {
        return s0Var.m(N6.b.s1(this.b), 254715000);
    }
}
