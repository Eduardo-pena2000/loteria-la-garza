package V5;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class g0 implements Callable {
    public final /* synthetic */ Context a;

    public /* synthetic */ g0(Context context) {
        this.a = context;
    }

    public final /* synthetic */ Object call() {
        Context context = this.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
        String string = sharedPreferences.getString("user_agent", "");
        if (!TextUtils.isEmpty(string)) {
            o0.k("User agent is already initialized on Google Play Services.");
            return string;
        }
        o0.k("User agent is not initialized on Google Play Services. Initializing.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        E6.u.a(context, sharedPreferences.edit().putString("user_agent", defaultUserAgent), "admob_user_agent");
        return defaultUserAgent;
    }
}
