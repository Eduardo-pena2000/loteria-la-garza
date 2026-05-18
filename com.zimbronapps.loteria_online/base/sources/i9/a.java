package I9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    public final String a;
    public final float b;
    public final float c;

    public class a implements Parcelable.Creator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public a(String str, float f, float f2) {
        this.a = str;
        this.b = f;
        this.c = f2;
    }

    public String b() {
        return this.a;
    }

    public float c() {
        return this.b;
    }

    public float d() {
        return this.c;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
    }

    public a(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
    }
}
