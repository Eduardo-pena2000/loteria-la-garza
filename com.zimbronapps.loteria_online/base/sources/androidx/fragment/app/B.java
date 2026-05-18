package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.T;
import androidx.lifecycle.k;
import java.util.ArrayList;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator CREATOR = new a();
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;

    public class a implements Parcelable.Creator {
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i) {
            return new b[i];
        }
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.c.size();
        this.a = new int[size * 6];
        if (!aVar.i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.b = new ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            T.a aVar2 = (T.a) aVar.c.get(i2);
            int i3 = i + 1;
            this.a[i] = aVar2.a;
            ArrayList arrayList = this.b;
            p pVar = aVar2.b;
            arrayList.add(pVar != null ? pVar.mWho : null);
            int[] iArr = this.a;
            iArr[i3] = aVar2.c ? 1 : 0;
            iArr[i + 2] = aVar2.d;
            iArr[i + 3] = aVar2.e;
            int i4 = i + 5;
            iArr[i + 4] = aVar2.f;
            i += 6;
            iArr[i4] = aVar2.g;
            this.c[i2] = aVar2.h.ordinal();
            this.d[i2] = aVar2.i.ordinal();
        }
        this.e = aVar.h;
        this.f = aVar.k;
        this.g = aVar.v;
        this.h = aVar.l;
        this.i = aVar.m;
        this.j = aVar.n;
        this.k = aVar.o;
        this.l = aVar.p;
        this.m = aVar.q;
        this.n = aVar.r;
    }

    public final void b(androidx.fragment.app.a aVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.a.length) {
                aVar.h = this.e;
                aVar.k = this.f;
                aVar.i = true;
                aVar.l = this.h;
                aVar.m = this.i;
                aVar.n = this.j;
                aVar.o = this.k;
                aVar.p = this.l;
                aVar.q = this.m;
                aVar.r = this.n;
                return;
            }
            T.a aVar2 = new T.a();
            int i3 = i + 1;
            aVar2.a = this.a[i];
            if (J.N0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i2 + " base fragment #" + this.a[i3]);
            }
            aVar2.h = k.b.values()[this.c[i2]];
            aVar2.i = k.b.values()[this.d[i2]];
            int[] iArr = this.a;
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            aVar2.c = z;
            int i5 = iArr[i4];
            aVar2.d = i5;
            int i6 = iArr[i + 3];
            aVar2.e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            aVar2.f = i8;
            i += 6;
            int i9 = iArr[i7];
            aVar2.g = i9;
            aVar.d = i5;
            aVar.e = i6;
            aVar.f = i8;
            aVar.g = i9;
            aVar.e(aVar2);
            i2++;
        }
    }

    public androidx.fragment.app.a c(J j) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(j);
        b(aVar);
        aVar.v = this.g;
        for (int i = 0; i < this.b.size(); i++) {
            String str = (String) this.b.get(i);
            if (str != null) {
                ((T.a) aVar.c.get(i)).b = j.k0(str);
            }
        }
        aVar.n(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = (CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) creator.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
