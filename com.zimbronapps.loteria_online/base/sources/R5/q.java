package R5;

import android.os.AsyncTask;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class q extends AsyncTask {
    public final /* synthetic */ s a;

    public /* synthetic */ q(s sVar, byte[] bArr) {
        Objects.requireNonNull(sVar);
        this.a = sVar;
    }

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.a.s1();
    }

    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        s sVar = this.a;
        String str = (String) obj;
        if (sVar.v1() == null || str == null) {
            return;
        }
        sVar.v1().loadUrl(str);
    }
}
