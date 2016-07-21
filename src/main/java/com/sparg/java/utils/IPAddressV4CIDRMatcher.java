package com.sparg.java.utils;

import sun.net.util.IPAddressUtil;

/**
 * @author: vimal.sengoden
 * Date: 7/12/2016
 * Time: 11:32 AM
 */
public class IpAddressV4CIDRMatcher extends IpAddressCIDRMatcher {

    public static final String IPV4_CIDR_REGEXP = "^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])(\\/([0-9]|[1-2][0-9]|3[0-2]))$";

    public IpAddressV4CIDRMatcher(final String ipAddressV4Cidr) {
        super(ipAddressV4Cidr);
    }

    @Override
    protected byte[] getAddressBytes(final String ipAddress) {
        return IPAddressUtil.textToNumericFormatV4(ipAddress);
    }

    @Override
    protected void assertIpAddressCidrFormat(final String ipAddressCidr) {
        assert ipAddressCidr.matches(IPV4_CIDR_REGEXP);
    }

    @Override
    protected void assertIpAddressFormat(final String ipAddress) {
        assert ipAddress.matches(IpAddressMatcher.IPV4_ADDRESS_REG_EXP);
    }

}
