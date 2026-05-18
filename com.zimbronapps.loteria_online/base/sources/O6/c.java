package o6;

import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final /* synthetic */ class c implements Comparator {
    public static final /* synthetic */ c a = new c();

    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).M1().compareTo(((Scope) obj2).M1());
    }
}
