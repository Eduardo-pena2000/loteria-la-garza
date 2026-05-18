package D3;

import M2.x;
import P2.K;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import t7.k;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements x.b {
    public static final Parcelable.Creator CREATOR = new a();
    public final List a;

    public class a implements Parcelable.Creator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new b(arrayList);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public static final class b implements Parcelable {
        public final long a;
        public final long b;
        public final int c;
        public static final Comparator d = new c();
        public static final Parcelable.Creator CREATOR = new a();

        public class a implements Parcelable.Creator {
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(long j, long j2, int i) {
            P2.a.a(j < j2);
            this.a = j;
            this.b = j2;
            this.c = i;
        }

        public static /* synthetic */ int b(b bVar, b bVar2) {
            return c(bVar, bVar2);
        }

        public static /* synthetic */ int c(b bVar, b bVar2) {
            return k.j().e(bVar.a, bVar2.a).e(bVar.b, bVar2.b).d(bVar.c, bVar2.c).i();
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
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public int hashCode() {
            return s7.k.b(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c)});
        }

        public String toString() {
            return K.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c));
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.a);
            parcel.writeLong(this.b);
            parcel.writeInt(this.c);
        }
    }

    public b(List list) {
        this.a = list;
        P2.a.a(!b(list));
    }

    public static boolean b(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = ((b) list.get(0)).b;
        for (int i = 1; i < list.size(); i++) {
            if (((b) list.get(i)).a < j) {
                return true;
            }
            j = ((b) list.get(i)).b;
        }
        return false;
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
        return this.a.equals(((b) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
    }
}
