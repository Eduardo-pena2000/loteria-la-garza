package Z2;

import M2.x;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class t implements x.b {
    public static final Parcelable.Creator CREATOR = new a();
    public final String a;
    public final String b;
    public final List c;

    public class a implements Parcelable.Creator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t createFromParcel(Parcel parcel) {
            return new t(parcel);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t[] newArray(int i) {
            return new t[i];
        }
    }

    public t(String str, String str2, List list) {
        this.a = str;
        this.b = str2;
        this.c = Collections.unmodifiableList(new ArrayList(list));
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return TextUtils.equals(this.a, tVar.a) && TextUtils.equals(this.b, tVar.b) && this.c.equals(tVar.c);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("HlsTrackMetadataEntry");
        if (this.a != null) {
            str = " [" + this.a + ", " + this.b + "]";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        int size = this.c.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) this.c.get(i2), 0);
        }
    }

    public t(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((b) parcel.readParcelable(b.class.getClassLoader()));
        }
        this.c = Collections.unmodifiableList(arrayList);
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator CREATOR = new a();
        public final int a;
        public final int b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

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

        public b(int i, int i2, String str, String str2, String str3, String str4) {
            this.a = i;
            this.b = i2;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && TextUtils.equals(this.c, bVar.c) && TextUtils.equals(this.d, bVar.d) && TextUtils.equals(this.e, bVar.e) && TextUtils.equals(this.f, bVar.f);
        }

        public int hashCode() {
            int i = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.d;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.f;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        }

        public b(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
        }
    }
}
