package com.google.android.gms.internal.games_v2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import y6.a;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzx extends a {
    public static final Parcelable.Creator CREATOR = new zzy();
    private final Intent zza;

    public zzx(Intent intent) {
        this.zza = intent;
    }

    public static zzx zza(Intent intent) {
        return new zzx(intent);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzx) {
            return r.b(this.zza, ((zzx) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.zza;
        if (intent != null) {
            return intent.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return r.d(this).a("resultData", this.zza).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Intent intent = this.zza;
        int a = c.a(parcel);
        c.C(parcel, 1, intent, i, false);
        c.b(parcel, a);
    }
}
