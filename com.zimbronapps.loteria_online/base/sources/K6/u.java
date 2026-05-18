package K6;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class u extends m {
    public u(String str, int i) {
        super(str, Arrays.asList(new String[]{a(str, "permissionId"), a(str, "displayName"), a(str, "picture"), a(str, "isAuthenticatedUser"), a(str, "emailAddress")}), Collections.emptyList(), 6000000);
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        return sb.toString();
    }

    public final String b(String str) {
        return a(getName(), str);
    }

    public final boolean zzb(DataHolder dataHolder, int i, int i2) {
        return dataHolder.T1(b("permissionId")) && !dataHolder.U1(b("permissionId"), i, i2);
    }

    public final /* synthetic */ Object zzc(DataHolder dataHolder, int i, int i2) {
        String R1 = dataHolder.R1(b("permissionId"), i, i2);
        if (R1 != null) {
            return new UserMetadata(R1, dataHolder.R1(b("displayName"), i, i2), dataHolder.R1(b("picture"), i, i2), dataHolder.M1(b("isAuthenticatedUser"), i, i2), dataHolder.R1(b("emailAddress"), i, i2));
        }
        return null;
    }
}
