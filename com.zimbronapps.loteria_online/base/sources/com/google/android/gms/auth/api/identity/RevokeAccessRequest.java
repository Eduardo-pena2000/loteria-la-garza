package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.auth-api.zbbi;
import java.util.List;
import l6.D;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class RevokeAccessRequest extends y6.a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new D();
    public final zbbi a;
    public final Account b;
    public final String c;

    public static abstract class a {
        public abstract RevokeAccessRequest a();

        public abstract a b(Account account);

        public abstract a c(List list);

        public abstract a d(String str);
    }

    public RevokeAccessRequest(List list, Account account, String str) {
        this.a = zbbi.zbi(list);
        this.b = account;
        this.c = str;
    }

    public static a M1() {
        return new b();
    }

    public Account N1() {
        return this.b;
    }

    public List O1() {
        return this.a;
    }

    public final String P1() {
        return this.c;
    }

    public final a Q1() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj instanceof RevokeAccessRequest) {
            RevokeAccessRequest revokeAccessRequest = (RevokeAccessRequest) obj;
            zbbi zbbiVar = this.a;
            int size = zbbiVar.size();
            zbbi zbbiVar2 = revokeAccessRequest.a;
            if (size == zbbiVar2.size() && zbbiVar.containsAll(zbbiVar2) && r.b(this.b, revokeAccessRequest.b) && r.b(this.c, revokeAccessRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return r.c(this.a, this.b, this.c);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.I(parcel, 1, O1(), false);
        c.C(parcel, 2, N1(), i, false);
        c.E(parcel, 3, this.c, false);
        c.b(parcel, a2);
    }
}
