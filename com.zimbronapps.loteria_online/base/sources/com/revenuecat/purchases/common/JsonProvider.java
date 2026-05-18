package com.revenuecat.purchases.common;

import kotlin.jvm.internal.k;
import tb.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class JsonProvider {
    public static final Companion Companion = new Companion(null);
    private static final tb.b defaultJson = u.b((tb.b) null, JsonProvider$Companion$defaultJson$1.INSTANCE, 1, (Object) null);

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final tb.b getDefaultJson() {
            return JsonProvider.access$getDefaultJson$cp();
        }

        private Companion() {
        }
    }

    public /* synthetic */ JsonProvider(k kVar) {
        this();
    }

    public static final /* synthetic */ tb.b access$getDefaultJson$cp() {
        return defaultJson;
    }

    private JsonProvider() {
    }
}
