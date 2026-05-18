package R6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class t0 extends y6.a {
    public static final Parcelable.Creator CREATOR = new u0();
    public final zzgx a;
    public final zzgx b;

    public t0(zzgx zzgxVar, zzgx zzgxVar2) {
        this.a = zzgxVar;
        this.b = zzgxVar2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return com.google.android.gms.common.internal.r.b(this.a, t0Var.a) && com.google.android.gms.common.internal.r.b(this.b, t0Var.b);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zzgx zzgxVar = this.a;
        int a = y6.c.a(parcel);
        y6.c.k(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        zzgx zzgxVar2 = this.b;
        y6.c.k(parcel, 2, zzgxVar2 != null ? zzgxVar2.zzm() : null, false);
        y6.c.b(parcel, a);
    }
}
