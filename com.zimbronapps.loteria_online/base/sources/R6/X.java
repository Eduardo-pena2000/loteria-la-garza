package R6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.internal.fido.zzia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class x extends C {
    public static final Parcelable.Creator CREATOR = new b0();
    public final byte[] a;
    public final Double b;
    public final String c;
    public final List d;
    public final Integer e;
    public final E f;
    public final G g;
    public final d h;
    public final Long i;
    public ResultReceiver j;

    public static final class a {
        public byte[] a;
        public Double b;
        public String c;
        public List d;
        public Integer e;
        public E f;
        public G g;
        public d h;
        public Long i;
        public ResultReceiver j;

        public x a() {
            byte[] bArr = this.a;
            Double d = this.b;
            String str = this.c;
            List list = this.d;
            Integer num = this.e;
            E e = this.f;
            G g = this.g;
            return new x(bArr, d, str, list, num, e, g == null ? null : g.toString(), this.h, this.i, null, this.j);
        }

        public a b(List list) {
            this.d = list;
            return this;
        }

        public a c(d dVar) {
            this.h = dVar;
            return this;
        }

        public a d(byte[] bArr) {
            this.a = (byte[]) com.google.android.gms.common.internal.t.l(bArr);
            return this;
        }

        public a e(Integer num) {
            this.e = num;
            return this;
        }

        public a f(String str) {
            this.c = (String) com.google.android.gms.common.internal.t.l(str);
            return this;
        }

        public a g(Double d) {
            this.b = d;
            return this;
        }

        public a h(E e) {
            this.f = e;
            return this;
        }

        public final a i(Long l) {
            this.i = l;
            return this;
        }

        public final a j(G g) {
            this.g = g;
            return this;
        }
    }

    public x(byte[] bArr, Double d, String str, List list, Integer num, E e, String str2, d dVar, Long l, String str3, ResultReceiver resultReceiver) {
        this.j = resultReceiver;
        if (str3 == null || !zzia.zzc()) {
            this.a = (byte[]) com.google.android.gms.common.internal.t.l(bArr);
            this.b = d;
            this.c = (String) com.google.android.gms.common.internal.t.l(str);
            this.d = list;
            this.e = num;
            this.f = e;
            this.i = l;
            if (str2 != null) {
                try {
                    this.g = G.b(str2);
                } catch (n0 e2) {
                    throw new IllegalArgumentException(e2);
                }
            } else {
                this.g = null;
            }
            this.h = dVar;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            a aVar = new a();
            aVar.d(E6.c.b(jSONObject.getString("challenge")));
            if (jSONObject.has("timeout")) {
                aVar.g(Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d));
            } else if (jSONObject.has("timeoutSeconds")) {
                aVar.g(Double.valueOf(jSONObject.getDouble("timeoutSeconds")));
            }
            aVar.f(jSONObject.getString("rpId"));
            JSONArray jSONArray = jSONObject.has("allowList") ? jSONObject.getJSONArray("allowList") : jSONObject.has("allowCredentials") ? jSONObject.getJSONArray("allowCredentials") : null;
            if (jSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(v.P1(jSONArray.getJSONObject(i)));
                }
                aVar.b(arrayList);
            }
            if (jSONObject.has("requestId")) {
                aVar.e(Integer.valueOf(jSONObject.getInt("requestId")));
            }
            if (jSONObject.has("tokenBinding")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("tokenBinding");
                aVar.h(new E(jSONObject2.getString("status"), jSONObject2.has("id") ? jSONObject2.getString("id") : null));
            }
            if (jSONObject.has("userVerification")) {
                aVar.j(G.b(jSONObject.getString("userVerification")));
            }
            if (jSONObject.has("authenticationExtensions")) {
                aVar.c(d.O1(jSONObject.getJSONObject("authenticationExtensions")));
            } else if (jSONObject.has("extensions")) {
                aVar.c(d.O1(jSONObject.getJSONObject("extensions")));
            }
            if (jSONObject.has("longRequestId")) {
                aVar.i(Long.valueOf(jSONObject.getLong("longRequestId")));
            }
            x a2 = aVar.a();
            this.a = a2.a;
            this.b = a2.b;
            this.c = a2.c;
            this.d = a2.d;
            this.e = a2.e;
            this.f = a2.f;
            this.g = a2.g;
            this.h = a2.h;
            this.i = a2.i;
        } catch (n0 e3) {
            e = e3;
            throw new IllegalArgumentException(e);
        } catch (JSONException e4) {
            e = e4;
            throw new IllegalArgumentException(e);
        }
    }

    public List M1() {
        return this.d;
    }

    public d N1() {
        return this.h;
    }

    public byte[] O1() {
        return this.a;
    }

    public Integer P1() {
        return this.e;
    }

    public String Q1() {
        return this.c;
    }

    public Double R1() {
        return this.b;
    }

    public E S1() {
        return this.f;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Arrays.equals(this.a, xVar.a) && com.google.android.gms.common.internal.r.b(this.b, xVar.b) && com.google.android.gms.common.internal.r.b(this.c, xVar.c) && (((list = this.d) == null && xVar.d == null) || (list != null && (list2 = xVar.d) != null && list.containsAll(list2) && xVar.d.containsAll(this.d))) && com.google.android.gms.common.internal.r.b(this.e, xVar.e) && com.google.android.gms.common.internal.r.b(this.f, xVar.f) && com.google.android.gms.common.internal.r.b(this.g, xVar.g) && com.google.android.gms.common.internal.r.b(this.h, xVar.h) && com.google.android.gms.common.internal.r.b(this.i, xVar.i);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.r.c(Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final String toString() {
        d dVar = this.h;
        G g = this.g;
        E e = this.f;
        List list = this.d;
        return "PublicKeyCredentialRequestOptions{\n challenge=" + E6.c.e(this.a) + ", \n timeoutSeconds=" + this.b + ", \n rpId='" + this.c + "', \n allowList=" + String.valueOf(list) + ", \n requestId=" + this.e + ", \n tokenBinding=" + String.valueOf(e) + ", \n userVerification=" + String.valueOf(g) + ", \n authenticationExtensions=" + String.valueOf(dVar) + ", \n longRequestId=" + this.i + "}";
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = y6.c.a(parcel);
        y6.c.k(parcel, 2, O1(), false);
        y6.c.o(parcel, 3, R1(), false);
        y6.c.E(parcel, 4, Q1(), false);
        y6.c.I(parcel, 5, M1(), false);
        y6.c.w(parcel, 6, P1(), false);
        y6.c.C(parcel, 7, S1(), i, false);
        G g = this.g;
        y6.c.E(parcel, 8, g == null ? null : g.toString(), false);
        y6.c.C(parcel, 9, N1(), i, false);
        y6.c.z(parcel, 10, this.i, false);
        y6.c.E(parcel, 11, null, false);
        y6.c.C(parcel, 12, this.j, i, false);
        y6.c.b(parcel, a2);
    }
}
