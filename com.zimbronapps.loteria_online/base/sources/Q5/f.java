package q5;

import android.os.Build;
import da.j;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class f implements j.c {
    public final e a;

    public f(e eVar) {
        this.a = eVar;
    }

    public void onMethodCall(da.i iVar, j.d dVar) {
        String str = iVar.a;
        str.hashCode();
        switch (str) {
            case "cancel":
                this.a.a().cancel();
                dVar.a((Object) null);
                break;
            case "hasAmplitudeControl":
                if (Build.VERSION.SDK_INT < 26) {
                    dVar.a(Boolean.FALSE);
                    break;
                } else {
                    dVar.a(Boolean.valueOf(c.a(this.a.a())));
                    break;
                }
            case "vibrate":
                Integer num = (Integer) iVar.a("duration");
                List list = (List) iVar.a("pattern");
                Integer num2 = (Integer) iVar.a("repeat");
                List list2 = (List) iVar.a("intensities");
                Integer num3 = (Integer) iVar.a("amplitude");
                if (!list.isEmpty() && !list2.isEmpty()) {
                    this.a.d(list, num2.intValue(), list2);
                } else if (list.size() > 0) {
                    this.a.c(list, num2.intValue());
                } else {
                    this.a.b(num.intValue(), num3.intValue());
                }
                dVar.a((Object) null);
                break;
            case "hasCustomVibrationsSupport":
                dVar.a(Boolean.TRUE);
                break;
            default:
                dVar.c();
                break;
        }
    }
}
