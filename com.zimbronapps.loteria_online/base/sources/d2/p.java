package d2;

import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.OnSuccessListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class p implements OnSuccessListener {
    public final /* synthetic */ Qa.l a;

    public /* synthetic */ p(Qa.l lVar) {
        this.a = lVar;
    }

    public final void onSuccess(Object obj) {
        HiddenActivity.d(this.a, obj);
    }
}
