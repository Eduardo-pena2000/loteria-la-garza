package V5;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class h0 implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Context b;

    public /* synthetic */ h0(Context context, Context context2) {
        this.a = context;
        this.b = context2;
    }

    public final /* synthetic */ Object call() {
        SharedPreferences sharedPreferences;
        Context context = this.a;
        Context context2 = this.b;
        boolean z = false;
        if (context != null) {
            o0.k("Attempting to read user agent from Google Play Services.");
            sharedPreferences = context.getSharedPreferences("admob_user_agent", 0);
        } else {
            o0.k("Attempting to read user agent from local cache.");
            sharedPreferences = context2.getSharedPreferences("admob_user_agent", 0);
            z = true;
        }
        String string = sharedPreferences.getString("user_agent", "");
        if (TextUtils.isEmpty(string)) {
            o0.k("Reading user agent from WebSettings");
            string = WebSettings.getDefaultUserAgent(context2);
            if (z) {
                sharedPreferences.edit().putString("user_agent", string).apply();
                o0.k("Persisting user agent.");
            }
        }
        return string;
    }
}
