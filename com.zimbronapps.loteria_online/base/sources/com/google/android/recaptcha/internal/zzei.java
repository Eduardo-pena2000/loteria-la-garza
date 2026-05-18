package com.google.android.recaptcha.internal;

import Da.D;
import Da.u;
import Da.v;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzei extends SQLiteOpenHelper {
    public static final zzeg zza;
    private static final int zzb;
    private static final String zzc;
    private static zzei zzd;

    static {
        zzeg zzegVar = new zzeg(null);
        zza = zzegVar;
        zzb = zzeg.zza(zzegVar, "18.6.1");
        zzc = zzeg.zzb(zzegVar, "18.6.1");
    }

    public /* synthetic */ zzei(Context context, k kVar) {
        super(context, zzc, (SQLiteDatabase.CursorFactory) null, zzb);
    }

    public static final /* synthetic */ zzei zzc() {
        return zzd;
    }

    public static final /* synthetic */ void zze(zzei zzeiVar) {
        zzd = zzeiVar;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(D.n0(list, ", ", "(", ")", 0, (CharSequence) null, zzeh.zza, 24, (Object) null))), (String[]) null);
    }

    public final int zzb() {
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", (String[]) null);
        int i = -1;
        try {
            if (rawQuery.moveToNext()) {
                i = rawQuery.getInt(0);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
        rawQuery.close();
        return i;
    }

    public final List zzd() {
        Cursor query = getReadableDatabase().query("ce", (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "ts ASC");
        List arrayList = new ArrayList();
        while (query.moveToNext()) {
            try {
                try {
                    int i = query.getInt(query.getColumnIndexOrThrow("id"));
                    String string = query.getString(query.getColumnIndexOrThrow("ss"));
                    long j = query.getLong(query.getColumnIndexOrThrow("ts"));
                    t.d(string);
                    arrayList.add(new zzej(string, j, i));
                } catch (Exception unused) {
                    arrayList = v.n();
                }
            } finally {
                query.close();
            }
        }
        return arrayList;
    }

    public final boolean zzf(zzej zzejVar) {
        return zza(u.e(zzejVar)) == 1;
    }
}
