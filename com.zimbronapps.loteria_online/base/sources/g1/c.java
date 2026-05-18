package G1;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Bundle;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class c {

    public static class a extends c {
        public final ActivityOptions a;

        public a(ActivityOptions activityOptions) {
            this.a = activityOptions;
        }

        public Bundle b() {
            return this.a.toBundle();
        }
    }

    public static c a(Context context, int i, int i2) {
        return new a(ActivityOptions.makeCustomAnimation(context, i, i2));
    }

    public abstract Bundle b();
}
