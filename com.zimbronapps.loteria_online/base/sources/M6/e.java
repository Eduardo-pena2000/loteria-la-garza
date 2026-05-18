package M6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e extends a {
    public static final Parcelable.Creator CREATOR = new f();
    public final MetadataBundle a;
    public final J6.b b;

    public e(MetadataBundle metadataBundle) {
        this.a = metadataBundle;
        this.b = j.a(metadataBundle);
    }

    public final Object Q0(k kVar) {
        return kVar.d(this.b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 1, this.a, i, false);
        y6.c.b(parcel, a);
    }
}
