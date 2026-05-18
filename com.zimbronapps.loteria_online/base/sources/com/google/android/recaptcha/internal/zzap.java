package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzap {
    public static final String zza(ContentResolver contentResolver) {
        Cursor query = contentResolver.query(Uri.parse("content://com.google.android.gsf.gservices"), (String[]) null, (String) null, new String[]{"android_id"}, (String) null);
        if (query == null || !query.moveToFirst() || query.getColumnCount() < 2) {
            return "";
        }
        String valueOf = String.valueOf(Long.parseLong(query.getString(1)));
        query.close();
        return valueOf;
    }
}
