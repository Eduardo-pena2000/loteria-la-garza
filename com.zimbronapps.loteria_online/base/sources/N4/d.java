package n4;

import android.database.sqlite.SQLiteProgram;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class d implements m4.d {
    public final SQLiteProgram a;

    public d(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    public void D0(int i, String str) {
        this.a.bindString(i, str);
    }

    public void Z0(int i, long j) {
        this.a.bindLong(i, j);
    }

    public void close() {
        this.a.close();
    }

    public void d1(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    public void q1(int i) {
        this.a.bindNull(i);
    }

    public void w(int i, double d) {
        this.a.bindDouble(i, d);
    }
}
