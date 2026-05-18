package V5;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class w0 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final /* synthetic */ F0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;

    public /* synthetic */ w0(F0 f0, Context context, String str) {
        this.a = f0;
        this.b = context;
        this.c = str;
    }

    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.a.a0(this.b, this.c, sharedPreferences, str);
    }
}
