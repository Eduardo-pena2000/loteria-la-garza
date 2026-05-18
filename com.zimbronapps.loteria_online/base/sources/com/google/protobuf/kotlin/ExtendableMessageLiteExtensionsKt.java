package com.google.protobuf.kotlin;

import com.google.protobuf.ExtensionLite;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class ExtendableMessageLiteExtensionsKt {
    public static final boolean contains(GeneratedMessageLite.ExtendableMessageOrBuilder extendableMessageOrBuilder, ExtensionLite extensionLite) {
        t.g(extendableMessageOrBuilder, "<this>");
        t.g(extensionLite, "extension");
        return extendableMessageOrBuilder.hasExtension(extensionLite);
    }

    public static final Object get(GeneratedMessageLite.ExtendableMessageOrBuilder extendableMessageOrBuilder, ExtensionLite extensionLite) {
        t.g(extendableMessageOrBuilder, "<this>");
        t.g(extensionLite, "extension");
        Object extension = extendableMessageOrBuilder.getExtension(extensionLite);
        t.f(extension, "getExtension(extension)");
        return extension;
    }

    public static final void set(GeneratedMessageLite.ExtendableBuilder extendableBuilder, ExtensionLite extensionLite, Object obj) {
        t.g(extendableBuilder, "<this>");
        t.g(extensionLite, "extension");
        t.g(obj, "value");
        extendableBuilder.setExtension(extensionLite, obj);
    }
}
