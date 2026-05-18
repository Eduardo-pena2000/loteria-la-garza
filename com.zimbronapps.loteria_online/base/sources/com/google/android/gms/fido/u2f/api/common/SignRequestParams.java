package com.google.android.gms.fido.u2f.api.common;

import S6.a;
import S6.e;
import S6.m;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import y6.c;

@Deprecated
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class SignRequestParams extends RequestParams {
    public static final Parcelable.Creator CREATOR = new m();
    public final Integer a;
    public final Double b;
    public final Uri c;
    public final byte[] d;
    public final List e;
    public final a f;
    public final String g;
    public final Set h;

    public SignRequestParams(Integer num, Double d, Uri uri, byte[] bArr, List list, a aVar, String str) {
        this.a = num;
        this.b = d;
        this.c = uri;
        this.d = bArr;
        this.e = list;
        this.f = aVar;
        HashSet hashSet = new HashSet();
        if (uri != null) {
            hashSet.add(uri);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                t.b((eVar.M1() == null && uri == null) ? false : true, "registered key has null appId and no request appId is provided");
                eVar.N1();
                t.b(true, "register request has null challenge and no default challenge isprovided");
                if (eVar.M1() != null) {
                    hashSet.add(Uri.parse(eVar.M1()));
                }
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

    public byte[] O1() {
        return this.d;
    }

    public String P1() {
        return this.g;
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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignRequestParams)) {
            return false;
        }
        SignRequestParams signRequestParams = (SignRequestParams) obj;
        return r.b(this.a, signRequestParams.a) && r.b(this.b, signRequestParams.b) && r.b(this.c, signRequestParams.c) && Arrays.equals(this.d, signRequestParams.d) && this.e.containsAll(signRequestParams.e) && signRequestParams.e.containsAll(this.e) && r.b(this.f, signRequestParams.f) && r.b(this.g, signRequestParams.g);
    }

    public int hashCode() {
        return r.c(this.a, this.c, this.b, this.e, this.f, this.g, Integer.valueOf(Arrays.hashCode(this.d)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = c.a(parcel);
        c.w(parcel, 2, R1(), false);
        c.o(parcel, 3, S1(), false);
        c.C(parcel, 4, M1(), i, false);
        c.k(parcel, 5, O1(), false);
        c.I(parcel, 6, Q1(), false);
        c.C(parcel, 7, N1(), i, false);
        c.E(parcel, 8, P1(), false);
        c.b(parcel, a);
    }
}
