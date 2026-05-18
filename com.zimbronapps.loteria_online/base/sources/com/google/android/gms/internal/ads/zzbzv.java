package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbzv implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        Bundle bundle = null;
        W5.a aVar = null;
        ApplicationInfo applicationInfo = null;
        String str = null;
        List list = null;
        PackageInfo packageInfo = null;
        String str2 = null;
        String str3 = null;
        zzflg zzflgVar = null;
        String str4 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    bundle = y6.b.f(parcel, D);
                    break;
                case 2:
                    aVar = (W5.a) y6.b.p(parcel, D, W5.a.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) y6.b.p(parcel, D, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    str = y6.b.q(parcel, D);
                    break;
                case 5:
                    list = y6.b.s(parcel, D);
                    break;
                case 6:
                    packageInfo = (PackageInfo) y6.b.p(parcel, D, PackageInfo.CREATOR);
                    break;
                case 7:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 8:
                default:
                    y6.b.L(parcel, D);
                    break;
                case 9:
                    str3 = y6.b.q(parcel, D);
                    break;
                case 10:
                    zzflgVar = (zzflg) y6.b.p(parcel, D, zzflg.CREATOR);
                    break;
                case 11:
                    str4 = y6.b.q(parcel, D);
                    break;
                case 12:
                    z = y6.b.x(parcel, D);
                    break;
                case 13:
                    z2 = y6.b.x(parcel, D);
                    break;
                case 14:
                    bundle2 = y6.b.f(parcel, D);
                    break;
                case 15:
                    bundle3 = y6.b.f(parcel, D);
                    break;
                case 16:
                    i = y6.b.F(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new zzbzu(bundle, aVar, applicationInfo, str, list, packageInfo, str2, str3, zzflgVar, str4, z, z2, bundle2, bundle3, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbzu[i];
    }
}
