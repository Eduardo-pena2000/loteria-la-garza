package V5;

import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class w implements DialogInterface.OnClickListener {
    public final /* synthetic */ Context a;

    public w(x xVar, Context context) {
        this.a = context;
        Objects.requireNonNull(xVar);
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        R5.t.g();
        F0.C(this.a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
