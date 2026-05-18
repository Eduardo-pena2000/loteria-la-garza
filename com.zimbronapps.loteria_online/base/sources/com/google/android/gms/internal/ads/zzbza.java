package com.google.android.gms.internal.ads;

import S5.k1;
import S5.l2;
import S5.q2;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbza implements Parcelable.Creator {
    public static final zzbyz zza(Parcel parcel) {
        int M = y6.b.M(parcel);
        Bundle bundle = null;
        l2 l2Var = null;
        q2 q2Var = null;
        String str = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        W5.a aVar = null;
        Bundle bundle2 = null;
        List list = null;
        Bundle bundle3 = null;
        String str5 = null;
        String str6 = null;
        List list2 = null;
        String str7 = null;
        zzbkh zzbkhVar = null;
        List list3 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Bundle bundle4 = null;
        String str11 = null;
        k1 k1Var = null;
        Bundle bundle5 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        List list4 = null;
        String str15 = null;
        List list5 = null;
        ArrayList arrayList = null;
        String str16 = null;
        zzbqs zzbqsVar = null;
        String str17 = null;
        Bundle bundle6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z3 = false;
        boolean z4 = false;
        int i7 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i8 = 0;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        float f = 0.0f;
        float f2 = 0.0f;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    i = y6.b.F(parcel, D);
                    break;
                case 2:
                    bundle = y6.b.f(parcel, D);
                    break;
                case 3:
                    l2Var = (l2) y6.b.p(parcel, D, l2.CREATOR);
                    break;
                case 4:
                    q2Var = (q2) y6.b.p(parcel, D, q2.CREATOR);
                    break;
                case 5:
                    str = y6.b.q(parcel, D);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) y6.b.p(parcel, D, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) y6.b.p(parcel, D, PackageInfo.CREATOR);
                    break;
                case 8:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 9:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 10:
                    str4 = y6.b.q(parcel, D);
                    break;
                case 11:
                    aVar = (W5.a) y6.b.p(parcel, D, W5.a.CREATOR);
                    break;
                case 12:
                    bundle2 = y6.b.f(parcel, D);
                    break;
                case 13:
                    i2 = y6.b.F(parcel, D);
                    break;
                case 14:
                    list = y6.b.s(parcel, D);
                    break;
                case 15:
                    bundle3 = y6.b.f(parcel, D);
                    break;
                case 16:
                    z = y6.b.x(parcel, D);
                    break;
                case 17:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    y6.b.L(parcel, D);
                    break;
                case 18:
                    i3 = y6.b.F(parcel, D);
                    break;
                case 19:
                    i4 = y6.b.F(parcel, D);
                    break;
                case 20:
                    f = y6.b.B(parcel, D);
                    break;
                case 21:
                    str5 = y6.b.q(parcel, D);
                    break;
                case 25:
                    j = y6.b.H(parcel, D);
                    break;
                case 26:
                    str6 = y6.b.q(parcel, D);
                    break;
                case 27:
                    list2 = y6.b.s(parcel, D);
                    break;
                case 28:
                    str7 = y6.b.q(parcel, D);
                    break;
                case 29:
                    zzbkhVar = (zzbkh) y6.b.p(parcel, D, zzbkh.CREATOR);
                    break;
                case 30:
                    list3 = y6.b.s(parcel, D);
                    break;
                case 31:
                    j2 = y6.b.H(parcel, D);
                    break;
                case 33:
                    str8 = y6.b.q(parcel, D);
                    break;
                case 34:
                    f2 = y6.b.B(parcel, D);
                    break;
                case 35:
                    i5 = y6.b.F(parcel, D);
                    break;
                case 36:
                    i6 = y6.b.F(parcel, D);
                    break;
                case 37:
                    z3 = y6.b.x(parcel, D);
                    break;
                case 39:
                    str9 = y6.b.q(parcel, D);
                    break;
                case 40:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 41:
                    str10 = y6.b.q(parcel, D);
                    break;
                case 42:
                    z4 = y6.b.x(parcel, D);
                    break;
                case 43:
                    i7 = y6.b.F(parcel, D);
                    break;
                case 44:
                    bundle4 = y6.b.f(parcel, D);
                    break;
                case 45:
                    str11 = y6.b.q(parcel, D);
                    break;
                case 46:
                    k1Var = (k1) y6.b.p(parcel, D, k1.CREATOR);
                    break;
                case 47:
                    z5 = y6.b.x(parcel, D);
                    break;
                case 48:
                    bundle5 = y6.b.f(parcel, D);
                    break;
                case 49:
                    str12 = y6.b.q(parcel, D);
                    break;
                case 50:
                    str13 = y6.b.q(parcel, D);
                    break;
                case 51:
                    str14 = y6.b.q(parcel, D);
                    break;
                case 52:
                    z6 = y6.b.x(parcel, D);
                    break;
                case 53:
                    list4 = y6.b.l(parcel, D);
                    break;
                case 54:
                    str15 = y6.b.q(parcel, D);
                    break;
                case 55:
                    list5 = y6.b.s(parcel, D);
                    break;
                case 56:
                    i8 = y6.b.F(parcel, D);
                    break;
                case 57:
                    z7 = y6.b.x(parcel, D);
                    break;
                case 58:
                    z8 = y6.b.x(parcel, D);
                    break;
                case 59:
                    z9 = y6.b.x(parcel, D);
                    break;
                case 60:
                    arrayList = y6.b.s(parcel, D);
                    break;
                case 61:
                    str16 = y6.b.q(parcel, D);
                    break;
                case 63:
                    zzbqsVar = (zzbqs) y6.b.p(parcel, D, zzbqs.CREATOR);
                    break;
                case 64:
                    str17 = y6.b.q(parcel, D);
                    break;
                case 65:
                    bundle6 = y6.b.f(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new zzbyz(i, bundle, l2Var, q2Var, str, applicationInfo, packageInfo, str2, str3, str4, aVar, bundle2, i2, list, bundle3, z, i3, i4, f, str5, j, str6, list2, str7, zzbkhVar, list3, j2, str8, f2, z2, i5, i6, z3, str9, str10, z4, i7, bundle4, str11, k1Var, z5, bundle5, str12, str13, str14, z6, list4, str15, list5, i8, z7, z8, z9, arrayList, str16, zzbqsVar, str17, bundle6);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zza(parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbyz[i];
    }
}
