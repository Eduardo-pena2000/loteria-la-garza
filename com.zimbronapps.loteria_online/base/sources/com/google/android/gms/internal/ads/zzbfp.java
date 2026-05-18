package com.google.android.gms.internal.ads;

import V5.o0;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzbfp extends y6.a {
    public static final Parcelable.Creator CREATOR = new zzbfq();
    public final String zza;
    public final long zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final Bundle zzf;
    public final boolean zzg;
    public long zzh;
    public String zzi;
    public int zzj;

    public zzbfp(String str, long j, String str2, String str3, String str4, Bundle bundle, boolean z, long j2, String str5, int i) {
        this.zza = str;
        this.zzb = j;
        this.zzc = str2 == null ? "" : str2;
        this.zzd = str3 == null ? "" : str3;
        this.zze = str4 == null ? "" : str4;
        this.zzf = bundle == null ? new Bundle() : bundle;
        this.zzg = z;
        this.zzh = j2;
        this.zzi = str5;
        this.zzj = i;
    }

    public static zzbfp zza(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 51);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                String sb2 = sb.toString();
                int i = o0.b;
                W5.p.f(sb2);
                return null;
            }
            String str = (String) pathSegments.get(0);
            String str2 = (String) pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new zzbfp(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
        } catch (NullPointerException e) {
            e = e;
            int i2 = o0.b;
            W5.p.g("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e2) {
            e = e2;
            int i22 = o0.b;
            W5.p.g("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 2, str, false);
        y6.c.x(parcel, 3, this.zzb);
        y6.c.E(parcel, 4, this.zzc, false);
        y6.c.E(parcel, 5, this.zzd, false);
        y6.c.E(parcel, 6, this.zze, false);
        y6.c.j(parcel, 7, this.zzf, false);
        y6.c.g(parcel, 8, this.zzg);
        y6.c.x(parcel, 9, this.zzh);
        y6.c.E(parcel, 10, this.zzi, false);
        y6.c.t(parcel, 11, this.zzj);
        y6.c.b(parcel, a);
    }
}
