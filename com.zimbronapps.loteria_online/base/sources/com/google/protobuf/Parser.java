package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public interface Parser {
    Object parseDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    Object parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    Object parseFrom(ByteString byteString) throws InvalidProtocolBufferException;

    Object parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    Object parseFrom(CodedInputStream codedInputStream) throws InvalidProtocolBufferException;

    Object parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    Object parseFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    Object parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    Object parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException;

    Object parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    Object parseFrom(byte[] bArr) throws InvalidProtocolBufferException;

    Object parseFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

    Object parseFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    Object parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    Object parsePartialDelimitedFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    Object parsePartialDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    Object parsePartialFrom(ByteString byteString) throws InvalidProtocolBufferException;

    Object parsePartialFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    Object parsePartialFrom(CodedInputStream codedInputStream) throws InvalidProtocolBufferException;

    Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    Object parsePartialFrom(InputStream inputStream) throws InvalidProtocolBufferException;

    Object parsePartialFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    Object parsePartialFrom(byte[] bArr) throws InvalidProtocolBufferException;

    Object parsePartialFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

    Object parsePartialFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    Object parsePartialFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;
}
