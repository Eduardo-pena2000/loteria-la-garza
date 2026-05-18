package ob;

import java.util.List;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class c extends j {
    public final List a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List missingFields, String str, Throwable th) {
        super(str, th);
        t.g(missingFields, "missingFields");
        this.a = missingFields;
    }

    public final List a() {
        return this.a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c(List missingFields, String serialName) {
        String str;
        t.g(missingFields, "missingFields");
        t.g(serialName, "serialName");
        if (missingFields.size() == 1) {
            str = "Field '" + ((String) missingFields.get(0)) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, str, null);
    }
}
