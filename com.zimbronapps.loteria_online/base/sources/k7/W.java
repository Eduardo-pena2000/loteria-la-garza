package k7;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzhz;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzpr;
import com.google.android.gms.internal.measurement.zzqp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class w extends M6 {
    public static final String[] f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    public static final String[] j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] m = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] n = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] o = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] p = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
    public final v d;
    public final A6 e;

    public w(b7 b7Var) {
        super(b7Var);
        this.e = new A6(this.a.e());
        this.a.w();
        this.d = new v(this, this.a.d(), "google_app_measurement.db");
    }

    public static final String T(List list) {
        return list.isEmpty() ? "" : String.format(" AND (upload_type IN (%s))", new Object[]{TextUtils.join(", ", list)});
    }

    public static /* synthetic */ String[] c0() {
        return f;
    }

    public static /* synthetic */ String[] d0() {
        return h;
    }

    public static /* synthetic */ String[] e0() {
        return i;
    }

    public static /* synthetic */ String[] f0() {
        return j;
    }

    public static /* synthetic */ String[] g0() {
        return k;
    }

    public static /* synthetic */ String[] h0() {
        return l;
    }

    public static /* synthetic */ String[] i0() {
        return m;
    }

    public static /* synthetic */ String[] j0() {
        return n;
    }

    public static /* synthetic */ String[] k0() {
        return o;
    }

    public static /* synthetic */ String[] l0() {
        return p;
    }

    public static final void o0(ContentValues contentValues, String str, Object obj) {
        com.google.android.gms.common.internal.t.f("value");
        com.google.android.gms.common.internal.t.l(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    public final long A() {
        return q0("select max(timestamp) from raw_events", null, 0L);
    }

    public final boolean A0(j7 j7Var) {
        com.google.android.gms.common.internal.t.l(j7Var);
        h();
        j();
        String str = j7Var.a;
        String str2 = j7Var.c;
        if (B0(str, str2) == null) {
            if (l7.r0(str2)) {
                if (p0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= this.a.w().F(str, f2.W, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long p0 = p0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, j7Var.b});
                this.a.w();
                if (p0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", j7Var.b);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(j7Var.d));
        o0(contentValues, "value", j7Var.e);
        try {
            if (u0().insertWithOnConflict("user_attributes", (String) null, contentValues, 5) != -1) {
                return true;
            }
            this.a.a().o().b("Failed to insert/update user property (got -1). appId", C2.x(str));
            return true;
        } catch (SQLiteException e) {
            this.a.a().o().c("Error storing user property. appId", C2.x(j7Var.a), e);
            return true;
        }
    }

    public final boolean B() {
        return p0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k7.j7 B0(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.common.internal.t.f(r11)
            com.google.android.gms.common.internal.t.f(r12)
            r10.h()
            r10.j()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.u0()     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L71
            java.lang.String r2 = "user_attributes"
            java.lang.String r3 = "set_timestamp"
            java.lang.String r4 = "value"
            java.lang.String r5 = "origin"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L71
            java.lang.String r4 = "app_id=? and name=?"
            java.lang.String[] r5 = new java.lang.String[]{r11, r12}     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L71
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L6f android.database.sqlite.SQLiteException -> L71
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            if (r2 != 0) goto L31
            goto L8f
        L31:
            r2 = 0
            long r7 = r1.getLong(r2)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            r2 = 1
            java.lang.Object r9 = r10.x(r1, r2)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            if (r9 != 0) goto L3e
            goto L8f
        L3e:
            r2 = 2
            java.lang.String r5 = r1.getString(r2)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            k7.j7 r2 = new k7.j7     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            r3 = r2
            r4 = r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            boolean r3 = r1.moveToNext()     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            if (r3 == 0) goto L69
            k7.q3 r3 = r10.a     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            k7.C2 r3 = r3.a()     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            k7.A2 r3 = r3.o()     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            java.lang.String r4 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r5 = k7.C2.x(r11)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            r3.b(r4, r5)     // Catch: java.lang.Throwable -> L65 android.database.sqlite.SQLiteException -> L67
            goto L69
        L65:
            r11 = move-exception
            goto L6d
        L67:
            r2 = move-exception
            goto L74
        L69:
            r1.close()
            return r2
        L6d:
            r0 = r1
            goto L95
        L6f:
            r11 = move-exception
            goto L95
        L71:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L74:
            k7.q3 r3 = r10.a     // Catch: java.lang.Throwable -> L65
            k7.C2 r4 = r3.a()     // Catch: java.lang.Throwable -> L65
            k7.A2 r4 = r4.o()     // Catch: java.lang.Throwable -> L65
            java.lang.String r5 = "Error querying user property. appId"
            java.lang.Object r11 = k7.C2.x(r11)     // Catch: java.lang.Throwable -> L65
            k7.v2 r3 = r3.D()     // Catch: java.lang.Throwable -> L65
            java.lang.String r12 = r3.c(r12)     // Catch: java.lang.Throwable -> L65
            r4.d(r5, r11, r12, r2)     // Catch: java.lang.Throwable -> L65
        L8f:
            if (r1 == 0) goto L94
            r1.close()
        L94:
            return r0
        L95:
            if (r0 == 0) goto L9a
            r0.close()
        L9a:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.B0(java.lang.String, java.lang.String):k7.j7");
    }

    public final boolean C(String str, String str2) {
        return p0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final List C0(String str) {
        com.google.android.gms.common.internal.t.f(str);
        h();
        j();
        List arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                q3 q3Var = this.a;
                q3Var.w();
                cursor = u0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, (String) null, (String) null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str2 = string2;
                        long j2 = cursor.getLong(2);
                        Object x = x(cursor, 3);
                        if (x == null) {
                            q3Var.a().o().b("Read invalid user property value, ignoring it. appId", C2.x(str));
                        } else {
                            arrayList.add(new j7(str, str2, string, j2, x));
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e) {
                this.a.a().o().c("Error querying user properties. appId", C2.x(str), e);
                arrayList = Collections.emptyList();
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean D() {
        return p0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        r0 = r9.a().o();
        r9.w();
        r0.b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List D0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.D0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final long E(String str) {
        com.google.android.gms.common.internal.t.f(str);
        return q0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final boolean E0(i iVar) {
        com.google.android.gms.common.internal.t.l(iVar);
        h();
        j();
        String str = iVar.a;
        com.google.android.gms.common.internal.t.l(str);
        if (B0(str, iVar.c.b) == null) {
            long p0 = p0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.a.w();
            if (p0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", iVar.b);
        contentValues.put("name", iVar.c.b);
        o0(contentValues, "value", com.google.android.gms.common.internal.t.l(iVar.c.zza()));
        contentValues.put("active", Boolean.valueOf(iVar.e));
        contentValues.put("trigger_event_name", iVar.f);
        contentValues.put("trigger_timeout", Long.valueOf(iVar.h));
        q3 q3Var = this.a;
        contentValues.put("timed_out_event", q3Var.C().T(iVar.g));
        contentValues.put("creation_timestamp", Long.valueOf(iVar.d));
        contentValues.put("triggered_event", q3Var.C().T(iVar.i));
        contentValues.put("triggered_timestamp", Long.valueOf(iVar.c.c));
        contentValues.put("time_to_live", Long.valueOf(iVar.j));
        contentValues.put("expired_event", q3Var.C().T(iVar.k));
        try {
            if (u0().insertWithOnConflict("conditional_properties", (String) null, contentValues, 5) != -1) {
                return true;
            }
            q3Var.a().o().b("Failed to insert/update conditional user property (got -1)", C2.x(str));
            return true;
        } catch (SQLiteException e) {
            this.a.a().o().c("Error storing conditional user property", C2.x(str), e);
            return true;
        }
    }

    public final boolean F(String str, Long l2, long j2, zzhs zzhsVar) {
        h();
        j();
        com.google.android.gms.common.internal.t.l(zzhsVar);
        com.google.android.gms.common.internal.t.f(str);
        com.google.android.gms.common.internal.t.l(l2);
        q3 q3Var = this.a;
        byte[] zzcc = zzhsVar.zzcc();
        q3Var.a().w().c("Saving complex main event, appId, data size", q3Var.D().a(str), Integer.valueOf(zzcc.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j2));
        contentValues.put("main_event", zzcc);
        try {
            if (u0().insertWithOnConflict("main_event_params", (String) null, contentValues, 5) != -1) {
                return true;
            }
            q3Var.a().o().b("Failed to insert complex main event (got -1). appId", C2.x(str));
            return false;
        } catch (SQLiteException e) {
            this.a.a().o().c("Error storing complex main event. appId", C2.x(str), e);
            return false;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f4: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:245), block:B:32:0x00f4 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k7.i F0(java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.F0(java.lang.String, java.lang.String):k7.i");
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x006a: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:107), block:B:27:0x006a */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle G(java.lang.String r6) {
        /*
            r5 = this;
            r5.h()
            r5.j()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.u0()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            java.lang.String[] r3 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteException -> L6e
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            if (r2 != 0) goto L2f
            k7.q3 r6 = r5.a     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            k7.C2 r6 = r6.a()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            k7.A2 r6 = r6.w()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.lang.String r2 = "Default event parameters not found"
            r6.a(r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            goto L7f
        L2b:
            r6 = move-exception
            goto L6a
        L2d:
            r6 = move-exception
            goto L70
        L2f:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            com.google.android.gms.internal.measurement.zzhr r3 = com.google.android.gms.internal.measurement.zzhs.zzk()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.zznl r2 = k7.g7.W(r3, r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.zzhr r2 = (com.google.android.gms.internal.measurement.zzhr) r2     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.zzmf r2 = r2.zzbc()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            com.google.android.gms.internal.measurement.zzhs r2 = (com.google.android.gms.internal.measurement.zzhs) r2     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d java.io.IOException -> L55
            k7.b7 r6 = r5.b     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r6.K0()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.util.List r6 = r2.zza()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            android.os.Bundle r6 = k7.g7.q(r6)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r1.close()
            return r6
        L55:
            r2 = move-exception
            k7.q3 r3 = r5.a     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            k7.C2 r3 = r3.a()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            k7.A2 r3 = r3.o()     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = k7.C2.x(r6)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            r3.c(r4, r6, r2)     // Catch: java.lang.Throwable -> L2b android.database.sqlite.SQLiteException -> L2d
            goto L7f
        L6a:
            r0 = r1
            goto L85
        L6c:
            r6 = move-exception
            goto L85
        L6e:
            r6 = move-exception
            r1 = r0
        L70:
            k7.q3 r2 = r5.a     // Catch: java.lang.Throwable -> L2b
            k7.C2 r2 = r2.a()     // Catch: java.lang.Throwable -> L2b
            k7.A2 r2 = r2.o()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r6)     // Catch: java.lang.Throwable -> L2b
        L7f:
            if (r1 == 0) goto L84
            r1.close()
        L84:
            return r0
        L85:
            if (r0 == 0) goto L8a
            r0.close()
        L8a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.G(java.lang.String):android.os.Bundle");
    }

    public final int G0(String str, String str2) {
        com.google.android.gms.common.internal.t.f(str);
        com.google.android.gms.common.internal.t.f(str2);
        h();
        j();
        try {
            return u0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            q3 q3Var = this.a;
            q3Var.a().o().d("Error deleting conditional property", C2.x(str), q3Var.D().c(str2), e);
            return 0;
        }
    }

    public final boolean H(String str, long j2) {
        try {
            if (q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j2)}, 0L) > 0) {
                return false;
            }
            return q0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str, String.valueOf(j2)}, 0L) > 0;
        } catch (SQLiteException e) {
            this.a.a().o().b("Error checking backfill conditions", e);
            return false;
        }
    }

    public final List H0(String str, String str2, String str3) {
        com.google.android.gms.common.internal.t.f(str);
        h();
        j();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return I0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x002e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(java.lang.String r26, java.lang.Long r27, java.lang.String r28, android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.I(java.lang.String, java.lang.Long, java.lang.String, android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r2 = r12.a().o();
        r12.w();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List I0(java.lang.String r29, java.lang.String[] r30) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.I0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k7.a4 J(java.lang.String r5) {
        /*
            r4 = this;
            com.google.android.gms.common.internal.t.l(r5)
            r4.h()
            r4.j()
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r0 = "select consent_state, consent_source from consent_settings where app_id=? limit 1;"
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r4.u0()     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L49
            android.database.Cursor r5 = r2.rawQuery(r0, r5)     // Catch: java.lang.Throwable -> L46 android.database.sqlite.SQLiteException -> L49
            boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            if (r0 != 0) goto L35
            k7.q3 r0 = r4.a     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            k7.C2 r0 = r0.a()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            k7.A2 r0 = r0.w()     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            java.lang.String r2 = "No data found"
            r0.a(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
        L2d:
            r5.close()
            goto L5e
        L31:
            r0 = move-exception
            goto L44
        L33:
            r0 = move-exception
            goto L4c
        L35:
            r0 = 0
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            r2 = 1
            int r2 = r5.getInt(r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            k7.a4 r1 = k7.a4.f(r0, r2)     // Catch: java.lang.Throwable -> L31 android.database.sqlite.SQLiteException -> L33
            goto L2d
        L44:
            r1 = r5
            goto L64
        L46:
            r5 = move-exception
            r0 = r5
            goto L64
        L49:
            r5 = move-exception
            r0 = r5
            r5 = r1
        L4c:
            k7.q3 r2 = r4.a     // Catch: java.lang.Throwable -> L31
            k7.C2 r2 = r2.a()     // Catch: java.lang.Throwable -> L31
            k7.A2 r2 = r2.o()     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "Error querying database."
            r2.b(r3, r0)     // Catch: java.lang.Throwable -> L31
            if (r5 == 0) goto L5e
            goto L2d
        L5e:
            if (r1 != 0) goto L63
            k7.a4 r5 = k7.a4.c
            return r5
        L63:
            return r1
        L64:
            if (r1 == 0) goto L69
            r1.close()
        L69:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.J(java.lang.String):k7.a4");
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0300  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k7.I2 J0(java.lang.String r52) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.J0(java.lang.String):k7.I2");
    }

    public final boolean K(String str, B6 b6) {
        h();
        j();
        com.google.android.gms.common.internal.t.l(b6);
        com.google.android.gms.common.internal.t.f(str);
        q3 q3Var = this.a;
        long a = q3Var.e().a();
        e2 e2Var = f2.w0;
        long longValue = a - ((Long) e2Var.b(null)).longValue();
        long j2 = b6.b;
        if (j2 < longValue || j2 > ((Long) e2Var.b(null)).longValue() + a) {
            q3Var.a().r().d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C2.x(str), Long.valueOf(a), Long.valueOf(j2));
        }
        q3Var.a().w().a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", b6.a);
        contentValues.put("source", Integer.valueOf(b6.c));
        contentValues.put("timestamp_millis", Long.valueOf(j2));
        try {
            if (u0().insert("trigger_uris", (String) null, contentValues) != -1) {
                return true;
            }
            q3Var.a().o().b("Failed to insert trigger URI (got -1). appId", C2.x(str));
            return false;
        } catch (SQLiteException e) {
            this.a.a().o().c("Error storing trigger URI. appId", C2.x(str), e);
            return false;
        }
    }

    public final void K0(I2 i2, boolean z, boolean z2) {
        com.google.android.gms.common.internal.t.l(i2);
        h();
        j();
        String o0 = i2.o0();
        com.google.android.gms.common.internal.t.l(o0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", o0);
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.b.g(o0).o(Z3.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", i2.p0());
        }
        contentValues.put("gmp_app_id", i2.r0());
        b7 b7Var = this.b;
        if (b7Var.g(o0).o(Z3.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", i2.v0());
        }
        contentValues.put("last_bundle_index", Long.valueOf(i2.g()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(i2.z0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(i2.B0()));
        contentValues.put("app_version", i2.D0());
        contentValues.put("app_store", i2.H0());
        contentValues.put("gmp_version", Long.valueOf(i2.J0()));
        contentValues.put("dev_cert_hash", Long.valueOf(i2.L0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(i2.d()));
        contentValues.put("day", Long.valueOf(i2.n()));
        contentValues.put("daily_public_events_count", Long.valueOf(i2.p()));
        contentValues.put("daily_events_count", Long.valueOf(i2.r()));
        contentValues.put("daily_conversions_count", Long.valueOf(i2.t()));
        contentValues.put("config_fetched_time", Long.valueOf(i2.h()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(i2.j()));
        contentValues.put("app_version_int", Long.valueOf(i2.F0()));
        contentValues.put("firebase_instance_id", i2.x0());
        contentValues.put("daily_error_events_count", Long.valueOf(i2.x()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(i2.v()));
        contentValues.put("health_monitor_sample", i2.z());
        contentValues.put("android_id", 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(i2.P()));
        contentValues.put("dynamite_version", Long.valueOf(i2.b()));
        if (b7Var.g(o0).o(Z3.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", i2.t0());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(i2.V()));
        contentValues.put("target_os_version", Long.valueOf(i2.X()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(i2.Z()));
        zzqp.zza();
        q3 q3Var = this.a;
        if (q3Var.w().H(o0, f2.Q0)) {
            contentValues.put("ad_services_version", Integer.valueOf(i2.b0()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(i2.j0()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(i2.d0()));
        contentValues.put("npa_metadata_value", i2.R());
        contentValues.put("bundle_delivery_index", Long.valueOf(i2.G()));
        contentValues.put("sgtm_preview_key", i2.l0());
        contentValues.put("dma_consent_state", Integer.valueOf(i2.B()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(i2.D()));
        contentValues.put("serialized_npa_metadata", i2.I());
        contentValues.put("client_upload_eligibility", Integer.valueOf(i2.M()));
        List T = i2.T();
        if (T != null) {
            if (T.isEmpty()) {
                q3Var.a().r().b("Safelisted events should not be an empty list. appId", o0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", T));
            }
        }
        zzpr.zza();
        if (q3Var.w().H(null, f2.L0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        contentValues.put("unmatched_pfo", i2.f0());
        contentValues.put("unmatched_uwa", i2.h0());
        contentValues.put("ad_campaign_info", i2.K());
        try {
            SQLiteDatabase u0 = u0();
            if (u0.update("apps", contentValues, "app_id = ?", new String[]{o0}) == 0 && u0.insertWithOnConflict("apps", (String) null, contentValues, 5) == -1) {
                q3Var.a().o().b("Failed to insert/update app (got -1). appId", C2.x(o0));
            }
        } catch (SQLiteException e) {
            this.a.a().o().c("Error storing app. appId", C2.x(o0), e);
        }
    }

    public final void L(String str, a4 a4Var) {
        com.google.android.gms.common.internal.t.l(str);
        com.google.android.gms.common.internal.t.l(a4Var);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", a4Var.l());
        contentValues.put("consent_source", Integer.valueOf(a4Var.b()));
        N("consent_settings", "app_id", contentValues);
    }

    public final s L0(long j2, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return M0(j2, str, 1L, false, false, z3, false, z5, z6, z7);
    }

    public final String M(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = u0().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return "";
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e) {
                this.a.a().o().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final s M0(long j2, String str, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        com.google.android.gms.common.internal.t.f(str);
        h();
        j();
        String[] strArr = {str};
        s sVar = new s();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase u0 = u0();
                cursor = u0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j2) {
                        sVar.b = cursor.getLong(1);
                        sVar.a = cursor.getLong(2);
                        sVar.c = cursor.getLong(3);
                        sVar.d = cursor.getLong(4);
                        sVar.e = cursor.getLong(5);
                        sVar.f = cursor.getLong(6);
                        sVar.g = cursor.getLong(7);
                    }
                    if (z) {
                        sVar.b += j3;
                    }
                    if (z2) {
                        sVar.a += j3;
                    }
                    if (z3) {
                        sVar.c += j3;
                    }
                    if (z4) {
                        sVar.d += j3;
                    }
                    if (z5) {
                        sVar.e += j3;
                    }
                    if (z6) {
                        sVar.f += j3;
                    }
                    if (z7) {
                        sVar.g += j3;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j2));
                    contentValues.put("daily_public_events_count", Long.valueOf(sVar.a));
                    contentValues.put("daily_events_count", Long.valueOf(sVar.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(sVar.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(sVar.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(sVar.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(sVar.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(sVar.g));
                    u0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    this.a.a().r().b("Not updating daily counts, app is not known. appId", C2.x(str));
                }
            } catch (SQLiteException e) {
                this.a.a().o().c("Error updating daily counts. appId", C2.x(str), e);
            }
            if (cursor != null) {
                cursor.close();
            }
            return sVar;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void N(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase u0 = u0();
            if (contentValues.getAsString("app_id") == null) {
                this.a.a().q().b("Value of the primary key is not set.", C2.x("app_id"));
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id");
            sb.append(" = ?");
            if (u0.update("consent_settings", contentValues, sb.toString(), new String[]{r2}) == 0 && u0.insertWithOnConflict("consent_settings", (String) null, contentValues, 5) == -1) {
                this.a.a().o().c("Failed to insert/update table (got -1). key", C2.x("consent_settings"), C2.x("app_id"));
            }
        } catch (SQLiteException e) {
            this.a.a().o().d("Error storing into table. key", C2.x("consent_settings"), C2.x("app_id"), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k7.r N0(java.lang.String r10) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.t.f(r10)
            r9.h()
            r9.j()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r9.u0()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            java.lang.String r4 = "app_id=?"
            java.lang.String[] r5 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            r7 = 0
            r8 = 0
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteException -> L6b
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            if (r2 != 0) goto L2e
            goto L81
        L2e:
            r2 = 0
            byte[] r2 = r1.getBlob(r2)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            r3 = 1
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            boolean r5 = r1.moveToNext()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            if (r5 == 0) goto L5b
            k7.q3 r5 = r9.a     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            k7.C2 r5 = r5.a()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            k7.A2 r5 = r5.o()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = k7.C2.x(r10)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            r5.b(r6, r7)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            goto L5b
        L57:
            r10 = move-exception
            goto L67
        L59:
            r2 = move-exception
            goto L6e
        L5b:
            if (r2 != 0) goto L5e
            goto L81
        L5e:
            k7.r r5 = new k7.r     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            r5.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteException -> L59
            r1.close()
            return r5
        L67:
            r0 = r1
            goto L87
        L69:
            r10 = move-exception
            goto L87
        L6b:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L6e:
            k7.q3 r3 = r9.a     // Catch: java.lang.Throwable -> L57
            k7.C2 r3 = r3.a()     // Catch: java.lang.Throwable -> L57
            k7.A2 r3 = r3.o()     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r10 = k7.C2.x(r10)     // Catch: java.lang.Throwable -> L57
            r3.c(r4, r10, r2)     // Catch: java.lang.Throwable -> L57
        L81:
            if (r1 == 0) goto L86
            r1.close()
        L86:
            return r0
        L87:
            if (r0 == 0) goto L8c
            r0.close()
        L8c:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.N0(java.lang.String):k7.r");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k7.E O(java.lang.String r30, java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.O(java.lang.String, java.lang.String, java.lang.String):k7.E");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean O0(com.google.android.gms.internal.measurement.zzid r8, boolean r9) {
        /*
            r7 = this;
            r7.h()
            r7.j()
            com.google.android.gms.common.internal.t.l(r8)
            java.lang.String r0 = r8.zzA()
            com.google.android.gms.common.internal.t.f(r0)
            boolean r0 = r8.zzn()
            com.google.android.gms.common.internal.t.o(r0)
            r7.u()
            k7.q3 r0 = r7.a
            E6.f r1 = r0.e()
            long r1 = r1.a()
            long r3 = r8.zzo()
            r0.w()
            long r5 = k7.m.q()
            long r5 = r1 - r5
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L45
            long r3 = r8.zzo()
            r0.w()
            long r5 = k7.m.q()
            long r5 = r5 + r1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L66
        L45:
            k7.C2 r0 = r0.a()
            k7.A2 r0 = r0.r()
            java.lang.String r3 = r8.zzA()
            java.lang.Object r3 = k7.C2.x(r3)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            long r4 = r8.zzo()
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            java.lang.String r4 = "Storing bundle outside of the max uploading time span. appId, now, timestamp"
            r0.d(r4, r3, r1, r2)
        L66:
            byte[] r0 = r8.zzcc()
            r1 = 0
            k7.b7 r2 = r7.b     // Catch: java.io.IOException -> L108
            k7.g7 r2 = r2.K0()     // Catch: java.io.IOException -> L108
            byte[] r0 = r2.V(r0)     // Catch: java.io.IOException -> L108
            k7.q3 r2 = r7.a
            k7.C2 r3 = r2.a()
            k7.A2 r3 = r3.w()
            int r4 = r0.length
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "Saving bundle, size"
            r3.b(r5, r4)
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r4 = r8.zzA()
            java.lang.String r5 = "app_id"
            r3.put(r5, r4)
            long r4 = r8.zzo()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "bundle_end_timestamp"
            r3.put(r5, r4)
            java.lang.String r4 = "data"
            r3.put(r4, r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "has_realtime"
            r3.put(r0, r9)
            boolean r9 = r8.zzaa()
            if (r9 == 0) goto Lc5
            int r9 = r8.zzab()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "retry_count"
            r3.put(r0, r9)
        Lc5:
            android.database.sqlite.SQLiteDatabase r9 = r7.u0()     // Catch: android.database.sqlite.SQLiteException -> Lec
            java.lang.String r0 = "queue"
            r4 = 0
            long r3 = r9.insert(r0, r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lec
            r5 = -1
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 != 0) goto Lee
            k7.C2 r9 = r2.a()     // Catch: android.database.sqlite.SQLiteException -> Lec
            k7.A2 r9 = r9.o()     // Catch: android.database.sqlite.SQLiteException -> Lec
            java.lang.String r0 = "Failed to insert bundle (got -1). appId"
            java.lang.String r2 = r8.zzA()     // Catch: android.database.sqlite.SQLiteException -> Lec
            java.lang.Object r2 = k7.C2.x(r2)     // Catch: android.database.sqlite.SQLiteException -> Lec
            r9.b(r0, r2)     // Catch: android.database.sqlite.SQLiteException -> Lec
            return r1
        Lec:
            r9 = move-exception
            goto Lf0
        Lee:
            r8 = 1
            return r8
        Lf0:
            k7.q3 r0 = r7.a
            k7.C2 r0 = r0.a()
            k7.A2 r0 = r0.o()
            java.lang.String r8 = r8.zzA()
            java.lang.Object r8 = k7.C2.x(r8)
            java.lang.String r2 = "Error storing bundle. appId"
            r0.c(r2, r8, r9)
            return r1
        L108:
            r9 = move-exception
            k7.q3 r0 = r7.a
            k7.C2 r0 = r0.a()
            k7.A2 r0 = r0.o()
            java.lang.String r8 = r8.zzA()
            java.lang.Object r8 = k7.C2.x(r8)
            java.lang.String r2 = "Data loss. Failed to serialize bundle. appId"
            r0.c(r2, r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.O0(com.google.android.gms.internal.measurement.zzid, boolean):boolean");
    }

    public final void P(String str, E e) {
        com.google.android.gms.common.internal.t.l(e);
        h();
        j();
        ContentValues contentValues = new ContentValues();
        String str2 = e.a;
        contentValues.put("app_id", str2);
        contentValues.put("name", e.b);
        contentValues.put("lifetime_count", Long.valueOf(e.c));
        contentValues.put("current_bundle_count", Long.valueOf(e.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(e.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(e.g));
        contentValues.put("last_bundled_day", e.h);
        contentValues.put("last_sampled_complex_event_id", e.i);
        contentValues.put("last_sampling_rate", e.j);
        contentValues.put("current_session_count", Long.valueOf(e.e));
        Boolean bool = e.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (u0().insertWithOnConflict(str, (String) null, contentValues, 5) == -1) {
                this.a.a().o().b("Failed to insert/update event aggregates (got -1). appId", C2.x(str2));
            }
        } catch (SQLiteException e2) {
            this.a.a().o().c("Error storing event aggregates. appId", C2.x(e.a), e2);
        }
    }

    public final void Q(String str, String str2) {
        com.google.android.gms.common.internal.t.f(str2);
        h();
        j();
        try {
            u0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            this.a.a().o().c("Error deleting snapshot. appId", C2.x(str2), e);
        }
    }

    public final e7 R(String str, long j2, byte[] bArr, String str2, String str3, int i2, int i3, long j3, long j4, long j5) {
        if (TextUtils.isEmpty(str2)) {
            this.a.a().v().a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            zzhz zzhzVar = (zzhz) g7.W(zzib.zzh(), bArr);
            k5 a = k5.a(i2);
            if (a != k5.GOOGLE_SIGNAL && a != k5.GOOGLE_SIGNAL_PENDING && i3 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = zzhzVar.zza().iterator();
                while (it.hasNext()) {
                    zzic zzicVar = (zzic) ((zzid) it.next()).zzcl();
                    zzicVar.zzao(i3);
                    arrayList.add((zzid) zzicVar.zzbc());
                }
                zzhzVar.zzg();
                zzhzVar.zzf(arrayList);
            }
            Map hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length = split.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    String str4 = split[i4];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        this.a.a().o().b("Invalid upload header: ", str4);
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i4++;
                }
            }
            d7 d7Var = new d7();
            d7Var.b(j2);
            d7Var.c((zzib) zzhzVar.zzbc());
            d7Var.d(str2);
            d7Var.e(hashMap);
            d7Var.f(a);
            d7Var.g(j3);
            d7Var.h(j4);
            d7Var.i(j5);
            d7Var.j(i3);
            return d7Var.a();
        } catch (IOException e) {
            this.a.a().o().c("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
            return null;
        }
    }

    public final String S() {
        q3 q3Var = this.a;
        long a = q3Var.e().a();
        Locale locale = Locale.US;
        k5 k5Var = k5.GOOGLE_SIGNAL;
        Integer valueOf = Integer.valueOf(k5Var.zza());
        Long valueOf2 = Long.valueOf(a);
        q3Var.w();
        Long l2 = (Long) f2.T.b(null);
        l2.longValue();
        String format = String.format(locale, "(upload_type = %d AND ABS(creation_timestamp - %d) > %d)", new Object[]{valueOf, valueOf2, l2});
        Integer valueOf3 = Integer.valueOf(k5Var.zza());
        q3Var.w();
        String format2 = String.format(locale, "(upload_type != %d AND ABS(creation_timestamp - %d) > %d)", new Object[]{valueOf3, valueOf2, Long.valueOf(m.q())});
        StringBuilder sb = new StringBuilder(format.length() + 5 + format2.length() + 1);
        sb.append("(");
        sb.append(format);
        sb.append(" OR ");
        sb.append(format2);
        sb.append(")");
        return sb.toString();
    }

    public final A U(String str) {
        com.google.android.gms.common.internal.t.l(str);
        h();
        j();
        return A.g(M("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    public final void V(String str, A a) {
        com.google.android.gms.common.internal.t.l(str);
        com.google.android.gms.common.internal.t.l(a);
        h();
        j();
        a4 J = J(str);
        a4 a4Var = a4.c;
        if (J == a4Var) {
            L(str, a4Var);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("dma_consent_settings", a.e());
        N("consent_settings", "app_id", contentValues);
    }

    public final void W(String str, a4 a4Var) {
        com.google.android.gms.common.internal.t.l(str);
        com.google.android.gms.common.internal.t.l(a4Var);
        h();
        j();
        L(str, J(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", a4Var.l());
        N("consent_settings", "app_id", contentValues);
    }

    public final a4 X(String str) {
        com.google.android.gms.common.internal.t.l(str);
        h();
        j();
        return a4.f(M("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""), 100);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0254, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0238, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e2, code lost:
    
        r0 = r23.a.a().r();
        r10 = k7.C2.x(r24);
        r12 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fa, code lost:
    
        if (r11.zza() == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01fc, code lost:
    
        r16 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0209, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r10, r12, java.lang.String.valueOf(r16));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0207, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x029a, code lost:
    
        r21 = r7;
        r0 = r0.zzc().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a8, code lost:
    
        if (r0.hasNext() == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02aa, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.zzfn) r0.next();
        j();
        h();
        com.google.android.gms.common.internal.t.f(r24);
        com.google.android.gms.common.internal.t.l(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02c4, code lost:
    
        if (r3.zzc().isEmpty() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f6, code lost:
    
        r7 = r3.zzcc();
        r10 = new android.content.ContentValues();
        r10.put("app_id", r24);
        r10.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x030d, code lost:
    
        if (r3.zza() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x030f, code lost:
    
        r11 = java.lang.Integer.valueOf(r3.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0319, code lost:
    
        r10.put("filter_id", r11);
        r22 = r0;
        r10.put("property_name", r3.zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x032b, code lost:
    
        if (r3.zzg() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x032d, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.zzh());
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0337, code lost:
    
        r10.put("session_scoped", r0);
        r10.put("data", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x034b, code lost:
    
        if (u0().insertWithOnConflict("property_filters", (java.lang.String) null, r10, 5) != (-1)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0363, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x034d, code lost:
    
        r23.a.a().o().b("Failed to insert property filter (got -1). appId", k7.C2.x(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0361, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0367, code lost:
    
        r23.a.a().o().c("Error storing property filter. appId", k7.C2.x(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0336, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0318, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02c6, code lost:
    
        r0 = r23.a.a().r();
        r8 = k7.C2.x(r24);
        r10 = java.lang.Integer.valueOf(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02de, code lost:
    
        if (r3.zza() == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02e0, code lost:
    
        r16 = java.lang.Integer.valueOf(r3.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02ed, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r10, java.lang.String.valueOf(r16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02eb, code lost:
    
        r16 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017b, code lost:
    
        r10 = r0.zzc().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0187, code lost:
    
        if (r10.hasNext() == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0193, code lost:
    
        if (((com.google.android.gms.internal.measurement.zzfn) r10.next()).zza() != false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0195, code lost:
    
        r23.a.a().r().c("Property filter with no ID. Audience definition ignored. appId, audienceId", k7.C2.x(r24), java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ae, code lost:
    
        r10 = r0.zzf().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01c4, code lost:
    
        if (r10.hasNext() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c6, code lost:
    
        r11 = (com.google.android.gms.internal.measurement.zzff) r10.next();
        j();
        h();
        com.google.android.gms.common.internal.t.f(r24);
        com.google.android.gms.common.internal.t.l(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e0, code lost:
    
        if (r11.zzc().isEmpty() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0214, code lost:
    
        r3 = r11.zzcc();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put("app_id", r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x022d, code lost:
    
        if (r11.zza() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x022f, code lost:
    
        r8 = java.lang.Integer.valueOf(r11.zzb());
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0239, code lost:
    
        r7.put("filter_id", r8);
        r7.put("event_name", r11.zzc());
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0249, code lost:
    
        if (r11.zzk() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x024b, code lost:
    
        r8 = java.lang.Boolean.valueOf(r11.zzm());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0255, code lost:
    
        r7.put("session_scoped", r8);
        r7.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0269, code lost:
    
        if (u0().insertWithOnConflict("event_filters", (java.lang.String) null, r7, 5) != (-1)) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x026b, code lost:
    
        r23.a.a().o().b("Failed to insert event filter (got -1). appId", k7.C2.x(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x027e, code lost:
    
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0284, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0285, code lost:
    
        r23.a.a().o().c("Error storing event filter. appId", k7.C2.x(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x037a, code lost:
    
        j();
        h();
        com.google.android.gms.common.internal.t.f(r24);
        r0 = u0();
        r7 = r18;
        r0.delete("property_filters", r7, new java.lang.String[]{r24, java.lang.String.valueOf(r9)});
        r0.delete("event_filters", r7, new java.lang.String[]{r24, java.lang.String.valueOf(r9)});
        r18 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x03a3, code lost:
    
        r7 = r21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y(java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1177
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.Y(java.lang.String, java.util.List):void");
    }

    public final E Z(String str, zzhs zzhsVar, String str2) {
        E O = O("events", str, zzhsVar.zzd());
        if (O == null) {
            q3 q3Var = this.a;
            q3Var.a().r().c("Event aggregate wasn't created during raw event logging. appId, event", C2.x(str), q3Var.D().a(str2));
            return new E(str, zzhsVar.zzd(), 1L, 1L, 1L, zzhsVar.zzf(), 0L, null, null, null, null);
        }
        long j2 = O.e + 1;
        long j3 = O.d + 1;
        return new E(O.a, O.b, O.c + 1, j3, j2, O.f, O.g, O.h, O.i, O.j, O.k);
    }

    public final boolean a0() {
        q3 q3Var = this.a;
        Context d = q3Var.d();
        q3Var.w();
        return d.getDatabasePath("google_app_measurement.db").exists();
    }

    public final /* synthetic */ long b0(String str, String[] strArr, long j2) {
        return q0("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", strArr, -1L);
    }

    public final boolean l() {
        return false;
    }

    public final long m(String str, zzib zzibVar, String str2, Map map, k5 k5Var, Long l2) {
        int delete;
        h();
        j();
        com.google.android.gms.common.internal.t.l(zzibVar);
        com.google.android.gms.common.internal.t.f(str);
        h();
        j();
        if (a0()) {
            b7 b7Var = this.b;
            long a = b7Var.L0().f.a();
            q3 q3Var = this.a;
            long b = q3Var.e().b();
            long abs = Math.abs(b - a);
            q3Var.w();
            if (abs > m.r()) {
                b7Var.L0().f.b(b);
                h();
                j();
                if (a0() && (delete = u0().delete("upload_queue", S(), new String[0])) > 0) {
                    q3Var.a().w().b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(delete));
                }
                com.google.android.gms.common.internal.t.f(str);
                h();
                j();
                try {
                    int E = q3Var.w().E(str, f2.A);
                    if (E > 0) {
                        u0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(E)});
                    }
                } catch (SQLiteException e) {
                    this.a.a().o().c("Error deleting over the limit queued batches. appId", C2.x(str), e);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] zzcc = zzibVar.zzcc();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", zzcc);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", com.applovin.impl.H3.a("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(k5Var.zza()));
        q3 q3Var2 = this.a;
        contentValues.put("creation_timestamp", Long.valueOf(q3Var2.e().a()));
        contentValues.put("retry_count", 0);
        if (l2 != null) {
            contentValues.put("associated_row_id", l2);
        }
        try {
            long insert = u0().insert("upload_queue", (String) null, contentValues);
            if (insert != -1) {
                return insert;
            }
            q3Var2.a().o().b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return -1L;
        } catch (SQLiteException e2) {
            this.a.a().o().c("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            return -1L;
        }
    }

    public final /* synthetic */ A6 m0() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final k7.e7 n(long r19) {
        /*
            r18 = this;
            r18.h()
            r18.j()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r18.u0()     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r3 = "upload_queue"
            java.lang.String r4 = "rowId"
            java.lang.String r5 = "app_id"
            java.lang.String r6 = "measurement_batch"
            java.lang.String r7 = "upload_uri"
            java.lang.String r8 = "upload_headers"
            java.lang.String r9 = "upload_type"
            java.lang.String r10 = "retry_count"
            java.lang.String r11 = "creation_timestamp"
            java.lang.String r12 = "associated_row_id"
            java.lang.String r13 = "last_upload_timestamp"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r5 = "rowId=?"
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String[] r6 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            java.lang.String r10 = "1"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L8f android.database.sqlite.SQLiteException -> L91
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            if (r0 != 0) goto L42
            r3 = r18
            goto Lac
        L42:
            r0 = 1
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            java.lang.Object r0 = com.google.android.gms.common.internal.t.l(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 2
            byte[] r7 = r2.getBlob(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 3
            java.lang.String r8 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 4
            java.lang.String r9 = r2.getString(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 5
            int r10 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 6
            int r11 = r2.getInt(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 7
            long r12 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 8
            long r14 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r0 = 9
            long r16 = r2.getLong(r0)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r3 = r18
            r5 = r19
            k7.e7 r0 = r3.R(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> L84 android.database.sqlite.SQLiteException -> L86
            r2.close()
            return r0
        L84:
            r0 = move-exception
            goto L88
        L86:
            r0 = move-exception
            goto L8c
        L88:
            r3 = r18
        L8a:
            r1 = r2
            goto Lb4
        L8c:
            r3 = r18
            goto L99
        L8f:
            r0 = move-exception
            goto L93
        L91:
            r0 = move-exception
            goto L96
        L93:
            r3 = r18
            goto Lb4
        L96:
            r3 = r18
            r2 = r1
        L99:
            k7.q3 r4 = r3.a     // Catch: java.lang.Throwable -> Lb2
            k7.C2 r4 = r4.a()     // Catch: java.lang.Throwable -> Lb2
            k7.A2 r4 = r4.o()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = "Error to querying MeasurementBatch from upload_queue. rowId"
            java.lang.Long r6 = java.lang.Long.valueOf(r19)     // Catch: java.lang.Throwable -> Lb2
            r4.c(r5, r6, r0)     // Catch: java.lang.Throwable -> Lb2
        Lac:
            if (r2 == 0) goto Lb1
            r2.close()
        Lb1:
            return r1
        Lb2:
            r0 = move-exception
            goto L8a
        Lb4:
            if (r1 == 0) goto Lb9
            r1.close()
        Lb9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.n(long):k7.e7");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fe A[Catch: all -> 0x007b, SQLiteException -> 0x007d, TryCatch #6 {all -> 0x007b, blocks: (B:14:0x0067, B:22:0x006f, B:25:0x0073, B:26:0x00d1, B:28:0x00fe, B:29:0x0113, B:31:0x0117, B:32:0x0127, B:34:0x012d, B:35:0x0140, B:38:0x015a, B:47:0x0181, B:48:0x0189, B:50:0x01a8, B:52:0x01c9, B:54:0x01d2, B:56:0x01dd, B:58:0x020e, B:67:0x01fa, B:68:0x0215, B:71:0x0170, B:76:0x019a, B:77:0x01a3, B:80:0x0228, B:99:0x00c1, B:102:0x00c9), top: B:5:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0113 A[Catch: all -> 0x007b, SQLiteException -> 0x007d, TRY_LEAVE, TryCatch #6 {all -> 0x007b, blocks: (B:14:0x0067, B:22:0x006f, B:25:0x0073, B:26:0x00d1, B:28:0x00fe, B:29:0x0113, B:31:0x0117, B:32:0x0127, B:34:0x012d, B:35:0x0140, B:38:0x015a, B:47:0x0181, B:48:0x0189, B:50:0x01a8, B:52:0x01c9, B:54:0x01d2, B:56:0x01dd, B:58:0x020e, B:67:0x01fa, B:68:0x0215, B:71:0x0170, B:76:0x019a, B:77:0x01a3, B:80:0x0228, B:99:0x00c1, B:102:0x00c9), top: B:5:0x0024 }] */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n0(java.lang.String r21, long r22, long r24, k7.X6 r26) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.n0(java.lang.String, long, long, k7.X6):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List o(java.lang.String r19, k7.I6 r20, int r21) {
        /*
            r18 = this;
            com.google.android.gms.common.internal.t.f(r19)
            r18.h()
            r18.j()
            java.lang.String r0 = " AND NOT "
            java.lang.String r1 = "app_id=?"
            r2 = 0
            android.database.sqlite.SQLiteDatabase r3 = r18.u0()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r4 = "upload_queue"
            java.lang.String r5 = "rowId"
            java.lang.String r6 = "app_id"
            java.lang.String r7 = "measurement_batch"
            java.lang.String r8 = "upload_uri"
            java.lang.String r9 = "upload_headers"
            java.lang.String r10 = "upload_type"
            java.lang.String r11 = "retry_count"
            java.lang.String r12 = "creation_timestamp"
            java.lang.String r13 = "associated_row_id"
            java.lang.String r14 = "last_upload_timestamp"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7, r8, r9, r10, r11, r12, r13, r14}     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r6 = r20
            java.util.List r6 = r6.a     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r6 = T(r6)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r7 = r18.S()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            int r8 = r8.length()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            int r8 = r8 + 17
            int r9 = r7.length()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r6)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r0)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r9.append(r7)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String[] r7 = new java.lang.String[]{r19}     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.lang.String r10 = "creation_timestamp ASC"
            if (r21 <= 0) goto L6a
            java.lang.String r0 = java.lang.String.valueOf(r21)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r11 = r0
            goto L6b
        L6a:
            r11 = r2
        L6b:
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
        L76:
            boolean r1 = r2.moveToNext()     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            if (r1 == 0) goto Lbd
            r1 = 0
            long r5 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 2
            byte[] r7 = r2.getBlob(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 3
            java.lang.String r8 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 4
            java.lang.String r9 = r2.getString(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 5
            int r10 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 6
            int r11 = r2.getInt(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 7
            long r12 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 8
            long r14 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r1 = 9
            long r16 = r2.getLong(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            r3 = r18
            r4 = r19
            k7.e7 r1 = r3.R(r4, r5, r7, r8, r9, r10, r11, r12, r14, r16)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            if (r1 == 0) goto L76
            r0.add(r1)     // Catch: java.lang.Throwable -> Lb9 android.database.sqlite.SQLiteException -> Lbb
            goto L76
        Lb9:
            r0 = move-exception
            goto Lc0
        Lbb:
            r0 = move-exception
            goto Lc3
        Lbd:
            r1 = r18
            goto Lda
        Lc0:
            r1 = r18
            goto Le1
        Lc3:
            r1 = r18
            k7.q3 r3 = r1.a     // Catch: java.lang.Throwable -> Le0
            k7.C2 r3 = r3.a()     // Catch: java.lang.Throwable -> Le0
            k7.A2 r3 = r3.o()     // Catch: java.lang.Throwable -> Le0
            java.lang.String r4 = "Error to querying MeasurementBatch from upload_queue. appId"
            r5 = r19
            r3.c(r4, r5, r0)     // Catch: java.lang.Throwable -> Le0
            java.util.List r0 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> Le0
        Lda:
            if (r2 == 0) goto Ldf
            r2.close()
        Ldf:
            return r0
        Le0:
            r0 = move-exception
        Le1:
            if (r2 == 0) goto Le6
            r2.close()
        Le6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.o(java.lang.String, k7.I6, int):java.util.List");
    }

    public final boolean p(String str) {
        k5[] k5VarArr = {k5.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(k5VarArr[0].zza()));
        String T = T(arrayList);
        String S = S();
        StringBuilder sb = new StringBuilder(String.valueOf(T).length() + 61 + S.length());
        sb.append("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?");
        sb.append(T);
        sb.append(" AND NOT ");
        sb.append(S);
        return p0(sb.toString(), new String[]{str}) != 0;
    }

    public final long p0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = u0().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j2 = rawQuery.getLong(0);
                rawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                this.a.a().o().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void q(Long l2) {
        h();
        j();
        com.google.android.gms.common.internal.t.l(l2);
        try {
            if (u0().delete("upload_queue", "rowid=?", new String[]{l2.toString()}) != 1) {
                this.a.a().r().a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            this.a.a().o().b("Failed to delete a MeasurementBatch in a upload_queue table", e);
            throw e;
        }
    }

    public final long q0(String str, String[] strArr, long j2) {
        Cursor cursor = null;
        try {
            try {
                cursor = u0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j2 = cursor.getLong(0);
                }
                cursor.close();
                return j2;
            } catch (SQLiteException e) {
                this.a.a().o().c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String r() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.u0()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L22 android.database.sqlite.SQLiteException -> L24
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            if (r2 == 0) goto L36
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: java.lang.Throwable -> L1a android.database.sqlite.SQLiteException -> L1c
            r0.close()
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r2 = move-exception
            goto L27
        L1e:
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3c
        L22:
            r0 = move-exception
            goto L3c
        L24:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L27:
            k7.q3 r3 = r6.a     // Catch: java.lang.Throwable -> L1a
            k7.C2 r3 = r3.a()     // Catch: java.lang.Throwable -> L1a
            k7.A2 r3 = r3.o()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L1a
        L36:
            if (r0 == 0) goto L3b
            r0.close()
        L3b:
            return r1
        L3c:
            if (r1 == 0) goto L41
            r1.close()
        L41:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.r():java.lang.String");
    }

    public final void r0() {
        j();
        u0().beginTransaction();
    }

    public final boolean s() {
        return p0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final void s0() {
        j();
        u0().setTransactionSuccessful();
    }

    public final void t(long j2) {
        h();
        j();
        try {
            if (u0().delete("queue", "rowid=?", new String[]{String.valueOf(j2)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            this.a.a().o().b("Failed to delete a bundle in a queue table", e);
            throw e;
        }
    }

    public final void t0() {
        j();
        u0().endTransaction();
    }

    public final void u() {
        h();
        j();
        if (a0()) {
            b7 b7Var = this.b;
            long a = b7Var.L0().e.a();
            q3 q3Var = this.a;
            long b = q3Var.e().b();
            long abs = Math.abs(b - a);
            q3Var.w();
            if (abs > m.r()) {
                b7Var.L0().e.b(b);
                h();
                j();
                if (a0()) {
                    SQLiteDatabase u0 = u0();
                    String valueOf = String.valueOf(q3Var.e().a());
                    q3Var.w();
                    int delete = u0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{valueOf, String.valueOf(m.q())});
                    if (delete > 0) {
                        q3Var.a().w().b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    public final SQLiteDatabase u0() {
        h();
        try {
            return this.d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.a.a().r().b("Error opening database", e);
            throw e;
        }
    }

    public final void v(List list) {
        h();
        j();
        com.google.android.gms.common.internal.t.l(list);
        com.google.android.gms.common.internal.t.n(list.size());
        if (a0()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
            sb.append("(");
            sb.append(join);
            sb.append(")");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder(sb2.length() + 80);
            sb3.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb3.append(sb2);
            sb3.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb3.toString(), null) > 0) {
                this.a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase u0 = u0();
                StringBuilder sb4 = new StringBuilder(sb2.length() + 127);
                sb4.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb4.append(sb2);
                sb4.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                u0.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                this.a.a().o().b("Error incrementing retry count. error", e);
            }
        }
    }

    public final E v0(String str, String str2) {
        return O("events", str, str2);
    }

    public final void w(Long l2) {
        h();
        j();
        com.google.android.gms.common.internal.t.l(l2);
        if (a0()) {
            StringBuilder sb = new StringBuilder(l2.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l2);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (p0(sb.toString(), null) > 0) {
                this.a.a().r().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase u0 = u0();
                long a = this.a.e().a();
                StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(a);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder(sb3.length() + 34 + l2.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(sb3);
                sb4.append(" WHERE rowid = ");
                sb4.append(l2);
                sb4.append(" AND retry_count < 2147483647");
                u0.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                this.a.a().o().b("Error incrementing retry count. error", e);
            }
        }
    }

    public final void w0(E e) {
        P("events", e);
    }

    public final Object x(Cursor cursor, int i2) {
        int type = cursor.getType(i2);
        if (type == 0) {
            this.a.a().o().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i2));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i2));
        }
        if (type == 3) {
            return cursor.getString(i2);
        }
        if (type != 4) {
            this.a.a().o().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.a.a().o().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    public final void x0(String str) {
        E O;
        Q("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = u0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, (String) null, (String) null, (String) null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string != null && (O = O("events", str, string)) != null) {
                            P("events_snapshot", O);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e) {
                this.a.a().o().c("Error creating snapshot. appId", C2.x(str), e);
            }
            if (cursor != null) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long y() {
        return q0("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y0(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.y0(java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x009a A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009a, B:18:0x00b0, B:22:0x00b8), top: B:2:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b0 A[Catch: all -> 0x0074, SQLiteException -> 0x00ae, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x001b, B:6:0x0041, B:8:0x0060, B:15:0x0079, B:17:0x009a, B:18:0x00b0, B:22:0x00b8), top: B:2:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long z(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.t.f(r14)
            java.lang.String r15 = "first_open_count"
            com.google.android.gms.common.internal.t.f(r15)
            r13.h()
            r13.j()
            android.database.sqlite.SQLiteDatabase r0 = r13.u0()
            r0.beginTransaction()
            java.lang.String r1 = " from app2 where app_id=?"
            java.lang.String r2 = "select "
            r3 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r6 = 48
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r5.append(r2)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r5.append(r15)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r5.append(r1)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String[] r2 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r5 = -1
            long r1 = r13.q0(r1, r2, r5)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            java.lang.String r8 = "app2"
            java.lang.String r9 = "app_id"
            if (r7 != 0) goto L79
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r1.<init>()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r1.put(r9, r14)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r1.put(r15, r2)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String r7 = "previous_install_count"
            r1.put(r7, r2)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r2 = 0
            r7 = 5
            long r1 = r0.insertWithOnConflict(r8, r2, r1, r7)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L78
            k7.q3 r1 = r13.a     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            k7.C2 r1 = r1.a()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            k7.A2 r1 = r1.o()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            java.lang.String r2 = "Failed to insert column (got -1). appId"
            java.lang.Object r7 = k7.C2.x(r14)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            r1.c(r2, r7, r15)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> L76
            goto Lcc
        L74:
            r14 = move-exception
            goto Ld0
        L76:
            r1 = move-exception
            goto Lb5
        L78:
            r1 = r3
        L79:
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r7.<init>()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r7.put(r9, r14)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r9 = 1
            long r9 = r9 + r1
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r7.put(r15, r9)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            java.lang.String r9 = "app_id = ?"
            java.lang.String[] r10 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            int r7 = r0.update(r8, r7, r9, r10)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 != 0) goto Lb0
            k7.q3 r3 = r13.a     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            k7.C2 r3 = r3.a()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            k7.A2 r3 = r3.o()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            java.lang.String r4 = "Failed to update column (got 0). appId"
            java.lang.Object r7 = k7.C2.x(r14)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            r3.c(r4, r7, r15)     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
            goto Lcc
        Lae:
            r3 = move-exception
            goto Lb8
        Lb0:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L74 android.database.sqlite.SQLiteException -> Lae
        Lb3:
            r5 = r1
            goto Lcc
        Lb5:
            r11 = r3
            r3 = r1
            r1 = r11
        Lb8:
            k7.q3 r4 = r13.a     // Catch: java.lang.Throwable -> L74
            k7.C2 r4 = r4.a()     // Catch: java.lang.Throwable -> L74
            k7.A2 r4 = r4.o()     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = "Error inserting column. appId"
            java.lang.Object r14 = k7.C2.x(r14)     // Catch: java.lang.Throwable -> L74
            r4.d(r5, r14, r15, r3)     // Catch: java.lang.Throwable -> L74
            goto Lb3
        Lcc:
            r0.endTransaction()
            return r5
        Ld0:
            r0.endTransaction()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.w.z(java.lang.String, java.lang.String):long");
    }

    public final void z0(String str, String str2) {
        com.google.android.gms.common.internal.t.f(str);
        com.google.android.gms.common.internal.t.f(str2);
        h();
        j();
        try {
            u0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            q3 q3Var = this.a;
            q3Var.a().o().d("Error deleting user property. appId", C2.x(str), q3Var.D().c(str2), e);
        }
    }
}
