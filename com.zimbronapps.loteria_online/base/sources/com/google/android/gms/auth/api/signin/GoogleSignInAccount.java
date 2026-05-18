package com.google.android.gms.auth.api.signin;

import E6.f;
import E6.i;
import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o6.c;
import o6.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class GoogleSignInAccount extends y6.a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new d();
    public static final f n = i.c();
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Uri f;
    public String g;
    public final long h;
    public final String i;
    public final List j;
    public final String k;
    public final String l;
    public final Set m = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.g = str5;
        this.h = j;
        this.i = str6;
        this.j = list;
        this.k = str7;
        this.l = str8;
    }

    public static GoogleSignInAccount M1() {
        return Y1(new Account("<<default account>>", "com.google"), new HashSet());
    }

    public static GoogleSignInAccount U1(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l.longValue(), t.f(str7), new ArrayList((Collection) t.l(set)), str5, str6);
    }

    public static GoogleSignInAccount V1(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount U1 = U1(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        U1.g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return U1;
    }

    public static GoogleSignInAccount Y1(Account account, Set set) {
        return U1(null, null, account.name, null, null, null, null, 0L, account.name, set);
    }

    public String B1() {
        return this.d;
    }

    public Account N1() {
        String str = this.d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String O1() {
        return this.l;
    }

    public String P1() {
        return this.k;
    }

    public String Q1() {
        return this.b;
    }

    public String R1() {
        return this.c;
    }

    public Set S1() {
        HashSet hashSet = new HashSet(this.j);
        hashSet.addAll(this.m);
        return hashSet;
    }

    public String T1() {
        return this.g;
    }

    public final String W1() {
        return this.i;
    }

    public final String X1() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (Q1() != null) {
                jSONObject.put("id", Q1());
            }
            if (R1() != null) {
                jSONObject.put("tokenId", R1());
            }
            if (B1() != null) {
                jSONObject.put("email", B1());
            }
            if (getDisplayName() != null) {
                jSONObject.put("displayName", getDisplayName());
            }
            if (P1() != null) {
                jSONObject.put("givenName", P1());
            }
            if (O1() != null) {
                jSONObject.put("familyName", O1());
            }
            Uri z0 = z0();
            if (z0 != null) {
                jSONObject.put("photoUrl", z0.toString());
            }
            if (T1() != null) {
                jSONObject.put("serverAuthCode", T1());
            }
            jSONObject.put("expirationTime", this.h);
            jSONObject.put("obfuscatedIdentifier", this.i);
            JSONArray jSONArray = new JSONArray();
            List list = this.j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, c.a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.M1());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.i.equals(this.i) && googleSignInAccount.S1().equals(S1());
    }

    public String getDisplayName() {
        return this.e;
    }

    public int hashCode() {
        return ((this.i.hashCode() + 527) * 31) + S1().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, this.a);
        y6.c.E(parcel, 2, Q1(), false);
        y6.c.E(parcel, 3, R1(), false);
        y6.c.E(parcel, 4, B1(), false);
        y6.c.E(parcel, 5, getDisplayName(), false);
        y6.c.C(parcel, 6, z0(), i, false);
        y6.c.E(parcel, 7, T1(), false);
        y6.c.x(parcel, 8, this.h);
        y6.c.E(parcel, 9, this.i, false);
        y6.c.I(parcel, 10, this.j, false);
        y6.c.E(parcel, 11, P1(), false);
        y6.c.E(parcel, 12, O1(), false);
        y6.c.b(parcel, a);
    }

    public Uri z0() {
        return this.f;
    }
}
