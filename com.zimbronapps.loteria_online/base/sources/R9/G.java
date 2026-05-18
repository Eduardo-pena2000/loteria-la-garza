package r9;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class g implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ C a;

    public /* synthetic */ g(C c) {
        this.a = c;
    }

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        return i.f(this.a, sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }
}
