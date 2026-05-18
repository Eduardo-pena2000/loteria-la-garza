package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzcas extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzcat();
    public final String zza;
    public final int zzb;

    public zzcas(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    public static zzcas zza(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return null;
        }
        return new zzcas(jSONArray.getJSONObject(0).optString("rb_type"), jSONArray.getJSONObject(0).optInt("rb_amount"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzcas)) {
            return false;
        }
        zzcas zzcasVar = (zzcas) obj;
        return com.google.android.gms.common.internal.r.b(this.zza, zzcasVar.zza) && com.google.android.gms.common.internal.r.b(Integer.valueOf(this.zzb), Integer.valueOf(zzcasVar.zzb));
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.zza, Integer.valueOf(this.zzb));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 2, str, false);
        y6.c.t(parcel, 3, this.zzb);
        y6.c.b(parcel, a);
    }
}
