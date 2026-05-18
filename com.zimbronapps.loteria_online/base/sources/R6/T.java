package R6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzia;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class t extends y6.a {
    public static final Parcelable.Creator CREATOR = new Y();
    public final String a;
    public final String b;
    public final zzgx c;
    public final h d;
    public final g e;
    public final i f;
    public final e g;
    public final String h;
    public String i;

    public t(String str, String str2, zzgx zzgxVar, h hVar, g gVar, i iVar, e eVar, String str3, String str4) {
        boolean z = false;
        com.google.android.gms.common.internal.t.b((hVar != null && gVar == null && iVar == null) || (hVar == null && gVar != null && iVar == null) || (hVar == null && gVar == null && iVar != null), "Must provide a response object.");
        if (iVar != null || (str != null && zzgxVar != null)) {
            z = true;
        }
        com.google.android.gms.common.internal.t.b(z, "Must provide id and rawId if not an error response.");
        this.a = str;
        this.b = str2;
        this.c = zzgxVar;
        this.d = hVar;
        this.e = gVar;
        this.f = iVar;
        this.g = eVar;
        this.h = str3;
        this.i = null;
    }

    public String M1() {
        return this.h;
    }

    public e N1() {
        return this.g;
    }

    public String O1() {
        return this.a;
    }

    public byte[] P1() {
        zzgx zzgxVar = this.c;
        if (zzgxVar == null) {
            return null;
        }
        return zzgxVar.zzm();
    }

    public j Q1() {
        h hVar = this.d;
        if (hVar != null) {
            return hVar;
        }
        g gVar = this.e;
        if (gVar != null) {
            return gVar;
        }
        i iVar = this.f;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalStateException("No response set.");
    }

    public String R1() {
        return this.b;
    }

    public String S1() {
        return T1().toString();
    }

    public final JSONObject T1() {
        JSONObject jSONObject;
        try {
            JSONObject jSONObject2 = new JSONObject();
            zzgx zzgxVar = this.c;
            if (zzgxVar != null && zzgxVar.zzm().length > 0) {
                jSONObject2.put("rawId", E6.c.e(this.c.zzm()));
            }
            String str = this.h;
            if (str != null) {
                jSONObject2.put("authenticatorAttachment", str);
            }
            String str2 = this.b;
            if (str2 != null && this.f == null) {
                jSONObject2.put("type", str2);
            }
            String str3 = this.a;
            if (str3 != null) {
                jSONObject2.put("id", str3);
            }
            String str4 = "response";
            g gVar = this.e;
            boolean z = true;
            if (gVar != null) {
                jSONObject = gVar.R1();
            } else {
                h hVar = this.d;
                if (hVar != null) {
                    jSONObject = hVar.Q1();
                } else {
                    i iVar = this.f;
                    z = false;
                    if (iVar != null) {
                        jSONObject = iVar.P1();
                        str4 = "error";
                    } else {
                        jSONObject = null;
                    }
                }
            }
            if (jSONObject != null) {
                jSONObject2.put(str4, jSONObject);
            }
            e eVar = this.g;
            if (eVar != null) {
                jSONObject2.put("clientExtensionResults", eVar.O1());
            } else if (z) {
                jSONObject2.put("clientExtensionResults", new JSONObject());
            }
            return jSONObject2;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding PublicKeyCredential to JSON object", e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return com.google.android.gms.common.internal.r.b(this.a, tVar.a) && com.google.android.gms.common.internal.r.b(this.b, tVar.b) && com.google.android.gms.common.internal.r.b(this.c, tVar.c) && com.google.android.gms.common.internal.r.b(this.d, tVar.d) && com.google.android.gms.common.internal.r.b(this.e, tVar.e) && com.google.android.gms.common.internal.r.b(this.f, tVar.f) && com.google.android.gms.common.internal.r.b(this.g, tVar.g) && com.google.android.gms.common.internal.r.b(this.h, tVar.h);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b, this.c, this.e, this.d, this.f, this.g, this.h);
    }

    public final String toString() {
        zzgx zzgxVar = this.c;
        byte[] zzm = zzgxVar == null ? null : zzgxVar.zzm();
        String str = this.b;
        String str2 = this.a;
        h hVar = this.d;
        g gVar = this.e;
        i iVar = this.f;
        e eVar = this.g;
        String str3 = this.h;
        return "PublicKeyCredential{\n id='" + str2 + "', \n type='" + str + "', \n rawId=" + E6.c.e(zzm) + ", \n registerResponse=" + String.valueOf(hVar) + ", \n signResponse=" + String.valueOf(gVar) + ", \n errorResponse=" + String.valueOf(iVar) + ", \n extensionsClientOutputs=" + String.valueOf(eVar) + ", \n authenticatorAttachment='" + str3 + "'}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (zzia.zzc()) {
            this.i = T1().toString();
        }
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, O1(), false);
        y6.c.E(parcel, 2, R1(), false);
        y6.c.k(parcel, 3, P1(), false);
        y6.c.C(parcel, 4, this.d, i, false);
        y6.c.C(parcel, 5, this.e, i, false);
        y6.c.C(parcel, 6, this.f, i, false);
        y6.c.C(parcel, 7, N1(), i, false);
        y6.c.E(parcel, 8, M1(), false);
        y6.c.E(parcel, 9, this.i, false);
        y6.c.b(parcel, a);
        this.i = null;
    }

    public t(String str, String str2, byte[] bArr, h hVar, g gVar, i iVar, e eVar, String str3, String str4) {
        this(str, str2, bArr == null ? null : zzgx.zzl(bArr, 0, bArr.length), hVar, gVar, iVar, eVar, str3, str4);
    }
}
