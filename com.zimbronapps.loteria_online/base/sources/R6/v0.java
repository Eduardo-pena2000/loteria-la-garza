package R6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class v0 extends y6.a {
    public static final Parcelable.Creator CREATOR = new w0();
    public final boolean a;
    public final zzgx b;

    public v0(boolean z, zzgx zzgxVar) {
        this.a = z;
        this.b = zzgxVar;
    }

    public final JSONObject M1() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            byte[] N1 = N1();
            if (N1 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(N1, 32), 11));
                if (N1.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(N1, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final byte[] N1() {
        zzgx zzgxVar = this.b;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return this.a == v0Var.a && com.google.android.gms.common.internal.r.b(this.b, v0Var.b);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.r.c(Boolean.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AuthenticationExtensionsPrfOutputs{" + M1().toString() + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = y6.c.a(parcel);
        y6.c.g(parcel, 1, z);
        y6.c.k(parcel, 2, N1(), false);
        y6.c.b(parcel, a);
    }
}
