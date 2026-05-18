package M6;

import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Set;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public abstract class j {
    public static J6.b a(MetadataBundle metadataBundle) {
        Set S1 = metadataBundle.S1();
        if (S1.size() == 1) {
            return (J6.b) S1.iterator().next();
        }
        throw new IllegalArgumentException("bundle should have exactly 1 populated field");
    }
}
