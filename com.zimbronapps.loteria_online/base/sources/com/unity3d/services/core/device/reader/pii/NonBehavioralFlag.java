package com.unity3d.services.core.device.reader.pii;

import Ca.s;
import java.util.Locale;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final NonBehavioralFlag fromString(String value) {
            Object b;
            t.g(value, "value");
            try {
                s.a aVar = s.b;
                String upperCase = value.toUpperCase(Locale.ROOT);
                t.f(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                b = s.b(NonBehavioralFlag.valueOf(upperCase));
            } catch (Throwable th) {
                s.a aVar2 = s.b;
                b = s.b(Ca.t.a(th));
            }
            NonBehavioralFlag nonBehavioralFlag = NonBehavioralFlag.UNKNOWN;
            if (s.g(b)) {
                b = nonBehavioralFlag;
            }
            return (NonBehavioralFlag) b;
        }

        private Companion() {
        }
    }
}
