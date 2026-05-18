package S5;

import N6.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbyp;
import com.google.android.gms.internal.ads.zzbyr;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class j2 extends N6.c {
    public zzbyr a;

    public j2() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    public final Y a(Context context, q2 q2Var, String str, zzbtt zzbttVar, int i) {
        zzbhe.zza(context);
        if (!((Boolean) D.c().zzd(zzbhe.zzmf)).booleanValue()) {
            try {
                IBinder q1 = ((Z) getRemoteCreatorInstance(context)).q1(N6.b.s1(context), q2Var, str, zzbttVar, 254715000, i);
                if (q1 == null) {
                    return null;
                }
                IInterface queryLocalInterface = q1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof Y ? (Y) queryLocalInterface : new W(q1);
            } catch (c.a e) {
                e = e;
                W5.p.b("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteException e2) {
                e = e2;
                W5.p.b("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder q12 = ((Z) W5.t.a(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", i2.a)).q1(N6.b.s1(context), q2Var, str, zzbttVar, 254715000, i);
            if (q12 == null) {
                return null;
            }
            IInterface queryLocalInterface2 = q12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return queryLocalInterface2 instanceof Y ? (Y) queryLocalInterface2 : new W(q12);
        } catch (RemoteException e3) {
            e = e3;
            zzbyr zza = zzbyp.zza(context);
            this.a = zza;
            zza.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            W5.p.i("#007 Could not call remote method.", e);
            return null;
        } catch (NullPointerException e4) {
            e = e4;
            zzbyr zza2 = zzbyp.zza(context);
            this.a = zza2;
            zza2.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            W5.p.i("#007 Could not call remote method.", e);
            return null;
        } catch (W5.s e5) {
            e = e5;
            zzbyr zza22 = zzbyp.zza(context);
            this.a = zza22;
            zza22.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            W5.p.i("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof Z ? (Z) queryLocalInterface : new Z(iBinder);
    }
}
