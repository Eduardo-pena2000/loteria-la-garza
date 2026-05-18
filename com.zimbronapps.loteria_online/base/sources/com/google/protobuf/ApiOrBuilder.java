package com.google.protobuf;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface ApiOrBuilder extends MessageLiteOrBuilder {
    Method getMethods(int i);

    int getMethodsCount();

    List getMethodsList();

    Mixin getMixins(int i);

    int getMixinsCount();

    List getMixinsList();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int i);

    int getOptionsCount();

    List getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    String getVersion();

    ByteString getVersionBytes();

    boolean hasSourceContext();
}
