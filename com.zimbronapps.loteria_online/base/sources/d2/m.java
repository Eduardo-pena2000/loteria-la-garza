package d2;

import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final /* synthetic */ class m implements OnFailureListener {
    public final /* synthetic */ HiddenActivity a;

    public /* synthetic */ m(HiddenActivity hiddenActivity) {
        this.a = hiddenActivity;
    }

    public final void onFailure(Exception exc) {
        HiddenActivity.f(this.a, exc);
    }
}
