package v6;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class h {
    public static final int a = l.a;
    public static final h b = new h();

    public static h f() {
        return b;
    }

    public int a(Context context) {
        return l.b(context);
    }

    public Intent b(Context context, int i, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && E6.j.g(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(G6.e.a(context).f(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent c(Context context, int i, int i2) {
        return d(context, i, i2, null);
    }

    public PendingIntent d(Context context, int i, int i2, String str) {
        Intent b2 = b(context, i, str);
        if (b2 == null) {
            return null;
        }
        return G1.s.b(context, i2, b2, 134217728, false);
    }

    public String e(int i) {
        return l.c(i);
    }

    public int g(Context context) {
        return h(context, a);
    }

    public int h(Context context, int i) {
        int g = l.g(context, i);
        if (l.h(context, g)) {
            return 18;
        }
        return g;
    }

    public boolean i(Context context, String str) {
        return l.l(context, str);
    }

    public boolean j(int i) {
        return l.j(i);
    }

    public void k(Context context, int i) {
        l.a(context, i);
    }
}
