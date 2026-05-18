package n4;

import android.database.sqlite.SQLiteStatement;
import m4.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class e extends d implements f {
    public final SQLiteStatement b;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    public int q() {
        return this.b.executeUpdateDelete();
    }

    public long v0() {
        return this.b.executeInsert();
    }
}
