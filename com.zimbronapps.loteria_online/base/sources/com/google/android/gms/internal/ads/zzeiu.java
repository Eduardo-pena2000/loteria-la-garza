package com.google.android.gms.internal.ads;

import V5.F0;
import V5.o0;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class zzeiu extends zzfxo {
    private final Context zza;
    private final zzgzy zzb;

    public zzeiu(Context context, zzgzy zzgzyVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) S5.D.c().zzd(zzbhe.zzjH)).intValue(), zzfxq.zza);
        this.zza = context;
        this.zzb = zzgzyVar;
    }

    public static /* synthetic */ Void zzf(W5.v vVar, SQLiteDatabase sQLiteDatabase) {
        zzj(sQLiteDatabase, vVar);
        return null;
    }

    public static /* synthetic */ void zzg(SQLiteDatabase sQLiteDatabase, String str, W5.v vVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, vVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, W5.v vVar) {
        String sb;
        sQLiteDatabase.beginTransaction();
        try {
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("event_state = ");
            sb2.append(1);
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", new String[]{"timestamp", "url"}, sb2.toString(), (String[]) null, (String) null, (String) null, "timestamp ASC", (String) null);
            int count = query.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex("timestamp");
                int columnIndex2 = query.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j = query.getLong(columnIndex);
                    String string = query.getString(columnIndex2);
                    if (string == null) {
                        sb = "";
                    } else {
                        Uri parse = Uri.parse(string);
                        long a = R5.t.o().a() - j;
                        String encodedQuery = parse.getEncodedQuery();
                        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
                        clearQuery.appendQueryParameter("bd", Long.toString(a));
                        String valueOf = String.valueOf(clearQuery.build());
                        StringBuilder sb3 = new StringBuilder(valueOf.length() + 1 + String.valueOf(encodedQuery).length());
                        sb3.append(valueOf);
                        sb3.append("&");
                        sb3.append(encodedQuery);
                        sb = sb3.toString();
                    }
                    strArr[i] = sb;
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (int i2 = 0; i2 < count; i2++) {
                vVar.b(strArr[i2], null);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final void zza(zzfmu zzfmuVar) {
        zzeit zzeitVar = new zzeit(this);
        zzgzy zzgzyVar = this.zzb;
        zzgzo.zzr(zzgzyVar.submit(zzeitVar), new zzein(this, zzfmuVar), zzgzyVar);
    }

    public final void zzb(SQLiteDatabase sQLiteDatabase, W5.v vVar, String str) {
        this.zzb.execute(new zzeio(sQLiteDatabase, str, vVar));
    }

    public final void zzc(W5.v vVar, String str) {
        zza(new zzeip(this, vVar, str));
    }

    public final void zzd(String str) {
        zza(new zzeiq(this, str));
    }

    public final void zze(zzeiw zzeiwVar) {
        zza(new zzeir(this, zzeiwVar));
    }

    public final /* synthetic */ Void zzh(zzeiw zzeiwVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzeiwVar.zza));
        contentValues.put("gws_query_id", zzeiwVar.zzb);
        contentValues.put("url", zzeiwVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzeiwVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", (String) null, contentValues);
        R5.t.g();
        Context context = this.zza;
        V5.Q e = F0.e(context);
        if (e != null) {
            try {
                e.zzf(N6.b.s1(context));
            } catch (RemoteException e2) {
                o0.l("Failed to schedule offline ping sender.", e2);
            }
        }
        return null;
    }
}
