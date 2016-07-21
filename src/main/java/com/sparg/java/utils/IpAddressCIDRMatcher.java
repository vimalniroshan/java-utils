package com.sparg.java.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @author: vimal.sengoden
 * Date: 7/12/2016
 * Time: 5:55 PM
 */
public abstract class IpAddressCIDRMatcher implements IpAddressMatcher {

    private final String cidrAddress;
    private final int bitsToBeMatched;

    private final byte[] baseAddressBytes;
    private final int bitsToBeMatchedInLastByte;
    private final byte lastByteMask;

    public IpAddressCIDRMatcher(final String ipAddressCidr) {
        assert ipAddressCidr != null;
        assertIpAddressCidrFormat(ipAddressCidr);

        String[] cidrComponents = ipAddressCidr.split("/");
        cidrAddress = cidrComponents[0];
        bitsToBeMatched = Integer.parseInt(cidrComponents[1]);

        bitsToBeMatchedInLastByte = bitsToBeMatched % Byte.SIZE;
        int bytesToBeMatched = (bitsToBeMatchedInLastByte == 0) ? (bitsToBeMatched/Byte.SIZE) : (bitsToBeMatched/Byte.SIZE)+1;

        byte[] cidrAddressBytes = getAddressBytes(cidrAddress);
        baseAddressBytes = new byte[bytesToBeMatched];
        for(int i=0; i<bytesToBeMatched; i++) {
            baseAddressBytes[i] = cidrAddressBytes[i];
        }

        if(bitsToBeMatchedInLastByte > 0) {
            // lastByteMask should have 1's for significant bits that needs to be matched (and 0's in least significant bit to avoid matching them)
            lastByteMask = (byte) (0xFF << (Byte.SIZE - bitsToBeMatchedInLastByte));
            baseAddressBytes[bytesToBeMatched - 1] &= lastByteMask; //this will retain only the significant bits we are interested in matching
        } else {
            lastByteMask = (byte) (0xFF);
        }

        System.out.println("CIDR Address Bits  :" + getBinaryString(getAddressBytes(cidrAddress)));
        System.out.println("Subnet Bits Defined:" + getBinaryString(baseAddressBytes, bitsToBeMatched));
    }

    public boolean matches(String ipAddress) {
        assert ipAddress != null;
        assertIpAddressFormat(ipAddress);

        byte[] addressBytes = getAddressBytes(ipAddress);

        System.out.println("Subnet Bits Defined :" + getBinaryString(baseAddressBytes));
        System.out.println("Subnet Bits Provided:" + getBinaryString(addressBytes));

        int bytesToBeMatchedExactly = bitsToBeMatchedInLastByte > 0 ? baseAddressBytes.length-1 : baseAddressBytes.length;

        for(int i=0; i<bytesToBeMatchedExactly; i++) {
            if(baseAddressBytes[i] != addressBytes[i]) {
                return false;
            }
        }

        int lastByteIndex = bytesToBeMatchedExactly;
        if(bitsToBeMatchedInLastByte > 0 &&
                (baseAddressBytes[lastByteIndex] != (addressBytes[lastByteIndex] & lastByteMask))) { //use significant bits from address to match it
            return false;
        }

        return true;
    }

    protected abstract void assertIpAddressFormat(final String ipAddress);

    protected abstract byte[] getAddressBytes(final String cidrAddress);

    protected abstract void assertIpAddressCidrFormat(final String ipAddressCidr);

    public static String getBinaryString(final byte[] bytes, final int uptoBits) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < uptoBits/Byte.SIZE; i++) {
            sb.append(getBinaryString(bytes[i])).append("\t");
        }
        sb.append(getBinaryString(bytes[bytes.length-1]).substring(0, uptoBits%Byte.SIZE));

        return sb.toString();
    }

    public static String getBinaryString(final byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < bytes.length-1; i++) {
            sb.append(getBinaryString(bytes[i])).append("\t");
        }
        sb.append(getBinaryString(bytes[bytes.length-1]));

        return sb.toString();
    }

    public static String getBinaryString(final byte b) {
        return StringUtils.leftPad(Integer.toBinaryString((b+256)%256), 8, "0");
    }
}
