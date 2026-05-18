package ta;

import com.google.android.ump.ConsentForm;
import com.google.android.ump.FormError;
import da.j;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class d implements ConsentForm.OnConsentFormDismissedListener {
    public final /* synthetic */ j.d a;

    public /* synthetic */ d(j.d dVar) {
        this.a = dVar;
    }

    public final void onConsentFormDismissed(FormError formError) {
        f.a(this.a, formError);
    }
}
