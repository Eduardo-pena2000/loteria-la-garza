package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import java.util.List;
import l6.q;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class AuthorizationRequest extends y6.a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new q();
    public final List a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final Account e;
    public final String f;
    public final String g;
    public final boolean h;
    public final Bundle i;
    public final boolean j;

    public static final class a {
        public List a;
        public String b;
        public boolean c;
        public boolean d;
        public Account e;
        public String f;
        public String g;
        public boolean h;
        public Bundle i;
        public boolean j;

        public a a(b bVar, String str) {
            t.m(bVar, "Resource parameter cannot be null");
            t.m(str, "Resource parameter value cannot be null");
            if (this.i == null) {
                this.i = new Bundle();
            }
            this.i.putString(bVar.a, str);
            return this;
        }

        public AuthorizationRequest b() {
            return new AuthorizationRequest(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }

        public a c(String str) {
            this.f = t.f(str);
            return this;
        }

        public a d(String str, boolean z) {
            j(str);
            this.b = str;
            this.c = true;
            this.h = z;
            return this;
        }

        public a e(Account account) {
            this.e = (Account) t.l(account);
            return this;
        }

        public a f(boolean z) {
            this.j = z;
            return this;
        }

        public a g(List list) {
            boolean z = false;
            if (list != null && !list.isEmpty()) {
                z = true;
            }
            t.b(z, "requestedScopes cannot be null or empty");
            this.a = list;
            return this;
        }

        public final a h(String str) {
            j(str);
            this.b = str;
            this.d = true;
            return this;
        }

        public final a i(String str) {
            this.g = str;
            return this;
        }

        public final String j(String str) {
            t.l(str);
            String str2 = this.b;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            t.b(z, "two different server client ids provided");
            return str;
        }
    }

    public enum b {
        ACCOUNT_SELECTION_TOKEN("account_selection_token"),
        ACCOUNT_SELECTION_STATE("account_selection_state"),
        PICKER_ALLOW_MULTIPLE("allow_multiple"),
        PICKER_MIMETYPES("mimetypes"),
        PICKER_FILE_IDS("file_ids"),
        PICKER_OAUTH_TRIGGER("trigger_onepick");

        public final String a;

        b(String str) {
            this.a = str;
        }
    }

    public AuthorizationRequest(List list, String str, boolean z, boolean z2, Account account, String str2, String str3, boolean z3, Bundle bundle, boolean z4) {
        boolean z5 = false;
        if (list != null && !list.isEmpty()) {
            z5 = true;
        }
        t.b(z5, "requestedScopes cannot be null or empty");
        this.a = list;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = account;
        this.f = str2;
        this.g = str3;
        this.h = z3;
        this.i = bundle;
        this.j = z4;
    }

    public static a M1() {
        return new a();
    }

    public static a V1(AuthorizationRequest authorizationRequest) {
        b bVar;
        t.l(authorizationRequest);
        a M1 = M1();
        M1.g(authorizationRequest.Q1());
        Bundle R1 = authorizationRequest.R1();
        if (R1 != null) {
            for (String str : R1.keySet()) {
                String string = R1.getString(str);
                b[] values = b.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = values[i];
                    if (bVar.a.equals(str)) {
                        break;
                    }
                    i++;
                }
                if (string != null && bVar != null) {
                    M1.a(bVar, string);
                }
            }
        }
        boolean T1 = authorizationRequest.T1();
        String str2 = authorizationRequest.g;
        String O1 = authorizationRequest.O1();
        Account N1 = authorizationRequest.N1();
        String S1 = authorizationRequest.S1();
        if (str2 != null) {
            M1.i(str2);
        }
        if (O1 != null) {
            M1.c(O1);
        }
        if (N1 != null) {
            M1.e(N1);
        }
        if (authorizationRequest.d && S1 != null) {
            M1.h(S1);
        }
        if (authorizationRequest.U1() && S1 != null) {
            M1.d(S1, T1);
        }
        M1.f(authorizationRequest.j);
        return M1;
    }

    public Account N1() {
        return this.e;
    }

    public String O1() {
        return this.f;
    }

    public boolean P1() {
        return this.j;
    }

    public List Q1() {
        return this.a;
    }

    public Bundle R1() {
        return this.i;
    }

    public String S1() {
        return this.b;
    }

    public boolean T1() {
        return this.h;
    }

    public boolean U1() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        List list = this.a;
        int size = list.size();
        List list2 = authorizationRequest.a;
        if (size == list2.size() && list.containsAll(list2)) {
            BaseBundle baseBundle = authorizationRequest.i;
            Bundle bundle = this.i;
            if (bundle == null) {
                if (baseBundle == null) {
                    baseBundle = null;
                }
                return false;
            }
            if (bundle == null || baseBundle != null) {
                if (bundle != null) {
                    if (bundle.size() != baseBundle.size()) {
                        return false;
                    }
                    for (String str : bundle.keySet()) {
                        if (!r.b(bundle.getString(str), baseBundle.getString(str))) {
                            return false;
                        }
                    }
                }
                if (this.c == authorizationRequest.c && this.h == authorizationRequest.h && this.d == authorizationRequest.d && this.j == authorizationRequest.j && r.b(this.b, authorizationRequest.b) && r.b(this.e, authorizationRequest.e) && r.b(this.f, authorizationRequest.f) && r.b(this.g, authorizationRequest.g)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return r.c(this.a, this.b, Boolean.valueOf(this.c), Boolean.valueOf(this.h), Boolean.valueOf(this.d), this.e, this.f, this.g, this.i, Boolean.valueOf(this.j));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.I(parcel, 1, Q1(), false);
        c.E(parcel, 2, S1(), false);
        c.g(parcel, 3, U1());
        c.g(parcel, 4, this.d);
        c.C(parcel, 5, N1(), i, false);
        c.E(parcel, 6, O1(), false);
        c.E(parcel, 7, this.g, false);
        c.g(parcel, 8, T1());
        c.j(parcel, 9, R1(), false);
        c.g(parcel, 10, P1());
        c.b(parcel, a2);
    }
}
