package M6;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.drive.query.internal.FilterHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class r extends a {
    public static final Parcelable.Creator CREATOR = new s();
    public final x a;
    public final List b;
    public List c;

    public r(x xVar, List list) {
        this.a = xVar;
        this.b = list;
    }

    public final Object Q0(k kVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            arrayList.add(((FilterHolder) it.next()).M1().Q0(kVar));
        }
        return kVar.e(this.a, arrayList);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.C(parcel, 1, this.a, i, false);
        y6.c.I(parcel, 2, this.b, false);
        y6.c.b(parcel, a);
    }

    public r(x xVar, Iterable iterable) {
        this.a = xVar;
        this.c = new ArrayList();
        this.b = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            L6.a aVar = (L6.a) it.next();
            this.c.add(aVar);
            this.b.add(new FilterHolder(aVar));
        }
    }
}
