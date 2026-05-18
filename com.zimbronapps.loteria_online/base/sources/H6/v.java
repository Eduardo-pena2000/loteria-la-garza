package H6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.drive.zzez;
import com.google.android.gms.internal.drive.zzkk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class v extends y6.a {
    public static final Parcelable.Creator CREATOR = new w();
    public final long a;
    public final long b;
    public final long c;
    public volatile String d = null;

    public v(long j, long j2, long j3) {
        com.google.android.gms.common.internal.t.a(j != -1);
        com.google.android.gms.common.internal.t.a(j2 != -1);
        com.google.android.gms.common.internal.t.a(j3 != -1);
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == v.class) {
            v vVar = (v) obj;
            if (vVar.b == this.b && vVar.c == this.c && vVar.a == this.a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append(valueOf);
        sb.append(valueOf2);
        sb.append(valueOf3);
        return sb.toString().hashCode();
    }

    public String toString() {
        if (this.d == null) {
            String valueOf = String.valueOf(Base64.encodeToString(((zzkk) zzez.zzaj().zzk(1).zzc(this.a).zzd(this.b).zze(this.c).zzdf()).toByteArray(), 10));
            this.d = valueOf.length() != 0 ? "ChangeSequenceNumber:".concat(valueOf) : new String("ChangeSequenceNumber:");
        }
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.x(parcel, 2, this.a);
        y6.c.x(parcel, 3, this.b);
        y6.c.x(parcel, 4, this.c);
        y6.c.b(parcel, a);
    }
}
