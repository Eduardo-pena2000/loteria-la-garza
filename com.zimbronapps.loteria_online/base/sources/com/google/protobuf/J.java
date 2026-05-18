package com.google.protobuf;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public abstract class j {
    public abstract int a(Map.Entry entry);

    public abstract Object b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i);

    public abstract FieldSet c(Object obj);

    public abstract FieldSet d(Object obj);

    public abstract boolean e(MessageLite messageLite);

    public abstract void f(Object obj);

    public abstract Object g(Object obj, L l, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj3, T t);

    public abstract void h(L l, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet);

    public abstract void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet);

    public abstract void j(Writer writer, Map.Entry entry);
}
