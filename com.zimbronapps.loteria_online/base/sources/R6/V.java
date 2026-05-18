package R6;

import R6.z;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzcf;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzh;
import java.util.List;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class v extends y6.a {
    public final z a;
    public final zzgx b;
    public final List c;
    public static final zzcf d = zzcf.zzm(zzh.zza, zzh.zzb);
    public static final Parcelable.Creator CREATOR = new Z();

    public v(String str, zzgx zzgxVar, List list) {
        com.google.android.gms.common.internal.t.l(str);
        try {
            this.a = z.b(str);
            this.b = (zzgx) com.google.android.gms.common.internal.t.l(zzgxVar);
            this.c = list;
        } catch (z.a e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static v P1(JSONObject jSONObject) {
        return new v(jSONObject.getString("type"), Base64.decode(jSONObject.getString("id"), 11), jSONObject.has("transports") ? Transport.c(jSONObject.getJSONArray("transports")) : null);
    }

    public byte[] M1() {
        return this.b.zzm();
    }

    public List N1() {
        return this.c;
    }

    public String O1() {
        return this.a.toString();
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.a.equals(vVar.a) || !com.google.android.gms.common.internal.r.b(this.b, vVar.b)) {
            return false;
        }
        List list2 = this.c;
        if (list2 == null && vVar.c == null) {
            return true;
        }
        return list2 != null && (list = vVar.c) != null && list2.containsAll(list) && vVar.c.containsAll(this.c);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b, this.c);
    }

    public final String toString() {
        return "PublicKeyCredentialDescriptor{\n type=" + String.valueOf(this.a) + ", \n id=" + E6.c.e(M1()) + ", \n transports=" + String.valueOf(this.c) + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 2, O1(), false);
        y6.c.k(parcel, 3, M1(), false);
        y6.c.I(parcel, 4, N1(), false);
        y6.c.b(parcel, a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(String str, byte[] bArr, List list) {
        this(str, zzgx.zzl(bArr, 0, bArr.length), list);
        zzgx zzgxVar = zzgx.zzb;
    }
}
