package com.google.android.gms.internal.ads;

import N6.c;
import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbxp extends N6.c {
    public zzbxp() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof zzbxv ? (zzbxv) queryLocalInterface : new zzbxt(iBinder);
    }

    public final zzbxs zza(Activity activity) {
        try {
            IBinder zze = ((zzbxv) getRemoteCreatorInstance(activity)).zze(N6.b.s1(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof zzbxs ? (zzbxs) queryLocalInterface : new zzbxq(zze);
        } catch (c.a e) {
            W5.p.g("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteException e2) {
            W5.p.g("Could not create remote AdOverlay.", e2);
            return null;
        }
    }
}
