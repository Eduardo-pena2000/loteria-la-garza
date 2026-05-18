package M2;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class m implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    public final b[] a;
    public int b;
    public final String c;
    public final int d;

    public class a implements Parcelable.Creator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i) {
            return new m[i];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator CREATOR = new a();
        public int a;
        public final UUID b;
        public final String c;
        public final String d;
        public final byte[] e;

        public class a implements Parcelable.Creator {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public boolean b(b bVar) {
            return d() && !bVar.d() && i(bVar.b);
        }

        public b c(byte[] bArr) {
            return new b(this.b, this.c, this.d, bArr);
        }

        public boolean d() {
            return this.e != null;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return P2.K.c(this.c, bVar.c) && P2.K.c(this.d, bVar.d) && P2.K.c(this.b, bVar.b) && Arrays.equals(this.e, bVar.e);
        }

        public int hashCode() {
            if (this.a == 0) {
                int hashCode = this.b.hashCode() * 31;
                String str = this.c;
                this.a = ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.e);
            }
            return this.a;
        }

        public boolean i(UUID uuid) {
            return g.a.equals(this.b) || uuid.equals(this.b);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.b.getMostSignificantBits());
            parcel.writeLong(this.b.getLeastSignificantBits());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeByteArray(this.e);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.b = (UUID) P2.a.e(uuid);
            this.c = str;
            this.d = y.t((String) P2.a.e(str2));
            this.e = bArr;
        }

        public b(Parcel parcel) {
            this.b = new UUID(parcel.readLong(), parcel.readLong());
            this.c = parcel.readString();
            this.d = (String) P2.K.i(parcel.readString());
            this.e = parcel.createByteArray();
        }
    }

    public m(List list) {
        this(null, false, (b[]) list.toArray(new b[0]));
    }

    public static boolean c(ArrayList arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (((b) arrayList.get(i2)).b.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static m i(m mVar, m mVar2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (mVar != null) {
            str = mVar.c;
            for (b bVar : mVar.a) {
                if (bVar.d()) {
                    arrayList.add(bVar);
                }
            }
        } else {
            str = null;
        }
        if (mVar2 != null) {
            if (str == null) {
                str = mVar2.c;
            }
            int size = arrayList.size();
            for (b bVar2 : mVar2.a) {
                if (bVar2.d() && !c(arrayList, size, bVar2.b)) {
                    arrayList.add(bVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new m(str, (List) arrayList);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(b bVar, b bVar2) {
        UUID uuid = g.a;
        return uuid.equals(bVar.b) ? uuid.equals(bVar2.b) ? 0 : 1 : bVar.b.compareTo(bVar2.b);
    }

    public m d(String str) {
        return P2.K.c(this.c, str) ? this : new m(str, false, this.a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return P2.K.c(this.c, mVar.c) && Arrays.equals(this.a, mVar.a);
    }

    public int hashCode() {
        if (this.b == 0) {
            String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    public b j(int i) {
        return this.a[i];
    }

    public m l(m mVar) {
        String str;
        String str2 = this.c;
        P2.a.f(str2 == null || (str = mVar.c) == null || TextUtils.equals(str2, str));
        String str3 = this.c;
        if (str3 == null) {
            str3 = mVar.c;
        }
        return new m(str3, (b[]) P2.K.O0(this.a, mVar.a));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public m(String str, List list) {
        this(str, false, (b[]) list.toArray(new b[0]));
    }

    public m(b... bVarArr) {
        this((String) null, bVarArr);
    }

    public m(String str, b... bVarArr) {
        this(str, true, bVarArr);
    }

    public m(String str, boolean z, b... bVarArr) {
        this.c = str;
        bVarArr = z ? (b[]) bVarArr.clone() : bVarArr;
        this.a = bVarArr;
        this.d = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public m(Parcel parcel) {
        this.c = parcel.readString();
        b[] bVarArr = (b[]) P2.K.i((b[]) parcel.createTypedArray(b.CREATOR));
        this.a = bVarArr;
        this.d = bVarArr.length;
    }
}
