package com.revenuecat.purchases.common;

import Za.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class UtilsKt {
    public static final boolean getCanUsePaywallUI() {
        return true;
    }

    public static final Locale getLocale(Context context) {
        t.g(context, "<this>");
        return context.getResources().getConfiguration().getLocales().get(0);
    }

    public static final String getPlayServicesVersionName(Context context) {
        t.g(context, "<this>");
        return packageVersionName(context, "com.google.android.gms");
    }

    public static final String getPlayStoreVersionName(Context context) {
        t.g(context, "<this>");
        return packageVersionName(context, "com.android.vending");
    }

    public static final String getVersionName(Context context) {
        t.g(context, "<this>");
        return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
    }

    public static final boolean isDeviceProtectedStorageCompat(Context context) {
        t.g(context, "<this>");
        return context.isDeviceProtectedStorage();
    }

    private static final String packageVersionName(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @InternalRevenueCatAPI
    public static final String sha1(String str) {
        t.g(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        Charset charset = c.b;
        byte[] bytes = str.getBytes(charset);
        t.f(bytes, "getBytes(...)");
        byte[] encode = Base64.encode(messageDigest.digest(bytes), 2);
        t.f(encode, "encode(it, Base64.NO_WRAP)");
        return new String(encode, charset);
    }

    @InternalRevenueCatAPI
    public static final String sha256(String str) {
        t.g(str, "<this>");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        Charset charset = c.b;
        byte[] bytes = str.getBytes(charset);
        t.f(bytes, "getBytes(...)");
        byte[] encode = Base64.encode(messageDigest.digest(bytes), 2);
        t.f(encode, "encode(it, Base64.NO_WRAP)");
        return new String(encode, charset);
    }
}
