package Q2;

import M2.x;
import P2.K;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import w7.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements x.b {
    public static final Parcelable.Creator CREATOR = new a();
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;

    public class a implements Parcelable.Creator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i) {
            return new a[i];
        }
    }

    public /* synthetic */ a(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && Arrays.equals(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
    }

    public int hashCode() {
        return ((((((527 + this.a.hashCode()) * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }

    public String toString() {
        int i = this.d;
        return "mdta: key=" + this.a + ", value=" + (i != 1 ? i != 23 ? i != 67 ? K.g1(this.b) : String.valueOf(f.f(this.b)) : String.valueOf(Float.intBitsToFloat(f.f(this.b))) : K.H(this.b));
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }

    public a(String str, byte[] bArr, int i, int i2) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
    }

    public a(Parcel parcel) {
        this.a = (String) K.i(parcel.readString());
        this.b = (byte[]) K.i(parcel.createByteArray());
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }
}
