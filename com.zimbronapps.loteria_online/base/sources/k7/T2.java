package k7;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class t2 extends h2 {
    public static final String[] e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public final r2 c;
    public boolean d;

    public t2(q3 q3Var) {
        super(q3Var);
        Context d = this.a.d();
        this.a.w();
        this.c = new r2(this, d, "google_app_measurement_local.db");
    }

    public static /* synthetic */ String[] y() {
        return e;
    }

    public final boolean m() {
        return false;
    }

    public final void o() {
        int delete;
        h();
        try {
            SQLiteDatabase w = w();
            if (w == null || (delete = w.delete("messages", (String) null, (String[]) null)) <= 0) {
                return;
            }
            this.a.a().w().b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e2) {
            this.a.a().o().b("Error resetting local analytics data. error", e2);
        }
    }

    public final boolean p(I i) {
        Parcel obtain = Parcel.obtain();
        J.a(i, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return z(0, marshall);
        }
        this.a.a().p().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean q(h7 h7Var) {
        Parcel obtain = Parcel.obtain();
        i7.a(h7Var, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length <= 131072) {
            return z(1, marshall);
        }
        this.a.a().p().a("User property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean r(i iVar) {
        q3 q3Var = this.a;
        byte[] T = q3Var.C().T(iVar);
        if (T.length <= 131072) {
            return z(2, T);
        }
        q3Var.a().p().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean s(G g) {
        q3 q3Var = this.a;
        byte[] T = q3Var.C().T(g);
        if (T == null) {
            q3Var.a().p().a("Null default event parameters; not writing to database");
            return false;
        }
        if (T.length <= 131072) {
            return z(4, T);
        }
        q3Var.a().p().a("Default event parameters too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x035a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x035a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List t(int r29) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.t2.t(int):java.util.List");
    }

    public final boolean u() {
        return z(3, new byte[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b A[PHI: r4
      0x006b: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:42:0x007e, B:37:0x0069, B:21:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean v() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.h()
            boolean r1 = r10.d
            r2 = 0
            if (r1 == 0) goto Lc
            goto L99
        Lc:
            boolean r1 = r10.x()
            if (r1 == 0) goto L99
            r1 = 5
            r4 = r1
            r3 = r2
        L15:
            if (r3 >= r1) goto L8a
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.w()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            if (r5 != 0) goto L29
            r10.d = r6     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            goto L99
        L23:
            r0 = move-exception
            goto L84
        L25:
            r7 = move-exception
            goto L46
        L27:
            r7 = move-exception
            goto L6f
        L29:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            r9 = 3
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.endTransaction()     // Catch: java.lang.Throwable -> L23 android.database.sqlite.SQLiteException -> L25 android.database.sqlite.SQLiteFullException -> L27 android.database.sqlite.SQLiteDatabaseLockedException -> L63
            r5.close()
            return r6
        L46:
            if (r5 == 0) goto L51
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L23
            if (r8 == 0) goto L51
            r5.endTransaction()     // Catch: java.lang.Throwable -> L23
        L51:
            k7.q3 r8 = r10.a     // Catch: java.lang.Throwable -> L23
            k7.C2 r8 = r8.a()     // Catch: java.lang.Throwable -> L23
            k7.A2 r8 = r8.o()     // Catch: java.lang.Throwable -> L23
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L23
            r10.d = r6     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L81
            goto L6b
        L63:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L23
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L23
            int r4 = r4 + 20
            if (r5 == 0) goto L81
        L6b:
            r5.close()
            goto L81
        L6f:
            k7.q3 r8 = r10.a     // Catch: java.lang.Throwable -> L23
            k7.C2 r8 = r8.a()     // Catch: java.lang.Throwable -> L23
            k7.A2 r8 = r8.o()     // Catch: java.lang.Throwable -> L23
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L23
            r10.d = r6     // Catch: java.lang.Throwable -> L23
            if (r5 == 0) goto L81
            goto L6b
        L81:
            int r3 = r3 + 1
            goto L15
        L84:
            if (r5 == 0) goto L89
            r5.close()
        L89:
            throw r0
        L8a:
            k7.q3 r0 = r10.a
            k7.C2 r0 = r0.a()
            k7.A2 r0 = r0.r()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.t2.v():boolean");
    }

    public final SQLiteDatabase w() {
        if (this.d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.d = true;
        return null;
    }

    public final boolean x() {
        q3 q3Var = this.a;
        Context d = q3Var.d();
        q3Var.w();
        return d.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0131 A[PHI: r8 r10
      0x0131: PHI (r8v6 int) = (r8v3 int), (r8v4 int), (r8v3 int) binds: [B:44:0x011f, B:35:0x012f, B:24:0x014f] A[DONT_GENERATE, DONT_INLINE]
      0x0131: PHI (r10v8 android.database.sqlite.SQLiteDatabase) = 
      (r10v6 android.database.sqlite.SQLiteDatabase)
      (r10v7 android.database.sqlite.SQLiteDatabase)
      (r10v9 android.database.sqlite.SQLiteDatabase)
     binds: [B:44:0x011f, B:35:0x012f, B:24:0x014f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z(int r18, byte[] r19) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.t2.z(int, byte[]):boolean");
    }
}
