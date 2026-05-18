package k6;

import C6.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class g extends zzbz {
    public static final Parcelable.Creator CREATOR = new h();
    public static final HashMap g;
    public final Set a;
    public final int b;
    public i c;
    public String d;
    public String e;
    public String f;

    static {
        HashMap hashMap = new HashMap();
        g = hashMap;
        hashMap.put("authenticatorInfo", a.a.N1("authenticatorInfo", 2, i.class));
        hashMap.put("signature", a.a.Q1("signature", 3));
        hashMap.put("package", a.a.Q1("package", 4));
    }

    public g(Set set, int i, i iVar, String str, String str2, String str3) {
        this.a = set;
        this.b = i;
        this.c = iVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    public final void addConcreteTypeInternal(a.a aVar, String str, C6.a aVar2) {
        int S1 = aVar.S1();
        if (S1 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(S1), aVar2.getClass().getCanonicalName()}));
        }
        this.c = (i) aVar2;
        this.a.add(Integer.valueOf(S1));
    }

    public final /* synthetic */ Map getFieldMappings() {
        return g;
    }

    public final Object getFieldValue(a.a aVar) {
        int S1 = aVar.S1();
        if (S1 == 1) {
            return Integer.valueOf(this.b);
        }
        if (S1 == 2) {
            return this.c;
        }
        if (S1 == 3) {
            return this.d;
        }
        if (S1 == 4) {
            return this.e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.S1());
    }

    public final boolean isFieldSet(a.a aVar) {
        return this.a.contains(Integer.valueOf(aVar.S1()));
    }

    public final void setStringInternal(a.a aVar, String str, String str2) {
        int S1 = aVar.S1();
        if (S1 == 3) {
            this.d = str2;
        } else {
            if (S1 != 4) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(S1)}));
            }
            this.e = str2;
        }
        this.a.add(Integer.valueOf(S1));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            y6.c.t(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            y6.c.C(parcel, 2, this.c, i, true);
        }
        if (set.contains(3)) {
            y6.c.E(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            y6.c.E(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            y6.c.E(parcel, 5, this.f, true);
        }
        y6.c.b(parcel, a);
    }
}
