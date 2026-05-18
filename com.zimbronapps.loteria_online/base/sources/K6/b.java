package k6;

import C6.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class b extends zzbz {
    public static final Parcelable.Creator CREATOR = new c();
    public static final HashMap f;
    public final Set a;
    public final int b;
    public ArrayList c;
    public int d;
    public e e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("authenticatorData", a.a.O1("authenticatorData", 2, g.class));
        hashMap.put("progress", a.a.N1("progress", 4, e.class));
    }

    public b(Set set, int i, ArrayList arrayList, int i2, e eVar) {
        this.a = set;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
        this.e = eVar;
    }

    public final void addConcreteTypeArrayInternal(a.a aVar, String str, ArrayList arrayList) {
        int S1 = aVar.S1();
        if (S1 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[]{Integer.valueOf(S1), arrayList.getClass().getCanonicalName()}));
        }
        this.c = arrayList;
        this.a.add(Integer.valueOf(S1));
    }

    public final void addConcreteTypeInternal(a.a aVar, String str, C6.a aVar2) {
        int S1 = aVar.S1();
        if (S1 != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(S1), aVar2.getClass().getCanonicalName()}));
        }
        this.e = (e) aVar2;
        this.a.add(Integer.valueOf(S1));
    }

    public final /* synthetic */ Map getFieldMappings() {
        return f;
    }

    public final Object getFieldValue(a.a aVar) {
        int S1 = aVar.S1();
        if (S1 == 1) {
            return Integer.valueOf(this.b);
        }
        if (S1 == 2) {
            return this.c;
        }
        if (S1 == 4) {
            return this.e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.S1());
    }

    public final boolean isFieldSet(a.a aVar) {
        return this.a.contains(Integer.valueOf(aVar.S1()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            y6.c.t(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            y6.c.I(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            y6.c.t(parcel, 3, this.d);
        }
        if (set.contains(4)) {
            y6.c.C(parcel, 4, this.e, i, true);
        }
        y6.c.b(parcel, a);
    }
}
