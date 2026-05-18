package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class k extends j {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public int a(Map.Entry entry) {
        return ((GeneratedMessageLite.b) entry.getKey()).getNumber();
    }

    public Object b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
    }

    public FieldSet c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    public FieldSet d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    public boolean e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    public void f(Object obj) {
        c(obj).y();
    }

    public Object g(Object obj, L l, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj3, T t) {
        Object valueOf;
        Object j;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (a.a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    l.G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    l.C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    l.h(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    l.f(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    l.w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    l.q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    l.x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    l.m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    l.t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    l.b(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    l.v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    l.r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    l.c(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    l.i(arrayList);
                    obj3 = P.z(obj, number, arrayList, generatedExtension.descriptor.getEnumType(), obj3, t);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
            fieldSet.D(generatedExtension.descriptor, arrayList);
        } else {
            if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
                switch (a.a[generatedExtension.getLiteType().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(l.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(l.readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(l.H());
                        break;
                    case 4:
                        valueOf = Long.valueOf(l.s());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(l.p());
                        break;
                    case 6:
                        valueOf = Long.valueOf(l.a());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(l.u());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(l.d());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(l.g());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(l.E());
                        break;
                    case 11:
                        valueOf = Long.valueOf(l.e());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(l.l());
                        break;
                    case 13:
                        valueOf = Long.valueOf(l.y());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = l.o();
                        break;
                    case 16:
                        valueOf = l.z();
                        break;
                    case 17:
                        if (!generatedExtension.isRepeated()) {
                            Object j2 = fieldSet.j(generatedExtension.descriptor);
                            if (j2 instanceof GeneratedMessageLite) {
                                N d = I.a().d(j2);
                                if (!((GeneratedMessageLite) j2).isMutable()) {
                                    Object newInstance = d.newInstance();
                                    d.a(newInstance, j2);
                                    fieldSet.D(generatedExtension.descriptor, newInstance);
                                    j2 = newInstance;
                                }
                                l.O(j2, d, extensionRegistryLite);
                                return obj3;
                            }
                        }
                        valueOf = l.L(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    case 18:
                        if (!generatedExtension.isRepeated()) {
                            Object j3 = fieldSet.j(generatedExtension.descriptor);
                            if (j3 instanceof GeneratedMessageLite) {
                                N d2 = I.a().d(j3);
                                if (!((GeneratedMessageLite) j3).isMutable()) {
                                    Object newInstance2 = d2.newInstance();
                                    d2.a(newInstance2, j3);
                                    fieldSet.D(generatedExtension.descriptor, newInstance2);
                                    j3 = newInstance2;
                                }
                                l.P(j3, d2, extensionRegistryLite);
                                return obj3;
                            }
                        }
                        valueOf = l.N(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            } else {
                int p = l.p();
                if (generatedExtension.descriptor.getEnumType().findValueByNumber(p) == null) {
                    return P.J(obj, number, p, obj3, t);
                }
                valueOf = Integer.valueOf(p);
            }
            if (generatedExtension.isRepeated()) {
                fieldSet.a(generatedExtension.descriptor, valueOf);
            } else {
                int i = a.a[generatedExtension.getLiteType().ordinal()];
                if ((i == 17 || i == 18) && (j = fieldSet.j(generatedExtension.descriptor)) != null) {
                    valueOf = Internal.mergeMessage(j, valueOf);
                }
                fieldSet.D(generatedExtension.descriptor, valueOf);
            }
        }
        return obj3;
    }

    public void h(L l, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.D(generatedExtension.descriptor, l.N(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    public void i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite.Builder newBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        CodedInputStream newCodedInput = byteString.newCodedInput();
        newBuilderForType.mergeFrom(newCodedInput, extensionRegistryLite);
        fieldSet.D(generatedExtension.descriptor, newBuilderForType.buildPartial());
        newCodedInput.checkLastTagWas(0);
    }

    public void j(Writer writer, Map.Entry entry) {
        GeneratedMessageLite.b bVar = (GeneratedMessageLite.b) entry.getKey();
        if (!bVar.isRepeated()) {
            switch (a.a[bVar.getLiteType().ordinal()]) {
                case 1:
                    writer.p(bVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    break;
                case 2:
                    writer.B(bVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    break;
                case 3:
                    writer.u(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    writer.f(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 5:
                    writer.h(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 6:
                    writer.s(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 7:
                    writer.c(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 8:
                    writer.v(bVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 9:
                    writer.o(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 10:
                    writer.w(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 11:
                    writer.i(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 12:
                    writer.H(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    writer.m(bVar.getNumber(), ((Long) entry.getValue()).longValue());
                    break;
                case 14:
                    writer.h(bVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    break;
                case 15:
                    writer.L(bVar.getNumber(), (ByteString) entry.getValue());
                    break;
                case 16:
                    writer.e(bVar.getNumber(), (String) entry.getValue());
                    break;
                case 17:
                    writer.K(bVar.getNumber(), entry.getValue(), I.a().c(entry.getValue().getClass()));
                    break;
                case 18:
                    writer.N(bVar.getNumber(), entry.getValue(), I.a().c(entry.getValue().getClass()));
                    break;
            }
        }
        switch (a.a[bVar.getLiteType().ordinal()]) {
            case 1:
                P.O(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 2:
                P.S(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 3:
                P.V(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 4:
                P.d0(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 5:
                P.U(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 6:
                P.R(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 7:
                P.Q(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 8:
                P.M(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 9:
                P.c0(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 10:
                P.X(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 11:
                P.Y(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 12:
                P.Z(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 13:
                P.a0(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 14:
                P.U(bVar.getNumber(), (List) entry.getValue(), writer, bVar.isPacked());
                break;
            case 15:
                P.N(bVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 16:
                P.b0(bVar.getNumber(), (List) entry.getValue(), writer);
                break;
            case 17:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    P.T(bVar.getNumber(), (List) entry.getValue(), writer, I.a().c(list.get(0).getClass()));
                    break;
                }
                break;
            case 18:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    P.W(bVar.getNumber(), (List) entry.getValue(), writer, I.a().c(list2.get(0).getClass()));
                    break;
                }
                break;
        }
    }
}
