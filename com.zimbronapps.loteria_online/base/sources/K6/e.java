package k6;

import C6.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class e extends zzbz {
    public static final Parcelable.Creator CREATOR = new f();
    public static final w.a g;
    public final int a;
    public List b;
    public List c;
    public List d;
    public List e;
    public List f;

    static {
        w.a aVar = new w.a();
        g = aVar;
        aVar.put("registered", a.a.R1("registered", 2));
        aVar.put("in_progress", a.a.R1("in_progress", 3));
        aVar.put("success", a.a.R1("success", 4));
        aVar.put("failed", a.a.R1("failed", 5));
        aVar.put("escrowed", a.a.R1("escrowed", 6));
    }

    public e(int i, List list, List list2, List list3, List list4, List list5) {
        this.a = i;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }

    public final Map getFieldMappings() {
        return g;
    }

    public final Object getFieldValue(a.a aVar) {
        switch (aVar.S1()) {
            case 1:
                return Integer.valueOf(this.a);
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return this.f;
            default:
                throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.S1());
        }
    }

    public final boolean isFieldSet(a.a aVar) {
        return true;
    }

    public final void setStringsInternal(a.a aVar, String str, ArrayList arrayList) {
        int S1 = aVar.S1();
        if (S1 == 2) {
            this.b = arrayList;
            return;
        }
        if (S1 == 3) {
            this.c = arrayList;
            return;
        }
        if (S1 == 4) {
            this.d = arrayList;
        } else if (S1 == 5) {
            this.e = arrayList;
        } else {
            if (S1 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", new Object[]{Integer.valueOf(S1)}));
            }
            this.f = arrayList;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        y6.c.t(parcel, 1, this.a);
        y6.c.G(parcel, 2, this.b, false);
        y6.c.G(parcel, 3, this.c, false);
        y6.c.G(parcel, 4, this.d, false);
        y6.c.G(parcel, 5, this.e, false);
        y6.c.G(parcel, 6, this.f, false);
        y6.c.b(parcel, a);
    }
}
