package E3;

import P2.E;
import P2.z;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class g extends b {
    public static final Parcelable.Creator CREATOR = new a();
    public final long a;
    public final long b;

    public class a implements Parcelable.Creator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i) {
            return new g[i];
        }
    }

    public /* synthetic */ g(long j, long j2, a aVar) {
        this(j, j2);
    }

    public static g b(z zVar, long j, E e) {
        long c = c(zVar, j);
        return new g(c, e.b(c));
    }

    public static long c(z zVar, long j) {
        long G = zVar.G();
        if ((128 & G) != 0) {
            return 8589934591L & ((((G & 1) << 32) | zVar.I()) + j);
        }
        return -9223372036854775807L;
    }

    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.a + ", playbackPositionUs= " + this.b + " }";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }

    public g(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
