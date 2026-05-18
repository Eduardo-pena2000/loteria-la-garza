package n4;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import m4.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public class b implements m4.c {
    public final Context a;
    public final String b;
    public final c.a c;
    public final boolean d;
    public final Object e = new Object();
    public a f;
    public boolean g;

    public static class a extends SQLiteOpenHelper {
        public final n4.a[] a;
        public final c.a b;
        public boolean c;

        public class a implements DatabaseErrorHandler {
            public final /* synthetic */ c.a a;
            public final /* synthetic */ n4.a[] b;

            public a(c.a aVar, n4.a[] aVarArr) {
                this.a = aVar;
                this.b = aVarArr;
            }

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.a.c(a.b(this.b, sQLiteDatabase));
            }
        }

        public a(Context context, String str, n4.a[] aVarArr, c.a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.a, new a(aVar, aVarArr));
            this.b = aVar;
            this.a = aVarArr;
        }

        public static n4.a b(n4.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            n4.a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new n4.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        public n4.a a(SQLiteDatabase sQLiteDatabase) {
            return b(this.a, sQLiteDatabase);
        }

        public synchronized m4.b c() {
            this.c = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.c) {
                return a(writableDatabase);
            }
            close();
            return c();
        }

        public synchronized void close() {
            super.close();
            this.a[0] = null;
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.b.b(a(sQLiteDatabase));
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.b.d(a(sQLiteDatabase));
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.c = true;
            this.b.e(a(sQLiteDatabase), i, i2);
        }

        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.c) {
                return;
            }
            this.b.f(a(sQLiteDatabase));
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.c = true;
            this.b.g(a(sQLiteDatabase), i, i2);
        }
    }

    public b(Context context, String str, c.a aVar, boolean z) {
        this.a = context;
        this.b = str;
        this.c = aVar;
        this.d = z;
    }

    public final a a() {
        a aVar;
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    n4.a[] aVarArr = new n4.a[1];
                    if (this.b == null || !this.d) {
                        this.f = new a(this.a, this.b, aVarArr, this.c);
                    } else {
                        this.f = new a(this.a, new File(this.a.getNoBackupFilesDir(), this.b).getAbsolutePath(), aVarArr, this.c);
                    }
                    this.f.setWriteAheadLoggingEnabled(this.g);
                }
                aVar = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public void close() {
        a().close();
    }

    public m4.b e1() {
        return a().c();
    }

    public String getDatabaseName() {
        return this.b;
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.e) {
            try {
                a aVar = this.f;
                if (aVar != null) {
                    aVar.setWriteAheadLoggingEnabled(z);
                }
                this.g = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
