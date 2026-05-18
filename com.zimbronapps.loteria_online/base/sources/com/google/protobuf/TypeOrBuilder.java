package com.google.protobuf;

import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface TypeOrBuilder extends MessageLiteOrBuilder {
    String getEdition();

    ByteString getEditionBytes();

    Field getFields(int i);

    int getFieldsCount();

    List getFieldsList();

    String getName();

    ByteString getNameBytes();

    String getOneofs(int i);

    ByteString getOneofsBytes(int i);

    int getOneofsCount();

    List getOneofsList();

    Option getOptions(int i);

    int getOptionsCount();

    List getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
