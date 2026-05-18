package com.google.protobuf;

import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface StructOrBuilder extends MessageLiteOrBuilder {
    boolean containsFields(String str);

    @Deprecated
    Map getFields();

    int getFieldsCount();

    Map getFieldsMap();

    Value getFieldsOrDefault(String str, Value value);

    Value getFieldsOrThrow(String str);
}
