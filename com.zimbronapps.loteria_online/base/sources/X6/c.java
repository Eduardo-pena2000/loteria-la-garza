package X6;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class c implements Parcelable.Creator {
    public static void a(a aVar, Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.E(parcel, 1, aVar.zze(), false);
        y6.c.E(parcel, 2, aVar.zzf(), false);
        y6.c.x(parcel, 3, aVar.zza());
        y6.c.C(parcel, 4, aVar.zzd(), i, false);
        y6.c.C(parcel, 5, aVar.zzc(), i, false);
        y6.c.C(parcel, 6, aVar.zzb(), i, false);
        y6.c.b(parcel, a);
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int M = y6.b.M(parcel);
        String str = null;
        String str2 = null;
        Uri uri = null;
        Uri uri2 = null;
        Uri uri3 = null;
        long j = 0;
        while (parcel.dataPosition() < M) {
            int D = y6.b.D(parcel);
            switch (y6.b.w(D)) {
                case 1:
                    str = y6.b.q(parcel, D);
                    break;
                case 2:
                    str2 = y6.b.q(parcel, D);
                    break;
                case 3:
                    j = y6.b.H(parcel, D);
                    break;
                case 4:
                    uri = (Uri) y6.b.p(parcel, D, Uri.CREATOR);
                    break;
                case 5:
                    uri2 = (Uri) y6.b.p(parcel, D, Uri.CREATOR);
                    break;
                case 6:
                    uri3 = (Uri) y6.b.p(parcel, D, Uri.CREATOR);
                    break;
                default:
                    y6.b.L(parcel, D);
                    break;
            }
        }
        y6.b.v(parcel, M);
        return new a(str, str2, j, uri, uri2, uri3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new a[i];
    }
}
