package org.apache.tika.metadata;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface MachineMetadata {
    public static final String MACHINE_ALPHA = "Alpha";
    public static final String MACHINE_ARM = "ARM";
    public static final String MACHINE_EFI = "EFI";
    public static final String MACHINE_IA_64 = "IA-64";
    public static final String MACHINE_M32R = "M32R";
    public static final String MACHINE_M68K = "Motorola-68000";
    public static final String MACHINE_M88K = "Motorola-88000";
    public static final String MACHINE_MIPS = "MIPS";
    public static final String MACHINE_PPC = "PPC";
    public static final String MACHINE_S370 = "S370";
    public static final String MACHINE_S390 = "S390";
    public static final String MACHINE_SH3 = "SH3";
    public static final String MACHINE_SH4 = "SH4";
    public static final String MACHINE_SH5 = "SH5";
    public static final String MACHINE_SPARC = "SPARC";
    public static final String MACHINE_UNKNOWN = "Unknown";
    public static final String MACHINE_VAX = "Vax";
    public static final String MACHINE_x86_32 = "x86-32";
    public static final String MACHINE_x86_64 = "x86-64";
    public static final String PLATFORM_AIX = "AIX";
    public static final String PLATFORM_ARM = "ARM";
    public static final String PLATFORM_EMBEDDED = "Embedded";
    public static final String PLATFORM_FREEBSD = "FreeBSD";
    public static final String PLATFORM_HPUX = "HP-UX";
    public static final String PLATFORM_IRIX = "IRIX";
    public static final String PLATFORM_LINUX = "Linux";
    public static final String PLATFORM_NETBSD = "NetBSD";
    public static final String PLATFORM_SOLARIS = "Solaris";
    public static final String PLATFORM_SYSV = "System V";
    public static final String PLATFORM_TRU64 = "Tru64";
    public static final String PLATFORM_WINDOWS = "Windows";
    public static final String PREFIX = "machine:";
    public static final Property ARCHITECTURE_BITS = Property.internalClosedChoise("machine:architectureBits", "8", "16", "32", "64");
    public static final Property PLATFORM = Property.internalClosedChoise("machine:platform", "System V", "HP-UX", "NetBSD", "Linux", "Solaris", "AIX", "IRIX", "FreeBSD", "Tru64", "ARM", "Embedded", "Windows");
    public static final Property MACHINE_TYPE = Property.internalClosedChoise("machine:machineType", "x86-32", "x86-64", "IA-64", "SPARC", "Motorola-68000", "Motorola-88000", "MIPS", "PPC", "S370", "S390", "ARM", "Vax", "Alpha", "EFI", "M32R", "SH3", "SH4", "SH5", "Unknown");
    public static final Property ENDIAN = Property.internalClosedChoise("machine:endian", Endian.a(Endian.LITTLE), Endian.a(Endian.BIG));

    public static final class Endian {
        private final boolean msb;
        private final String name;
        public static final Endian LITTLE = new Endian("Little", false);
        public static final Endian BIG = new Endian("Big", true);

        private Endian(String str, boolean z) {
            this.name = str;
            this.msb = z;
        }

        public static /* bridge */ /* synthetic */ String a(Endian endian) {
            return endian.name;
        }

        public String getMSB() {
            return this.msb ? "MSB" : "LSB";
        }

        public String getName() {
            return this.name;
        }

        public boolean isMSB() {
            return this.msb;
        }
    }
}
