package ab;

import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class g extends f {
    public static final e d(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return e.h;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        }
        if (c == 'H') {
            return e.g;
        }
        if (c == 'M') {
            return e.f;
        }
        if (c == 'S') {
            return e.e;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
    }

    public static final e e(String shortName) {
        t.g(shortName, "shortName");
        int hashCode = shortName.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && shortName.equals("us")) {
                                    return e.c;
                                }
                            } else if (shortName.equals("ns")) {
                                return e.b;
                            }
                        } else if (shortName.equals("ms")) {
                            return e.d;
                        }
                    } else if (shortName.equals("s")) {
                        return e.e;
                    }
                } else if (shortName.equals("m")) {
                    return e.f;
                }
            } else if (shortName.equals("h")) {
                return e.g;
            }
        } else if (shortName.equals("d")) {
            return e.h;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
