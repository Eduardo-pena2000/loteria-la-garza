package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzq implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new zzn();
    public final String zza;
    public final int zzb;
    private final zzp[] zzc;
    private int zzd;

    public zzq(Parcel parcel) {
        this.zza = parcel.readString();
        zzp[] zzpVarArr = (zzp[]) parcel.createTypedArray(zzp.CREATOR);
        String str = zzfj.zza;
        this.zzc = zzpVarArr;
        this.zzb = zzpVarArr.length;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzp zzpVar = (zzp) obj2;
        UUID uuid = zzg.zza;
        UUID uuid2 = ((zzp) obj).zza;
        return uuid.equals(uuid2) ? !uuid.equals(zzpVar.zza) ? 1 : 0 : uuid2.compareTo(zzpVar.zza);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzq.class == obj.getClass()) {
            zzq zzqVar = (zzq) obj;
            if (Objects.equals(this.zza, zzqVar.zza) && Arrays.equals(this.zzc, zzqVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
        this.zzd = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzp zza(int i) {
        return this.zzc[i];
    }

    public final zzq zzb(String str) {
        return Objects.equals(this.zza, str) ? this : new zzq(str, false, this.zzc);
    }

    private zzq(String str, boolean z, zzp... zzpVarArr) {
        this.zza = str;
        zzpVarArr = z ? (zzp[]) zzpVarArr.clone() : zzpVarArr;
        this.zzc = zzpVarArr;
        this.zzb = zzpVarArr.length;
        Arrays.sort(zzpVarArr, this);
    }

    public zzq(String str, zzp... zzpVarArr) {
        this(null, true, zzpVarArr);
    }

    public zzq(List list) {
        this(null, false, (zzp[]) list.toArray(new zzp[0]));
    }
}
