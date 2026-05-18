package com.google.android.gms.fido.u2f.api.common;

import S6.a;
import S6.d;
import S6.e;
import S6.k;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import y6.c;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class RegisterRequestParams extends RequestParams {
    public static final Parcelable.Creator CREATOR = new k();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final List d;
    public final List e;
    public final a f;
    public final String g;
    public Set h;

    public RegisterRequestParams(Integer num, Double d, Uri uri, List list, List list2, a aVar, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        t.b((list == null || list.isEmpty()) ? false : true, "empty list of register requests is provided");
        this.d = list;
        this.e = list2;
        this.f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            t.b((uri == null && dVar.M1() == null) ? false : true, "register request has null appId and no request appId is provided");
            if (dVar.M1() != null) {
                hashSet.add(Uri.parse(dVar.M1()));
            }
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            e eVar = (e) it2.next();
            t.b((uri == null && eVar.M1() == null) ? false : true, "registered key has null appId and no request appId is provided");
            if (eVar.M1() != null) {
                hashSet.add(Uri.parse(eVar.M1()));
            }
        }
        this.h = hashSet;
        t.b(str == null || str.length() <= 80, "Display Hint cannot be longer than 80 characters");
        this.g = str;
    }

    public Uri M1() {
        return this.c;
    }

    public a N1() {
        return this.f;
    }

    public String O1() {
        return this.g;
    }

    public List P1() {
        return this.d;
    }

    public List Q1() {
        return this.e;
    }

    public Integer R1() {
        return this.a;
    }

    public Double S1() {
        return this.b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterRequestParams)) {
            return false;
        }
        RegisterRequestParams registerRequestParams = (RegisterRequestParams) obj;
        return r.b(this.a, registerRequestParams.a) && r.b(this.b, registerRequestParams.b) && r.b(this.c, registerRequestParams.c) && r.b(this.d, registerRequestParams.d) && (((list = this.e) == null && registerRequestParams.e == null) || (list != null && (list2 = registerRequestParams.e) != null && list.containsAll(list2) && registerRequestParams.e.containsAll(this.e))) && r.b(this.f, registerRequestParams.f) && r.b(this.g, registerRequestParams.g);
    }

    public int hashCode() {
        return r.c(this.a, this.c, this.b, this.d, this.e, this.f, this.g);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.w(parcel, 2, R1(), false);
        c.o(parcel, 3, S1(), false);
        c.C(parcel, 4, M1(), i, false);
        c.I(parcel, 5, P1(), false);
        c.I(parcel, 6, Q1(), false);
        c.C(parcel, 7, N1(), i, false);
        c.E(parcel, 8, O1(), false);
        c.b(parcel, a);
    }
}
