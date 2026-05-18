package E3;

import P2.K;
import P2.z;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a extends b {
    public static final Parcelable.Creator CREATOR = new a();
    public final long a;
    public final long b;
    public final byte[] c;

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

    public static a b(z zVar, int i, long j) {
        long I = zVar.I();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        zVar.l(bArr, 0, i2);
        return new a(I, bArr, j);
    }

    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.a + ", identifier= " + this.b + " }";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeByteArray(this.c);
    }

    public a(long j, byte[] bArr, long j2) {
        this.a = j2;
        this.b = j;
        this.c = bArr;
    }

    public a(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = (byte[]) K.i(parcel.createByteArray());
    }
}
