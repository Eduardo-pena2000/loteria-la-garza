package k6;

import C6.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class i extends zzbz {
    public static final Parcelable.Creator CREATOR = new j();
    public static final HashMap h;
    public final Set a;
    public final int b;
    public String c;
    public int d;
    public byte[] e;
    public PendingIntent f;
    public a g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("accountType", a.a.Q1("accountType", 2));
        hashMap.put("status", a.a.P1("status", 3));
        hashMap.put("transferBytes", a.a.M1("transferBytes", 4));
    }

    public i(Set set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, a aVar) {
        this.a = set;
        this.b = i;
        this.c = str;
        this.d = i2;
        this.e = bArr;
        this.f = pendingIntent;
        this.g = aVar;
    }

    public final /* synthetic */ Map getFieldMappings() {
        return h;
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
            return Integer.valueOf(this.d);
        }
        if (S1 == 4) {
            return this.e;
        }
        throw new IllegalStateException("Unknown SafeParcelable id=" + aVar.S1());
    }

    public final boolean isFieldSet(a.a aVar) {
        return this.a.contains(Integer.valueOf(aVar.S1()));
    }

    public final void setDecodedBytesInternal(a.a aVar, String str, byte[] bArr) {
        int S1 = aVar.S1();
        if (S1 == 4) {
            this.e = bArr;
            this.a.add(Integer.valueOf(S1));
        } else {
            throw new IllegalArgumentException("Field with id=" + S1 + " is not known to be a byte array.");
        }
    }

    public final void setIntegerInternal(a.a aVar, String str, int i) {
        int S1 = aVar.S1();
        if (S1 == 3) {
            this.d = i;
            this.a.add(Integer.valueOf(S1));
        } else {
            throw new IllegalArgumentException("Field with id=" + S1 + " is not known to be an int.");
        }
    }

    public final void setStringInternal(a.a aVar, String str, String str2) {
        int S1 = aVar.S1();
        if (S1 != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(S1)}));
        }
        this.c = str2;
        this.a.add(Integer.valueOf(S1));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = y6.c.a(parcel);
        Set set = this.a;
        if (set.contains(1)) {
            y6.c.t(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            y6.c.E(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            y6.c.t(parcel, 3, this.d);
        }
        if (set.contains(4)) {
            y6.c.k(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            y6.c.C(parcel, 5, this.f, i, true);
        }
        if (set.contains(6)) {
            y6.c.C(parcel, 6, this.g, i, true);
        }
        y6.c.b(parcel, a);
    }
}
