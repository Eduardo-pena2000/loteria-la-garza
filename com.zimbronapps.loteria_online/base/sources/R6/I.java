package R6;

import R6.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class i extends j {
    public static final Parcelable.Creator CREATOR = new z0();
    public final q a;
    public final String b;
    public final int c;

    public i(int i, String str, int i2) {
        try {
            this.a = q.c(i);
            this.b = str;
            this.c = i2;
        } catch (q.a e) {
            throw new IllegalArgumentException(e);
        }
    }

    public q M1() {
        return this.a;
    }

    public int N1() {
        return this.a.b();
    }

    public String O1() {
        return this.b;
    }

    public final JSONObject P1() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", this.a.b());
            String str = this.b;
            if (str != null) {
                jSONObject.put("message", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorErrorResponse to JSON object", e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return com.google.android.gms.common.internal.r.b(this.a, iVar.a) && com.google.android.gms.common.internal.r.b(this.b, iVar.b) && com.google.android.gms.common.internal.r.b(Integer.valueOf(this.c), Integer.valueOf(iVar.c));
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b, Integer.valueOf(this.c));
    }

    public String toString() {
        zzbi zza = zzbj.zza(this);
        zza.zza("errorCode", this.a.b());
        String str = this.b;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 2, N1());
        y6.c.E(parcel, 3, O1(), false);
        y6.c.t(parcel, 4, this.c);
        y6.c.b(parcel, a);
    }
}
