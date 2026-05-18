package com.google.android.gms.internal.ads;

import N6.c;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbmp extends N6.c {
    public zzbmp() {
        super("com.google.android.gms.ads.NativeAdViewHolderDelegateCreatorImpl");
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
        return queryLocalInterface instanceof zzblf ? (zzblf) queryLocalInterface : new zzbld(iBinder);
    }

    public final zzblc zza(View view, HashMap hashMap, HashMap hashMap2) {
        try {
            IBinder zze = ((zzblf) getRemoteCreatorInstance(view.getContext())).zze(N6.b.s1(view), N6.b.s1(hashMap), N6.b.s1(hashMap2));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
            return queryLocalInterface instanceof zzblc ? (zzblc) queryLocalInterface : new zzbla(zze);
        } catch (c.a e) {
            e = e;
            W5.p.g("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        } catch (RemoteException e2) {
            e = e2;
            W5.p.g("Could not create remote NativeAdViewHolderDelegate.", e);
            return null;
        }
    }
}
