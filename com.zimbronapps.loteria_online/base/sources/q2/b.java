package Q2;

import M2.x;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements x.b {
    public static final Parcelable.Creator CREATOR = new a();
    public final float a;
    public final float b;

    public class a implements Parcelable.Creator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, (a) null);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
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
        return this.a == bVar.a && this.b == bVar.b;
    }

    public int hashCode() {
        return ((527 + w7.c.a(this.a)) * 31) + w7.c.a(this.b);
    }

    public String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
    }

    public b(float f, float f2) {
        P2.a.b(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.a = f;
        this.b = f2;
    }

    public b(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
    }
}
