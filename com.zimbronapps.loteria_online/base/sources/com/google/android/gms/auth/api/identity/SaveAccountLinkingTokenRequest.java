package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import java.util.ArrayList;
import java.util.List;
import l6.E;
import y6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class SaveAccountLinkingTokenRequest extends y6.a implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new E();
    public final PendingIntent a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final int f;

    public static final class a {
        public PendingIntent a;
        public String b;
        public String c;
        public List d = new ArrayList();
        public String e;
        public int f;

        public SaveAccountLinkingTokenRequest a() {
            t.b(this.a != null, "Consent PendingIntent cannot be null");
            t.b("auth_code".equals(this.b), "Invalid tokenType");
            t.b(!TextUtils.isEmpty(this.c), "serviceId cannot be null or empty");
            t.b(this.d != null, "scopes cannot be null");
            return new SaveAccountLinkingTokenRequest(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        public a b(PendingIntent pendingIntent) {
            this.a = pendingIntent;
            return this;
        }

        public a c(List list) {
            this.d = list;
            return this;
        }

        public a d(String str) {
            this.c = str;
            return this;
        }

        public a e(String str) {
            this.b = str;
            return this;
        }

        public final a f(String str) {
            this.e = str;
            return this;
        }

        public final a g(int i) {
            this.f = i;
            return this;
        }
    }

    public SaveAccountLinkingTokenRequest(PendingIntent pendingIntent, String str, String str2, List list, String str3, int i) {
        this.a = pendingIntent;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = str3;
        this.f = i;
    }

    public static a M1() {
        return new a();
    }

    public static a R1(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        t.l(saveAccountLinkingTokenRequest);
        a M1 = M1();
        M1.c(saveAccountLinkingTokenRequest.O1());
        M1.d(saveAccountLinkingTokenRequest.P1());
        M1.b(saveAccountLinkingTokenRequest.N1());
        M1.e(saveAccountLinkingTokenRequest.Q1());
        M1.g(saveAccountLinkingTokenRequest.f);
        String str = saveAccountLinkingTokenRequest.e;
        if (!TextUtils.isEmpty(str)) {
            M1.f(str);
        }
        return M1;
    }

    public PendingIntent N1() {
        return this.a;
    }

    public List O1() {
        return this.d;
    }

    public String P1() {
        return this.c;
    }

    public String Q1() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SaveAccountLinkingTokenRequest)) {
            return false;
        }
        SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest = (SaveAccountLinkingTokenRequest) obj;
        List list = this.d;
        int size = list.size();
        List list2 = saveAccountLinkingTokenRequest.d;
        return size == list2.size() && list.containsAll(list2) && r.b(this.a, saveAccountLinkingTokenRequest.a) && r.b(this.b, saveAccountLinkingTokenRequest.b) && r.b(this.c, saveAccountLinkingTokenRequest.c) && r.b(this.e, saveAccountLinkingTokenRequest.e) && this.f == saveAccountLinkingTokenRequest.f;
    }

    public int hashCode() {
        return r.c(this.a, this.b, this.c, this.d, this.e);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.C(parcel, 1, N1(), i, false);
        c.E(parcel, 2, Q1(), false);
        c.E(parcel, 3, P1(), false);
        c.G(parcel, 4, O1(), false);
        c.E(parcel, 5, this.e, false);
        c.t(parcel, 6, this.f);
        c.b(parcel, a2);
    }
}
