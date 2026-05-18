package M6;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class n extends a {
    public static final o CREATOR = new o();
    public final MetadataBundle a;
    public final J6.b b;

    public n(MetadataBundle metadataBundle) {
        this.a = metadataBundle;
        this.b = j.a(metadataBundle);
    }

    public final Object Q0(k kVar) {
        J6.b bVar = this.b;
        return kVar.c(bVar, this.a.N1(bVar));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 1, this.a, i, false);
        y6.c.b(parcel, a);
    }
}
