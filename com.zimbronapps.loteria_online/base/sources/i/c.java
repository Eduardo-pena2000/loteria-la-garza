package I;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class c implements Parcelable {
    public final int a;
    public static final b b = new b(null);
    public static final Parcelable.Creator CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel.readInt());
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c[] newArray(int i) {
            return new c[i];
        }
    }

    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.k kVar) {
            this();
        }

        public b() {
        }
    }

    public c(int i) {
        this.a = i;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a == ((c) obj).a;
    }

    public int hashCode() {
        return Integer.hashCode(this.a);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.a + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
