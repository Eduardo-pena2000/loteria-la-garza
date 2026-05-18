package M6;

import android.os.Parcel;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class p extends a {
    public static final q CREATOR = new q();
    public final MetadataBundle a;
    public final J6.g b;

    public p(MetadataBundle metadataBundle) {
        this.a = metadataBundle;
        this.b = (J6.g) j.a(metadataBundle);
    }

    public final Object Q0(k kVar) {
        J6.g gVar = this.b;
        return kVar.f(gVar, ((Collection) this.a.N1(gVar)).iterator().next());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 1, this.a, i, false);
        y6.c.b(parcel, a);
    }

    public p(J6.c cVar, Object obj) {
        this(MetadataBundle.M1(cVar, Collections.singleton(obj)));
    }
}
