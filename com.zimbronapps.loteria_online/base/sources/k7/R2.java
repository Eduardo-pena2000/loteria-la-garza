package k7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.zzby;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class r2 extends zzby {
    public final /* synthetic */ t2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(t2 t2Var, Context context, String str) {
        super(context, "google_app_measurement_local.db", null, 1);
        Objects.requireNonNull(t2Var);
        this.a = t2Var;
    }

    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException unused) {
            q3 q3Var = this.a.a;
            q3Var.a().o().a("Opening the local database failed, dropping and recreating it");
            q3Var.w();
            if (!q3Var.d().getDatabasePath("google_app_measurement_local.db").delete()) {
                q3Var.a().o().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e) {
                this.a.a.a().o().b("Failed to open local database. Events will bypass local storage", e);
                return null;
            }
        } catch (SQLiteDatabaseLockedException e2) {
            throw e2;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        x.b(this.a.a.a(), sQLiteDatabase);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        x.a(this.a.a.a(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", t2.y());
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
