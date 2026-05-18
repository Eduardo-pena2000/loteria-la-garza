package com.google.android.gms.games.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.games_v2.zzad;
import com.google.android.gms.internal.games_v2.zzbr;
import com.google.android.gms.internal.games_v2.zzfg;

@zzad
/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class PlayGamesInitProvider extends ContentProvider {
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        t.m(providerInfo, "PlayGamesSdkInitProvider ProviderInfo cannot be null.");
        if ("com.google.android.gms.games.playgamesinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            zzfg.zzg("GamesInitProvider", "No Context available. Please manually invoke PlayGamesSdk.initialize().");
            return false;
        }
        zzbr.zzc(context);
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
