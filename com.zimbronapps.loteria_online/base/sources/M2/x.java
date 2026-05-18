package M2;

import M2.w;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class x implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    public final b[] a;
    public final long b;

    public class a implements Parcelable.Creator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x createFromParcel(Parcel parcel) {
            return new x(parcel);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x[] newArray(int i) {
            return new x[i];
        }
    }

    public x(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public x b(b... bVarArr) {
        return bVarArr.length == 0 ? this : new x(this.b, (b[]) P2.K.O0(this.a, bVarArr));
    }

    public x c(x xVar) {
        return xVar == null ? this : b(xVar.a);
    }

    public x d(long j) {
        return this.b == j ? this : new x(j, this.a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return Arrays.equals(this.a, xVar.a) && this.b == xVar.b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + w7.h.b(this.b);
    }

    public b i(int i) {
        return this.a[i];
    }

    public int j() {
        return this.a.length;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("entries=");
        sb.append(Arrays.toString(this.a));
        if (this.b == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.b;
        }
        sb.append(str);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.length);
        for (b bVar : this.a) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.b);
    }

    public x(long j, b... bVarArr) {
        this.b = j;
        this.a = bVarArr;
    }

    public x(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public x(long j, List list) {
        this(j, (b[]) list.toArray(new b[0]));
    }

    public x(Parcel parcel) {
        this.a = new b[parcel.readInt()];
        int i = 0;
        while (true) {
            b[] bVarArr = this.a;
            if (i < bVarArr.length) {
                bVarArr[i] = (b) parcel.readParcelable(b.class.getClassLoader());
                i++;
            } else {
                this.b = parcel.readLong();
                return;
            }
        }
    }

    public interface b extends Parcelable {
        default q B() {
            return null;
        }

        default byte[] E1() {
            return null;
        }

        default void x1(w.b bVar) {
        }
    }
}
