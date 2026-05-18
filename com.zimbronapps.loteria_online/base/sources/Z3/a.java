package z3;

import M2.q;
import M2.x;
import P2.K;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class a implements x.b {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;
    public static final q g = new q.b().o0("application/id3").K();
    public static final q h = new q.b().o0("application/x-scte35").K();
    public static final Parcelable.Creator CREATOR = new a();

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

    public a(String str, String str2, long j, long j2, byte[] bArr) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = bArr;
    }

    public q B() {
        String str = this.a;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return h;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return g;
            default:
                return null;
        }
    }

    public byte[] E1() {
        if (B() != null) {
            return this.e;
        }
        return null;
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
        return this.c == aVar.c && this.d == aVar.d && K.c(this.a, aVar.a) && K.c(this.b, aVar.b) && Arrays.equals(this.e, aVar.e);
    }

    public int hashCode() {
        if (this.f == 0) {
            String str = this.a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.b;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.c;
            int i = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            this.f = ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.e);
        }
        return this.f;
    }

    public String toString() {
        return "EMSG: scheme=" + this.a + ", id=" + this.d + ", durationMs=" + this.c + ", value=" + this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
        parcel.writeByteArray(this.e);
    }

    public a(Parcel parcel) {
        this.a = (String) K.i(parcel.readString());
        this.b = (String) K.i(parcel.readString());
        this.c = parcel.readLong();
        this.d = parcel.readLong();
        this.e = (byte[]) K.i(parcel.createByteArray());
    }
}
