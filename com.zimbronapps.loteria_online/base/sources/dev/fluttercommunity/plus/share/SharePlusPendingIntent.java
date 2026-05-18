package dev.fluttercommunity.plus.share;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SharePlusPendingIntent extends BroadcastReceiver {
    public static final a a = new a(null);
    public static String b = "";

    public static final class a {
        public /* synthetic */ a(k kVar) {
            this();
        }

        public final String a() {
            return SharePlusPendingIntent.a();
        }

        public final void b(String str) {
            t.g(str, "<set-?>");
            SharePlusPendingIntent.b(str);
        }

        public a() {
        }
    }

    public static final /* synthetic */ String a() {
        return b;
    }

    public static final /* synthetic */ void b(String str) {
        b = str;
    }

    public void onReceive(Context context, Intent intent) {
        t.g(context, "context");
        t.g(intent, "intent");
        ComponentName parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (ComponentName) com.revenuecat.purchases.ui.revenuecatui.activity.a.a(intent, "android.intent.extra.CHOSEN_COMPONENT", ComponentName.class) : intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        if (parcelableExtra != null) {
            b = parcelableExtra.flattenToString();
        }
    }
}
