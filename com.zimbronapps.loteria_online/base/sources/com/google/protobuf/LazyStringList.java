package com.google.protobuf;

import java.util.Collection;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface LazyStringList extends ProtocolStringList {
    void add(ByteString byteString);

    void add(byte[] bArr);

    boolean addAllByteArray(Collection collection);

    boolean addAllByteString(Collection collection);

    List asByteArrayList();

    byte[] getByteArray(int i);

    ByteString getByteString(int i);

    Object getRaw(int i);

    List getUnderlyingElements();

    LazyStringList getUnmodifiableView();

    void mergeFrom(LazyStringList lazyStringList);

    void set(int i, ByteString byteString);

    void set(int i, byte[] bArr);
}
