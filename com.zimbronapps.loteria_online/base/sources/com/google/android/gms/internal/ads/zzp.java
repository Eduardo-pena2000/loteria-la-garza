package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new zzo();
    public final UUID zza;
    public final String zzb;
    public final String zzc;
    public final byte[] zzd;
    private int zze;

    public zzp(Parcel parcel) {
        this.zza = new UUID(parcel.readLong(), parcel.readLong());
        this.zzb = parcel.readString();
        String readString = parcel.readString();
        String str = zzfj.zza;
        this.zzc = readString;
        this.zzd = parcel.createByteArray();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzp)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzp zzpVar = (zzp) obj;
        return Objects.equals(this.zzb, zzpVar.zzb) && Objects.equals(this.zzc, zzpVar.zzc) && Objects.equals(this.zza, zzpVar.zza) && Arrays.equals(this.zzd, zzpVar.zzd);
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int hashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int hashCode2 = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.zzc.hashCode()) * 31) + Arrays.hashCode(this.zzd);
        this.zze = hashCode2;
        return hashCode2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.zza;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeByteArray(this.zzd);
    }

    public zzp(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.zza = uuid;
        this.zzb = null;
        this.zzc = zzas.zzh(str2);
        this.zzd = bArr;
    }
}
