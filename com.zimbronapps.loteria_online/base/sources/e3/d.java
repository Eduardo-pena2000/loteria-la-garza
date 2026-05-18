package E3;

import P2.E;
import P2.z;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class d extends E3.b {
    public static final Parcelable.Creator CREATOR = new a();
    public final long a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final int k;
    public final int l;
    public final int m;

    public class a implements Parcelable.Creator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i) {
            return new d[i];
        }
    }

    public static final class b {
        public final int a;
        public final long b;
        public final long c;

        public /* synthetic */ b(int i, long j, long j2, a aVar) {
            this(i, j, j2);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }

        public b(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static d b(z zVar, long j, E e) {
        List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int i;
        int i2;
        int i3;
        boolean z4;
        boolean z5;
        long j4;
        long I = zVar.I();
        boolean z6 = (zVar.G() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z6) {
            list = emptyList;
            z = false;
            z2 = false;
            j2 = -9223372036854775807L;
            z3 = false;
            j3 = -9223372036854775807L;
            i = 0;
            i2 = 0;
            i3 = 0;
            z4 = false;
        } else {
            int G = zVar.G();
            boolean z7 = (G & 128) != 0;
            boolean z8 = (G & 64) != 0;
            boolean z9 = (G & 32) != 0;
            boolean z10 = (G & 16) != 0;
            long c = (!z8 || z10) ? -9223372036854775807L : g.c(zVar, j);
            if (!z8) {
                int G2 = zVar.G();
                List arrayList = new ArrayList(G2);
                for (int i4 = 0; i4 < G2; i4++) {
                    int G3 = zVar.G();
                    long c2 = !z10 ? g.c(zVar, j) : -9223372036854775807L;
                    arrayList.add(new b(G3, c2, e.b(c2), null));
                }
                emptyList = arrayList;
            }
            if (z9) {
                long G4 = zVar.G();
                boolean z11 = (128 & G4) != 0;
                j4 = ((((G4 & 1) << 32) | zVar.I()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                j4 = -9223372036854775807L;
            }
            i = zVar.M();
            z4 = z8;
            i2 = zVar.G();
            i3 = zVar.G();
            list = emptyList;
            long j5 = c;
            z3 = z5;
            j3 = j4;
            z2 = z10;
            z = z7;
            j2 = j5;
        }
        return new d(I, z6, z, z4, z2, j2, e.b(j2), list, z3, j3, i, i2, i3);
    }

    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f + ", programSplicePlaybackPositionUs= " + this.g + " }";
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        int size = this.h.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((b) this.h.get(i2)).b(parcel);
        }
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
    }

    public d(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j2;
        this.g = j3;
        this.h = Collections.unmodifiableList(list);
        this.i = z5;
        this.j = j4;
        this.k = i;
        this.l = i2;
        this.m = i3;
    }

    public d(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readByte() == 1;
        this.c = parcel.readByte() == 1;
        this.d = parcel.readByte() == 1;
        this.e = parcel.readByte() == 1;
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(b.a(parcel));
        }
        this.h = Collections.unmodifiableList(arrayList);
        this.i = parcel.readByte() == 1;
        this.j = parcel.readLong();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
    }
}
