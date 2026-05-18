package X6;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class d extends w6.d implements b {
    public final e d;

    public d(DataHolder dataHolder, int i, e eVar) {
        super(dataHolder, i);
        this.d = eVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return a.O1(this, obj);
    }

    public final int hashCode() {
        return a.M1(this);
    }

    public final String toString() {
        return a.N1(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        c.a(new a(this), parcel, i);
    }

    public final long zza() {
        return j(this.d.v);
    }

    public final Uri zzb() {
        return q(this.d.y);
    }

    public final Uri zzc() {
        return q(this.d.x);
    }

    public final Uri zzd() {
        return q(this.d.w);
    }

    public final String zze() {
        return l(this.d.t);
    }

    public final String zzf() {
        return l(this.d.u);
    }
}
