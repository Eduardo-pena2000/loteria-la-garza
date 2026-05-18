package J7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.firebase-auth-api.zzah;
import com.google.android.gms.internal.firebase-auth-api.zzak;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class q0 extends y6.a {
    public static final Parcelable.Creator CREATOR = new p0();
    public final String a;
    public final String b;
    public final String c;

    public q0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final q0 M1(JSONObject jSONObject) {
        return new q0(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    public static zzah N1(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzah.zzg();
        }
        zzak zzf = zzah.zzf();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            zzf.zza(new q0(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzf.zza();
    }

    public static final JSONObject O1(q0 q0Var) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("credentialId", q0Var.a);
        jSONObject.put("name", q0Var.b);
        jSONObject.put("displayName", q0Var.c);
        return jSONObject;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, this.a, false);
        y6.c.E(parcel, 2, this.b, false);
        y6.c.E(parcel, 3, this.c, false);
        y6.c.b(parcel, a);
    }
}
