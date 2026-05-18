package k7;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzca;
import java.io.File;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class x {
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e A[Catch: SQLiteException -> 0x00b3, TryCatch #3 {SQLiteException -> 0x00b3, blocks: (B:11:0x0040, B:14:0x0070, B:16:0x007e, B:18:0x0086, B:20:0x0089, B:21:0x00b2, B:25:0x00b7, B:27:0x00ba, B:29:0x00c2, B:31:0x00c9, B:34:0x00cc, B:36:0x00d2, B:41:0x00e3, B:42:0x00e6, B:13:0x0069), top: B:10:0x0040, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7 A[Catch: SQLiteException -> 0x00b3, LOOP:1: B:25:0x00b7->B:31:0x00c9, LOOP_START, PHI: r2
      0x00b7: PHI (r2v6 int) = (r2v5 int), (r2v7 int) binds: [B:24:0x00b5, B:31:0x00c9] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {SQLiteException -> 0x00b3, blocks: (B:11:0x0040, B:14:0x0070, B:16:0x007e, B:18:0x0086, B:20:0x0089, B:21:0x00b2, B:25:0x00b7, B:27:0x00ba, B:29:0x00c2, B:31:0x00c9, B:34:0x00cc, B:36:0x00d2, B:41:0x00e3, B:42:0x00e6, B:13:0x0069), top: B:10:0x0040, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d2 A[Catch: SQLiteException -> 0x00b3, TryCatch #3 {SQLiteException -> 0x00b3, blocks: (B:11:0x0040, B:14:0x0070, B:16:0x007e, B:18:0x0086, B:20:0x0089, B:21:0x00b2, B:25:0x00b7, B:27:0x00ba, B:29:0x00c2, B:31:0x00c9, B:34:0x00cc, B:36:0x00d2, B:41:0x00e3, B:42:0x00e6, B:13:0x0069), top: B:10:0x0040, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(k7.C2 r9, android.database.sqlite.SQLiteDatabase r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.x.a(k7.C2, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void b(C2 c2, SQLiteDatabase sQLiteDatabase) {
        if (c2 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        zzbv.zza();
        String path = sQLiteDatabase.getPath();
        int i = zzca.zzb;
        File file = new File(path);
        if (!file.setReadable(false, false)) {
            c2.r().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c2.r().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c2.r().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c2.r().a("Failed to turn on database write permission for owner");
    }
}
