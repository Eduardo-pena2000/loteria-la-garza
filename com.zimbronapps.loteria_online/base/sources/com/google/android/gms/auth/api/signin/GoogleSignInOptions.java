package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o6.e;
import o6.f;
import o6.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p6.b;
import y6.c;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class GoogleSignInOptions extends y6.a implements a.d, ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    public static final GoogleSignInOptions l;
    public static final GoogleSignInOptions m;
    public static final Scope n = new Scope("profile");
    public static final Scope o = new Scope("email");
    public static final Scope p = new Scope("openid");
    public static final Scope q;
    public static final Scope r;
    public static final Comparator s;
    public final int a;
    public final ArrayList b;
    public Account c;
    public boolean d;
    public final boolean e;
    public final boolean f;
    public String g;
    public String h;
    public ArrayList i;
    public String j;
    public Map k;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        q = scope;
        r = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.b();
        aVar.c();
        l = aVar.a();
        a aVar2 = new a();
        aVar2.d(scope, new Scope[0]);
        m = aVar2.a();
        CREATOR = new g();
        s = new e();
    }

    public /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, f fVar) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }

    public static /* bridge */ /* synthetic */ Account U1(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.c;
    }

    public static GoogleSignInOptions V1(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, (Map) new HashMap(), (String) null);
    }

    public static /* bridge */ /* synthetic */ String W1(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.h;
    }

    public static /* bridge */ /* synthetic */ String X1(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.j;
    }

    public static /* bridge */ /* synthetic */ String Y1(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.g;
    }

    public static /* bridge */ /* synthetic */ ArrayList a2(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.i;
    }

    public static /* bridge */ /* synthetic */ ArrayList b2(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.b;
    }

    public static /* bridge */ /* synthetic */ Map c2(List list) {
        return g2(list);
    }

    public static /* bridge */ /* synthetic */ boolean d2(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.f;
    }

    public static /* bridge */ /* synthetic */ boolean e2(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.d;
    }

    public static /* bridge */ /* synthetic */ boolean f2(GoogleSignInOptions googleSignInOptions) {
        return googleSignInOptions.e;
    }

    public static Map g2(List list) {
        HashMap hashMap = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p6.a aVar = (p6.a) it.next();
                hashMap.put(Integer.valueOf(aVar.getType()), aVar);
            }
        }
        return hashMap;
    }

    public Account M1() {
        return this.c;
    }

    public ArrayList N1() {
        return this.i;
    }

    public String O1() {
        return this.j;
    }

    public ArrayList P1() {
        return new ArrayList(this.b);
    }

    public String Q1() {
        return this.g;
    }

    public boolean R1() {
        return this.f;
    }

    public boolean S1() {
        return this.d;
    }

    public boolean T1() {
        return this.e;
    }

    public final String Z1() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.b, s);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).M1());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.d);
            jSONObject.put("forceCodeForRefreshToken", this.f);
            jSONObject.put("serverAuthRequested", this.e);
            if (!TextUtils.isEmpty(this.g)) {
                jSONObject.put("serverClientId", this.g);
            }
            if (!TextUtils.isEmpty(this.h)) {
                jSONObject.put("hostedDomain", this.h);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:6:0x0004, B:8:0x000e, B:11:0x0018, B:13:0x0028, B:16:0x0035, B:18:0x0039, B:21:0x004a, B:23:0x0052, B:26:0x006a, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:36:0x005d, B:39:0x0040), top: B:5:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:6:0x0004, B:8:0x000e, B:11:0x0018, B:13:0x0028, B:16:0x0035, B:18:0x0039, B:21:0x004a, B:23:0x0052, B:26:0x006a, B:28:0x0072, B:30:0x007a, B:32:0x0082, B:36:0x005d, B:39:0x0040), top: B:5:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.i     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            java.util.ArrayList r1 = r4.i     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.b     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.P1()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.b     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.P1()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.c     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.M1()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.M1()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.g     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.Q1()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.g     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.Q1()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.R1()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.d     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.S1()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.e     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.T1()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.j     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.O1()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).M1());
        }
        Collections.sort(arrayList);
        b bVar = new b();
        bVar.a(arrayList);
        bVar.a(this.c);
        bVar.a(this.g);
        bVar.c(this.f);
        bVar.c(this.d);
        bVar.c(this.e);
        bVar.a(this.j);
        return bVar.b();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a2 = c.a(parcel);
        c.t(parcel, 1, i2);
        c.I(parcel, 2, P1(), false);
        c.C(parcel, 3, M1(), i, false);
        c.g(parcel, 4, S1());
        c.g(parcel, 5, T1());
        c.g(parcel, 6, R1());
        c.E(parcel, 7, Q1(), false);
        c.E(parcel, 8, this.h, false);
        c.I(parcel, 9, N1(), false);
        c.E(parcel, 10, O1(), false);
        c.b(parcel, a2);
    }

    public static final class a {
        public Set a;
        public boolean b;
        public boolean c;
        public boolean d;
        public String e;
        public Account f;
        public String g;
        public Map h;
        public String i;

        public a() {
            this.a = new HashSet();
            this.h = new HashMap();
        }

        public GoogleSignInOptions a() {
            if (this.a.contains(GoogleSignInOptions.r)) {
                Set set = this.a;
                Scope scope = GoogleSignInOptions.q;
                if (set.contains(scope)) {
                    this.a.remove(scope);
                }
            }
            if (this.d && (this.f == null || !this.a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h, this.i, null);
        }

        public a b() {
            this.a.add(GoogleSignInOptions.p);
            return this;
        }

        public a c() {
            this.a.add(GoogleSignInOptions.n);
            return this;
        }

        public a d(Scope scope, Scope... scopeArr) {
            this.a.add(scope);
            this.a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a e(String str) {
            this.i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.a = new HashSet();
            this.h = new HashMap();
            t.l(googleSignInOptions);
            this.a = new HashSet(GoogleSignInOptions.b2(googleSignInOptions));
            this.b = GoogleSignInOptions.f2(googleSignInOptions);
            this.c = GoogleSignInOptions.d2(googleSignInOptions);
            this.d = GoogleSignInOptions.e2(googleSignInOptions);
            this.e = GoogleSignInOptions.Y1(googleSignInOptions);
            this.f = GoogleSignInOptions.U1(googleSignInOptions);
            this.g = GoogleSignInOptions.W1(googleSignInOptions);
            this.h = GoogleSignInOptions.c2(GoogleSignInOptions.a2(googleSignInOptions));
            this.i = GoogleSignInOptions.X1(googleSignInOptions);
        }
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, ArrayList arrayList2, String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, g2(arrayList2), str3);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3) {
        this.a = i;
        this.b = arrayList;
        this.c = account;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = str;
        this.h = str2;
        this.i = new ArrayList(map.values());
        this.k = map;
        this.j = str3;
    }
}
