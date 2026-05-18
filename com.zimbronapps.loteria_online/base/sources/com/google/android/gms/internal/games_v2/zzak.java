package com.google.android.gms.internal.games_v2;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class zzak extends zzb implements zzal {
    public static zzal zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.recall.IRecallService");
        return queryLocalInterface instanceof zzal ? (zzal) queryLocalInterface : new zzaj(iBinder);
    }
}
