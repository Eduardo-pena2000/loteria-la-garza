package S5;

import N6.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbtt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class k2 extends N6.c {
    public k2() {
        super("com.google.android.gms.ads.AdPreloaderRemoteCreatorImpl");
    }

    public final l0 a(Context context, zzbtt zzbttVar) {
        try {
            IBinder q1 = ((m0) getRemoteCreatorInstance(context)).q1(N6.b.s1(context), zzbttVar, 254715000);
            if (q1 == null) {
                return null;
            }
            IInterface queryLocalInterface = q1.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            return queryLocalInterface instanceof l0 ? (l0) queryLocalInterface : new j0(q1);
        } catch (RemoteException e) {
            e = e;
            W5.p.g("Could not get remote AdPreloaderCreator.", e);
            return null;
        } catch (NullPointerException e2) {
            e = e2;
            W5.p.g("Could not get remote AdPreloaderCreator.", e);
            return null;
        } catch (c.a e3) {
            e = e3;
            W5.p.g("Could not get remote AdPreloaderCreator.", e);
            return null;
        }
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
        return queryLocalInterface instanceof m0 ? (m0) queryLocalInterface : new m0(iBinder);
    }
}
