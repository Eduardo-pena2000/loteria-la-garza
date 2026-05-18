package H6;

import H6.d;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.g;
import com.google.android.gms.tasks.Task;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class l extends com.google.android.gms.common.api.g {
    public l(Context context, d.a aVar) {
        super(context, d.k, aVar, g.a.c);
    }

    public abstract Task commitContents(g gVar, q qVar, m mVar);

    public abstract Task createFile(i iVar, q qVar, g gVar, m mVar);

    public abstract Task query(L6.c cVar);

    public l(Activity activity, d.a aVar) {
        super(activity, d.k, aVar, g.a.c);
    }
}
