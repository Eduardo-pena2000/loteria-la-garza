package S5;

import N6.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbtt;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class h2 extends N6.c {
    public h2() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    public final U a(Context context, String str, zzbtt zzbttVar) {
        try {
            IBinder zze = ((V) getRemoteCreatorInstance(context)).zze(N6.b.s1(context), str, zzbttVar, 254715000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof U ? (U) queryLocalInterface : new S(zze);
        } catch (c.a e) {
            e = e;
            W5.p.g("Could not create remote builder for AdLoader.", e);
            return null;
        } catch (RemoteException e2) {
            e = e2;
            W5.p.g("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof V ? (V) queryLocalInterface : new V(iBinder);
    }
}
