package com.google.android.gms.internal.ads;

import N6.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbmo extends N6.c {
    public zzbmo() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof zzbkz ? (zzbkz) queryLocalInterface : new zzbkx(iBinder);
    }

    public final zzbkw zza(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder zze = ((zzbkz) getRemoteCreatorInstance(context)).zze(N6.b.s1(context), N6.b.s1(frameLayout), N6.b.s1(frameLayout2), 254715000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof zzbkw ? (zzbkw) queryLocalInterface : new zzbku(zze);
        } catch (c.a e) {
            e = e;
            W5.p.g("Could not create remote NativeAdViewDelegate.", e);
            return null;
        } catch (RemoteException e2) {
            e = e2;
            W5.p.g("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
