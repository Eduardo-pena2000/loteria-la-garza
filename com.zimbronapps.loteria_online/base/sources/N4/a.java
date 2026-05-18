package n4;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import java.util.List;
import m4.f;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class a implements m4.b {
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public final SQLiteDatabase a;

    public class a implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ m4.e a;

        public a(m4.e eVar) {
            this.a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public class b implements SQLiteDatabase.CursorFactory {
        public final /* synthetic */ m4.e a;

        public b(m4.e eVar) {
            this.a = eVar;
        }

        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.a.b(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    public void I() {
        this.a.setTransactionSuccessful();
    }

    public f J0(String str) {
        return new e(this.a.compileStatement(str));
    }

    public void K(String str, Object[] objArr) {
        this.a.execSQL(str, objArr);
    }

    public Cursor S(m4.e eVar, CancellationSignal cancellationSignal) {
        return this.a.rawQueryWithFactory(new b(eVar), eVar.a(), c, (String) null, cancellationSignal);
    }

    public void U() {
        this.a.endTransaction();
    }

    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.a == sQLiteDatabase;
    }

    public void close() {
        this.a.close();
    }

    public String e0() {
        return this.a.getPath();
    }

    public Cursor f1(String str) {
        return s0(new m4.a(str));
    }

    public void i() {
        this.a.beginTransaction();
    }

    public boolean isOpen() {
        return this.a.isOpen();
    }

    public List n() {
        return this.a.getAttachedDbs();
    }

    public void p(String str) {
        this.a.execSQL(str);
    }

    public Cursor s0(m4.e eVar) {
        return this.a.rawQueryWithFactory(new a(eVar), eVar.a(), c, (String) null);
    }

    public boolean v1() {
        return this.a.inTransaction();
    }
}
