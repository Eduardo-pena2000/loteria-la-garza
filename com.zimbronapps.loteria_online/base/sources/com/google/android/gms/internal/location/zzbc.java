package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import h7.B;
import h7.C;
import h7.x;
import h7.z;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzbc extends a {
    public static final Parcelable.Creator CREATOR = new zzbd();
    final int zza;
    final zzba zzb;
    final C zzc;
    final PendingIntent zzd;
    final z zze;
    final zzai zzf;

    public zzbc(int i, zzba zzbaVar, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        this.zza = i;
        this.zzb = zzbaVar;
        zzai zzaiVar = null;
        this.zzc = iBinder == null ? null : B.zzb(iBinder);
        this.zzd = pendingIntent;
        this.zze = iBinder2 == null ? null : x.zzb(iBinder2);
        if (iBinder3 != null) {
            IInterface queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaiVar = queryLocalInterface instanceof zzai ? (zzai) queryLocalInterface : new zzag(iBinder3);
        }
        this.zzf = zzaiVar;
    }

    public static zzbc zza(C c, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, c, null, null, zzaiVar);
    }

    public static zzbc zzb(zzba zzbaVar, PendingIntent pendingIntent, zzai zzaiVar) {
        return new zzbc(1, zzbaVar, null, pendingIntent, null, zzaiVar);
    }

    public static zzbc zzc(z zVar, zzai zzaiVar) {
        if (zzaiVar == null) {
            zzaiVar = null;
        }
        return new zzbc(2, null, null, null, zVar, zzaiVar);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.t(parcel, 1, this.zza);
        c.C(parcel, 2, this.zzb, i, false);
        C c = this.zzc;
        c.s(parcel, 3, c == null ? null : c.asBinder(), false);
        c.C(parcel, 4, this.zzd, i, false);
        z zVar = this.zze;
        c.s(parcel, 5, zVar == null ? null : zVar.asBinder(), false);
        zzai zzaiVar = this.zzf;
        c.s(parcel, 6, zzaiVar != null ? zzaiVar.asBinder() : null, false);
        c.b(parcel, a);
    }
}
