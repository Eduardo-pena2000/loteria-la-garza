package R6;

import R6.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.gms.internal.fido.zzbl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class u extends C {
    public static final Parcelable.Creator CREATOR = new X();
    public final y a;
    public final A b;
    public final byte[] c;
    public final List d;
    public final Double e;
    public final List f;
    public final k g;
    public final Integer h;
    public final E i;
    public final c j;
    public final d k;
    public final String l;
    public ResultReceiver m;

    public static final class a {
        public y a;
        public A b;
        public byte[] c;
        public List d;
        public Double e;
        public List f;
        public k g;
        public Integer h;
        public E i;
        public c j;
        public d k;

        public u a() {
            y yVar = this.a;
            A a = this.b;
            byte[] bArr = this.c;
            List list = this.d;
            Double d = this.e;
            List list2 = this.f;
            k kVar = this.g;
            Integer num = this.h;
            E e = this.i;
            c cVar = this.j;
            return new u(yVar, a, bArr, list, d, list2, kVar, num, e, cVar == null ? null : cVar.toString(), this.k, null, null);
        }

        public a b(c cVar) {
            this.j = cVar;
            return this;
        }

        public a c(d dVar) {
            this.k = dVar;
            return this;
        }

        public a d(k kVar) {
            this.g = kVar;
            return this;
        }

        public a e(byte[] bArr) {
            this.c = (byte[]) com.google.android.gms.common.internal.t.l(bArr);
            return this;
        }

        public a f(List list) {
            this.f = list;
            return this;
        }

        public a g(List list) {
            this.d = (List) com.google.android.gms.common.internal.t.l(list);
            return this;
        }

        public a h(y yVar) {
            this.a = (y) com.google.android.gms.common.internal.t.l(yVar);
            return this;
        }

        public a i(Double d) {
            this.e = d;
            return this;
        }

        public a j(A a) {
            this.b = (A) com.google.android.gms.common.internal.t.l(a);
            return this;
        }
    }

    public u(y yVar, A a2, byte[] bArr, List list, Double d, List list2, k kVar, Integer num, E e, String str, d dVar, String str2, ResultReceiver resultReceiver) {
        this.m = resultReceiver;
        if (str2 != null) {
            try {
                u Y1 = Y1(new JSONObject(str2));
                this.a = Y1.a;
                this.b = Y1.b;
                this.c = Y1.c;
                this.d = Y1.d;
                this.e = Y1.e;
                this.f = Y1.f;
                this.g = Y1.g;
                this.h = Y1.h;
                this.i = Y1.i;
                this.j = Y1.j;
                this.k = Y1.k;
                this.l = str2;
                return;
            } catch (JSONException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        this.a = (y) com.google.android.gms.common.internal.t.l(yVar);
        this.b = (A) com.google.android.gms.common.internal.t.l(a2);
        this.c = (byte[]) com.google.android.gms.common.internal.t.l(bArr);
        this.d = (List) com.google.android.gms.common.internal.t.l(list);
        this.e = d;
        this.f = list2;
        this.g = kVar;
        this.h = num;
        this.i = e;
        if (str != null) {
            try {
                this.j = c.b(str);
            } catch (c.a e3) {
                throw new IllegalArgumentException(e3);
            }
        } else {
            this.j = null;
        }
        this.k = dVar;
        this.l = null;
    }

    public static u Y1(JSONObject jSONObject) {
        zzbl zzc;
        a aVar = new a();
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        Parcelable.Creator creator = y.CREATOR;
        aVar.h(new y(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null));
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        Parcelable.Creator creator2 = A.CREATOR;
        aVar.j(new A(E6.c.b(jSONObject3.getString("id")), jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName")));
        aVar.e(E6.c.b(jSONObject.getString("challenge")));
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            try {
                zzc = zzbl.zzd(new w(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                zzc = zzbl.zzc();
            }
            if (zzc.zzb()) {
                arrayList.add(zzc.zza());
            }
        }
        aVar.g(arrayList);
        if (jSONObject.has("timeout")) {
            aVar.i(Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d));
        }
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(v.P1(jSONArray2.getJSONObject(i2)));
            }
            aVar.f(arrayList2);
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            Parcelable.Creator creator3 = k.CREATOR;
            aVar.d(new k(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null));
        }
        if (jSONObject.has("extensions")) {
            aVar.c(d.O1(jSONObject.getJSONObject("extensions")));
        }
        if (jSONObject.has("attestation")) {
            try {
                aVar.b(c.b(jSONObject.getString("attestation")));
            } catch (c.a e) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e);
                aVar.b(c.NONE);
            }
        }
        return aVar.a();
    }

    public String M1() {
        c cVar = this.j;
        if (cVar == null) {
            return null;
        }
        return cVar.toString();
    }

    public d N1() {
        return this.k;
    }

    public k O1() {
        return this.g;
    }

    public byte[] P1() {
        return this.c;
    }

    public List Q1() {
        return this.f;
    }

    public String R1() {
        return this.l;
    }

    public List S1() {
        return this.d;
    }

    public Integer T1() {
        return this.h;
    }

    public y U1() {
        return this.a;
    }

    public Double V1() {
        return this.e;
    }

    public E W1() {
        return this.i;
    }

    public A X1() {
        return this.b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return com.google.android.gms.common.internal.r.b(this.a, uVar.a) && com.google.android.gms.common.internal.r.b(this.b, uVar.b) && Arrays.equals(this.c, uVar.c) && com.google.android.gms.common.internal.r.b(this.e, uVar.e) && this.d.containsAll(uVar.d) && uVar.d.containsAll(this.d) && (((list = this.f) == null && uVar.f == null) || (list != null && (list2 = uVar.f) != null && list.containsAll(list2) && uVar.f.containsAll(this.f))) && com.google.android.gms.common.internal.r.b(this.g, uVar.g) && com.google.android.gms.common.internal.r.b(this.h, uVar.h) && com.google.android.gms.common.internal.r.b(this.i, uVar.i) && com.google.android.gms.common.internal.r.b(this.j, uVar.j) && com.google.android.gms.common.internal.r.b(this.k, uVar.k) && com.google.android.gms.common.internal.r.b(this.l, uVar.l);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
    }

    public final String toString() {
        d dVar = this.k;
        c cVar = this.j;
        E e = this.i;
        k kVar = this.g;
        List list = this.f;
        List list2 = this.d;
        byte[] bArr = this.c;
        A a2 = this.b;
        return "PublicKeyCredentialCreationOptions{\n rp=" + String.valueOf(this.a) + ", \n user=" + String.valueOf(a2) + ", \n challenge=" + E6.c.e(bArr) + ", \n parameters=" + String.valueOf(list2) + ", \n timeoutSeconds=" + this.e + ", \n excludeList=" + String.valueOf(list) + ", \n authenticatorSelection=" + String.valueOf(kVar) + ", \n requestId=" + this.h + ", \n tokenBinding=" + String.valueOf(e) + ", \n attestationConveyancePreference=" + String.valueOf(cVar) + ", \n authenticationExtensions=" + String.valueOf(dVar) + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = y6.c.a(parcel);
        y6.c.C(parcel, 2, U1(), i, false);
        y6.c.C(parcel, 3, X1(), i, false);
        y6.c.k(parcel, 4, P1(), false);
        y6.c.I(parcel, 5, S1(), false);
        y6.c.o(parcel, 6, V1(), false);
        y6.c.I(parcel, 7, Q1(), false);
        y6.c.C(parcel, 8, O1(), i, false);
        y6.c.w(parcel, 9, T1(), false);
        y6.c.C(parcel, 10, W1(), i, false);
        y6.c.E(parcel, 11, M1(), false);
        y6.c.C(parcel, 12, N1(), i, false);
        y6.c.E(parcel, 13, R1(), false);
        y6.c.C(parcel, 14, this.m, i, false);
        y6.c.b(parcel, a2);
    }
}
