package com.google.protobuf;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class i {
    public static final Class a = e();

    public static ExtensionRegistryLite a() {
        ExtensionRegistryLite c = c("newInstance");
        return c != null ? c : new ExtensionRegistryLite();
    }

    public static ExtensionRegistryLite b() {
        ExtensionRegistryLite c = c("getEmptyRegistry");
        return c != null ? c : ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
    }

    public static final ExtensionRegistryLite c(String str) {
        Class cls = a;
        if (cls == null) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getDeclaredMethod(str, (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean d(ExtensionRegistryLite extensionRegistryLite) {
        Class cls = a;
        return cls != null && cls.isAssignableFrom(extensionRegistryLite.getClass());
    }

    public static Class e() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
