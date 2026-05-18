package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteClosable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.t;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import w6.h;
import w6.i;
import y6.c;

@KeepName
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class DataHolder extends y6.a implements Closeable {
    public static final Parcelable.Creator CREATOR = new i();
    public static final a k = new com.google.android.gms.common.data.a(new String[0], null);
    public final int a;
    public final String[] b;
    public Bundle c;
    public final CursorWindow[] d;
    public final int e;
    public final Bundle f;
    public int[] g;
    public int h;
    public boolean i = false;
    public boolean j = true;

    public static class a {
        public final String[] a;
        public final ArrayList b = new ArrayList();
        public final HashMap c = new HashMap();

        public /* synthetic */ a(String[] strArr, String str, h hVar) {
            this.a = (String[]) t.l(strArr);
        }
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.a = i;
        this.b = strArr;
        this.d = cursorWindowArr;
        this.e = i2;
        this.f = bundle;
    }

    public boolean M1(String str, int i, int i2) {
        X1(str, i);
        return this.d[i2].getLong(i, this.c.getInt(str)) == 1;
    }

    public int N1(String str, int i, int i2) {
        X1(str, i);
        return this.d[i2].getInt(i, this.c.getInt(str));
    }

    public long O1(String str, int i, int i2) {
        X1(str, i);
        return this.d[i2].getLong(i, this.c.getInt(str));
    }

    public Bundle P1() {
        return this.f;
    }

    public int Q1() {
        return this.e;
    }

    public String R1(String str, int i, int i2) {
        X1(str, i);
        return this.d[i2].getString(i, this.c.getInt(str));
    }

    public int S1(int i) {
        int length;
        int i2 = 0;
        t.o(i >= 0 && i < this.h);
        while (true) {
            int[] iArr = this.g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    public boolean T1(String str) {
        return this.c.containsKey(str);
    }

    public boolean U1(String str, int i, int i2) {
        X1(str, i);
        return this.d[i2].isNull(i, this.c.getInt(str));
    }

    public final float V1(String str, int i, int i2) {
        X1(str, i);
        return this.d[i2].getFloat(i, this.c.getInt(str));
    }

    public final void W1() {
        this.c = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.b;
            if (i2 >= strArr.length) {
                break;
            }
            this.c.putInt(strArr[i2], i2);
            i2++;
        }
        this.g = new int[this.d.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.d;
            if (i >= cursorWindowArr.length) {
                this.h = i3;
                return;
            }
            this.g[i] = i3;
            i3 += this.d[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
            i++;
        }
    }

    public final void X1(String str, int i) {
        Bundle bundle = this.c;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        }
        if (n1()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.h) {
            throw new CursorIndexOutOfBoundsException(i, this.h);
        }
    }

    public void close() {
        synchronized (this) {
            try {
                if (!this.i) {
                    this.i = true;
                    int i = 0;
                    while (true) {
                        SQLiteClosable[] sQLiteClosableArr = this.d;
                        if (i >= sQLiteClosableArr.length) {
                            break;
                        }
                        sQLiteClosableArr[i].close();
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() {
        try {
            if (this.j && this.d.length > 0 && !n1()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    public int getCount() {
        return this.h;
    }

    public boolean n1() {
        boolean z;
        synchronized (this) {
            z = this.i;
        }
        return z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.b;
        int a2 = c.a(parcel);
        c.F(parcel, 1, strArr, false);
        c.H(parcel, 2, this.d, i, false);
        c.t(parcel, 3, Q1());
        c.j(parcel, 4, P1(), false);
        c.t(parcel, 1000, this.a);
        c.b(parcel, a2);
        if ((i & 1) != 0) {
            close();
        }
    }
}
